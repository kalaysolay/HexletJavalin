package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import static io.javalin.rendering.template.TemplateUtil.model;

import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        var course1 = new Course("Java", "java developer");
        course1.setId(1L);
        var course2 = new Course("Devops", "Be cool devops");
        course2.setId(2L);
        var course3 = new Course("SA", "system analyst");
        course3.setId(3L);
        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var showCourse = courseList.stream().filter(course -> course.getId().toString().equals(id)).findFirst();
            if (showCourse.isEmpty()) {
                ctx.status(404).result("Курс не найден");
                return;
            }
            var page = new CoursePage(showCourse.get());

            ctx.render("courses/show.jte", model("page", page));
        });

        app.get("/courses", ctx -> {
            var courses = courseList;
            var header = "Курсы по программированию";
            var page = new CoursesPage(courses, header);
            ctx.render("courses/index.jte", model("page", page));
        });


        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        app.get("/about", ctx -> {
            ctx.render("about.jte");
        });
        app.exception(Exception.class, (e, ctx) -> {
            e.printStackTrace();
            ctx.status(500).result("Internal Error: " + e.getMessage());
        });

        app.start(7070);
    }
}
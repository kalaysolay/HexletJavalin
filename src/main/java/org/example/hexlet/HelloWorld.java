package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
        app.get("/", ctx -> ctx.result("Hello World"));
        app.get("/companies/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Integer.class);
            var company = COMPANIES.stream()
                    .filter(c -> c.get("id").equals(id))
                    .findFirst()
                    .orElseThrow(() -> new NotFoundResponse("Company not found"));

            ctx.json(company);
        app.start(7070); // Стартуем веб-сервер
    }
    public static String get(){
        var v = "Ok";
        return v;
    }
}

@import org.example.hexlet
@param CoursePage page

<!-- Для наглядности мы не стали включать сюда основную структуру HTML -->
<main>
    <h1>${page.getCourse().getName()}</h1>
    <p>${page.getCourse().getDescription()}</p>
</main>
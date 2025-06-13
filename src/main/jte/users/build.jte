@import org.example.hexlet.HelloWorld

@template.layout.page(
content = @`
    <form action="/users" method="post">
        <div>
            <label>
                Имя
                <input type="text" name="name" />
            </label>
        </div>
        <div>
            <label>
                Email
                <input type="email" required name="email" />
            </label>
        </div>
        <div>
            <label>
                Пароль
                <input type="password" required name="password" />
            </label>
        </div>
        <div>
            <label>
                Подтверждение пароля
                <input type="password" required name="passwordConfirmation" />
            </label>
        </div>
        <input type="submit" value="Зарегистрировать" />
    </form>
`,
footer = @`
    <footer>
        <p>Follow me on <a href="https://github.com/yourusername">GitHub</a></p>
    </footer>
`
)



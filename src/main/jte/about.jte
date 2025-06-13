@import org.example.hexlet.HelloWorld

@template.layout.page(
content = @`
<h2>About Us</h2>
<p>This is the about page of My Simple Site.</p>
`,
footer = @`
<footer>
    <p>Follow me on <a href="https://github.com/yourusername">GitHub</a></p>
</footer>
`
)
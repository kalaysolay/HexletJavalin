@import gg.jte.Content
@param Content content
@param Content footer = null

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Hexlet Javalin Example</title>
</head>
<body>
<nav>
    <div>
        <ul>
            <li>
                <a href="/">Home</a>
            </li>
            <li >
                <a href="/aboutme">Users</a>
            </li>
        </ul>
    </div>
</nav>

<div>
    ${content}
</div>

@if (footer != null)
    <footer>
        <div>
            ${footer}
        </div>
    </footer>
@endif

</body>
</html>
@param gg.jte.Content content
@param String activePage

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dolphins Swim Academy</title>
    <link rel="stylesheet" href="https://bootswatch.com/5/cerulean/bootstrap.css">
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand text-white" href="/">
            <img src="/images/dolphin128x128.png" alt="Logo" width="50" height="50"
                 class="img-fluid">
            Dolphins Swim Academy
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link ${activePage != null && activePage.equals("classes") ? "active" : ""}"
                       href="/classes">Classes</a></li>
                <li class="nav-item">
                    <a class="nav-link ${activePage != null && activePage.equals("students") ? "active" : ""}"
                       href="/students">Students</a></li>
                <li class="nav-item">
                    <a class="nav-link ${activePage != null && activePage.equals("") ? "active" : ""}"
                       href="/">Coaches</a></li>
            </ul>
        </div>
    </div>
</nav>

<main>
    ${content}
</main>

<footer class="container text-center mt-4">
    <p>
        Copyright © Dolphins Swim Academy 2024<br>
        Dolphin icon is created by <a href="https://www.flaticon.com/authors/freepik">Freepik</a> from <a
                href="https://www.flaticon.com/">Flaticon</a>
    </p>
</footer>
<!-- javascript bootstrap bundle for modals -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
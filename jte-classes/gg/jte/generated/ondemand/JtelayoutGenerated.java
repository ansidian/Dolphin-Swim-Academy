package gg.jte.generated.ondemand;
public final class JtelayoutGenerated {
	public static final String JTE_NAME = "layout.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,26,26,26,26,26,29,29,29,29,32,32,32,32,40,40,40,50,53,53,53,0,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content, String activePage) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Dolphins Swim Academy</title>\n    <link rel=\"stylesheet\" href=\"https://bootswatch.com/5/cerulean/bootstrap.css\">\n    <link rel=\"stylesheet\" href=\"/css/styles.css\">\n</head>\n<body>\n<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n    <div class=\"container-fluid\">\n        <a class=\"navbar-brand text-white\" href=\"/\">\n            <img src=\"/images/dolphin128x128.png\" alt=\"Logo\" width=\"50\" height=\"50\"\n                 class=\"img-fluid\">\n            Dolphins Swim Academy\n        </a>\n        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n            <span class=\"navbar-toggler-icon\"></span>\n        </button>\n        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n            <ul class=\"navbar-nav\">\n                <li class=\"nav-item\">\n                    <a class=\"nav-link ");
		jteOutput.setContext("a", "class");
		jteOutput.writeUserContent(activePage != null && activePage.equals("classes") ? "active" : "");
		jteOutput.setContext("a", null);
		jteOutput.writeContent("\"\n                       href=\"/classes\">Classes</a></li>\n                <li class=\"nav-item\">\n                    <a class=\"nav-link ");
		jteOutput.setContext("a", "class");
		jteOutput.writeUserContent(activePage != null && activePage.equals("students") ? "active" : "");
		jteOutput.setContext("a", null);
		jteOutput.writeContent("\"\n                       href=\"/students\">Students</a></li>\n                <li class=\"nav-item\">\n                    <a class=\"nav-link ");
		jteOutput.setContext("a", "class");
		jteOutput.writeUserContent(activePage != null && activePage.equals("") ? "active" : "");
		jteOutput.setContext("a", null);
		jteOutput.writeContent("\"\n                       href=\"/\">Coaches</a></li>\n            </ul>\n        </div>\n    </div>\n</nav>\n\n<main>\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n</main>\n\n<footer class=\"container text-center mt-4\">\n    <p>\n        Copyright © Dolphins Swim Academy 2024<br>\n        Dolphin icon is created by <a href=\"https://www.flaticon.com/authors/freepik\">Freepik</a> from <a\n                href=\"https://www.flaticon.com/\">Flaticon</a>\n    </p>\n</footer>\n");
		jteOutput.writeContent("\n<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		String activePage = (String)params.get("activePage");
		render(jteOutput, jteHtmlInterceptor, content, activePage);
	}
}

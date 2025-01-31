package gg.jte.generated.ondemand;
public final class JtehomeGenerated {
	public static final String JTE_NAME = "home.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,5,5,21,21,21,21,21,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String activePage) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"container mt-5\">\n        <div class=\"text-center\">\n            <h2 class=\"mb-4\" id=\"summer-swimming-lessons\">2024 Summer Swimming Lessons</h2>\n\n            <p>Classes are on Monday to Thursday:</p>\n            <p>Session 1: June 17 - June 27</p>\n            <p>Session 2: July 8 - July 18</p>\n            <p>Session 3: July 22 - August 1</p>\n            <p>Session 4: August 5 - August 15</p>\n\n            <div class=\"mt-4 mb-4\">\n                <a href=\"/register\" class=\"btn btn-success\">Register</a>\n            </div>\n        </div>\n    </div>\n");
			}
		}, activePage);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String activePage = (String)params.get("activePage");
		render(jteOutput, jteHtmlInterceptor, activePage);
	}
}

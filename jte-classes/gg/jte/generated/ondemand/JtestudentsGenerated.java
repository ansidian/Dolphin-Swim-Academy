package gg.jte.generated.ondemand;
import java.util.List;
public final class JtestudentsGenerated {
	public static final String JTE_NAME = "students.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,6,6,9,9,15,15,15,15,15,16,16,16,16,16,17,17,17,17,17,18,18,18,18,18,22,22,26,26,39,39,41,41,41,42,42,42,43,43,43,44,44,44,45,45,45,46,46,46,48,48,51,51,54,54,54,54,54,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String activePage, List<cs3220.hw3.model.Student> students, Integer session) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"container-xxl mt-4\">\n        <form method=\"get\" action=\"/students\" class=\"d-flex mb-3\">\n            <label for=\"session\"></label>\n            <select id=\"session\" name=\"session\" style=\"width: auto;\" class=\"form-select\"\n                    onchange=\"window.location.href='/students?session=' + this.value\">\n                <option value=\"1\"");
				var __jte_html_attribute_0 = session == 1;
				if (__jte_html_attribute_0) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 1: June 17 - June 27</option>\n                <option value=\"2\"");
				var __jte_html_attribute_1 = session == 2;
				if (__jte_html_attribute_1) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 2: July 8 - July 18</option>\n                <option value=\"3\"");
				var __jte_html_attribute_2 = session == 3;
				if (__jte_html_attribute_2) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 3: July 22 - August 1</option>\n                <option value=\"4\"");
				var __jte_html_attribute_3 = session == 4;
				if (__jte_html_attribute_3) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 4: August 5 - August 15</option>\n            </select>\n        </form>\n\n        ");
				if (students.isEmpty()) {
					jteOutput.writeContent("\n            <div class=\"alert alert-danger\" role=\"alert\">\n                There are no students registered in this session!\n            </div>\n        ");
				} else {
					jteOutput.writeContent("\n            <table class=\"table table-striped table-bordered\">\n                <thead class=\"table-dark\">\n                <tr>\n                    <th>ID</th>\n                    <th>Name</th>\n                    <th>Age</th>\n                    <th>Level</th>\n                    <th>Time (1st Choice)</th>\n                    <th>Time (2nd Choice)</th>\n                </tr>\n                </thead>\n                <tbody>\n                ");
					for (var student : students) {
						jteOutput.writeContent("\n                    <tr>\n                        <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(student.getId());
						jteOutput.writeContent("</td>\n                        <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(student.getName());
						jteOutput.writeContent("</td>\n                        <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(student.getAge());
						jteOutput.writeContent("</td>\n                        <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(student.getLevel());
						jteOutput.writeContent("</td>\n                        <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(student.getTimeSlot1());
						jteOutput.writeContent("</td>\n                        <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(student.getTimeSlot2());
						jteOutput.writeContent("</td>\n                    </tr>\n                ");
					}
					jteOutput.writeContent("\n                </tbody>\n            </table>\n        ");
				}
				jteOutput.writeContent("\n    </div>\n    <script src=\"js/check-student-asssignments.js\"></script>\n");
			}
		}, activePage);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String activePage = (String)params.get("activePage");
		List<cs3220.hw3.model.Student> students = (List<cs3220.hw3.model.Student>)params.get("students");
		Integer session = (Integer)params.get("session");
		render(jteOutput, jteHtmlInterceptor, activePage, students, session);
	}
}

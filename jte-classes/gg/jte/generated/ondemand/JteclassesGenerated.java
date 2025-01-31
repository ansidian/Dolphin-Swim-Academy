package gg.jte.generated.ondemand;
public final class JteclassesGenerated {
	public static final String JTE_NAME = "classes.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,5,5,8,8,14,14,14,14,14,15,15,15,15,15,16,16,16,16,16,17,17,17,17,17,25,25,27,27,28,28,32,32,32,32,32,32,36,36,36,36,36,36,36,41,41,43,43,53,53,55,55,55,56,56,56,57,57,57,59,59,62,62,66,67,67,67,67,67,67,67,71,71,71,71,71,71,76,76,76,76,76,76,76,76,76,77,77,77,77,77,77,77,77,77,78,78,78,78,78,78,78,78,78,84,84,85,85,86,86,86,86,86,86,86,86,86,87,87,87,88,88,89,89,89,89,89,89,90,90,92,92,94,94,95,95,99,101,101,101,105,105,115,115,116,116,118,118,118,118,118,0,1,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String activePage, java.util.List<cs3220.hw3.model.Classes> classes, Integer session, java.util.List<cs3220.hw3.model.Student> allStudents) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <main class=\"container mt-4\">\n        <div class=\"d-flex justify-content-between align-items-center mb-4\">\n            <div class=\"col-md-4\">\n                <select id=\"sessionSelect\" class=\"form-select\"\n                        onchange=\"window.location.href='/classes?session=' + this.value\">\n                    <option value=\"1\"");
				var __jte_html_attribute_0 = session == 1;
				if (__jte_html_attribute_0) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 1: June 17 - June 27</option>\n                    <option value=\"2\"");
				var __jte_html_attribute_1 = session == 2;
				if (__jte_html_attribute_1) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 2: July 8 - July 18</option>\n                    <option value=\"3\"");
				var __jte_html_attribute_2 = session == 3;
				if (__jte_html_attribute_2) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 3: July 22 - August 1</option>\n                    <option value=\"4\"");
				var __jte_html_attribute_3 = session == 4;
				if (__jte_html_attribute_3) {
				jteOutput.writeContent(" selected");
				}
				jteOutput.writeContent(">Session 4: August 5 - August 15</option>\n                </select>\n            </div>\n            <div>\n                <a href=\"/classes/new\" class=\"btn btn-primary\">Create New Class</a>\n            </div>\n        </div>\n\n        ");
				if (classes.isEmpty()) {
					jteOutput.writeContent("\n            <div class=\"alert alert-danger\" role=\"alert\">No classes found for this session.</div>\n        ");
				} else {
					jteOutput.writeContent("\n            ");
					for (cs3220.hw3.model.Classes cls : classes) {
						jteOutput.writeContent("\n                <div class=\"card mb-4\">\n                    <div class=\"card-header d-flex justify-content-between align-items-center\">\n                        <h5 class=\"card-title mb-0\">\n                            ");
						jteOutput.setContext("h5", null);
						jteOutput.writeUserContent(cls.getLevel());
						jteOutput.writeContent(" - ");
						jteOutput.setContext("h5", null);
						jteOutput.writeUserContent(cls.getTime());
						jteOutput.writeContent("\n                        </h5>\n                        <button type=\"button\" class=\"btn btn-primary btn-sm\"\n                                data-bs-toggle=\"modal\"\n                                data-bs-target=\"#assignModal");
						jteOutput.setContext("button", "data-bs-target");
						jteOutput.writeUserContent(cls.getLevel());
						jteOutput.setContext("button", null);
						jteOutput.setContext("button", "data-bs-target");
						jteOutput.writeUserContent(cls.getTime());
						jteOutput.setContext("button", null);
						jteOutput.writeContent("\">\n                            Assign Student\n                        </button>\n                    </div>\n                    <div class=\"card-body\">\n                        ");
						if (cls.getStudents().isEmpty()) {
							jteOutput.writeContent("\n                            <div class=\"alert alert-danger\" role=\"alert\">No students enrolled</div>\n                        ");
						} else {
							jteOutput.writeContent("\n                            <table class=\"table table-striped\">\n                                <thead class=\"table-dark\">\n                                <tr>\n                                    <th>ID</th>\n                                    <th>Name</th>\n                                    <th>Age</th>\n                                </tr>\n                                </thead>\n                                <tbody>\n                                ");
							for (cs3220.hw3.model.Student student : cls.getStudents()) {
								jteOutput.writeContent("\n                                    <tr>\n                                        <td>");
								jteOutput.setContext("td", null);
								jteOutput.writeUserContent(student.getId());
								jteOutput.writeContent("</td>\n                                        <td>");
								jteOutput.setContext("td", null);
								jteOutput.writeUserContent(student.getName());
								jteOutput.writeContent("</td>\n                                        <td>");
								jteOutput.setContext("td", null);
								jteOutput.writeUserContent(student.getAge());
								jteOutput.writeContent("</td>\n                                    </tr>\n                                ");
							}
							jteOutput.writeContent("\n                                </tbody>\n                            </table>\n                        ");
						}
						jteOutput.writeContent("\n                    </div>\n                </div>\n\n                ");
						jteOutput.writeContent("\n                <div class=\"modal fade\" id=\"assignModal");
						jteOutput.setContext("div", "id");
						jteOutput.writeUserContent(cls.getLevel());
						jteOutput.setContext("div", null);
						jteOutput.setContext("div", "id");
						jteOutput.writeUserContent(cls.getTime());
						jteOutput.setContext("div", null);
						jteOutput.writeContent("\" tabindex=\"-1\">\n                    <div class=\"modal-dialog\">\n                        <div class=\"modal-content\">\n                            <div class=\"modal-header\">\n                                <h5 class=\"modal-title\">Assign Student to ");
						jteOutput.setContext("h5", null);
						jteOutput.writeUserContent(cls.getLevel());
						jteOutput.writeContent(" - ");
						jteOutput.setContext("h5", null);
						jteOutput.writeUserContent(cls.getTime());
						jteOutput.writeContent("</h5>\n                                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n                            </div>\n                            <div class=\"modal-body\">\n                                <form action=\"/classes/assign\" method=\"post\">\n                                    <input type=\"hidden\" name=\"session\"");
						var __jte_html_attribute_4 = cls.getSession();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_4);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\n                                    <input type=\"hidden\" name=\"level\"");
						var __jte_html_attribute_5 = cls.getLevel();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_5);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\n                                    <input type=\"hidden\" name=\"time\"");
						var __jte_html_attribute_6 = cls.getTime();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_6);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\n\n                                    <div class=\"mb-3\">\n                                        <label for=\"studentId\" class=\"form-label\">Select Student</label>\n                                        <select name=\"studentId\" class=\"form-select\" required>\n                                            <option value=\"\">Choose a student...</option>\n                                            ");
						for (cs3220.hw3.model.Student student : allStudents) {
							jteOutput.writeContent("\n                                                ");
							if (student.getAssignedClass() == null || !student.getAssignedClass().getId().equals(cls.getId())) {
								jteOutput.writeContent("\n                                                    <option");
								var __jte_html_attribute_7 = student.getId();
								if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_7)) {
									jteOutput.writeContent(" value=\"");
									jteOutput.setContext("option", "value");
									jteOutput.writeUserContent(__jte_html_attribute_7);
									jteOutput.setContext("option", null);
									jteOutput.writeContent("\"");
								}
								jteOutput.writeContent(">\n                                                        ");
								jteOutput.setContext("option", null);
								jteOutput.writeUserContent(student.getName());
								jteOutput.writeContent("\n                                                        ");
								if (student.getAssignedClass() != null) {
									jteOutput.writeContent("\n                                                            (Current: ");
									jteOutput.setContext("option", null);
									jteOutput.writeUserContent(student.getLevel());
									jteOutput.writeContent(" - ");
									jteOutput.setContext("option", null);
									jteOutput.writeUserContent(student.getTimeSlot1());
									jteOutput.writeContent(")\n                                                        ");
								} else {
									jteOutput.writeContent("\n                                                            (Unassigned)\n                                                        ");
								}
								jteOutput.writeContent("\n                                                    </option>\n                                                ");
							}
							jteOutput.writeContent("\n                                            ");
						}
						jteOutput.writeContent("\n                                        </select>\n                                    </div>\n\n                                    ");
						if (allStudents.stream().allMatch(student ->
            student.getAssignedClass() != null &&
            student.getAssignedClass().getId().equals(cls.getId()))) {
							jteOutput.writeContent("\n                                        <div class=\"alert alert-danger\" role=\"alert\">\n                                            All students are already assigned to classes.\n                                        </div>\n                                    ");
						}
						jteOutput.writeContent("\n\n                                    <button type=\"submit\" class=\"btn btn-primary\">Assign</button>\n                                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancel\n                                    </button>\n                                </form>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            ");
					}
					jteOutput.writeContent("\n        ");
				}
				jteOutput.writeContent("\n    </main>\n");
			}
		}, activePage);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String activePage = (String)params.get("activePage");
		java.util.List<cs3220.hw3.model.Classes> classes = (java.util.List<cs3220.hw3.model.Classes>)params.get("classes");
		Integer session = (Integer)params.get("session");
		java.util.List<cs3220.hw3.model.Student> allStudents = (java.util.List<cs3220.hw3.model.Student>)params.get("allStudents");
		render(jteOutput, jteHtmlInterceptor, activePage, classes, session, allStudents);
	}
}

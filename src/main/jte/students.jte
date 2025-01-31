@import java.util.List

@param String activePage
@param List<cs3220.hw3.model.Student> students
@param Integer session

@template.layout(
activePage = activePage,
content = @`
    <div class="container-xxl mt-4">
        <form method="get" action="/students" class="d-flex mb-3">
            <label for="session"></label>
            <select id="session" name="session" style="width: auto;" class="form-select"
                    onchange="window.location.href='/students?session=' + this.value">
                <option value="1" selected="${session == 1}">Session 1: June 17 - June 27</option>
                <option value="2" selected="${session == 2}">Session 2: July 8 - July 18</option>
                <option value="3" selected="${session == 3}">Session 3: July 22 - August 1</option>
                <option value="4" selected="${session == 4}">Session 4: August 5 - August 15</option>
            </select>
        </form>

        @if (students.isEmpty())
            <div class="alert alert-danger" role="alert">
                There are no students registered in this session!
            </div>
        @else
            <table class="table table-striped table-bordered">
                <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Level</th>
                    <th>Time (1st Choice)</th>
                    <th>Time (2nd Choice)</th>
                </tr>
                </thead>
                <tbody>
                @for(var student : students)
                    <tr>
                        <td>${student.getId()}</td>
                        <td>${student.getName()}</td>
                        <td>${student.getAge()}</td>
                        <td>${student.getLevel()}</td>
                        <td>${student.getTimeSlot1()}</td>
                        <td>${student.getTimeSlot2()}</td>
                    </tr>
                @endfor
                </tbody>
            </table>
        @endif
    </div>
    <script src="js/check-student-asssignments.js"></script>
`,
)
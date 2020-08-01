<!DOCTYPE html>
<html>
<head>
    <title>Add Student To directory</title>
    <meta content="UTF-8"/>

    <style>
        h3 {
            text-align: center;
        }
        a {
            font-family: Georgia, 'Times New Roman', Times, serif;
            color: rgb(0, 0, 0);
            text-align: end;
        }
        div {
            background-color:rgb(2, 143, 156) ;
            width: 300px;
            border: 10px solid rgb(2, 98, 105);
            padding: 50px;
            padding-top: 20px;
            margin: 20px;
            margin: auto;
            border-radius: 12px;
        }

        body{
            background-image: url("https://us.123rf.com/450wm/katyau/katyau1507/katyau150700120/42585738-mer-vagues-motif-seamless-vague-de-fond-textile-design-de-papier-peint-motifs-de-remplissage-page-we.jpg?ver=6");
        }

        td {
            font-family: Georgia, 'Times New Roman', Times, serif;
        }
    </style>

</head>
<body>
    <div>
        <h3>Adding Student To the Student Catalog</h3>
        <form id="form1" action="addStudent" method="post">
            <table>
                <tr>
                    <td>Full Name</td>
                    <td><input name="fullName" type="text"/></td>
                </tr>
                <tr>
                    <td>University</td>
                    <td><input name="universityName" type="text"/></td>
                </tr>
                <tr>
                    <td>Speciality</td>
                    <td><input name="specialityName" type="text"/></td>
                </tr>
                <tr>
                    <td>Job Title</td>
                    <td><input name="jobTitle" type="text"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form>
        <a href="/studentDirectory">Get Student Directory</a>
    </div>
</body>
</html>
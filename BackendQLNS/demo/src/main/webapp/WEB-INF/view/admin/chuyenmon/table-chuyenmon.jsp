<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Bảng chuyên môn </title>
                <!-- Latest compiled and minified CSS -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

                <!-- Latest compiled JavaScript -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>


                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
                <!-- <link href="/css/demo.css" rel="stylesheet"> -->

            </head>

            <body>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-12 mx-auto">
                            <div class="d-flex justify-content-between">
                                <h3>Bảng chuyên môn </h3>
                                <a href="/admin/chuyenmon/create" class="btn btn-primary">Tạo chuyên môn </a>
                            </div>

                            <hr />
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Mã chuyên môn </th>
                                        <th>Tên chuyên môn </th>
                                        <th>Mô tả</th>
                                        <th>Người tạo</th>
                                        <th>Ngày tạo</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <!-- c for each (sử dụng vòng lặp để in ra): dùng để hiển thị danh sách chuyenmon 
                                        var = chuyenmon là từng thằng chuyenmon  (biến i = 1) 
                                    -->
                                    <c:forEach var="chuyenmon" items="${ChuyenMon1}">
                                        <tr>
                                            <th>${chuyenmon.id}</th>
                                            <td>${chuyenmon.maChuyenMon}</td>
                                            <td>${chuyenmon.tenChuyenMon}</td>
                                            <td>${chuyenmon.moTa}</td>
                                            <td>${chuyenmon.nguoiTao}</td>
                                            <td>${chuyenmon.ngayTao}</td>
                                            <td>
                                                <a href="/admin/chuyenmon/${chuyenmon.id}"
                                                    class="btn btn-success">View</a>
                                                <a href="/admin/chuyenmon/update/${chuyenmon.id}"
                                                    class="btn btn-warning  mx-2">Update</a>
                                                <a href="/admin/chuyenmon/delete/${chuyenmon.id}"
                                                    class="btn btn-danger">Delete</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>

                    </div>

                </div>
            </body>

            </html>
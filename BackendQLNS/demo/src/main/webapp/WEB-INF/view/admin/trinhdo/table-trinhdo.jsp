<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Bảng trình độ</title>
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
                                <h3>Bảng trình độ</h3>
                                <a href="/admin/trinhdo/create" class="btn btn-primary">Tạo trình độ</a>
                            </div>

                            <hr />
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Mã trình độ</th>
                                        <th>Tên trình độ</th>
                                        <th>Mô tả</th>
                                        <th>Người tạo</th>
                                        <th>Ngày tạo</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <!-- c for each (sử dụng vòng lặp để in ra): dùng để hiển thị danh sách trinhdo 
                                        var = trinhdo là từng thằng trinhdo  (biến i = 1) 
                                    -->
                                    <c:forEach var="trinhdo" items="${TrinhDo1}">
                                        <tr>
                                            <th>${trinhdo.id}</th>
                                            <td>${trinhdo.maTrinhDo}</td>
                                            <td>${trinhdo.tenTrinhDo}</td>
                                            <td>${trinhdo.moTa}</td>
                                            <td>${trinhdo.nguoiTao}</td>
                                            <td>${trinhdo.ngayTao}</td>
                                            <td>
                                                <a href="/admin/trinhdo/${trinhdo.id}" class="btn btn-success">View</a>
                                                <a href="/admin/trinhdo/update/${trinhdo.id}"
                                                    class="btn btn-warning  mx-2">Update</a>
                                                <a href="/admin/trinhdo/delete/${trinhdo.id}"
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
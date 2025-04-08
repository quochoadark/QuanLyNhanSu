<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Cập nhật trình độ</title>
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
                        <div class="col-md-6 col-12 mx-auto">
                            <h3>Cập nhật trình độ</h3>
                            <hr />
                            <form:form method="post" action="/admin/trinhdo/update" modelAttribute="newTrinhDo">

                                <div class="mb-3" style="display: none;">
                                    <label class="form-label">Id:</label>
                                    <form:input type="text" class="form-control" path="id" />
                                </div>

                                <div class="mb-3">
                                    <label class="form-label">Mã trình độ:</label>
                                    <form:input type="text" class="form-control" path="maTrinhDo" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Tên trình độ:</label>
                                    <form:input type="text" class="form-control" path="tenTrinhDo" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Mô tả:</label>
                                    <form:input type="text" class="form-control" path="moTa" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Người tạo:</label>
                                    <form:input type="text" class="form-control" path="nguoiTao" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Ngày tạo:</label>
                                    <form:input type="date" class="form-control" path="ngayTao" />
                                </div>

                                <button type="submit" class="btn btn-warning">Cập nhật</button>
                            </form:form>
                        </div>

                    </div>

                </div>
            </body>

            </html>
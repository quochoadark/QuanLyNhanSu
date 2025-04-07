<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Tạo nhân viên</title>
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
                            <h3>Tạo nhân viên</h3>
                            <hr />
                            <form:form method="post" action="/admin/nhanvien/create" modelAttribute="newNhanvien">
                                <div class="mb-3">
                                    <label class="form-label">Mã nhân viên</label>
                                    <form:input type="text" class="form-control" path="maNhanVien" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Họ</label>
                                    <form:input type="text" class="form-control" path="ho" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Tên</label>
                                    <form:input type="text" class="form-control" path="ten" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Giới tính</label>
                                    <form:input type="text" class="form-control" path="gioiTinh" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Điện thoại</label>
                                    <form:input type="text" class="form-control" path="dienThoai" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Địa chỉ</label>
                                    <form:input type="text" class="form-control" path="diaChi" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Dân tộc</label>
                                    <form:input type="text" class="form-control" path="danToc" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Quê quán</label>
                                    <form:input type="text" class="form-control" path="queQuan" />
                                </div>

                                <button type="submit" class="btn btn-primary">Tạo</button>
                            </form:form>
                        </div>

                    </div>

                </div>
            </body>

            </html>
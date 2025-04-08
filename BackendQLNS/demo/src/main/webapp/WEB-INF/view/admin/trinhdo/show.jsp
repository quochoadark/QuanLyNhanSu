<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Chi tiết trình độ id = ${id}</title>
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
                                <h3>Chi tiết trình độ id = ${id}</h3>
                            </div>

                            <hr />

                            <div class="card" style="width: 60%">
                                <div class="card-header">
                                    Thông tin trình độ
                                </div>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item">ID: ${TrinhDo.id}</li>
                                    <li class="list-group-item">Mã trình độ: ${TrinhDo.maTrinhDo} </li>
                                    <li class="list-group-item">Tên trình độ: ${TrinhDo.tenTrinhDo}</li>
                                    <li class="list-group-item">Mô tả: ${TrinhDo.moTa}</li>
                                    <li class="list-group-item">Người tạo: ${TrinhDo.nguoiTao}</li>
                                    <li class="list-group-item">Ngày tạo: ${TrinhDo.ngayTao}</li>
                                </ul>
                                <a href="/admin/trinhdo" class="btn btn-success mt-3">Back</a>
                            </div>

                        </div>

                    </div>

                </div>
            </body>

            </html>
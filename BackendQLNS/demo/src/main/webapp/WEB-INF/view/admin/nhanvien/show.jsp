<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Thông tin chi tiết nhân viên ${id}</title>
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
                                <h3>Thông tin chi tiết của nhân viên với mã ID: ${id}</h3>
                            </div>

                            <hr />

                            <div class="card" style="width: 60%">
                                <div class="card-header">
                                    Thông tin nhân viên
                                </div>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item">ID: ${nhanvien.id}</li>
                                    <li class="list-group-item">Mã nhân viên: ${nhanvien.maNhanVien} </li>
                                    <li class="list-group-item">Họ: ${nhanvien.ho}</li>
                                    <li class="list-group-item">Tên: ${nhanvien.ten}</li>
                                    <li class="list-group-item">Giới tính: ${nhanvien.gioiTinh}</li>
                                    <li class="list-group-item">Số điện thoại: ${nhanvien.dienThoai} </li>
                                    <li class="list-group-item">Dân tộc: ${nhanvien.danToc}</li>
                                    <li class="list-group-item">Địa chỉ: ${nhanvien.diaChi}</li>
                                    <li class="list-group-item">Quê quán: ${nhanvien.queQuan}</li>
                                </ul>
                                <a href="/admin/nhanvien" class="btn btn-success mt-3">Trở lại</a>
                            </div>

                        </div>

                    </div>

                </div>
            </body>

            </html>
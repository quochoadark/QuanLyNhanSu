<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Quản lý nhân sự</title>
            <!--  -->
            <link rel="stylesheet"
                href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
            <!-- 2 file css  -->
            <link rel="stylesheet" href="css/navsidebar.css">
            <link rel="stylesheet" href="css/base.css">
            <link rel="stylesheet" href="css/maincontent.css">

            <!-- Icon -->
            <link rel="stylesheet" href="css/fontawesome-free-6.7.2-web/css/all.min.css">
            <!-- Bootstrap -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
                crossorigin="anonymous">

            <!-- Js cho nav -->
            <script type="text/javascript" src="js/nav.js" defer></script>
            <!-- Js cho sidebar -->
            <script type="text/javascript" src="js/sidebar.js" defer></script>
            <!-- Js cho maincontent -->
            <script type="text/javascript" src="js/maincontent.js" defer></script>
        </head>

        <body>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
                crossorigin="anonymous">
                </script>
        </body>
        <div class="header">
            <nav class="header__navbar">
                <ul class="header__navbar-list">
                    <li class="header__navbar-item">
                        <i class="fa-solid fa-people-roof header__navbar-icon CSS-icon-QLNS"></i>
                        <h1><span class="las la-accusoft">QLNS</span></h1>
                    </li>
                    <li class="header__navbar-item">
                        <i class="fa-solid fa-bars header__navbar-icon CSS-icon-open-list"></i>
                    </li>
                </ul>
                <ul class="header__navbar-list">
                    <li class="header__navbar-item header__navbar-item--has-mail">
                        <a href="" class="header__navbar-item-link"><i
                                class="fa-regular fa-envelope header__navbar-icon CSS-icon-HopThu"></i></a>
                        <span class="CSS-text-left-nav">Hộp Thư</span>
                        <div class="header__mail">
                            <header class="header__mail-header">
                                <h3>Thông báo mới nhận</h3>
                            </header>
                            <ul class="header__mail-list">
                                <li class="header__mail-item header__mail-item--viewed">
                                    <a href="" class="header__mail-link">
                                        <div class="header__mail-info">
                                            <span class="header__mail-name">Bạn nhận được tin nhắn mới từ giám
                                                đốc</span>
                                            <span class="header__mail-description">Hãy lên phòng nhận bộ hồ sơ
                                                này</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__mail-item header__mail-item--viewed">
                                    <a href="" class="header__mail-link">
                                        <div class="header__mail-info">
                                            <span class="header__mail-name">Bạn nhận được tin nhắn mới từ đồng
                                                nghiệp</span>
                                            <span class="header__mail-description">Hãy làm giùm tôi phần này</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__mail-item header__mail-item--viewed">
                                    <a href="" class="header__mail-link">
                                        <div class="header__mail-info">
                                            <span class="header__mail-name">Bạn nhận được tin nhắn phản hồi từ đồng
                                                nghiệp</span>
                                            <span class="header__mail-description">Hãy xác nhận yêu cầu mà tôi đã gửi
                                                cho
                                                bạn</span>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                            <footer class="header__mail-footer">
                                <a href="" class="header__notify-footer-btn">Xem tất cả</a>
                            </footer>
                        </div>
                    </li>
                    <li class="header__navbar-item header__navbar-item--has-notify">
                        <a href="" class="header__navbar-item-link"> <i class="header__navbar-icon far fa-bell"></i></a>
                        <span class="CSS-text-left-nav">Thông báo</span>
                        <div class="header__notify">
                            <header class="header__notify-header">
                                <h3>Thông báo mới nhận</h3>
                            </header>
                            <ul class="header__notify-list">
                                <li class="header__notify-item header__notify-item--viewed">
                                    <a href="" class="header__notify-link">
                                        <div class="header__notify-info">
                                            <span class="header__notify-name">Bạn nhận thông báo lịch hợp từ cấp
                                                trên</span>
                                            <span class="header__notify-description">Một cuộc hộp về vấn đề .....</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__notify-item header__notify-item--viewed">
                                    <a href="" class="header__notify-link">
                                        <div class="header__notify-info">
                                            <span class="header__notify-name">Bạn nhận được thông báo quy định mới từ
                                                cấp
                                                trên</span>
                                            <span class="header__notify-description">Quy định về vấn đề về vấn đề
                                                .....</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__notify-item header__notify-item--viewed">
                                    <a href="" class="header__notify-link">
                                        <div class="header__notify-info">
                                            <span class="header__notify-name">Bạn nhận được thông chấm công từ cấp
                                                trên</span>
                                            <span class="header__notify-description"> Thông báo chấm công về
                                                .....</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__notify-item header__notify-item--viewed">
                                    <a href="" class="header__notify-link">
                                        <div class="header__notify-info">
                                            <span class="header__notify-name">Bạn nhận được thông báo duyệt đơn từ cấp
                                                trên</span>
                                            <span class="header__notify-description">Phê duyệt đơn về .....</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__notify-item header__notify-item--viewed">
                                    <a href="" class="header__notify-link">
                                        <div class="header__notify-info">
                                            <span class="header__notify-name">Bạn nhận được lịch hộp từ cấp trên</span>
                                            <span class="header__notify-description">Một cuộc hộp về vấn đề .....</span>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                            <footer class="header__notify-footer">
                                <a href="" class="header__notify-footer-btn">Xem tất cả</a>
                            </footer>
                        </div>
                    </li>
                    <li class="header__navbar-item nav-register js-open">
                        <span class="CSS-text-left-nav">Đăng ký</span>
                    </li>
                    <li class="header__navbar-item js-open1 nav-login">
                        <span class="CSS-text-left-nav ">Đăng nhập</span>
                    </li>
                    <li class="header__navbar-item header__navbar-user nav-user">
                        <img src="./assets/img/Ảnh người dùng.png" alt="" class="header__navbar-user-img">
                        <span class="header__navbar-user-name"> Quốc Hòa</span>
                        <ul class="header__navbar-user-menu">
                            <li class="header__navbar-user-item">
                                <a href="">Tài khoản của tôi</a>
                            </li>
                            <li class="header__navbar-user-item">
                                <a href="">Địa chỉ của tôi</a>
                            </li>
                            <li class="header__navbar-user-item">
                                <a href="">Đơn mua</a>
                            </li>
                            <li class="header__navbar-user-item header__navbar-user-item--separate">
                                <a href="">Đăng xuất</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
        <section>
            <div class="container-fluid padding-top">
                <div class="row">
                    <div class="col-2" style="min-height: 100vh; min-height: 100dvh; color: var(--text-clr)
" class="sidebar__col2" id="sidebar">
                        <ul class="active">
                            <li>
                                <button onclick=ToggleSubMenu(this) class="dropdown-btn">
                                    <i class="fa-solid fa-table-columns"></i>
                                    <span class="tong-quan">Thông tin nhân viên</span>
                                    <i class="fa-solid fa-angle-down"></i>
                                </button>
                                <ul class="sub-menu show">
                                    <div>
                                        <li class="">
                                            <a href="/admin/xemnhanvien"> Danh sách nhân viên</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/xemphongban"> Danh sách phòng ban</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/xemchucvu"> Danh sách chức vụ</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/xemtrinhdo"> Danh sách trình độ</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/xemchuyenmon"> Danh sách chuyên môn</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/xembangcap"> Danh sách bằng cấp</a>
                                        </li>
                                    </div>

                                </ul>
                            </li>
                            <li class>
                                <button onclick=ToggleSubMenu(this) class="dropdown-btn">
                                    <i class="fa-solid fa-user"></i>
                                    <span class="quan-ly-ho-so">Quản lý hồ sơ</span>
                                    <i class="fa-solid fa-angle-down"></i>
                                </button>
                                <ul class="sub-menu show">
                                    <div>
                                        <li class="">
                                            <a href="/admin/phongban">Phòng ban</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/chucvu">Chức vụ</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/trinhdo">Trình độ</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/chuyenmon">Chuyên môn</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/bangcap">Bằng cấp</a>
                                        </li>
                                        <li class="">
                                            <a href="/admin/nhanvien">Nhân viên</a>
                                        </li>
                                    </div>

                                </ul>
                            </li>
                            <li class="">
                                <button onclick=ToggleSubMenu(this) class="dropdown-btn">
                                    <i class="fa-solid fa-money-check-dollar"></i>
                                    <span class="quan-ly-luong">Quản lý lương</span>
                                    <i class="fa-solid fa-angle-down"></i>
                                </button>
                                <ul class="sub-menu show">
                                    <div>
                                        <li class="Menu-BL">
                                            <a href="">Bảng lương</a>
                                        </li>
                                        <li class="Menu-TL">
                                            <a href="">Tính lương </a>
                                        </li>
                                        <li class="">
                                            <a href="">Tính chấm công </a>
                                        </li>
                                    </div>

                                </ul>
                            </li>
                            <li class="">
                                <button onclick=ToggleSubMenu(this) class="dropdown-btn">
                                    <i class="fa-solid fa-calendar-check"></i>
                                    <span class="quan-ly-cong-tac">Quản lý công tác</span>
                                    <i class="fa-solid fa-angle-down"></i>
                                </button>
                                <ul class="sub-menu show">
                                    <div>
                                        <li class="Menu-TCT">
                                            <a href="">Tạo công tác</a>
                                        </li>
                                        <li class="Menu-DSCT">
                                            <a href="">Danh sách công tác</a>
                                        </li>
                                    </div>

                                </ul>
                            </li>
                            <li class="">
                                <button onclick=ToggleSubMenu(this) class="dropdown-btn">
                                    <i class="fa-solid fa-people-group"></i>
                                    <span class="nhom-nhan-vien">Nhóm nhân viên</span>
                                    <i class="fa-solid fa-angle-down"></i>
                                </button>
                                <ul class="sub-menu show">
                                    <div>
                                        <li class="Menu-TN">
                                            <a href="">Tạo nhóm</a>
                                        </li>
                                        <li class="Menu-DSN">
                                            <a href="">Danh sách nhóm</a>
                                        </li>
                                    </div>

                                </ul>
                            </li>
                            <li class="">
                                <button onclick=ToggleSubMenu(this) class="dropdown-btn">
                                    <i class="fa-solid fa-star"></i>
                                    <span class="khen-thuong-ky-luat"> Khen thưởng-kỷ luật</span>
                                    <i class="fa-solid fa-angle-down"></i>
                                </button>
                                <ul class="sub-menu show">
                                    <div>
                                        <li class="Menu-KT">
                                            <a href="">Khen thưởng</a>
                                        </li>
                                        <li class="Menu-KL">
                                            <a href="">Kỷ luật</a>
                                        </li>
                                    </div>

                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </section>
        <!-- Modal -->
        <div class="modal modal-register">
            <div class="modal__body">
                <div class="auth-form js-modalcontainer">
                    <div class="modal__close">
                        <i class="fa-solid fa-xmark"></i>
                    </div>
                    <div class="auth-form__container">
                        <div class="auth-form__header">
                            <h3 class="auth-form__heading">Đăng ký</h3>
                            <!-- Nút đăng nhập -->
                            <span class="auth-form__switch-btn">Đăng nhập</span>
                        </div>
                        <div class="auth-form__form">
                            <!-- Group dùng để nhóm các thẻ input vào-->
                            <div class="auth-form__group">
                                <input type="text" class="auth-form__input" placeholder="Email của bạn">
                            </div>
                            <div class="auth-form__group">
                                <input type="text" class="auth-form__input" placeholder="Mật khẩu">
                            </div>
                            <div class="auth-form__group">
                                <input type="text" class="auth-form__input" placeholder="Nhập lại mật khẩu">
                            </div>
                        </div>
                        <!-- Nút điều khiển -->
                        <div class="auth-form__controls">
                            <button onclick=ToggleSubMenu(this) class="btn auth-form__controls-back btn--normal">TRỞ
                                LẠI</button>
                            <button onclick=ToggleSubMenu(this) class="btn btn--primary">ĐĂNG KÝ</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal modal-login">
            <div class="modal__body">
                <div class="auth-form js-modalcontainer">
                    <div class="modal__close">
                        <i class="fa-solid fa-xmark"></i>
                    </div>
                    <div class="auth-form">
                        <div class="auth-form__container">
                            <div class="auth-form__header">
                                <h3 class="auth-form__heading js-login-btn">Đăng nhập</h3>
                                <span class="auth-form__switch-btn">Đăng ký</span>
                            </div>
                            <div class="auth-form__form">
                                <div class="auth-form__group">
                                    <input type="text" class="auth-form__input" placeholder="Email của bạn">
                                </div>
                                <div class="auth-form__group">
                                    <input type="text" class="auth-form__input" placeholder="Mật khẩu">
                                </div>
                            </div>
                            <div class="auth-form__aside">
                                <div class="auth-form__help">
                                    <a href="" class="auth-form__help-link auth-form__help-link-forgot">Quên mật
                                        khẩu</a>
                                    <span class="auth-form__help-separate"></span>
                                    <a href="" class="auth-form__help-link">Cần trợ giúp?</a>
                                </div>
                            </div>
                            <div class="auth-form__controls">
                                <button class="btn auth-form__controls-back btn--normal">TRỞ LẠI</button>
                                <button class="btn btn--primary">ĐĂNG NHẬP</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        </html>
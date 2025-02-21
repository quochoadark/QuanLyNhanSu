
document.addEventListener("DOMContentLoaded", function () {
    // Mặc định hiển thị .tongquan khi vào trang
    document.querySelectorAll('.col-10 > div').forEach(div => {
        div.style.display = 'none';
    });
    const tongQuanSection = document.querySelector('.thongke');
    if (tongQuanSection) {
        tongQuanSection.style.display = 'block';
    }

    function showSection(sectionClass) {
        document.querySelectorAll('.col-10 > div').forEach(div => {
            div.style.display = 'none';
        });
        const section = document.querySelector(`.${sectionClass}`);
        if (section) {
            section.style.display = 'block';
        }
    }
    const thongkeLink = document.querySelector('.Menu-TK a');
    if (thongkeLink) {
        thongkeLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('thongke');
        });
    }
    const danhSachNhanVienLink = document.querySelector('.Menu-DSNV a');
    if (danhSachNhanVienLink) {
        danhSachNhanVienLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachnhanvien');
        });
    }
    const danhSachTaiKhoanLink = document.querySelector('.Menu-DSTK a');
    if (danhSachTaiKhoanLink) {
        danhSachTaiKhoanLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachtaikhoan');
        });
    }
    const phongbanLink = document.querySelector('.Menu-PB a');
    if (phongbanLink) {
        phongbanLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('phong-ban');
        });
    }
    const chucvuLink = document.querySelector('.Menu-CV a');
    if (chucvuLink) {
        chucvuLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('chuc-vu');
        });
    }
    const trinhdoLink = document.querySelector('.Menu-TD a');
    if (trinhdoLink) {
        trinhdoLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('trinhdo');
        });
    }
    const chuyenmonLink = document.querySelector('.Menu-CM a');
    if (chuyenmonLink) {
        chuyenmonLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('chuyenmon');
        });
    }
    const bangcapLink = document.querySelector('.Menu-BC a');
    if (bangcapLink) {
        bangcapLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('bangcap');
        });
    }
    const nhanvienLink = document.querySelector('.Menu-NV a');
    if (nhanvienLink) {
        nhanvienLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('nhanvien');
        });
    }
    const bangtinhluongLink = document.querySelector('.Menu-BTL a');
    if (bangtinhluongLink) {
        bangtinhluongLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('bangtinhluong');
        });
    }
    const tinhluongLink = document.querySelector('.Menu-TL a');
    if (tinhluongLink) {
        tinhluongLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('tinhluong ');
        });
    }
    const taocongtacLink = document.querySelector('.Menu-TCT a');
    if (taocongtacLink) {
        taocongtacLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('taocongtac');
        });
    }
    const danhsachcongtacLink = document.querySelector('.Menu-DSCT a');
    if (danhsachcongtacLink) {
        danhsachcongtacLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachcongtac');
        });
    }
    const taonhomLink = document.querySelector('.Menu-TN a');
    if (taonhomLink) {
        taonhomLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('taonhom');
        });
    }
    const danhsachnhomLink = document.querySelector('.Menu-DSN a');
    if (danhsachnhomLink) {
        danhsachnhomLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachnhom');
        });
    }
    const khenthuongLink = document.querySelector('.Menu-KT a');
    if (khenthuongLink) {
        khenthuongLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('khenthuong');
        });
    }
    const kyluatLink = document.querySelector('.Menu-KL a');
    if (kyluatLink) {
        kyluatLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('kyluat');
        });
    }

    // Cố định hover
    const menuItems = document.querySelectorAll("#sidebar a");
    let activeItem = document.querySelector(".active-item"); // Lưu trữ mục active hiện tại

    menuItems.forEach(item => {
        // Khi click, đặt mục đó thành active
        item.addEventListener("click", function () {
            // Loại bỏ class active-item khỏi tất cả mục
            menuItems.forEach(i => i.classList.remove("active-item"));

            // Đặt class active-item cho mục mới được chọn
            this.classList.add("active-item");
            activeItem = this; // Cập nhật mục active hiện tại
        });

        // Khi di chuột vào, đổi hiệu ứng hover mà không ảnh hưởng mục đang active
        item.addEventListener("mouseover", function () {
            if (this !== activeItem) {
                this.classList.add("hover-effect");
            }
        });

        // Khi di chuột ra, chỉ bỏ hiệu ứng hover nếu không phải là mục active
        item.addEventListener("mouseout", function () {
            this.classList.remove("hover-effect");
        });
    });

});

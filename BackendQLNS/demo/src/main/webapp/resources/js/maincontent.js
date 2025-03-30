
document.addEventListener("DOMContentLoaded", function () {
    // Mặc định hiển thị .tongquan khi vào trang
    document.querySelectorAll('.col-10 > div').forEach(div => {
        div.style.display = 'none';
    });
    const tongQuanSection = document.querySelector('.danhsachnhanvien');
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
    const danhSachNhanVienLink = document.querySelector('.Menu-DSNV a');
    if (danhSachNhanVienLink) {
        danhSachNhanVienLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachnhanvien');
        });
    }
    const danhSachPhongBanLink = document.querySelector('.Menu-DSPB a');
    if (danhSachPhongBanLink) {
        danhSachPhongBanLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachphongban');
        });
    }
    const danhSachChucVuLink = document.querySelector('.Menu-DSCV a');
    if (danhSachChucVuLink) {
        danhSachChucVuLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachchucvu');
        });
    }
    const danhSachTrinhDoLink = document.querySelector('.Menu-DSTD a');
    if (danhSachTrinhDoLink) {
        danhSachTrinhDoLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachtrinhdo');
        });
    }
    const danhSachChuyenMonLink = document.querySelector('.Menu-DSCM a');
    if (danhSachChuyenMonLink) {
        danhSachChuyenMonLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachchuyenmon');
        });
    }
    const danhSachBangCapLink = document.querySelector('.Menu-DSBC a');
    if (danhSachBangCapLink) {
        danhSachBangCapLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('danhsachbangcap');
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
    const bangtinhluongLink = document.querySelector('.Menu-BL a');
    if (bangtinhluongLink) {
        bangtinhluongLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('bangluong');
        });
    }
    const tinhluongLink = document.querySelector('.Menu-TL a');
    if (tinhluongLink) {
        tinhluongLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('tinhluong');
        });
    }
    // Xử lý sự kiện click trên các nút tính toán
    document.getElementById('btnTinhPhuCap')?.addEventListener('click', function () {
        showTinhLuongSection('tinhphucap');
        history.pushState({ page: 'tinhphucap' }, '', '#tinhphucap');
    });

    document.getElementById('btnTinhChamCong')?.addEventListener('click', function () {
        showTinhLuongSection('tinhchamcong');
        history.pushState({ page: 'tinhchamcong' }, '', '#tinhchamcong');
    });

    document.getElementById('btnTinhUngLuong')?.addEventListener('click', function () {
        showTinhLuongSection('tinhungluong');
        history.pushState({ page: 'tinhungluong' }, '', '#tinhungluong');
    });

    document.getElementById('btnTinhTruLuong')?.addEventListener('click', function () {
        showTinhLuongSection('tinhtruluong');
        history.pushState({ page: 'tinhtruluong' }, '', '#tinhtruluong');
    });

    document.getElementById('btnTinhThucLanh')?.addEventListener('click', function () {
        showTinhLuongSection('tinhthuclanh');
        history.pushState({ page: 'tinhthuclanh' }, '', '#tinhthuclanh');
    });

    // Xử lý quay lại lịch sử trình duyệt
    window.addEventListener('popstate', function (event) {
        if (event.state && event.state.page) {
            showTinhLuongSection(event.state.page);
        } else {
            showTinhLuongSection('tinhluong'); // Trở lại mặc định nếu không có trạng thái trước đó
        }
    });
    if (!document.querySelector('.tinhluong')) {
        document.querySelectorAll('.tinhphucap, .tinhchamcong, .tinhungluong, .tinhtruluong, .tinhthuclanh')
            .forEach(div => div.style.display = 'none');
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

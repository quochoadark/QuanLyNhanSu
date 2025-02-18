
document.addEventListener("DOMContentLoaded", function () {
    // Mặc định hiển thị .tongquan khi vào trang
    document.querySelectorAll('.col-10 > div').forEach(div => {
        div.style.display = 'none';
    });
    const tongQuanSection = document.querySelector('.tongquan');
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
    const loainhanvienLink = document.querySelector('.Menu-LNV a');
    if (loainhanvienLink) {
        loainhanvienLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('loainhanvien');
        });
    }
    const themmoinhanvienLink = document.querySelector('.Menu-TMNV a');
    if (themmoinhanvienLink) {
        themmoinhanvienLink.addEventListener('click', function (e) {
            e.preventDefault();
            showSection('themmoinhanvien');
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
});

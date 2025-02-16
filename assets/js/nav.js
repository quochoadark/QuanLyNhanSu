document.addEventListener("DOMContentLoaded", function () {
    const btnRegister = document.querySelectorAll(".js-open");
    const btnLogin = document.querySelectorAll(".js-open1");
    const modalRegister = document.querySelector(".modal-register");
    const modalLogin = document.querySelector(".modal-login");
    const closeRegister = document.querySelector(".modal-register .modal__close");
    const closeLogin = document.querySelector(".modal-login .modal__close");

    // Các nút trên navbar
    const navRegister = document.querySelector(".nav-register");
    const navLogin = document.querySelector(".nav-login");
    const navUser = document.querySelector(".nav-user");

    // Nút đăng nhập trong modal
    const btnLoginConfirm = modalLogin.querySelector(".btn.btn--primary");

    function showRegister() {
        modalRegister.classList.add("open");
    }
    function showLogin() {
        modalLogin.classList.add("open");
    }
    function hideRegister() {
        modalRegister.classList.remove("open");
    }
    function hideLogin() {
        modalLogin.classList.remove("open");
    }

    btnRegister.forEach(btn => btn.addEventListener("click", showRegister));
    btnLogin.forEach(btn => btn.addEventListener("click", showLogin));
    closeRegister.addEventListener("click", hideRegister);
    closeLogin.addEventListener("click", hideLogin);

    // Xử lý khi người dùng nhấn nút "Đăng nhập"
    btnLoginConfirm.addEventListener("click", function () {
        // Ẩn nút Đăng ký và Đăng nhập
        navRegister.style.display = "none";
        navLogin.style.display = "none";
        // Hiển thị nút User
        navUser.style.display = "flex";
        // Đóng modal đăng nhập
        hideLogin();
    });
});

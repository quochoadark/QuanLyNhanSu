function ToggleSubMenu(button) {
    button.nextElementSibling.classList.toggle("show")
    button.classList.toggle("rotate")
}
document.addEventListener("DOMContentLoaded", function () {
    document.querySelectorAll(".sub-menu").forEach(menu => menu.classList.remove("show"));
});
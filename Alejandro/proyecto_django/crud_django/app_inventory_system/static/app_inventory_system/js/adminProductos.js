(function() {
    const btnEliminar = document.querySelectorAll(".btnEliminar");

    btnEliminar.forEach(btn => {
        btn.addEventListener('click', (e) => {
            const confirmacion = confirm('¿Deseas eliminar el producto?');
            if (!confirmacion) {
                e.preventDefault();
            }
        });
    });

})();
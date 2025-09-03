const menu = document.getElementById('menu');
const API_URL = 'http://localhost:8080/food';

async function fetchFoods() {
    try {
        const response = await fetch(API_URL);
        const foods = await response.json();
        renderMenu(foods);
    } catch (error) {
        console.error('Erro ao buscar dados do backend:', error);
    }
}

function renderMenu(foods) {
    menu.innerHTML = '';
    foods.forEach(food => {
        const card = document.createElement('div');
        card.className = 'col-6 col-md-3'; 
        card.innerHTML = `
            <div class="card h-100 shadow-sm">
                <img src="${food.image}" class="card-img-top" alt="${food.title}">
                <div class="card-body">
                    <h5 class="card-title">${food.tittle}</h5>
                    <p class="card-text">R$ ${food.price.toFixed(2)}</p>
                </div>
            </div>
        `;
        menu.appendChild(card);
    });
}

fetchFoods();

interface CardProps{
    price: number,
    title:string,
    image:string

}
export function Crad(props: CardProps){
    return(
        <div className="card">
            <img/>
            <h2></h2>
            <p><b>Valor:</b></p>
        </div>
    )
}
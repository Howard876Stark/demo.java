function outer() {
    let a = 10


    function inner() {
        let a = 20
        console.log("inner : ", this.a);
    }

    inner()
    // console.log("outer : ", a);
}

outer()
pipeline{
    agent any
    stages
    {
        stage("Paso 1")
        {
            steps
            {
                script 
                {
                    def n1 = 1
                    def n2 = 2
                    def operador = "+"
                    
                    println 'El primer valor es: ' + n1
                    println 'El segundo valor es: ' + n2
                    println 'El operador es: ' + operador
                    
                    def result
                    switch (operador) {
                        case "+": 
                            result = n1 + n2
                            break
                        case "-": 
                            result = n1 - n2
                            break
                        case "*": 
                            result = n1 * n2
                            break
                        case "/": 
                            result = n1 / n2
                            break
                    }
                    
                    println 'El resultado de la operacion es: ' + result
                }
            }
        }
    }
}
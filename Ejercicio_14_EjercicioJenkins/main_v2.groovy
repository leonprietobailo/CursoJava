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
                    def n1 = 24
                    def n2 = 27
                    
                    println 'El primer valor es: ' + n1
                    println 'El segundo valor es: ' + n2
                    
                    println 'La suma de los valores es: ' + (n1+n2)
                    println 'La resta de los valores es: ' + (n1-n2)
                    println 'La multiplicación de los valores es: ' + (n1*n2)
                    println 'La división de los valores es: ' + (n1/n2)
                    
                }
            }
        }
    }
}
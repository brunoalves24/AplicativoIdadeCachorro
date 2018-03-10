package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.editText);
        botaoIdade = findViewById(R.id.button);
        resultadoIdade = findViewById(R.id.textView3);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recuperar o que foi digitado
                String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()){
                    //String vazia (Mensagem de erro)

                }else{

                    //Isso converte o que foi pego no editText para inteiro para ser feito o calculo.
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + " anos");
                }

            }
        });

    }
}

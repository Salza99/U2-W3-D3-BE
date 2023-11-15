package davideSalzani.U2W3D3;

import davideSalzani.U2W3D3.adapter.entities.Info;
import davideSalzani.U2W3D3.adapter.entities.InfoAdapter;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class U2W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U2W3D3Application.class, args);
		Info info = new Info("Marco", "Cicerone", LocalDate.of(1987, 2, 23));

		InfoAdapter adapter = new InfoAdapter(info);
		System.out.println(adapter.getNomeCompleto());
		System.out.println(adapter.getEta());
	}

}

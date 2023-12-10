package org.example.superheroes.data

import org.example.superheroes.data.superheroemodel.SuperHeroe

class HeroesProvider {

    companion object{
        val listaHeroes = listOf<SuperHeroe>(
            SuperHeroe(
                "SuperMan",
                "DC Comics",
                "Krypton",
                "Clark Kent",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fsuperman.jpg?alt=media&token=83eabd81-3372-40d3-91f1-174dbd286f61",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fsuperman.jpg?alt=media&token=f9465873-1334-4885-b38f-16e6ccf9839b"
            ),
            SuperHeroe(
                "Batman",
                "DC Comics",
                "Gotham City",
                "Bruce Wayne",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fbatman.jpg?alt=media&token=813b7f54-80b0-4c43-ac7c-8c16591eeb6a",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fbatman.jpg?alt=media&token=8a26aadd-8b90-4c43-b101-8f3a7480efc0"
            ),
            SuperHeroe(
                "Spider-Man",
                "Marvel",
                "Nueva York, Estados Unidos",
                "Peter Parker",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fspiderman.jpg?alt=media&token=aa756e01-d59f-45b1-96d8-1345338e22f1",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fspiderman.jpg?alt=media&token=b04f7a49-8c8f-45b6-8cfa-8baa623b7974"
            ),
            SuperHeroe(
                "Lobezno",
                "DC Comics",
                "Alberta, Canadá",
                "James Howlet / Logan",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fwolverine.jpg?alt=media&token=bc15484b-7506-4666-925b-0114659335e8",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fwolverine.jpg?alt=media&token=28dc984c-3b0e-429f-a365-d583f5b000aa"
            ),
            SuperHeroe(
                "Iron Man",
                "Marvel",
                "Nueva York, Estados Unidos",
                "Tony Stark",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fironman.jpg?alt=media&token=8a03b898-500b-4239-b85c-3fc28996f657",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fironman.jpg?alt=media&token=e75d6d7b-cae8-4300-9a8d-5d3d2d46cfa7"
            ),
            SuperHeroe(
                "Wonder Woman",
                "DC Comics",
                "Temiscira",
                "Diana de Temiscira / Diana Prince",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fwonderwoman.png?alt=media&token=8cd1d2e8-d1da-4655-af65-a28f0f3e3d30",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fwonderwoman.png?alt=media&token=684fee6a-1a3b-47e6-8375-36ab779bc96b"
            ),
            SuperHeroe(
                "Thor",
                "DC Comics",
                "Asgard",
                "Thor",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fthor.jpg?alt=media&token=7d077191-317c-49c1-b2ef-92dda75457b0",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fthor.jpg?alt=media&token=2fce62bf-7a15-4337-9582-681de3f1961f"
            ),
            SuperHeroe(
                "Capitán América",
                "Marvel",
                "Brooklyn, Nueva York, Estados Unidos",
                "Steve Rogers",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fcapitanamerica.jpg?alt=media&token=5abc7329-6233-4431-ba78-e946e5f4d92a",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fcapitanamerica.jpg?alt=media&token=dad50c3f-8986-47d0-a57d-0ef94c7b9f76"
            ),
            SuperHeroe(
                "Flash",
                "DC Comics",
                "Ciudad Central",
                "Bartholomew Henry \"Barry\" Allen",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fflash.jpg?alt=media&token=a18742ad-ab76-402a-8a1f-a6203fb4ee39",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fflash.jpg?alt=media&token=a50ba3d2-3861-4a31-a026-ff280742961b"
            ),
            SuperHeroe(
                "Black Panther",
                "Marvel",
                "Wakanda",
                "T'Challa",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fblackpanther.jpg?alt=media&token=e3d48be9-e28a-4ab8-90b9-6f803fe37ad2",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fblackpanther.jpg?alt=media&token=2894e724-046b-4c90-a548-308d0e543ec0"
            ),
            SuperHeroe(
                "Deadpool",
                "Marvel",
                "Regina, Saskatchewan, Canadá",
                "Wade Wilson",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fdeadpool.jpg?alt=media&token=15a0d2b7-7766-42bc-a11e-880decf55f11",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fdeadpool.jpg?alt=media&token=60a0c29d-2363-4b7b-b651-d876e53ed72f"
            ),
            SuperHeroe(
                "Aquaman",
                "DC Comics",
                "Ciudad Atlante",
                "Arthur Curry",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Faquaman.jpg?alt=media&token=4b23fd97-fb47-4b7c-88cd-66b4f0ee9c05",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Faquaman.jpg?alt=media&token=639736bb-8a02-425a-a037-6b68793e4833"
            ),
            SuperHeroe(
                "Antman",
                "Marvel",
                "Coral Gables, Florida",
                "Scott Lang",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fantman.jpg?alt=media&token=84d9e95e-98b3-4cac-a66a-cb7b078b13dd",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fantman.jpg?alt=media&token=5353d6d9-0f95-414f-83cd-56c476af3f19"
            ),
            SuperHeroe(
                "Ojo de halcón",
                "Marvel",
                "Waverly, Iowa",
                "Clinton Francies <<Clint>> Barton",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fhawkeye.jpg?alt=media&token=5420a724-23ba-4b3f-8f71-64320b025e53",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fhawkeye.jpg?alt=media&token=4ec2ab4d-36b9-4709-b71b-c63eac9bfcf8"
            ),
            SuperHeroe(
                "Bruja Escarlata",
                "Marvel",
                "Sokovia, Europa del Este",
                "Wanda Maximoff",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fbrujaescarlata.jpg?alt=media&token=29821d6e-0c9c-48e8-bd91-8180925b521c",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fbrujaescarlata.jpg?alt=media&token=37c76104-1af6-42bf-89d3-206b73638606"
            ),
            SuperHeroe(
                "Doctor Strange",
                "Marvel",
                "Filadelfia",
                "Stephen Vincent Strange",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fdoctorstrange.jpg?alt=media&token=4280e27c-5133-49ec-ba3a-0127b56bc4bc",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fdoctorstrange.jpg?alt=media&token=720247e9-6793-4726-94c3-2fb854e5a32b"
            ),
            SuperHeroe(
                "Hulk",
                "Marvel",
                "Dayton, Ohio, Estados Unidos",
                "Bruce Banner",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fhulk.jpg?alt=media&token=428b485b-66f5-497b-803d-3b4abe42e769",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fhulk.jpg?alt=media&token=7cd82d42-fda8-4f98-b507-ef52cf084813"
            ),
            SuperHeroe(
                "Cíborg",
                "DC Comics",
                "Detroit, Michigan",
                "Victor \"Vic\" Stone",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fciborg.jpg?alt=media&token=3990e2fd-349d-44b8-9408-6b31c4372197",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fciborg.jpg?alt=media&token=468f5da8-d9bc-458b-85d7-bdb7a6cb576e"
            ),
            SuperHeroe(
                "Viuda Negra",
                "Marvel",
                "Stalingrado (Volgogrado), Rusia",
                "Natalia Alianovna \"Natasha\" Romanova",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fblackwidow.jpeg?alt=media&token=5f547188-906e-4431-ade5-35f449c4d874",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fblackwidow.jpeg?alt=media&token=aebd5222-7418-435e-a1fd-1eb10a0fc204"
            ),
            SuperHeroe(
                "Visión",
                "Marvel",
                "Desconocido",
                "Vision",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroes%2Fvision.jpg?alt=media&token=c7755c4f-7640-48fa-8978-d9b76bf86de6",
                "https://firebasestorage.googleapis.com/v0/b/superheroes-efb16.appspot.com/o/SuperHeroesThumbnail%2Fvision.jpg?alt=media&token=5b04b8a3-69a3-40bf-b32a-2ab93860a5df"
            ),
        )
    }

}
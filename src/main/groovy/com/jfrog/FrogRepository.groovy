package com.jfrog

import org.springframework.stereotype.Repository

/**
 * Created by alexistual on 05/01/2016.
 */
@Repository
class FrogRepository {

    List<Frog> getAllFrogs() {
        [
                new Frog(name: 'Batfrog', year: 2015, quote: 'It\'s always darkest before the green shines', imageUrl: '/bat.png'),
                new Frog(name: 'Indiana Frog', year: 2014, quote: '', imageUrl: '/indy.png'),
                new Frog(name: 'Superfrog', year: 2013, quote: 'It\'s a bird, it\'s a plane, it\'s Superfrog', imageUrl: '/superfrog.png'),
                new Frog(name: 'Frocky', year: 2012, quote: 'Yo Adrian, I build it!', imageUrl: '/frocky.png'),
                new Frog(name: 'The Frogfather', year: 2012, quote: 'Artifactory, an offer you can\'t refuse', imageUrl: '/frogfather.png'),
                new Frog(name: 'James Frog', year: 2011, quote: 'The name\'s Frog, JFrog', imageUrl: '/jamesfrog.png'),
                new Frog(name: 'Princess Bride', year: 2011, quote: 'You killed my build, prepare to die', imageUrl: '/mousq.png'),
                new Frog(name: 'Yoda Frog', year: 2010, quote: 'May the frog be with you', imageUrl: '/jedi.png')
        ]
    }

}

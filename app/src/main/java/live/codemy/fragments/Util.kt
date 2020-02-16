package live.codemy.fragments

import android.util.Log


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     16/02/2020 - 12:32     ║
╚════════════════════════════╝
 */

infix fun String.logError(className: String) {
    Log.e(className, this)
}
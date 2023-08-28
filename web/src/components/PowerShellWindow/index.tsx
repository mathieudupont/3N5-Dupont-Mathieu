/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

 import React, {type CSSProperties, type ReactNode} from 'react';
 import clsx from 'clsx';
 
 import styles from './styles.module.css';
 
 interface Props {
   children: ReactNode;
   minHeight?: number;
   url: string;
   style?: CSSProperties;
   bodyStyle?: CSSProperties;
 }
 
 export default function PowerShellWindow({
   children,
   minHeight,
   url = 'http://localhost:3000',
   style,
   bodyStyle,
 }: Props): JSX.Element {
   return (
     <div className={styles.powerShellWindow} style={{...style, minHeight}}>
       <div className={styles.powerShellWindowHeader}>
         <div className={styles.buttons}>
           <span className={styles.dot} style={{background: '#f25f58'}} />
           <span className={styles.dot} style={{background: '#fbbe3c'}} />
           <span className={styles.dot} style={{background: '#58cb42'}} />
         </div>
         <div className={clsx(styles.powerShellWindowAddressBar, 'text--truncate')}>
           {url}
         </div>
         <div className={styles.powerShellWindowMenuIcon}>
           <div>
             <span className={styles.bar} />
             <span className={styles.bar} />
             <span className={styles.bar} />
           </div>
         </div>
       </div>
 
       <div className={styles.powerShellWindowBody} style={bodyStyle}>
         {children}
       </div>
     </div>
   );
 }
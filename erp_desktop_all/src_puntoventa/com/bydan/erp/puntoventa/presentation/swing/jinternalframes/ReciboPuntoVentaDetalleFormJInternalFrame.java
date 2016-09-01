/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.ReciboPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class ReciboPuntoVentaDetalleFormJInternalFrame extends ReciboPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleReciboPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleReciboPuntoVenta;
	
	protected JMenu jmenuDetalleReciboPuntoVenta;
	protected JMenu jmenuDetalleArchivoReciboPuntoVenta;
	protected JMenu jmenuDetalleAccionesReciboPuntoVenta;
	protected JMenu jmenuDetalleDatosReciboPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReciboPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsReciboPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ReciboPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleReciboPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";
	
	public ReciboPuntoVentaSessionBean recibopuntoventaSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public BancoSessionBean bancoSessionBean;	
	
	public ReciboPuntoVentaLogic recibopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosReciboPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionReciboPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralReciboPuntoVenta;
	
	protected JPanel jPanelCamposReciboPuntoVenta;    
	protected JPanel jPanelCamposOcultosReciboPuntoVenta;    	
	protected JPanel jPanelAccionesReciboPuntoVenta;
	protected JPanel jPanelAccionesFormularioReciboPuntoVenta;
    
	
	
	protected Integer iXPanelCamposReciboPuntoVenta=0;
	protected Integer iYPanelCamposReciboPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosReciboPuntoVenta=0;
	protected Integer iYPanelCamposOcultosReciboPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoReciboPuntoVenta;
	public JButton jButtonModificarReciboPuntoVenta;
	public JButton jButtonActualizarReciboPuntoVenta;
    public JButton jButtonEliminarReciboPuntoVenta;
	public JButton jButtonCancelarReciboPuntoVenta;
    public JButton jButtonGuardarCambiosReciboPuntoVenta;
	public JButton jButtonGuardarCambiosTablaReciboPuntoVenta;
	protected JButton jButtonCerrarReciboPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionReciboPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoReciboPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarReciboPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeReciboPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReciboPuntoVenta;
	protected JButton jButtonModificarToolBarReciboPuntoVenta;
	protected JButton jButtonActualizarToolBarReciboPuntoVenta;
    protected JButton jButtonEliminarToolBarReciboPuntoVenta;
	protected JButton jButtonCancelarToolBarReciboPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarReciboPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarReciboPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarReciboPuntoVenta;
	protected JButton jButtonCerrarToolBarReciboPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarReciboPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReciboPuntoVenta;
	protected JMenuItem jMenuItemModificarReciboPuntoVenta;
	protected JMenuItem jMenuItemActualizarReciboPuntoVenta;
    protected JMenuItem jMenuItemEliminarReciboPuntoVenta;
	protected JMenuItem jMenuItemCancelarReciboPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosReciboPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaReciboPuntoVenta;
	protected JMenuItem jMenuItemCerrarReciboPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarReciboPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarReciboPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionReciboPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReciboPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarReciboPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReciboPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReciboPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioReciboPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidReciboPuntoVenta;
	public JLabel jLabelIdReciboPuntoVenta;
	public JLabel jLabelidReciboPuntoVenta;
	public JButton jButtonidReciboPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_efectivoReciboPuntoVenta;
	public JLabel jLabelvalor_efectivoReciboPuntoVenta;
	public JTextField jTextFieldvalor_efectivoReciboPuntoVenta;
	public JButton jButtonvalor_efectivoReciboPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_chequeReciboPuntoVenta;
	public JLabel jLabelvalor_chequeReciboPuntoVenta;
	public JTextField jTextFieldvalor_chequeReciboPuntoVenta;
	public JButton jButtonvalor_chequeReciboPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeReciboPuntoVenta;
	public JLabel jLabelnumero_chequeReciboPuntoVenta;
	public JTextField jTextFieldnumero_chequeReciboPuntoVenta;
	public JButton jButtonnumero_chequeReciboPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfechaReciboPuntoVenta;
	public JLabel jLabelfechaReciboPuntoVenta;
	//public JFormattedTextField jDateChooserfechaReciboPuntoVenta;

	public JDateChooser jDateChooserfechaReciboPuntoVenta;
	public JButton jButtonfechaReciboPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteReciboPuntoVenta;
	public JLabel jLabelid_clienteReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteReciboPuntoVenta;
	public JButton jButtonid_clienteReciboPuntoVenta= new JButtonMe();
	public JButton jButtonid_clienteReciboPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteReciboPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoReciboPuntoVenta;
	public JLabel jLabelid_bancoReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoReciboPuntoVenta;
	public JButton jButtonid_bancoReciboPuntoVenta= new JButtonMe();
	public JButton jButtonid_bancoReciboPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bancoReciboPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesReciboPuntoVenta;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ReciboPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposReciboPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioReciboPuntoVenta=new JPanel();
				this.jmenuBarDetalleReciboPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleReciboPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReciboPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ReciboPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReciboPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReciboPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReciboPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarReciboPuntoVenta() {
		return this.jButtonActualizarToolBarReciboPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarReciboPuntoVenta() {
		return this.jButtonEliminarToolBarReciboPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarReciboPuntoVenta() {
		return this.jButtonCancelarToolBarReciboPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionReciboPuntoVenta() {
		return this.jButtonProcesarInformacionReciboPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReciboPuntoVenta)	{
		this.jButtonProcesarInformacionReciboPuntoVenta = jButtonProcesarInformacionReciboPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReciboPuntoVenta() {
		return this.jComboBoxTiposAccionesReciboPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReciboPuntoVenta(
			JComboBox jComboBoxTiposRelacionesReciboPuntoVenta) {
		this.jComboBoxTiposRelacionesReciboPuntoVenta = jComboBoxTiposRelacionesReciboPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReciboPuntoVenta(
			JComboBox jComboBoxTiposAccionesReciboPuntoVenta) {
		this.jComboBoxTiposAccionesReciboPuntoVenta = jComboBoxTiposAccionesReciboPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioReciboPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioReciboPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioReciboPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioReciboPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioReciboPuntoVenta = jComboBoxTiposAccionesFormularioReciboPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
		
		this.recibopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recibopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.recibopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReciboPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReciboPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReciboPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Recibo Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ReciboPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleReciboPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarReciboPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarReciboPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarReciboPuntoVenta,this.jTtoolBarDetalleReciboPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarReciboPuntoVenta,this.jTtoolBarDetalleReciboPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarReciboPuntoVenta,this.jTtoolBarDetalleReciboPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarReciboPuntoVenta,this.jTtoolBarDetalleReciboPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleReciboPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleReciboPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoReciboPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesReciboPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosReciboPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReciboPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReciboPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReciboPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarReciboPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarReciboPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarReciboPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarReciboPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarReciboPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarReciboPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarReciboPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarReciboPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarReciboPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarReciboPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarReciboPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarReciboPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosReciboPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReciboPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReciboPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReciboPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReciboPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReciboPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarReciboPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarReciboPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarReciboPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReciboPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReciboPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReciboPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReciboPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReciboPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReciboPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoReciboPuntoVenta.add(this.jMenuItemDetalleCerrarReciboPuntoVenta);
		
		this.jmenuDetalleAccionesReciboPuntoVenta.add(this.jMenuItemActualizarReciboPuntoVenta);
		this.jmenuDetalleAccionesReciboPuntoVenta.add(this.jMenuItemEliminarReciboPuntoVenta);
		this.jmenuDetalleAccionesReciboPuntoVenta.add(this.jMenuItemCancelarReciboPuntoVenta);		
		
		//this.jmenuDetalleDatosReciboPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByReciboPuntoVenta);				
		this.jmenuDetalleDatosReciboPuntoVenta.add(this.jMenuItemDetalleMostarOcultarReciboPuntoVenta);				
				
		//this.jmenuDetalleAccionesReciboPuntoVenta.add(this.jMenuItemGuardarCambiosReciboPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleReciboPuntoVenta.add(this.jmenuDetalleArchivoReciboPuntoVenta);		
		this.jmenuBarDetalleReciboPuntoVenta.add(this.jmenuDetalleAccionesReciboPuntoVenta);		
		this.jmenuBarDetalleReciboPuntoVenta.add(this.jmenuDetalleDatosReciboPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleReciboPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposReciboPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdReciboPuntoVenta = new JLabelMe();
		jLabelIdReciboPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidReciboPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidReciboPuntoVenta.setToolTipText(ReciboPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutReciboPuntoVenta= new GridBagLayout();

		this.jPanelidReciboPuntoVenta.setLayout(this.gridaBagLayoutReciboPuntoVenta);

		jLabelidReciboPuntoVenta = new JLabel();
		jLabelidReciboPuntoVenta.setText("Id");

		jLabelidReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_efectivoReciboPuntoVenta = new JLabelMe();
		this.jLabelvalor_efectivoReciboPuntoVenta.setText(""+ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO+" : *");
		this.jLabelvalor_efectivoReciboPuntoVenta.setToolTipText("Valor Efectivo");
		this.jLabelvalor_efectivoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_efectivoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_efectivoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_efectivoReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_efectivoReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_efectivoReciboPuntoVenta.setToolTipText(ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO);
		this.gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		this.jPanelvalor_efectivoReciboPuntoVenta.setLayout(this.gridaBagLayoutReciboPuntoVenta);


		jTextFieldvalor_efectivoReciboPuntoVenta= new JTextFieldMe();
		jTextFieldvalor_efectivoReciboPuntoVenta.setEnabled(false);
		jTextFieldvalor_efectivoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_efectivoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_efectivoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_efectivoReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_efectivoReciboPuntoVenta.setText("0.0");

		this.jButtonvalor_efectivoReciboPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalor_efectivoReciboPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_efectivoReciboPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_efectivoReciboPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_efectivoReciboPuntoVentaBusqueda.setText("U");
		this.jButtonvalor_efectivoReciboPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_efectivoReciboPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_efectivoReciboPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_efectivoReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_efectivoReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_efectivoReciboPuntoVentaBusqueda"));

		if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_efectivoReciboPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_chequeReciboPuntoVenta = new JLabelMe();
		this.jLabelvalor_chequeReciboPuntoVenta.setText(""+ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE+" : *");
		this.jLabelvalor_chequeReciboPuntoVenta.setToolTipText("Valor Cheque");
		this.jLabelvalor_chequeReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_chequeReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_chequeReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_chequeReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_chequeReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_chequeReciboPuntoVenta.setToolTipText(ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE);
		this.gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		this.jPanelvalor_chequeReciboPuntoVenta.setLayout(this.gridaBagLayoutReciboPuntoVenta);


		jTextFieldvalor_chequeReciboPuntoVenta= new JTextFieldMe();
		jTextFieldvalor_chequeReciboPuntoVenta.setEnabled(false);
		jTextFieldvalor_chequeReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_chequeReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_chequeReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_chequeReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_chequeReciboPuntoVenta.setText("0.0");

		this.jButtonvalor_chequeReciboPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalor_chequeReciboPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_chequeReciboPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_chequeReciboPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_chequeReciboPuntoVentaBusqueda.setText("U");
		this.jButtonvalor_chequeReciboPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_chequeReciboPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_chequeReciboPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_chequeReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_chequeReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_chequeReciboPuntoVentaBusqueda"));

		if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_chequeReciboPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeReciboPuntoVenta = new JLabelMe();
		this.jLabelnumero_chequeReciboPuntoVenta.setText(""+ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeReciboPuntoVenta.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeReciboPuntoVenta.setToolTipText(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		this.jPanelnumero_chequeReciboPuntoVenta.setLayout(this.gridaBagLayoutReciboPuntoVenta);


		jTextFieldnumero_chequeReciboPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_chequeReciboPuntoVenta.setEnabled(false);
		jTextFieldnumero_chequeReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeReciboPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_chequeReciboPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeReciboPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeReciboPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeReciboPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_chequeReciboPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeReciboPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeReciboPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeReciboPuntoVentaBusqueda"));

		if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeReciboPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfechaReciboPuntoVenta = new JLabelMe();
		this.jLabelfechaReciboPuntoVenta.setText(""+ReciboPuntoVentaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaReciboPuntoVenta.setToolTipText("Fecha");
		this.jLabelfechaReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaReciboPuntoVenta.setToolTipText(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		this.jPanelfechaReciboPuntoVenta.setLayout(this.gridaBagLayoutReciboPuntoVenta);


		//jFormattedTextFieldfechaReciboPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfechaReciboPuntoVenta= new JDateChooser();
		jDateChooserfechaReciboPuntoVenta.setEnabled(false);
		jDateChooserfechaReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaReciboPuntoVenta.setDate(new Date());
		jDateChooserfechaReciboPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaReciboPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaReciboPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfechaReciboPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaReciboPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaReciboPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaReciboPuntoVentaBusqueda.setText("U");
		this.jButtonfechaReciboPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaReciboPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaReciboPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaReciboPuntoVentaBusqueda"));

		if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaReciboPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysReciboPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_clienteReciboPuntoVenta = new JLabelMe();
		this.jLabelid_clienteReciboPuntoVenta.setText(""+ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteReciboPuntoVenta.setToolTipText("Cliente");
		this.jLabelid_clienteReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteReciboPuntoVenta.setToolTipText(ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		this.jPanelid_clienteReciboPuntoVenta.setLayout(this.gridaBagLayoutReciboPuntoVenta);


		jComboBoxid_clienteReciboPuntoVenta= new JComboBoxMe();
		jComboBoxid_clienteReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteReciboPuntoVenta= new JButtonMe();
		this.jButtonid_clienteReciboPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteReciboPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteReciboPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteReciboPuntoVenta.setText("Buscar");
		this.jButtonid_clienteReciboPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteReciboPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteReciboPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteReciboPuntoVenta"));

		this.jButtonid_clienteReciboPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_clienteReciboPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteReciboPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteReciboPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteReciboPuntoVentaBusqueda.setText("U");
		this.jButtonid_clienteReciboPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteReciboPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteReciboPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteReciboPuntoVentaBusqueda"));

		if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteReciboPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_clienteReciboPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_clienteReciboPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteReciboPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteReciboPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteReciboPuntoVentaUpdate.setText("U");
		this.jButtonid_clienteReciboPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteReciboPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteReciboPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteReciboPuntoVentaUpdate"));



					
		this.jLabelid_bancoReciboPuntoVenta = new JLabelMe();
		this.jLabelid_bancoReciboPuntoVenta.setText(""+ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoReciboPuntoVenta.setToolTipText("Banco");
		this.jLabelid_bancoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoReciboPuntoVenta.setToolTipText(ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		this.jPanelid_bancoReciboPuntoVenta.setLayout(this.gridaBagLayoutReciboPuntoVenta);


		jComboBoxid_bancoReciboPuntoVenta= new JComboBoxMe();
		jComboBoxid_bancoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoReciboPuntoVenta= new JButtonMe();
		this.jButtonid_bancoReciboPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoReciboPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoReciboPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoReciboPuntoVenta.setText("Buscar");
		this.jButtonid_bancoReciboPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoReciboPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoReciboPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoReciboPuntoVenta"));

		this.jButtonid_bancoReciboPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_bancoReciboPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoReciboPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoReciboPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoReciboPuntoVentaBusqueda.setText("U");
		this.jButtonid_bancoReciboPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoReciboPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoReciboPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoReciboPuntoVentaBusqueda"));

		if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoReciboPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_bancoReciboPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_bancoReciboPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoReciboPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoReciboPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoReciboPuntoVentaUpdate.setText("U");
		this.jButtonid_bancoReciboPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoReciboPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoReciboPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoReciboPuntoVentaUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleReciboPuntoVenta = new ReciboPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Recibo Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReciboPuntoVenta= new GridBagLayout();
		

		
		String sToolTipReciboPuntoVenta="";
		sToolTipReciboPuntoVenta=ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReciboPuntoVenta+="(PuntoVenta.ReciboPuntoVenta)";
		}
		
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipReciboPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoReciboPuntoVenta = new JButtonMe();
		this.jButtonModificarReciboPuntoVenta = new JButtonMe();
        this.jButtonActualizarReciboPuntoVenta = new JButtonMe();
        this.jButtonEliminarReciboPuntoVenta = new JButtonMe();
        this.jButtonCancelarReciboPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosReciboPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaReciboPuntoVenta = new JButtonMe();
		this.jButtonCerrarReciboPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosReciboPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionReciboPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralReciboPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Recibo Punto Venta";
		
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recibo Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosReciboPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposReciboPuntoVenta.setName("jPanelCamposReciboPuntoVenta"); 

		this.jPanelCamposOcultosReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosReciboPuntoVenta.setName("jPanelCamposOcultosReciboPuntoVenta"); 

        this.jPanelAccionesReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReciboPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesReciboPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioReciboPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioReciboPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoReciboPuntoVenta.setText("Nuevo");
		this.jButtonModificarReciboPuntoVenta.setText("Editar");
        this.jButtonActualizarReciboPuntoVenta.setText("Actualizar");
        this.jButtonEliminarReciboPuntoVenta.setText("Eliminar");
        this.jButtonCancelarReciboPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosReciboPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.setText("Guardar");
		this.jButtonCerrarReciboPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReciboPuntoVenta,"nuevo_button","Nuevo",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarReciboPuntoVenta,"modificar_button","Editar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarReciboPuntoVenta,"actualizar_button","Actualizar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarReciboPuntoVenta,"eliminar_button","Eliminar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarReciboPuntoVenta,"cancelar_button","Cancelar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosReciboPuntoVenta,"guardarcambios_button","Guardar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReciboPuntoVenta,"guardarcambiostabla_button","Guardar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReciboPuntoVenta,"cerrar_button","Salir",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoReciboPuntoVenta.setToolTipText("Nuevo"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarReciboPuntoVenta.setToolTipText("Editar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarReciboPuntoVenta.setToolTipText("Actualizar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarReciboPuntoVenta.setToolTipText("Eliminar)"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarReciboPuntoVenta.setToolTipText("Cancelar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosReciboPuntoVenta.setToolTipText("Guardar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.setToolTipText("Guardar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReciboPuntoVenta.setToolTipText("Salir"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoReciboPuntoVenta";
		inputMap = this.jButtonNuevoReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReciboPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReciboPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarReciboPuntoVenta";
		inputMap = this.jButtonActualizarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarReciboPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarReciboPuntoVenta";
		inputMap = this.jButtonEliminarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarReciboPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarReciboPuntoVenta";
		inputMap = this.jButtonCancelarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarReciboPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarReciboPuntoVenta";
		inputMap = this.jButtonCerrarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReciboPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReciboPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReciboPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoReciboPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoReciboPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoReciboPuntoVenta.setToolTipText("Nuevo ReciboPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarReciboPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarReciboPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarReciboPuntoVenta.setToolTipText("Sin Cerrar Ventana ReciboPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeReciboPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeReciboPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeReciboPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReciboPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesReciboPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesReciboPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesReciboPuntoVenta.setText("Acciones");		
		this.jLabelAccionesReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposReciboPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysReciboPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesReciboPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReciboPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposReciboPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosReciboPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposReciboPuntoVenta.setLayout(gridaBagLayoutCamposReciboPuntoVenta);
		this.jPanelCamposOcultosReciboPuntoVenta.setLayout(gridaBagLayoutCamposOcultosReciboPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidReciboPuntoVenta.add(jLabelIdReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 1;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidReciboPuntoVenta.add(jLabelidReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteReciboPuntoVenta.add(jLabelid_clienteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 2;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteReciboPuntoVenta.add(jButtonid_clienteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 3;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteReciboPuntoVenta.add(jButtonid_clienteReciboPuntoVentaBusqueda, this.gridBagConstraintsReciboPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 4;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteReciboPuntoVenta.add(jButtonid_clienteReciboPuntoVentaUpdate, this.gridBagConstraintsReciboPuntoVenta);
	}

	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 1;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteReciboPuntoVenta.add(jComboBoxid_clienteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoReciboPuntoVenta.add(jLabelid_bancoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 2;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoReciboPuntoVenta.add(jButtonid_bancoReciboPuntoVentaBusqueda, this.gridBagConstraintsReciboPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 3;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoReciboPuntoVenta.add(jButtonid_bancoReciboPuntoVentaUpdate, this.gridBagConstraintsReciboPuntoVenta);
	}

	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 1;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoReciboPuntoVenta.add(jComboBoxid_bancoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_efectivoReciboPuntoVenta.add(jLabelvalor_efectivoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 2;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_efectivoReciboPuntoVenta.add(jButtonvalor_efectivoReciboPuntoVentaBusqueda, this.gridBagConstraintsReciboPuntoVenta);
	}

	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 1;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_efectivoReciboPuntoVenta.add(jTextFieldvalor_efectivoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_chequeReciboPuntoVenta.add(jLabelvalor_chequeReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 2;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_chequeReciboPuntoVenta.add(jButtonvalor_chequeReciboPuntoVentaBusqueda, this.gridBagConstraintsReciboPuntoVenta);
	}

	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 1;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_chequeReciboPuntoVenta.add(jTextFieldvalor_chequeReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeReciboPuntoVenta.add(jLabelnumero_chequeReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 2;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeReciboPuntoVenta.add(jButtonnumero_chequeReciboPuntoVentaBusqueda, this.gridBagConstraintsReciboPuntoVenta);
	}

	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 1;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeReciboPuntoVenta.add(jTextFieldnumero_chequeReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaReciboPuntoVenta.add(jLabelfechaReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 2;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
		this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaReciboPuntoVenta.add(jButtonfechaReciboPuntoVentaBusqueda, this.gridBagConstraintsReciboPuntoVenta);
	}

	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
	this.gridBagConstraintsReciboPuntoVenta.gridx = 1;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaReciboPuntoVenta.add(jDateChooserfechaReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReciboPuntoVenta.gridy = iYPanelCamposReciboPuntoVenta;
	this.gridBagConstraintsReciboPuntoVenta.gridx = iXPanelCamposReciboPuntoVenta++;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReciboPuntoVenta.add(this.jPanelidReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(iXPanelCamposReciboPuntoVenta % 1==0) {
		iXPanelCamposReciboPuntoVenta=0;
		iYPanelCamposReciboPuntoVenta++;
	}
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReciboPuntoVenta.gridy = iYPanelCamposReciboPuntoVenta;
	this.gridBagConstraintsReciboPuntoVenta.gridx = iXPanelCamposReciboPuntoVenta++;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReciboPuntoVenta.add(this.jPanelid_clienteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(iXPanelCamposReciboPuntoVenta % 1==0) {
		iXPanelCamposReciboPuntoVenta=0;
		iYPanelCamposReciboPuntoVenta++;
	}
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReciboPuntoVenta.gridy = iYPanelCamposReciboPuntoVenta;
	this.gridBagConstraintsReciboPuntoVenta.gridx = iXPanelCamposReciboPuntoVenta++;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReciboPuntoVenta.add(this.jPanelid_bancoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(iXPanelCamposReciboPuntoVenta % 1==0) {
		iXPanelCamposReciboPuntoVenta=0;
		iYPanelCamposReciboPuntoVenta++;
	}
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReciboPuntoVenta.gridy = iYPanelCamposReciboPuntoVenta;
	this.gridBagConstraintsReciboPuntoVenta.gridx = iXPanelCamposReciboPuntoVenta++;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReciboPuntoVenta.add(this.jPanelvalor_efectivoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(iXPanelCamposReciboPuntoVenta % 1==0) {
		iXPanelCamposReciboPuntoVenta=0;
		iYPanelCamposReciboPuntoVenta++;
	}
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReciboPuntoVenta.gridy = iYPanelCamposReciboPuntoVenta;
	this.gridBagConstraintsReciboPuntoVenta.gridx = iXPanelCamposReciboPuntoVenta++;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReciboPuntoVenta.add(this.jPanelvalor_chequeReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(iXPanelCamposReciboPuntoVenta % 1==0) {
		iXPanelCamposReciboPuntoVenta=0;
		iYPanelCamposReciboPuntoVenta++;
	}
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReciboPuntoVenta.gridy = iYPanelCamposReciboPuntoVenta;
	this.gridBagConstraintsReciboPuntoVenta.gridx = iXPanelCamposReciboPuntoVenta++;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReciboPuntoVenta.add(this.jPanelnumero_chequeReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(iXPanelCamposReciboPuntoVenta % 1==0) {
		iXPanelCamposReciboPuntoVenta=0;
		iYPanelCamposReciboPuntoVenta++;
	}
	this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReciboPuntoVenta.gridy = iYPanelCamposReciboPuntoVenta;
	this.gridBagConstraintsReciboPuntoVenta.gridx = iXPanelCamposReciboPuntoVenta++;
	this.gridBagConstraintsReciboPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReciboPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReciboPuntoVenta.add(this.jPanelfechaReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);



	if(iXPanelCamposReciboPuntoVenta % 1==0) {
		iXPanelCamposReciboPuntoVenta=0;
		iYPanelCamposReciboPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReciboPuntoVenta= new GridBagLayout();
		this.jPanelAccionesReciboPuntoVenta.setLayout(gridaBagLayoutAccionesReciboPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioReciboPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioReciboPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioReciboPuntoVenta);
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReciboPuntoVenta.add(this.jComboBoxTiposAccionesFormularioReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReciboPuntoVenta.add(this.jCheckBoxPostAccionNuevoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReciboPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReciboPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesReciboPuntoVenta.add(this.jButtonModificarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);							

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesReciboPuntoVenta.add(this.jButtonEliminarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
			
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesReciboPuntoVenta.add(this.jButtonActualizarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesReciboPuntoVenta.add(this.jButtonGuardarCambiosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);	
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;		
		this.gridBagConstraintsReciboPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesReciboPuntoVenta.add(this.jButtonCancelarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReciboPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReciboPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsReciboPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReciboPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReciboPuntoVenta.gridx =0;
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReciboPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleReciboPuntoVenta = new ReciboPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Recibo Punto Venta DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Recibo Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Recibo Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ReciboPuntoVentaModel recibopuntoventaModel=new ReciboPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//ReciboPuntoVentaModel.ReciboPuntoVentaFocusTraversalPolicy recibopuntoventaFocusTraversalPolicy = recibopuntoventaModel.new ReciboPuntoVentaFocusTraversalPolicy(this);
			
			//recibopuntoventaFocusTraversalPolicy.setrecibopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(recibopuntoventaModel);
			
			
			this.jContentPaneDetalleReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleReciboPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleReciboPuntoVenta.setLayout(gridaBagLayoutDetalleReciboPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReciboPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleReciboPuntoVenta.add(jTtoolBarDetalleReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionReciboPuntoVenta=   new JScrollPane(jContentPaneDetalleReciboPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReciboPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReciboPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReciboPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralReciboPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReciboPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReciboPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReciboPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleReciboPuntoVenta.add(jPanelCamposReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& recibopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsReciboPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
						this.jContentPaneDetalleReciboPuntoVenta.add(this.jTabbedPaneRelacionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesReciboPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosReciboPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsReciboPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleReciboPuntoVenta.add(jPanelCamposOcultosReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);
				
					this.jPanelCamposOcultosReciboPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	        this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleReciboPuntoVenta.add(this.jPanelAccionesFormularioReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);							
			
			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleReciboPuntoVenta.add(this.jPanelAccionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionReciboPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionReciboPuntoVenta=   new JScrollPane(this.jPanelCamposReciboPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReciboPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReciboPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReciboPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsReciboPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			
			
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
			
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralReciboPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionReciboPuntoVenta;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}

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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoIessFondoReservaDetalleFormJInternalFrame extends ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoIessFondoReserva;
	
	protected JMenuBar jmenuBarDetalleProcesoIessFondoReserva;
	
	protected JMenu jmenuDetalleProcesoIessFondoReserva;
	protected JMenu jmenuDetalleArchivoProcesoIessFondoReserva;
	protected JMenu jmenuDetalleAccionesProcesoIessFondoReserva;
	protected JMenu jmenuDetalleDatosProcesoIessFondoReserva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoIessFondoReserva;	
	protected GridBagConstraints gridBagConstraintsProcesoIessFondoReserva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoIessFondoReserva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";
	
	public ProcesoIessFondoReservaSessionBean procesoiessfondoreservaSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;	
	
	public ProcesoIessFondoReservaLogic procesoiessfondoreservaLogic;
	
	public JScrollPane jScrollPanelDatosProcesoIessFondoReserva;
	public JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReserva;
	public JScrollPane jScrollPanelDatosGeneralProcesoIessFondoReserva;
	
	protected JPanel jPanelCamposProcesoIessFondoReserva;    
	protected JPanel jPanelCamposOcultosProcesoIessFondoReserva;    	
	protected JPanel jPanelAccionesProcesoIessFondoReserva;
	protected JPanel jPanelAccionesFormularioProcesoIessFondoReserva;
    
	
	
	protected Integer iXPanelCamposProcesoIessFondoReserva=0;
	protected Integer iYPanelCamposProcesoIessFondoReserva=0;
	
	protected Integer iXPanelCamposOcultosProcesoIessFondoReserva=0;
	protected Integer iYPanelCamposOcultosProcesoIessFondoReserva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoIessFondoReserva;
	public JButton jButtonModificarProcesoIessFondoReserva;
	public JButton jButtonActualizarProcesoIessFondoReserva;
    public JButton jButtonEliminarProcesoIessFondoReserva;
	public JButton jButtonCancelarProcesoIessFondoReserva;
    public JButton jButtonGuardarCambiosProcesoIessFondoReserva;
	public JButton jButtonGuardarCambiosTablaProcesoIessFondoReserva;
	protected JButton jButtonCerrarProcesoIessFondoReserva;
	
	
	protected JButton jButtonProcesarInformacionProcesoIessFondoReserva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoIessFondoReserva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoIessFondoReserva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoIessFondoReserva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoIessFondoReserva;
	protected JButton jButtonModificarToolBarProcesoIessFondoReserva;
	protected JButton jButtonActualizarToolBarProcesoIessFondoReserva;
    protected JButton jButtonEliminarToolBarProcesoIessFondoReserva;
	protected JButton jButtonCancelarToolBarProcesoIessFondoReserva;
    protected JButton jButtonGuardarCambiosToolBarProcesoIessFondoReserva;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoIessFondoReserva;
	protected JButton jButtonCerrarToolBarProcesoIessFondoReserva;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoIessFondoReserva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoIessFondoReserva;
	protected JMenuItem jMenuItemModificarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemActualizarProcesoIessFondoReserva;
    protected JMenuItem jMenuItemEliminarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemCancelarProcesoIessFondoReserva;
    protected JMenuItem jMenuItemGuardarCambiosProcesoIessFondoReserva;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoIessFondoReserva;
	protected JMenuItem jMenuItemCerrarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemDetalleCerrarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoIessFondoReserva;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoIessFondoReserva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva;
	protected JMenuItem jMenuItemMostrarOcultarProcesoIessFondoReserva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoIessFondoReserva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoIessFondoReserva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoIessFondoReserva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoIessFondoReserva;
	public JLabel jLabelIdProcesoIessFondoReserva;
	public JLabel jLabelidProcesoIessFondoReserva;
	public JButton jButtonidProcesoIessFondoReservaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesoIessFondoReserva;
	public JLabel jLabelid_anioProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesoIessFondoReserva;
	public JButton jButtonid_anioProcesoIessFondoReserva= new JButtonMe();
	public JButton jButtonid_anioProcesoIessFondoReservaUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesoIessFondoReservaBusqueda= new JButtonMe();

	public JPanel jPanelid_numero_patronalProcesoIessFondoReserva;
	public JLabel jLabelid_numero_patronalProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalProcesoIessFondoReserva;
	public JButton jButtonid_numero_patronalProcesoIessFondoReserva= new JButtonMe();
	public JButton jButtonid_numero_patronalProcesoIessFondoReservaUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalProcesoIessFondoReservaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoIessFondoReserva;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoIessFondoReservaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoIessFondoReserva=new JPanel();
				this.jPanelAccionesFormularioProcesoIessFondoReserva=new JPanel();
				this.jmenuBarDetalleProcesoIessFondoReserva=new JMenuBar();
				this.jTtoolBarDetalleProcesoIessFondoReserva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoIessFondoReservaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoIessFondoReserva() {
		return this.jButtonActualizarToolBarProcesoIessFondoReserva;
	}
	
	public JButton getjButtonEliminarToolBarProcesoIessFondoReserva() {
		return this.jButtonEliminarToolBarProcesoIessFondoReserva;
	}
	
	public JButton getjButtonCancelarToolBarProcesoIessFondoReserva() {
		return this.jButtonCancelarToolBarProcesoIessFondoReserva;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoIessFondoReserva() {
		return this.jButtonProcesarInformacionProcesoIessFondoReserva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoIessFondoReserva)	{
		this.jButtonProcesarInformacionProcesoIessFondoReserva = jButtonProcesarInformacionProcesoIessFondoReserva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoIessFondoReserva() {
		return this.jComboBoxTiposAccionesProcesoIessFondoReserva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoIessFondoReserva(
			JComboBox jComboBoxTiposRelacionesProcesoIessFondoReserva) {
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva = jComboBoxTiposRelacionesProcesoIessFondoReserva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoIessFondoReserva(
			JComboBox jComboBoxTiposAccionesProcesoIessFondoReserva) {
		this.jComboBoxTiposAccionesProcesoIessFondoReserva = jComboBoxTiposAccionesProcesoIessFondoReserva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoIessFondoReserva() {
		return this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoIessFondoReserva(
			JComboBox jComboBoxTiposAccionesFormularioProcesoIessFondoReserva) {
		this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva = jComboBoxTiposAccionesFormularioProcesoIessFondoReserva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean();
		
		this.procesoiessfondoreservaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessfondoreservaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoIessFondoReservaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoIessFondoReservaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoIessFondoReservaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Iess Fondo Reserva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoIessFondoReservaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoIessFondoReserva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoIessFondoReserva=new JButtonMe();
				this.jButtonModificarToolBarProcesoIessFondoReserva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoIessFondoReserva,this.jTtoolBarDetalleProcesoIessFondoReserva,
							"actualizar","actualizar","Actualizar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoIessFondoReserva,this.jTtoolBarDetalleProcesoIessFondoReserva,
							"eliminar","eliminar","Eliminar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoIessFondoReserva,this.jTtoolBarDetalleProcesoIessFondoReserva,
							"cancelar","cancelar","Cancelar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoIessFondoReserva,this.jTtoolBarDetalleProcesoIessFondoReserva,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoIessFondoReserva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoIessFondoReserva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoIessFondoReserva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoIessFondoReserva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoIessFondoReserva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoIessFondoReserva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoIessFondoReserva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoIessFondoReserva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoIessFondoReserva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoIessFondoReserva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoIessFondoReserva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoIessFondoReserva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoIessFondoReserva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoIessFondoReserva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoIessFondoReserva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoIessFondoReserva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoIessFondoReserva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoIessFondoReserva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoIessFondoReserva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoIessFondoReserva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReserva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoIessFondoReserva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoIessFondoReserva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoIessFondoReserva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoIessFondoReserva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoIessFondoReserva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoIessFondoReserva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoIessFondoReserva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoIessFondoReserva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoIessFondoReserva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoIessFondoReserva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoIessFondoReserva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoIessFondoReserva.add(this.jMenuItemDetalleCerrarProcesoIessFondoReserva);
		
		this.jmenuDetalleAccionesProcesoIessFondoReserva.add(this.jMenuItemActualizarProcesoIessFondoReserva);
		this.jmenuDetalleAccionesProcesoIessFondoReserva.add(this.jMenuItemEliminarProcesoIessFondoReserva);
		this.jmenuDetalleAccionesProcesoIessFondoReserva.add(this.jMenuItemCancelarProcesoIessFondoReserva);		
		
		//this.jmenuDetalleDatosProcesoIessFondoReserva.add(this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva);				
		this.jmenuDetalleDatosProcesoIessFondoReserva.add(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva);				
				
		//this.jmenuDetalleAccionesProcesoIessFondoReserva.add(this.jMenuItemGuardarCambiosProcesoIessFondoReserva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoIessFondoReserva.add(this.jmenuDetalleArchivoProcesoIessFondoReserva);		
		this.jmenuBarDetalleProcesoIessFondoReserva.add(this.jmenuDetalleAccionesProcesoIessFondoReserva);		
		this.jmenuBarDetalleProcesoIessFondoReserva.add(this.jmenuDetalleDatosProcesoIessFondoReserva);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoIessFondoReserva);				
	}
	
	
	public void inicializarElementosCamposProcesoIessFondoReserva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoIessFondoReserva = new JLabelMe();
		jLabelIdProcesoIessFondoReserva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoIessFondoReserva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoIessFondoReserva.setToolTipText(ProcesoIessFondoReservaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoIessFondoReserva= new GridBagLayout();

		this.jPanelidProcesoIessFondoReserva.setLayout(this.gridaBagLayoutProcesoIessFondoReserva);

		jLabelidProcesoIessFondoReserva = new JLabel();
		jLabelidProcesoIessFondoReserva.setText("Id");

		jLabelidProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoIessFondoReserva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesoIessFondoReserva = new JLabelMe();
		this.jLabelid_anioProcesoIessFondoReserva.setText(""+ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesoIessFondoReserva.setToolTipText("Anio");
		this.jLabelid_anioProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesoIessFondoReserva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesoIessFondoReserva.setToolTipText(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesoIessFondoReserva = new GridBagLayout();
		this.jPanelid_anioProcesoIessFondoReserva.setLayout(this.gridaBagLayoutProcesoIessFondoReserva);


		jComboBoxid_anioProcesoIessFondoReserva= new JComboBoxMe();
		jComboBoxid_anioProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesoIessFondoReserva= new JButtonMe();
		this.jButtonid_anioProcesoIessFondoReserva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessFondoReserva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessFondoReserva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessFondoReserva.setText("Procesar");
		this.jButtonid_anioProcesoIessFondoReserva.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesoIessFondoReserva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessFondoReserva,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessFondoReserva"));

		this.jButtonid_anioProcesoIessFondoReservaBusqueda= new JButtonMe();
		this.jButtonid_anioProcesoIessFondoReservaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoIessFondoReservaBusqueda.setText("U");
		this.jButtonid_anioProcesoIessFondoReservaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesoIessFondoReservaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessFondoReservaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessFondoReservaBusqueda"));

		if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesoIessFondoReservaBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesoIessFondoReservaUpdate= new JButtonMe();
		this.jButtonid_anioProcesoIessFondoReservaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoIessFondoReservaUpdate.setText("U");
		this.jButtonid_anioProcesoIessFondoReservaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesoIessFondoReservaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessFondoReservaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessFondoReservaUpdate"));



					
		this.jLabelid_numero_patronalProcesoIessFondoReserva = new JLabelMe();
		this.jLabelid_numero_patronalProcesoIessFondoReserva.setText(""+ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL+" : *");
		this.jLabelid_numero_patronalProcesoIessFondoReserva.setToolTipText("Numero Patronal");
		this.jLabelid_numero_patronalProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_numero_patronalProcesoIessFondoReserva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_numero_patronalProcesoIessFondoReserva.setToolTipText(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		this.gridaBagLayoutProcesoIessFondoReserva = new GridBagLayout();
		this.jPanelid_numero_patronalProcesoIessFondoReserva.setLayout(this.gridaBagLayoutProcesoIessFondoReserva);


		jComboBoxid_numero_patronalProcesoIessFondoReserva= new JComboBoxMe();
		jComboBoxid_numero_patronalProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_numero_patronalProcesoIessFondoReserva= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessFondoReserva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessFondoReserva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessFondoReserva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessFondoReserva.setText("Procesar");
		this.jButtonid_numero_patronalProcesoIessFondoReserva.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_numero_patronalProcesoIessFondoReserva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessFondoReserva,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_numero_patronalProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessFondoReserva"));

		this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.setText("U");
		this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_numero_patronalProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessFondoReservaBusqueda"));

		if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.setVisible(false);		}

		this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.setText("U");
		this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessFondoReservaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_numero_patronalProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessFondoReservaUpdate"));



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
		//this.jInternalFrameDetalleProcesoIessFondoReserva = new ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Iess Fondo Reserva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoIessFondoReserva= new GridBagLayout();
		

		
		String sToolTipProcesoIessFondoReserva="";
		sToolTipProcesoIessFondoReserva=ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoIessFondoReserva+="(Nomina.ProcesoIessFondoReserva)";
		}
		
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoIessFondoReserva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoIessFondoReserva = new JButtonMe();
		this.jButtonModificarProcesoIessFondoReserva = new JButtonMe();
        this.jButtonActualizarProcesoIessFondoReserva = new JButtonMe();
        this.jButtonEliminarProcesoIessFondoReserva = new JButtonMe();
        this.jButtonCancelarProcesoIessFondoReserva = new JButtonMe();
        this.jButtonGuardarCambiosProcesoIessFondoReserva = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva = new JButtonMe();
		this.jButtonCerrarProcesoIessFondoReserva = new JButtonMe();
		
		this.jScrollPanelDatosProcesoIessFondoReserva = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoIessFondoReserva = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoIessFondoReserva = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Iess Fondo Reserva";
		
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reservas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoIessFondoReserva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoIessFondoReserva.setName("jPanelCamposProcesoIessFondoReserva"); 

		this.jPanelCamposOcultosProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoIessFondoReserva.setName("jPanelCamposOcultosProcesoIessFondoReserva"); 

        this.jPanelAccionesProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoIessFondoReserva.setToolTipText("Acciones");
        this.jPanelAccionesProcesoIessFondoReserva.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoIessFondoReserva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoIessFondoReserva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoIessFondoReserva.setText("Nuevo");
		this.jButtonModificarProcesoIessFondoReserva.setText("Editar");
        this.jButtonActualizarProcesoIessFondoReserva.setText("Actualizar");
        this.jButtonEliminarProcesoIessFondoReserva.setText("Eliminar");
        this.jButtonCancelarProcesoIessFondoReserva.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoIessFondoReserva.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.setText("Guardar");
		this.jButtonCerrarProcesoIessFondoReserva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoIessFondoReserva,"nuevo_button","Nuevo",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoIessFondoReserva,"modificar_button","Editar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoIessFondoReserva,"actualizar_button","Actualizar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoIessFondoReserva,"eliminar_button","Eliminar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoIessFondoReserva,"cancelar_button","Cancelar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoIessFondoReserva,"guardarcambios_button","Guardar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoIessFondoReserva,"guardarcambiostabla_button","Guardar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoIessFondoReserva,"cerrar_button","Salir",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoIessFondoReserva.setToolTipText("Nuevo"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoIessFondoReserva.setToolTipText("Editar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoIessFondoReserva.setToolTipText("Actualizar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoIessFondoReserva.setToolTipText("Eliminar)"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoIessFondoReserva.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoIessFondoReserva.setToolTipText("Guardar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.setToolTipText("Guardar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoIessFondoReserva.setToolTipText("Salir"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoIessFondoReserva";
		inputMap = this.jButtonNuevoProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoIessFondoReserva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoIessFondoReserva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoIessFondoReserva";
		inputMap = this.jButtonActualizarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoIessFondoReserva"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoIessFondoReserva";
		inputMap = this.jButtonEliminarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoIessFondoReserva"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoIessFondoReserva";
		inputMap = this.jButtonCancelarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoIessFondoReserva"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoIessFondoReserva";
		inputMap = this.jButtonCerrarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoIessFondoReserva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoIessFondoReserva";
		inputMap = this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoIessFondoReserva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoIessFondoReserva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoIessFondoReserva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoIessFondoReserva.setToolTipText("Nuevo ProcesoIessFondoReserva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReserva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReserva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReserva.setToolTipText("Sin Cerrar Ventana ProcesoIessFondoReserva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReserva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReserva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReserva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoIessFondoReserva.setText("Accion");
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoIessFondoReserva = new JLabelMe();
		
		this.jLabelAccionesProcesoIessFondoReserva.setText("Acciones");		
		this.jLabelAccionesProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoIessFondoReserva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoIessFondoReserva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoIessFondoReserva=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoIessFondoReserva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoIessFondoReserva = new GridBagLayout();
		
		this.jPanelCamposProcesoIessFondoReserva.setLayout(gridaBagLayoutCamposProcesoIessFondoReserva);
		this.jPanelCamposOcultosProcesoIessFondoReserva.setLayout(gridaBagLayoutCamposOcultosProcesoIessFondoReserva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoIessFondoReserva.add(jLabelIdProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);



	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoIessFondoReserva.add(jLabelidProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);


	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesoIessFondoReserva.add(jLabelid_anioProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 2;
		this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoIessFondoReserva.add(jButtonid_anioProcesoIessFondoReservaBusqueda, this.gridBagConstraintsProcesoIessFondoReserva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 3;
		this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoIessFondoReserva.add(jButtonid_anioProcesoIessFondoReservaUpdate, this.gridBagConstraintsProcesoIessFondoReserva);
	}

	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesoIessFondoReserva.add(jComboBoxid_anioProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);


	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_numero_patronalProcesoIessFondoReserva.add(jLabelid_numero_patronalProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 2;
		this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalProcesoIessFondoReserva.add(jButtonid_numero_patronalProcesoIessFondoReservaBusqueda, this.gridBagConstraintsProcesoIessFondoReserva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 3;
		this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalProcesoIessFondoReserva.add(jButtonid_numero_patronalProcesoIessFondoReservaUpdate, this.gridBagConstraintsProcesoIessFondoReserva);
	}

	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_numero_patronalProcesoIessFondoReserva.add(jComboBoxid_numero_patronalProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = iYPanelCamposProcesoIessFondoReserva;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = iXPanelCamposProcesoIessFondoReserva++;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReserva.add(this.jPanelidProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);



	if(iXPanelCamposProcesoIessFondoReserva % 1==0) {
		iXPanelCamposProcesoIessFondoReserva=0;
		iYPanelCamposProcesoIessFondoReserva++;
	}
	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = iYPanelCamposProcesoIessFondoReserva;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = iXPanelCamposProcesoIessFondoReserva++;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReserva.add(this.jPanelid_anioProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);



	if(iXPanelCamposProcesoIessFondoReserva % 1==0) {
		iXPanelCamposProcesoIessFondoReserva=0;
		iYPanelCamposProcesoIessFondoReserva++;
	}
	this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReserva.gridy = iYPanelCamposProcesoIessFondoReserva;
	this.gridBagConstraintsProcesoIessFondoReserva.gridx = iXPanelCamposProcesoIessFondoReserva++;
	this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReserva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReserva.add(this.jPanelid_numero_patronalProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);



	if(iXPanelCamposProcesoIessFondoReserva % 1==0) {
		iXPanelCamposProcesoIessFondoReserva=0;
		iYPanelCamposProcesoIessFondoReserva++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoIessFondoReserva= new GridBagLayout();
		this.jPanelAccionesProcesoIessFondoReserva.setLayout(gridaBagLayoutAccionesProcesoIessFondoReserva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoIessFondoReserva= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoIessFondoReserva.setLayout(gridaBagLayoutAccionesFormularioProcesoIessFondoReserva);
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoIessFondoReserva.add(this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoIessFondoReserva.add(this.jButtonModificarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);							

		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoIessFondoReserva.add(this.jButtonEliminarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
			
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoIessFondoReserva.add(this.jButtonActualizarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);


		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoIessFondoReserva.add(this.jButtonGuardarCambiosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);	
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoIessFondoReserva.add(this.jButtonCancelarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoIessFondoReserva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoIessFondoReserva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();						
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;		
			//this.gridBagConstraintsProcesoIessFondoReserva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =0;
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoIessFondoReserva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoIessFondoReserva = new ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Iess Fondo Reserva DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Iess Fondo Reserva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Iess Fondo Reserva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoIessFondoReservaModel procesoiessfondoreservaModel=new ProcesoIessFondoReservaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoIessFondoReservaModel.ProcesoIessFondoReservaFocusTraversalPolicy procesoiessfondoreservaFocusTraversalPolicy = procesoiessfondoreservaModel.new ProcesoIessFondoReservaFocusTraversalPolicy(this);
			
			//procesoiessfondoreservaFocusTraversalPolicy.setprocesoiessfondoreservaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesoiessfondoreservaModel);
			
			
			this.jContentPaneDetalleProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoIessFondoReserva = new GridBagLayout();	
			this.jContentPaneDetalleProcesoIessFondoReserva.setLayout(gridaBagLayoutDetalleProcesoIessFondoReserva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoIessFondoReserva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
				this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoIessFondoReserva.add(jTtoolBarDetalleProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva=   new JScrollPane(jContentPaneDetalleProcesoIessFondoReserva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
	        
			this.jContentPaneDetalleProcesoIessFondoReserva.add(jPanelCamposProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);
			
			
			
			
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
						//&& procesoiessfondoreservaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoIessFondoReserva= new GridBagConstraints();
						this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
						this.jContentPaneDetalleProcesoIessFondoReserva.add(this.jTabbedPaneRelacionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoIessFondoReserva.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoIessFondoReserva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
					this.gridBagConstraintsProcesoIessFondoReserva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoIessFondoReserva.add(jPanelCamposOcultosProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);
				
					this.jPanelCamposOcultosProcesoIessFondoReserva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
	        this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoIessFondoReserva.add(this.jPanelAccionesFormularioProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);							
			
			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
	        this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoIessFondoReserva.add(this.jPanelAccionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoIessFondoReserva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva=   new JScrollPane(this.jPanelCamposProcesoIessFondoReserva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoIessFondoReserva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			
			
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
			
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoIessFondoReserva.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoIessFondoReserva.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoIessFondoReserva;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoIessFondoReserva;
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

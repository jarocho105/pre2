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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.VigenciaFueConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class VigenciaFueDetalleFormJInternalFrame extends VigenciaFueBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVigenciaFue;
	
	protected JMenuBar jmenuBarDetalleVigenciaFue;
	
	protected JMenu jmenuDetalleVigenciaFue;
	protected JMenu jmenuDetalleArchivoVigenciaFue;
	protected JMenu jmenuDetalleAccionesVigenciaFue;
	protected JMenu jmenuDetalleDatosVigenciaFue;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVigenciaFue;	
	protected GridBagConstraints gridBagConstraintsVigenciaFue;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VigenciaFueBeanSwingJInternalFrameAdditional jInternalFrameDetalleVigenciaFue;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public VigenciaFueSessionBean vigenciafueSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public VigenciaFueLogic vigenciafueLogic;
	
	public JScrollPane jScrollPanelDatosVigenciaFue;
	public JScrollPane jScrollPanelDatosEdicionVigenciaFue;
	public JScrollPane jScrollPanelDatosGeneralVigenciaFue;
	
	protected JPanel jPanelCamposVigenciaFue;    
	protected JPanel jPanelCamposOcultosVigenciaFue;    	
	protected JPanel jPanelAccionesVigenciaFue;
	protected JPanel jPanelAccionesFormularioVigenciaFue;
    
	
	
	protected Integer iXPanelCamposVigenciaFue=0;
	protected Integer iYPanelCamposVigenciaFue=0;
	
	protected Integer iXPanelCamposOcultosVigenciaFue=0;
	protected Integer iYPanelCamposOcultosVigenciaFue=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVigenciaFue;
	public JButton jButtonModificarVigenciaFue;
	public JButton jButtonActualizarVigenciaFue;
    public JButton jButtonEliminarVigenciaFue;
	public JButton jButtonCancelarVigenciaFue;
    public JButton jButtonGuardarCambiosVigenciaFue;
	public JButton jButtonGuardarCambiosTablaVigenciaFue;
	protected JButton jButtonCerrarVigenciaFue;
	
	
	protected JButton jButtonProcesarInformacionVigenciaFue;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVigenciaFue;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVigenciaFue;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVigenciaFue;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVigenciaFue;
	protected JButton jButtonModificarToolBarVigenciaFue;
	protected JButton jButtonActualizarToolBarVigenciaFue;
    protected JButton jButtonEliminarToolBarVigenciaFue;
	protected JButton jButtonCancelarToolBarVigenciaFue;
    protected JButton jButtonGuardarCambiosToolBarVigenciaFue;
	protected JButton jButtonGuardarCambiosTablaToolBarVigenciaFue;
	protected JButton jButtonMostrarOcultarTablaToolBarVigenciaFue;
	protected JButton jButtonCerrarToolBarVigenciaFue;
	
	protected JButton jButtonProcesarInformacionToolBarVigenciaFue;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVigenciaFue;
	protected JMenuItem jMenuItemModificarVigenciaFue;
	protected JMenuItem jMenuItemActualizarVigenciaFue;
    protected JMenuItem jMenuItemEliminarVigenciaFue;
	protected JMenuItem jMenuItemCancelarVigenciaFue;
    protected JMenuItem jMenuItemGuardarCambiosVigenciaFue;
	protected JMenuItem jMenuItemGuardarCambiosTablaVigenciaFue;
	protected JMenuItem jMenuItemCerrarVigenciaFue;
	protected JMenuItem jMenuItemDetalleCerrarVigenciaFue;
	protected JMenuItem jMenuItemDetalleMostarOcultarVigenciaFue;
	
	protected JMenuItem jMenuItemProcesarInformacionVigenciaFue;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVigenciaFue;
	protected JMenuItem jMenuItemMostrarOcultarVigenciaFue;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVigenciaFue;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVigenciaFue;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVigenciaFue;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVigenciaFue;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVigenciaFue;
	public JLabel jLabelIdVigenciaFue;
	public JLabel jLabelidVigenciaFue;
	public JButton jButtonidVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioVigenciaFue;
	public JLabel jLabelfecha_inicioVigenciaFue;
	//public JFormattedTextField jDateChooserfecha_inicioVigenciaFue;

	public JDateChooser jDateChooserfecha_inicioVigenciaFue;
	public JButton jButtonfecha_inicioVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finVigenciaFue;
	public JLabel jLabelfecha_finVigenciaFue;
	//public JFormattedTextField jDateChooserfecha_finVigenciaFue;

	public JDateChooser jDateChooserfecha_finVigenciaFue;
	public JButton jButtonfecha_finVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelnumero_embarquesVigenciaFue;
	public JLabel jLabelnumero_embarquesVigenciaFue;
	public JTextField jTextFieldnumero_embarquesVigenciaFue;
	public JButton jButtonnumero_embarquesVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelfueVigenciaFue;
	public JLabel jLabelfueVigenciaFue;
	public JTextField jTextFieldfueVigenciaFue;
	public JButton jButtonfueVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultimo_embarqueVigenciaFue;
	public JLabel jLabelfecha_ultimo_embarqueVigenciaFue;
	//public JFormattedTextField jDateChooserfecha_ultimo_embarqueVigenciaFue;

	public JDateChooser jDateChooserfecha_ultimo_embarqueVigenciaFue;
	public JButton jButtonfecha_ultimo_embarqueVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelvalorVigenciaFue;
	public JLabel jLabelvalorVigenciaFue;
	public JTextField jTextFieldvalorVigenciaFue;
	public JButton jButtonvalorVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cajasVigenciaFue;
	public JLabel jLabelnumero_cajasVigenciaFue;
	public JTextField jTextFieldnumero_cajasVigenciaFue;
	public JButton jButtonnumero_cajasVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoVigenciaFue;
	public JLabel jLabelesta_activoVigenciaFue;
	public JCheckBox jCheckBoxesta_activoVigenciaFue;
	public JButton jButtonesta_activoVigenciaFueBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisVigenciaFue;
	public JLabel jLabelid_paisVigenciaFue;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisVigenciaFue;
	public JButton jButtonid_paisVigenciaFue= new JButtonMe();
	public JButton jButtonid_paisVigenciaFueUpdate= new JButtonMe();
	public JButton jButtonid_paisVigenciaFueBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadVigenciaFue;
	public JLabel jLabelid_ciudadVigenciaFue;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadVigenciaFue;
	public JButton jButtonid_ciudadVigenciaFue= new JButtonMe();
	public JButton jButtonid_ciudadVigenciaFueUpdate= new JButtonMe();
	public JButton jButtonid_ciudadVigenciaFueBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVigenciaFue;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VigenciaFueDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVigenciaFue=new JPanel();
				this.jPanelAccionesFormularioVigenciaFue=new JPanel();
				this.jmenuBarDetalleVigenciaFue=new JMenuBar();
				this.jTtoolBarDetalleVigenciaFue=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VigenciaFueDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VigenciaFueDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VigenciaFueDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VigenciaFueDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VigenciaFueDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVigenciaFue() {
		return this.jButtonActualizarToolBarVigenciaFue;
	}
	
	public JButton getjButtonEliminarToolBarVigenciaFue() {
		return this.jButtonEliminarToolBarVigenciaFue;
	}
	
	public JButton getjButtonCancelarToolBarVigenciaFue() {
		return this.jButtonCancelarToolBarVigenciaFue;
	}		
	
	public JButton getjButtonProcesarInformacionVigenciaFue() {
		return this.jButtonProcesarInformacionVigenciaFue;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVigenciaFue)	{
		this.jButtonProcesarInformacionVigenciaFue = jButtonProcesarInformacionVigenciaFue;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVigenciaFue() {
		return this.jComboBoxTiposAccionesVigenciaFue;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVigenciaFue(
			JComboBox jComboBoxTiposRelacionesVigenciaFue) {
		this.jComboBoxTiposRelacionesVigenciaFue = jComboBoxTiposRelacionesVigenciaFue;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVigenciaFue(
			JComboBox jComboBoxTiposAccionesVigenciaFue) {
		this.jComboBoxTiposAccionesVigenciaFue = jComboBoxTiposAccionesVigenciaFue;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVigenciaFue() {
		return this.jComboBoxTiposAccionesFormularioVigenciaFue;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVigenciaFue(
			JComboBox jComboBoxTiposAccionesFormularioVigenciaFue) {
		this.jComboBoxTiposAccionesFormularioVigenciaFue = jComboBoxTiposAccionesFormularioVigenciaFue;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vigenciafueSessionBean=new VigenciaFueSessionBean();
		
		this.vigenciafueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vigenciafueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vigenciafueSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VigenciaFueJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VigenciaFueJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VigenciaFueJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vigencia Fue MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
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
	
		VigenciaFueJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVigenciaFue= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVigenciaFue=new JButtonMe();
				this.jButtonModificarToolBarVigenciaFue=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVigenciaFue,this.jTtoolBarDetalleVigenciaFue,
							"actualizar","actualizar","Actualizar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVigenciaFue,this.jTtoolBarDetalleVigenciaFue,
							"eliminar","eliminar","Eliminar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVigenciaFue,this.jTtoolBarDetalleVigenciaFue,
							"cancelar","cancelar","Cancelar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVigenciaFue,this.jTtoolBarDetalleVigenciaFue,
							"guardarcambios","guardarcambios","Guardar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVigenciaFue=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVigenciaFue=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVigenciaFue=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVigenciaFue=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVigenciaFue=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVigenciaFue= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVigenciaFue.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVigenciaFue,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVigenciaFue= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVigenciaFue.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVigenciaFue,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVigenciaFue= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVigenciaFue.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVigenciaFue,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVigenciaFue= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVigenciaFue.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVigenciaFue,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVigenciaFue= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVigenciaFue.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVigenciaFue,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVigenciaFue= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVigenciaFue.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVigenciaFue,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVigenciaFue= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVigenciaFue.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVigenciaFue,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVigenciaFue= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVigenciaFue.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVigenciaFue,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVigenciaFue= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVigenciaFue.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVigenciaFue,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVigenciaFue= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVigenciaFue.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVigenciaFue,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVigenciaFue.add(this.jMenuItemDetalleCerrarVigenciaFue);
		
		this.jmenuDetalleAccionesVigenciaFue.add(this.jMenuItemActualizarVigenciaFue);
		this.jmenuDetalleAccionesVigenciaFue.add(this.jMenuItemEliminarVigenciaFue);
		this.jmenuDetalleAccionesVigenciaFue.add(this.jMenuItemCancelarVigenciaFue);		
		
		//this.jmenuDetalleDatosVigenciaFue.add(this.jMenuItemDetalleAbrirOrderByVigenciaFue);				
		this.jmenuDetalleDatosVigenciaFue.add(this.jMenuItemDetalleMostarOcultarVigenciaFue);				
				
		//this.jmenuDetalleAccionesVigenciaFue.add(this.jMenuItemGuardarCambiosVigenciaFue);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVigenciaFue.add(this.jmenuDetalleArchivoVigenciaFue);		
		this.jmenuBarDetalleVigenciaFue.add(this.jmenuDetalleAccionesVigenciaFue);		
		this.jmenuBarDetalleVigenciaFue.add(this.jmenuDetalleDatosVigenciaFue);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVigenciaFue);				
	}
	
	
	public void inicializarElementosCamposVigenciaFue() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVigenciaFue = new JLabelMe();
		jLabelIdVigenciaFue.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVigenciaFue = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVigenciaFue= new GridBagLayout();

		this.jPanelidVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);

		jLabelidVigenciaFue = new JLabel();
		jLabelidVigenciaFue.setText("Id");

		jLabelidVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioVigenciaFue = new JLabelMe();
		this.jLabelfecha_inicioVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioVigenciaFue.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelfecha_inicioVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		//jFormattedTextFieldfecha_inicioVigenciaFue= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioVigenciaFue= new JDateChooser();
		jDateChooserfecha_inicioVigenciaFue.setEnabled(false);
		jDateChooserfecha_inicioVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioVigenciaFue.setDate(new Date());
		jDateChooserfecha_inicioVigenciaFue.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioVigenciaFue.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioVigenciaFueBusqueda= new JButtonMe();
		this.jButtonfecha_inicioVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioVigenciaFueBusqueda.setText("U");
		this.jButtonfecha_inicioVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioVigenciaFueBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finVigenciaFue = new JLabelMe();
		this.jLabelfecha_finVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finVigenciaFue.setToolTipText("Fecha Fin");
		this.jLabelfecha_finVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelfecha_finVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		//jFormattedTextFieldfecha_finVigenciaFue= new JFormattedTextFieldMe();

		jDateChooserfecha_finVigenciaFue= new JDateChooser();
		jDateChooserfecha_finVigenciaFue.setEnabled(false);
		jDateChooserfecha_finVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finVigenciaFue.setDate(new Date());
		jDateChooserfecha_finVigenciaFue.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finVigenciaFue.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finVigenciaFueBusqueda= new JButtonMe();
		this.jButtonfecha_finVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finVigenciaFueBusqueda.setText("U");
		this.jButtonfecha_finVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finVigenciaFueBusqueda.setVisible(false);		}


					
		this.jLabelnumero_embarquesVigenciaFue = new JLabelMe();
		this.jLabelnumero_embarquesVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES+" : *");
		this.jLabelnumero_embarquesVigenciaFue.setToolTipText("Numero Embarques");
		this.jLabelnumero_embarquesVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_embarquesVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_embarquesVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_embarquesVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_embarquesVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_embarquesVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelnumero_embarquesVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		jTextFieldnumero_embarquesVigenciaFue= new JTextFieldMe();
		jTextFieldnumero_embarquesVigenciaFue.setEnabled(false);
		jTextFieldnumero_embarquesVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_embarquesVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_embarquesVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_embarquesVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_embarquesVigenciaFue.setText("0");

		this.jButtonnumero_embarquesVigenciaFueBusqueda= new JButtonMe();
		this.jButtonnumero_embarquesVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_embarquesVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_embarquesVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_embarquesVigenciaFueBusqueda.setText("U");
		this.jButtonnumero_embarquesVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_embarquesVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_embarquesVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_embarquesVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_embarquesVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_embarquesVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_embarquesVigenciaFueBusqueda.setVisible(false);		}


					
		this.jLabelfueVigenciaFue = new JLabelMe();
		this.jLabelfueVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_FUE+" : *");
		this.jLabelfueVigenciaFue.setToolTipText("Fue");
		this.jLabelfueVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfueVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfueVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfueVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfueVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfueVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_FUE);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelfueVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		jTextFieldfueVigenciaFue= new JTextFieldMe();

		jTextFieldfueVigenciaFue.setEnabled(false);
		jTextFieldfueVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfueVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfueVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfueVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfueVigenciaFueBusqueda= new JButtonMe();
		this.jButtonfueVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfueVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfueVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfueVigenciaFueBusqueda.setText("U");
		this.jButtonfueVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfueVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfueVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfueVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfueVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fueVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfueVigenciaFueBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultimo_embarqueVigenciaFue = new JLabelMe();
		this.jLabelfecha_ultimo_embarqueVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE+" : *");
		this.jLabelfecha_ultimo_embarqueVigenciaFue.setToolTipText("Fecha Ultimo Embarque");
		this.jLabelfecha_ultimo_embarqueVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_embarqueVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_embarqueVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultimo_embarqueVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultimo_embarqueVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultimo_embarqueVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelfecha_ultimo_embarqueVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		//jFormattedTextFieldfecha_ultimo_embarqueVigenciaFue= new JFormattedTextFieldMe();

		jDateChooserfecha_ultimo_embarqueVigenciaFue= new JDateChooser();
		jDateChooserfecha_ultimo_embarqueVigenciaFue.setEnabled(false);
		jDateChooserfecha_ultimo_embarqueVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_embarqueVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_embarqueVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultimo_embarqueVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultimo_embarqueVigenciaFue.setDate(new Date());
		jDateChooserfecha_ultimo_embarqueVigenciaFue.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_embarqueVigenciaFue.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda= new JButtonMe();
		this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.setText("U");
		this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultimo_embarqueVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultimo_embarqueVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_embarqueVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.setVisible(false);		}


					
		this.jLabelvalorVigenciaFue = new JLabelMe();
		this.jLabelvalorVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorVigenciaFue.setToolTipText("Valor");
		this.jLabelvalorVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelvalorVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		jTextFieldvalorVigenciaFue= new JTextFieldMe();
		jTextFieldvalorVigenciaFue.setEnabled(false);
		jTextFieldvalorVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorVigenciaFue.setText("0.0");

		this.jButtonvalorVigenciaFueBusqueda= new JButtonMe();
		this.jButtonvalorVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorVigenciaFueBusqueda.setText("U");
		this.jButtonvalorVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorVigenciaFueBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cajasVigenciaFue = new JLabelMe();
		this.jLabelnumero_cajasVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS+" : *");
		this.jLabelnumero_cajasVigenciaFue.setToolTipText("Numero Cajas");
		this.jLabelnumero_cajasVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cajasVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cajasVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cajasVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cajasVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cajasVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelnumero_cajasVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		jTextFieldnumero_cajasVigenciaFue= new JTextFieldMe();
		jTextFieldnumero_cajasVigenciaFue.setEnabled(false);
		jTextFieldnumero_cajasVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cajasVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cajasVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cajasVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cajasVigenciaFue.setText("0");

		this.jButtonnumero_cajasVigenciaFueBusqueda= new JButtonMe();
		this.jButtonnumero_cajasVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cajasVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cajasVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cajasVigenciaFueBusqueda.setText("U");
		this.jButtonnumero_cajasVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cajasVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cajasVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cajasVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cajasVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cajasVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cajasVigenciaFueBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoVigenciaFue = new JLabelMe();
		this.jLabelesta_activoVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoVigenciaFue.setToolTipText("Esta Activo");
		this.jLabelesta_activoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelesta_activoVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		jCheckBoxesta_activoVigenciaFue= new JCheckBoxMe();
		jCheckBoxesta_activoVigenciaFue.setEnabled(false);

		jCheckBoxesta_activoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoVigenciaFueBusqueda= new JButtonMe();
		this.jButtonesta_activoVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoVigenciaFueBusqueda.setText("U");
		this.jButtonesta_activoVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoVigenciaFueBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVigenciaFue() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisVigenciaFue = new JLabelMe();
		this.jLabelid_paisVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisVigenciaFue.setToolTipText("Pais");
		this.jLabelid_paisVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelid_paisVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		jComboBoxid_paisVigenciaFue= new JComboBoxMe();
		jComboBoxid_paisVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisVigenciaFue= new JButtonMe();
		this.jButtonid_paisVigenciaFue.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVigenciaFue.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVigenciaFue.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVigenciaFue.setText("Buscar");
		this.jButtonid_paisVigenciaFue.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisVigenciaFue.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVigenciaFue,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVigenciaFue"));

		this.jButtonid_paisVigenciaFueBusqueda= new JButtonMe();
		this.jButtonid_paisVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisVigenciaFueBusqueda.setText("U");
		this.jButtonid_paisVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisVigenciaFueBusqueda.setVisible(false);		}

		this.jButtonid_paisVigenciaFueUpdate= new JButtonMe();
		this.jButtonid_paisVigenciaFueUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVigenciaFueUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVigenciaFueUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisVigenciaFueUpdate.setText("U");
		this.jButtonid_paisVigenciaFueUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisVigenciaFueUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVigenciaFueUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVigenciaFueUpdate"));



					
		this.jLabelid_ciudadVigenciaFue = new JLabelMe();
		this.jLabelid_ciudadVigenciaFue.setText(""+VigenciaFueConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadVigenciaFue.setToolTipText("Ciudad");
		this.jLabelid_ciudadVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadVigenciaFue.setToolTipText(VigenciaFueConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutVigenciaFue = new GridBagLayout();
		this.jPanelid_ciudadVigenciaFue.setLayout(this.gridaBagLayoutVigenciaFue);


		jComboBoxid_ciudadVigenciaFue= new JComboBoxMe();
		jComboBoxid_ciudadVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadVigenciaFue= new JButtonMe();
		this.jButtonid_ciudadVigenciaFue.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadVigenciaFue.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadVigenciaFue.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadVigenciaFue.setText("Buscar");
		this.jButtonid_ciudadVigenciaFue.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadVigenciaFue.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadVigenciaFue,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadVigenciaFue"));

		this.jButtonid_ciudadVigenciaFueBusqueda= new JButtonMe();
		this.jButtonid_ciudadVigenciaFueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVigenciaFueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVigenciaFueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadVigenciaFueBusqueda.setText("U");
		this.jButtonid_ciudadVigenciaFueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadVigenciaFueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadVigenciaFueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadVigenciaFueBusqueda"));

		if(this.vigenciafueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadVigenciaFueBusqueda.setVisible(false);		}

		this.jButtonid_ciudadVigenciaFueUpdate= new JButtonMe();
		this.jButtonid_ciudadVigenciaFueUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVigenciaFueUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVigenciaFueUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadVigenciaFueUpdate.setText("U");
		this.jButtonid_ciudadVigenciaFueUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadVigenciaFueUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadVigenciaFueUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadVigenciaFueUpdate"));



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
		//this.jInternalFrameDetalleVigenciaFue = new VigenciaFueBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vigencia Fue DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVigenciaFue= new GridBagLayout();
		

		
		String sToolTipVigenciaFue="";
		sToolTipVigenciaFue=VigenciaFueConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVigenciaFue+="(Facturacion.VigenciaFue)";
		}
		
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			sToolTipVigenciaFue+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVigenciaFue = new JButtonMe();
		this.jButtonModificarVigenciaFue = new JButtonMe();
        this.jButtonActualizarVigenciaFue = new JButtonMe();
        this.jButtonEliminarVigenciaFue = new JButtonMe();
        this.jButtonCancelarVigenciaFue = new JButtonMe();
        this.jButtonGuardarCambiosVigenciaFue = new JButtonMe();
		this.jButtonGuardarCambiosTablaVigenciaFue = new JButtonMe();
		this.jButtonCerrarVigenciaFue = new JButtonMe();
		
		this.jScrollPanelDatosVigenciaFue = new JScrollPane();   
        this.jScrollPanelDatosEdicionVigenciaFue = new JScrollPane();
		this.jScrollPanelDatosGeneralVigenciaFue = new JScrollPane();
				
		
		
		this.jPanelCamposVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Vigencia Fue";
		
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vigencia Fues" + this.sPath));
		} else {
			this.jScrollPanelDatosVigenciaFue.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVigenciaFue.setName("jPanelCamposVigenciaFue"); 

		this.jPanelCamposOcultosVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVigenciaFue.setName("jPanelCamposOcultosVigenciaFue"); 

        this.jPanelAccionesVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVigenciaFue.setToolTipText("Acciones");
        this.jPanelAccionesVigenciaFue.setName("Acciones"); 

		this.jPanelAccionesFormularioVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVigenciaFue.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVigenciaFue.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVigenciaFue.setText("Nuevo");
		this.jButtonModificarVigenciaFue.setText("Editar");
        this.jButtonActualizarVigenciaFue.setText("Actualizar");
        this.jButtonEliminarVigenciaFue.setText("Eliminar");
        this.jButtonCancelarVigenciaFue.setText("Cancelar");
        this.jButtonGuardarCambiosVigenciaFue.setText("Guardar");
		this.jButtonGuardarCambiosTablaVigenciaFue.setText("Guardar");
		this.jButtonCerrarVigenciaFue.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVigenciaFue,"nuevo_button","Nuevo",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVigenciaFue,"modificar_button","Editar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVigenciaFue,"actualizar_button","Actualizar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVigenciaFue,"eliminar_button","Eliminar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVigenciaFue,"cancelar_button","Cancelar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVigenciaFue,"guardarcambios_button","Guardar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVigenciaFue,"guardarcambiostabla_button","Guardar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVigenciaFue,"cerrar_button","Salir",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVigenciaFue.setToolTipText("Nuevo"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVigenciaFue.setToolTipText("Editar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVigenciaFue.setToolTipText("Actualizar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVigenciaFue.setToolTipText("Eliminar)"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVigenciaFue.setToolTipText("Cancelar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVigenciaFue.setToolTipText("Guardar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVigenciaFue.setToolTipText("Guardar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVigenciaFue.setToolTipText("Salir"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVigenciaFue";
		inputMap = this.jButtonNuevoVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVigenciaFue.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVigenciaFue"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVigenciaFue";
		inputMap = this.jButtonActualizarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVigenciaFue"));
		
		//ELIMINAR
		sMapKey = "EliminarVigenciaFue";
		inputMap = this.jButtonEliminarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVigenciaFue"));
		
		//CANCELAR	
		sMapKey = "CancelarVigenciaFue";
		inputMap = this.jButtonCancelarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVigenciaFue"));
		
		//CERRAR		
		sMapKey = "CerrarVigenciaFue";
		inputMap = this.jButtonCerrarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVigenciaFue"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVigenciaFue";
		inputMap = this.jButtonGuardarCambiosTablaVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVigenciaFue"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVigenciaFue = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVigenciaFue.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVigenciaFue.setToolTipText("Nuevo VigenciaFue");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVigenciaFue = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVigenciaFue.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVigenciaFue.setToolTipText("Sin Cerrar Ventana VigenciaFue");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVigenciaFue = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVigenciaFue.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVigenciaFue.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVigenciaFue.setText("Accion");
		this.jComboBoxTiposAccionesVigenciaFue.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVigenciaFue.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVigenciaFue.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVigenciaFue = new JLabelMe();
		
		this.jLabelAccionesVigenciaFue.setText("Acciones");		
		this.jLabelAccionesVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVigenciaFue();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVigenciaFue();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVigenciaFue=new JTabbedPane();
		this.jTabbedPaneRelacionesVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVigenciaFue,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVigenciaFue.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVigenciaFue.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVigenciaFue.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVigenciaFue.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVigenciaFue.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVigenciaFue.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVigenciaFue = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVigenciaFue = new GridBagLayout();
		
		this.jPanelCamposVigenciaFue.setLayout(gridaBagLayoutCamposVigenciaFue);
		this.jPanelCamposOcultosVigenciaFue.setLayout(gridaBagLayoutCamposOcultosVigenciaFue);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVigenciaFue.add(jLabelIdVigenciaFue, this.gridBagConstraintsVigenciaFue);



	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVigenciaFue.add(jLabelidVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisVigenciaFue.add(jLabelid_paisVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisVigenciaFue.add(jButtonid_paisVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 3;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisVigenciaFue.add(jButtonid_paisVigenciaFueUpdate, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisVigenciaFue.add(jComboBoxid_paisVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadVigenciaFue.add(jLabelid_ciudadVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadVigenciaFue.add(jButtonid_ciudadVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 3;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadVigenciaFue.add(jButtonid_ciudadVigenciaFueUpdate, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadVigenciaFue.add(jComboBoxid_ciudadVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioVigenciaFue.add(jLabelfecha_inicioVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioVigenciaFue.add(jButtonfecha_inicioVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioVigenciaFue.add(jDateChooserfecha_inicioVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finVigenciaFue.add(jLabelfecha_finVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finVigenciaFue.add(jButtonfecha_finVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finVigenciaFue.add(jDateChooserfecha_finVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_embarquesVigenciaFue.add(jLabelnumero_embarquesVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_embarquesVigenciaFue.add(jButtonnumero_embarquesVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_embarquesVigenciaFue.add(jTextFieldnumero_embarquesVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfueVigenciaFue.add(jLabelfueVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelfueVigenciaFue.add(jButtonfueVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfueVigenciaFue.add(jTextFieldfueVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultimo_embarqueVigenciaFue.add(jLabelfecha_ultimo_embarqueVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultimo_embarqueVigenciaFue.add(jButtonfecha_ultimo_embarqueVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultimo_embarqueVigenciaFue.add(jDateChooserfecha_ultimo_embarqueVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorVigenciaFue.add(jLabelvalorVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorVigenciaFue.add(jButtonvalorVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorVigenciaFue.add(jTextFieldvalorVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cajasVigenciaFue.add(jLabelnumero_cajasVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cajasVigenciaFue.add(jButtonnumero_cajasVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cajasVigenciaFue.add(jTextFieldnumero_cajasVigenciaFue, this.gridBagConstraintsVigenciaFue);


	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 0;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoVigenciaFue.add(jLabelesta_activoVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 2;
		this.gridBagConstraintsVigenciaFue.ipadx = 0;
		this.gridBagConstraintsVigenciaFue.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoVigenciaFue.add(jButtonesta_activoVigenciaFueBusqueda, this.gridBagConstraintsVigenciaFue);
	}

	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVigenciaFue.gridy = 0;
	this.gridBagConstraintsVigenciaFue.gridx = 1;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoVigenciaFue.add(jCheckBoxesta_activoVigenciaFue, this.gridBagConstraintsVigenciaFue);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelidVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelid_paisVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelid_ciudadVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelfecha_inicioVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelfecha_finVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelnumero_embarquesVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelfueVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelfecha_ultimo_embarqueVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelvalorVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelnumero_cajasVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
	}
	this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVigenciaFue.gridy = iYPanelCamposVigenciaFue;
	this.gridBagConstraintsVigenciaFue.gridx = iXPanelCamposVigenciaFue++;
	this.gridBagConstraintsVigenciaFue.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVigenciaFue.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVigenciaFue.add(this.jPanelesta_activoVigenciaFue, this.gridBagConstraintsVigenciaFue);



	if(iXPanelCamposVigenciaFue % 1==0) {
		iXPanelCamposVigenciaFue=0;
		iYPanelCamposVigenciaFue++;
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
			
		GridBagLayout gridaBagLayoutAccionesVigenciaFue= new GridBagLayout();
		this.jPanelAccionesVigenciaFue.setLayout(gridaBagLayoutAccionesVigenciaFue);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVigenciaFue= new GridBagLayout();
		this.jPanelAccionesFormularioVigenciaFue.setLayout(gridaBagLayoutAccionesFormularioVigenciaFue);
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVigenciaFue.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVigenciaFue.add(this.jComboBoxTiposAccionesFormularioVigenciaFue, this.gridBagConstraintsVigenciaFue);

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVigenciaFue.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVigenciaFue.add(this.jCheckBoxPostAccionNuevoVigenciaFue, this.gridBagConstraintsVigenciaFue);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vigenciafueSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVigenciaFue.add(this.jCheckBoxPostAccionSinCerrarVigenciaFue, this.gridBagConstraintsVigenciaFue);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vigenciafueSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVigenciaFue.add(this.jCheckBoxPostAccionSinMensajeVigenciaFue, this.gridBagConstraintsVigenciaFue);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXAccion++;
			
		this.jPanelAccionesVigenciaFue.add(this.jButtonModificarVigenciaFue, this.gridBagConstraintsVigenciaFue);							

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx =iPosXAccion++;
			
		this.jPanelAccionesVigenciaFue.add(this.jButtonEliminarVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
			
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = 0;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXAccion++;
		
		this.jPanelAccionesVigenciaFue.add(this.jButtonActualizarVigenciaFue, this.gridBagConstraintsVigenciaFue);


		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = 0;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXAccion++;
		
		this.jPanelAccionesVigenciaFue.add(this.jButtonGuardarCambiosVigenciaFue, this.gridBagConstraintsVigenciaFue);	
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = 0;		
		this.gridBagConstraintsVigenciaFue.gridx =iPosXAccion++;
		
		this.jPanelAccionesVigenciaFue.add(this.jButtonCancelarVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVigenciaFue = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVigenciaFue);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();						
			this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVigenciaFue.gridx = 0;		
			//this.gridBagConstraintsVigenciaFue.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVigenciaFue.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVigenciaFue.gridx =0;
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVigenciaFue.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVigenciaFue, this.gridBagConstraintsVigenciaFue);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVigenciaFue = new VigenciaFueBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vigencia Fue DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vigencia Fue DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vigencia Fue Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VigenciaFueModel vigenciafueModel=new VigenciaFueModel(this);
			
			//SI USARA CLASE INTERNA
			//VigenciaFueModel.VigenciaFueFocusTraversalPolicy vigenciafueFocusTraversalPolicy = vigenciafueModel.new VigenciaFueFocusTraversalPolicy(this);
			
			//vigenciafueFocusTraversalPolicy.setvigenciafueJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vigenciafueModel);
			
			
			this.jContentPaneDetalleVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVigenciaFue = new GridBagLayout();	
			this.jContentPaneDetalleVigenciaFue.setLayout(gridaBagLayoutDetalleVigenciaFue);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVigenciaFue = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
				this.gridBagConstraintsVigenciaFue.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVigenciaFue.gridx = 0;
					
				
				this.jContentPaneDetalleVigenciaFue.add(jTtoolBarDetalleVigenciaFue, gridBagConstraintsVigenciaFue);								
				
}
			
			this.jScrollPanelDatosEdicionVigenciaFue=   new JScrollPane(jContentPaneDetalleVigenciaFue,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVigenciaFue.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVigenciaFue.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVigenciaFue.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVigenciaFue=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVigenciaFue.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVigenciaFue.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVigenciaFue.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVigenciaFue.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVigenciaFue.gridx = 0;
	        
			this.jContentPaneDetalleVigenciaFue.add(jPanelCamposVigenciaFue, gridBagConstraintsVigenciaFue);
			
			
			
			
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
						&& vigenciafueSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVigenciaFue= new GridBagConstraints();
						this.gridBagConstraintsVigenciaFue.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVigenciaFue.gridx = 0;
						this.jContentPaneDetalleVigenciaFue.add(this.jTabbedPaneRelacionesVigenciaFue, this.gridBagConstraintsVigenciaFue);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVigenciaFue.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVigenciaFue.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
					this.gridBagConstraintsVigenciaFue.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVigenciaFue.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVigenciaFue.gridx = 0;
					
				
					this.jContentPaneDetalleVigenciaFue.add(jPanelCamposOcultosVigenciaFue, gridBagConstraintsVigenciaFue);
				
					this.jPanelCamposOcultosVigenciaFue.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVigenciaFue.gridx = 0;
	        this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVigenciaFue.add(this.jPanelAccionesFormularioVigenciaFue, this.gridBagConstraintsVigenciaFue);							
			
			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
	        this.gridBagConstraintsVigenciaFue.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVigenciaFue.gridx = 0;
	        
			
			this.jContentPaneDetalleVigenciaFue.add(this.jPanelAccionesVigenciaFue, this.gridBagConstraintsVigenciaFue);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVigenciaFue);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVigenciaFue=   new JScrollPane(this.jPanelCamposVigenciaFue,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVigenciaFue.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVigenciaFue.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVigenciaFue.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVigenciaFue.gridx = 0;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVigenciaFue.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVigenciaFue, this.gridBagConstraintsVigenciaFue);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVigenciaFue.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVigenciaFue, this.gridBagConstraintsVigenciaFue);			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVigenciaFue.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVigenciaFue, this.gridBagConstraintsVigenciaFue);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVigenciaFue, this.gridBagConstraintsVigenciaFue);
			
			
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
			
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVigenciaFue, this.gridBagConstraintsVigenciaFue);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVigenciaFue;//jContentPane;
		
		return jScrollPanelDatosEdicionVigenciaFue;
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

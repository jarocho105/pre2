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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.CajerosConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class CajerosDetalleFormJInternalFrame extends CajerosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajeros;
	
	protected JMenuBar jmenuBarDetalleCajeros;
	
	protected JMenu jmenuDetalleCajeros;
	protected JMenu jmenuDetalleArchivoCajeros;
	protected JMenu jmenuDetalleAccionesCajeros;
	protected JMenu jmenuDetalleDatosCajeros;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajeros;	
	protected GridBagConstraints gridBagConstraintsCajeros;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajerosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajeros;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public CajerosSessionBean cajerosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CajaSessionBean cajaSessionBean;	
	
	public CajerosLogic cajerosLogic;
	
	public JScrollPane jScrollPanelDatosCajeros;
	public JScrollPane jScrollPanelDatosEdicionCajeros;
	public JScrollPane jScrollPanelDatosGeneralCajeros;
	
	protected JPanel jPanelCamposCajeros;    
	protected JPanel jPanelCamposOcultosCajeros;    	
	protected JPanel jPanelAccionesCajeros;
	protected JPanel jPanelAccionesFormularioCajeros;
    
	
	
	protected Integer iXPanelCamposCajeros=0;
	protected Integer iYPanelCamposCajeros=0;
	
	protected Integer iXPanelCamposOcultosCajeros=0;
	protected Integer iYPanelCamposOcultosCajeros=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajeros;
	public JButton jButtonModificarCajeros;
	public JButton jButtonActualizarCajeros;
    public JButton jButtonEliminarCajeros;
	public JButton jButtonCancelarCajeros;
    public JButton jButtonGuardarCambiosCajeros;
	public JButton jButtonGuardarCambiosTablaCajeros;
	protected JButton jButtonCerrarCajeros;
	
	
	protected JButton jButtonProcesarInformacionCajeros;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajeros;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajeros;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajeros;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajeros;
	protected JButton jButtonModificarToolBarCajeros;
	protected JButton jButtonActualizarToolBarCajeros;
    protected JButton jButtonEliminarToolBarCajeros;
	protected JButton jButtonCancelarToolBarCajeros;
    protected JButton jButtonGuardarCambiosToolBarCajeros;
	protected JButton jButtonGuardarCambiosTablaToolBarCajeros;
	protected JButton jButtonMostrarOcultarTablaToolBarCajeros;
	protected JButton jButtonCerrarToolBarCajeros;
	
	protected JButton jButtonProcesarInformacionToolBarCajeros;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajeros;
	protected JMenuItem jMenuItemModificarCajeros;
	protected JMenuItem jMenuItemActualizarCajeros;
    protected JMenuItem jMenuItemEliminarCajeros;
	protected JMenuItem jMenuItemCancelarCajeros;
    protected JMenuItem jMenuItemGuardarCambiosCajeros;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajeros;
	protected JMenuItem jMenuItemCerrarCajeros;
	protected JMenuItem jMenuItemDetalleCerrarCajeros;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajeros;
	
	protected JMenuItem jMenuItemProcesarInformacionCajeros;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajeros;
	protected JMenuItem jMenuItemMostrarOcultarCajeros;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajeros;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajeros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajeros;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajeros;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajeros;
	public JLabel jLabelIdCajeros;
	public JLabel jLabelidCajeros;
	public JButton jButtonidCajerosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioCajeros;
	public JLabel jLabelfecha_inicioCajeros;
	//public JFormattedTextField jDateChooserfecha_inicioCajeros;

	public JDateChooser jDateChooserfecha_inicioCajeros;
	public JButton jButtonfecha_inicioCajerosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finCajeros;
	public JLabel jLabelfecha_finCajeros;
	//public JFormattedTextField jDateChooserfecha_finCajeros;

	public JDateChooser jDateChooserfecha_finCajeros;
	public JButton jButtonfecha_finCajerosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cajaCajeros;
	public JLabel jLabelnombre_cajaCajeros;
	public JTextArea jTextAreanombre_cajaCajeros;
	public JScrollPane jscrollPanenombre_cajaCajeros;
	public JButton jButtonnombre_cajaCajerosBusqueda= new JButtonMe();

	public JPanel jPanelfechaCajeros;
	public JLabel jLabelfechaCajeros;
	//public JFormattedTextField jDateChooserfechaCajeros;

	public JDateChooser jDateChooserfechaCajeros;
	public JButton jButtonfechaCajerosBusqueda= new JButtonMe();

	public JPanel jPaneltotalCajeros;
	public JLabel jLabeltotalCajeros;
	public JTextField jTextFieldtotalCajeros;
	public JButton jButtontotalCajerosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCajeros;
	public JLabel jLabelid_empresaCajeros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajeros;
	public JButton jButtonid_empresaCajeros= new JButtonMe();
	public JButton jButtonid_empresaCajerosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajerosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCajeros;
	public JLabel jLabelid_sucursalCajeros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCajeros;
	public JButton jButtonid_sucursalCajeros= new JButtonMe();
	public JButton jButtonid_sucursalCajerosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajerosBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaCajeros;
	public JLabel jLabelid_cajaCajeros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaCajeros;
	public JButton jButtonid_cajaCajeros= new JButtonMe();
	public JButton jButtonid_cajaCajerosUpdate= new JButtonMe();
	public JButton jButtonid_cajaCajerosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajeros;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CajerosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajeros=new JPanel();
				this.jPanelAccionesFormularioCajeros=new JPanel();
				this.jmenuBarDetalleCajeros=new JMenuBar();
				this.jTtoolBarDetalleCajeros=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajerosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajerosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajerosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajerosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajerosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajeros() {
		return this.jButtonActualizarToolBarCajeros;
	}
	
	public JButton getjButtonEliminarToolBarCajeros() {
		return this.jButtonEliminarToolBarCajeros;
	}
	
	public JButton getjButtonCancelarToolBarCajeros() {
		return this.jButtonCancelarToolBarCajeros;
	}		
	
	public JButton getjButtonProcesarInformacionCajeros() {
		return this.jButtonProcesarInformacionCajeros;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajeros)	{
		this.jButtonProcesarInformacionCajeros = jButtonProcesarInformacionCajeros;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajeros() {
		return this.jComboBoxTiposAccionesCajeros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajeros(
			JComboBox jComboBoxTiposRelacionesCajeros) {
		this.jComboBoxTiposRelacionesCajeros = jComboBoxTiposRelacionesCajeros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajeros(
			JComboBox jComboBoxTiposAccionesCajeros) {
		this.jComboBoxTiposAccionesCajeros = jComboBoxTiposAccionesCajeros;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajeros() {
		return this.jComboBoxTiposAccionesFormularioCajeros;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajeros(
			JComboBox jComboBoxTiposAccionesFormularioCajeros) {
		this.jComboBoxTiposAccionesFormularioCajeros = jComboBoxTiposAccionesFormularioCajeros;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajerosSessionBean=new CajerosSessionBean();
		
		this.cajerosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajerosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajerosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajerosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajerosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajerosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cajeros MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
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
	
		CajerosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajeros= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajeros=new JButtonMe();
				this.jButtonModificarToolBarCajeros=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajeros,this.jTtoolBarDetalleCajeros,
							"actualizar","actualizar","Actualizar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajeros,this.jTtoolBarDetalleCajeros,
							"eliminar","eliminar","Eliminar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajeros,this.jTtoolBarDetalleCajeros,
							"cancelar","cancelar","Cancelar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajeros,this.jTtoolBarDetalleCajeros,
							"guardarcambios","guardarcambios","Guardar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajeros=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajeros=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajeros=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajeros=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajeros=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajeros= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajeros.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajeros,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajeros= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajeros.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajeros,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajeros= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajeros.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajeros,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajeros= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajeros.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajeros,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajeros= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajeros.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajeros,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajeros= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajeros.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajeros,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajeros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajeros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajeros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajeros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajeros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajeros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajeros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajeros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajeros,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajeros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajeros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajeros,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajeros.add(this.jMenuItemDetalleCerrarCajeros);
		
		this.jmenuDetalleAccionesCajeros.add(this.jMenuItemActualizarCajeros);
		this.jmenuDetalleAccionesCajeros.add(this.jMenuItemEliminarCajeros);
		this.jmenuDetalleAccionesCajeros.add(this.jMenuItemCancelarCajeros);		
		
		//this.jmenuDetalleDatosCajeros.add(this.jMenuItemDetalleAbrirOrderByCajeros);				
		this.jmenuDetalleDatosCajeros.add(this.jMenuItemDetalleMostarOcultarCajeros);				
				
		//this.jmenuDetalleAccionesCajeros.add(this.jMenuItemGuardarCambiosCajeros);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajeros.add(this.jmenuDetalleArchivoCajeros);		
		this.jmenuBarDetalleCajeros.add(this.jmenuDetalleAccionesCajeros);		
		this.jmenuBarDetalleCajeros.add(this.jmenuDetalleDatosCajeros);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajeros);				
	}
	
	
	public void inicializarElementosCamposCajeros() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajeros = new JLabelMe();
		jLabelIdCajeros.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajeros = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajeros= new GridBagLayout();

		this.jPanelidCajeros.setLayout(this.gridaBagLayoutCajeros);

		jLabelidCajeros = new JLabel();
		jLabelidCajeros.setText("Id");

		jLabelidCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioCajeros = new JLabelMe();
		this.jLabelfecha_inicioCajeros.setText(""+CajerosConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioCajeros.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPanelfecha_inicioCajeros.setLayout(this.gridaBagLayoutCajeros);


		//jFormattedTextFieldfecha_inicioCajeros= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioCajeros= new JDateChooser();
		jDateChooserfecha_inicioCajeros.setEnabled(false);
		jDateChooserfecha_inicioCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioCajeros.setDate(new Date());
		jDateChooserfecha_inicioCajeros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioCajeros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioCajerosBusqueda= new JButtonMe();
		this.jButtonfecha_inicioCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioCajerosBusqueda.setText("U");
		this.jButtonfecha_inicioCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioCajerosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finCajeros = new JLabelMe();
		this.jLabelfecha_finCajeros.setText(""+CajerosConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finCajeros.setToolTipText("Fecha Fin");
		this.jLabelfecha_finCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPanelfecha_finCajeros.setLayout(this.gridaBagLayoutCajeros);


		//jFormattedTextFieldfecha_finCajeros= new JFormattedTextFieldMe();

		jDateChooserfecha_finCajeros= new JDateChooser();
		jDateChooserfecha_finCajeros.setEnabled(false);
		jDateChooserfecha_finCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finCajeros.setDate(new Date());
		jDateChooserfecha_finCajeros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finCajeros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finCajerosBusqueda= new JButtonMe();
		this.jButtonfecha_finCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finCajerosBusqueda.setText("U");
		this.jButtonfecha_finCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finCajerosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cajaCajeros = new JLabelMe();
		this.jLabelnombre_cajaCajeros.setText(""+CajerosConstantesFunciones.LABEL_NOMBRECAJA+" : *");
		this.jLabelnombre_cajaCajeros.setToolTipText("Nombre Caja");
		this.jLabelnombre_cajaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cajaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cajaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cajaCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cajaCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_NOMBRECAJA);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPanelnombre_cajaCajeros.setLayout(this.gridaBagLayoutCajeros);


		jTextAreanombre_cajaCajeros= new JTextAreaMe();
		jTextAreanombre_cajaCajeros.setEnabled(false);
		jTextAreanombre_cajaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cajaCajeros.setLineWrap(true);
		jTextAreanombre_cajaCajeros.setWrapStyleWord(true);
		jTextAreanombre_cajaCajeros.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cajaCajeros.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cajaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cajaCajeros = new JScrollPane(jTextAreanombre_cajaCajeros);
		jscrollPanenombre_cajaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cajaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cajaCajerosBusqueda= new JButtonMe();
		this.jButtonnombre_cajaCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cajaCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cajaCajerosBusqueda.setText("U");
		this.jButtonnombre_cajaCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cajaCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cajaCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cajaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cajaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cajaCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cajaCajerosBusqueda.setVisible(false);		}


					
		this.jLabelfechaCajeros = new JLabelMe();
		this.jLabelfechaCajeros.setText(""+CajerosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCajeros.setToolTipText("Fecha");
		this.jLabelfechaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPanelfechaCajeros.setLayout(this.gridaBagLayoutCajeros);


		//jFormattedTextFieldfechaCajeros= new JFormattedTextFieldMe();

		jDateChooserfechaCajeros= new JDateChooser();
		jDateChooserfechaCajeros.setEnabled(false);
		jDateChooserfechaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCajeros.setDate(new Date());
		jDateChooserfechaCajeros.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCajeros.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCajerosBusqueda= new JButtonMe();
		this.jButtonfechaCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCajerosBusqueda.setText("U");
		this.jButtonfechaCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCajerosBusqueda.setVisible(false);		}


					
		this.jLabeltotalCajeros = new JLabelMe();
		this.jLabeltotalCajeros.setText(""+CajerosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalCajeros.setToolTipText("Total");
		this.jLabeltotalCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPaneltotalCajeros.setLayout(this.gridaBagLayoutCajeros);


		jTextFieldtotalCajeros= new JTextFieldMe();
		jTextFieldtotalCajeros.setEnabled(false);
		jTextFieldtotalCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalCajeros.setText("0.0");

		this.jButtontotalCajerosBusqueda= new JButtonMe();
		this.jButtontotalCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalCajerosBusqueda.setText("U");
		this.jButtontotalCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalCajerosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajeros() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCajeros = new JLabelMe();
		this.jLabelid_empresaCajeros.setText(""+CajerosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajeros.setToolTipText("Empresa");
		this.jLabelid_empresaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPanelid_empresaCajeros.setLayout(this.gridaBagLayoutCajeros);


		jComboBoxid_empresaCajeros= new JComboBoxMe();
		jComboBoxid_empresaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajeros.setEnabled(false);

		this.jButtonid_empresaCajeros= new JButtonMe();
		this.jButtonid_empresaCajeros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajeros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajeros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajeros.setText("Buscar");
		this.jButtonid_empresaCajeros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajeros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajeros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajeros"));

		this.jButtonid_empresaCajerosBusqueda= new JButtonMe();
		this.jButtonid_empresaCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajerosBusqueda.setText("U");
		this.jButtonid_empresaCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajerosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajerosUpdate= new JButtonMe();
		this.jButtonid_empresaCajerosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajerosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajerosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajerosUpdate.setText("U");
		this.jButtonid_empresaCajerosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajerosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajerosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajerosUpdate"));



					
		this.jLabelid_sucursalCajeros = new JLabelMe();
		this.jLabelid_sucursalCajeros.setText(""+CajerosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCajeros.setToolTipText("Sucursal");
		this.jLabelid_sucursalCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPanelid_sucursalCajeros.setLayout(this.gridaBagLayoutCajeros);


		jComboBoxid_sucursalCajeros= new JComboBoxMe();
		jComboBoxid_sucursalCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCajeros.setEnabled(false);

		this.jButtonid_sucursalCajeros= new JButtonMe();
		this.jButtonid_sucursalCajeros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajeros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajeros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajeros.setText("Buscar");
		this.jButtonid_sucursalCajeros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCajeros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajeros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajeros"));

		this.jButtonid_sucursalCajerosBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajerosBusqueda.setText("U");
		this.jButtonid_sucursalCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajerosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajerosUpdate= new JButtonMe();
		this.jButtonid_sucursalCajerosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajerosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajerosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajerosUpdate.setText("U");
		this.jButtonid_sucursalCajerosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajerosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajerosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajerosUpdate"));



					
		this.jLabelid_cajaCajeros = new JLabelMe();
		this.jLabelid_cajaCajeros.setText(""+CajerosConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaCajeros.setToolTipText("Caja");
		this.jLabelid_cajaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaCajeros.setToolTipText(CajerosConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutCajeros = new GridBagLayout();
		this.jPanelid_cajaCajeros.setLayout(this.gridaBagLayoutCajeros);


		jComboBoxid_cajaCajeros= new JComboBoxMe();
		jComboBoxid_cajaCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cajaCajeros.setEnabled(false);

		this.jButtonid_cajaCajeros= new JButtonMe();
		this.jButtonid_cajaCajeros.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajeros.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajeros.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajeros.setText("Buscar");
		this.jButtonid_cajaCajeros.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaCajeros.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajeros,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajeros"));

		this.jButtonid_cajaCajerosBusqueda= new JButtonMe();
		this.jButtonid_cajaCajerosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajerosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajerosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajerosBusqueda.setText("U");
		this.jButtonid_cajaCajerosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaCajerosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajerosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajerosBusqueda"));

		if(this.cajerosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaCajerosBusqueda.setVisible(false);		}

		this.jButtonid_cajaCajerosUpdate= new JButtonMe();
		this.jButtonid_cajaCajerosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajerosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajerosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajerosUpdate.setText("U");
		this.jButtonid_cajaCajerosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaCajerosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajerosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaCajeros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajeros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajerosUpdate"));



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
		//this.jInternalFrameDetalleCajeros = new CajerosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cajeros DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajeros= new GridBagLayout();
		

		
		String sToolTipCajeros="";
		sToolTipCajeros=CajerosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajeros+="(PuntoVenta.Cajeros)";
		}
		
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajeros+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajeros = new JButtonMe();
		this.jButtonModificarCajeros = new JButtonMe();
        this.jButtonActualizarCajeros = new JButtonMe();
        this.jButtonEliminarCajeros = new JButtonMe();
        this.jButtonCancelarCajeros = new JButtonMe();
        this.jButtonGuardarCambiosCajeros = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajeros = new JButtonMe();
		this.jButtonCerrarCajeros = new JButtonMe();
		
		this.jScrollPanelDatosCajeros = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajeros = new JScrollPane();
		this.jScrollPanelDatosGeneralCajeros = new JScrollPane();
				
		
		
		this.jPanelCamposCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cajeros";
		
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajeroses" + this.sPath));
		} else {
			this.jScrollPanelDatosCajeros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajeros.setName("jPanelCamposCajeros"); 

		this.jPanelCamposOcultosCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajeros.setName("jPanelCamposOcultosCajeros"); 

        this.jPanelAccionesCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajeros.setToolTipText("Acciones");
        this.jPanelAccionesCajeros.setName("Acciones"); 

		this.jPanelAccionesFormularioCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajeros.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajeros.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajeros, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajeros.setText("Nuevo");
		this.jButtonModificarCajeros.setText("Editar");
        this.jButtonActualizarCajeros.setText("Actualizar");
        this.jButtonEliminarCajeros.setText("Eliminar");
        this.jButtonCancelarCajeros.setText("Cancelar");
        this.jButtonGuardarCambiosCajeros.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajeros.setText("Guardar");
		this.jButtonCerrarCajeros.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajeros,"nuevo_button","Nuevo",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajeros,"modificar_button","Editar",this.cajerosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajeros,"actualizar_button","Actualizar",this.cajerosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajeros,"eliminar_button","Eliminar",this.cajerosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajeros,"cancelar_button","Cancelar",this.cajerosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajeros,"guardarcambios_button","Guardar",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajeros,"guardarcambiostabla_button","Guardar",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajeros,"cerrar_button","Salir",this.cajerosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajeros.setToolTipText("Nuevo"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajeros.setToolTipText("Editar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajeros.setToolTipText("Actualizar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajeros.setToolTipText("Eliminar)"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajeros.setToolTipText("Cancelar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajeros.setToolTipText("Guardar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajeros.setToolTipText("Guardar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajeros.setToolTipText("Salir"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajeros";
		inputMap = this.jButtonNuevoCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajeros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajeros"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajeros";
		inputMap = this.jButtonActualizarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajeros"));
		
		//ELIMINAR
		sMapKey = "EliminarCajeros";
		inputMap = this.jButtonEliminarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajeros"));
		
		//CANCELAR	
		sMapKey = "CancelarCajeros";
		inputMap = this.jButtonCancelarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajeros"));
		
		//CERRAR		
		sMapKey = "CerrarCajeros";
		inputMap = this.jButtonCerrarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajeros"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajeros";
		inputMap = this.jButtonGuardarCambiosTablaCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajeros"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajeros = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajeros.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajeros.setToolTipText("Nuevo Cajeros");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajeros = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajeros.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajeros.setToolTipText("Sin Cerrar Ventana Cajeros");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajeros = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajeros.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajeros.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajeros, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajeros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajeros.setText("Accion");
		this.jComboBoxTiposAccionesCajeros.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajeros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajeros.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajeros.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajeros = new JLabelMe();
		
		this.jLabelAccionesCajeros.setText("Acciones");		
		this.jLabelAccionesCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajeros();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajeros();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajeros=new JTabbedPane();
		this.jTabbedPaneRelacionesCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajeros,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajeros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajeros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajeros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajeros.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajeros, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajeros = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajeros = new GridBagLayout();
		
		this.jPanelCamposCajeros.setLayout(gridaBagLayoutCamposCajeros);
		this.jPanelCamposOcultosCajeros.setLayout(gridaBagLayoutCamposOcultosCajeros);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajeros.add(jLabelIdCajeros, this.gridBagConstraintsCajeros);



	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajeros.add(jLabelidCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajeros.add(jLabelid_empresaCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajeros.add(jButtonid_empresaCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 3;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajeros.add(jButtonid_empresaCajerosUpdate, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajeros.add(jComboBoxid_empresaCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCajeros.add(jLabelid_sucursalCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajeros.add(jButtonid_sucursalCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 3;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajeros.add(jButtonid_sucursalCajerosUpdate, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCajeros.add(jComboBoxid_sucursalCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaCajeros.add(jLabelid_cajaCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajeros.add(jButtonid_cajaCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 3;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajeros.add(jButtonid_cajaCajerosUpdate, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaCajeros.add(jComboBoxid_cajaCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioCajeros.add(jLabelfecha_inicioCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioCajeros.add(jButtonfecha_inicioCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioCajeros.add(jDateChooserfecha_inicioCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finCajeros.add(jLabelfecha_finCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finCajeros.add(jButtonfecha_finCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finCajeros.add(jDateChooserfecha_finCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cajaCajeros.add(jLabelnombre_cajaCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cajaCajeros.add(jButtonnombre_cajaCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cajaCajeros.add(jscrollPanenombre_cajaCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCajeros.add(jLabelfechaCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCajeros.add(jButtonfechaCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCajeros.add(jDateChooserfechaCajeros, this.gridBagConstraintsCajeros);


	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 0;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalCajeros.add(jLabeltotalCajeros, this.gridBagConstraintsCajeros);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 2;
		this.gridBagConstraintsCajeros.ipadx = 0;
		this.gridBagConstraintsCajeros.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalCajeros.add(jButtontotalCajerosBusqueda, this.gridBagConstraintsCajeros);
	}

	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeros.gridy = 0;
	this.gridBagConstraintsCajeros.gridx = 1;
	this.gridBagConstraintsCajeros.ipadx = 0;
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalCajeros.add(jTextFieldtotalCajeros, this.gridBagConstraintsCajeros);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeros.add(this.jPanelidCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposCajeros % 1==0) {
		iXPanelCamposCajeros=0;
		iYPanelCamposCajeros++;
	}
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeros.add(this.jPanelfecha_inicioCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposCajeros % 1==0) {
		iXPanelCamposCajeros=0;
		iYPanelCamposCajeros++;
	}
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeros.add(this.jPanelfecha_finCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposCajeros % 1==0) {
		iXPanelCamposCajeros=0;
		iYPanelCamposCajeros++;
	}
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeros.add(this.jPanelnombre_cajaCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposCajeros % 1==0) {
		iXPanelCamposCajeros=0;
		iYPanelCamposCajeros++;
	}
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeros.add(this.jPanelfechaCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposCajeros % 1==0) {
		iXPanelCamposCajeros=0;
		iYPanelCamposCajeros++;
	}
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeros.add(this.jPaneltotalCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposCajeros % 1==0) {
		iXPanelCamposCajeros=0;
		iYPanelCamposCajeros++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposOcultosCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposOcultosCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajeros.add(this.jPanelid_empresaCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposOcultosCajeros % 1==0) {
		iXPanelCamposOcultosCajeros=0;
		iYPanelCamposOcultosCajeros++;
	}
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposOcultosCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposOcultosCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajeros.add(this.jPanelid_sucursalCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposOcultosCajeros % 1==0) {
		iXPanelCamposOcultosCajeros=0;
		iYPanelCamposOcultosCajeros++;
	}
	this.gridBagConstraintsCajeros = new GridBagConstraints();
	this.gridBagConstraintsCajeros.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeros.gridy = iYPanelCamposOcultosCajeros;
	this.gridBagConstraintsCajeros.gridx = iXPanelCamposOcultosCajeros++;
	this.gridBagConstraintsCajeros.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeros.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajeros.add(this.jPanelid_cajaCajeros, this.gridBagConstraintsCajeros);



	if(iXPanelCamposOcultosCajeros % 1==0) {
		iXPanelCamposOcultosCajeros=0;
		iYPanelCamposOcultosCajeros++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesCajeros= new GridBagLayout();
		this.jPanelAccionesCajeros.setLayout(gridaBagLayoutAccionesCajeros);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajeros= new GridBagLayout();
		this.jPanelAccionesFormularioCajeros.setLayout(gridaBagLayoutAccionesFormularioCajeros);
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajeros.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajeros.add(this.jComboBoxTiposAccionesFormularioCajeros, this.gridBagConstraintsCajeros);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajeros.add(this.jButtonModificarCajeros, this.gridBagConstraintsCajeros);							

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajeros.add(this.jButtonEliminarCajeros, this.gridBagConstraintsCajeros);
		
			
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = 0;		
		this.gridBagConstraintsCajeros.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajeros.add(this.jButtonActualizarCajeros, this.gridBagConstraintsCajeros);


		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = 0;		
		this.gridBagConstraintsCajeros.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajeros.add(this.jButtonGuardarCambiosCajeros, this.gridBagConstraintsCajeros);	
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = 0;		
		this.gridBagConstraintsCajeros.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajeros.add(this.jButtonCancelarCajeros, this.gridBagConstraintsCajeros);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajeros = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajeros);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajeros = new GridBagConstraints();						
			this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajeros.gridx = 0;		
			//this.gridBagConstraintsCajeros.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajeros.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajeros.gridx =0;
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajeros.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajeros, this.gridBagConstraintsCajeros);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajerosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajeros = new CajerosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cajeros DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cajeros DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cajeros Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajerosModel cajerosModel=new CajerosModel(this);
			
			//SI USARA CLASE INTERNA
			//CajerosModel.CajerosFocusTraversalPolicy cajerosFocusTraversalPolicy = cajerosModel.new CajerosFocusTraversalPolicy(this);
			
			//cajerosFocusTraversalPolicy.setcajerosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajerosModel);
			
			
			this.jContentPaneDetalleCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajeros = new GridBagLayout();	
			this.jContentPaneDetalleCajeros.setLayout(gridaBagLayoutDetalleCajeros);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajeros = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajeros = new GridBagConstraints();
				this.gridBagConstraintsCajeros.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajeros.gridx = 0;
					
				
				this.jContentPaneDetalleCajeros.add(jTtoolBarDetalleCajeros, gridBagConstraintsCajeros);								
				
}
			
			this.jScrollPanelDatosEdicionCajeros=   new JScrollPane(jContentPaneDetalleCajeros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajeros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajeros=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajeros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajeros.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajeros.gridx = 0;
	        
			this.jContentPaneDetalleCajeros.add(jPanelCamposCajeros, gridBagConstraintsCajeros);
			
			
			
			
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
						//&& cajerosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cajerosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajeros= new GridBagConstraints();
						this.gridBagConstraintsCajeros.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajeros.gridx = 0;
						this.jContentPaneDetalleCajeros.add(this.jTabbedPaneRelacionesCajeros, this.gridBagConstraintsCajeros);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajeros.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajeros.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajeros = new GridBagConstraints();
					this.gridBagConstraintsCajeros.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajeros.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajeros.gridx = 0;
					
				
					this.jContentPaneDetalleCajeros.add(jPanelCamposOcultosCajeros, gridBagConstraintsCajeros);
				
					this.jPanelCamposOcultosCajeros.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCajeros.gridx = 0;
	        this.gridBagConstraintsCajeros.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajeros.add(this.jPanelAccionesFormularioCajeros, this.gridBagConstraintsCajeros);							
			
			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
	        this.gridBagConstraintsCajeros.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCajeros.gridx = 0;
	        
			
			this.jContentPaneDetalleCajeros.add(this.jPanelAccionesCajeros, this.gridBagConstraintsCajeros);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajeros);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajeros=   new JScrollPane(this.jPanelCamposCajeros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajeros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajeros.gridx = 0;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajeros.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajeros, this.gridBagConstraintsCajeros);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajeros.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajeros, this.gridBagConstraintsCajeros);			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajeros.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajeros, this.gridBagConstraintsCajeros);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajeros, this.gridBagConstraintsCajeros);
			
			
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajeros, this.gridBagConstraintsCajeros);
		
			
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajeros, this.gridBagConstraintsCajeros);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajeros;//jContentPane;
		
		return jScrollPanelDatosEdicionCajeros;
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

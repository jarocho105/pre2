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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.GastoDepreciacionConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class GastoDepreciacionDetalleFormJInternalFrame extends GastoDepreciacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGastoDepreciacion;
	
	protected JMenuBar jmenuBarDetalleGastoDepreciacion;
	
	protected JMenu jmenuDetalleGastoDepreciacion;
	protected JMenu jmenuDetalleArchivoGastoDepreciacion;
	protected JMenu jmenuDetalleAccionesGastoDepreciacion;
	protected JMenu jmenuDetalleDatosGastoDepreciacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGastoDepreciacion;	
	protected GridBagConstraints gridBagConstraintsGastoDepreciacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GastoDepreciacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleGastoDepreciacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";
	
	public GastoDepreciacionSessionBean gastodepreciacionSessionBean;
	
	

	public CuentaContaGastoDepreBeanSwingJInternalFrame cuentacontagastodepreBeanSwingJInternalFrame=null;
	public CuentaContaGastoDepreBeanSwingJInternalFrame cuentacontagastodepreBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaContaGastoDepre=false;
	public CuentaContaGastoDepreSessionBean cuentacontagastodepreSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;	
	
	public GastoDepreciacionLogic gastodepreciacionLogic;
	
	public JScrollPane jScrollPanelDatosGastoDepreciacion;
	public JScrollPane jScrollPanelDatosEdicionGastoDepreciacion;
	public JScrollPane jScrollPanelDatosGeneralGastoDepreciacion;
	
	protected JPanel jPanelCamposGastoDepreciacion;    
	protected JPanel jPanelCamposOcultosGastoDepreciacion;    	
	protected JPanel jPanelAccionesGastoDepreciacion;
	protected JPanel jPanelAccionesFormularioGastoDepreciacion;
    
	
	
	protected Integer iXPanelCamposGastoDepreciacion=0;
	protected Integer iYPanelCamposGastoDepreciacion=0;
	
	protected Integer iXPanelCamposOcultosGastoDepreciacion=0;
	protected Integer iYPanelCamposOcultosGastoDepreciacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGastoDepreciacion;
	public JButton jButtonModificarGastoDepreciacion;
	public JButton jButtonActualizarGastoDepreciacion;
    public JButton jButtonEliminarGastoDepreciacion;
	public JButton jButtonCancelarGastoDepreciacion;
    public JButton jButtonGuardarCambiosGastoDepreciacion;
	public JButton jButtonGuardarCambiosTablaGastoDepreciacion;
	protected JButton jButtonCerrarGastoDepreciacion;
	
	
	protected JButton jButtonProcesarInformacionGastoDepreciacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGastoDepreciacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGastoDepreciacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGastoDepreciacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGastoDepreciacion;
	protected JButton jButtonModificarToolBarGastoDepreciacion;
	protected JButton jButtonActualizarToolBarGastoDepreciacion;
    protected JButton jButtonEliminarToolBarGastoDepreciacion;
	protected JButton jButtonCancelarToolBarGastoDepreciacion;
    protected JButton jButtonGuardarCambiosToolBarGastoDepreciacion;
	protected JButton jButtonGuardarCambiosTablaToolBarGastoDepreciacion;
	protected JButton jButtonMostrarOcultarTablaToolBarGastoDepreciacion;
	protected JButton jButtonCerrarToolBarGastoDepreciacion;
	
	protected JButton jButtonProcesarInformacionToolBarGastoDepreciacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGastoDepreciacion;
	protected JMenuItem jMenuItemModificarGastoDepreciacion;
	protected JMenuItem jMenuItemActualizarGastoDepreciacion;
    protected JMenuItem jMenuItemEliminarGastoDepreciacion;
	protected JMenuItem jMenuItemCancelarGastoDepreciacion;
    protected JMenuItem jMenuItemGuardarCambiosGastoDepreciacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaGastoDepreciacion;
	protected JMenuItem jMenuItemCerrarGastoDepreciacion;
	protected JMenuItem jMenuItemDetalleCerrarGastoDepreciacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarGastoDepreciacion;
	
	protected JMenuItem jMenuItemProcesarInformacionGastoDepreciacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGastoDepreciacion;
	protected JMenuItem jMenuItemMostrarOcultarGastoDepreciacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGastoDepreciacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGastoDepreciacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGastoDepreciacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGastoDepreciacion;
	public JLabel jLabelIdGastoDepreciacion;
	public JLabel jLabelidGastoDepreciacion;
	public JButton jButtonidGastoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelanioGastoDepreciacion;
	public JLabel jLabelanioGastoDepreciacion;
	public JTextField jTextFieldanioGastoDepreciacion;
	public JButton jButtonanioGastoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelvalorGastoDepreciacion;
	public JLabel jLabelvalorGastoDepreciacion;
	public JTextField jTextFieldvalorGastoDepreciacion;
	public JButton jButtonvalorGastoDepreciacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGastoDepreciacion;
	public JLabel jLabelid_empresaGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGastoDepreciacion;
	public JButton jButtonid_empresaGastoDepreciacion= new JButtonMe();
	public JButton jButtonid_empresaGastoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaGastoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_grupo_activo_fijoGastoDepreciacion;
	public JLabel jLabelid_detalle_grupo_activo_fijoGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion;
	public JButton jButtonid_detalle_grupo_activo_fijoGastoDepreciacion= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGastoDepreciacion;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GastoDepreciacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGastoDepreciacion=new JPanel();
				this.jPanelAccionesFormularioGastoDepreciacion=new JPanel();
				this.jmenuBarDetalleGastoDepreciacion=new JMenuBar();
				this.jTtoolBarDetalleGastoDepreciacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GastoDepreciacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGastoDepreciacion() {
		return this.jButtonActualizarToolBarGastoDepreciacion;
	}
	
	public JButton getjButtonEliminarToolBarGastoDepreciacion() {
		return this.jButtonEliminarToolBarGastoDepreciacion;
	}
	
	public JButton getjButtonCancelarToolBarGastoDepreciacion() {
		return this.jButtonCancelarToolBarGastoDepreciacion;
	}		
	
	public JButton getjButtonProcesarInformacionGastoDepreciacion() {
		return this.jButtonProcesarInformacionGastoDepreciacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGastoDepreciacion)	{
		this.jButtonProcesarInformacionGastoDepreciacion = jButtonProcesarInformacionGastoDepreciacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGastoDepreciacion() {
		return this.jComboBoxTiposAccionesGastoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGastoDepreciacion(
			JComboBox jComboBoxTiposRelacionesGastoDepreciacion) {
		this.jComboBoxTiposRelacionesGastoDepreciacion = jComboBoxTiposRelacionesGastoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGastoDepreciacion(
			JComboBox jComboBoxTiposAccionesGastoDepreciacion) {
		this.jComboBoxTiposAccionesGastoDepreciacion = jComboBoxTiposAccionesGastoDepreciacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGastoDepreciacion() {
		return this.jComboBoxTiposAccionesFormularioGastoDepreciacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGastoDepreciacion(
			JComboBox jComboBoxTiposAccionesFormularioGastoDepreciacion) {
		this.jComboBoxTiposAccionesFormularioGastoDepreciacion = jComboBoxTiposAccionesFormularioGastoDepreciacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		
		this.gastodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.gastodepreciacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GastoDepreciacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Gasto Depreciacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
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
	
		GastoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGastoDepreciacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGastoDepreciacion=new JButtonMe();
				this.jButtonModificarToolBarGastoDepreciacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGastoDepreciacion,this.jTtoolBarDetalleGastoDepreciacion,
							"actualizar","actualizar","Actualizar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGastoDepreciacion,this.jTtoolBarDetalleGastoDepreciacion,
							"eliminar","eliminar","Eliminar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGastoDepreciacion,this.jTtoolBarDetalleGastoDepreciacion,
							"cancelar","cancelar","Cancelar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGastoDepreciacion,this.jTtoolBarDetalleGastoDepreciacion,
							"guardarcambios","guardarcambios","Guardar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGastoDepreciacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGastoDepreciacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGastoDepreciacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGastoDepreciacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGastoDepreciacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGastoDepreciacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGastoDepreciacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGastoDepreciacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGastoDepreciacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGastoDepreciacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGastoDepreciacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGastoDepreciacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGastoDepreciacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGastoDepreciacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGastoDepreciacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGastoDepreciacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGastoDepreciacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGastoDepreciacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGastoDepreciacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGastoDepreciacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGastoDepreciacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGastoDepreciacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGastoDepreciacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGastoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGastoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGastoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGastoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGastoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGastoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGastoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGastoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGastoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGastoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGastoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGastoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGastoDepreciacion.add(this.jMenuItemDetalleCerrarGastoDepreciacion);
		
		this.jmenuDetalleAccionesGastoDepreciacion.add(this.jMenuItemActualizarGastoDepreciacion);
		this.jmenuDetalleAccionesGastoDepreciacion.add(this.jMenuItemEliminarGastoDepreciacion);
		this.jmenuDetalleAccionesGastoDepreciacion.add(this.jMenuItemCancelarGastoDepreciacion);		
		
		//this.jmenuDetalleDatosGastoDepreciacion.add(this.jMenuItemDetalleAbrirOrderByGastoDepreciacion);				
		this.jmenuDetalleDatosGastoDepreciacion.add(this.jMenuItemDetalleMostarOcultarGastoDepreciacion);				
				
		//this.jmenuDetalleAccionesGastoDepreciacion.add(this.jMenuItemGuardarCambiosGastoDepreciacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGastoDepreciacion.add(this.jmenuDetalleArchivoGastoDepreciacion);		
		this.jmenuBarDetalleGastoDepreciacion.add(this.jmenuDetalleAccionesGastoDepreciacion);		
		this.jmenuBarDetalleGastoDepreciacion.add(this.jmenuDetalleDatosGastoDepreciacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGastoDepreciacion.add(this.jmenuDetalleGastoDepreciacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGastoDepreciacion);				
	}
	
	
	public void inicializarElementosCamposGastoDepreciacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGastoDepreciacion = new JLabelMe();
		jLabelIdGastoDepreciacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGastoDepreciacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGastoDepreciacion.setToolTipText(GastoDepreciacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGastoDepreciacion= new GridBagLayout();

		this.jPanelidGastoDepreciacion.setLayout(this.gridaBagLayoutGastoDepreciacion);

		jLabelidGastoDepreciacion = new JLabel();
		jLabelidGastoDepreciacion.setText("Id");

		jLabelidGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelanioGastoDepreciacion = new JLabelMe();
		this.jLabelanioGastoDepreciacion.setText(""+GastoDepreciacionConstantesFunciones.LABEL_ANIO+" : *");
		this.jLabelanioGastoDepreciacion.setToolTipText("Anio");
		this.jLabelanioGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanioGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanioGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanioGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanioGastoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanioGastoDepreciacion.setToolTipText(GastoDepreciacionConstantesFunciones.LABEL_ANIO);
		this.gridaBagLayoutGastoDepreciacion = new GridBagLayout();
		this.jPanelanioGastoDepreciacion.setLayout(this.gridaBagLayoutGastoDepreciacion);


		jTextFieldanioGastoDepreciacion= new JTextFieldMe();
		jTextFieldanioGastoDepreciacion.setEnabled(false);
		jTextFieldanioGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanioGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanioGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanioGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanioGastoDepreciacion.setText("0");

		this.jButtonanioGastoDepreciacionBusqueda= new JButtonMe();
		this.jButtonanioGastoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanioGastoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanioGastoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanioGastoDepreciacionBusqueda.setText("U");
		this.jButtonanioGastoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanioGastoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanioGastoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanioGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanioGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anioGastoDepreciacionBusqueda"));

		if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanioGastoDepreciacionBusqueda.setVisible(false);		}


					
		this.jLabelvalorGastoDepreciacion = new JLabelMe();
		this.jLabelvalorGastoDepreciacion.setText(""+GastoDepreciacionConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorGastoDepreciacion.setToolTipText("Valor");
		this.jLabelvalorGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorGastoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorGastoDepreciacion.setToolTipText(GastoDepreciacionConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutGastoDepreciacion = new GridBagLayout();
		this.jPanelvalorGastoDepreciacion.setLayout(this.gridaBagLayoutGastoDepreciacion);


		jTextFieldvalorGastoDepreciacion= new JTextFieldMe();
		jTextFieldvalorGastoDepreciacion.setEnabled(false);
		jTextFieldvalorGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorGastoDepreciacion.setText("0.0");

		this.jButtonvalorGastoDepreciacionBusqueda= new JButtonMe();
		this.jButtonvalorGastoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorGastoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorGastoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorGastoDepreciacionBusqueda.setText("U");
		this.jButtonvalorGastoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorGastoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorGastoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorGastoDepreciacionBusqueda"));

		if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorGastoDepreciacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGastoDepreciacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGastoDepreciacion = new JLabelMe();
		this.jLabelid_empresaGastoDepreciacion.setText(""+GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGastoDepreciacion.setToolTipText("Empresa");
		this.jLabelid_empresaGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGastoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGastoDepreciacion.setToolTipText(GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGastoDepreciacion = new GridBagLayout();
		this.jPanelid_empresaGastoDepreciacion.setLayout(this.gridaBagLayoutGastoDepreciacion);


		jComboBoxid_empresaGastoDepreciacion= new JComboBoxMe();
		jComboBoxid_empresaGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGastoDepreciacion.setEnabled(false);

		this.jButtonid_empresaGastoDepreciacion= new JButtonMe();
		this.jButtonid_empresaGastoDepreciacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoDepreciacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoDepreciacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoDepreciacion.setText("Buscar");
		this.jButtonid_empresaGastoDepreciacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGastoDepreciacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoDepreciacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoDepreciacion"));

		this.jButtonid_empresaGastoDepreciacionBusqueda= new JButtonMe();
		this.jButtonid_empresaGastoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGastoDepreciacionBusqueda.setText("U");
		this.jButtonid_empresaGastoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGastoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoDepreciacionBusqueda"));

		if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGastoDepreciacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaGastoDepreciacionUpdate= new JButtonMe();
		this.jButtonid_empresaGastoDepreciacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGastoDepreciacionUpdate.setText("U");
		this.jButtonid_empresaGastoDepreciacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGastoDepreciacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoDepreciacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoDepreciacionUpdate"));



					
		this.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion = new JLabelMe();
		this.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion.setText(""+GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO+" : *");
		this.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion.setToolTipText("Detalle Grupo Activo Fijo");
		this.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion.setToolTipText(GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		this.gridaBagLayoutGastoDepreciacion = new GridBagLayout();
		this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion.setLayout(this.gridaBagLayoutGastoDepreciacion);


		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion.setText("Buscar");
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoGastoDepreciacion"));

		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoGastoDepreciacionBusqueda"));

		if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.setVisible(false);		}

		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoGastoDepreciacionUpdate"));



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
		//this.jInternalFrameDetalleGastoDepreciacion = new GastoDepreciacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Gasto Depreciacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGastoDepreciacion= new GridBagLayout();
		

		
		String sToolTipGastoDepreciacion="";
		sToolTipGastoDepreciacion=GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGastoDepreciacion+="(ActivosFijos.GastoDepreciacion)";
		}
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipGastoDepreciacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGastoDepreciacion = new JButtonMe();
		this.jButtonModificarGastoDepreciacion = new JButtonMe();
        this.jButtonActualizarGastoDepreciacion = new JButtonMe();
        this.jButtonEliminarGastoDepreciacion = new JButtonMe();
        this.jButtonCancelarGastoDepreciacion = new JButtonMe();
        this.jButtonGuardarCambiosGastoDepreciacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaGastoDepreciacion = new JButtonMe();
		this.jButtonCerrarGastoDepreciacion = new JButtonMe();
		
		this.jScrollPanelDatosGastoDepreciacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionGastoDepreciacion = new JScrollPane();
		this.jScrollPanelDatosGeneralGastoDepreciacion = new JScrollPane();
				
		
		
		this.jPanelCamposGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Gasto Depreciacion";
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosGastoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGastoDepreciacion.setName("jPanelCamposGastoDepreciacion"); 

		this.jPanelCamposOcultosGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGastoDepreciacion.setName("jPanelCamposOcultosGastoDepreciacion"); 

        this.jPanelAccionesGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGastoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesGastoDepreciacion.setName("Acciones"); 

		this.jPanelAccionesFormularioGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGastoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGastoDepreciacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGastoDepreciacion.setText("Nuevo");
		this.jButtonModificarGastoDepreciacion.setText("Editar");
        this.jButtonActualizarGastoDepreciacion.setText("Actualizar");
        this.jButtonEliminarGastoDepreciacion.setText("Eliminar");
        this.jButtonCancelarGastoDepreciacion.setText("Cancelar");
        this.jButtonGuardarCambiosGastoDepreciacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaGastoDepreciacion.setText("Guardar");
		this.jButtonCerrarGastoDepreciacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGastoDepreciacion,"nuevo_button","Nuevo",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGastoDepreciacion,"modificar_button","Editar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGastoDepreciacion,"actualizar_button","Actualizar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGastoDepreciacion,"eliminar_button","Eliminar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGastoDepreciacion,"cancelar_button","Cancelar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGastoDepreciacion,"guardarcambios_button","Guardar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGastoDepreciacion,"guardarcambiostabla_button","Guardar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGastoDepreciacion,"cerrar_button","Salir",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGastoDepreciacion.setToolTipText("Nuevo"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGastoDepreciacion.setToolTipText("Editar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGastoDepreciacion.setToolTipText("Actualizar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGastoDepreciacion.setToolTipText("Eliminar)"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGastoDepreciacion.setToolTipText("Cancelar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGastoDepreciacion.setToolTipText("Guardar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGastoDepreciacion.setToolTipText("Guardar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGastoDepreciacion.setToolTipText("Salir"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGastoDepreciacion";
		inputMap = this.jButtonNuevoGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGastoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGastoDepreciacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGastoDepreciacion";
		inputMap = this.jButtonActualizarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGastoDepreciacion"));
		
		//ELIMINAR
		sMapKey = "EliminarGastoDepreciacion";
		inputMap = this.jButtonEliminarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGastoDepreciacion"));
		
		//CANCELAR	
		sMapKey = "CancelarGastoDepreciacion";
		inputMap = this.jButtonCancelarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGastoDepreciacion"));
		
		//CERRAR		
		sMapKey = "CerrarGastoDepreciacion";
		inputMap = this.jButtonCerrarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGastoDepreciacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGastoDepreciacion";
		inputMap = this.jButtonGuardarCambiosTablaGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGastoDepreciacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGastoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGastoDepreciacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGastoDepreciacion.setToolTipText("Nuevo GastoDepreciacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGastoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGastoDepreciacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGastoDepreciacion.setToolTipText("Sin Cerrar Ventana GastoDepreciacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGastoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGastoDepreciacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGastoDepreciacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGastoDepreciacion.setText("Accion");
		this.jComboBoxTiposAccionesGastoDepreciacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGastoDepreciacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGastoDepreciacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGastoDepreciacion = new JLabelMe();
		
		this.jLabelAccionesGastoDepreciacion.setText("Acciones");		
		this.jLabelAccionesGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGastoDepreciacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGastoDepreciacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGastoDepreciacion=new JTabbedPane();
		this.jTabbedPaneRelacionesGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGastoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGastoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGastoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGastoDepreciacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGastoDepreciacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGastoDepreciacion = new GridBagLayout();
		
		this.jPanelCamposGastoDepreciacion.setLayout(gridaBagLayoutCamposGastoDepreciacion);
		this.jPanelCamposOcultosGastoDepreciacion.setLayout(gridaBagLayoutCamposOcultosGastoDepreciacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGastoDepreciacion.add(jLabelIdGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 1;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGastoDepreciacion.add(jLabelidGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);


	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGastoDepreciacion.add(jLabelid_empresaGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = 2;
		this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGastoDepreciacion.add(jButtonid_empresaGastoDepreciacionBusqueda, this.gridBagConstraintsGastoDepreciacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = 3;
		this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGastoDepreciacion.add(jButtonid_empresaGastoDepreciacionUpdate, this.gridBagConstraintsGastoDepreciacion);
	}

	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 1;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGastoDepreciacion.add(jComboBoxid_empresaGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);


	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion.add(jLabelid_detalle_grupo_activo_fijoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = 2;
		this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion.add(jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda, this.gridBagConstraintsGastoDepreciacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = 3;
		this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion.add(jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate, this.gridBagConstraintsGastoDepreciacion);
	}

	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 1;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion.add(jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);


	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanioGastoDepreciacion.add(jLabelanioGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = 2;
		this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelanioGastoDepreciacion.add(jButtonanioGastoDepreciacionBusqueda, this.gridBagConstraintsGastoDepreciacion);
	}

	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 1;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanioGastoDepreciacion.add(jTextFieldanioGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);


	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorGastoDepreciacion.add(jLabelvalorGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = 2;
		this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorGastoDepreciacion.add(jButtonvalorGastoDepreciacionBusqueda, this.gridBagConstraintsGastoDepreciacion);
	}

	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacion.gridy = 0;
	this.gridBagConstraintsGastoDepreciacion.gridx = 1;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorGastoDepreciacion.add(jTextFieldvalorGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacion.gridy = iYPanelCamposGastoDepreciacion;
	this.gridBagConstraintsGastoDepreciacion.gridx = iXPanelCamposGastoDepreciacion++;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacion.add(this.jPanelidGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(iXPanelCamposGastoDepreciacion % 1==0) {
		iXPanelCamposGastoDepreciacion=0;
		iYPanelCamposGastoDepreciacion++;
	}
	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacion.gridy = iYPanelCamposGastoDepreciacion;
	this.gridBagConstraintsGastoDepreciacion.gridx = iXPanelCamposGastoDepreciacion++;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacion.add(this.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(iXPanelCamposGastoDepreciacion % 1==0) {
		iXPanelCamposGastoDepreciacion=0;
		iYPanelCamposGastoDepreciacion++;
	}
	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacion.gridy = iYPanelCamposGastoDepreciacion;
	this.gridBagConstraintsGastoDepreciacion.gridx = iXPanelCamposGastoDepreciacion++;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacion.add(this.jPanelanioGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(iXPanelCamposGastoDepreciacion % 1==0) {
		iXPanelCamposGastoDepreciacion=0;
		iYPanelCamposGastoDepreciacion++;
	}
	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacion.gridy = iYPanelCamposGastoDepreciacion;
	this.gridBagConstraintsGastoDepreciacion.gridx = iXPanelCamposGastoDepreciacion++;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacion.add(this.jPanelvalorGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(iXPanelCamposGastoDepreciacion % 1==0) {
		iXPanelCamposGastoDepreciacion=0;
		iYPanelCamposGastoDepreciacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacion.gridy = iYPanelCamposOcultosGastoDepreciacion;
	this.gridBagConstraintsGastoDepreciacion.gridx = iXPanelCamposOcultosGastoDepreciacion++;
	this.gridBagConstraintsGastoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGastoDepreciacion.add(this.jPanelid_empresaGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);



	if(iXPanelCamposOcultosGastoDepreciacion % 1==0) {
		iXPanelCamposOcultosGastoDepreciacion=0;
		iYPanelCamposOcultosGastoDepreciacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesGastoDepreciacion= new GridBagLayout();
		this.jPanelAccionesGastoDepreciacion.setLayout(gridaBagLayoutAccionesGastoDepreciacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGastoDepreciacion= new GridBagLayout();
		this.jPanelAccionesFormularioGastoDepreciacion.setLayout(gridaBagLayoutAccionesFormularioGastoDepreciacion);
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGastoDepreciacion.add(this.jComboBoxTiposAccionesFormularioGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGastoDepreciacion.add(this.jCheckBoxPostAccionNuevoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGastoDepreciacion.add(this.jCheckBoxPostAccionSinCerrarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGastoDepreciacion.add(this.jCheckBoxPostAccionSinMensajeGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesGastoDepreciacion.add(this.jButtonModificarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);							

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesGastoDepreciacion.add(this.jButtonEliminarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
			
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesGastoDepreciacion.add(this.jButtonActualizarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);


		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesGastoDepreciacion.add(this.jButtonGuardarCambiosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);	
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;		
		this.gridBagConstraintsGastoDepreciacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesGastoDepreciacion.add(this.jButtonCancelarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGastoDepreciacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGastoDepreciacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();						
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoDepreciacion.gridx = 0;		
			//this.gridBagConstraintsGastoDepreciacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGastoDepreciacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGastoDepreciacion.gridx =0;
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGastoDepreciacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGastoDepreciacion = new GastoDepreciacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Gasto Depreciacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Gasto Depreciacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Gasto Depreciacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GastoDepreciacionModel gastodepreciacionModel=new GastoDepreciacionModel(this);
			
			//SI USARA CLASE INTERNA
			//GastoDepreciacionModel.GastoDepreciacionFocusTraversalPolicy gastodepreciacionFocusTraversalPolicy = gastodepreciacionModel.new GastoDepreciacionFocusTraversalPolicy(this);
			
			//gastodepreciacionFocusTraversalPolicy.setgastodepreciacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(gastodepreciacionModel);
			
			
			this.jContentPaneDetalleGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGastoDepreciacion = new GridBagLayout();	
			this.jContentPaneDetalleGastoDepreciacion.setLayout(gridaBagLayoutDetalleGastoDepreciacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGastoDepreciacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsGastoDepreciacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGastoDepreciacion.gridx = 0;
					
				
				this.jContentPaneDetalleGastoDepreciacion.add(jTtoolBarDetalleGastoDepreciacion, gridBagConstraintsGastoDepreciacion);								
				
}
			
			this.jScrollPanelDatosEdicionGastoDepreciacion=   new JScrollPane(jContentPaneDetalleGastoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGastoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGastoDepreciacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGastoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGastoDepreciacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	        
			this.jContentPaneDetalleGastoDepreciacion.add(jPanelCamposGastoDepreciacion, gridBagConstraintsGastoDepreciacion);
			
			
			
			
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
						&& gastodepreciacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuentaContaGastoDepre(this.puedeCargarPorParteCuentaContaGastoDepre,false,-1);
					
					if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGastoDepreciacion= new GridBagConstraints();
						this.gridBagConstraintsGastoDepreciacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGastoDepreciacion.gridx = 0;
						this.jContentPaneDetalleGastoDepreciacion.add(this.jTabbedPaneRelacionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGastoDepreciacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuentaContaGastoDepre(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGastoDepreciacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
					this.gridBagConstraintsGastoDepreciacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGastoDepreciacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGastoDepreciacion.gridx = 0;
					
				
					this.jContentPaneDetalleGastoDepreciacion.add(jPanelCamposOcultosGastoDepreciacion, gridBagConstraintsGastoDepreciacion);
				
					this.jPanelCamposOcultosGastoDepreciacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	        this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGastoDepreciacion.add(this.jPanelAccionesFormularioGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);							
			
			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
	        this.gridBagConstraintsGastoDepreciacion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsGastoDepreciacion.gridx = 0;
	        
			
			this.jContentPaneDetalleGastoDepreciacion.add(this.jPanelAccionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGastoDepreciacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGastoDepreciacion=   new JScrollPane(this.jPanelCamposGastoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGastoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGastoDepreciacion.gridx = 0;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGastoDepreciacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGastoDepreciacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGastoDepreciacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			
			
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
			
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGastoDepreciacion;//jContentPane;
		
		return jScrollPanelDatosEdicionGastoDepreciacion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuentaContaGastoDepre(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		this.cuentacontagastodepreSessionBean.setConGuardarRelaciones(false);
		this.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(true);

		this.cuentacontagastodepreBeanSwingJInternalFrame=null;//new CuentaContaGastoDepreBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentacontagastodepreBeanSwingJInternalFramePopup=new CuentaContaGastoDepreBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentacontagastodepreBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {

				CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL=GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(true);

				this.cuentacontagastodepreBeanSwingJInternalFrame=new CuentaContaGastoDepreBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentacontagastodepreBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentacontagastodepreBeanSwingJInternalFrame.setcuentacontagastodepreSessionBean(this.cuentacontagastodepreSessionBean);

				//this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
				//this.gridBagConstraintsGastoDepreciacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGastoDepreciacion.gridx = 0;
				//this.jContentPaneDetalleGastoDepreciacion.add(this.cuentacontagastodepreBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGastoDepreciacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGastoDepreciacion.add("Cuenta Conta Gasto Depres",this.cuentacontagastodepreBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGastoDepreciacion.setComponentAt(iIndexTab,this.cuentacontagastodepreBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaContaGastoDepreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(false);
				this.cuentacontagastodepreBeanSwingJInternalFrame=null;//new CuentaContaGastoDepreBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaContaGastoDepre) {
					this.jTabbedPaneRelacionesGastoDepreciacion.add("Cuenta Conta Gasto Depres",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCuentaContaGastoDepreBeanSwingJInternalFrame(List<GastoDepreciacion> gastodepreciacions,GastoDepreciacion gastodepreciacion,CuentaContaGastoDepreBeanSwingJInternalFrame cuentacontagastodepreBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentacontagastodepreBeanSwingJInternalFrame=new CuentaContaGastoDepreBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentacontagastodepreBeanSwingJInternalFrame.getCuentaContaGastoDepreLogic().setConnexion(this.gastodepreciacionLogic.getConnexion());

					cuentacontagastodepreBeanSwingJInternalFrame.setgastodepreciacionsForeignKey(gastodepreciacions);
					cuentacontagastodepreBeanSwingJInternalFrame.setgastodepreciacionForeignKey(gastodepreciacion);
					cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.setisBusquedaDesdeForeignKeySesionGastoDepreciacion(true);
					cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.setlidGastoDepreciacionActual(gastodepreciacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentacontagastodepreBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaContaGastoDepre(cuentacontagastodepreBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentacontagastodepreBeanSwingJInternalFrame.setVisibilidadBusquedasParaGastoDepreciacion(true);
					cuentacontagastodepreBeanSwingJInternalFrame.setid_gasto_depreciacionFK_IdGastoDepreciacion(gastodepreciacion.getId());

					if(!this.conCargarFormDetalle) {
						cuentacontagastodepreBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentacontagastodepreBeanSwingJInternalFrame.setSelectedItemCombosFrameGastoDepreciacionForeignKey(gastodepreciacion,1,false,true,true);
					cuentacontagastodepreBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentacontagastodepreBeanSwingJInternalFrame.procesarBusqueda("FK_IdGastoDepreciacion");
					cuentacontagastodepreBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGastoDepreciacion");
					cuentacontagastodepreBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContaGastoDepre(true);
					cuentacontagastodepreBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("n",cuentacontagastodepreBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentacontagastodepreBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentacontagastodepreBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentacontagastodepreBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentacontagastodepreBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContaGastoDepre("relacionado");
					} else {
						cuentacontagastodepreBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContaGastoDepre("no_relacionado");
					}

					cuentacontagastodepreBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaContaGastoDepre().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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

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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.ParametroPlanillaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class ParametroPlanillaDetalleFormJInternalFrame extends ParametroPlanillaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroPlanilla;
	
	protected JMenuBar jmenuBarDetalleParametroPlanilla;
	
	protected JMenu jmenuDetalleParametroPlanilla;
	protected JMenu jmenuDetalleArchivoParametroPlanilla;
	protected JMenu jmenuDetalleAccionesParametroPlanilla;
	protected JMenu jmenuDetalleDatosParametroPlanilla;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroPlanilla;	
	protected GridBagConstraints gridBagConstraintsParametroPlanilla;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroPlanillaBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroPlanilla;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinicialBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinicial="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefinalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefinal="";
	
	public ParametroPlanillaSessionBean parametroplanillaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableinicialSessionBean;
	public CuentaContableSessionBean cuentacontablefinalSessionBean;	
	
	public ParametroPlanillaLogic parametroplanillaLogic;
	
	public JScrollPane jScrollPanelDatosParametroPlanilla;
	public JScrollPane jScrollPanelDatosEdicionParametroPlanilla;
	public JScrollPane jScrollPanelDatosGeneralParametroPlanilla;
	
	protected JPanel jPanelCamposParametroPlanilla;    
	protected JPanel jPanelCamposOcultosParametroPlanilla;    	
	protected JPanel jPanelAccionesParametroPlanilla;
	protected JPanel jPanelAccionesFormularioParametroPlanilla;
    
	
	
	protected Integer iXPanelCamposParametroPlanilla=0;
	protected Integer iYPanelCamposParametroPlanilla=0;
	
	protected Integer iXPanelCamposOcultosParametroPlanilla=0;
	protected Integer iYPanelCamposOcultosParametroPlanilla=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroPlanilla;
	public JButton jButtonModificarParametroPlanilla;
	public JButton jButtonActualizarParametroPlanilla;
    public JButton jButtonEliminarParametroPlanilla;
	public JButton jButtonCancelarParametroPlanilla;
    public JButton jButtonGuardarCambiosParametroPlanilla;
	public JButton jButtonGuardarCambiosTablaParametroPlanilla;
	protected JButton jButtonCerrarParametroPlanilla;
	
	
	protected JButton jButtonProcesarInformacionParametroPlanilla;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroPlanilla;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroPlanilla;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroPlanilla;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroPlanilla;
	protected JButton jButtonModificarToolBarParametroPlanilla;
	protected JButton jButtonActualizarToolBarParametroPlanilla;
    protected JButton jButtonEliminarToolBarParametroPlanilla;
	protected JButton jButtonCancelarToolBarParametroPlanilla;
    protected JButton jButtonGuardarCambiosToolBarParametroPlanilla;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroPlanilla;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroPlanilla;
	protected JButton jButtonCerrarToolBarParametroPlanilla;
	
	protected JButton jButtonProcesarInformacionToolBarParametroPlanilla;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroPlanilla;
	protected JMenuItem jMenuItemModificarParametroPlanilla;
	protected JMenuItem jMenuItemActualizarParametroPlanilla;
    protected JMenuItem jMenuItemEliminarParametroPlanilla;
	protected JMenuItem jMenuItemCancelarParametroPlanilla;
    protected JMenuItem jMenuItemGuardarCambiosParametroPlanilla;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroPlanilla;
	protected JMenuItem jMenuItemCerrarParametroPlanilla;
	protected JMenuItem jMenuItemDetalleCerrarParametroPlanilla;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroPlanilla;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroPlanilla;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroPlanilla;
	protected JMenuItem jMenuItemMostrarOcultarParametroPlanilla;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroPlanilla;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroPlanilla;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroPlanilla;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroPlanilla;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroPlanilla;
	public JLabel jLabelIdParametroPlanilla;
	public JLabel jLabelidParametroPlanilla;
	public JButton jButtonidParametroPlanillaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroPlanilla;
	public JLabel jLabelid_empresaParametroPlanilla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroPlanilla;
	public JButton jButtonid_empresaParametroPlanilla= new JButtonMe();
	public JButton jButtonid_empresaParametroPlanillaUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroPlanillaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inicialParametroPlanilla;
	public JLabel jLabelid_cuenta_contable_inicialParametroPlanilla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inicialParametroPlanilla;
	public JButton jButtonid_cuenta_contable_inicialParametroPlanilla= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inicialParametroPlanillaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inicialParametroPlanillaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_finalParametroPlanilla;
	public JLabel jLabelid_cuenta_contable_finalParametroPlanilla;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_finalParametroPlanilla;
	public JButton jButtonid_cuenta_contable_finalParametroPlanilla= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finalParametroPlanillaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finalParametroPlanillaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finalParametroPlanillaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroPlanilla;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroPlanillaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroPlanilla=new JPanel();
				this.jPanelAccionesFormularioParametroPlanilla=new JPanel();
				this.jmenuBarDetalleParametroPlanilla=new JMenuBar();
				this.jTtoolBarDetalleParametroPlanilla=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroPlanillaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroPlanillaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroPlanillaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroPlanillaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroPlanillaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroPlanilla No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroPlanilla() {
		return this.jButtonActualizarToolBarParametroPlanilla;
	}
	
	public JButton getjButtonEliminarToolBarParametroPlanilla() {
		return this.jButtonEliminarToolBarParametroPlanilla;
	}
	
	public JButton getjButtonCancelarToolBarParametroPlanilla() {
		return this.jButtonCancelarToolBarParametroPlanilla;
	}		
	
	public JButton getjButtonProcesarInformacionParametroPlanilla() {
		return this.jButtonProcesarInformacionParametroPlanilla;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroPlanilla)	{
		this.jButtonProcesarInformacionParametroPlanilla = jButtonProcesarInformacionParametroPlanilla;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroPlanilla() {
		return this.jComboBoxTiposAccionesParametroPlanilla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroPlanilla(
			JComboBox jComboBoxTiposRelacionesParametroPlanilla) {
		this.jComboBoxTiposRelacionesParametroPlanilla = jComboBoxTiposRelacionesParametroPlanilla;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroPlanilla(
			JComboBox jComboBoxTiposAccionesParametroPlanilla) {
		this.jComboBoxTiposAccionesParametroPlanilla = jComboBoxTiposAccionesParametroPlanilla;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroPlanilla() {
		return this.jComboBoxTiposAccionesFormularioParametroPlanilla;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroPlanilla(
			JComboBox jComboBoxTiposAccionesFormularioParametroPlanilla) {
		this.jComboBoxTiposAccionesFormularioParametroPlanilla = jComboBoxTiposAccionesFormularioParametroPlanilla;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
		
		this.parametroplanillaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroplanillaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroplanillaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroPlanillaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroPlanillaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroPlanillaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Planilla MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroPlanillaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroPlanilla= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroPlanilla=new JButtonMe();
				this.jButtonModificarToolBarParametroPlanilla=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroPlanilla,this.jTtoolBarDetalleParametroPlanilla,
							"actualizar","actualizar","Actualizar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroPlanilla,this.jTtoolBarDetalleParametroPlanilla,
							"eliminar","eliminar","Eliminar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroPlanilla,this.jTtoolBarDetalleParametroPlanilla,
							"cancelar","cancelar","Cancelar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroPlanilla=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroPlanilla,this.jTtoolBarDetalleParametroPlanilla,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroPlanilla=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroPlanilla=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroPlanilla=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroPlanilla=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroPlanilla=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroPlanilla= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroPlanilla.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroPlanilla,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroPlanilla= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroPlanilla.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroPlanilla,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroPlanilla= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroPlanilla.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroPlanilla,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroPlanilla= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroPlanilla.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroPlanilla,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroPlanilla= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroPlanilla.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroPlanilla,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroPlanilla= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroPlanilla.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroPlanilla,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroPlanilla= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroPlanilla.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroPlanilla,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroPlanilla= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroPlanilla.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroPlanilla,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroPlanilla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroPlanilla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroPlanilla,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroPlanilla= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroPlanilla.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroPlanilla,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroPlanilla.add(this.jMenuItemDetalleCerrarParametroPlanilla);
		
		this.jmenuDetalleAccionesParametroPlanilla.add(this.jMenuItemActualizarParametroPlanilla);
		this.jmenuDetalleAccionesParametroPlanilla.add(this.jMenuItemEliminarParametroPlanilla);
		this.jmenuDetalleAccionesParametroPlanilla.add(this.jMenuItemCancelarParametroPlanilla);		
		
		//this.jmenuDetalleDatosParametroPlanilla.add(this.jMenuItemDetalleAbrirOrderByParametroPlanilla);				
		this.jmenuDetalleDatosParametroPlanilla.add(this.jMenuItemDetalleMostarOcultarParametroPlanilla);				
				
		//this.jmenuDetalleAccionesParametroPlanilla.add(this.jMenuItemGuardarCambiosParametroPlanilla);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroPlanilla.add(this.jmenuDetalleArchivoParametroPlanilla);		
		this.jmenuBarDetalleParametroPlanilla.add(this.jmenuDetalleAccionesParametroPlanilla);		
		this.jmenuBarDetalleParametroPlanilla.add(this.jmenuDetalleDatosParametroPlanilla);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroPlanilla);				
	}
	
	
	public void inicializarElementosCamposParametroPlanilla() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroPlanilla = new JLabelMe();
		jLabelIdParametroPlanilla.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroPlanilla = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroPlanilla.setToolTipText(ParametroPlanillaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroPlanilla= new GridBagLayout();

		this.jPanelidParametroPlanilla.setLayout(this.gridaBagLayoutParametroPlanilla);

		jLabelidParametroPlanilla = new JLabel();
		jLabelidParametroPlanilla.setText("Id");

		jLabelidParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroPlanilla() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroPlanilla = new JLabelMe();
		this.jLabelid_empresaParametroPlanilla.setText(""+ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroPlanilla.setToolTipText("Empresa");
		this.jLabelid_empresaParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroPlanilla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroPlanilla.setToolTipText(ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroPlanilla = new GridBagLayout();
		this.jPanelid_empresaParametroPlanilla.setLayout(this.gridaBagLayoutParametroPlanilla);


		jComboBoxid_empresaParametroPlanilla= new JComboBoxMe();
		jComboBoxid_empresaParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroPlanilla.setEnabled(false);

		this.jButtonid_empresaParametroPlanilla= new JButtonMe();
		this.jButtonid_empresaParametroPlanilla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroPlanilla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroPlanilla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroPlanilla.setText("Buscar");
		this.jButtonid_empresaParametroPlanilla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroPlanilla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroPlanilla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroPlanilla"));

		this.jButtonid_empresaParametroPlanillaBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroPlanillaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroPlanillaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroPlanillaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroPlanillaBusqueda.setText("U");
		this.jButtonid_empresaParametroPlanillaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroPlanillaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroPlanillaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroPlanillaBusqueda"));

		if(this.parametroplanillaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroPlanillaBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroPlanillaUpdate= new JButtonMe();
		this.jButtonid_empresaParametroPlanillaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroPlanillaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroPlanillaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroPlanillaUpdate.setText("U");
		this.jButtonid_empresaParametroPlanillaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroPlanillaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroPlanillaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroPlanillaUpdate"));



					
		this.jLabelid_cuenta_contable_inicialParametroPlanilla = new JLabelMe();
		this.jLabelid_cuenta_contable_inicialParametroPlanilla.setText(""+ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL+" : *");
		this.jLabelid_cuenta_contable_inicialParametroPlanilla.setToolTipText("Cuenta C. Inicial");
		this.jLabelid_cuenta_contable_inicialParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_inicialParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_inicialParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inicialParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inicialParametroPlanilla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inicialParametroPlanilla.setToolTipText(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL);
		this.gridaBagLayoutParametroPlanilla = new GridBagLayout();
		this.jPanelid_cuenta_contable_inicialParametroPlanilla.setLayout(this.gridaBagLayoutParametroPlanilla);


		jComboBoxid_cuenta_contable_inicialParametroPlanilla= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inicialParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inicialParametroPlanilla= new JButtonMe();
		this.jButtonid_cuenta_contable_inicialParametroPlanilla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inicialParametroPlanilla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inicialParametroPlanilla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inicialParametroPlanilla.setText("Buscar");
		this.jButtonid_cuenta_contable_inicialParametroPlanilla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inicialParametroPlanilla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inicialParametroPlanilla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inicialParametroPlanilla"));

		this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inicialParametroPlanillaBusqueda"));

		if(this.parametroplanillaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.setText("U");
		this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inicialParametroPlanillaUpdate"));


		jButtonid_cuenta_contable_inicialParametroPlanillaArbol= new JButtonMe();
		jButtonid_cuenta_contable_inicialParametroPlanillaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inicialParametroPlanillaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inicialParametroPlanillaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inicialParametroPlanillaArbol.setText("Arbol");
		jButtonid_cuenta_contable_inicialParametroPlanillaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inicialParametroPlanillaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inicialParametroPlanillaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inicialParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inicialParametroPlanillaArbol"));



					
		this.jLabelid_cuenta_contable_finalParametroPlanilla = new JLabelMe();
		this.jLabelid_cuenta_contable_finalParametroPlanilla.setText(""+ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL+" : *");
		this.jLabelid_cuenta_contable_finalParametroPlanilla.setToolTipText("Cuenta C. Final");
		this.jLabelid_cuenta_contable_finalParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_finalParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_finalParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_finalParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_finalParametroPlanilla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_finalParametroPlanilla.setToolTipText(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL);
		this.gridaBagLayoutParametroPlanilla = new GridBagLayout();
		this.jPanelid_cuenta_contable_finalParametroPlanilla.setLayout(this.gridaBagLayoutParametroPlanilla);


		jComboBoxid_cuenta_contable_finalParametroPlanilla= new JComboBoxMe();
		jComboBoxid_cuenta_contable_finalParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finalParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finalParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_finalParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_finalParametroPlanilla= new JButtonMe();
		this.jButtonid_cuenta_contable_finalParametroPlanilla.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finalParametroPlanilla.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finalParametroPlanilla.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finalParametroPlanilla.setText("Buscar");
		this.jButtonid_cuenta_contable_finalParametroPlanilla.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_finalParametroPlanilla.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finalParametroPlanilla,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finalParametroPlanilla"));

		this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finalParametroPlanillaBusqueda"));

		if(this.parametroplanillaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.setText("U");
		this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finalParametroPlanillaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finalParametroPlanillaUpdate"));


		jButtonid_cuenta_contable_finalParametroPlanillaArbol= new JButtonMe();
		jButtonid_cuenta_contable_finalParametroPlanillaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finalParametroPlanillaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finalParametroPlanillaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finalParametroPlanillaArbol.setText("Arbol");
		jButtonid_cuenta_contable_finalParametroPlanillaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_finalParametroPlanillaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finalParametroPlanillaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finalParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finalParametroPlanillaArbol"));



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
		//this.jInternalFrameDetalleParametroPlanilla = new ParametroPlanillaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Planilla DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroPlanilla= new GridBagLayout();
		

		
		String sToolTipParametroPlanilla="";
		sToolTipParametroPlanilla=ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroPlanilla+="(Contabilidad.ParametroPlanilla)";
		}
		
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroPlanilla+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroPlanilla = new JButtonMe();
		this.jButtonModificarParametroPlanilla = new JButtonMe();
        this.jButtonActualizarParametroPlanilla = new JButtonMe();
        this.jButtonEliminarParametroPlanilla = new JButtonMe();
        this.jButtonCancelarParametroPlanilla = new JButtonMe();
        this.jButtonGuardarCambiosParametroPlanilla = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroPlanilla = new JButtonMe();
		this.jButtonCerrarParametroPlanilla = new JButtonMe();
		
		this.jScrollPanelDatosParametroPlanilla = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroPlanilla = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroPlanilla = new JScrollPane();
				
		
		
		this.jPanelCamposParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Planilla";
		
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Planillas" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroPlanilla.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroPlanilla.setName("jPanelCamposParametroPlanilla"); 

		this.jPanelCamposOcultosParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroPlanilla.setName("jPanelCamposOcultosParametroPlanilla"); 

        this.jPanelAccionesParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroPlanilla.setToolTipText("Acciones");
        this.jPanelAccionesParametroPlanilla.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroPlanilla.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroPlanilla.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroPlanilla.setText("Nuevo");
		this.jButtonModificarParametroPlanilla.setText("Editar");
        this.jButtonActualizarParametroPlanilla.setText("Actualizar");
        this.jButtonEliminarParametroPlanilla.setText("Eliminar");
        this.jButtonCancelarParametroPlanilla.setText("Cancelar");
        this.jButtonGuardarCambiosParametroPlanilla.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroPlanilla.setText("Guardar");
		this.jButtonCerrarParametroPlanilla.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroPlanilla,"nuevo_button","Nuevo",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroPlanilla,"modificar_button","Editar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroPlanilla,"actualizar_button","Actualizar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroPlanilla,"eliminar_button","Eliminar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroPlanilla,"cancelar_button","Cancelar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroPlanilla,"guardarcambios_button","Guardar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroPlanilla,"guardarcambiostabla_button","Guardar",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroPlanilla,"cerrar_button","Salir",this.parametroplanillaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroPlanilla.setToolTipText("Nuevo"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroPlanilla.setToolTipText("Editar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroPlanilla.setToolTipText("Actualizar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroPlanilla.setToolTipText("Eliminar)"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroPlanilla.setToolTipText("Cancelar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroPlanilla.setToolTipText("Guardar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroPlanilla.setToolTipText("Guardar"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroPlanilla.setToolTipText("Salir"+" "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroPlanilla";
		inputMap = this.jButtonNuevoParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroPlanilla.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroPlanilla"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroPlanilla";
		inputMap = this.jButtonActualizarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroPlanilla"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroPlanilla";
		inputMap = this.jButtonEliminarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroPlanilla"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroPlanilla";
		inputMap = this.jButtonCancelarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroPlanilla"));
		
		//CERRAR		
		sMapKey = "CerrarParametroPlanilla";
		inputMap = this.jButtonCerrarParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroPlanilla"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroPlanilla";
		inputMap = this.jButtonGuardarCambiosTablaParametroPlanilla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroPlanilla.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroPlanilla"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroPlanilla = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroPlanilla.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroPlanilla.setToolTipText("Nuevo ParametroPlanilla");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroPlanilla = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroPlanilla.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroPlanilla.setToolTipText("Sin Cerrar Ventana ParametroPlanilla");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroPlanilla = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroPlanilla.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroPlanilla.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroPlanilla.setText("Accion");
		this.jComboBoxTiposAccionesParametroPlanilla.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroPlanilla = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroPlanilla.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroPlanilla.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroPlanilla = new JLabelMe();
		
		this.jLabelAccionesParametroPlanilla.setText("Acciones");		
		this.jLabelAccionesParametroPlanilla.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroPlanilla.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroPlanilla.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroPlanilla();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroPlanilla();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroPlanilla=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroPlanilla,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroPlanilla.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroPlanilla.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroPlanilla.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroPlanilla, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroPlanilla.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroPlanilla.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroPlanilla.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroPlanilla, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroPlanilla = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroPlanilla = new GridBagLayout();
		
		this.jPanelCamposParametroPlanilla.setLayout(gridaBagLayoutCamposParametroPlanilla);
		this.jPanelCamposOcultosParametroPlanilla.setLayout(gridaBagLayoutCamposOcultosParametroPlanilla);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 0;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroPlanilla.add(jLabelIdParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 1;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroPlanilla.add(jLabelidParametroPlanilla, this.gridBagConstraintsParametroPlanilla);


	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 0;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroPlanilla.add(jLabelid_empresaParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = 2;
		this.gridBagConstraintsParametroPlanilla.ipadx = 0;
		this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroPlanilla.add(jButtonid_empresaParametroPlanillaBusqueda, this.gridBagConstraintsParametroPlanilla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = 3;
		this.gridBagConstraintsParametroPlanilla.ipadx = 0;
		this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroPlanilla.add(jButtonid_empresaParametroPlanillaUpdate, this.gridBagConstraintsParametroPlanilla);
	}

	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 1;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroPlanilla.add(jComboBoxid_empresaParametroPlanilla, this.gridBagConstraintsParametroPlanilla);


	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 0;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inicialParametroPlanilla.add(jLabelid_cuenta_contable_inicialParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 2;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inicialParametroPlanilla.add(jButtonid_cuenta_contable_inicialParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 3;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inicialParametroPlanilla.add(jButtonid_cuenta_contable_inicialParametroPlanillaArbol, this.gridBagConstraintsParametroPlanilla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = 4;
		this.gridBagConstraintsParametroPlanilla.ipadx = 0;
		this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inicialParametroPlanilla.add(jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda, this.gridBagConstraintsParametroPlanilla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = 5;
		this.gridBagConstraintsParametroPlanilla.ipadx = 0;
		this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inicialParametroPlanilla.add(jButtonid_cuenta_contable_inicialParametroPlanillaUpdate, this.gridBagConstraintsParametroPlanilla);
	}

	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 1;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inicialParametroPlanilla.add(jComboBoxid_cuenta_contable_inicialParametroPlanilla, this.gridBagConstraintsParametroPlanilla);


	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 0;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_finalParametroPlanilla.add(jLabelid_cuenta_contable_finalParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 2;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_finalParametroPlanilla.add(jButtonid_cuenta_contable_finalParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 3;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_finalParametroPlanilla.add(jButtonid_cuenta_contable_finalParametroPlanillaArbol, this.gridBagConstraintsParametroPlanilla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = 4;
		this.gridBagConstraintsParametroPlanilla.ipadx = 0;
		this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_finalParametroPlanilla.add(jButtonid_cuenta_contable_finalParametroPlanillaBusqueda, this.gridBagConstraintsParametroPlanilla);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		//this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = 5;
		this.gridBagConstraintsParametroPlanilla.ipadx = 0;
		this.gridBagConstraintsParametroPlanilla.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_finalParametroPlanilla.add(jButtonid_cuenta_contable_finalParametroPlanillaUpdate, this.gridBagConstraintsParametroPlanilla);
	}

	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroPlanilla.gridy = 0;
	this.gridBagConstraintsParametroPlanilla.gridx = 1;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_finalParametroPlanilla.add(jComboBoxid_cuenta_contable_finalParametroPlanilla, this.gridBagConstraintsParametroPlanilla);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroPlanilla.gridy = iYPanelCamposParametroPlanilla;
	this.gridBagConstraintsParametroPlanilla.gridx = iXPanelCamposParametroPlanilla++;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroPlanilla.add(this.jPanelidParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	if(iXPanelCamposParametroPlanilla % 1==0) {
		iXPanelCamposParametroPlanilla=0;
		iYPanelCamposParametroPlanilla++;
	}
	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroPlanilla.gridy = iYPanelCamposParametroPlanilla;
	this.gridBagConstraintsParametroPlanilla.gridx = iXPanelCamposParametroPlanilla++;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroPlanilla.add(this.jPanelid_cuenta_contable_inicialParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	if(iXPanelCamposParametroPlanilla % 1==0) {
		iXPanelCamposParametroPlanilla=0;
		iYPanelCamposParametroPlanilla++;
	}
	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroPlanilla.gridy = iYPanelCamposParametroPlanilla;
	this.gridBagConstraintsParametroPlanilla.gridx = iXPanelCamposParametroPlanilla++;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroPlanilla.add(this.jPanelid_cuenta_contable_finalParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	if(iXPanelCamposParametroPlanilla % 1==0) {
		iXPanelCamposParametroPlanilla=0;
		iYPanelCamposParametroPlanilla++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroPlanilla.gridy = iYPanelCamposOcultosParametroPlanilla;
	this.gridBagConstraintsParametroPlanilla.gridx = iXPanelCamposOcultosParametroPlanilla++;
	this.gridBagConstraintsParametroPlanilla.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroPlanilla.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroPlanilla.add(this.jPanelid_empresaParametroPlanilla, this.gridBagConstraintsParametroPlanilla);



	if(iXPanelCamposOcultosParametroPlanilla % 1==0) {
		iXPanelCamposOcultosParametroPlanilla=0;
		iYPanelCamposOcultosParametroPlanilla++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroPlanilla= new GridBagLayout();
		this.jPanelAccionesParametroPlanilla.setLayout(gridaBagLayoutAccionesParametroPlanilla);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroPlanilla= new GridBagLayout();
		this.jPanelAccionesFormularioParametroPlanilla.setLayout(gridaBagLayoutAccionesFormularioParametroPlanilla);
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroPlanilla.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroPlanilla.add(this.jComboBoxTiposAccionesFormularioParametroPlanilla, this.gridBagConstraintsParametroPlanilla);

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroPlanilla.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroPlanilla.add(this.jCheckBoxPostAccionNuevoParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroPlanilla.add(this.jCheckBoxPostAccionSinCerrarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroPlanilla.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroPlanilla.add(this.jCheckBoxPostAccionSinMensajeParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroPlanilla.add(this.jButtonModificarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);							

		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroPlanilla.gridy = 0;
		this.gridBagConstraintsParametroPlanilla.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroPlanilla.add(this.jButtonEliminarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
			
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = 0;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroPlanilla.add(this.jButtonActualizarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);


		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = 0;		
		this.gridBagConstraintsParametroPlanilla.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroPlanilla.add(this.jButtonGuardarCambiosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);	
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = 0;		
		this.gridBagConstraintsParametroPlanilla.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroPlanilla.add(this.jButtonCancelarParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroPlanilla = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroPlanilla);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();						
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroPlanilla.gridx = 0;		
			//this.gridBagConstraintsParametroPlanilla.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroPlanilla.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroPlanilla.gridx =0;
		this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroPlanilla.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroPlanilla = new ParametroPlanillaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Planilla DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Planilla DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Planilla Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroPlanillaModel parametroplanillaModel=new ParametroPlanillaModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroPlanillaModel.ParametroPlanillaFocusTraversalPolicy parametroplanillaFocusTraversalPolicy = parametroplanillaModel.new ParametroPlanillaFocusTraversalPolicy(this);
			
			//parametroplanillaFocusTraversalPolicy.setparametroplanillaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroplanillaModel);
			
			
			this.jContentPaneDetalleParametroPlanilla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroPlanilla = new GridBagLayout();	
			this.jContentPaneDetalleParametroPlanilla.setLayout(gridaBagLayoutDetalleParametroPlanilla);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroPlanilla = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
				this.gridBagConstraintsParametroPlanilla.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroPlanilla.gridx = 0;
					
				
				this.jContentPaneDetalleParametroPlanilla.add(jTtoolBarDetalleParametroPlanilla, gridBagConstraintsParametroPlanilla);								
				
}
			
			this.jScrollPanelDatosEdicionParametroPlanilla=   new JScrollPane(jContentPaneDetalleParametroPlanilla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroPlanilla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroPlanilla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroPlanilla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroPlanilla=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroPlanilla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroPlanilla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroPlanilla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroPlanilla.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroPlanilla.gridx = 0;
	        
			this.jContentPaneDetalleParametroPlanilla.add(jPanelCamposParametroPlanilla, gridBagConstraintsParametroPlanilla);
			
			
			
			
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
						&& parametroplanillaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroPlanilla= new GridBagConstraints();
						this.gridBagConstraintsParametroPlanilla.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroPlanilla.gridx = 0;
						this.jContentPaneDetalleParametroPlanilla.add(this.jTabbedPaneRelacionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroPlanilla.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroPlanilla.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
					this.gridBagConstraintsParametroPlanilla.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroPlanilla.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroPlanilla.gridx = 0;
					
				
					this.jContentPaneDetalleParametroPlanilla.add(jPanelCamposOcultosParametroPlanilla, gridBagConstraintsParametroPlanilla);
				
					this.jPanelCamposOcultosParametroPlanilla.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroPlanilla.gridx = 0;
	        this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroPlanilla.add(this.jPanelAccionesFormularioParametroPlanilla, this.gridBagConstraintsParametroPlanilla);							
			
			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
	        this.gridBagConstraintsParametroPlanilla.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroPlanilla.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroPlanilla.add(this.jPanelAccionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroPlanilla);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroPlanilla=   new JScrollPane(this.jPanelCamposParametroPlanilla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroPlanilla.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroPlanilla.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroPlanilla.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroPlanilla.gridx = 0;
			this.gridBagConstraintsParametroPlanilla.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroPlanilla.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroPlanilla.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroPlanilla.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroPlanilla, this.gridBagConstraintsParametroPlanilla);			
			
			this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
			this.gridBagConstraintsParametroPlanilla.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroPlanilla.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
			
			
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		
			
		this.gridBagConstraintsParametroPlanilla = new GridBagConstraints();
		this.gridBagConstraintsParametroPlanilla.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroPlanilla.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroPlanilla, this.gridBagConstraintsParametroPlanilla);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroPlanilla;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroPlanilla;
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

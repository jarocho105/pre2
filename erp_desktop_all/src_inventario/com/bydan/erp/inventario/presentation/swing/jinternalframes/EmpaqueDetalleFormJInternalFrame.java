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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.EmpaqueConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class EmpaqueDetalleFormJInternalFrame extends EmpaqueBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpaque;
	
	protected JMenuBar jmenuBarDetalleEmpaque;
	
	protected JMenu jmenuDetalleEmpaque;
	protected JMenu jmenuDetalleArchivoEmpaque;
	protected JMenu jmenuDetalleAccionesEmpaque;
	protected JMenu jmenuDetalleDatosEmpaque;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpaque;	
	protected GridBagConstraints gridBagConstraintsEmpaque;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpaqueBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpaque;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EmpaqueSessionBean empaqueSessionBean;
	
	

	public DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame=null;
	public DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleProforma=false;
	public DetalleProformaSessionBean detalleproformaSessionBean;

	public DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame=null;
	public DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaNotaCreditoSoli=false;
	public DetaNotaCreditoSoliSessionBean detanotacreditosoliSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public EmpaqueLogic empaqueLogic;
	
	public JScrollPane jScrollPanelDatosEmpaque;
	public JScrollPane jScrollPanelDatosEdicionEmpaque;
	public JScrollPane jScrollPanelDatosGeneralEmpaque;
	
	protected JPanel jPanelCamposEmpaque;    
	protected JPanel jPanelCamposOcultosEmpaque;    	
	protected JPanel jPanelAccionesEmpaque;
	protected JPanel jPanelAccionesFormularioEmpaque;
    
	
	
	protected Integer iXPanelCamposEmpaque=0;
	protected Integer iYPanelCamposEmpaque=0;
	
	protected Integer iXPanelCamposOcultosEmpaque=0;
	protected Integer iYPanelCamposOcultosEmpaque=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpaque;
	public JButton jButtonModificarEmpaque;
	public JButton jButtonActualizarEmpaque;
    public JButton jButtonEliminarEmpaque;
	public JButton jButtonCancelarEmpaque;
    public JButton jButtonGuardarCambiosEmpaque;
	public JButton jButtonGuardarCambiosTablaEmpaque;
	protected JButton jButtonCerrarEmpaque;
	
	
	protected JButton jButtonProcesarInformacionEmpaque;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpaque;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpaque;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpaque;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpaque;
	protected JButton jButtonModificarToolBarEmpaque;
	protected JButton jButtonActualizarToolBarEmpaque;
    protected JButton jButtonEliminarToolBarEmpaque;
	protected JButton jButtonCancelarToolBarEmpaque;
    protected JButton jButtonGuardarCambiosToolBarEmpaque;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpaque;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpaque;
	protected JButton jButtonCerrarToolBarEmpaque;
	
	protected JButton jButtonProcesarInformacionToolBarEmpaque;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpaque;
	protected JMenuItem jMenuItemModificarEmpaque;
	protected JMenuItem jMenuItemActualizarEmpaque;
    protected JMenuItem jMenuItemEliminarEmpaque;
	protected JMenuItem jMenuItemCancelarEmpaque;
    protected JMenuItem jMenuItemGuardarCambiosEmpaque;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpaque;
	protected JMenuItem jMenuItemCerrarEmpaque;
	protected JMenuItem jMenuItemDetalleCerrarEmpaque;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpaque;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpaque;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpaque;
	protected JMenuItem jMenuItemMostrarOcultarEmpaque;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpaque;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpaque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpaque;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpaque;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpaque;
	public JLabel jLabelIdEmpaque;
	public JLabel jLabelidEmpaque;
	public JButton jButtonidEmpaqueBusqueda= new JButtonMe();

	public JPanel jPanelvalorEmpaque;
	public JLabel jLabelvalorEmpaque;
	public JTextField jTextFieldvalorEmpaque;
	public JButton jButtonvalorEmpaqueBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEmpaque;
	public JLabel jLabeldescripcionEmpaque;
	public JTextArea jTextAreadescripcionEmpaque;
	public JScrollPane jscrollPanedescripcionEmpaque;
	public JButton jButtondescripcionEmpaqueBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpaque;
	public JLabel jLabelid_empresaEmpaque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpaque;
	public JButton jButtonid_empresaEmpaque= new JButtonMe();
	public JButton jButtonid_empresaEmpaqueUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpaqueBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpaque;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpaqueDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpaque=new JPanel();
				this.jPanelAccionesFormularioEmpaque=new JPanel();
				this.jmenuBarDetalleEmpaque=new JMenuBar();
				this.jTtoolBarDetalleEmpaque=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpaqueDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpaqueDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpaqueDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpaqueDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpaqueDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpaque() {
		return this.jButtonActualizarToolBarEmpaque;
	}
	
	public JButton getjButtonEliminarToolBarEmpaque() {
		return this.jButtonEliminarToolBarEmpaque;
	}
	
	public JButton getjButtonCancelarToolBarEmpaque() {
		return this.jButtonCancelarToolBarEmpaque;
	}		
	
	public JButton getjButtonProcesarInformacionEmpaque() {
		return this.jButtonProcesarInformacionEmpaque;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpaque)	{
		this.jButtonProcesarInformacionEmpaque = jButtonProcesarInformacionEmpaque;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpaque() {
		return this.jComboBoxTiposAccionesEmpaque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpaque(
			JComboBox jComboBoxTiposRelacionesEmpaque) {
		this.jComboBoxTiposRelacionesEmpaque = jComboBoxTiposRelacionesEmpaque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpaque(
			JComboBox jComboBoxTiposAccionesEmpaque) {
		this.jComboBoxTiposAccionesEmpaque = jComboBoxTiposAccionesEmpaque;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpaque() {
		return this.jComboBoxTiposAccionesFormularioEmpaque;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpaque(
			JComboBox jComboBoxTiposAccionesFormularioEmpaque) {
		this.jComboBoxTiposAccionesFormularioEmpaque = jComboBoxTiposAccionesFormularioEmpaque;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empaqueSessionBean=new EmpaqueSessionBean();
		
		this.empaqueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empaqueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empaqueSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		//this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpaqueJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empaque MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpaqueJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpaque= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpaque=new JButtonMe();
				this.jButtonModificarToolBarEmpaque=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpaque,this.jTtoolBarDetalleEmpaque,
							"actualizar","actualizar","Actualizar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpaque,this.jTtoolBarDetalleEmpaque,
							"eliminar","eliminar","Eliminar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpaque,this.jTtoolBarDetalleEmpaque,
							"cancelar","cancelar","Cancelar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpaque,this.jTtoolBarDetalleEmpaque,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpaque=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpaque=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpaque=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpaque=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpaque=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpaque= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpaque.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpaque,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpaque= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpaque.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpaque,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpaque= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpaque.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpaque,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpaque= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpaque.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpaque,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpaque= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpaque.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpaque,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpaque= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpaque.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpaque,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpaque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpaque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpaque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpaque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpaque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpaque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpaque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpaque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpaque,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpaque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpaque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpaque,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpaque.add(this.jMenuItemDetalleCerrarEmpaque);
		
		this.jmenuDetalleAccionesEmpaque.add(this.jMenuItemActualizarEmpaque);
		this.jmenuDetalleAccionesEmpaque.add(this.jMenuItemEliminarEmpaque);
		this.jmenuDetalleAccionesEmpaque.add(this.jMenuItemCancelarEmpaque);		
		
		//this.jmenuDetalleDatosEmpaque.add(this.jMenuItemDetalleAbrirOrderByEmpaque);				
		this.jmenuDetalleDatosEmpaque.add(this.jMenuItemDetalleMostarOcultarEmpaque);				
				
		//this.jmenuDetalleAccionesEmpaque.add(this.jMenuItemGuardarCambiosEmpaque);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpaque.add(this.jmenuDetalleArchivoEmpaque);		
		this.jmenuBarDetalleEmpaque.add(this.jmenuDetalleAccionesEmpaque);		
		this.jmenuBarDetalleEmpaque.add(this.jmenuDetalleDatosEmpaque);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEmpaque.add(this.jmenuDetalleEmpaque);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpaque);				
	}
	
	
	public void inicializarElementosCamposEmpaque() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpaque = new JLabelMe();
		jLabelIdEmpaque.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpaque = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpaque.setToolTipText(EmpaqueConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpaque= new GridBagLayout();

		this.jPanelidEmpaque.setLayout(this.gridaBagLayoutEmpaque);

		jLabelidEmpaque = new JLabel();
		jLabelidEmpaque.setText("Id");

		jLabelidEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorEmpaque = new JLabelMe();
		this.jLabelvalorEmpaque.setText(""+EmpaqueConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorEmpaque.setToolTipText("Valor");
		this.jLabelvalorEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorEmpaque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorEmpaque.setToolTipText(EmpaqueConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutEmpaque = new GridBagLayout();
		this.jPanelvalorEmpaque.setLayout(this.gridaBagLayoutEmpaque);


		jTextFieldvalorEmpaque= new JTextFieldMe();
		jTextFieldvalorEmpaque.setEnabled(false);
		jTextFieldvalorEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorEmpaque.setText("0.0");

		this.jButtonvalorEmpaqueBusqueda= new JButtonMe();
		this.jButtonvalorEmpaqueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorEmpaqueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorEmpaqueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorEmpaqueBusqueda.setText("U");
		this.jButtonvalorEmpaqueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorEmpaqueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorEmpaqueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorEmpaqueBusqueda"));

		if(this.empaqueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorEmpaqueBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEmpaque = new JLabelMe();
		this.jLabeldescripcionEmpaque.setText(""+EmpaqueConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionEmpaque.setToolTipText("Descripcion");
		this.jLabeldescripcionEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEmpaque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEmpaque.setToolTipText(EmpaqueConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEmpaque = new GridBagLayout();
		this.jPaneldescripcionEmpaque.setLayout(this.gridaBagLayoutEmpaque);


		jTextAreadescripcionEmpaque= new JTextAreaMe();
		jTextAreadescripcionEmpaque.setEnabled(false);
		jTextAreadescripcionEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpaque.setLineWrap(true);
		jTextAreadescripcionEmpaque.setWrapStyleWord(true);
		jTextAreadescripcionEmpaque.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEmpaque.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEmpaque = new JScrollPane(jTextAreadescripcionEmpaque);
		jscrollPanedescripcionEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionEmpaqueBusqueda= new JButtonMe();
		this.jButtondescripcionEmpaqueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpaqueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpaqueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEmpaqueBusqueda.setText("U");
		this.jButtondescripcionEmpaqueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEmpaqueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEmpaqueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEmpaqueBusqueda"));

		if(this.empaqueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEmpaqueBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpaque() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpaque = new JLabelMe();
		this.jLabelid_empresaEmpaque.setText(""+EmpaqueConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpaque.setToolTipText("Empresa");
		this.jLabelid_empresaEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpaque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpaque.setToolTipText(EmpaqueConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpaque = new GridBagLayout();
		this.jPanelid_empresaEmpaque.setLayout(this.gridaBagLayoutEmpaque);


		jComboBoxid_empresaEmpaque= new JComboBoxMe();
		jComboBoxid_empresaEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpaque.setEnabled(false);

		this.jButtonid_empresaEmpaque= new JButtonMe();
		this.jButtonid_empresaEmpaque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpaque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpaque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpaque.setText("Buscar");
		this.jButtonid_empresaEmpaque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpaque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpaque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpaque"));

		this.jButtonid_empresaEmpaqueBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpaqueBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpaqueBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpaqueBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpaqueBusqueda.setText("U");
		this.jButtonid_empresaEmpaqueBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpaqueBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpaqueBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpaqueBusqueda"));

		if(this.empaqueSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpaqueBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpaqueUpdate= new JButtonMe();
		this.jButtonid_empresaEmpaqueUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpaqueUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpaqueUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpaqueUpdate.setText("U");
		this.jButtonid_empresaEmpaqueUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpaqueUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpaqueUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpaqueUpdate"));



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
		//this.jInternalFrameDetalleEmpaque = new EmpaqueBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empaque DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpaque= new GridBagLayout();
		

		
		String sToolTipEmpaque="";
		sToolTipEmpaque=EmpaqueConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpaque+="(Inventario.Empaque)";
		}
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpaque+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpaque = new JButtonMe();
		this.jButtonModificarEmpaque = new JButtonMe();
        this.jButtonActualizarEmpaque = new JButtonMe();
        this.jButtonEliminarEmpaque = new JButtonMe();
        this.jButtonCancelarEmpaque = new JButtonMe();
        this.jButtonGuardarCambiosEmpaque = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpaque = new JButtonMe();
		this.jButtonCerrarEmpaque = new JButtonMe();
		
		this.jScrollPanelDatosEmpaque = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpaque = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpaque = new JScrollPane();
				
		
		
		this.jPanelCamposEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empaque";
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empaques" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpaque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpaque.setName("jPanelCamposEmpaque"); 

		this.jPanelCamposOcultosEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpaque.setName("jPanelCamposOcultosEmpaque"); 

        this.jPanelAccionesEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpaque.setToolTipText("Acciones");
        this.jPanelAccionesEmpaque.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpaque.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpaque.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpaque.setText("Nuevo");
		this.jButtonModificarEmpaque.setText("Editar");
        this.jButtonActualizarEmpaque.setText("Actualizar");
        this.jButtonEliminarEmpaque.setText("Eliminar");
        this.jButtonCancelarEmpaque.setText("Cancelar");
        this.jButtonGuardarCambiosEmpaque.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpaque.setText("Guardar");
		this.jButtonCerrarEmpaque.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpaque,"nuevo_button","Nuevo",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpaque,"modificar_button","Editar",this.empaqueSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpaque,"actualizar_button","Actualizar",this.empaqueSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpaque,"eliminar_button","Eliminar",this.empaqueSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpaque,"cancelar_button","Cancelar",this.empaqueSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpaque,"guardarcambios_button","Guardar",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpaque,"guardarcambiostabla_button","Guardar",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpaque,"cerrar_button","Salir",this.empaqueSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpaque.setToolTipText("Nuevo"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpaque.setToolTipText("Editar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpaque.setToolTipText("Actualizar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpaque.setToolTipText("Eliminar)"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpaque.setToolTipText("Cancelar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpaque.setToolTipText("Guardar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpaque.setToolTipText("Guardar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpaque.setToolTipText("Salir"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpaque";
		inputMap = this.jButtonNuevoEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpaque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpaque"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpaque";
		inputMap = this.jButtonActualizarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpaque"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpaque";
		inputMap = this.jButtonEliminarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpaque"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpaque";
		inputMap = this.jButtonCancelarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpaque"));
		
		//CERRAR		
		sMapKey = "CerrarEmpaque";
		inputMap = this.jButtonCerrarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpaque"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpaque";
		inputMap = this.jButtonGuardarCambiosTablaEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpaque"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpaque = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpaque.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpaque.setToolTipText("Nuevo Empaque");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpaque = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpaque.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpaque.setToolTipText("Sin Cerrar Ventana Empaque");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpaque = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpaque.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpaque.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpaque.setText("Accion");
		this.jComboBoxTiposAccionesEmpaque.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpaque.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpaque.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpaque = new JLabelMe();
		
		this.jLabelAccionesEmpaque.setText("Acciones");		
		this.jLabelAccionesEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpaque();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpaque();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpaque=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpaque,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpaque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpaque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpaque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpaque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpaque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpaque.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpaque = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpaque = new GridBagLayout();
		
		this.jPanelCamposEmpaque.setLayout(gridaBagLayoutCamposEmpaque);
		this.jPanelCamposOcultosEmpaque.setLayout(gridaBagLayoutCamposOcultosEmpaque);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 0;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpaque.add(jLabelIdEmpaque, this.gridBagConstraintsEmpaque);



	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 1;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpaque.add(jLabelidEmpaque, this.gridBagConstraintsEmpaque);


	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 0;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpaque.add(jLabelid_empresaEmpaque, this.gridBagConstraintsEmpaque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		//this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = 0;
		this.gridBagConstraintsEmpaque.gridx = 2;
		this.gridBagConstraintsEmpaque.ipadx = 0;
		this.gridBagConstraintsEmpaque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpaque.add(jButtonid_empresaEmpaqueBusqueda, this.gridBagConstraintsEmpaque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		//this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = 0;
		this.gridBagConstraintsEmpaque.gridx = 3;
		this.gridBagConstraintsEmpaque.ipadx = 0;
		this.gridBagConstraintsEmpaque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpaque.add(jButtonid_empresaEmpaqueUpdate, this.gridBagConstraintsEmpaque);
	}

	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 1;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpaque.add(jComboBoxid_empresaEmpaque, this.gridBagConstraintsEmpaque);


	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 0;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorEmpaque.add(jLabelvalorEmpaque, this.gridBagConstraintsEmpaque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		//this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = 0;
		this.gridBagConstraintsEmpaque.gridx = 2;
		this.gridBagConstraintsEmpaque.ipadx = 0;
		this.gridBagConstraintsEmpaque.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorEmpaque.add(jButtonvalorEmpaqueBusqueda, this.gridBagConstraintsEmpaque);
	}

	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 1;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorEmpaque.add(jTextFieldvalorEmpaque, this.gridBagConstraintsEmpaque);


	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 0;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEmpaque.add(jLabeldescripcionEmpaque, this.gridBagConstraintsEmpaque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		//this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = 0;
		this.gridBagConstraintsEmpaque.gridx = 2;
		this.gridBagConstraintsEmpaque.ipadx = 0;
		this.gridBagConstraintsEmpaque.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEmpaque.add(jButtondescripcionEmpaqueBusqueda, this.gridBagConstraintsEmpaque);
	}

	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpaque.gridy = 0;
	this.gridBagConstraintsEmpaque.gridx = 1;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEmpaque.add(jscrollPanedescripcionEmpaque, this.gridBagConstraintsEmpaque);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpaque.gridy = iYPanelCamposEmpaque;
	this.gridBagConstraintsEmpaque.gridx = iXPanelCamposEmpaque++;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpaque.add(this.jPanelidEmpaque, this.gridBagConstraintsEmpaque);



	if(iXPanelCamposEmpaque % 1==0) {
		iXPanelCamposEmpaque=0;
		iYPanelCamposEmpaque++;
	}
	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpaque.gridy = iYPanelCamposEmpaque;
	this.gridBagConstraintsEmpaque.gridx = iXPanelCamposEmpaque++;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpaque.add(this.jPanelvalorEmpaque, this.gridBagConstraintsEmpaque);



	if(iXPanelCamposEmpaque % 1==0) {
		iXPanelCamposEmpaque=0;
		iYPanelCamposEmpaque++;
	}
	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpaque.gridy = iYPanelCamposEmpaque;
	this.gridBagConstraintsEmpaque.gridx = iXPanelCamposEmpaque++;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpaque.add(this.jPaneldescripcionEmpaque, this.gridBagConstraintsEmpaque);



	if(iXPanelCamposEmpaque % 1==0) {
		iXPanelCamposEmpaque=0;
		iYPanelCamposEmpaque++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpaque = new GridBagConstraints();
	this.gridBagConstraintsEmpaque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpaque.gridy = iYPanelCamposOcultosEmpaque;
	this.gridBagConstraintsEmpaque.gridx = iXPanelCamposOcultosEmpaque++;
	this.gridBagConstraintsEmpaque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpaque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpaque.add(this.jPanelid_empresaEmpaque, this.gridBagConstraintsEmpaque);



	if(iXPanelCamposOcultosEmpaque % 1==0) {
		iXPanelCamposOcultosEmpaque=0;
		iYPanelCamposOcultosEmpaque++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpaque= new GridBagLayout();
		this.jPanelAccionesEmpaque.setLayout(gridaBagLayoutAccionesEmpaque);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpaque= new GridBagLayout();
		this.jPanelAccionesFormularioEmpaque.setLayout(gridaBagLayoutAccionesFormularioEmpaque);
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpaque.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpaque.add(this.jComboBoxTiposAccionesFormularioEmpaque, this.gridBagConstraintsEmpaque);

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpaque.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpaque.add(this.jCheckBoxPostAccionNuevoEmpaque, this.gridBagConstraintsEmpaque);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empaqueSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpaque.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpaque.add(this.jCheckBoxPostAccionSinCerrarEmpaque, this.gridBagConstraintsEmpaque);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empaqueSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpaque.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpaque.add(this.jCheckBoxPostAccionSinMensajeEmpaque, this.gridBagConstraintsEmpaque);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = 0;
		this.gridBagConstraintsEmpaque.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpaque.add(this.jButtonModificarEmpaque, this.gridBagConstraintsEmpaque);							

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = 0;
		this.gridBagConstraintsEmpaque.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpaque.add(this.jButtonEliminarEmpaque, this.gridBagConstraintsEmpaque);
		
			
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = 0;		
		this.gridBagConstraintsEmpaque.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpaque.add(this.jButtonActualizarEmpaque, this.gridBagConstraintsEmpaque);


		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = 0;		
		this.gridBagConstraintsEmpaque.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpaque.add(this.jButtonGuardarCambiosEmpaque, this.gridBagConstraintsEmpaque);	
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = 0;		
		this.gridBagConstraintsEmpaque.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpaque.add(this.jButtonCancelarEmpaque, this.gridBagConstraintsEmpaque);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpaque = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpaque);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpaque = new GridBagConstraints();						
			this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpaque.gridx = 0;		
			//this.gridBagConstraintsEmpaque.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpaque.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpaque.gridx =0;
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpaque.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpaque, this.gridBagConstraintsEmpaque);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpaque = new EmpaqueBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empaque DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empaque DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empaque Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpaqueModel empaqueModel=new EmpaqueModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpaqueModel.EmpaqueFocusTraversalPolicy empaqueFocusTraversalPolicy = empaqueModel.new EmpaqueFocusTraversalPolicy(this);
			
			//empaqueFocusTraversalPolicy.setempaqueJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empaqueModel);
			
			
			this.jContentPaneDetalleEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpaque = new GridBagLayout();	
			this.jContentPaneDetalleEmpaque.setLayout(gridaBagLayoutDetalleEmpaque);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpaque = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpaque = new GridBagConstraints();
				this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpaque.gridx = 0;
					
				
				this.jContentPaneDetalleEmpaque.add(jTtoolBarDetalleEmpaque, gridBagConstraintsEmpaque);								
				
}
			
			this.jScrollPanelDatosEdicionEmpaque=   new JScrollPane(jContentPaneDetalleEmpaque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpaque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpaque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpaque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpaque=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpaque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpaque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpaque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpaque.gridx = 0;
	        
			this.jContentPaneDetalleEmpaque.add(jPanelCamposEmpaque, gridBagConstraintsEmpaque);
			
			
			
			
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
						&& empaqueSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleProforma(this.puedeCargarPorParteDetalleProforma,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(this.puedeCargarPorParteDetaNotaCreditoSoli,false,-1);
					
					if(this.empaqueSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpaque= new GridBagConstraints();
						this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpaque.gridx = 0;
						this.jContentPaneDetalleEmpaque.add(this.jTabbedPaneRelacionesEmpaque, this.gridBagConstraintsEmpaque);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpaque.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleProforma(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpaque.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpaque = new GridBagConstraints();
					this.gridBagConstraintsEmpaque.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpaque.gridx = 0;
					
				
					this.jContentPaneDetalleEmpaque.add(jPanelCamposOcultosEmpaque, gridBagConstraintsEmpaque);
				
					this.jPanelCamposOcultosEmpaque.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEmpaque.gridx = 0;
	        this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpaque.add(this.jPanelAccionesFormularioEmpaque, this.gridBagConstraintsEmpaque);							
			
			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
	        this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEmpaque.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpaque.add(this.jPanelAccionesEmpaque, this.gridBagConstraintsEmpaque);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpaque);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpaque=   new JScrollPane(this.jPanelCamposEmpaque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpaque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpaque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpaque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpaque.gridx = 0;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpaque.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpaque, this.gridBagConstraintsEmpaque);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpaque.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpaque, this.gridBagConstraintsEmpaque);			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpaque.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpaque, this.gridBagConstraintsEmpaque);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpaque, this.gridBagConstraintsEmpaque);
			
			
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpaque, this.gridBagConstraintsEmpaque);
		
			
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpaque, this.gridBagConstraintsEmpaque);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpaque;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpaque;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		this.detalleproformaSessionBean.setConGuardarRelaciones(false);
		this.detalleproformaSessionBean.setEsGuardarRelacionado(true);

		this.detalleproformaBeanSwingJInternalFrame=null;//new DetalleProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleproformaBeanSwingJInternalFramePopup=new DetalleProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleproformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleproformaSessionBean.getEsGuardarRelacionado()) {

				DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleproformaSessionBean.setEsGuardarRelacionado(true);

				this.detalleproformaBeanSwingJInternalFrame=new DetalleProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleproformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleproformaBeanSwingJInternalFrame.setdetalleproformaSessionBean(this.detalleproformaSessionBean);

				//this.gridBagConstraintsEmpaque = new GridBagConstraints();
				//this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpaque.gridx = 0;
				//this.jContentPaneDetalleEmpaque.add(this.detalleproformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpaque);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpaque.add("Detalle Proformas",this.detalleproformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpaque.setComponentAt(iIndexTab,this.detalleproformaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleproformaSessionBean.setEsGuardarRelacionado(false);
				this.detalleproformaBeanSwingJInternalFrame=null;//new DetalleProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleProforma) {
					this.jTabbedPaneRelacionesEmpaque.add("Detalle Proformas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		this.detanotacreditosoliSessionBean.setConGuardarRelaciones(false);
		this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);

		this.detanotacreditosoliBeanSwingJInternalFrame=null;//new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detanotacreditosoliBeanSwingJInternalFramePopup=new DetaNotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detanotacreditosoliBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {

				DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.detanotacreditosoliBeanSwingJInternalFrame=new DetaNotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detanotacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detanotacreditosoliBeanSwingJInternalFrame.setdetanotacreditosoliSessionBean(this.detanotacreditosoliSessionBean);

				//this.gridBagConstraintsEmpaque = new GridBagConstraints();
				//this.gridBagConstraintsEmpaque.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpaque.gridx = 0;
				//this.jContentPaneDetalleEmpaque.add(this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpaque);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpaque.add("Detalle  Solicitud Nota Credits",this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpaque.setComponentAt(iIndexTab,this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.detanotacreditosoliBeanSwingJInternalFrame=null;//new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaNotaCreditoSoli) {
					this.jTabbedPaneRelacionesEmpaque.add("Detalle  Solicitud Nota Credits",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleProformaBeanSwingJInternalFrame(List<Empaque> empaques,Empaque empaque,DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleproformaBeanSwingJInternalFrame=new DetalleProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleproformaBeanSwingJInternalFrame.getDetalleProformaLogic().setConnexion(this.empaqueLogic.getConnexion());

					detalleproformaBeanSwingJInternalFrame.setempaquesForeignKey(empaques);
					detalleproformaBeanSwingJInternalFrame.setempaqueForeignKey(empaque);
					detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setisBusquedaDesdeForeignKeySesionEmpaque(true);
					detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setlidEmpaqueActual(empaque.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleproformaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleProforma(detalleproformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleproformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpaque(true);
					detalleproformaBeanSwingJInternalFrame.setid_empaqueFK_IdEmpaque(empaque.getId());

					if(!this.conCargarFormDetalle) {
						detalleproformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleproformaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpaqueForeignKey(empaque,1,false,true,true);
					detalleproformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleproformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpaque");
					detalleproformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpaque");
					detalleproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProforma(true);
					detalleproformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleProforma("n",detalleproformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleproformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleproformaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleproformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("relacionado");
					} else {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("no_relacionado");
					}

					detalleproformaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleProforma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetaNotaCreditoSoliBeanSwingJInternalFrame(List<Empaque> empaques,Empaque empaque,DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detanotacreditosoliBeanSwingJInternalFrame=new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detanotacreditosoliBeanSwingJInternalFrame.getDetaNotaCreditoSoliLogic().setConnexion(this.empaqueLogic.getConnexion());

					detanotacreditosoliBeanSwingJInternalFrame.setempaquesForeignKey(empaques);
					detanotacreditosoliBeanSwingJInternalFrame.setempaqueForeignKey(empaque);
					detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionEmpaque(true);
					detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setlidEmpaqueActual(empaque.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detanotacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyDetaNotaCreditoSoli(detanotacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					detanotacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpaque(true);
					detanotacreditosoliBeanSwingJInternalFrame.setid_empaqueFK_IdEmpaque(empaque.getId());

					if(!this.conCargarFormDetalle) {
						detanotacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detanotacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpaqueForeignKey(empaque,1,false,true,true);
					detanotacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detanotacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpaque");
					detanotacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpaque");
					detanotacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCreditoSoli(true);
					detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaNotaCreditoSoli("n",detanotacreditosoliBeanSwingJInternalFrame.isGuardarCambiosEnLote, detanotacreditosoliBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detanotacreditosoliBeanSwingJInternalFrame.setAutoscrolls(true);
					detanotacreditosoliBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("relacionado");
					} else {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("no_relacionado");
					}

					detanotacreditosoliBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaNotaCreditoSoli().setVisible(false);

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

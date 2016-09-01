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
import com.bydan.erp.contabilidad.util.MonedaConstantesFunciones;

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
public class MonedaDetalleFormJInternalFrame extends MonedaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMoneda;
	
	protected JMenuBar jmenuBarDetalleMoneda;
	
	protected JMenu jmenuDetalleMoneda;
	protected JMenu jmenuDetalleArchivoMoneda;
	protected JMenu jmenuDetalleAccionesMoneda;
	protected JMenu jmenuDetalleDatosMoneda;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMoneda;	
	protected GridBagConstraints gridBagConstraintsMoneda;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MonedaBeanSwingJInternalFrameAdditional jInternalFrameDetalleMoneda;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public MonedaSessionBean monedaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public MonedaLogic monedaLogic;
	
	public JScrollPane jScrollPanelDatosMoneda;
	public JScrollPane jScrollPanelDatosEdicionMoneda;
	public JScrollPane jScrollPanelDatosGeneralMoneda;
	
	protected JPanel jPanelCamposMoneda;    
	protected JPanel jPanelCamposOcultosMoneda;    	
	protected JPanel jPanelAccionesMoneda;
	protected JPanel jPanelAccionesFormularioMoneda;
    
	
	
	protected Integer iXPanelCamposMoneda=0;
	protected Integer iYPanelCamposMoneda=0;
	
	protected Integer iXPanelCamposOcultosMoneda=0;
	protected Integer iYPanelCamposOcultosMoneda=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMoneda;
	public JButton jButtonModificarMoneda;
	public JButton jButtonActualizarMoneda;
    public JButton jButtonEliminarMoneda;
	public JButton jButtonCancelarMoneda;
    public JButton jButtonGuardarCambiosMoneda;
	public JButton jButtonGuardarCambiosTablaMoneda;
	protected JButton jButtonCerrarMoneda;
	
	
	protected JButton jButtonProcesarInformacionMoneda;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMoneda;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMoneda;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMoneda;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMoneda;
	protected JButton jButtonModificarToolBarMoneda;
	protected JButton jButtonActualizarToolBarMoneda;
    protected JButton jButtonEliminarToolBarMoneda;
	protected JButton jButtonCancelarToolBarMoneda;
    protected JButton jButtonGuardarCambiosToolBarMoneda;
	protected JButton jButtonGuardarCambiosTablaToolBarMoneda;
	protected JButton jButtonMostrarOcultarTablaToolBarMoneda;
	protected JButton jButtonCerrarToolBarMoneda;
	
	protected JButton jButtonProcesarInformacionToolBarMoneda;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMoneda;
	protected JMenuItem jMenuItemModificarMoneda;
	protected JMenuItem jMenuItemActualizarMoneda;
    protected JMenuItem jMenuItemEliminarMoneda;
	protected JMenuItem jMenuItemCancelarMoneda;
    protected JMenuItem jMenuItemGuardarCambiosMoneda;
	protected JMenuItem jMenuItemGuardarCambiosTablaMoneda;
	protected JMenuItem jMenuItemCerrarMoneda;
	protected JMenuItem jMenuItemDetalleCerrarMoneda;
	protected JMenuItem jMenuItemDetalleMostarOcultarMoneda;
	
	protected JMenuItem jMenuItemProcesarInformacionMoneda;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMoneda;
	protected JMenuItem jMenuItemMostrarOcultarMoneda;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMoneda;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMoneda;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMoneda;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMoneda;
	public JLabel jLabelIdMoneda;
	public JLabel jLabelidMoneda;
	public JButton jButtonidMonedaBusqueda= new JButtonMe();

	public JPanel jPanelnombreMoneda;
	public JLabel jLabelnombreMoneda;
	public JTextField jTextFieldnombreMoneda;
	public JButton jButtonnombreMonedaBusqueda= new JButtonMe();

	public JPanel jPanelsiglaMoneda;
	public JLabel jLabelsiglaMoneda;
	public JTextField jTextFieldsiglaMoneda;
	public JButton jButtonsiglaMonedaBusqueda= new JButtonMe();

	public JPanel jPanelsimboloMoneda;
	public JLabel jLabelsimboloMoneda;
	public JTextField jTextFieldsimboloMoneda;
	public JButton jButtonsimboloMonedaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoMoneda;
	public JLabel jLabelesta_activoMoneda;
	public JCheckBox jCheckBoxesta_activoMoneda;
	public JButton jButtonesta_activoMonedaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMoneda;
	public JLabel jLabelid_empresaMoneda;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMoneda;
	public JButton jButtonid_empresaMoneda= new JButtonMe();
	public JButton jButtonid_empresaMonedaUpdate= new JButtonMe();
	public JButton jButtonid_empresaMonedaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMoneda;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MonedaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMoneda=new JPanel();
				this.jPanelAccionesFormularioMoneda=new JPanel();
				this.jmenuBarDetalleMoneda=new JMenuBar();
				this.jTtoolBarDetalleMoneda=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MonedaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MonedaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MonedaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MonedaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MonedaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMoneda() {
		return this.jButtonActualizarToolBarMoneda;
	}
	
	public JButton getjButtonEliminarToolBarMoneda() {
		return this.jButtonEliminarToolBarMoneda;
	}
	
	public JButton getjButtonCancelarToolBarMoneda() {
		return this.jButtonCancelarToolBarMoneda;
	}		
	
	public JButton getjButtonProcesarInformacionMoneda() {
		return this.jButtonProcesarInformacionMoneda;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMoneda)	{
		this.jButtonProcesarInformacionMoneda = jButtonProcesarInformacionMoneda;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMoneda() {
		return this.jComboBoxTiposAccionesMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMoneda(
			JComboBox jComboBoxTiposRelacionesMoneda) {
		this.jComboBoxTiposRelacionesMoneda = jComboBoxTiposRelacionesMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMoneda(
			JComboBox jComboBoxTiposAccionesMoneda) {
		this.jComboBoxTiposAccionesMoneda = jComboBoxTiposAccionesMoneda;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMoneda() {
		return this.jComboBoxTiposAccionesFormularioMoneda;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMoneda(
			JComboBox jComboBoxTiposAccionesFormularioMoneda) {
		this.jComboBoxTiposAccionesFormularioMoneda = jComboBoxTiposAccionesFormularioMoneda;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.monedaSessionBean=new MonedaSessionBean();
		
		this.monedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.monedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.monedaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MonedaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MonedaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MonedaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Moneda MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
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
	
		MonedaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMoneda= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMoneda=new JButtonMe();
				this.jButtonModificarToolBarMoneda=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMoneda,this.jTtoolBarDetalleMoneda,
							"actualizar","actualizar","Actualizar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMoneda,this.jTtoolBarDetalleMoneda,
							"eliminar","eliminar","Eliminar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMoneda,this.jTtoolBarDetalleMoneda,
							"cancelar","cancelar","Cancelar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMoneda,this.jTtoolBarDetalleMoneda,
							"guardarcambios","guardarcambios","Guardar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMoneda=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMoneda=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMoneda=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMoneda=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMoneda=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMoneda= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMoneda.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMoneda,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMoneda= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMoneda.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMoneda,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMoneda= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMoneda.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMoneda,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMoneda= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMoneda.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMoneda,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMoneda= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMoneda.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMoneda,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMoneda= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMoneda.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMoneda,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMoneda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMoneda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMoneda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMoneda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMoneda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMoneda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMoneda,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMoneda,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMoneda.add(this.jMenuItemDetalleCerrarMoneda);
		
		this.jmenuDetalleAccionesMoneda.add(this.jMenuItemActualizarMoneda);
		this.jmenuDetalleAccionesMoneda.add(this.jMenuItemEliminarMoneda);
		this.jmenuDetalleAccionesMoneda.add(this.jMenuItemCancelarMoneda);		
		
		//this.jmenuDetalleDatosMoneda.add(this.jMenuItemDetalleAbrirOrderByMoneda);				
		this.jmenuDetalleDatosMoneda.add(this.jMenuItemDetalleMostarOcultarMoneda);				
				
		//this.jmenuDetalleAccionesMoneda.add(this.jMenuItemGuardarCambiosMoneda);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMoneda.add(this.jmenuDetalleArchivoMoneda);		
		this.jmenuBarDetalleMoneda.add(this.jmenuDetalleAccionesMoneda);		
		this.jmenuBarDetalleMoneda.add(this.jmenuDetalleDatosMoneda);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMoneda);				
	}
	
	
	public void inicializarElementosCamposMoneda() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMoneda = new JLabelMe();
		jLabelIdMoneda.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMoneda = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMoneda.setToolTipText(MonedaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMoneda= new GridBagLayout();

		this.jPanelidMoneda.setLayout(this.gridaBagLayoutMoneda);

		jLabelidMoneda = new JLabel();
		jLabelidMoneda.setText("Id");

		jLabelidMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreMoneda = new JLabelMe();
		this.jLabelnombreMoneda.setText(""+MonedaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreMoneda.setToolTipText("Nombre");
		this.jLabelnombreMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreMoneda.setToolTipText(MonedaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutMoneda = new GridBagLayout();
		this.jPanelnombreMoneda.setLayout(this.gridaBagLayoutMoneda);


		jTextFieldnombreMoneda= new JTextFieldMe();

		jTextFieldnombreMoneda.setEnabled(false);
		jTextFieldnombreMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreMonedaBusqueda= new JButtonMe();
		this.jButtonnombreMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreMonedaBusqueda.setText("U");
		this.jButtonnombreMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreMonedaBusqueda"));

		if(this.monedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreMonedaBusqueda.setVisible(false);		}


					
		this.jLabelsiglaMoneda = new JLabelMe();
		this.jLabelsiglaMoneda.setText(""+MonedaConstantesFunciones.LABEL_SIGLA+" : *");
		this.jLabelsiglaMoneda.setToolTipText("Sigla");
		this.jLabelsiglaMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglaMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglaMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglaMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglaMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglaMoneda.setToolTipText(MonedaConstantesFunciones.LABEL_SIGLA);
		this.gridaBagLayoutMoneda = new GridBagLayout();
		this.jPanelsiglaMoneda.setLayout(this.gridaBagLayoutMoneda);


		jTextFieldsiglaMoneda= new JTextFieldMe();

		jTextFieldsiglaMoneda.setEnabled(false);
		jTextFieldsiglaMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglaMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglaMonedaBusqueda= new JButtonMe();
		this.jButtonsiglaMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglaMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglaMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglaMonedaBusqueda.setText("U");
		this.jButtonsiglaMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglaMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglaMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglaMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglaMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglaMonedaBusqueda"));

		if(this.monedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglaMonedaBusqueda.setVisible(false);		}


					
		this.jLabelsimboloMoneda = new JLabelMe();
		this.jLabelsimboloMoneda.setText(""+MonedaConstantesFunciones.LABEL_SIMBOLO+" : *");
		this.jLabelsimboloMoneda.setToolTipText("Simbolo");
		this.jLabelsimboloMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsimboloMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsimboloMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsimboloMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsimboloMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsimboloMoneda.setToolTipText(MonedaConstantesFunciones.LABEL_SIMBOLO);
		this.gridaBagLayoutMoneda = new GridBagLayout();
		this.jPanelsimboloMoneda.setLayout(this.gridaBagLayoutMoneda);


		jTextFieldsimboloMoneda= new JTextFieldMe();

		jTextFieldsimboloMoneda.setEnabled(false);
		jTextFieldsimboloMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsimboloMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsimboloMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsimboloMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsimboloMonedaBusqueda= new JButtonMe();
		this.jButtonsimboloMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsimboloMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsimboloMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsimboloMonedaBusqueda.setText("U");
		this.jButtonsimboloMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsimboloMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsimboloMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsimboloMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsimboloMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"simboloMonedaBusqueda"));

		if(this.monedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsimboloMonedaBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoMoneda = new JLabelMe();
		this.jLabelesta_activoMoneda.setText(""+MonedaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoMoneda.setToolTipText("Esta Activo");
		this.jLabelesta_activoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoMoneda.setToolTipText(MonedaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutMoneda = new GridBagLayout();
		this.jPanelesta_activoMoneda.setLayout(this.gridaBagLayoutMoneda);


		jCheckBoxesta_activoMoneda= new JCheckBoxMe();
		jCheckBoxesta_activoMoneda.setEnabled(false);

		jCheckBoxesta_activoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoMonedaBusqueda= new JButtonMe();
		this.jButtonesta_activoMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoMonedaBusqueda.setText("U");
		this.jButtonesta_activoMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoMonedaBusqueda"));

		if(this.monedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoMonedaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMoneda() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMoneda = new JLabelMe();
		this.jLabelid_empresaMoneda.setText(""+MonedaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMoneda.setToolTipText("Empresa");
		this.jLabelid_empresaMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMoneda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMoneda.setToolTipText(MonedaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMoneda = new GridBagLayout();
		this.jPanelid_empresaMoneda.setLayout(this.gridaBagLayoutMoneda);


		jComboBoxid_empresaMoneda= new JComboBoxMe();
		jComboBoxid_empresaMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMoneda.setEnabled(false);

		this.jButtonid_empresaMoneda= new JButtonMe();
		this.jButtonid_empresaMoneda.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMoneda.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMoneda.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMoneda.setText("Buscar");
		this.jButtonid_empresaMoneda.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMoneda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMoneda,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMoneda"));

		this.jButtonid_empresaMonedaBusqueda= new JButtonMe();
		this.jButtonid_empresaMonedaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMonedaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMonedaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMonedaBusqueda.setText("U");
		this.jButtonid_empresaMonedaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMonedaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMonedaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMonedaBusqueda"));

		if(this.monedaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMonedaBusqueda.setVisible(false);		}

		this.jButtonid_empresaMonedaUpdate= new JButtonMe();
		this.jButtonid_empresaMonedaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMonedaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMonedaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMonedaUpdate.setText("U");
		this.jButtonid_empresaMonedaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMonedaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMonedaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMonedaUpdate"));



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
		//this.jInternalFrameDetalleMoneda = new MonedaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Moneda DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMoneda= new GridBagLayout();
		

		
		String sToolTipMoneda="";
		sToolTipMoneda=MonedaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMoneda+="(Contabilidad.Moneda)";
		}
		
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
			sToolTipMoneda+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMoneda = new JButtonMe();
		this.jButtonModificarMoneda = new JButtonMe();
        this.jButtonActualizarMoneda = new JButtonMe();
        this.jButtonEliminarMoneda = new JButtonMe();
        this.jButtonCancelarMoneda = new JButtonMe();
        this.jButtonGuardarCambiosMoneda = new JButtonMe();
		this.jButtonGuardarCambiosTablaMoneda = new JButtonMe();
		this.jButtonCerrarMoneda = new JButtonMe();
		
		this.jScrollPanelDatosMoneda = new JScrollPane();   
        this.jScrollPanelDatosEdicionMoneda = new JScrollPane();
		this.jScrollPanelDatosGeneralMoneda = new JScrollPane();
				
		
		
		this.jPanelCamposMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Moneda";
		
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monedas" + this.sPath));
		} else {
			this.jScrollPanelDatosMoneda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMoneda.setName("jPanelCamposMoneda"); 

		this.jPanelCamposOcultosMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMoneda.setName("jPanelCamposOcultosMoneda"); 

        this.jPanelAccionesMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMoneda.setToolTipText("Acciones");
        this.jPanelAccionesMoneda.setName("Acciones"); 

		this.jPanelAccionesFormularioMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMoneda.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMoneda.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMoneda, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMoneda.setText("Nuevo");
		this.jButtonModificarMoneda.setText("Editar");
        this.jButtonActualizarMoneda.setText("Actualizar");
        this.jButtonEliminarMoneda.setText("Eliminar");
        this.jButtonCancelarMoneda.setText("Cancelar");
        this.jButtonGuardarCambiosMoneda.setText("Guardar");
		this.jButtonGuardarCambiosTablaMoneda.setText("Guardar");
		this.jButtonCerrarMoneda.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMoneda,"nuevo_button","Nuevo",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMoneda,"modificar_button","Editar",this.monedaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMoneda,"actualizar_button","Actualizar",this.monedaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMoneda,"eliminar_button","Eliminar",this.monedaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMoneda,"cancelar_button","Cancelar",this.monedaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMoneda,"guardarcambios_button","Guardar",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMoneda,"guardarcambiostabla_button","Guardar",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMoneda,"cerrar_button","Salir",this.monedaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMoneda.setToolTipText("Nuevo"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMoneda.setToolTipText("Editar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMoneda.setToolTipText("Actualizar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMoneda.setToolTipText("Eliminar)"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMoneda.setToolTipText("Cancelar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMoneda.setToolTipText("Guardar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMoneda.setToolTipText("Guardar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMoneda.setToolTipText("Salir"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMoneda";
		inputMap = this.jButtonNuevoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMoneda"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMoneda";
		inputMap = this.jButtonActualizarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMoneda"));
		
		//ELIMINAR
		sMapKey = "EliminarMoneda";
		inputMap = this.jButtonEliminarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMoneda"));
		
		//CANCELAR	
		sMapKey = "CancelarMoneda";
		inputMap = this.jButtonCancelarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMoneda"));
		
		//CERRAR		
		sMapKey = "CerrarMoneda";
		inputMap = this.jButtonCerrarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMoneda"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMoneda";
		inputMap = this.jButtonGuardarCambiosTablaMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMoneda"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMoneda = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMoneda.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMoneda.setToolTipText("Nuevo Moneda");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMoneda = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMoneda.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMoneda.setToolTipText("Sin Cerrar Ventana Moneda");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMoneda = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMoneda.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMoneda.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMoneda, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMoneda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMoneda.setText("Accion");
		this.jComboBoxTiposAccionesMoneda.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMoneda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMoneda.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMoneda.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMoneda = new JLabelMe();
		
		this.jLabelAccionesMoneda.setText("Acciones");		
		this.jLabelAccionesMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMoneda();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMoneda();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMoneda=new JTabbedPane();
		this.jTabbedPaneRelacionesMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMoneda,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMoneda.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMoneda.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMoneda.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMoneda, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMoneda = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMoneda = new GridBagLayout();
		
		this.jPanelCamposMoneda.setLayout(gridaBagLayoutCamposMoneda);
		this.jPanelCamposOcultosMoneda.setLayout(gridaBagLayoutCamposOcultosMoneda);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 0;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMoneda.add(jLabelIdMoneda, this.gridBagConstraintsMoneda);



	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 1;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMoneda.add(jLabelidMoneda, this.gridBagConstraintsMoneda);


	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 0;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMoneda.add(jLabelid_empresaMoneda, this.gridBagConstraintsMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		//this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = 2;
		this.gridBagConstraintsMoneda.ipadx = 0;
		this.gridBagConstraintsMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMoneda.add(jButtonid_empresaMonedaBusqueda, this.gridBagConstraintsMoneda);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		//this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = 3;
		this.gridBagConstraintsMoneda.ipadx = 0;
		this.gridBagConstraintsMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMoneda.add(jButtonid_empresaMonedaUpdate, this.gridBagConstraintsMoneda);
	}

	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 1;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMoneda.add(jComboBoxid_empresaMoneda, this.gridBagConstraintsMoneda);


	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 0;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreMoneda.add(jLabelnombreMoneda, this.gridBagConstraintsMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		//this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = 2;
		this.gridBagConstraintsMoneda.ipadx = 0;
		this.gridBagConstraintsMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreMoneda.add(jButtonnombreMonedaBusqueda, this.gridBagConstraintsMoneda);
	}

	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 1;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreMoneda.add(jTextFieldnombreMoneda, this.gridBagConstraintsMoneda);


	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 0;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglaMoneda.add(jLabelsiglaMoneda, this.gridBagConstraintsMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		//this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = 2;
		this.gridBagConstraintsMoneda.ipadx = 0;
		this.gridBagConstraintsMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglaMoneda.add(jButtonsiglaMonedaBusqueda, this.gridBagConstraintsMoneda);
	}

	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 1;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglaMoneda.add(jTextFieldsiglaMoneda, this.gridBagConstraintsMoneda);


	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 0;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsimboloMoneda.add(jLabelsimboloMoneda, this.gridBagConstraintsMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		//this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = 2;
		this.gridBagConstraintsMoneda.ipadx = 0;
		this.gridBagConstraintsMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelsimboloMoneda.add(jButtonsimboloMonedaBusqueda, this.gridBagConstraintsMoneda);
	}

	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 1;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsimboloMoneda.add(jTextFieldsimboloMoneda, this.gridBagConstraintsMoneda);


	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 0;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoMoneda.add(jLabelesta_activoMoneda, this.gridBagConstraintsMoneda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		//this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = 2;
		this.gridBagConstraintsMoneda.ipadx = 0;
		this.gridBagConstraintsMoneda.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoMoneda.add(jButtonesta_activoMonedaBusqueda, this.gridBagConstraintsMoneda);
	}

	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMoneda.gridy = 0;
	this.gridBagConstraintsMoneda.gridx = 1;
	this.gridBagConstraintsMoneda.ipadx = 0;
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoMoneda.add(jCheckBoxesta_activoMoneda, this.gridBagConstraintsMoneda);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMoneda.gridy = iYPanelCamposMoneda;
	this.gridBagConstraintsMoneda.gridx = iXPanelCamposMoneda++;
	this.gridBagConstraintsMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMoneda.add(this.jPanelidMoneda, this.gridBagConstraintsMoneda);



	if(iXPanelCamposMoneda % 1==0) {
		iXPanelCamposMoneda=0;
		iYPanelCamposMoneda++;
	}
	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMoneda.gridy = iYPanelCamposMoneda;
	this.gridBagConstraintsMoneda.gridx = iXPanelCamposMoneda++;
	this.gridBagConstraintsMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMoneda.add(this.jPanelnombreMoneda, this.gridBagConstraintsMoneda);



	if(iXPanelCamposMoneda % 1==0) {
		iXPanelCamposMoneda=0;
		iYPanelCamposMoneda++;
	}
	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMoneda.gridy = iYPanelCamposMoneda;
	this.gridBagConstraintsMoneda.gridx = iXPanelCamposMoneda++;
	this.gridBagConstraintsMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMoneda.add(this.jPanelsiglaMoneda, this.gridBagConstraintsMoneda);



	if(iXPanelCamposMoneda % 1==0) {
		iXPanelCamposMoneda=0;
		iYPanelCamposMoneda++;
	}
	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMoneda.gridy = iYPanelCamposMoneda;
	this.gridBagConstraintsMoneda.gridx = iXPanelCamposMoneda++;
	this.gridBagConstraintsMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMoneda.add(this.jPanelsimboloMoneda, this.gridBagConstraintsMoneda);



	if(iXPanelCamposMoneda % 1==0) {
		iXPanelCamposMoneda=0;
		iYPanelCamposMoneda++;
	}
	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMoneda.gridy = iYPanelCamposMoneda;
	this.gridBagConstraintsMoneda.gridx = iXPanelCamposMoneda++;
	this.gridBagConstraintsMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMoneda.add(this.jPanelesta_activoMoneda, this.gridBagConstraintsMoneda);



	if(iXPanelCamposMoneda % 1==0) {
		iXPanelCamposMoneda=0;
		iYPanelCamposMoneda++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMoneda = new GridBagConstraints();
	this.gridBagConstraintsMoneda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMoneda.gridy = iYPanelCamposOcultosMoneda;
	this.gridBagConstraintsMoneda.gridx = iXPanelCamposOcultosMoneda++;
	this.gridBagConstraintsMoneda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMoneda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMoneda.add(this.jPanelid_empresaMoneda, this.gridBagConstraintsMoneda);



	if(iXPanelCamposOcultosMoneda % 1==0) {
		iXPanelCamposOcultosMoneda=0;
		iYPanelCamposOcultosMoneda++;
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
			
		GridBagLayout gridaBagLayoutAccionesMoneda= new GridBagLayout();
		this.jPanelAccionesMoneda.setLayout(gridaBagLayoutAccionesMoneda);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMoneda= new GridBagLayout();
		this.jPanelAccionesFormularioMoneda.setLayout(gridaBagLayoutAccionesFormularioMoneda);
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMoneda.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMoneda.add(this.jComboBoxTiposAccionesFormularioMoneda, this.gridBagConstraintsMoneda);

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMoneda.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMoneda.add(this.jCheckBoxPostAccionNuevoMoneda, this.gridBagConstraintsMoneda);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.monedaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMoneda.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMoneda.add(this.jCheckBoxPostAccionSinCerrarMoneda, this.gridBagConstraintsMoneda);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.monedaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.monedaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMoneda.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMoneda.add(this.jCheckBoxPostAccionSinMensajeMoneda, this.gridBagConstraintsMoneda);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = iPosXAccion++;
			
		this.jPanelAccionesMoneda.add(this.jButtonModificarMoneda, this.gridBagConstraintsMoneda);							

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx =iPosXAccion++;
			
		this.jPanelAccionesMoneda.add(this.jButtonEliminarMoneda, this.gridBagConstraintsMoneda);
		
			
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = 0;		
		this.gridBagConstraintsMoneda.gridx = iPosXAccion++;
		
		this.jPanelAccionesMoneda.add(this.jButtonActualizarMoneda, this.gridBagConstraintsMoneda);


		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = 0;		
		this.gridBagConstraintsMoneda.gridx = iPosXAccion++;
		
		this.jPanelAccionesMoneda.add(this.jButtonGuardarCambiosMoneda, this.gridBagConstraintsMoneda);	
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = 0;		
		this.gridBagConstraintsMoneda.gridx =iPosXAccion++;
		
		this.jPanelAccionesMoneda.add(this.jButtonCancelarMoneda, this.gridBagConstraintsMoneda);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMoneda = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMoneda);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.monedaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMoneda = new GridBagConstraints();						
			this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMoneda.gridx = 0;		
			//this.gridBagConstraintsMoneda.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMoneda.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMoneda.gridx =0;
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMoneda.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMoneda, this.gridBagConstraintsMoneda);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MonedaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMoneda = new MonedaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Moneda DATOS");
			
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
			
	        //this.setTitle("[FOR] - Moneda DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Moneda Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MonedaModel monedaModel=new MonedaModel(this);
			
			//SI USARA CLASE INTERNA
			//MonedaModel.MonedaFocusTraversalPolicy monedaFocusTraversalPolicy = monedaModel.new MonedaFocusTraversalPolicy(this);
			
			//monedaFocusTraversalPolicy.setmonedaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(monedaModel);
			
			
			this.jContentPaneDetalleMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMoneda = new GridBagLayout();	
			this.jContentPaneDetalleMoneda.setLayout(gridaBagLayoutDetalleMoneda);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMoneda = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMoneda = new GridBagConstraints();
				this.gridBagConstraintsMoneda.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMoneda.gridx = 0;
					
				
				this.jContentPaneDetalleMoneda.add(jTtoolBarDetalleMoneda, gridBagConstraintsMoneda);								
				
}
			
			this.jScrollPanelDatosEdicionMoneda=   new JScrollPane(jContentPaneDetalleMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMoneda=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMoneda.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMoneda.gridx = 0;
	        
			this.jContentPaneDetalleMoneda.add(jPanelCamposMoneda, gridBagConstraintsMoneda);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& monedaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.monedaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMoneda= new GridBagConstraints();
						this.gridBagConstraintsMoneda.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMoneda.gridx = 0;
						this.jContentPaneDetalleMoneda.add(this.jTabbedPaneRelacionesMoneda, this.gridBagConstraintsMoneda);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMoneda.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMoneda.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMoneda = new GridBagConstraints();
					this.gridBagConstraintsMoneda.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMoneda.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMoneda.gridx = 0;
					
				
					this.jContentPaneDetalleMoneda.add(jPanelCamposOcultosMoneda, gridBagConstraintsMoneda);
				
					this.jPanelCamposOcultosMoneda.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMoneda.gridx = 0;
	        this.gridBagConstraintsMoneda.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMoneda.add(this.jPanelAccionesFormularioMoneda, this.gridBagConstraintsMoneda);							
			
			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
	        this.gridBagConstraintsMoneda.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMoneda.gridx = 0;
	        
			
			this.jContentPaneDetalleMoneda.add(this.jPanelAccionesMoneda, this.gridBagConstraintsMoneda);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMoneda);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMoneda=   new JScrollPane(this.jPanelCamposMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMoneda.gridx = 0;
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMoneda.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMoneda, this.gridBagConstraintsMoneda);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMoneda.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMoneda, this.gridBagConstraintsMoneda);			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMoneda.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMoneda, this.gridBagConstraintsMoneda);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMoneda, this.gridBagConstraintsMoneda);
			
			
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMoneda, this.gridBagConstraintsMoneda);
		
			
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMoneda, this.gridBagConstraintsMoneda);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMoneda;//jContentPane;
		
		return jScrollPanelDatosEdicionMoneda;
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

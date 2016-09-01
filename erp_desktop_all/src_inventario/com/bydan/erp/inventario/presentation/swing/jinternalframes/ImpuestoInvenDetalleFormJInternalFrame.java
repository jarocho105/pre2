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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.ImpuestoInvenConstantesFunciones;

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
public class ImpuestoInvenDetalleFormJInternalFrame extends ImpuestoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleImpuestoInven;
	
	protected JMenuBar jmenuBarDetalleImpuestoInven;
	
	protected JMenu jmenuDetalleImpuestoInven;
	protected JMenu jmenuDetalleArchivoImpuestoInven;
	protected JMenu jmenuDetalleAccionesImpuestoInven;
	protected JMenu jmenuDetalleDatosImpuestoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImpuestoInven;	
	protected GridBagConstraints gridBagConstraintsImpuestoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ImpuestoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleImpuestoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ImpuestoInvenSessionBean impuestoinvenSessionBean;
	
	

	public ProductoImpuestoBeanSwingJInternalFrame productoimpuestoBeanSwingJInternalFrame=null;
	public ProductoImpuestoBeanSwingJInternalFrame productoimpuestoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoImpuesto=false;
	public ProductoImpuestoSessionBean productoimpuestoSessionBean;

	public DetalleImpuestoInvenBeanSwingJInternalFrame detalleimpuestoinvenBeanSwingJInternalFrame=null;
	public DetalleImpuestoInvenBeanSwingJInternalFrame detalleimpuestoinvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleImpuestoInven=false;
	public DetalleImpuestoInvenSessionBean detalleimpuestoinvenSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ImpuestoInvenLogic impuestoinvenLogic;
	
	public JScrollPane jScrollPanelDatosImpuestoInven;
	public JScrollPane jScrollPanelDatosEdicionImpuestoInven;
	public JScrollPane jScrollPanelDatosGeneralImpuestoInven;
	
	protected JPanel jPanelCamposImpuestoInven;    
	protected JPanel jPanelCamposOcultosImpuestoInven;    	
	protected JPanel jPanelAccionesImpuestoInven;
	protected JPanel jPanelAccionesFormularioImpuestoInven;
    
	
	
	protected Integer iXPanelCamposImpuestoInven=0;
	protected Integer iYPanelCamposImpuestoInven=0;
	
	protected Integer iXPanelCamposOcultosImpuestoInven=0;
	protected Integer iYPanelCamposOcultosImpuestoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoImpuestoInven;
	public JButton jButtonModificarImpuestoInven;
	public JButton jButtonActualizarImpuestoInven;
    public JButton jButtonEliminarImpuestoInven;
	public JButton jButtonCancelarImpuestoInven;
    public JButton jButtonGuardarCambiosImpuestoInven;
	public JButton jButtonGuardarCambiosTablaImpuestoInven;
	protected JButton jButtonCerrarImpuestoInven;
	
	
	protected JButton jButtonProcesarInformacionImpuestoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoImpuestoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarImpuestoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeImpuestoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarImpuestoInven;
	protected JButton jButtonModificarToolBarImpuestoInven;
	protected JButton jButtonActualizarToolBarImpuestoInven;
    protected JButton jButtonEliminarToolBarImpuestoInven;
	protected JButton jButtonCancelarToolBarImpuestoInven;
    protected JButton jButtonGuardarCambiosToolBarImpuestoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarImpuestoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarImpuestoInven;
	protected JButton jButtonCerrarToolBarImpuestoInven;
	
	protected JButton jButtonProcesarInformacionToolBarImpuestoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoImpuestoInven;
	protected JMenuItem jMenuItemModificarImpuestoInven;
	protected JMenuItem jMenuItemActualizarImpuestoInven;
    protected JMenuItem jMenuItemEliminarImpuestoInven;
	protected JMenuItem jMenuItemCancelarImpuestoInven;
    protected JMenuItem jMenuItemGuardarCambiosImpuestoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaImpuestoInven;
	protected JMenuItem jMenuItemCerrarImpuestoInven;
	protected JMenuItem jMenuItemDetalleCerrarImpuestoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarImpuestoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionImpuestoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImpuestoInven;
	protected JMenuItem jMenuItemMostrarOcultarImpuestoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesImpuestoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImpuestoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioImpuestoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidImpuestoInven;
	public JLabel jLabelIdImpuestoInven;
	public JLabel jLabelidImpuestoInven;
	public JButton jButtonidImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPanelnombreImpuestoInven;
	public JLabel jLabelnombreImpuestoInven;
	public JTextArea jTextAreanombreImpuestoInven;
	public JScrollPane jscrollPanenombreImpuestoInven;
	public JButton jButtonnombreImpuestoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaImpuestoInven;
	public JLabel jLabelid_empresaImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaImpuestoInven;
	public JButton jButtonid_empresaImpuestoInven= new JButtonMe();
	public JButton jButtonid_empresaImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaImpuestoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesImpuestoInven;
	
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
	
	public ImpuestoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposImpuestoInven=new JPanel();
				this.jPanelAccionesFormularioImpuestoInven=new JPanel();
				this.jmenuBarDetalleImpuestoInven=new JMenuBar();
				this.jTtoolBarDetalleImpuestoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ImpuestoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarImpuestoInven() {
		return this.jButtonActualizarToolBarImpuestoInven;
	}
	
	public JButton getjButtonEliminarToolBarImpuestoInven() {
		return this.jButtonEliminarToolBarImpuestoInven;
	}
	
	public JButton getjButtonCancelarToolBarImpuestoInven() {
		return this.jButtonCancelarToolBarImpuestoInven;
	}		
	
	public JButton getjButtonProcesarInformacionImpuestoInven() {
		return this.jButtonProcesarInformacionImpuestoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImpuestoInven)	{
		this.jButtonProcesarInformacionImpuestoInven = jButtonProcesarInformacionImpuestoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImpuestoInven() {
		return this.jComboBoxTiposAccionesImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImpuestoInven(
			JComboBox jComboBoxTiposRelacionesImpuestoInven) {
		this.jComboBoxTiposRelacionesImpuestoInven = jComboBoxTiposRelacionesImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImpuestoInven(
			JComboBox jComboBoxTiposAccionesImpuestoInven) {
		this.jComboBoxTiposAccionesImpuestoInven = jComboBoxTiposAccionesImpuestoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioImpuestoInven() {
		return this.jComboBoxTiposAccionesFormularioImpuestoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioImpuestoInven(
			JComboBox jComboBoxTiposAccionesFormularioImpuestoInven) {
		this.jComboBoxTiposAccionesFormularioImpuestoInven = jComboBoxTiposAccionesFormularioImpuestoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
		
		this.impuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.impuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.impuestoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		//this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImpuestoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Impuesto Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		ImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleImpuestoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarImpuestoInven=new JButtonMe();
				this.jButtonModificarToolBarImpuestoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"actualizar","actualizar","Actualizar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"eliminar","eliminar","Eliminar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"cancelar","cancelar","Cancelar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarImpuestoInven,this.jTtoolBarDetalleImpuestoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleImpuestoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleImpuestoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoImpuestoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesImpuestoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosImpuestoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImpuestoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImpuestoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImpuestoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarImpuestoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarImpuestoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarImpuestoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarImpuestoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarImpuestoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarImpuestoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarImpuestoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarImpuestoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarImpuestoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarImpuestoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarImpuestoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarImpuestoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosImpuestoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImpuestoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImpuestoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImpuestoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImpuestoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImpuestoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarImpuestoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarImpuestoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarImpuestoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoImpuestoInven.add(this.jMenuItemDetalleCerrarImpuestoInven);
		
		this.jmenuDetalleAccionesImpuestoInven.add(this.jMenuItemActualizarImpuestoInven);
		this.jmenuDetalleAccionesImpuestoInven.add(this.jMenuItemEliminarImpuestoInven);
		this.jmenuDetalleAccionesImpuestoInven.add(this.jMenuItemCancelarImpuestoInven);		
		
		//this.jmenuDetalleDatosImpuestoInven.add(this.jMenuItemDetalleAbrirOrderByImpuestoInven);				
		this.jmenuDetalleDatosImpuestoInven.add(this.jMenuItemDetalleMostarOcultarImpuestoInven);				
				
		//this.jmenuDetalleAccionesImpuestoInven.add(this.jMenuItemGuardarCambiosImpuestoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleImpuestoInven.add(this.jmenuDetalleArchivoImpuestoInven);		
		this.jmenuBarDetalleImpuestoInven.add(this.jmenuDetalleAccionesImpuestoInven);		
		this.jmenuBarDetalleImpuestoInven.add(this.jmenuDetalleDatosImpuestoInven);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleImpuestoInven.add(this.jmenuDetalleImpuestoInven);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleImpuestoInven);				
	}
	
	
	public void inicializarElementosCamposImpuestoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdImpuestoInven = new JLabelMe();
		jLabelIdImpuestoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidImpuestoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidImpuestoInven.setToolTipText(ImpuestoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutImpuestoInven= new GridBagLayout();

		this.jPanelidImpuestoInven.setLayout(this.gridaBagLayoutImpuestoInven);

		jLabelidImpuestoInven = new JLabel();
		jLabelidImpuestoInven.setText("Id");

		jLabelidImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreImpuestoInven = new JLabelMe();
		this.jLabelnombreImpuestoInven.setText(""+ImpuestoInvenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreImpuestoInven.setToolTipText("Nombre");
		this.jLabelnombreImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreImpuestoInven.setToolTipText(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutImpuestoInven = new GridBagLayout();
		this.jPanelnombreImpuestoInven.setLayout(this.gridaBagLayoutImpuestoInven);


		jTextAreanombreImpuestoInven= new JTextAreaMe();
		jTextAreanombreImpuestoInven.setEnabled(false);
		jTextAreanombreImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreImpuestoInven.setLineWrap(true);
		jTextAreanombreImpuestoInven.setWrapStyleWord(true);
		jTextAreanombreImpuestoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreImpuestoInven.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreImpuestoInven = new JScrollPane(jTextAreanombreImpuestoInven);
		jscrollPanenombreImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonnombreImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreImpuestoInvenBusqueda.setText("U");
		this.jButtonnombreImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreImpuestoInvenBusqueda"));

		if(this.impuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreImpuestoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysImpuestoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaImpuestoInven = new JLabelMe();
		this.jLabelid_empresaImpuestoInven.setText(""+ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaImpuestoInven.setToolTipText("Empresa");
		this.jLabelid_empresaImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaImpuestoInven.setToolTipText(ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutImpuestoInven = new GridBagLayout();
		this.jPanelid_empresaImpuestoInven.setLayout(this.gridaBagLayoutImpuestoInven);


		jComboBoxid_empresaImpuestoInven= new JComboBoxMe();
		jComboBoxid_empresaImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaImpuestoInven.setEnabled(false);

		this.jButtonid_empresaImpuestoInven= new JButtonMe();
		this.jButtonid_empresaImpuestoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaImpuestoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaImpuestoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaImpuestoInven.setText("Buscar");
		this.jButtonid_empresaImpuestoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaImpuestoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaImpuestoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaImpuestoInven"));

		this.jButtonid_empresaImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaImpuestoInvenBusqueda.setText("U");
		this.jButtonid_empresaImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaImpuestoInvenBusqueda"));

		if(this.impuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaImpuestoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaImpuestoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaImpuestoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaImpuestoInvenUpdate.setText("U");
		this.jButtonid_empresaImpuestoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaImpuestoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaImpuestoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaImpuestoInvenUpdate"));



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
		//this.jInternalFrameDetalleImpuestoInven = new ImpuestoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Impuesto Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutImpuestoInven= new GridBagLayout();
		

		
		String sToolTipImpuestoInven="";
		sToolTipImpuestoInven=ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImpuestoInven+="(Inventario.ImpuestoInven)";
		}
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipImpuestoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoImpuestoInven = new JButtonMe();
		this.jButtonModificarImpuestoInven = new JButtonMe();
        this.jButtonActualizarImpuestoInven = new JButtonMe();
        this.jButtonEliminarImpuestoInven = new JButtonMe();
        this.jButtonCancelarImpuestoInven = new JButtonMe();
        this.jButtonGuardarCambiosImpuestoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaImpuestoInven = new JButtonMe();
		this.jButtonCerrarImpuestoInven = new JButtonMe();
		
		this.jScrollPanelDatosImpuestoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionImpuestoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralImpuestoInven = new JScrollPane();
				
		
		
		this.jPanelCamposImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Impuesto Inven";
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosImpuestoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposImpuestoInven.setName("jPanelCamposImpuestoInven"); 

		this.jPanelCamposOcultosImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosImpuestoInven.setName("jPanelCamposOcultosImpuestoInven"); 

        this.jPanelAccionesImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImpuestoInven.setToolTipText("Acciones");
        this.jPanelAccionesImpuestoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioImpuestoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioImpuestoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoImpuestoInven.setText("Nuevo");
		this.jButtonModificarImpuestoInven.setText("Editar");
        this.jButtonActualizarImpuestoInven.setText("Actualizar");
        this.jButtonEliminarImpuestoInven.setText("Eliminar");
        this.jButtonCancelarImpuestoInven.setText("Cancelar");
        this.jButtonGuardarCambiosImpuestoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaImpuestoInven.setText("Guardar");
		this.jButtonCerrarImpuestoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImpuestoInven,"nuevo_button","Nuevo",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarImpuestoInven,"modificar_button","Editar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarImpuestoInven,"actualizar_button","Actualizar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarImpuestoInven,"eliminar_button","Eliminar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarImpuestoInven,"cancelar_button","Cancelar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosImpuestoInven,"guardarcambios_button","Guardar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImpuestoInven,"guardarcambiostabla_button","Guardar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImpuestoInven,"cerrar_button","Salir",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoImpuestoInven.setToolTipText("Nuevo"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarImpuestoInven.setToolTipText("Editar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarImpuestoInven.setToolTipText("Actualizar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarImpuestoInven.setToolTipText("Eliminar)"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarImpuestoInven.setToolTipText("Cancelar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosImpuestoInven.setToolTipText("Guardar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaImpuestoInven.setToolTipText("Guardar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImpuestoInven.setToolTipText("Salir"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImpuestoInven";
		inputMap = this.jButtonNuevoImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImpuestoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarImpuestoInven";
		inputMap = this.jButtonActualizarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarImpuestoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarImpuestoInven";
		inputMap = this.jButtonEliminarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarImpuestoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarImpuestoInven";
		inputMap = this.jButtonCancelarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarImpuestoInven"));
		
		//CERRAR		
		sMapKey = "CerrarImpuestoInven";
		inputMap = this.jButtonCerrarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImpuestoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImpuestoInven";
		inputMap = this.jButtonGuardarCambiosTablaImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImpuestoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoImpuestoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoImpuestoInven.setToolTipText("Nuevo ImpuestoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarImpuestoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarImpuestoInven.setToolTipText("Sin Cerrar Ventana ImpuestoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeImpuestoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeImpuestoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImpuestoInven.setText("Accion");
		this.jComboBoxTiposAccionesImpuestoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioImpuestoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioImpuestoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesImpuestoInven = new JLabelMe();
		
		this.jLabelAccionesImpuestoInven.setText("Acciones");		
		this.jLabelAccionesImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposImpuestoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysImpuestoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesImpuestoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioImpuestoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImpuestoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImpuestoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposImpuestoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosImpuestoInven = new GridBagLayout();
		
		this.jPanelCamposImpuestoInven.setLayout(gridaBagLayoutCamposImpuestoInven);
		this.jPanelCamposOcultosImpuestoInven.setLayout(gridaBagLayoutCamposOcultosImpuestoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoInven.gridy = 0;
	this.gridBagConstraintsImpuestoInven.gridx = 0;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidImpuestoInven.add(jLabelIdImpuestoInven, this.gridBagConstraintsImpuestoInven);



	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoInven.gridy = 0;
	this.gridBagConstraintsImpuestoInven.gridx = 1;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidImpuestoInven.add(jLabelidImpuestoInven, this.gridBagConstraintsImpuestoInven);


	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoInven.gridy = 0;
	this.gridBagConstraintsImpuestoInven.gridx = 0;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaImpuestoInven.add(jLabelid_empresaImpuestoInven, this.gridBagConstraintsImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = 0;
		this.gridBagConstraintsImpuestoInven.gridx = 2;
		this.gridBagConstraintsImpuestoInven.ipadx = 0;
		this.gridBagConstraintsImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaImpuestoInven.add(jButtonid_empresaImpuestoInvenBusqueda, this.gridBagConstraintsImpuestoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = 0;
		this.gridBagConstraintsImpuestoInven.gridx = 3;
		this.gridBagConstraintsImpuestoInven.ipadx = 0;
		this.gridBagConstraintsImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaImpuestoInven.add(jButtonid_empresaImpuestoInvenUpdate, this.gridBagConstraintsImpuestoInven);
	}

	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoInven.gridy = 0;
	this.gridBagConstraintsImpuestoInven.gridx = 1;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaImpuestoInven.add(jComboBoxid_empresaImpuestoInven, this.gridBagConstraintsImpuestoInven);


	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoInven.gridy = 0;
	this.gridBagConstraintsImpuestoInven.gridx = 0;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreImpuestoInven.add(jLabelnombreImpuestoInven, this.gridBagConstraintsImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = 0;
		this.gridBagConstraintsImpuestoInven.gridx = 2;
		this.gridBagConstraintsImpuestoInven.ipadx = 0;
		this.gridBagConstraintsImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreImpuestoInven.add(jButtonnombreImpuestoInvenBusqueda, this.gridBagConstraintsImpuestoInven);
	}

	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoInven.gridy = 0;
	this.gridBagConstraintsImpuestoInven.gridx = 1;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreImpuestoInven.add(jscrollPanenombreImpuestoInven, this.gridBagConstraintsImpuestoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoInven.gridy = iYPanelCamposImpuestoInven;
	this.gridBagConstraintsImpuestoInven.gridx = iXPanelCamposImpuestoInven++;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImpuestoInven.add(this.jPanelidImpuestoInven, this.gridBagConstraintsImpuestoInven);



	if(iXPanelCamposImpuestoInven % 1==0) {
		iXPanelCamposImpuestoInven=0;
		iYPanelCamposImpuestoInven++;
	}
	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoInven.gridy = iYPanelCamposImpuestoInven;
	this.gridBagConstraintsImpuestoInven.gridx = iXPanelCamposImpuestoInven++;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImpuestoInven.add(this.jPanelnombreImpuestoInven, this.gridBagConstraintsImpuestoInven);



	if(iXPanelCamposImpuestoInven % 1==0) {
		iXPanelCamposImpuestoInven=0;
		iYPanelCamposImpuestoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoInven.gridy = iYPanelCamposOcultosImpuestoInven;
	this.gridBagConstraintsImpuestoInven.gridx = iXPanelCamposOcultosImpuestoInven++;
	this.gridBagConstraintsImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosImpuestoInven.add(this.jPanelid_empresaImpuestoInven, this.gridBagConstraintsImpuestoInven);



	if(iXPanelCamposOcultosImpuestoInven % 1==0) {
		iXPanelCamposOcultosImpuestoInven=0;
		iYPanelCamposOcultosImpuestoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesImpuestoInven= new GridBagLayout();
		this.jPanelAccionesImpuestoInven.setLayout(gridaBagLayoutAccionesImpuestoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioImpuestoInven= new GridBagLayout();
		this.jPanelAccionesFormularioImpuestoInven.setLayout(gridaBagLayoutAccionesFormularioImpuestoInven);
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioImpuestoInven.add(this.jComboBoxTiposAccionesFormularioImpuestoInven, this.gridBagConstraintsImpuestoInven);

		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioImpuestoInven.add(this.jCheckBoxPostAccionNuevoImpuestoInven, this.gridBagConstraintsImpuestoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioImpuestoInven.add(this.jCheckBoxPostAccionSinCerrarImpuestoInven, this.gridBagConstraintsImpuestoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioImpuestoInven.add(this.jCheckBoxPostAccionSinMensajeImpuestoInven, this.gridBagConstraintsImpuestoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = 0;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesImpuestoInven.add(this.jButtonModificarImpuestoInven, this.gridBagConstraintsImpuestoInven);							

		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = 0;
		this.gridBagConstraintsImpuestoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesImpuestoInven.add(this.jButtonEliminarImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
			
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = 0;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesImpuestoInven.add(this.jButtonActualizarImpuestoInven, this.gridBagConstraintsImpuestoInven);


		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = 0;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesImpuestoInven.add(this.jButtonGuardarCambiosImpuestoInven, this.gridBagConstraintsImpuestoInven);	
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = 0;		
		this.gridBagConstraintsImpuestoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesImpuestoInven.add(this.jButtonCancelarImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImpuestoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImpuestoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();						
			this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImpuestoInven.gridx = 0;		
			//this.gridBagConstraintsImpuestoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImpuestoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImpuestoInven.gridx =0;
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImpuestoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImpuestoInven, this.gridBagConstraintsImpuestoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleImpuestoInven = new ImpuestoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Impuesto Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Impuesto Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Impuesto Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ImpuestoInvenModel impuestoinvenModel=new ImpuestoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//ImpuestoInvenModel.ImpuestoInvenFocusTraversalPolicy impuestoinvenFocusTraversalPolicy = impuestoinvenModel.new ImpuestoInvenFocusTraversalPolicy(this);
			
			//impuestoinvenFocusTraversalPolicy.setimpuestoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(impuestoinvenModel);
			
			
			this.jContentPaneDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();	
			this.jContentPaneDetalleImpuestoInven.setLayout(gridaBagLayoutDetalleImpuestoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImpuestoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
				this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsImpuestoInven.gridx = 0;
					
				
				this.jContentPaneDetalleImpuestoInven.add(jTtoolBarDetalleImpuestoInven, gridBagConstraintsImpuestoInven);								
				
}
			
			this.jScrollPanelDatosEdicionImpuestoInven=   new JScrollPane(jContentPaneDetalleImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralImpuestoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsImpuestoInven.gridx = 0;
	        
			this.jContentPaneDetalleImpuestoInven.add(jPanelCamposImpuestoInven, gridBagConstraintsImpuestoInven);
			
			
			
			
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
						&& impuestoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleImpuestoInven(this.puedeCargarPorParteDetalleImpuestoInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoImpuesto(this.puedeCargarPorParteProductoImpuesto,false,-1);
					
					if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsImpuestoInven= new GridBagConstraints();
						this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsImpuestoInven.gridx = 0;
						this.jContentPaneDetalleImpuestoInven.add(this.jTabbedPaneRelacionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesImpuestoInven.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleImpuestoInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoImpuesto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosImpuestoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
					this.gridBagConstraintsImpuestoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsImpuestoInven.gridx = 0;
					
				
					this.jContentPaneDetalleImpuestoInven.add(jPanelCamposOcultosImpuestoInven, gridBagConstraintsImpuestoInven);
				
					this.jPanelCamposOcultosImpuestoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsImpuestoInven.gridx = 0;
	        this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleImpuestoInven.add(this.jPanelAccionesFormularioImpuestoInven, this.gridBagConstraintsImpuestoInven);							
			
			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
	        this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsImpuestoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleImpuestoInven.add(this.jPanelAccionesImpuestoInven, this.gridBagConstraintsImpuestoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionImpuestoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionImpuestoInven=   new JScrollPane(this.jPanelCamposImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsImpuestoInven.gridx = 0;
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsImpuestoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionImpuestoInven, this.gridBagConstraintsImpuestoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImpuestoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioImpuestoInven, this.gridBagConstraintsImpuestoInven);			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImpuestoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesImpuestoInven, this.gridBagConstraintsImpuestoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImpuestoInven, this.gridBagConstraintsImpuestoInven);
			
			
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
			
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralImpuestoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionImpuestoInven;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleImpuestoInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(false);
		this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(true);

		this.detalleimpuestoinvenBeanSwingJInternalFrame=null;//new DetalleImpuestoInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleimpuestoinvenBeanSwingJInternalFramePopup=new DetalleImpuestoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleimpuestoinvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {

				DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(true);

				this.detalleimpuestoinvenBeanSwingJInternalFrame=new DetalleImpuestoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleimpuestoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleimpuestoinvenBeanSwingJInternalFrame.setdetalleimpuestoinvenSessionBean(this.detalleimpuestoinvenSessionBean);

				//this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
				//this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsImpuestoInven.gridx = 0;
				//this.jContentPaneDetalleImpuestoInven.add(this.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsImpuestoInven);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesImpuestoInven.add("Detalle Impuesto Invenes",this.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesImpuestoInven.setComponentAt(iIndexTab,this.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(false);
				this.detalleimpuestoinvenBeanSwingJInternalFrame=null;//new DetalleImpuestoInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleImpuestoInven) {
					this.jTabbedPaneRelacionesImpuestoInven.add("Detalle Impuesto Invenes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoImpuesto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		this.productoimpuestoSessionBean.setConGuardarRelaciones(false);
		this.productoimpuestoSessionBean.setEsGuardarRelacionado(true);

		this.productoimpuestoBeanSwingJInternalFrame=null;//new ProductoImpuestoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoimpuestoBeanSwingJInternalFramePopup=new ProductoImpuestoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoimpuestoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {

				ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL=ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoImpuestoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoimpuestoSessionBean.setEsGuardarRelacionado(true);

				this.productoimpuestoBeanSwingJInternalFrame=new ProductoImpuestoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoimpuestoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoimpuestoBeanSwingJInternalFrame.setproductoimpuestoSessionBean(this.productoimpuestoSessionBean);

				//this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
				//this.gridBagConstraintsImpuestoInven.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsImpuestoInven.gridx = 0;
				//this.jContentPaneDetalleImpuestoInven.add(this.productoimpuestoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsImpuestoInven);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesImpuestoInven.add("Producto Impuestos",this.productoimpuestoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesImpuestoInven.setComponentAt(iIndexTab,this.productoimpuestoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoImpuestoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoimpuestoSessionBean.setEsGuardarRelacionado(false);
				this.productoimpuestoBeanSwingJInternalFrame=null;//new ProductoImpuestoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoImpuesto) {
					this.jTabbedPaneRelacionesImpuestoInven.add("Producto Impuestos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoImpuestoBeanSwingJInternalFrame(List<ImpuestoInven> impuestoinvens,ImpuestoInven impuestoinven,ProductoImpuestoBeanSwingJInternalFrame productoimpuestoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoimpuestoBeanSwingJInternalFrame=new ProductoImpuestoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoimpuestoBeanSwingJInternalFrame.getProductoImpuestoLogic().setConnexion(this.impuestoinvenLogic.getConnexion());

					productoimpuestoBeanSwingJInternalFrame.setimpuestoinvensForeignKey(impuestoinvens);
					productoimpuestoBeanSwingJInternalFrame.setimpuestoinvenForeignKey(impuestoinven);
					productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.setisBusquedaDesdeForeignKeySesionImpuestoInven(true);
					productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.setlidImpuestoInvenActual(impuestoinven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoimpuestoBeanSwingJInternalFrame.cargarCombosForeignKeyProductoImpuesto(productoimpuestoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoimpuestoBeanSwingJInternalFrame.setVisibilidadBusquedasParaImpuestoInven(true);
					productoimpuestoBeanSwingJInternalFrame.setid_impuesto_invenFK_IdImpuestoInven(impuestoinven.getId());

					if(!this.conCargarFormDetalle) {
						productoimpuestoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoimpuestoBeanSwingJInternalFrame.setSelectedItemCombosFrameImpuestoInvenForeignKey(impuestoinven,1,false,true,true);
					productoimpuestoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoimpuestoBeanSwingJInternalFrame.procesarBusqueda("FK_IdImpuestoInven");
					productoimpuestoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdImpuestoInven");
					productoimpuestoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoImpuesto(true);
					productoimpuestoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoImpuesto("n",productoimpuestoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoimpuestoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoimpuestoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoimpuestoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoimpuestoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoImpuesto("relacionado");
					} else {
						productoimpuestoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoImpuesto("no_relacionado");
					}

					productoimpuestoBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoImpuesto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleImpuestoInvenBeanSwingJInternalFrame(List<ImpuestoInven> impuestoinvens,ImpuestoInven impuestoinven,DetalleImpuestoInvenBeanSwingJInternalFrame detalleimpuestoinvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleimpuestoinvenBeanSwingJInternalFrame=new DetalleImpuestoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleimpuestoinvenBeanSwingJInternalFrame.getDetalleImpuestoInvenLogic().setConnexion(this.impuestoinvenLogic.getConnexion());

					detalleimpuestoinvenBeanSwingJInternalFrame.setimpuestoinvensForeignKey(impuestoinvens);
					detalleimpuestoinvenBeanSwingJInternalFrame.setimpuestoinvenForeignKey(impuestoinven);
					detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setisBusquedaDesdeForeignKeySesionImpuestoInven(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setlidImpuestoInvenActual(impuestoinven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleimpuestoinvenBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleImpuestoInven(detalleimpuestoinvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleimpuestoinvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaImpuestoInven(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.setid_impuesto_invenFK_IdImpuestoInven(impuestoinven.getId());

					if(!this.conCargarFormDetalle) {
						detalleimpuestoinvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleimpuestoinvenBeanSwingJInternalFrame.setSelectedItemCombosFrameImpuestoInvenForeignKey(impuestoinven,1,false,true,true);
					detalleimpuestoinvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleimpuestoinvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdImpuestoInven");
					detalleimpuestoinvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdImpuestoInven");
					detalleimpuestoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleImpuestoInven(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n",detalleimpuestoinvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleimpuestoinvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleimpuestoinvenBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleimpuestoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleImpuestoInven("relacionado");
					} else {
						detalleimpuestoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleImpuestoInven("no_relacionado");
					}

					detalleimpuestoinvenBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleImpuestoInven().setVisible(false);

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

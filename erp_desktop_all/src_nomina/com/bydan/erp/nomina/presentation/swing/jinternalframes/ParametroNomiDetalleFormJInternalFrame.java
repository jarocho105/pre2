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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.ParametroNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class ParametroNomiDetalleFormJInternalFrame extends ParametroNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroNomi;
	
	protected JMenuBar jmenuBarDetalleParametroNomi;
	
	protected JMenu jmenuDetalleParametroNomi;
	protected JMenu jmenuDetalleArchivoParametroNomi;
	protected JMenu jmenuDetalleAccionesParametroNomi;
	protected JMenu jmenuDetalleDatosParametroNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroNomi;	
	protected GridBagConstraints gridBagConstraintsParametroNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ParametroNomiSessionBean parametronomiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ParametroNomiLogic parametronomiLogic;
	
	public JScrollPane jScrollPanelDatosParametroNomi;
	public JScrollPane jScrollPanelDatosEdicionParametroNomi;
	public JScrollPane jScrollPanelDatosGeneralParametroNomi;
	
	protected JPanel jPanelCamposParametroNomi;    
	protected JPanel jPanelCamposOcultosParametroNomi;    	
	protected JPanel jPanelAccionesParametroNomi;
	protected JPanel jPanelAccionesFormularioParametroNomi;
    
	
	
	protected Integer iXPanelCamposParametroNomi=0;
	protected Integer iYPanelCamposParametroNomi=0;
	
	protected Integer iXPanelCamposOcultosParametroNomi=0;
	protected Integer iYPanelCamposOcultosParametroNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroNomi;
	public JButton jButtonModificarParametroNomi;
	public JButton jButtonActualizarParametroNomi;
    public JButton jButtonEliminarParametroNomi;
	public JButton jButtonCancelarParametroNomi;
    public JButton jButtonGuardarCambiosParametroNomi;
	public JButton jButtonGuardarCambiosTablaParametroNomi;
	protected JButton jButtonCerrarParametroNomi;
	
	
	protected JButton jButtonProcesarInformacionParametroNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroNomi;
	protected JButton jButtonModificarToolBarParametroNomi;
	protected JButton jButtonActualizarToolBarParametroNomi;
    protected JButton jButtonEliminarToolBarParametroNomi;
	protected JButton jButtonCancelarToolBarParametroNomi;
    protected JButton jButtonGuardarCambiosToolBarParametroNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroNomi;
	protected JButton jButtonCerrarToolBarParametroNomi;
	
	protected JButton jButtonProcesarInformacionToolBarParametroNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroNomi;
	protected JMenuItem jMenuItemModificarParametroNomi;
	protected JMenuItem jMenuItemActualizarParametroNomi;
    protected JMenuItem jMenuItemEliminarParametroNomi;
	protected JMenuItem jMenuItemCancelarParametroNomi;
    protected JMenuItem jMenuItemGuardarCambiosParametroNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroNomi;
	protected JMenuItem jMenuItemCerrarParametroNomi;
	protected JMenuItem jMenuItemDetalleCerrarParametroNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroNomi;
	protected JMenuItem jMenuItemMostrarOcultarParametroNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroNomi;
	public JLabel jLabelIdParametroNomi;
	public JLabel jLabelidParametroNomi;
	public JButton jButtonidParametroNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoParametroNomi;
	public JLabel jLabelcodigoParametroNomi;
	public JTextField jTextFieldcodigoParametroNomi;
	public JButton jButtoncodigoParametroNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreParametroNomi;
	public JLabel jLabelnombreParametroNomi;
	public JTextArea jTextAreanombreParametroNomi;
	public JScrollPane jscrollPanenombreParametroNomi;
	public JButton jButtonnombreParametroNomiBusqueda= new JButtonMe();

	public JPanel jPanelvalorParametroNomi;
	public JLabel jLabelvalorParametroNomi;
	public JTextField jTextFieldvalorParametroNomi;
	public JButton jButtonvalorParametroNomiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionParametroNomi;
	public JLabel jLabeldescripcionParametroNomi;
	public JTextArea jTextAreadescripcionParametroNomi;
	public JScrollPane jscrollPanedescripcionParametroNomi;
	public JButton jButtondescripcionParametroNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroNomi;
	public JLabel jLabelid_empresaParametroNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroNomi;
	public JButton jButtonid_empresaParametroNomi= new JButtonMe();
	public JButton jButtonid_empresaParametroNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroNomi;
	
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
	
	public ParametroNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroNomi=new JPanel();
				this.jPanelAccionesFormularioParametroNomi=new JPanel();
				this.jmenuBarDetalleParametroNomi=new JMenuBar();
				this.jTtoolBarDetalleParametroNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroNomi() {
		return this.jButtonActualizarToolBarParametroNomi;
	}
	
	public JButton getjButtonEliminarToolBarParametroNomi() {
		return this.jButtonEliminarToolBarParametroNomi;
	}
	
	public JButton getjButtonCancelarToolBarParametroNomi() {
		return this.jButtonCancelarToolBarParametroNomi;
	}		
	
	public JButton getjButtonProcesarInformacionParametroNomi() {
		return this.jButtonProcesarInformacionParametroNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroNomi)	{
		this.jButtonProcesarInformacionParametroNomi = jButtonProcesarInformacionParametroNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroNomi() {
		return this.jComboBoxTiposAccionesParametroNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroNomi(
			JComboBox jComboBoxTiposRelacionesParametroNomi) {
		this.jComboBoxTiposRelacionesParametroNomi = jComboBoxTiposRelacionesParametroNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroNomi(
			JComboBox jComboBoxTiposAccionesParametroNomi) {
		this.jComboBoxTiposAccionesParametroNomi = jComboBoxTiposAccionesParametroNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroNomi() {
		return this.jComboBoxTiposAccionesFormularioParametroNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroNomi(
			JComboBox jComboBoxTiposAccionesFormularioParametroNomi) {
		this.jComboBoxTiposAccionesFormularioParametroNomi = jComboBoxTiposAccionesFormularioParametroNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametronomiSessionBean=new ParametroNomiSessionBean();
		
		this.parametronomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametronomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametronomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroNomi=new JButtonMe();
				this.jButtonModificarToolBarParametroNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroNomi,this.jTtoolBarDetalleParametroNomi,
							"actualizar","actualizar","Actualizar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroNomi,this.jTtoolBarDetalleParametroNomi,
							"eliminar","eliminar","Eliminar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroNomi,this.jTtoolBarDetalleParametroNomi,
							"cancelar","cancelar","Cancelar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroNomi,this.jTtoolBarDetalleParametroNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroNomi.add(this.jMenuItemDetalleCerrarParametroNomi);
		
		this.jmenuDetalleAccionesParametroNomi.add(this.jMenuItemActualizarParametroNomi);
		this.jmenuDetalleAccionesParametroNomi.add(this.jMenuItemEliminarParametroNomi);
		this.jmenuDetalleAccionesParametroNomi.add(this.jMenuItemCancelarParametroNomi);		
		
		//this.jmenuDetalleDatosParametroNomi.add(this.jMenuItemDetalleAbrirOrderByParametroNomi);				
		this.jmenuDetalleDatosParametroNomi.add(this.jMenuItemDetalleMostarOcultarParametroNomi);				
				
		//this.jmenuDetalleAccionesParametroNomi.add(this.jMenuItemGuardarCambiosParametroNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroNomi.add(this.jmenuDetalleArchivoParametroNomi);		
		this.jmenuBarDetalleParametroNomi.add(this.jmenuDetalleAccionesParametroNomi);		
		this.jmenuBarDetalleParametroNomi.add(this.jmenuDetalleDatosParametroNomi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroNomi);				
	}
	
	
	public void inicializarElementosCamposParametroNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroNomi = new JLabelMe();
		jLabelIdParametroNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroNomi.setToolTipText(ParametroNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroNomi= new GridBagLayout();

		this.jPanelidParametroNomi.setLayout(this.gridaBagLayoutParametroNomi);

		jLabelidParametroNomi = new JLabel();
		jLabelidParametroNomi.setText("Id");

		jLabelidParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoParametroNomi = new JLabelMe();
		this.jLabelcodigoParametroNomi.setText(""+ParametroNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoParametroNomi.setToolTipText("Codigo");
		this.jLabelcodigoParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoParametroNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoParametroNomi.setToolTipText(ParametroNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutParametroNomi = new GridBagLayout();
		this.jPanelcodigoParametroNomi.setLayout(this.gridaBagLayoutParametroNomi);


		jTextFieldcodigoParametroNomi= new JTextFieldMe();

		jTextFieldcodigoParametroNomi.setEnabled(false);
		jTextFieldcodigoParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoParametroNomiBusqueda= new JButtonMe();
		this.jButtoncodigoParametroNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParametroNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParametroNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoParametroNomiBusqueda.setText("U");
		this.jButtoncodigoParametroNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoParametroNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoParametroNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoParametroNomiBusqueda"));

		if(this.parametronomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoParametroNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreParametroNomi = new JLabelMe();
		this.jLabelnombreParametroNomi.setText(""+ParametroNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreParametroNomi.setToolTipText("Nombre");
		this.jLabelnombreParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreParametroNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreParametroNomi.setToolTipText(ParametroNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutParametroNomi = new GridBagLayout();
		this.jPanelnombreParametroNomi.setLayout(this.gridaBagLayoutParametroNomi);


		jTextAreanombreParametroNomi= new JTextAreaMe();
		jTextAreanombreParametroNomi.setEnabled(false);
		jTextAreanombreParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParametroNomi.setLineWrap(true);
		jTextAreanombreParametroNomi.setWrapStyleWord(true);
		jTextAreanombreParametroNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreParametroNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreParametroNomi = new JScrollPane(jTextAreanombreParametroNomi);
		jscrollPanenombreParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreParametroNomiBusqueda= new JButtonMe();
		this.jButtonnombreParametroNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParametroNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParametroNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreParametroNomiBusqueda.setText("U");
		this.jButtonnombreParametroNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreParametroNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreParametroNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreParametroNomiBusqueda"));

		if(this.parametronomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreParametroNomiBusqueda.setVisible(false);		}


					
		this.jLabelvalorParametroNomi = new JLabelMe();
		this.jLabelvalorParametroNomi.setText(""+ParametroNomiConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorParametroNomi.setToolTipText("Valor");
		this.jLabelvalorParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorParametroNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorParametroNomi.setToolTipText(ParametroNomiConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutParametroNomi = new GridBagLayout();
		this.jPanelvalorParametroNomi.setLayout(this.gridaBagLayoutParametroNomi);


		jTextFieldvalorParametroNomi= new JTextFieldMe();

		jTextFieldvalorParametroNomi.setEnabled(false);
		jTextFieldvalorParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonvalorParametroNomiBusqueda= new JButtonMe();
		this.jButtonvalorParametroNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorParametroNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorParametroNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorParametroNomiBusqueda.setText("U");
		this.jButtonvalorParametroNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorParametroNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorParametroNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorParametroNomiBusqueda"));

		if(this.parametronomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorParametroNomiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionParametroNomi = new JLabelMe();
		this.jLabeldescripcionParametroNomi.setText(""+ParametroNomiConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionParametroNomi.setToolTipText("Descripcion");
		this.jLabeldescripcionParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionParametroNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionParametroNomi.setToolTipText(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutParametroNomi = new GridBagLayout();
		this.jPaneldescripcionParametroNomi.setLayout(this.gridaBagLayoutParametroNomi);


		jTextAreadescripcionParametroNomi= new JTextAreaMe();
		jTextAreadescripcionParametroNomi.setEnabled(false);
		jTextAreadescripcionParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroNomi.setLineWrap(true);
		jTextAreadescripcionParametroNomi.setWrapStyleWord(true);
		jTextAreadescripcionParametroNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionParametroNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionParametroNomi = new JScrollPane(jTextAreadescripcionParametroNomi);
		jscrollPanedescripcionParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionParametroNomiBusqueda= new JButtonMe();
		this.jButtondescripcionParametroNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionParametroNomiBusqueda.setText("U");
		this.jButtondescripcionParametroNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionParametroNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionParametroNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionParametroNomiBusqueda"));

		if(this.parametronomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionParametroNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroNomi = new JLabelMe();
		this.jLabelid_empresaParametroNomi.setText(""+ParametroNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroNomi.setToolTipText("Empresa");
		this.jLabelid_empresaParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroNomi.setToolTipText(ParametroNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroNomi = new GridBagLayout();
		this.jPanelid_empresaParametroNomi.setLayout(this.gridaBagLayoutParametroNomi);


		jComboBoxid_empresaParametroNomi= new JComboBoxMe();
		jComboBoxid_empresaParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroNomi.setEnabled(false);

		this.jButtonid_empresaParametroNomi= new JButtonMe();
		this.jButtonid_empresaParametroNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroNomi.setText("Buscar");
		this.jButtonid_empresaParametroNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroNomi"));

		this.jButtonid_empresaParametroNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroNomiBusqueda.setText("U");
		this.jButtonid_empresaParametroNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroNomiBusqueda"));

		if(this.parametronomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroNomiUpdate= new JButtonMe();
		this.jButtonid_empresaParametroNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroNomiUpdate.setText("U");
		this.jButtonid_empresaParametroNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroNomiUpdate"));



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
		//this.jInternalFrameDetalleParametroNomi = new ParametroNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroNomi= new GridBagLayout();
		

		
		String sToolTipParametroNomi="";
		sToolTipParametroNomi=ParametroNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroNomi+="(Nomina.ParametroNomi)";
		}
		
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroNomi = new JButtonMe();
		this.jButtonModificarParametroNomi = new JButtonMe();
        this.jButtonActualizarParametroNomi = new JButtonMe();
        this.jButtonEliminarParametroNomi = new JButtonMe();
        this.jButtonCancelarParametroNomi = new JButtonMe();
        this.jButtonGuardarCambiosParametroNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroNomi = new JButtonMe();
		this.jButtonCerrarParametroNomi = new JButtonMe();
		
		this.jScrollPanelDatosParametroNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroNomi = new JScrollPane();
				
		
		
		this.jPanelCamposParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Nomi";
		
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroNomi.setName("jPanelCamposParametroNomi"); 

		this.jPanelCamposOcultosParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroNomi.setName("jPanelCamposOcultosParametroNomi"); 

        this.jPanelAccionesParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroNomi.setToolTipText("Acciones");
        this.jPanelAccionesParametroNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroNomi.setText("Nuevo");
		this.jButtonModificarParametroNomi.setText("Editar");
        this.jButtonActualizarParametroNomi.setText("Actualizar");
        this.jButtonEliminarParametroNomi.setText("Eliminar");
        this.jButtonCancelarParametroNomi.setText("Cancelar");
        this.jButtonGuardarCambiosParametroNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroNomi.setText("Guardar");
		this.jButtonCerrarParametroNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroNomi,"nuevo_button","Nuevo",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroNomi,"modificar_button","Editar",this.parametronomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroNomi,"actualizar_button","Actualizar",this.parametronomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroNomi,"eliminar_button","Eliminar",this.parametronomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroNomi,"cancelar_button","Cancelar",this.parametronomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroNomi,"guardarcambios_button","Guardar",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroNomi,"guardarcambiostabla_button","Guardar",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroNomi,"cerrar_button","Salir",this.parametronomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroNomi.setToolTipText("Nuevo"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroNomi.setToolTipText("Editar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroNomi.setToolTipText("Actualizar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroNomi.setToolTipText("Eliminar)"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroNomi.setToolTipText("Cancelar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroNomi.setToolTipText("Guardar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroNomi.setToolTipText("Guardar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroNomi.setToolTipText("Salir"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroNomi";
		inputMap = this.jButtonNuevoParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroNomi";
		inputMap = this.jButtonActualizarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroNomi";
		inputMap = this.jButtonEliminarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroNomi";
		inputMap = this.jButtonCancelarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroNomi"));
		
		//CERRAR		
		sMapKey = "CerrarParametroNomi";
		inputMap = this.jButtonCerrarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroNomi";
		inputMap = this.jButtonGuardarCambiosTablaParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroNomi.setToolTipText("Nuevo ParametroNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroNomi.setToolTipText("Sin Cerrar Ventana ParametroNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroNomi.setText("Accion");
		this.jComboBoxTiposAccionesParametroNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroNomi = new JLabelMe();
		
		this.jLabelAccionesParametroNomi.setText("Acciones");		
		this.jLabelAccionesParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroNomi = new GridBagLayout();
		
		this.jPanelCamposParametroNomi.setLayout(gridaBagLayoutCamposParametroNomi);
		this.jPanelCamposOcultosParametroNomi.setLayout(gridaBagLayoutCamposOcultosParametroNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 0;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroNomi.add(jLabelIdParametroNomi, this.gridBagConstraintsParametroNomi);



	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 1;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroNomi.add(jLabelidParametroNomi, this.gridBagConstraintsParametroNomi);


	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 0;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroNomi.add(jLabelid_empresaParametroNomi, this.gridBagConstraintsParametroNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		//this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = 2;
		this.gridBagConstraintsParametroNomi.ipadx = 0;
		this.gridBagConstraintsParametroNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroNomi.add(jButtonid_empresaParametroNomiBusqueda, this.gridBagConstraintsParametroNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		//this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = 3;
		this.gridBagConstraintsParametroNomi.ipadx = 0;
		this.gridBagConstraintsParametroNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroNomi.add(jButtonid_empresaParametroNomiUpdate, this.gridBagConstraintsParametroNomi);
	}

	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 1;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroNomi.add(jComboBoxid_empresaParametroNomi, this.gridBagConstraintsParametroNomi);


	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 0;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoParametroNomi.add(jLabelcodigoParametroNomi, this.gridBagConstraintsParametroNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		//this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = 2;
		this.gridBagConstraintsParametroNomi.ipadx = 0;
		this.gridBagConstraintsParametroNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoParametroNomi.add(jButtoncodigoParametroNomiBusqueda, this.gridBagConstraintsParametroNomi);
	}

	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 1;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoParametroNomi.add(jTextFieldcodigoParametroNomi, this.gridBagConstraintsParametroNomi);


	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 0;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreParametroNomi.add(jLabelnombreParametroNomi, this.gridBagConstraintsParametroNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		//this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = 2;
		this.gridBagConstraintsParametroNomi.ipadx = 0;
		this.gridBagConstraintsParametroNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreParametroNomi.add(jButtonnombreParametroNomiBusqueda, this.gridBagConstraintsParametroNomi);
	}

	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 1;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreParametroNomi.add(jscrollPanenombreParametroNomi, this.gridBagConstraintsParametroNomi);


	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 0;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorParametroNomi.add(jLabelvalorParametroNomi, this.gridBagConstraintsParametroNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		//this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = 2;
		this.gridBagConstraintsParametroNomi.ipadx = 0;
		this.gridBagConstraintsParametroNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorParametroNomi.add(jButtonvalorParametroNomiBusqueda, this.gridBagConstraintsParametroNomi);
	}

	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 1;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorParametroNomi.add(jTextFieldvalorParametroNomi, this.gridBagConstraintsParametroNomi);


	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 0;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionParametroNomi.add(jLabeldescripcionParametroNomi, this.gridBagConstraintsParametroNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		//this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = 2;
		this.gridBagConstraintsParametroNomi.ipadx = 0;
		this.gridBagConstraintsParametroNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionParametroNomi.add(jButtondescripcionParametroNomiBusqueda, this.gridBagConstraintsParametroNomi);
	}

	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroNomi.gridy = 0;
	this.gridBagConstraintsParametroNomi.gridx = 1;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionParametroNomi.add(jscrollPanedescripcionParametroNomi, this.gridBagConstraintsParametroNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroNomi.gridy = iYPanelCamposParametroNomi;
	this.gridBagConstraintsParametroNomi.gridx = iXPanelCamposParametroNomi++;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroNomi.add(this.jPanelidParametroNomi, this.gridBagConstraintsParametroNomi);



	if(iXPanelCamposParametroNomi % 1==0) {
		iXPanelCamposParametroNomi=0;
		iYPanelCamposParametroNomi++;
	}
	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroNomi.gridy = iYPanelCamposParametroNomi;
	this.gridBagConstraintsParametroNomi.gridx = iXPanelCamposParametroNomi++;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroNomi.add(this.jPanelcodigoParametroNomi, this.gridBagConstraintsParametroNomi);



	if(iXPanelCamposParametroNomi % 1==0) {
		iXPanelCamposParametroNomi=0;
		iYPanelCamposParametroNomi++;
	}
	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroNomi.gridy = iYPanelCamposParametroNomi;
	this.gridBagConstraintsParametroNomi.gridx = iXPanelCamposParametroNomi++;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroNomi.add(this.jPanelnombreParametroNomi, this.gridBagConstraintsParametroNomi);



	if(iXPanelCamposParametroNomi % 1==0) {
		iXPanelCamposParametroNomi=0;
		iYPanelCamposParametroNomi++;
	}
	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroNomi.gridy = iYPanelCamposParametroNomi;
	this.gridBagConstraintsParametroNomi.gridx = iXPanelCamposParametroNomi++;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroNomi.add(this.jPanelvalorParametroNomi, this.gridBagConstraintsParametroNomi);



	if(iXPanelCamposParametroNomi % 1==0) {
		iXPanelCamposParametroNomi=0;
		iYPanelCamposParametroNomi++;
	}
	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroNomi.gridy = iYPanelCamposParametroNomi;
	this.gridBagConstraintsParametroNomi.gridx = iXPanelCamposParametroNomi++;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroNomi.add(this.jPaneldescripcionParametroNomi, this.gridBagConstraintsParametroNomi);



	if(iXPanelCamposParametroNomi % 1==0) {
		iXPanelCamposParametroNomi=0;
		iYPanelCamposParametroNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroNomi.gridy = iYPanelCamposOcultosParametroNomi;
	this.gridBagConstraintsParametroNomi.gridx = iXPanelCamposOcultosParametroNomi++;
	this.gridBagConstraintsParametroNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroNomi.add(this.jPanelid_empresaParametroNomi, this.gridBagConstraintsParametroNomi);



	if(iXPanelCamposOcultosParametroNomi % 1==0) {
		iXPanelCamposOcultosParametroNomi=0;
		iYPanelCamposOcultosParametroNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroNomi= new GridBagLayout();
		this.jPanelAccionesParametroNomi.setLayout(gridaBagLayoutAccionesParametroNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroNomi= new GridBagLayout();
		this.jPanelAccionesFormularioParametroNomi.setLayout(gridaBagLayoutAccionesFormularioParametroNomi);
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroNomi.add(this.jComboBoxTiposAccionesFormularioParametroNomi, this.gridBagConstraintsParametroNomi);

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroNomi.add(this.jCheckBoxPostAccionNuevoParametroNomi, this.gridBagConstraintsParametroNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametronomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroNomi.add(this.jCheckBoxPostAccionSinCerrarParametroNomi, this.gridBagConstraintsParametroNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametronomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroNomi.add(this.jCheckBoxPostAccionSinMensajeParametroNomi, this.gridBagConstraintsParametroNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroNomi.add(this.jButtonModificarParametroNomi, this.gridBagConstraintsParametroNomi);							

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroNomi.add(this.jButtonEliminarParametroNomi, this.gridBagConstraintsParametroNomi);
		
			
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = 0;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroNomi.add(this.jButtonActualizarParametroNomi, this.gridBagConstraintsParametroNomi);


		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = 0;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroNomi.add(this.jButtonGuardarCambiosParametroNomi, this.gridBagConstraintsParametroNomi);	
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = 0;		
		this.gridBagConstraintsParametroNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroNomi.add(this.jButtonCancelarParametroNomi, this.gridBagConstraintsParametroNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();						
			this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroNomi.gridx = 0;		
			//this.gridBagConstraintsParametroNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroNomi.gridx =0;
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroNomi, this.gridBagConstraintsParametroNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroNomi = new ParametroNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroNomiModel parametronomiModel=new ParametroNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroNomiModel.ParametroNomiFocusTraversalPolicy parametronomiFocusTraversalPolicy = parametronomiModel.new ParametroNomiFocusTraversalPolicy(this);
			
			//parametronomiFocusTraversalPolicy.setparametronomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametronomiModel);
			
			
			this.jContentPaneDetalleParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroNomi = new GridBagLayout();	
			this.jContentPaneDetalleParametroNomi.setLayout(gridaBagLayoutDetalleParametroNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroNomi = new GridBagConstraints();
				this.gridBagConstraintsParametroNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroNomi.gridx = 0;
					
				
				this.jContentPaneDetalleParametroNomi.add(jTtoolBarDetalleParametroNomi, gridBagConstraintsParametroNomi);								
				
}
			
			this.jScrollPanelDatosEdicionParametroNomi=   new JScrollPane(jContentPaneDetalleParametroNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroNomi.gridx = 0;
	        
			this.jContentPaneDetalleParametroNomi.add(jPanelCamposParametroNomi, gridBagConstraintsParametroNomi);
			
			
			
			
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
						&& parametronomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroNomi= new GridBagConstraints();
						this.gridBagConstraintsParametroNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroNomi.gridx = 0;
						this.jContentPaneDetalleParametroNomi.add(this.jTabbedPaneRelacionesParametroNomi, this.gridBagConstraintsParametroNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroNomi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroNomi = new GridBagConstraints();
					this.gridBagConstraintsParametroNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroNomi.gridx = 0;
					
				
					this.jContentPaneDetalleParametroNomi.add(jPanelCamposOcultosParametroNomi, gridBagConstraintsParametroNomi);
				
					this.jPanelCamposOcultosParametroNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroNomi.gridx = 0;
	        this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroNomi.add(this.jPanelAccionesFormularioParametroNomi, this.gridBagConstraintsParametroNomi);							
			
			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
	        this.gridBagConstraintsParametroNomi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroNomi.add(this.jPanelAccionesParametroNomi, this.gridBagConstraintsParametroNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroNomi=   new JScrollPane(this.jPanelCamposParametroNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroNomi.gridx = 0;
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroNomi, this.gridBagConstraintsParametroNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroNomi, this.gridBagConstraintsParametroNomi);			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroNomi, this.gridBagConstraintsParametroNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroNomi, this.gridBagConstraintsParametroNomi);
			
			
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroNomi, this.gridBagConstraintsParametroNomi);
		
			
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroNomi, this.gridBagConstraintsParametroNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroNomi;
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

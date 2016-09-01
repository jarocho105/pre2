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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.facturacion.util.EstadoPedidoConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoPedidoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoPedidoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoPedidoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoPedidoBeanSwingJInternalFrame extends EstadoPedidoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoPedidoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoPedido> estadopedidoValidator = new ClassValidator<EstadoPedido>(EstadoPedido.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoPedido estadopedido;	
	public EstadoPedido estadopedidoAux;
	public EstadoPedido estadopedidoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoPedido estadopedidoTotales;
	public Long idEstadoPedidoActual;
	public Long iIdNuevoEstadoPedido=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboColorGeneral="";

	public List<ColorGeneral> colorgeneralsForeignKey;

	public List<ColorGeneral> getcolorgeneralsForeignKey() {
		return colorgeneralsForeignKey;
	}

	public void setcolorgeneralsForeignKey(List<ColorGeneral> colorgeneralsForeignKey) {
		this.colorgeneralsForeignKey = colorgeneralsForeignKey;
	}

	//OBJETO FK ACTUAL
	public ColorGeneral colorgeneralForeignKey;

	public ColorGeneral getcolorgeneralForeignKey() {
		return colorgeneralForeignKey;
	}

	public void setcolorgeneralForeignKey(ColorGeneral colorgeneralForeignKey) {
		this.colorgeneralForeignKey = colorgeneralForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosConsignacion=false;

	public Boolean getIsTienePermisosConsignacion() {
		return isTienePermisosConsignacion;
	}

	public void setIsTienePermisosConsignacion(Boolean isTienePermisosConsignacion) {
		this.isTienePermisosConsignacion= isTienePermisosConsignacion;
	}


	public Boolean isTienePermisosPedidoExpor=false;

	public Boolean getIsTienePermisosPedidoExpor() {
		return isTienePermisosPedidoExpor;
	}

	public void setIsTienePermisosPedidoExpor(Boolean isTienePermisosPedidoExpor) {
		this.isTienePermisosPedidoExpor= isTienePermisosPedidoExpor;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoEstadoPedido;
	public Boolean isPermisoNuevoEstadoPedido;
	public Boolean isPermisoActualizarEstadoPedido;
	public Boolean isPermisoActualizarOriginalEstadoPedido;
	public Boolean isPermisoEliminarEstadoPedido;
	public Boolean isPermisoGuardarCambiosEstadoPedido;
	public Boolean isPermisoConsultaEstadoPedido;
	public Boolean isPermisoBusquedaEstadoPedido;
	public Boolean isPermisoReporteEstadoPedido;
	public Boolean isPermisoPaginacionMedioEstadoPedido;
	public Boolean isPermisoPaginacionAltoEstadoPedido;
	public Boolean isPermisoPaginacionTodoEstadoPedido;
	public Boolean isPermisoCopiarEstadoPedido;
	public Boolean isPermisoVerFormEstadoPedido;
	public Boolean isPermisoDuplicarEstadoPedido;
	public Boolean isPermisoOrdenEstadoPedido;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public EstadoPedidoParameterReturnGeneral estadopedidoReturnGeneral;
	public EstadoPedidoParameterReturnGeneral estadopedidoParameterGeneral;
	
	

	public ConsignacionLogic consignacionLogic=null;

	public ConsignacionLogic getConsignacionLogic() {
		return consignacionLogic;
	}

	public void setConsignacionLogic(ConsignacionLogic consignacionLogic) {
		this.consignacionLogic = consignacionLogic;
	}


	public PedidoExporLogic pedidoexporExporLogic=null;

	public PedidoExporLogic getPedidoExporExporLogic() {
		return pedidoexporExporLogic;
	}

	public void setPedidoExporExporLogic(PedidoExporLogic pedidoexporExporLogic) {
		this.pedidoexporExporLogic = pedidoexporExporLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoPedido=false;
	public Boolean esParaAccionDesdeFormularioEstadoPedido=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoPedidoLogic estadopedidoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoPedido estadopedidoBean;
	public EstadoPedidoConstantesFunciones estadopedidoConstantesFunciones;
	//public EstadoPedidoParameterReturnGeneral estadopedidoReturnGeneral;
	
	//FK
	
	public ColorGeneralLogic colorgeneralLogic;
	
	//PARAMETROS
	
	
	//public List<EstadoPedido> estadopedidos;	
	//public List<EstadoPedido> estadopedidosEliminados;
	//public List<EstadoPedido> estadopedidosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoPedido=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoPedido=true;
	public Boolean isVisibilidadCeldaCopiarEstadoPedido=true;
	public Boolean isVisibilidadCeldaVerFormEstadoPedido=true;
	public Boolean isVisibilidadCeldaOrdenEstadoPedido=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
	public Boolean isVisibilidadCeldaModificarEstadoPedido=false;
	public Boolean isVisibilidadCeldaActualizarEstadoPedido=false;
	public Boolean isVisibilidadCeldaEliminarEstadoPedido=false;
	public Boolean isVisibilidadCeldaCancelarEstadoPedido=false;
	public Boolean isVisibilidadCeldaGuardarEstadoPedido=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoPedido=false;	
	
	
	public Boolean isVisibilidadFK_IdColorGeneral=false;
	
	public Long getiIdNuevoEstadoPedido() {
		return this.iIdNuevoEstadoPedido;
	}

	public void setiIdNuevoEstadoPedido(Long iIdNuevoEstadoPedido) {
		this.iIdNuevoEstadoPedido = iIdNuevoEstadoPedido;
	}
	
	public Long getidEstadoPedidoActual() {
		return this.idEstadoPedidoActual;
	}

	public void setidEstadoPedidoActual(Long idEstadoPedidoActual) {
		this.idEstadoPedidoActual = idEstadoPedidoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoPedido getestadopedido() {
		return this.estadopedido;
	}

	public void setestadopedido(EstadoPedido estadopedido) {
		this.estadopedido = estadopedido;
	}
	
	public EstadoPedido getestadopedidoAux() {
		return this.estadopedidoAux;
	}

	public void setestadopedidoAux(EstadoPedido estadopedidoAux) {
		this.estadopedidoAux = estadopedidoAux;
	}				
	
	public EstadoPedido getestadopedidoAnterior() {
		return this.estadopedidoAnterior;
	}

	public void setestadopedidoAnterior(EstadoPedido estadopedidoAnterior) {
		this.estadopedidoAnterior = estadopedidoAnterior;
	}	
	
	public EstadoPedido getestadopedidoTotales() {
		return this.estadopedidoTotales;
	}

	public void setestadopedidoTotales(EstadoPedido estadopedidoTotales) {
		this.estadopedidoTotales = estadopedidoTotales;
	}	
	
	public EstadoPedido getestadopedidoBean() {
		return this.estadopedidoBean;
	}

	public void setestadopedidoBean(EstadoPedido estadopedidoBean) {
		this.estadopedidoBean = estadopedidoBean;
	}	
	
	public EstadoPedidoParameterReturnGeneral getestadopedidoReturnGeneral() {
		return this.estadopedidoReturnGeneral;
	}

	public void setestadopedidoReturnGeneral(EstadoPedidoParameterReturnGeneral estadopedidoReturnGeneral) {
		this.estadopedidoReturnGeneral = estadopedidoReturnGeneral;
	}	
	
	
	public Long id_color_generalFK_IdColorGeneral=-1L;

	public Long getid_color_generalFK_IdColorGeneral() {
		return this.id_color_generalFK_IdColorGeneral;
	}

	public void setid_color_generalFK_IdColorGeneral(Long id_color_generalFK_IdColorGeneral) {
		this.id_color_generalFK_IdColorGeneral = id_color_generalFK_IdColorGeneral;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoPedidoLogic getEstadoPedidoLogic()	{		
		return estadopedidoLogic;
	}

	public void setEstadoPedidoLogic(EstadoPedidoLogic estadopedidoLogic) {
		this.estadopedidoLogic = estadopedidoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoEstadoPedido() {
		return isEsNuevoEstadoPedido;
	}

	public void setIsEsNuevoEstadoPedido(Boolean isEsNuevoEstadoPedido) {
		this.isEsNuevoEstadoPedido = isEsNuevoEstadoPedido;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoPedido() {
		return esParaAccionDesdeFormularioEstadoPedido;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoPedido(Boolean esParaAccionDesdeFormularioEstadoPedido) {
		this.esParaAccionDesdeFormularioEstadoPedido = esParaAccionDesdeFormularioEstadoPedido;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosColorGeneralsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ColorGeneralLogic colorgeneralLogic=new ColorGeneralLogic();

			colorgeneralLogic.getColorGeneralDataAccess().setIsForForeingKeyData(true);

			if(this.estadopedidoSessionBean==null) {
				this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
			}

			if(!this.estadopedidoSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorgeneralLogic.getColorGeneralDataAccess().setIsForForeingKeyData(true);

					colorgeneralLogic.getTodosColorGeneralsWithConnection(sFinalQuery,new Pagination());

					this.colorgeneralsForeignKey=colorgeneralLogic.getColorGenerals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaColorGeneral(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorgeneralLogic.getEntityWithConnection(estadopedidoSessionBean.getlidColorGeneralActual());
					this.colorgeneralsForeignKey.add(colorgeneralLogic.getColorGeneral());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualColorGeneralForeignKey(Long idColorGeneralSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ColorGeneral  colorgeneralTemp=null;

			for(ColorGeneral colorgeneralAux:colorgeneralsForeignKey) {
				if(colorgeneralAux.getId()!=null && colorgeneralAux.getId().equals(idColorGeneralSeleccionado)) {
					colorgeneralTemp=colorgeneralAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(colorgeneralTemp!=null) {

					if(this.estadopedido!=null) {
						this.estadopedido.setColorGeneral(colorgeneralTemp);
					}

					if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
						this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setSelectedItem(colorgeneralTemp);
					}
				} else {
					//jComboBoxid_color_generalEstadoPedido.setSelectedItem(colorgeneralTemp);
					if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
						if(this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdColorGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(colorgeneralTemp!=null && jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido!=null) {
						jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setSelectedItem(colorgeneralTemp);
					} else {
						if(jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido!=null) {
							//jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setSelectedItem(colorgeneralTemp);
							if(jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.getItemCount()>0) {
								jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualColorGeneralForeignKeyDescripcion(Long idColorGeneralSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ColorGeneral  colorgeneralTemp=null;

			for(ColorGeneral colorgeneralAux:colorgeneralsForeignKey) {
				if(colorgeneralAux.getId()!=null && colorgeneralAux.getId().equals(idColorGeneralSeleccionado)) {
					colorgeneralTemp=colorgeneralAux;
					break;
				}
			}


			sDescripcion=ColorGeneralConstantesFunciones.getColorGeneralDescripcion(colorgeneralTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualColorGeneralForeignKeyGenerico(Long idColorGeneralSeleccionado,JComboBox jComboBoxid_color_generalEstadoPedidoGenerico)throws Exception
	{
		try
		{
			ColorGeneral  colorgeneralTemp=null;

			for(ColorGeneral colorgeneralAux:colorgeneralsForeignKey) {
				if(colorgeneralAux.getId()!=null && colorgeneralAux.getId().equals(idColorGeneralSeleccionado)) {
					colorgeneralTemp=colorgeneralAux;
					break;
				}
			}

			if(colorgeneralTemp!=null) {
				jComboBoxid_color_generalEstadoPedidoGenerico.setSelectedItem(colorgeneralTemp);
			} else {
				if(jComboBoxid_color_generalEstadoPedidoGenerico!=null && jComboBoxid_color_generalEstadoPedidoGenerico.getItemCount()>0) {
					jComboBoxid_color_generalEstadoPedidoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarColorGeneralForeignKey(EstadoPedido estadopedido,JComboBox jComboBoxid_color_generalEstadoPedidoGenerico)throws Exception
	{
		try
		{
			ColorGeneral  colorgeneralAux=new ColorGeneral();

			if(jComboBoxid_color_generalEstadoPedidoGenerico==null) {
				colorgeneralAux=(ColorGeneral)this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.getSelectedItem();
			} else {
				colorgeneralAux=(ColorGeneral)jComboBoxid_color_generalEstadoPedidoGenerico.getSelectedItem();
			}

			if(colorgeneralAux!=null && colorgeneralAux.getId()!=null) {
				estadopedido.setid_color_general(colorgeneralAux.getId());
				estadopedido.setcolorgeneral_descripcion(EstadoPedidoConstantesFunciones.getColorGeneralDescripcion(colorgeneralAux));
				estadopedido.setColorGeneral(colorgeneralAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameColorGeneralsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingColorGeneral=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadoPedido!=null) { 
							this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.removeAllItems();

							for(ColorGeneral colorgeneral:this.colorgeneralsForeignKey) {
								this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.addItem(colorgeneral);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadoPedido!=null) { 
					}

					if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdColorGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.removeAllItems();

							for(ColorGeneral colorgeneral:this.colorgeneralsForeignKey) {
								this.jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.addItem(colorgeneral);
							}
						}

						if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameColorGeneralForeignKey(ColorGeneral colorgeneral,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
							this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setSelectedItem(colorgeneral);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
							this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setSelectedItem(colorgeneral);
						} else {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadoPedido() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoPedidoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPedido(this.estadopedidoLogic.getEstadoPedidos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoPedidoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPedido(this.estadopedidos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ColorGeneral.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadopedidoLogic.setEstadoPedidos(this.estadopedidos);
			estadopedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public EstadoPedidoParameterReturnGeneral getEstadoPedidoParameterGeneral() {
		return this.estadopedidoParameterGeneral;
	}
	
	public void setEstadoPedidoParameterGeneral(EstadoPedidoParameterReturnGeneral estadopedidoParameterGeneral) {
		this.estadopedidoParameterGeneral = estadopedidoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoEstadoPedido() {
		return isPermisoTodoEstadoPedido;
	}

	public void setIsPermisoTodoEstadoPedido(Boolean isPermisoTodoEstadoPedido) {
		this.isPermisoTodoEstadoPedido = isPermisoTodoEstadoPedido;
	}

	public Boolean getIsPermisoNuevoEstadoPedido() {
		return isPermisoNuevoEstadoPedido;
	}

	public void setIsPermisoNuevoEstadoPedido(Boolean isPermisoNuevoEstadoPedido) {
		this.isPermisoNuevoEstadoPedido = isPermisoNuevoEstadoPedido;
	}

	public Boolean getIsPermisoActualizarEstadoPedido() {
		return isPermisoActualizarEstadoPedido;
	}

	public void setIsPermisoActualizarEstadoPedido(Boolean isPermisoActualizarEstadoPedido) {
		this.isPermisoActualizarEstadoPedido = isPermisoActualizarEstadoPedido;
	}

	public Boolean getIsPermisoEliminarEstadoPedido() {
		return isPermisoEliminarEstadoPedido;
	}

	public void setIsPermisoEliminarEstadoPedido(Boolean isPermisoEliminarEstadoPedido) {
		this.isPermisoEliminarEstadoPedido = isPermisoEliminarEstadoPedido;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoPedido() {
		return isPermisoGuardarCambiosEstadoPedido;
	}

	public void setIsPermisoGuardarCambiosEstadoPedido(Boolean isPermisoGuardarCambiosEstadoPedido) {
		this.isPermisoGuardarCambiosEstadoPedido = isPermisoGuardarCambiosEstadoPedido;
	}
	
	public Boolean getIsPermisoConsultaEstadoPedido() {
		return isPermisoConsultaEstadoPedido;
	}

	public void setIsPermisoConsultaEstadoPedido(Boolean isPermisoConsultaEstadoPedido) {
		this.isPermisoConsultaEstadoPedido = isPermisoConsultaEstadoPedido;
	}

	public Boolean getIsPermisoBusquedaEstadoPedido() {
		return isPermisoBusquedaEstadoPedido;
	}

	public void setIsPermisoBusquedaEstadoPedido(Boolean isPermisoBusquedaEstadoPedido) {
		this.isPermisoBusquedaEstadoPedido = isPermisoBusquedaEstadoPedido;
	}

	public Boolean getIsPermisoReporteEstadoPedido() {
		return isPermisoReporteEstadoPedido;
	}

	public void setIsPermisoReporteEstadoPedido(Boolean isPermisoReporteEstadoPedido) {
		this.isPermisoReporteEstadoPedido = isPermisoReporteEstadoPedido;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoPedido() {
		return isPermisoPaginacionMedioEstadoPedido;
	}

	public void setIsPermisoPaginacionMedioEstadoPedido(Boolean isPermisoPaginacionMedioEstadoPedido) {
		this.isPermisoPaginacionMedioEstadoPedido = isPermisoPaginacionMedioEstadoPedido;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoPedido() {
		return isPermisoPaginacionTodoEstadoPedido;
	}

	public void setIsPermisoPaginacionTodoEstadoPedido(Boolean isPermisoPaginacionTodoEstadoPedido) {
		this.isPermisoPaginacionTodoEstadoPedido = isPermisoPaginacionTodoEstadoPedido;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoPedido() {
		return isPermisoPaginacionAltoEstadoPedido;
	}

	public void setIsPermisoPaginacionAltoEstadoPedido(Boolean isPermisoPaginacionAltoEstadoPedido) {
		this.isPermisoPaginacionAltoEstadoPedido = isPermisoPaginacionAltoEstadoPedido;
	}
	
	public Boolean getIsPermisoCopiarEstadoPedido() {
		return isPermisoCopiarEstadoPedido;
	}

	public void setIsPermisoCopiarEstadoPedido(Boolean isPermisoCopiarEstadoPedido) {
		this.isPermisoCopiarEstadoPedido = isPermisoCopiarEstadoPedido;
	}
	
	public Boolean getIsPermisoVerFormEstadoPedido() {
		return isPermisoVerFormEstadoPedido;
	}

	public void setIsPermisoVerFormEstadoPedido(Boolean isPermisoVerFormEstadoPedido) {
		this.isPermisoVerFormEstadoPedido = isPermisoVerFormEstadoPedido;
	}
	
	public Boolean getIsPermisoDuplicarEstadoPedido() {
		return isPermisoDuplicarEstadoPedido;
	}

	public void setIsPermisoDuplicarEstadoPedido(Boolean isPermisoDuplicarEstadoPedido) {
		this.isPermisoDuplicarEstadoPedido = isPermisoDuplicarEstadoPedido;
	}
	
	public Boolean getIsPermisoOrdenEstadoPedido() {
		return isPermisoOrdenEstadoPedido;
	}

	public void setIsPermisoOrdenEstadoPedido(Boolean isPermisoOrdenEstadoPedido) {
		this.isPermisoOrdenEstadoPedido = isPermisoOrdenEstadoPedido;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoPedido() {
		return isVisibilidadCeldaNuevoEstadoPedido;
	}

	public void setIsVisibilidadCeldaNuevoEstadoPedido(Boolean isVisibilidadCeldaNuevoEstadoPedido) {
		this.isVisibilidadCeldaNuevoEstadoPedido = isVisibilidadCeldaNuevoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoPedido() {
		return isVisibilidadCeldaDuplicarEstadoPedido;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoPedido(Boolean isVisibilidadCeldaDuplicarEstadoPedido) {
		this.isVisibilidadCeldaDuplicarEstadoPedido = isVisibilidadCeldaDuplicarEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoPedido() {
		return isVisibilidadCeldaCopiarEstadoPedido;
	}

	public void setIsVisibilidadCeldaCopiarEstadoPedido(Boolean isVisibilidadCeldaCopiarEstadoPedido) {
		this.isVisibilidadCeldaCopiarEstadoPedido = isVisibilidadCeldaCopiarEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoPedido() {
		return isVisibilidadCeldaVerFormEstadoPedido;
	}

	public void setIsVisibilidadCeldaVerFormEstadoPedido(Boolean isVisibilidadCeldaVerFormEstadoPedido) {
		this.isVisibilidadCeldaVerFormEstadoPedido = isVisibilidadCeldaVerFormEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoPedido() {
		return isVisibilidadCeldaOrdenEstadoPedido;
	}

	public void setIsVisibilidadCeldaOrdenEstadoPedido(Boolean isVisibilidadCeldaOrdenEstadoPedido) {
		this.isVisibilidadCeldaOrdenEstadoPedido = isVisibilidadCeldaOrdenEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoPedido() {
		return isVisibilidadCeldaNuevoRelacionesEstadoPedido;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoPedido(Boolean isVisibilidadCeldaNuevoRelacionesEstadoPedido) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoPedido = isVisibilidadCeldaNuevoRelacionesEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoPedido() {
		return isVisibilidadCeldaModificarEstadoPedido;
	}

	public void setIsVisibilidadCeldaModificarEstadoPedido(Boolean isVisibilidadCeldaModificarEstadoPedido) {
		this.isVisibilidadCeldaModificarEstadoPedido = isVisibilidadCeldaModificarEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoPedido() {
		return isVisibilidadCeldaActualizarEstadoPedido;
	}

	public void setIsVisibilidadCeldaActualizarEstadoPedido(Boolean isVisibilidadCeldaActualizarEstadoPedido) {
		this.isVisibilidadCeldaActualizarEstadoPedido = isVisibilidadCeldaActualizarEstadoPedido;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoPedido() {
		return isVisibilidadCeldaEliminarEstadoPedido;
	}

	public void setIsVisibilidadCeldaEliminarEstadoPedido(Boolean isVisibilidadCeldaEliminarEstadoPedido) {
		this.isVisibilidadCeldaEliminarEstadoPedido = isVisibilidadCeldaEliminarEstadoPedido;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoPedido() {
		return isVisibilidadCeldaCancelarEstadoPedido;
	}

	public void setIsVisibilidadCeldaCancelarEstadoPedido(Boolean isVisibilidadCeldaCancelarEstadoPedido) {
		this.isVisibilidadCeldaCancelarEstadoPedido = isVisibilidadCeldaCancelarEstadoPedido;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoPedido() {
		return isVisibilidadCeldaGuardarEstadoPedido;
	}

	public void setIsVisibilidadCeldaGuardarEstadoPedido(Boolean isVisibilidadCeldaGuardarEstadoPedido) {
		this.isVisibilidadCeldaGuardarEstadoPedido = isVisibilidadCeldaGuardarEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoPedido() {
		return isVisibilidadCeldaGuardarCambiosEstadoPedido;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoPedido(Boolean isVisibilidadCeldaGuardarCambiosEstadoPedido) {
		this.isVisibilidadCeldaGuardarCambiosEstadoPedido = isVisibilidadCeldaGuardarCambiosEstadoPedido;
	}
		
	public EstadoPedidoSessionBean getestadopedidoSessionBean() {
		return this.estadopedidoSessionBean;
	}
	
	public void setestadopedidoSessionBean(EstadoPedidoSessionBean estadopedidoSessionBean) {
		this.estadopedidoSessionBean=estadopedidoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdColorGeneral() {
		return this.isVisibilidadFK_IdColorGeneral;
	}

	public void setisVisibilidadFK_IdColorGeneral(Boolean isVisibilidadFK_IdColorGeneral) {
		this.isVisibilidadFK_IdColorGeneral=isVisibilidadFK_IdColorGeneral;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(EstadoPedido estadopedido)throws Exception {
		try {
			
				this.setActualParaGuardarColorGeneralForeignKey(estadopedido,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(EstadoPedido estadopedido,EstadoPedido estadopedidoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoPedido(estadopedido);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadopedidoAux.setId(estadopedido.getId());
		estadopedidoAux.setVersionRow(estadopedido.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoPedido();
		
			int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadopedidoValidator.getInvalidValues(this.estadopedido);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadopedidoLogic.setDatosCliente(datosCliente);
			estadopedidoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadopedidoAux=new  EstadoPedido();
				
				estadopedidoAux.setIsNew(true);
				estadopedidoAux.setIsChanged(true);
				
				estadopedidoAux.setEstadoPedidoOriginal(this.estadopedido);
				
				estadopedidoAux.setId(this.estadopedido.getId());	
				estadopedidoAux.setVersionRow(this.estadopedido.getVersionRow());	
				estadopedidoAux.setcodigo(this.estadopedido.getcodigo());	
				estadopedidoAux.setnombre(this.estadopedido.getnombre());	
				estadopedidoAux.setid_color_general(this.estadopedido.getid_color_general());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadopedidoAux,estadopedidoLogic.getEstadoPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidoAux,estadopedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadopedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidoLogic.saveEstadoPedidos();//WithConnection
						//estadopedidoLogic.getSetVersionRowEstadoPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopedido,estadopedidoAux);
					
					this.refrescarForeignKeysDescripcionesEstadoPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadopedidoAux=new  EstadoPedido();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadopedidoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadopedidoSessionBean.getEsGuardarRelacionado() && this.estadopedido.getId()>=0)) {
						
					estadopedidoAux.setIsNew(false);
				}
				
				estadopedidoAux.setIsDeleted(false);
			
				estadopedidoAux.setId(this.estadopedido.getId());	
				estadopedidoAux.setVersionRow(this.estadopedido.getVersionRow());	
				estadopedidoAux.setcodigo(this.estadopedido.getcodigo());	
				estadopedidoAux.setnombre(this.estadopedido.getnombre());	
				estadopedidoAux.setid_color_general(this.estadopedido.getid_color_general());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopedidoAux,estadopedidoLogic.getEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidoAux,estadopedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadopedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidoLogic.saveEstadoPedidos();//WithConnection
						//estadopedidoLogic.getSetVersionRowEstadoPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopedido,estadopedidoAux);
					
					this.refrescarForeignKeysDescripcionesEstadoPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadopedidoAux=new  EstadoPedido();
				
				estadopedidoAux.setIsNew(false);
				estadopedidoAux.setIsChanged(false);
				
				estadopedidoAux.setIsDeleted(true);
				
				estadopedidoAux.setId(this.estadopedido.getId());	
				estadopedidoAux.setVersionRow(this.estadopedido.getVersionRow());	
				estadopedidoAux.setcodigo(this.estadopedido.getcodigo());	
				estadopedidoAux.setnombre(this.estadopedido.getnombre());	
				estadopedidoAux.setid_color_general(this.estadopedido.getid_color_general());	
				
				if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadopedidoAux.getId()>=0) {	
						this.estadopedidosEliminados.add(estadopedidoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadopedidoAux,estadopedidoLogic.getEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidoAux,estadopedidos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadopedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidoLogic.saveEstadoPedidos();//WithConnection
						//estadopedidoLogic.getSetVersionRowEstadoPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadopedidoAux.setConsignacions(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());

							if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							estadopedidoAux.setPedidoExporExpors(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadopedidoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadopedidoAux,estadopedidoLogic.getEstadoPedidos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadopedidoAux,estadopedidos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.getEstadoPedidos().addAll(this.estadopedidosEliminados);
					
					estadopedidoLogic.saveEstadoPedidos();//WithConnection
					//estadopedidoLogic.getSetVersionRowEstadoPedidos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEstadoPedido();
				
				this.estadopedidosEliminados= new ArrayList<EstadoPedido>();		
			}
			
			if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Pedido GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadopedido=estadopedidoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessEstadoPedido();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoPedido estadopedidoLocal) throws Exception {
		
		if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadopedidoLocal.setConsignacions(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());
				estadopedidoLocal.setPedidoExporExpors(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
			
			} else {
			
				estadopedidoLocal.setConsignacions(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacions);
				estadopedidoLocal.setPedidoExporExpors(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexpors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoPedido estadopedidoLocal) throws Exception {	
		if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ColorGeneralDetalleFormJInternalFrame.class)) {
				ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrameLocal=(ColorGeneralBeanSwingJInternalFrame) ((ColorGeneralDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				colorgeneralBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoColorGeneral(colorgeneralBeanSwingJInternalFrameLocal.getcolorgeneral(),true);
				colorgeneralBeanSwingJInternalFrameLocal.actualizarLista(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral,this.colorgeneralsForeignKey);

				colorgeneralBeanSwingJInternalFrameLocal.actualizarRelaciones(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral);

				estadopedidoLocal.setColorGeneral(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral);

				this.addItemDefectoCombosForeignKeyColorGeneral();
				this.cargarCombosFrameColorGeneralsForeignKey("Formulario");
				this.setActualColorGeneralForeignKey(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadoPedidoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadopedidoValidator.getInvalidValues(this.estadopedido);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoPedido estadopedido,List<EstadoPedido> estadopedidos) throws Exception {
		try	{		
			EstadoPedidoConstantesFunciones.actualizarLista(estadopedido,estadopedidos,this.estadopedidoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoPedido estadopedido,List<EstadoPedido> estadopedidos) throws Exception {
		try	{			
			EstadoPedidoConstantesFunciones.actualizarSelectedLista(estadopedido,estadopedidos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoPedido> estadopedidosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadopedidosLocal=this.estadopedidoLogic.getEstadoPedidos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadopedidosLocal=this.estadopedidos;
			}
			//ARCHITECTURE
		
			for(EstadoPedido estadopedidoLocal:estadopedidosLocal) {
				if(this.permiteMantenimiento(estadopedidoLocal) && estadopedidoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+EstadoPedidoConstantesFunciones.getEstadoPedidoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoPedidoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedido.jLabelcodigoEstadoPedido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoPedidoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedido.jLabelnombreEstadoPedido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoPedidoConstantesFunciones.IDCOLORGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedido.jLabelid_color_generalEstadoPedido,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPedido.jLabelcodigoEstadoPedido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPedido.jLabelnombreEstadoPedido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPedido.jLabelid_color_generalEstadoPedido,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Consignacion")) {
			if(this.estadopedido==null) {
				this.estadopedido= new EstadoPedido();
			}

			if(this.estadopedidoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoPedido
				this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);

				this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.getconsignacion().setEstadoPedido(this.estadopedido);
			}

			return;
		}
		 else  if(sTipo.equals("PedidoExpor")) {
			if(this.estadopedido==null) {
				this.estadopedido= new EstadoPedido();
			}

			if(this.estadopedidoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoPedido
				this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);

				this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.getpedidoexpor().setEstadoPedidoExpor(this.estadopedido);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoPedido--;	
		
		
		this.estadopedidoAux=new EstadoPedido();
		
		this.estadopedidoAux.setId(this.iIdNuevoEstadoPedido);
		this.estadopedidoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopedidoLogic.getEstadoPedidos().add(this.estadopedidoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadopedidos.add(this.estadopedidoAux);
		}
		//ARCHITECTURE
		
		this.estadopedido=this.estadopedidoAux;
		
		if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoPedido(this.estadopedido);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedido(this.estadopedido);
		}
				
		//this.setDefaultControlesEstadoPedido();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoPedido();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoPedido();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPedido();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPedido(this.estadopedidoBean,this.estadopedido,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoPedidoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoPedidoConstantesFunciones.getClassesRelationshipsOfEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadopedidoReturnGeneral=estadopedidoLogic.procesarEventosEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopedidoLogic.getEstadoPedidos(),this.estadopedido,this.estadopedidoParameterGeneral,this.isEsNuevoEstadoPedido,classes);//this.estadopedidoLogic.getEstadoPedido()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoPedido(this.estadopedidoReturnGeneral,this.estadopedidoBean,false);
		
		if(this.estadopedidoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedido(this.estadopedidoReturnGeneral.getEstadoPedido());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoPedido(this.estadopedidoReturnGeneral.getEstadoPedido());
		}
		
		if(this.estadopedidoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoPedido(this.estadopedidoReturnGeneral.getEstadoPedido(),classes);//this.estadopedidoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoPedido();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoPedido();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoPedido(false);
						
			if(estadopedidoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado() && ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConsignacionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPedido();
			}
			
			this.actualizarVisualTableDatosEstadoPedido();
			
			this.jTableDatosEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoEstadoPedido(), this.getIndiceNuevoEstadoPedido());
			
			this.seleccionarFilaTablaEstadoPedidoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoPedido("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoPedido(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.setEnabled(isHabilitar && this.estadopedidoConstantesFunciones.activarcodigoEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.setEnabled(isHabilitar && this.estadopedidoConstantesFunciones.activarnombreEstadoPedido);	
		
		this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setEnabled(isHabilitar && this.estadopedidoConstantesFunciones.activarid_color_generalEstadoPedido);
	};
	
	public void setDefaultControlesEstadoPedido() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoPedido(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadopedidoSessionBean.setConGuardarRelaciones(true);			
			this.estadopedidoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadopedidoSessionBean.setConGuardarRelaciones(false);			
			this.estadopedidoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoPedido() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
				if(estadopedidoAux.getId().equals(this.iIdNuevoEstadoPedido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedido estadopedidoAux:this.estadopedidos) {
				if(estadopedidoAux.getId().equals(this.iIdNuevoEstadoPedido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualEstadoPedido(EstadoPedido estadopedido,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
				if(estadopedidoAux.getId().equals(estadopedido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedido estadopedidoAux:this.estadopedidos) {
				if(estadopedidoAux.getId().equals(estadopedido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalEstadoPedido(EstadoPedido estadopedidoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
				if(estadopedidoAux.getEstadoPedidoOriginal().getId().equals(estadopedidoOriginal.getId())) {
					existe=true;
					estadopedidoOriginal.setId(estadopedidoAux.getId());
					estadopedidoOriginal.setVersionRow(estadopedidoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedido estadopedidoAux:this.estadopedidos) {
				if(estadopedidoAux.getEstadoPedidoOriginal().getId().equals(estadopedidoOriginal.getId())) {
					existe=true;
					estadopedidoOriginal.setId(estadopedidoAux.getId());
					estadopedidoOriginal.setVersionRow(estadopedidoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoPedido(Boolean esParaCancelar) throws Exception {
		estadopedidosAux=new ArrayList<EstadoPedido>();
		estadopedidoAux=new EstadoPedido();
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
					if(estadopedidoAux.getId()<0) {
						estadopedidosAux.add(estadopedidoAux);
					}		
				}
				this.iIdNuevoEstadoPedido=0L;
				this.estadopedidoLogic.getEstadoPedidos().removeAll(estadopedidosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedido estadopedidoAux:this.estadopedidos) {
					if(estadopedidoAux.getId()<0) {
						estadopedidosAux.add(estadopedidoAux);
					}		
				}
				this.iIdNuevoEstadoPedido=0L;
				this.estadopedidos.removeAll(estadopedidosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoPedido 
					&& this.estadopedidoLogic.getEstadoPedidos().size()>0
					) {
					estadopedidoAux=this.estadopedidoLogic.getEstadoPedidos().get(this.estadopedidoLogic.getEstadoPedidos().size() - 1);
				
					if(estadopedidoAux.getId()<0) {
						this.estadopedidoLogic.getEstadoPedidos().remove(estadopedidoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoPedido && this.estadopedidos.size()>0) {
					estadopedidoAux=this.estadopedidos.get(this.estadopedidos.size() - 1);
				
					if(estadopedidoAux.getId()<0) {
						this.estadopedidos.remove(estadopedidoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoPedido(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadopedido.getId()<0) {
				this.estadopedidoLogic.getEstadoPedidos().remove(this.estadopedido);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadopedido.getId()<0) {
				this.estadopedidos.remove(this.estadopedido);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoPedido(List<EstadoPedido> estadopedidosAux) throws Exception {
		EstadoPedidoConstantesFunciones.setEstadosInicialesEstadoPedido(estadopedidosAux);
	}
	
	public void setEstadosInicialesEstadoPedido(EstadoPedido estadopedidoAux) throws Exception {
		EstadoPedidoConstantesFunciones.setEstadosInicialesEstadoPedido(estadopedidoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoPedidoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoPedidoActual()) {
				if(!this.isEsNuevoEstadoPedido) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoPedido=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoPedidoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Pedido ?", "MANTENIMIENTO DE Estado Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoPedido estadopedido) throws Exception {
		EstadoPedidoConstantesFunciones.seleccionarAsignar(this.estadopedido,estadopedido);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoPedido=this.isPermisoActualizarOriginalEstadoPedido;
			
			
			this.seleccionarAsignar(estadopedido);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPedidoConstantesFunciones.quitarEspaciosEstadoPedido(this.estadopedido,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadopedidoSessionBean.setsFuncionBusquedaRapida(this.estadopedidoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoPedido) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoPedido(esParaCancelar);				
				this.cancelarNuevoEstadoPedido(esParaCancelar);								
			}
			
			this.estadopedido=new EstadoPedido();
			
			this.inicializarEstadoPedido();
			
			this.actualizarEstadoCeldasBotonesEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoPedido() throws Exception {
		try {
			EstadoPedidoConstantesFunciones.inicializarEstadoPedido(this.estadopedido);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadopedidoLogic.getEstadoPedidos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoPedidos(String sAccionBusqueda,List<EstadoPedido> estadopedidosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="EstadoPedido"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoPedidoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoPedidoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoPedido"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Estado Pedidos");		
		parameters.put("busquedapor", EstadoPedidoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Consignacion.class));
			classes.add(new Classe(PedidoExpor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoPedidoLogic estadopedidoLogicAuxiliar=new EstadoPedidoLogic();
					estadopedidoLogicAuxiliar.setDatosCliente(estadopedidoLogic.getDatosCliente());				
					estadopedidoLogicAuxiliar.setEstadoPedidos(estadopedidosParaReportes);
					
					estadopedidoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoPedidoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadopedidosParaReportes=estadopedidoLogicAuxiliar.getEstadoPedidos();
					
					//estadopedidoLogic.getNewConnexionToDeep();
					
					//for (EstadoPedido estadopedido:estadopedidosParaReportes) {
					//	estadopedidoLogic.deepLoad(estadopedido, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadopedidoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadopedidoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileConsignacion = AuxiliarReportes.class.getResourceAsStream("ConsignacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_consignacion", reportFileConsignacion);

			InputStream reportFilePedidoExpor = AuxiliarReportes.class.getResourceAsStream("PedidoExporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidoexpor", reportFilePedidoExpor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoPedido=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoPedido=new JRBeanArrayDataSource(EstadoPedidoJInternalFrame.TraerEstadoPedidoBeans(estadopedidosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoPedido);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoPedidoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoPedidoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoPedidoBean.TraerEstadoPedidoBeans(estadopedidosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,estadopedidosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,estadopedidosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoPedidoActionPerformed(null);
					//this.generarExcelReporteEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,estadopedidosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,estadopedidosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,estadopedidosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,estadopedidosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPedido> estadopedidosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedido";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPedidos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPedido("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoPedido estadopedido : estadopedidosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoPedidoConstantesFunciones.generarExcelReporteDataEstadoPedido("NORMAL",row,workbook,estadopedido,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoPedido(String sTipo,Row row,Workbook workbook) {
		
		EstadoPedidoConstantesFunciones.generarExcelReporteHeaderEstadoPedido(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPedido> estadopedidosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedido_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoPedido estadopedido : estadopedidosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoPedidoConstantesFunciones.getEstadoPedidoDescripcion(estadopedido));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPedidoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopedido.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPedidoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopedido.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopedido.getcolorgeneral_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPedido> estadopedidosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoPedido> estadopedidosRespaldo=null;
		
		classes=EstadoPedidoConstantesFunciones.getClassesRelationshipsOfEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadopedidoLogic.setDatosCliente(this.datosCliente);
		this.estadopedidoLogic.setDatosDeep(this.datosDeep);
		this.estadopedidoLogic.setIsConDeep(true);
		
		estadopedidosRespaldo=this.estadopedidoLogic.getEstadoPedidos();
		
		this.estadopedidoLogic.setEstadoPedidos(estadopedidosParaReportes);	
		this.estadopedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadopedidosParaReportes=this.estadopedidoLogic.getEstadoPedidos();
		this.estadopedidoLogic.setEstadoPedidos(estadopedidosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedido_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPedido("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoPedido estadopedido : estadopedidosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoPedido("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoPedidoConstantesFunciones.generarExcelReporteDataEstadoPedido("NORMAL",row,workbook,estadopedido,cellStyleDataAux);
		
			
			


				//Consignacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConsignacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadopedido.getConsignacions()!=null && estadopedido.getConsignacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConsignacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConsignacionConstantesFunciones.generarExcelReporteHeaderConsignacion("RELACIONADO",row,workbook);
				}

				if(estadopedido.getConsignacions()!=null) {
					i2=0;
					for(Consignacion consignacion : estadopedido.getConsignacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ConsignacionConstantesFunciones.generarExcelReporteDataConsignacion("RELACIONADO",row,workbook,consignacion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PedidoExpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoExporConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadopedido.getPedidoExporExpors()!=null && estadopedido.getPedidoExporExpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoExporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoExporConstantesFunciones.generarExcelReporteHeaderPedidoExpor("RELACIONADO",row,workbook);
				}

				if(estadopedido.getPedidoExporExpors()!=null) {
					i2=0;
					for(PedidoExpor pedidoexpor : estadopedido.getPedidoExporExpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoExporConstantesFunciones.generarExcelReporteDataPedidoExpor("RELACIONADO",row,workbook,pedidoexpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoPedidoConstantesFunciones.getEstadoPedidoDescripcion(estadopedido));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedido.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoPedido() throws Exception {		
		this.startProcessEstadoPedido(true);
	}
	
	public void startProcessEstadoPedido(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadoPedido ,this.jPanelParametrosReportesEstadoPedido, this.jScrollPanelDatosEstadoPedido,this.jPanelPaginacionEstadoPedido, this.jScrollPanelDatosEdicionEstadoPedido, this.jPanelAccionesEstadoPedido,this.jPanelAccionesFormularioEstadoPedido,this.jmenuBarEstadoPedido,this.jmenuBarDetalleEstadoPedido,this.jTtoolBarEstadoPedido,this.jTtoolBarDetalleEstadoPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPedido=this.jTabbedPaneBusquedasEstadoPedido; 
		
		final JPanel jPanelParametrosReportesEstadoPedido=this.jPanelParametrosReportesEstadoPedido;
		//final JScrollPane jScrollPanelDatosEstadoPedido=this.jScrollPanelDatosEstadoPedido;
		final JTable jTableDatosEstadoPedido=this.jTableDatosEstadoPedido;		
		final JPanel jPanelPaginacionEstadoPedido=this.jPanelPaginacionEstadoPedido;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPedido=this.jScrollPanelDatosEdicionEstadoPedido;
		final JPanel jPanelAccionesEstadoPedido=this.jPanelAccionesEstadoPedido;
		
		JPanel jPanelCamposAuxiliarEstadoPedido=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPedido=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			jPanelCamposAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jPanelCamposEstadoPedido;
			jPanelAccionesFormularioAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jPanelAccionesFormularioEstadoPedido;
		}
		
		final JPanel jPanelCamposEstadoPedido=jPanelCamposAuxiliarEstadoPedido;
		final JPanel jPanelAccionesFormularioEstadoPedido=jPanelAccionesFormularioAuxiliarEstadoPedido;
		
		
		final JMenuBar jmenuBarEstadoPedido=this.jmenuBarEstadoPedido;
		final JToolBar jTtoolBarEstadoPedido=this.jTtoolBarEstadoPedido;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPedido=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			jmenuBarDetalleAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jmenuBarDetalleEstadoPedido;
			jTtoolBarDetalleAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jTtoolBarDetalleEstadoPedido;
		}
		
		final JMenuBar jmenuBarDetalleEstadoPedido=jmenuBarDetalleAuxiliarEstadoPedido;
		final JToolBar jTtoolBarDetalleEstadoPedido=jTtoolBarDetalleAuxiliarEstadoPedido;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPedido;
			processRunnable.jTableDatos=jTableDatosEstadoPedido;
			processRunnable.jPanelCampos=jPanelCamposEstadoPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPedido;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPedido;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPedido;
			processRunnable.jTtoolBar=jTtoolBarEstadoPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoPedido ,jPanelParametrosReportesEstadoPedido,jTableDatosEstadoPedido, /*jScrollPanelDatosEstadoPedido,*/jPanelCamposEstadoPedido,jPanelPaginacionEstadoPedido, /*jScrollPanelDatosEdicionEstadoPedido,*/ jPanelAccionesEstadoPedido,jPanelAccionesFormularioEstadoPedido,jmenuBarEstadoPedido,jmenuBarDetalleEstadoPedido,jTtoolBarEstadoPedido,jTtoolBarDetalleEstadoPedido);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoPedido ,jPanelParametrosReportesEstadoPedido, jScrollPanelDatosEstadoPedido,jPanelPaginacionEstadoPedido, jScrollPanelDatosEdicionEstadoPedido, jPanelAccionesEstadoPedido,jPanelAccionesFormularioEstadoPedido,jmenuBarEstadoPedido,jmenuBarDetalleEstadoPedido,jTtoolBarEstadoPedido,jTtoolBarDetalleEstadoPedido);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessEstadoPedido() {// throws Exception 
		this.finishProcessEstadoPedido(true);
	}
	
	public void finishProcessEstadoPedido(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadoPedido ,this.jPanelParametrosReportesEstadoPedido, this.jScrollPanelDatosEstadoPedido,this.jPanelPaginacionEstadoPedido, this.jScrollPanelDatosEdicionEstadoPedido, this.jPanelAccionesEstadoPedido,this.jPanelAccionesFormularioEstadoPedido,this.jmenuBarEstadoPedido,this.jmenuBarDetalleEstadoPedido,this.jTtoolBarEstadoPedido,this.jTtoolBarDetalleEstadoPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPedido=this.jTabbedPaneBusquedasEstadoPedido; 
		
		final JPanel jPanelParametrosReportesEstadoPedido=this.jPanelParametrosReportesEstadoPedido;
		//final JScrollPane jScrollPanelDatosEstadoPedido=this.jScrollPanelDatosEstadoPedido;
		final JTable jTableDatosEstadoPedido=this.jTableDatosEstadoPedido;		
		final JPanel jPanelPaginacionEstadoPedido=this.jPanelPaginacionEstadoPedido;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPedido=this.jScrollPanelDatosEdicionEstadoPedido;
		final JPanel jPanelAccionesEstadoPedido=this.jPanelAccionesEstadoPedido;
		
		JPanel jPanelCamposAuxiliarEstadoPedido=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPedido=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			jPanelCamposAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jPanelCamposEstadoPedido;
			jPanelAccionesFormularioAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jPanelAccionesFormularioEstadoPedido;
		}
		
		final JPanel jPanelCamposEstadoPedido=jPanelCamposAuxiliarEstadoPedido;
		final JPanel jPanelAccionesFormularioEstadoPedido=jPanelAccionesFormularioAuxiliarEstadoPedido;
		
		
		final JMenuBar jmenuBarEstadoPedido=this.jmenuBarEstadoPedido;		
		final JToolBar jTtoolBarEstadoPedido=this.jTtoolBarEstadoPedido;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPedido=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			jmenuBarDetalleAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jmenuBarDetalleEstadoPedido;
			jTtoolBarDetalleAuxiliarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jTtoolBarDetalleEstadoPedido;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoPedido=jmenuBarDetalleAuxiliarEstadoPedido;
		final JToolBar jTtoolBarDetalleEstadoPedido=jTtoolBarDetalleAuxiliarEstadoPedido;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPedido;
			processRunnable.jTableDatos=jTableDatosEstadoPedido;
			processRunnable.jPanelCampos=jPanelCamposEstadoPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPedido;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPedido;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPedido;
			processRunnable.jTtoolBar=jTtoolBarEstadoPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoPedido ,jPanelParametrosReportesEstadoPedido, jTableDatosEstadoPedido,/*jScrollPanelDatosEstadoPedido,*/jPanelCamposEstadoPedido,jPanelPaginacionEstadoPedido, /*jScrollPanelDatosEdicionEstadoPedido,*/ jPanelAccionesEstadoPedido,jPanelAccionesFormularioEstadoPedido,jmenuBarEstadoPedido,jmenuBarDetalleEstadoPedido,jTtoolBarEstadoPedido,jTtoolBarDetalleEstadoPedido));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoPedido(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoPedido(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoPedido(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoPedido,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoPedido,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadopedidoConstantesFunciones.getsFinalQueryEstadoPedido();
		String  finalQueryPaginacionTodos=this.estadopedidoConstantesFunciones.getsFinalQueryEstadoPedido();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoPedidoConstantesFunciones.getArrayColumnasGlobalesNoEstadoPedido(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoPedidoConstantesFunciones.getArrayColumnasGlobalesEstadoPedido(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoPedidoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadopedidosEliminados= new ArrayList<EstadoPedido>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoPedido();
		
				///*EstadoPedidoSessionBean*/this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
			
			if(this.estadopedidoSessionBean==null) {
				this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=EstadoPedidoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoPedidoConstantesFunciones.getClassesForeignKeysOfEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadopedido."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadopedidosAux= new ArrayList<EstadoPedido>();
			
				
			estadopedidoLogic.setDatosCliente(this.datosCliente);
			estadopedidoLogic.setDatosDeep(this.datosDeep);
			estadopedidoLogic.setIsConDeep(true);
			
			
			estadopedidoLogic.getEstadoPedidoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadopedidoLogic.getTodosEstadoPedidos(finalQueryGlobal,pagination);
					
					//estadopedidoLogic.getTodosEstadoPedidosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadopedidoLogic.getEstadoPedidos()==null|| estadopedidoLogic.getEstadoPedidos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopedidosAux= new ArrayList<EstadoPedido>();
							estadopedidosAux.addAll(estadopedidoLogic.getEstadoPedidos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidosAux= new ArrayList<EstadoPedido>();
							estadopedidosAux.addAll(estadopedidos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopedidoLogic.getTodosEstadoPedidos(finalQueryGlobal+"",this.pagination);												
							
							//estadopedidoLogic.getTodosEstadoPedidosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoPedidos("Todos",estadopedidoLogic.getEstadoPedidos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopedidoLogic.setEstadoPedidos(new ArrayList<EstadoPedido>());					
							estadopedidoLogic.getEstadoPedidos().addAll(estadopedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidos=new ArrayList<EstadoPedido>();
							estadopedidos.addAll(estadopedidosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoPedido=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoPedido=this.idActual;
				
				} else if(this.idEstadoPedidoActual!=null && this.idEstadoPedidoActual!=0L) {
					idEstadoPedido=idEstadoPedidoActual;
				}
				
					
				this.sDetalleReporte=EstadoPedidoConstantesFunciones.getDetalleIndicePorId(idEstadoPedido);
				
				this.estadopedidos=new ArrayList<EstadoPedido>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadopedidoLogic.getEntity(idEstadoPedido);
					
					//estadopedidoLogic.getEntityWithConnection(idEstadoPedido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopedidoLogic.setEstadoPedidos(new ArrayList<EstadoPedido>());
					estadopedidoLogic.getEstadoPedidos().add(estadopedidoLogic.getEstadoPedido());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopedidos=new ArrayList<EstadoPedido>();
					this.estadopedidos.add(estadopedido);
				}
				
				if(estadopedidoLogic.getEstadoPedido()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdColorGeneral")) {
				this.sDetalleReporte=EstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadopedidoLogic.getEstadoPedidosFK_IdColorGeneral(finalQueryGlobal,pagination,id_color_generalFK_IdColorGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadopedidoLogic.getEstadoPedidos()==null||estadopedidoLogic.getEstadoPedidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadopedidos==null|| estadopedidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidosAux=new ArrayList<EstadoPedido>();
						estadopedidosAux.addAll(estadopedidoLogic.getEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidosAux=new ArrayList<EstadoPedido>();
							estadopedidosAux.addAll(estadopedidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadopedidoLogic.getEstadoPedidosFK_IdColorGeneral(finalQueryGlobal,pagination,id_color_generalFK_IdColorGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadoPedidos("FK_IdColorGeneral",estadopedidoLogic.getEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadoPedidos("FK_IdColorGeneral",estadopedidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidoLogic.setEstadoPedidos(new ArrayList<EstadoPedido>());
						estadopedidoLogic.getEstadoPedidos().addAll(estadopedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidos=new ArrayList<EstadoPedido>();
							estadopedidos.addAll(estadopedidosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoPedido();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoPedido();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopedidoLogic.getEstadoPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopedidos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopedidoLogic.getEstadoPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopedidos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoPedido estadopedido) {
		Boolean permite=true;
		
		if(this.estadopedido.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoPedidoConstantesFunciones.getOrderByListaEstadoPedido();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoPedidoConstantesFunciones.getOrderByListaEstadoPedido();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedido estadopedido:estadopedidoLogic.getEstadoPedidos()) {
				if(estadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidoTotales=estadopedido;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedido estadopedido:this.estadopedidos) {
				if(estadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidoTotales=estadopedido;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.estadopedidoAux=new EstadoPedido();
			this.estadopedidoAux.setsType(Constantes2.S_TOTALES);
			this.estadopedidoAux.setIsNew(false);
			this.estadopedidoAux.setIsChanged(false);
			this.estadopedidoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoPedidoConstantesFunciones.TotalizarValoresFilaEstadoPedido(this.estadopedidoLogic.getEstadoPedidos(),this.estadopedidoAux);
				
				this.estadopedidoLogic.getEstadoPedidos().add(this.estadopedidoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoPedidoConstantesFunciones.TotalizarValoresFilaEstadoPedido(this.estadopedidos,this.estadopedidoAux);
				
				this.estadopedidos.add(this.estadopedidoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadopedidoTotales=new EstadoPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopedidoLogic.getEstadoPedidos().remove(estadopedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopedidos.remove(estadopedidoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadopedidoTotales=new EstadoPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedido estadopedido:estadopedidoLogic.getEstadoPedidos()) {
				if(estadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidoTotales=estadopedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPedidoConstantesFunciones.TotalizarValoresFilaEstadoPedido(this.estadopedidoLogic.getEstadoPedidos(),estadopedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedido estadopedido:this.estadopedidos) {
				if(estadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidoTotales=estadopedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPedidoConstantesFunciones.TotalizarValoresFilaEstadoPedido(this.estadopedidos,estadopedidoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoPedidosFK_IdColorGeneral()throws Exception {
		try {
			sAccionBusqueda="FK_IdColorGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEstadoPedidosFK_IdColorGeneral(String sFinalQuery,Long id_color_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopedidoLogic.getEstadoPedidosFK_IdColorGeneral(sFinalQuery,this.pagination,id_color_general);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosEstadoPedido() {
		this.isPermisoTodoEstadoPedido=false;
		this.isPermisoNuevoEstadoPedido=false;
		this.isPermisoActualizarEstadoPedido=false;
		this.isPermisoActualizarOriginalEstadoPedido=false;
		this.isPermisoEliminarEstadoPedido=false;
		this.isPermisoGuardarCambiosEstadoPedido=false;
		this.isPermisoConsultaEstadoPedido=false;
		this.isPermisoBusquedaEstadoPedido=false;
		this.isPermisoReporteEstadoPedido=false;		
		this.isPermisoOrdenEstadoPedido=false;		
		this.isPermisoPaginacionMedioEstadoPedido=false;		
		this.isPermisoPaginacionAltoEstadoPedido=false;
		this.isPermisoPaginacionTodoEstadoPedido=false;
		this.isPermisoCopiarEstadoPedido=false;		
		this.isPermisoVerFormEstadoPedido=false;		
		this.isPermisoDuplicarEstadoPedido=false;		
		this.isPermisoOrdenEstadoPedido=false;		
	}
	
	public void setPermisosUsuarioEstadoPedido(Boolean isPermiso) {
		this.isPermisoTodoEstadoPedido=isPermiso;
		this.isPermisoNuevoEstadoPedido=isPermiso;
		this.isPermisoActualizarEstadoPedido=isPermiso;
		this.isPermisoActualizarOriginalEstadoPedido=isPermiso;
		this.isPermisoEliminarEstadoPedido=isPermiso;
		this.isPermisoGuardarCambiosEstadoPedido=isPermiso;
		this.isPermisoConsultaEstadoPedido=isPermiso;
		this.isPermisoBusquedaEstadoPedido=isPermiso;
		this.isPermisoReporteEstadoPedido=isPermiso;
		this.isPermisoOrdenEstadoPedido=isPermiso;		
		this.isPermisoPaginacionMedioEstadoPedido=isPermiso;		
		this.isPermisoPaginacionAltoEstadoPedido=isPermiso;		
		this.isPermisoPaginacionTodoEstadoPedido=isPermiso;		
		this.isPermisoCopiarEstadoPedido=isPermiso;		
		this.isPermisoVerFormEstadoPedido=isPermiso;		
		this.isPermisoDuplicarEstadoPedido=isPermiso;
		this.isPermisoOrdenEstadoPedido=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoPedido(Boolean isPermiso) {
		//this.isPermisoTodoEstadoPedido=isPermiso;
		this.isPermisoNuevoEstadoPedido=isPermiso;
		this.isPermisoActualizarEstadoPedido=isPermiso;
		this.isPermisoActualizarOriginalEstadoPedido=isPermiso;
		this.isPermisoEliminarEstadoPedido=isPermiso;
		this.isPermisoGuardarCambiosEstadoPedido=isPermiso;
		//this.isPermisoConsultaEstadoPedido=isPermiso;
		//this.isPermisoBusquedaEstadoPedido=isPermiso;
		//this.isPermisoReporteEstadoPedido=isPermiso;
		//this.isPermisoOrdenEstadoPedido=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoPedido=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoPedido=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoPedido=isPermiso;		
		//this.isPermisoCopiarEstadoPedido=isPermiso;		
		//this.isPermisoDuplicarEstadoPedido=isPermiso;
		//this.isPermisoOrdenEstadoPedido=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPedidoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ConsignacionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosConsignacion=false;
		this.isTienePermisosConsignacion=this.verificarGetPermisosUsuarioOpcionEstadoPedidoClaseRelacionada(this.opcionsRelacionadas,ConsignacionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedidoExpor=false;
		this.isTienePermisosPedidoExpor=this.verificarGetPermisosUsuarioOpcionEstadoPedidoClaseRelacionada(this.opcionsRelacionadas,PedidoExporConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoPedido(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPedidoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosConsignacion=conPermiso;
		this.isTienePermisosPedidoExpor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoPedidoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoPedidoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoPedidoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosConsignacion && this.jInternalFrameDetalleFormEstadoPedido!=null && this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.remove(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedidoExpor && this.jInternalFrameDetalleFormEstadoPedido!=null && this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.remove(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoPedido() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoPedidoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoPedido=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoPedido=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoPedido=this.isPermisoActualizarEstadoPedido;
			this.isPermisoEliminarEstadoPedido=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoPedido=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoPedido=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoPedido=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoPedido=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoPedido=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoPedido=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoPedido=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoPedido=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoPedido=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoPedido=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoPedido=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoPedido.setToolTipText(this.jTableDatosEstadoPedido.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoPedido(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoPedido(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(EstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioEstadoPedido() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosConsignacion && this.estadopedidoConstantesFunciones.mostrarConsignacionEstadoPedido && !EstadoPedidoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Consignacion");
			reporte.setsDescripcion("Consignacion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedidoExpor && this.estadopedidoConstantesFunciones.mostrarPedidoExporEstadoPedido && !EstadoPedidoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Exportacion");
			reporte.setsDescripcion("Pedido Exportacion");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyEstadoPedidoListas()throws Exception {
		try	{						
			
				this.colorgeneralsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoPedidoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoPedidoListas(false);
			} else {
			
				this.cargarCombosForeignKeyColorGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyColorGeneralListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.colorgeneralsForeignKey==null||this.colorgeneralsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ColorGeneralConstantesFunciones.getArrayColumnasGlobalesColorGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ColorGeneralConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ColorGeneralConstantesFunciones.SFINALQUERY;

				this.cargarCombosColorGeneralsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEstadoPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EstadoPedidoParameterReturnGeneral estadopedidoReturnGeneral=new EstadoPedidoParameterReturnGeneral();
						
			


				String finalQueryGlobalColorGeneral="";

				if(((this.colorgeneralsForeignKey==null||this.colorgeneralsForeignKey.size()<=0) && this.estadopedidoConstantesFunciones.cargarid_color_generalEstadoPedido)
					 || (this.esRecargarFks && this.estadopedidoConstantesFunciones.cargarid_color_generalEstadoPedido)) {

					if(!this.estadopedidoSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ColorGeneralConstantesFunciones.getArrayColumnasGlobalesColorGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalColorGeneral=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ColorGeneralConstantesFunciones.TABLENAME);

						finalQueryGlobalColorGeneral=Funciones.GetFinalQueryAppend(finalQueryGlobalColorGeneral, "");
						finalQueryGlobalColorGeneral+=ColorGeneralConstantesFunciones.SFINALQUERY;

						//this.cargarCombosColorGeneralsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalColorGeneral=" WHERE " + ConstantesSql.ID + "="+estadopedidoSessionBean.getlidColorGeneralActual();
					}
				} else {
					finalQueryGlobalColorGeneral="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				estadopedidoReturnGeneral=estadopedidoLogic.cargarCombosLoteForeignKeyEstadoPedido(finalQueryGlobalColorGeneral);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalColorGeneral.equals("NONE")) {
				this.colorgeneralsForeignKey=estadopedidoReturnGeneral.getcolorgeneralsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoPedido()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyColorGeneral();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyColorGeneral()throws Exception {
		try {
			if(this.estadopedidoSessionBean==null) {
				this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
			}

			if(!this.estadopedidoSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {
				ColorGeneral colorgeneral=new ColorGeneral();
				ColorGeneralConstantesFunciones.setColorGeneralDescripcion(colorgeneral,Constantes.SMENSAJE_ESCOJA_OPCION);
				colorgeneral.setId(null);

				if(!ColorGeneralConstantesFunciones.ExisteEnLista(this.colorgeneralsForeignKey,colorgeneral,true)) {

					this.colorgeneralsForeignKey.add(0,colorgeneral);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEstadoPedido()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoPedido()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPedido();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoPedido(EstadoPedido estadopedido)throws Exception {	
		try {
			
			this.setActualColorGeneralForeignKey(estadopedido.getid_color_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoPedido(EstadoPedido estadopedido,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoPedido()throws Exception {	
		try {
			
			this.setActualColorGeneralForeignKey(this.estadopedidoConstantesFunciones.getid_color_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPedido()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoPedido()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoPedido()throws Exception {
		try {
			

			this.cargarCombosFrameColorGeneralsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameColorGeneralsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoPedido()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido!=null && this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public EstadoPedidoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoPedidoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoPedidoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadopedidoSessionBean=new EstadoPedidoSessionBean(); 
		this.estadopedidoConstantesFunciones=new EstadoPedidoConstantesFunciones(); 
		this.estadopedidoBean=new EstadoPedido();//(this.estadopedidoConstantesFunciones); 		
		this.estadopedidoReturnGeneral=new EstadoPedidoParameterReturnGeneral(); 
		
		this.estadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoPedido(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.estadopedidoConstantesFunciones=new EstadoPedidoConstantesFunciones(); 
			this.estadopedidoBean=new EstadoPedido();//this.estadopedidoConstantesFunciones); 			
			this.estadopedidoReturnGeneral=new EstadoPedidoParameterReturnGeneral(); 
		
			EstadoPedidoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Pedido Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadopedido=new EstadoPedido();
			this.estadopedidos = new ArrayList<EstadoPedido>();
			this.estadopedidosAux = new ArrayList<EstadoPedido>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic=new EstadoPedidoLogic();
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoPedido);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPedido);	
					}
					
					if(this.jInternalFrameImportacionEstadoPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPedido);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoPedido);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPedido);
				this.jInternalFrameDetalleFormEstadoPedido.setVisible(false);
				this.jInternalFrameDetalleFormEstadoPedido.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPedido);
					this.jInternalFrameReporteDinamicoEstadoPedido.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoPedido.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPedido);
					this.jInternalFrameImportacionEstadoPedido.setVisible(false);
					this.jInternalFrameImportacionEstadoPedido.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPedido);
					this.jInternalFrameOrderByEstadoPedido.setVisible(false);
					this.jInternalFrameOrderByEstadoPedido.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoPedidoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoPedidoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.estadopedidoReturnGeneral=new EstadoPedidoParameterReturnGeneral();
			
			this.estadopedidoParameterGeneral=new EstadoPedidoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadopedidoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(EstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ConsignacionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopedidoSessionBean.getEsGuardarRelacionado(),this.estadopedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopedidoSessionBean.getEsGuardarRelacionado(),this.estadopedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoEstadoPedido=false;
			this.isVisibilidadCeldaDuplicarEstadoPedido=true;
			this.isVisibilidadCeldaCopiarEstadoPedido=true;
			this.isVisibilidadCeldaVerFormEstadoPedido=true;
			this.isVisibilidadCeldaOrdenEstadoPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
			this.isVisibilidadCeldaModificarEstadoPedido=false;
			this.isVisibilidadCeldaActualizarEstadoPedido=false;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
			this.isVisibilidadCeldaCancelarEstadoPedido=false;
			this.isVisibilidadCeldaGuardarEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
			
			
			this.isVisibilidadFK_IdColorGeneral=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoPedido();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoPedido(false);
			
			this.setPermisosUsuarioEstadoPedido();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopedidoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadopedidoSessionBean.getEsGuardarRelacionado() && this.estadopedidoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoPedidoClasesRelacionadas();
			}
			
			if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoPedidoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoPedido();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoPedido();
			}
			
			if(!this.isPermisoBusquedaEstadoPedido) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoPedido,this.isPermisoPaginacionMedioEstadoPedido,this.isPermisoPaginacionTodoEstadoPedido);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoPedidoConstantesFunciones.getTiposSeleccionarEstadoPedido());
				
				this.tiposColumnasSelect=EstadoPedidoConstantesFunciones.getTiposSeleccionarEstadoPedido(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoPedido();				
				//this.tiposRelacionesSelect=EstadoPedidoConstantesFunciones.getTiposRelacionesEstadoPedido(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoPedido();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEstadoPedido(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEstadoPedido(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedido() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.consignacionLogic=new ConsignacionLogic();
			this.pedidoexporExporLogic=new PedidoExporLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.colorgeneralLogic=new ColorGeneralLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadopedidoImplementable= (EstadoPedidoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadopedidoImplementableHome= (EstadoPedidoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadopedidos= new ArrayList<EstadoPedido>();
			this.estadopedidosEliminados= new ArrayList<EstadoPedido>();
						
			this.isEsNuevoEstadoPedido=false;
			this.esParaAccionDesdeFormularioEstadoPedido=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoPedido(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoPedido();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoPedidoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoPedido(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoPedido();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoPedido();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadoPedido.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadoPedido.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadoPedido.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoPedido(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoPedido: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoPedido() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoPedido")) {
				iIndex=this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();	
				
				

				if(sTitle.equals("Consignacions")) {
					if(!ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoPedido();

						this.cargarParteTabPanelRelacionadaConsignacion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Exportacions")) {
					if(!PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoPedido();

						this.cargarParteTabPanelRelacionadaPedidoExpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoPedido();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaConsignacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoPedido.cargarSessionConBeanSwingJInternalFrameConsignacion(false,true,iIndex);
		this.jButtonConsignacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConsignacion();

		//this.jTabbedPaneRelacionesEstadoPedido.updateUI();
		//this.jTabbedPaneRelacionesEstadoPedido.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoPedido.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoExpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoPedido.cargarSessionConBeanSwingJInternalFramePedidoExpor(false,true,iIndex);
		this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoExpor();

		//this.jTabbedPaneRelacionesEstadoPedido.updateUI();
		//this.jTabbedPaneRelacionesEstadoPedido.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoPedido.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Consignacion")) {
				int row=this.jTableDatosEstadoPedido.getSelectedRow();
				jButtonConsignacionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PedidoExpor")) {
				int row=this.jTableDatosEstadoPedido.getSelectedRow();
				jButtonPedidoExporActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Consignacion")) {

					if(this.isTienePermisosConsignacion && this.estadopedidoConstantesFunciones.mostrarConsignacionEstadoPedido && !EstadoPedidoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Consignacions"+"("+ConsignacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Consignacions");

						if(estadopedidoConstantesFunciones.resaltarConsignacionEstadoPedido!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadopedidoConstantesFunciones.resaltarConsignacionEstadoPedido);
						}

						jmenuItem.setEnabled(this.estadopedidoConstantesFunciones.activarConsignacionEstadoPedido);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Consignacion"));

						

						this.jInternalFrameDetalleFormEstadoPedido.jmenuDetalleEstadoPedido.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido Exportacion")) {

					if(this.isTienePermisosPedidoExpor && this.estadopedidoConstantesFunciones.mostrarPedidoExporEstadoPedido && !EstadoPedidoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Exportacions"+"("+PedidoExporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Exportacions");

						if(estadopedidoConstantesFunciones.resaltarPedidoExporEstadoPedido!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadopedidoConstantesFunciones.resaltarPedidoExporEstadoPedido);
						}

						jmenuItem.setEnabled(this.estadopedidoConstantesFunciones.activarPedidoExporEstadoPedido);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoExpor"));

						

						this.jInternalFrameDetalleFormEstadoPedido.jmenuDetalleEstadoPedido.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoPedido(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoPedido(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoPedido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoPedidoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoPedido();
		
		this.cargarCombosFrameForeignKeyEstadoPedido();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoPedido();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoPedido();
		}
	}
	
	

	public void cargarCombosForeignKeyColorGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyColorGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyColorGeneral();
				this.cargarCombosFrameColorGeneralsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaColorGeneral(this.colorgeneralsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEstadoPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			
			if(jTableDatosEstadoPedido.getRowCount()>=1) {
				jTableDatosEstadoPedido.removeRowSelectionInterval(0, jTableDatosEstadoPedido.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoPedido=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoPedido(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoPedido(true);			
			//this.estadopedido=new EstadoPedido();
			//this.estadopedido.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPedido(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedido() ;
			
			if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPedido(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadopedido);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);				
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoPedido: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoPedido.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoPedido.getSelectedRows().length;			
			}
			
			estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoPedido--;			
				//EstadoPedido estadopedidoAux= new EstadoPedido();			
				//estadopedidoAux.setId(this.iIdNuevoEstadoPedido);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoPedido estadopedidoOrigen=new EstadoPedido();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoPedido estadopedidoOrigen : estadopedidosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadopedidoOrigen =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidoOrigen =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoPedido();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadopedido.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoPedido(estadopedidoOrigen,this.estadopedido,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopedidoLogic.getEstadoPedidos().add(this.estadopedidoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopedidos.add(this.estadopedidoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoPedido(false);
				
				this.jTableDatosEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoEstadoPedido(), this.getIndiceNuevoEstadoPedido());
				
				int iLastRow =  this.jTableDatosEstadoPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPedido(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();									
		
			EstadoPedido estadopedidoOrigen=new EstadoPedido();
			EstadoPedido estadopedidoDestino=new EstadoPedido();
				
			estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoPedido.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadopedidosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoPedido.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidoOrigen =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopedidoOrigen =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidoDestino =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopedidoDestino =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadopedidoOrigen =estadopedidosSeleccionados.get(0);
				estadopedidoDestino =estadopedidosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoPedido(estadopedidoOrigen,estadopedidoDestino,true,false);
				
				estadopedidoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopedidoDestino,estadopedidoLogic.getEstadoPedidos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidoDestino,estadopedidos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoPedido(false);
				
				//this.jTableDatosEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoEstadoPedido(), this.getIndiceNuevoEstadoPedido());
				
				int iLastRow =  this.jTableDatosEstadoPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPedido(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoPedido.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoPedido.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadoPedido.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadoPedido.setVisible(!isVisible);
			this.jPanelPaginacionEstadoPedido.setVisible(!isVisible);
			this.jPanelAccionesEstadoPedido.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoPedido();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoPedido();
			
			this.abrirFrameOrderByEstadoPedido();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoPedido(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPedido);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoPedido.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoPedido.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoPedido.setSize(this.jInternalFrameDetalleFormEstadoPedido.iWidthFormulario,this.jInternalFrameDetalleFormEstadoPedido.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoPedido.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoPedido.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoPedido.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoPedido.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoPedido.jContentPaneDetalleEstadoPedido.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPedido.jContentPaneDetalleEstadoPedido.getWidth(),EstadoPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPedido.jContentPaneDetalleEstadoPedido.getWidth(),EstadoPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoPedido.jContentPaneDetalleEstadoPedido.getWidth(),EstadoPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConsignacion();
					}

					if(PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoExpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoPedido.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoPedido.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoPedido==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedido,false,this);
				} else {
					this.jInternalFrameOrderByEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedido,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPedido);
				this.jInternalFrameOrderByEstadoPedido.setVisible(false);
				this.jInternalFrameOrderByEstadoPedido.setSelected(false);
				
				this.jInternalFrameOrderByEstadoPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPedido"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoPedido();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoPedido==null) {
				
				this.jInternalFrameImportacionEstadoPedido=new ImportacionJInternalFrame(EstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPedido);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPedido);
				this.jInternalFrameImportacionEstadoPedido.setVisible(false);
				this.jInternalFrameImportacionEstadoPedido.setSelected(false);


				this.jInternalFrameImportacionEstadoPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPedido"));
				this.jInternalFrameImportacionEstadoPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPedido"));
				this.jInternalFrameImportacionEstadoPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPedido"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoPedido() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoPedido==null) {
				this.jInternalFrameReporteDinamicoEstadoPedido=new ReporteDinamicoJInternalFrame(EstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPedido);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPedido);
				this.jInternalFrameReporteDinamicoEstadoPedido.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoPedido.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPedido"));
				this.jInternalFrameReporteDinamicoEstadoPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPedido"));
				this.jInternalFrameReporteDinamicoEstadoPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPedido"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPedido();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaConsignacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoPedido.jContentPaneDetalleEstadoPedido.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoExpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoPedido.jContentPaneDetalleEstadoPedido.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoPedido() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPedido);
			
	       	this.jInternalFrameDetalleFormEstadoPedido.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoPedido.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoPedido.dispose();
			//this.jInternalFrameDetalleFormEstadoPedido=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoPedido() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoPedido.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoPedido.setVisible(true);
	        this.jInternalFrameImportacionEstadoPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoPedido.setVisible(true);
	        this.jInternalFrameOrderByEstadoPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoPedido.setVisible(false);
	        this.jInternalFrameOrderByEstadoPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoPedido() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoPedido.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoPedido.setVisible(false);
	        this.jInternalFrameImportacionEstadoPedido.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoPedido(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoPedido(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoPedido(true);
			//this.isEsNuevoEstadoPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPedido(false) ;
			
			if(estadopedidoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado() && ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConsignacionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPedido(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoPedidoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoPedido(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoPedido(true);
			//this.isEsNuevoEstadoPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadopedido.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoPedido(false) ;
			
			if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPedido(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaColorGeneral(List<ColorGeneral> colorgeneralsForeignKey)throws Exception{
		TableColumn tableColumnColorGeneral=this.jTableDatosEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL));
		TableCellEditor tableCellEditorColorGeneral =tableColumnColorGeneral.getCellEditor();

		ColorGeneralTableCell colorgeneralTableCellFk=(ColorGeneralTableCell)tableCellEditorColorGeneral;

		if(colorgeneralTableCellFk!=null) {
			colorgeneralTableCellFk.setcolorgeneralsForeignKey(colorgeneralsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEstadoPedido.getSelectedRow();

		//if(intSelectedRow<=0) {
			//colorgeneralTableCellFk.setRowActual(intSelectedRow);
			//colorgeneralTableCellFk.setcolorgeneralsForeignKeyActual(colorgeneralsForeignKey);
		//}


		if(colorgeneralTableCellFk!=null) {
			colorgeneralTableCellFk.RecargarColorGeneralsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoPedido(false);
			
			//if(!this.isEsNuevoEstadoPedido) {								
				int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
				
			}
			
			if(this.permiteMantenimiento(this.estadopedido)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoPedido=true;
					this.inicializarActualizarBindingTablaEstadoPedido(false);
					this.isEsNuevoEstadoPedido=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoPedido=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoPedido=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPedido(false);
				
				this.habilitarDeshabilitarControlesEstadoPedido(false);
			
												
				
				if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoPedido();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoPedidoActionPerformed(evt,estadopedidoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoPedido(this.estadopedido,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoPedido.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadopedidoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadopedido.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				this.estadopedido.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				this.estadopedido.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadopedido)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoPedidoModel) this.jTableDatosEstadoPedido.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoPedido=true;
				this.inicializarActualizarBindingTablaEstadoPedido(false);
				this.isEsNuevoEstadoPedido=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPedido(false);
				
				this.habilitarDeshabilitarControlesEstadoPedido(false);
				
				
				
				if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoPedido();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoPedido.getRowCount()>=1) {
				jTableDatosEstadoPedido.removeRowSelectionInterval(0, jTableDatosEstadoPedido.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoPedido(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoPedido(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPedido(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedido(false) ;
			
			this.isEsNuevoEstadoPedido=false;
			
			if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoPedido();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoPedido(false);
				
				//SI ES MANUAL
				if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoPedido();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoPedido--;			
			//EstadoPedido estadopedidoAux= new EstadoPedido();			
			//estadopedidoAux.setId(this.iIdNuevoEstadoPedido);
			
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoPedido();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
			
			this.estadopedido.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadopedidoLogic.getEstadoPedidos().add(this.estadopedidoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadopedidos.add(this.estadopedidoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoPedido(false);
			
			this.jTableDatosEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoEstadoPedido(), this.getIndiceNuevoEstadoPedido());
			
			int iLastRow =  this.jTableDatosEstadoPedido.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoPedido.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoPedido.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoPedido(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoPedido(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedido(false);
			
			//SI ES MANUAL
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPedido();
			}
			
			//this.abrirFrameTreeEstadoPedido();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado PedidoS ?", "MANTENIMIENTO DE Estado Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoPedido.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoPedido();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadopedidoReturnGeneral=estadopedidoLogic.procesarImportacionEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadopedidoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoPedidoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoPedido.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoPedido.setFileImportacion(this.jInternalFrameImportacionEstadoPedido.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoPedido.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoPedido.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoPedido.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoPedido.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		

		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoPedidoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoPedidoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteEstadoPedidos("Todos",estadopedidosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPedidoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ColorGeneral_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ColorGeneral_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ColorGeneral_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ColorGeneral_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoEstadoPedido.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoPedidoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL:
					sNombreCampoCategoria="id_color_general";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoPedidoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL:
					sNombreCampoCategoriaValor="id_color_general";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPedidoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Color General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_color_general");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedido";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("EstadoPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoPedidoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoPedido estadopedido:estadopedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopedido.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoPedido estadopedido:estadopedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopedido.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL);
					iRow++;

					for(EstadoPedido estadopedido:estadopedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopedido.getcolorgeneral_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelEstadoPedido(row);				
			//	iRow++;
			//}				
			
			//for(EstadoPedido estadopedidoAux:estadopedidosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoPedido(estadopedidoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedido(false);
			
			//SI ES MANUAL
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPedido();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedido(false);
			
			//SI ES MANUAL
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPedido();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedido(false);
			
			//SI ES MANUAL
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPedido();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoPedido() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoPedido.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoPedido.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoPedido.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoPedido.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoPedido.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoPedido.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoPedido.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoPedido(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoPedido(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoPedido(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoPedido(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoPedido(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoPedido(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedido(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoPedido(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoPedido() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoPedido();
		
		this.inicializarActualizarBindingBotonesManualEstadoPedido(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPedido();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedido() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPedido(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPedido(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoPedido.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoPedido.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoPedido.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoPedido.jCheckBoxPostAccionNuevoEstadoPedido.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoPedido.jCheckBoxPostAccionSinCerrarEstadoPedido.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoPedido.jCheckBoxPostAccionSinMensajeEstadoPedido.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoPedido.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoPedido.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoPedido.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
				this.jInternalFrameDetalleFormEstadoPedido.jCheckBoxPostAccionNuevoEstadoPedido.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoPedido.jCheckBoxPostAccionSinCerrarEstadoPedido.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoPedido.jCheckBoxPostAccionSinMensajeEstadoPedido.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoPedido.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoPedido.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoPedido.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoPedido.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoPedido.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoPedido.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoPedido.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoPedido(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPedido(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedido() throws Exception {
		try	{
			if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPedido();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPedido() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPedido() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoPedido.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoPedido.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoPedido.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoPedido.addItem(reporte);
			}
			
			
			if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoPedido.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoPedido.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPedido();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPedido() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
				this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
				this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPedido.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPedido.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoPedido.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPedido.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPedido.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoPedido()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.getSelectedItem()!=null){this.id_color_generalFK_IdColorGeneral=((ColorGeneral)this.jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoPedido(Boolean esInicializar) throws Exception {				
		if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPedido();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoPedido() throws Exception {
		this.inicializarActualizarBindingTablaEstadoPedido(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoPedido() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoPedidoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoPedido(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadopedidoLogic.getEstadoPedidos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadopedidos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoPedido.setModel(new EstadoPedidoModel(this.estadopedidoLogic.getEstadoPedidos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoPedido.setModel(new EstadoPedidoModel(this.estadopedidos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoPedido!=null && this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoPedido();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO,estadopedidoConstantesFunciones.resaltarSeleccionarEstadoPedido,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO,estadopedidoConstantesFunciones.resaltarSeleccionarEstadoPedido,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,EstadoPedidoConstantesFunciones.LABEL_ID));

		if(this.estadopedidoConstantesFunciones.mostraridEstadoPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPedidoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadopedidoConstantesFunciones.resaltaridEstadoPedido,this.estadopedidoConstantesFunciones.activaridEstadoPedido,this,true,"idEstadoPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopedidoConstantesFunciones.resaltaridEstadoPedido,this.estadopedidoConstantesFunciones.activaridEstadoPedido,this,true,"idEstadoPedido","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,EstadoPedidoConstantesFunciones.LABEL_CODIGO));

		if(this.estadopedidoConstantesFunciones.mostrarcodigoEstadoPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPedidoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadopedidoConstantesFunciones.resaltarcodigoEstadoPedido,this.estadopedidoConstantesFunciones.activarcodigoEstadoPedido,this,true,"codigoEstadoPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopedidoConstantesFunciones.resaltarcodigoEstadoPedido,this.estadopedidoConstantesFunciones.activarcodigoEstadoPedido,this,true,"codigoEstadoPedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,EstadoPedidoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadopedidoConstantesFunciones.mostrarnombreEstadoPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPedidoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadopedidoConstantesFunciones.resaltarnombreEstadoPedido,this.estadopedidoConstantesFunciones.activarnombreEstadoPedido,this,true,"nombreEstadoPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopedidoConstantesFunciones.resaltarnombreEstadoPedido,this.estadopedidoConstantesFunciones.activarnombreEstadoPedido,this,true,"nombreEstadoPedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL));

		if(this.estadopedidoConstantesFunciones.mostrarid_color_generalEstadoPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ColorGeneralTableCell(this.colorgeneralsForeignKey,this.estadopedidoConstantesFunciones.resaltarid_color_generalEstadoPedido,this,this.estadopedidoConstantesFunciones.activarid_color_generalEstadoPedido));
			tableColumn.setCellEditor(new ColorGeneralTableCell(this.colorgeneralsForeignKey,this.estadopedidoConstantesFunciones.resaltarid_color_generalEstadoPedido,this,this.estadopedidoConstantesFunciones.activarid_color_generalEstadoPedido,true,"id_color_generalEstadoPedido","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosConsignacion && this.estadopedidoConstantesFunciones.mostrarConsignacionEstadoPedido && !EstadoPedidoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Consignacions");
				tableColumn.setHeaderValue("Consignacions");
				tableColumn.setCellRenderer(new ConsignacionTableCell(estadopedidoConstantesFunciones.resaltarConsignacionEstadoPedido,this,this.estadopedidoConstantesFunciones.activarConsignacionEstadoPedido));
				tableColumn.setCellEditor(new ConsignacionTableCell(estadopedidoConstantesFunciones.resaltarConsignacionEstadoPedido,this,this.estadopedidoConstantesFunciones.activarConsignacionEstadoPedido));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoPedido.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedidoExpor && this.estadopedidoConstantesFunciones.mostrarPedidoExporEstadoPedido && !EstadoPedidoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Exportacions");
				tableColumn.setHeaderValue("Pedido Exportacions");
				tableColumn.setCellRenderer(new PedidoExporTableCell(estadopedidoConstantesFunciones.resaltarPedidoExporEstadoPedido,this,this.estadopedidoConstantesFunciones.activarPedidoExporEstadoPedido));
				tableColumn.setCellEditor(new PedidoExporTableCell(estadopedidoConstantesFunciones.resaltarPedidoExporEstadoPedido,this,this.estadopedidoConstantesFunciones.activarPedidoExporEstadoPedido));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoPedido.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopedidoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPedido.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopedidoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPedido.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadopedidoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadopedidoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoPedido.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadopedidoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEstadoPedido.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosEstadoPedido.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadopedidoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoPedido.moveColumn(this.jTableDatosEstadoPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoPedido.moveColumn(this.jTableDatosEstadoPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadopedidoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoPedido.moveColumn(this.jTableDatosEstadoPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoPedido.moveColumn(this.jTableDatosEstadoPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoPedido.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoPedido.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoPedido,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoPedido.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoPedido.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoPedido.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoPedido.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoPedido.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=estadopedidoLogic.getEstadoPedidos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadopedidos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosEstadoPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoPedido();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoEstadoPedido=false;
					
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
				if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoPedido==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPedido.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadopedido.getsType().equals("DUPLICADO")
				   || this.estadopedido.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoPedido=true;
				
				} else {
					this.isEsNuevoEstadoPedido=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadopedido.getId()>=0 && !this.estadopedido.getIsNew()) {						
						this.isEsNuevoEstadoPedido=false;
						
					} else {
						this.isEsNuevoEstadoPedido=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoPedido(esRelaciones);						
				
				this.seleccionarEstadoPedido(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadopedido.getId()<0) {
					this.isEsNuevoEstadoPedido=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoPedido(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoPedido(evt,rowIndex);
				}	
				
				if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoPedido: " + this.dDif); 
					}
				}								
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoPedido(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadopedido)) {
					if(this.estadopedido.getId()>0) {
						this.estadopedido.setIsDeleted(true);
						
						this.estadopedidosEliminados.add(this.estadopedido);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopedidoLogic.getEstadoPedidos().remove(this.estadopedido);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopedidos.remove(this.estadopedido);				
					}
					
					
					((EstadoPedidoModel) this.jTableDatosEstadoPedido.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPedido(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoPedido(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoPedido) {
			
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPedido.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoPedido(this.estadopedido);
				}
				
				//ARCHITECTURE
				try {
					

					//ColorGeneral
					if(!this.estadopedidoConstantesFunciones.cargarid_color_generalEstadoPedido || this.estadopedidoConstantesFunciones.event_dependid_color_generalEstadoPedido) {
						//this.cargarCombosColorGeneralsForeignKeyLista(" where id="+this.estadopedido.getid_color_general());
									//this.inicializarActualizarBindingEstadoPedido(false,false);
						this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>();

						if(estadopedido.getColorGeneral()!=null) {
							this.colorgeneralsForeignKey.add(estadopedido.getColorGeneral());
						}

						this.addItemDefectoCombosForeignKeyColorGeneral();
						this.cargarCombosFrameColorGeneralsForeignKey("Todos");
					}
					this.setActualColorGeneralForeignKey(this.estadopedido.getid_color_general(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoPedido("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoPedido(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPedido() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPedido(EstadoPedido estadopedido) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoPedido(estadopedido,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPedido(EstadoPedido estadopedido,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoPedido(estadopedido);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoPedido(estadopedido,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedido(estadopedido);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoPedido(EstadoPedido estadopedido) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.setText(estadopedido.getId().toString());
			this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.setText(estadopedido.getcodigo());
			this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.setText(estadopedido.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoPedido estadopedidoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadopedidoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoPedido estadopedidoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadopedidoLocal=this.estadopedido;
			} else {
				estadopedidoLocal=this.estadopedidoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadopedidoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoPedido(estadopedidoLocal,true);
					
					if(estadopedidoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadopedidoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadopedidoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoPedido(EstadoPedido estadopedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPedido(estadopedido,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(estadopedido);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPedido(EstadoPedido estadopedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPedido(estadopedido,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPedido(EstadoPedido estadopedido,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.getText()==null || this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.getText()=="" || this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.setText("0");
			}

			if(conColumnasBase) {estadopedido.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPedidoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedido.jLabelIdEstadoPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadopedido.setcodigo(this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPedidoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedido.jLabelcodigoEstadoPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadopedido.setnombre(this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPedidoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedido.jLabelnombreEstadoPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPedido(EstadoPedido estadopedidoBean,EstadoPedido estadopedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && estadopedidoBean.getid_color_general()!=null && !estadopedidoBean.getid_color_general().equals(-1L))) {estadopedido.setid_color_general(estadopedidoBean.getid_color_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoPedido(EstadoPedido estadopedidoOrigen,EstadoPedido estadopedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopedidoOrigen.getId()!=null && !estadopedidoOrigen.getId().equals(0L))) {estadopedido.setId(estadopedidoOrigen.getId());}}
			if(conDefault || (!conDefault && estadopedidoOrigen.getcodigo()!=null && !estadopedidoOrigen.getcodigo().equals(""))) {estadopedido.setcodigo(estadopedidoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadopedidoOrigen.getnombre()!=null && !estadopedidoOrigen.getnombre().equals(""))) {estadopedido.setnombre(estadopedidoOrigen.getnombre());}
			if(conDefault || (!conDefault && estadopedidoOrigen.getid_color_general()!=null && !estadopedidoOrigen.getid_color_general().equals(-1L))) {estadopedido.setid_color_general(estadopedidoOrigen.getid_color_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPedido(EstadoPedido estadopedido) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.setText(estadopedido.getId().toString());
			this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.setText(estadopedido.getcodigo());
			this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.setText(estadopedido.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPedido(EstadoPedidoBean estadopedidoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.setText(estadopedidoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.setText(estadopedidoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.setText(estadopedidoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoPedido(EstadoPedidoParameterReturnGeneral estadopedidoReturnGeneral,EstadoPedidoBean estadopedidoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoPedido estadopedidoLocal=new EstadoPedido();
			
			estadopedidoLocal=estadopedidoReturnGeneral.getEstadoPedido();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopedidoLocal.getId()!=null && !estadopedidoLocal.getId().equals(0L))) {estadopedidoBean.setId(estadopedidoLocal.getId());}}
			if(conDefault || (!conDefault && estadopedidoLocal.getcodigo()!=null && !estadopedidoLocal.getcodigo().equals(""))) {estadopedidoBean.setcodigo(estadopedidoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadopedidoLocal.getnombre()!=null && !estadopedidoLocal.getnombre().equals(""))) {estadopedidoBean.setnombre(estadopedidoLocal.getnombre());}
			if(conDefault || (!conDefault && estadopedidoLocal.getid_color_general()!=null && !estadopedidoLocal.getid_color_general().equals(-1L))) {estadopedidoBean.setid_color_general(estadopedidoLocal.getid_color_general());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoPedidoGenerico(Long idEstadoPedidoSeleccionado,JComboBox jComboBoxEstadoPedido,List<EstadoPedido> estadopedidosLocal)throws Exception {
		try {
			EstadoPedido  estadopedidoTemp=null;

			for(EstadoPedido estadopedidoAux:estadopedidosLocal) {
				if(estadopedidoAux.getId()!=null && estadopedidoAux.getId().equals(idEstadoPedidoSeleccionado)) {
					estadopedidoTemp=estadopedidoAux;
					break;
				}
			}

			jComboBoxEstadoPedido.setSelectedItem(estadopedidoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoPedidoGenerico(JComboBox jComboBoxEstadoPedido,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPedido.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPedido.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("Consignacion")) {
			jButtonConsignacionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PedidoExpor")) {
			jButtonPedidoExporActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopedido=(EstadoPedido) estadopedidoLogic.getEstadoPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopedido =(EstadoPedido) estadopedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ColorGeneral")) {
			//sDescripcion=this.getActualColorGeneralForeignKeyDescripcion((Long)value);
			if(!estadopedido.getIsNew() && !estadopedido.getIsChanged() && !estadopedido.getIsDeleted()) {
				sDescripcion=estadopedido.getcolorgeneral_descripcion();
			} else {
				//sDescripcion=this.getActualColorGeneralForeignKeyDescripcion((Long)value);
				sDescripcion=estadopedido.getcolorgeneral_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoPedido estadopedidoRow=new EstadoPedido();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopedidoRow=(EstadoPedido) estadopedidoLogic.getEstadoPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopedidoRow=(EstadoPedido) estadopedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonConsignacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoPedido estadopedido) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoPedido==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedido = (EstadoPedido)this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadopedido = (EstadoPedido)this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadopedido!=null) {
						this.estadopedido = estadopedido;
					} else {
						this.estadopedido = new EstadoPedido();
					}
				}

				if(this.isTienePermisosConsignacion && this.permiteMantenimiento(this.estadopedido)) {
					ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						consignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFramePopup;
					} else {
						consignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame;
					}

					List<EstadoPedido> estadopedidos=new ArrayList<EstadoPedido>();
					estadopedidos.add(this.estadopedido);
					if(!esRelacionado) {
						//consignacionBeanSwingJInternalFrame.consignacionSessionBean.setConGuardarRelaciones(false);
						//consignacionBeanSwingJInternalFrame.consignacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					consignacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoPedido.cargarConsignacionBeanSwingJInternalFrame(estadopedidos,this.estadopedido,consignacionBeanSwingJInternalFrame,/*conInicializar,*/consignacionBeanSwingJInternalFrame.consignacionSessionBean.getConGuardarRelaciones(),consignacionBeanSwingJInternalFrame.consignacionSessionBean.getEsGuardarRelacionado());
					consignacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");

						consignacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConsignacionConstantesFunciones.ITAMANIOFILATABLA + (ConsignacionConstantesFunciones.ITAMANIOFILATABLA/2));

						consignacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoPedido=(TitledBorder)this.jScrollPanelDatosEstadoPedido.getBorder();
						TitledBorder titledBorderConsignacion=(TitledBorder)consignacionBeanSwingJInternalFrame.jScrollPanelDatosConsignacion.getBorder();

						titledBorderConsignacion.setTitle(titledBorderEstadoPedido.getTitle() + " -> Consignacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,consignacionBeanSwingJInternalFrame);
						}

						consignacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(consignacionBeanSwingJInternalFrame);

						consignacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadopedidoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Consignacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoExporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoPedido estadopedido) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoPedido==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedido = (EstadoPedido)this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadopedido = (EstadoPedido)this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadopedido!=null) {
						this.estadopedido = estadopedido;
					} else {
						this.estadopedido = new EstadoPedido();
					}
				}

				if(this.isTienePermisosPedidoExpor && this.permiteMantenimiento(this.estadopedido)) {
					PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFramePopup;
					} else {
						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame;
					}

					List<EstadoPedido> estadopedidos=new ArrayList<EstadoPedido>();
					estadopedidos.add(this.estadopedido);
					if(!esRelacionado) {
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setConGuardarRelaciones(false);
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoPedido.cargarPedidoExporBeanSwingJInternalFrame(estadopedidos,this.estadopedido,pedidoexporBeanSwingJInternalFrame,/*conInicializar,*/pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getConGuardarRelaciones(),pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado());
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");

						pedidoexporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoExporConstantesFunciones.ITAMANIOFILATABLA + (PedidoExporConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoexporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoPedido=(TitledBorder)this.jScrollPanelDatosEstadoPedido.getBorder();
						TitledBorder titledBorderPedidoExpor=(TitledBorder)pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getBorder();

						titledBorderPedidoExpor.setTitle(titledBorderEstadoPedido.getTitle() + " -> Pedido Exportacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoexporBeanSwingJInternalFrame);
						}

						pedidoexporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoexporBeanSwingJInternalFrame);

						pedidoexporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadopedidoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Exportacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoPedido(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoEstadoPedido && this.isPermisoNuevoEstadoPedido));			
			this.jButtonDuplicarEstadoPedido.setVisible((this.isVisibilidadCeldaDuplicarEstadoPedido && this.isPermisoDuplicarEstadoPedido));			
			this.jButtonCopiarEstadoPedido.setVisible((this.isVisibilidadCeldaCopiarEstadoPedido && this.isPermisoCopiarEstadoPedido));
			this.jButtonVerFormEstadoPedido.setVisible((this.isVisibilidadCeldaVerFormEstadoPedido && this.isPermisoVerFormEstadoPedido));
			
			this.jButtonAbrirOrderByEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenEstadoPedido && this.isPermisoOrdenEstadoPedido));			
			
			this.jButtonNuevoRelacionesEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPedido && this.isPermisoNuevoEstadoPedido));			
			this.jButtonNuevoGuardarCambiosEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoEstadoPedido && this.isPermisoNuevoEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));
			
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarEstadoPedido.setVisible((this.isVisibilidadCeldaModificarEstadoPedido && this.isPermisoActualizarEstadoPedido));	
			this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarEstadoPedido.setVisible((this.isVisibilidadCeldaActualizarEstadoPedido && this.isPermisoActualizarEstadoPedido));	
			this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarEstadoPedido.setVisible((this.isVisibilidadCeldaEliminarEstadoPedido && this.isPermisoEliminarEstadoPedido));
			this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarEstadoPedido);							
			this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoEstadoPedido && this.isPermisoNuevoEstadoPedido));						
			this.jButtonDuplicarToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaDuplicarEstadoPedido && this.isPermisoDuplicarEstadoPedido));						
			this.jButtonCopiarToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaCopiarEstadoPedido && this.isPermisoCopiarEstadoPedido));			
			this.jButtonVerFormToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaVerFormEstadoPedido && this.isPermisoVerFormEstadoPedido));			
			this.jButtonAbrirOrderByToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenEstadoPedido && this.isPermisoOrdenEstadoPedido));
			this.jButtonNuevoRelacionesToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPedido && this.isPermisoNuevoEstadoPedido));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoEstadoPedido && this.isPermisoNuevoEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));			
			
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaModificarEstadoPedido && this.isPermisoActualizarEstadoPedido));	
			this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaActualizarEstadoPedido  && this.isPermisoActualizarEstadoPedido));	
			this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaEliminarEstadoPedido && this.isPermisoEliminarEstadoPedido));
			this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarToolBarEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarEstadoPedido);				
			this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoEstadoPedido && this.isPermisoNuevoEstadoPedido));			
			this.jMenuItemDuplicarEstadoPedido.setVisible((this.isVisibilidadCeldaDuplicarEstadoPedido && this.isPermisoDuplicarEstadoPedido));			
			this.jMenuItemCopiarEstadoPedido.setVisible((this.isVisibilidadCeldaCopiarEstadoPedido && this.isPermisoCopiarEstadoPedido));			
			this.jMenuItemVerFormEstadoPedido.setVisible((this.isVisibilidadCeldaVerFormEstadoPedido && this.isPermisoVerFormEstadoPedido));			
			this.jMenuItemAbrirOrderByEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenEstadoPedido && this.isPermisoOrdenEstadoPedido));			
			//this.jMenuItemMostrarOcultarEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenEstadoPedido && this.isPermisoOrdenEstadoPedido));
			this.jMenuItemDetalleAbrirOrderByEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenEstadoPedido && this.isPermisoOrdenEstadoPedido));			
			//this.jMenuItemDetalleMostrarOcultarEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenEstadoPedido && this.isPermisoOrdenEstadoPedido));			
			this.jMenuItemNuevoRelacionesEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPedido && this.isPermisoNuevoEstadoPedido));			
			this.jMenuItemNuevoGuardarCambiosEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoEstadoPedido && this.isPermisoNuevoEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));									
			
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemModificarEstadoPedido.setVisible((this.isVisibilidadCeldaModificarEstadoPedido && this.isPermisoActualizarEstadoPedido));	
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemActualizarEstadoPedido.setVisible((this.isVisibilidadCeldaActualizarEstadoPedido && this.isPermisoActualizarEstadoPedido));	
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemEliminarEstadoPedido.setVisible((this.isVisibilidadCeldaEliminarEstadoPedido && this.isPermisoEliminarEstadoPedido));
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemCancelarEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarEstadoPedido);				
			}
			
			this.jMenuItemGuardarCambiosEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));						
			this.jMenuItemGuardarCambiosTablaEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoPedido=this.jButtonNuevoEstadoPedido.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoPedido=this.jButtonDuplicarEstadoPedido.isVisible();
			this.isVisibilidadCeldaCopiarEstadoPedido=this.jButtonCopiarEstadoPedido.isVisible();
			this.isVisibilidadCeldaVerFormEstadoPedido=this.jButtonVerFormEstadoPedido.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoPedido=this.jButtonAbrirOrderByEstadoPedido.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=this.jButtonNuevoRelacionesEstadoPedido.isVisible();
			this.isVisibilidadCeldaModificarEstadoPedido=this.jButtonModificarEstadoPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.isVisibilidadCeldaActualizarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarEstadoPedido.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarEstadoPedido.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarEstadoPedido.isVisible();
			this.isVisibilidadCeldaGuardarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=this.jButtonGuardarCambiosTablaEstadoPedido.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoPedido=this.jButtonNuevoToolBarEstadoPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=this.jButtonNuevoRelacionesToolBarEstadoPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.isVisibilidadCeldaModificarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarToolBarEstadoPedido.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarToolBarEstadoPedido.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarToolBarEstadoPedido.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarToolBarEstadoPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPedido=this.jButtonGuardarCambiosToolBarEstadoPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=this.jButtonGuardarCambiosTablaToolBarEstadoPedido.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoPedido=this.jMenuItemNuevoEstadoPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=this.jMenuItemNuevoRelacionesEstadoPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.isVisibilidadCeldaModificarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jMenuItemModificarEstadoPedido.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jMenuItemActualizarEstadoPedido.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jMenuItemEliminarEstadoPedido.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPedido=this.jInternalFrameDetalleFormEstadoPedido.jMenuItemCancelarEstadoPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPedido=this.jMenuItemGuardarCambiosEstadoPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=this.jMenuItemGuardarCambiosTablaEstadoPedido.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoPedido(Boolean esInicializar) {
		if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPedido();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoPedido(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoPedido() {
		this.jButtonNuevoEstadoPedido.setVisible(this.isPermisoNuevoEstadoPedido);			
		this.jButtonDuplicarEstadoPedido.setVisible(this.isPermisoDuplicarEstadoPedido);			
		this.jButtonCopiarEstadoPedido.setVisible(this.isPermisoCopiarEstadoPedido);			
		this.jButtonVerFormEstadoPedido.setVisible(this.isPermisoVerFormEstadoPedido);			
		
		this.jButtonAbrirOrderByEstadoPedido.setVisible(this.isPermisoOrdenEstadoPedido);					
		
		this.jButtonNuevoRelacionesEstadoPedido.setVisible(this.isPermisoNuevoEstadoPedido);			
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarEstadoPedido.setVisible(this.isPermisoActualizarEstadoPedido);	
			this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarEstadoPedido.setVisible(this.isPermisoActualizarEstadoPedido);	
			this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarEstadoPedido.setVisible(this.isPermisoEliminarEstadoPedido);
			this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarEstadoPedido);						
			this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.setVisible(this.isPermisoGuardarCambiosEstadoPedido);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoPedido.setVisible(this.isPermisoActualizarEstadoPedido);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPedido() {
		this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarEstadoPedido.setVisible(this.isPermisoActualizarEstadoPedido);	
		this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarEstadoPedido.setVisible(this.isPermisoActualizarEstadoPedido);	
		this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarEstadoPedido.setVisible(this.isPermisoEliminarEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarEstadoPedido);							
		this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarEstadoPedido && this.isPermisoGuardarCambiosEstadoPedido));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoPedido() {
		if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoPedido();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoPedido() {
	}
	
	public void jTableDatosEstadoPedidoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoPedido(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPedido(this.getestadopedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopedido==null) {
						this.estadopedido = new EstadoPedido();
					}

					this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
				}

				if(this.estadopedido.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadopedido.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPedido(this.getestadopedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopedido==null) {
						this.estadopedido = new EstadoPedido();
					}

					this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
				}

				if(this.estadopedido.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadopedido.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPedido(this.getestadopedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopedido==null) {
						this.estadopedido = new EstadoPedido();
					}

					this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
				}

				if(this.estadopedido.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadopedido.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_color_generalEstadoPedidoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocolorgeneral=true;

			idTienePermisocolorgeneral=this.tienePermisosUsuarioEnPaginaWebEstadoPedido(ColorGeneralConstantesFunciones.CLASSNAME);

			if(idTienePermisocolorgeneral) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadoPedido.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadoPedido.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadoPedido(this.getestadopedido(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);

				this.colorgeneralBeanSwingJInternalFrame=new ColorGeneralBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.colorgeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.colorgeneralBeanSwingJInternalFrame.getColorGeneralLogic().setConnexion(this.estadopedidoLogic.getConnexion());

				if(this.estadopedido.getid_color_general()!=null) {
					this.colorgeneralBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.colorgeneralBeanSwingJInternalFrame.setIdActual(this.estadopedido.getid_color_general());
					this.colorgeneralBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.colorgeneralBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.colorgeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorGeneral();
				}

				JInternalFrameBase jinternalFrame =this.colorgeneralBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadoPedido=(TitledBorder)this.jScrollPanelDatosEstadoPedido.getBorder();
				TitledBorder titledBordercolorgeneral=(TitledBorder)this.colorgeneralBeanSwingJInternalFrame.jScrollPanelDatosColorGeneral.getBorder();

				titledBordercolorgeneral.setTitle(titledBorderEstadoPedido.getTitle() + " -> Color");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_color_generalEstadoPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPedido(this.getestadopedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopedido==null) {
						this.estadopedido = new EstadoPedido();
					}

					this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);
				}

				if(this.estadopedido.getid_color_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_color_general = "+this.estadopedido.getid_color_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdColorGeneralEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadoPedido(false,false);

			this.getEstadoPedidosFK_IdColorGeneral();

			this.inicializarActualizarBindingEstadoPedido(false);

			//if(EstadoPedidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadoPedido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadoPedido() {
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
			this.jInternalFrameDetalleFormEstadoPedido.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoPedido.dispose();
			this.jInternalFrameDetalleFormEstadoPedido=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
			this.jInternalFrameReporteDinamicoEstadoPedido.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoPedido.dispose();
			this.jInternalFrameReporteDinamicoEstadoPedido=null;
		}
		
		if(this.jInternalFrameImportacionEstadoPedido!=null) {
			this.jInternalFrameImportacionEstadoPedido.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoPedido.dispose();
			this.jInternalFrameImportacionEstadoPedido=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoPedido();
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoPedido")) {
				jButtonDuplicarEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoPedido")) {
				jButtonCopiarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoPedido")) {
				jButtonVerFormEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoPedido")) {
				jButtonDuplicarEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoPedido")) {
				jButtonDuplicarEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoPedido")) {
				jButtonModificarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoPedido")) {
				jButtonModificarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoPedido")) {
				jButtonModificarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoPedido")) {
				jButtonActualizarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoPedido")) {
				jButtonActualizarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoPedido")) {
				jButtonActualizarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoPedido")) {
				jButtonEliminarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoPedido")) {
				jButtonEliminarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoPedido")) {
				jButtonEliminarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoPedido")) {
				jButtonCancelarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoPedido")) {
				jButtonCancelarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoPedido")) {
				jButtonCancelarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoPedido")) {
				jButtonCerrarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoPedido")) {
				jButtonCerrarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoPedido")) {
				jButtonCerrarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoPedido")) {
				jButtonMostrarOcultarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoPedido")) {
				jButtonCancelarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoPedido")) {
				jButtonCopiarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoPedido")) {
				jButtonVerFormEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoPedido")) {
				jButtonCopiarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoPedido")) {
				jButtonVerFormEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoPedido")) {
				jButtonRecargarInformacionEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoPedido")) {
				jButtonRecargarInformacionEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoPedido")) {
				jButtonRecargarInformacionEstadoPedidoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoPedido")) {
				jButtonAnterioresEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoPedido")) {
				jButtonAnterioresEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoPedido")) {
				jButtonAnterioresEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoPedido")) {
				jButtonSiguientesEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoPedido")) {
				jButtonSiguientesEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoPedido")) {
				jButtonSiguientesEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoPedido") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoPedido")) {
				jButtonAbrirOrderByEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoPedido") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoPedido")) {
				jButtonMostrarOcultarEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPedido")) {
				jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoPedido")) {
				jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoPedido")) {
				jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoPedido")) {
				jButtonCerrarReporteDinamicoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoPedido")) {
				jButtonGenerarReporteDinamicoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoPedido")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoPedido")) {
				jButtonCerrarImportacionEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoPedido")) {
				
				jButtonGenerarImportacionEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoPedido")) {
				
				jButtonAbrirImportacionEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoPedido")) {
				jComboBoxTiposAccionesEstadoPedidoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoPedido")) {
				jComboBoxTiposRelacionesEstadoPedidoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoPedido")) {
				jComboBoxTiposAccionesEstadoPedidoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoPedido")) {
				
				jComboBoxTiposSeleccionarEstadoPedidoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoPedido")) {
				jTextFieldValorCampoGeneralEstadoPedidoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoPedido")) {
				jButtonAbrirOrderByEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoPedido")) {
				jButtonAbrirOrderByEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoPedido")) {
				jButtonCerrarOrderByEstadoPedidoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPedidoBusqueda")) {
				this.jButtonidEstadoPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPedidoBusqueda")) {
				this.jButtoncodigoEstadoPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPedidoBusqueda")) {
				this.jButtonnombreEstadoPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_color_generalEstadoPedidoUpdate")) {
				this.jButtonid_color_generalEstadoPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_color_generalEstadoPedidoBusqueda")) {
				this.jButtonid_color_generalEstadoPedidoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdColorGeneralEstadoPedido")) {
				this.jButtonFK_IdColorGeneralEstadoPedidoActionPerformed(evt);
			}
			
			;
			
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoPedido();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoPedido estadopedidoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadopedidoLocal=this.estadopedido;
			} else {
				estadopedidoLocal=this.estadopedidoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
							
				
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
								
						
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
								
				
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
							
				
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedidoAnterior =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopedidoAnterior =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
								
				
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoPedido")) {
					jCheckBoxSeleccionarTodosEstadoPedidoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoPedido")) {
					jCheckBoxSeleccionadosEstadoPedidoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoPedido")) {
					
				}
				
				


				
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
												
				
				


				
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedidoAnterior =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopedidoAnterior =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedido);
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedido.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidoAnterior =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoPedido")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoPedido.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadopedido =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadopedido =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadopedido);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoPedido")) {
				
				}
				
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoPedido")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoPedido.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoPedido")) {
			
			}
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoPedido();
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoPedido")) {
				jButtonDuplicarEstadoPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoPedido")) {
				jButtonCopiarEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoPedido")) {
				jButtonVerFormEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoPedido")) {
				jButtonNuevoEstadoPedidoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoPedido")) {
				jButtonModificarEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoPedido")) {
				jButtonActualizarEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoPedido")) {
				jButtonEliminarEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoPedido")) {
				jButtonCancelarEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoPedido")) {
				jButtonCerrarEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoPedido")) {
				jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPedido")) {
				jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoPedido")) {
				jButtonAbrirOrderByEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoPedido")) {
				jButtonRecargarInformacionEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoPedido")) {
				jButtonAnterioresEstadoPedidoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoPedido")) {
				jButtonSiguientesEstadoPedidoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPedidoBusqueda")) {
				this.jButtonidEstadoPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPedidoBusqueda")) {
				this.jButtoncodigoEstadoPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPedidoBusqueda")) {
				this.jButtonnombreEstadoPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_color_generalEstadoPedidoUpdate")) {
				this.jButtonid_color_generalEstadoPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_color_generalEstadoPedidoBusqueda")) {
				this.jButtonid_color_generalEstadoPedidoBusquedaActionPerformed(evt);
			}
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoPedido();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoPedido")) {
				closingInternalFrameEstadoPedido();
				
			} else if(sTipo.equals("jButtonCancelarEstadoPedido")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoPedido = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoPedidoBeanSwingJInternalFrame jInternalFrameParent=(EstadoPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPedido.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoPedidoActionPerformed(null);
			}
			
			EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopedido,new Object(),this.estadopedidoParameterGeneral,this.estadopedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadopedido)) {
			if(!esControlTabla) {
				if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);			
				}
				
				if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoPedido(this.estadopedido,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopedidoReturnGeneral=estadopedidoLogic.procesarEventosEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedidoLogic.getEstadoPedidos(),this.estadopedido,this.estadopedidoParameterGeneral,this.isEsNuevoEstadoPedido,classes);//this.estadopedidoLogic.getEstadoPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoPedido(this.estadopedidoReturnGeneral,this.estadopedidoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPedido(classes,this.estadopedidoReturnGeneral,this.estadopedidoBean,false);
					}
						
					if(this.estadopedidoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedido(this.estadopedidoReturnGeneral.getEstadoPedido());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoPedido(this.estadopedidoReturnGeneral.getEstadoPedido());	
					}
						
					if(this.estadopedidoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoPedido(this.estadopedidoReturnGeneral.getEstadoPedido(),classes);//this.estadopedidoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoPedido(this.estadopedido,classes);//this.estadopedidoBean);									
				}
			
				if(EstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoPedido(this.estadopedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedido(this.estadopedido);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadopedidoAnterior!=null) {
						this.estadopedido=this.estadopedidoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopedidoReturnGeneral=estadopedidoLogic.procesarEventosEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedidoLogic.getEstadoPedidos(),this.estadopedido,this.estadopedidoParameterGeneral,this.isEsNuevoEstadoPedido,classes);//this.estadopedidoLogic.getEstadoPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadopedidoReturnGeneral.getEstadoPedido(),estadopedidoLogic.getEstadoPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadopedidoReturnGeneral.getEstadoPedido(),this.estadopedidos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoPedido.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoPedido.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoPedido();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoPedido() throws Exception {
		
		EstadoPedidoModel estadopedidoModel=(EstadoPedidoModel)this.jTableDatosEstadoPedido.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopedidoModel.estadopedidos=this.estadopedidoLogic.getEstadoPedidos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadopedidoModel.estadopedidos=this.estadopedidos;
		}
		
		
		((EstadoPedidoModel) this.jTableDatosEstadoPedido.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoPedido() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadopedidoAnterior(),this.estadopedidoLogic.getEstadoPedidos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadopedidoAnterior(),this.estadopedidos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoPedido();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoPedido(EstadoPedido estadopedido,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(estadopedido.getConsignacions());
					this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(estadopedido.getPedidoExporExpors());
					this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedido,new Object(),generalEntityParameterGeneral,this.estadopedidoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoPedidoConstantesFunciones.getClassesRelationshipsOfEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoPedidoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoPedido(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedido,new Object(),generalEntityParameterGeneral,this.estadopedidoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoPedido(EstadoPedidoBean estadopedidoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionLogic.setConsignacions(estadopedido.getConsignacions());
					this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(estadopedido.getPedidoExporExpors());
					this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPedido(ArrayList<Classe> classes,EstadoPedidoReturnGeneral estadopedidoReturnGeneral,EstadoPedidoBean estadopedidoBean,Boolean conDefault) throws Exception {
		
			this.estadopedidoBean.setConsignacions(estadopedidoReturnGeneral.getEstadoPedido().getConsignacions());
			this.estadopedidoBean.setPedidoExpors(estadopedidoReturnGeneral.getEstadoPedido().getPedidoExpors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoPedido(EstadoPedido estadopedido,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Consignacion.class)) {
					estadopedido.setConsignacions(this.jInternalFrameDetalleFormEstadoPedido.consignacionBeanSwingJInternalFrame.consignacionLogic.getConsignacions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					estadopedido.setPedidoExporExpors(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadopedido)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPedido = new EstadoPedidoDetalleFormJInternalFrame(jDesktopPane,this.estadopedidoSessionBean.getConGuardarRelaciones(),this.estadopedidoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.setVisible(false);
		this.jInternalFrameDetalleFormEstadoPedido.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoPedido.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoPedido.estadopedidoLogic=this.estadopedidoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoPedido("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPedido();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPedido();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoPedido("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoPedido();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPedido"));
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarEstadoPedido"));

		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarToolBarEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPedido"));
					
		this.jInternalFrameDetalleFormEstadoPedido.jMenuItemModificarEstadoPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarEstadoPedido.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPedido"));
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarToolBarEstadoPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPedido"));
						
		this.jInternalFrameDetalleFormEstadoPedido.jMenuItemActualizarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarEstadoPedido"));
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPedido"));
								
		this.jInternalFrameDetalleFormEstadoPedido.jMenuItemEliminarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarEstadoPedido"));
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPedido"));
					
		this.jInternalFrameDetalleFormEstadoPedido.jMenuItemCancelarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPedido"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jMenuItemDetalleCerrarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPedido"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPedido"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPedido"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonidEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtoncodigoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonnombreEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoPedido.jButtonid_color_generalEstadoPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonid_color_generalEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoPedidoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPedido"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoPedido"));
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPedido"));
		}
		
		this.jTableDatosEstadoPedido.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoPedido"));
		
		this.jTableDatosEstadoPedido.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoPedido"));
		
		this.jButtonNuevoEstadoPedido.addActionListener(new ButtonActionListener(this,"NuevoEstadoPedido"));
		
		this.jButtonDuplicarEstadoPedido.addActionListener(new ButtonActionListener(this,"DuplicarEstadoPedido"));
		
		this.jButtonCopiarEstadoPedido.addActionListener(new ButtonActionListener(this,"CopiarEstadoPedido"));
		
		this.jButtonVerFormEstadoPedido.addActionListener(new ButtonActionListener(this,"VerFormEstadoPedido"));
		
		
		this.jButtonNuevoToolBarEstadoPedido.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoPedido"));
			
		this.jButtonDuplicarToolBarEstadoPedido.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoPedido"));
			
		this.jMenuItemNuevoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoPedido"));
			
		this.jMenuItemDuplicarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoPedido"));		
		
		
		this.jButtonNuevoRelacionesEstadoPedido.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoPedido"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPedido.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoPedido"));
			
		this.jMenuItemNuevoRelacionesEstadoPedido.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoPedido"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonModificarToolBarEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPedido"));
			
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemModificarEstadoPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarEstadoPedido.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonActualizarToolBarEstadoPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPedido"));
				
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemActualizarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonEliminarToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPedido"));
						
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemEliminarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonCancelarToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPedido"));
			
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemCancelarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPedido"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoPedido"));		
		
		
		this.jButtonCerrarEstadoPedido.addActionListener (new ButtonActionListener(this,"CerrarEstadoPedido"));
		
		
		this.jButtonCerrarToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoPedido"));
			
		this.jMenuItemCerrarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoPedido"));
			
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jMenuItemDetalleCerrarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPedido"));
		}
		
		this.jButtonCopiarToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoPedido"));
			
		this.jButtonVerFormToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoPedido"));
		
		this.jMenuItemGuardarCambiosEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoPedido"));
			
		this.jMenuItemCopiarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoPedido"));		
		
		this.jMenuItemVerFormEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoPedido"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPedido"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoPedido"));
			
		this.jMenuItemGuardarCambiosTablaEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPedido"));		
		
		
		
		this.jButtonRecargarInformacionEstadoPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoPedido"));
					
		this.jButtonRecargarInformacionToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoPedido"));
		
		this.jMenuItemRecargarInformacionEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoPedido"));		
		
		
		
		this.jButtonAnterioresEstadoPedido.addActionListener (new ButtonActionListener(this,"AnterioresEstadoPedido"));
		
		
		this.jButtonAnterioresToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoPedido"));
		
		this.jMenuItemAnterioresEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoPedido"));		
		
		
		this.jButtonSiguientesEstadoPedido.addActionListener (new ButtonActionListener(this,"SiguientesEstadoPedido"));
		
		
		this.jButtonSiguientesToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoPedido"));
			
		this.jMenuItemSiguientesEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoPedido"));
			
		this.jMenuItemAbrirOrderByEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoPedido"));
			
		this.jMenuItemMostrarOcultarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoPedido"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoPedido"));
			
		this.jMenuItemDetalleMostarOcultarEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoPedido"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoPedido"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoPedido"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoPedido"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoPedido"));

		this.jCheckBoxSeleccionadosEstadoPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoPedido"));
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPedido"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoPedido"));
			
		this.jComboBoxTiposAccionesEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoPedido"));
					
		this.jComboBoxTiposSeleccionarEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoPedido"));
			
		this.jTextFieldValorCampoGeneralEstadoPedido.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoPedido"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonidEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtoncodigoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonnombreEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoPedido.jButtonid_color_generalEstadoPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonid_color_generalEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoPedidoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdColorGeneralEstadoPedido.addActionListener(new ButtonActionListener(this,"FK_IdColorGeneralEstadoPedido"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoPedido!=null) {
				this.jInternalFrameReporteDinamicoEstadoPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPedido"));
				this.jInternalFrameReporteDinamicoEstadoPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPedido"));
				this.jInternalFrameReporteDinamicoEstadoPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPedido"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoPedido.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPedido"));				
			//this.jButtonGenerarReporteDinamicoEstadoPedido.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPedido"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoPedido.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPedido"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoPedido!=null) {
				this.jInternalFrameImportacionEstadoPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPedido"));
				this.jInternalFrameImportacionEstadoPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPedido"));
				this.jInternalFrameImportacionEstadoPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPedido"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoPedido"));
			
			this.jButtonAbrirOrderByToolBarEstadoPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoPedido"));			
			
			if(this.jInternalFrameOrderByEstadoPedido!=null) {
				this.jInternalFrameOrderByEstadoPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPedido"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedido.jTabbedPaneRelacionesEstadoPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPedido"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameEstadoPedido();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoPedido.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoPedido = (JInternalFrameBase)event.getSource();
	            	
	            EstadoPedidoBeanSwingJInternalFrame jInternalFrameParent=(EstadoPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPedido.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoPedidoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoPedido.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoPedido.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoPedido.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoPedido";
		inputMap = this.jButtonNuevoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPedidoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoPedido";
		inputMap = this.jButtonNuevoRelacionesEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPedidoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoPedido";
		inputMap = this.jButtonModificarEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoPedido";
		inputMap = this.jButtonActualizarEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoPedido";
		inputMap = this.jButtonEliminarEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoPedido";
		inputMap = this.jButtonCancelarEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoPedido";
		inputMap = this.jButtonCerrarEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoPedido";
		inputMap = this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoPedido.jButtonGuardarCambiosEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoPedido.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoPedidoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonidEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtoncodigoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonnombreEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoPedido.jButtonid_color_generalEstadoPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedido.jButtonid_color_generalEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoPedidoBusqueda"));
		
		
		this.jButtonFK_IdColorGeneralEstadoPedido.addActionListener(new ButtonActionListener(this,"FK_IdColorGeneralEstadoPedido"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoPedido.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoPedido(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
					estadopedidoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedido estadopedidoAux:estadopedidos) {
					estadopedidoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
						estadopedidoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPedido estadopedidoAux:estadopedidos) {
						estadopedidoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPedido estadopedidoAux:estadopedidos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoPedido.getSelectedRows();
			
			EstadoPedido estadopedidoLocal=new EstadoPedido();
			
			//this.seleccionarTodosEstadoPedido(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopedidoLocal =(EstadoPedido) this.estadopedidoLogic.getEstadoPedidos().toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadopedidoLocal =(EstadoPedido) this.estadopedidos.toArray()[this.jTableDatosEstadoPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadopedidoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
						estadopedidoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPedido estadopedidoAux:estadopedidos) {
						estadopedidoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoPedido(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoPedidoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoPedidoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoPedido(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoPedido.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPedido estadopedidoAux:this.estadopedidoLogic.getEstadoPedidos()) {
				
						if(sTipoSeleccionar.equals(EstadoPedidoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadopedidoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedido estadopedidoAux:estadopedidos) {
					
						if(sTipoSeleccionar.equals(EstadoPedidoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadopedidoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoPedidoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoPedido=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoPedido.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoPedido) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoPedido(conSplash);
				
					this.generarReporteEstadoPedidosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoPedidosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPedidosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPedidosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPedido();
				
				this.exportarEstadoPedidosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoPedidos();
				//this.importarEstadoPedidos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPedido();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoPedidosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoPedido();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoPedido)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoPedido(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedido.jComboBoxTiposAccionesFormularioEstadoPedido.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoPedido();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoPedido(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoPedidoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoPedido();
			
			if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
			EstadoPedido estadopedido=new EstadoPedido();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoPedido.getSelectedItem();
			
			
			
			
			estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadopedidosSeleccionados.size()==1) {
				for(EstadoPedido estadopedidoAux:estadopedidosSeleccionados) {
					estadopedido=estadopedidoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Consignacion")) {
					jButtonConsignacionActionPerformed(null,rowIndex,true,false,estadopedido);
				}
				else if(this.sTipoRelacion.equals("Pedido Exportacion")) {
					jButtonPedidoExporActionPerformed(null,rowIndex,true,false,estadopedido);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoPedido();
			
      		//this.finishProcessEstadoPedido(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoPedidoReturnGeneral() throws Exception {
		if(this.estadopedidoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadopedidoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadopedidoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadopedidoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadopedidoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadopedidoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoPedido(false);
		}
		
		if(this.estadopedidoReturnGeneral.getConRetornoLista() || this.estadopedidoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadopedidoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopedidoLogic.setEstadoPedidos(this.estadopedidoReturnGeneral.getEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadopedidoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopedidoLogic.setEstadoPedido(this.estadopedidoReturnGeneral.getEstadoPedido());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoPedido(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoPedido() throws Exception {
		
		
	}
	
	public ArrayList<EstadoPedido> getEstadoPedidosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoPedido) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoPedido estadopedidoAux:estadopedidoLogic.getEstadoPedidos()) {
					if(estadopedidoAux.getIsSelected()) {
						estadopedidosSeleccionados.add(estadopedidoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedido estadopedidoAux:this.estadopedidos) {
					if(estadopedidoAux.getIsSelected()) {
						estadopedidosSeleccionados.add(estadopedidoAux);				
					}
				}
			}
			
			if(estadopedidosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadopedidosSeleccionados.addAll(this.estadopedidoLogic.getEstadoPedidos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadopedidosSeleccionados.addAll(this.estadopedidos);				
					}
				}
			}
		} else {
			estadopedidosSeleccionados.add(this.estadopedido);
		}
		
		return estadopedidosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteEstadoPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPedidosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPedidosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoPedidosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoPedidosSeleccionados() throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoPedidos("Todos",estadopedidosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoPedidosSeleccionados() throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoPedidos("Todos",estadopedidosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoPedidosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoPedidos("Todos",estadopedidosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoPedido();
		
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoPedido();
		
		
		//this.generarReporteEstadoPedidos("Todos",estadopedidosSeleccionados ,estadopedidoImplementable,estadopedidoImplementableHome);
	}
	
	public void mostrarImportacionEstadoPedidos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoPedido();
		
		this.abrirFrameImportacionEstadoPedido();		
		
			
		//this.generarReporteEstadoPedidos("Todos",estadopedidosSeleccionados ,estadopedidoImplementable,estadopedidoImplementableHome);
	}
	
	public void importarEstadoPedidos() throws Exception {		
	
	}
	
	public void exportarEstadoPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoPedidosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoPedidosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoPedidosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedido."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoPedido(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoPedido estadopedidoAux:estadopedidosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoPedido(estadopedidoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadopedidoAux.setsDetalleGeneralEntityReporte(estadopedidoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoPedido(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoPedidoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPedidoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPedidoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPedidoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoPedido(EstadoPedido estadopedido,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadopedido.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopedido.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopedido.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopedido.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopedido.getcolorgeneral_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoPedidosSeleccionados() throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedido.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoPedido(row);				
				iRow++;
			}				
			
			for(EstadoPedido estadopedidoAux:estadopedidosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoPedido(estadopedidoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoPedidosSeleccionados() throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();		
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedido.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadopedidos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadopedido");
			//elementRoot.appendChild(element);
		
			for(EstadoPedido estadopedidoAux:estadopedidosSeleccionados) {
				element = document.createElement("estadopedido");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoPedido(estadopedidoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoPedido(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoPedido(EstadoPedido estadopedido,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadopedido.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopedido.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopedido.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopedido.getcolorgeneral_descripcion());				
	}
	
	public void setFilaDatosExportarXmlEstadoPedido(EstadoPedido estadopedido,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoPedidoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadopedido.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoPedidoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadopedido.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoPedidoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadopedido.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoPedidoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadopedido.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcolorgeneral_descripcion = document.createElement(EstadoPedidoConstantesFunciones.IDCOLORGENERAL);
		elementcolorgeneral_descripcion.appendChild(document.createTextNode(estadopedido.getcolorgeneral_descripcion()));
		element.appendChild(elementcolorgeneral_descripcion);
	}
	
	public void generarReporteGroupGenericoEstadoPedidosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoPedido> estadopedidosSeleccionados=new ArrayList<EstadoPedido>();
		
		estadopedidosSeleccionados=this.getEstadoPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoPedido(estadopedidosSeleccionados);
		
		this.generarReporteEstadoPedidos("Todos",estadopedidosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoPedido(ArrayList<EstadoPedido> estadopedidosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoPedido estadopedidoAux:estadopedidosSeleccionados) {
				estadopedidoAux.setsDetalleGeneralEntityReporte(estadopedidoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoPedidoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadopedidoAux.setsDescripcionGeneralEntityReporte1(estadopedidoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoPedidoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadopedidoAux.setsDescripcionGeneralEntityReporte1(estadopedidoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL)) {
					existe=true;
					estadopedidoAux.setsDescripcionGeneralEntityReporte1(estadopedidoAux.getcolorgeneral_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoPedido(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoPedido=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoPedido=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoPedido=false;
			this.isVisibilidadCeldaActualizarEstadoPedido=false;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
			this.isVisibilidadCeldaCancelarEstadoPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
			this.isVisibilidadCeldaModificarEstadoPedido=false;
			this.isVisibilidadCeldaActualizarEstadoPedido=true;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
			this.isVisibilidadCeldaCancelarEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
			this.isVisibilidadCeldaModificarEstadoPedido=false;
			this.isVisibilidadCeldaActualizarEstadoPedido=true;
			this.isVisibilidadCeldaEliminarEstadoPedido=true;
			this.isVisibilidadCeldaCancelarEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
			this.isVisibilidadCeldaModificarEstadoPedido=false;
			this.isVisibilidadCeldaActualizarEstadoPedido=true;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
			this.isVisibilidadCeldaCancelarEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=true;
			this.isVisibilidadCeldaModificarEstadoPedido=false;
			this.isVisibilidadCeldaActualizarEstadoPedido=false;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
			this.isVisibilidadCeldaCancelarEstadoPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
			this.isVisibilidadCeldaActualizarEstadoPedido=false;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
			this.isVisibilidadCeldaCancelarEstadoPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
			this.isVisibilidadCeldaModificarEstadoPedido=true;
			this.isVisibilidadCeldaActualizarEstadoPedido=false;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
			this.isVisibilidadCeldaCancelarEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedido=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=true;
		} else {
			this.actualizarEstadoPanelsEstadoPedido(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoPedido=false;
			//this.isVisibilidadCeldaVerFormEstadoPedido=false;
			this.isVisibilidadCeldaDuplicarEstadoPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadopedidoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadopedidoSessionBean.getEsGuardarRelacionado()) {
			if(!estadopedidoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;												
			}
			
			this.jButtonCerrarEstadoPedido.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedido=false;
		}
		
		if(!this.permiteMantenimiento(this.estadopedido)) {
			this.isVisibilidadCeldaActualizarEstadoPedido=false;
			this.isVisibilidadCeldaEliminarEstadoPedido=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPedido() {
		this.isVisibilidadCeldaNuevoEstadoPedido=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoPedido=false;
	}
	
	public void actualizarEstadoPanelsEstadoPedido(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionEstadoPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedido!=null) {
				this.jScrollPanelDatosEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedido!=null) {
				this.jPanelPaginacionEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionEstadoPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoPedido!=null) {
				this.jScrollPanelDatosEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPedido!=null) {
				this.jPanelPaginacionEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionEstadoPedido.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedido!=null) {
				this.jScrollPanelDatosEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPedido!=null) {
				this.jPanelPaginacionEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionEstadoPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedido!=null) {
				this.jScrollPanelDatosEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPedido!=null) {
				this.jPanelPaginacionEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionEstadoPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedido!=null) {
				this.jScrollPanelDatosEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedido!=null) {
				this.jPanelPaginacionEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionEstadoPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedido!=null) {
				this.jScrollPanelDatosEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedido!=null) {
				this.jPanelPaginacionEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionEstadoPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedido!=null) {
				this.jScrollPanelDatosEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedido!=null) {
				this.jPanelPaginacionEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
					this.jTabbedPaneBusquedasEstadoPedido.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoPedido!=null) {
				this.jTabbedPaneBusquedasEstadoPedido.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadoPedido!=null) {
				this.jPanelParametrosReportesEstadoPedido.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaColorGeneral(Boolean isParaColorGeneral){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaColorGeneralNegation=!isParaColorGeneral;

			this.isVisibilidadFK_IdColorGeneral=isParaColorGeneral;
			if(!this.isVisibilidadFK_IdColorGeneral) {this.jTabbedPaneBusquedasEstadoPedido.remove(jPanelFK_IdColorGeneralEstadoPedido);}
		}
		
	}
	
	

	public String registrarSesionEstadoPedidoParaConsignacions() throws Exception {
		Boolean isPaginaPopupConsignacion=false;

		try {

			if(this.estadopedidoSessionBean==null) {
				this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean=new ConsignacionSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean.setsPathNavegacionActual(estadopedidoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConsignacion=this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConsignacion(true);
			this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConsignacion(EstadoPedidoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPedido(true);
			this.jInternalFrameDetalleFormEstadoPedido.consignacionSessionBean.setlidEstadoPedidoActual(this.idEstadoPedidoActual);

			estadopedidoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoPedido(true);
			estadopedidoSessionBean.setlIdEstadoPedidoActualForeignKey(this.idEstadoPedidoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoPedidoExporParaPedidoExpors() throws Exception {
		Boolean isPaginaPopupPedidoExpor=false;

		try {

			if(this.estadopedidoSessionBean==null) {
				this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean=new PedidoExporSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean.setsPathNavegacionActual(estadopedidoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoExpor=this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoExpor(true);
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoExpor(EstadoPedidoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPedidoExpor(true);
			this.jInternalFrameDetalleFormEstadoPedido.pedidoexporSessionBean.setlidEstadoPedidoExporActual(this.idEstadoPedidoActual);

			estadopedidoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoPedido(true);
			estadopedidoSessionBean.setlIdEstadoPedidoActualForeignKey(this.idEstadoPedidoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoPedidoSessionBean estadopedidoSessionBean=new EstadoPedidoSessionBean();
		
		if(this.estadopedidoSessionBean==null) {
			this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
		}
		
		this.estadopedidoSessionBean.setsUltimaBusquedaEstadoPedido(this.getsAccionBusqueda());
		this.estadopedidoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadopedidoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdColorGeneral")) {
			estadopedidoSessionBean.setid_color_general(this.getid_color_generalFK_IdColorGeneral());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoPedidoSessionBean estadopedidoSessionBean=new EstadoPedidoSessionBean();
		
		if(this.estadopedidoSessionBean==null) {
			this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
		}
		
		if(this.estadopedidoSessionBean.getsUltimaBusquedaEstadoPedido()!=null&&!this.estadopedidoSessionBean.getsUltimaBusquedaEstadoPedido().equals("")) {
			this.setsAccionBusqueda(estadopedidoSessionBean.getsUltimaBusquedaEstadoPedido());
			this.setiNumeroPaginacion(estadopedidoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadopedidoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdColorGeneral")) {
				this.setid_color_generalFK_IdColorGeneral(estadopedidoSessionBean.getid_color_general());
				estadopedidoSessionBean.setid_color_general(-1L);
			}
		}
		
		this.estadopedidoSessionBean.setsUltimaBusquedaEstadoPedido("");
		this.estadopedidoSessionBean.setiNumeroPaginacion(EstadoPedidoConstantesFunciones.INUMEROPAGINACION);
		this.estadopedidoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoPedido(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoPedido() {
		this.updateBorderResaltarBusquedasFormularioEstadoPedido();
		this.updateVisibilidadBusquedasFormularioEstadoPedido();
		this.updateHabilitarBusquedasFormularioEstadoPedido();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoPedido() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadoPedido.getComponents().length>0) {
	

		if(this.estadopedidoConstantesFunciones.resaltarFK_IdColorGeneralEstadoPedido!=null) {
			index= this.jTabbedPaneBusquedasEstadoPedido.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoPedido);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoPedido.getComponent(index);
				jPanel.setBorder(this.estadopedidoConstantesFunciones.resaltarFK_IdColorGeneralEstadoPedido);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoPedido() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadoPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoPedido.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoPedido);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoPedido.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.estadopedidoConstantesFunciones.mostrarFK_IdColorGeneralEstadoPedido);
			if(!this.estadopedidoConstantesFunciones.mostrarFK_IdColorGeneralEstadoPedido && index>-1) {
				this.jTabbedPaneBusquedasEstadoPedido.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadoPedido() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadoPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoPedido.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoPedido);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoPedido.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.estadopedidoConstantesFunciones.activarFK_IdColorGeneralEstadoPedido);
				this.jTabbedPaneBusquedasEstadoPedido.setEnabledAt(index,this.estadopedidoConstantesFunciones.activarFK_IdColorGeneralEstadoPedido);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadoPedido(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdColorGeneral")) {
			index= this.jTabbedPaneBusquedasEstadoPedido.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoPedido);

			this.jTabbedPaneBusquedasEstadoPedido.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoPedido.getComponent(index);

			this.estadopedidoConstantesFunciones.setResaltarFK_IdColorGeneralEstadoPedido(resaltar);

			jPanel.setBorder(this.estadopedidoConstantesFunciones.resaltarFK_IdColorGeneralEstadoPedido);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEstadoPedido.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioEstadoPedido() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoPedido();
		this.updateVisibilidadResaltarControlesFormularioEstadoPedido();
		this.updateHabilitarResaltarControlesFormularioEstadoPedido();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoPedido() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadopedidoConstantesFunciones.resaltaridEstadoPedido!=null && this.jInternalFrameDetalleFormEstadoPedido!=null) {this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.setBorder(this.estadopedidoConstantesFunciones.resaltaridEstadoPedido);}
		if(this.estadopedidoConstantesFunciones.resaltarcodigoEstadoPedido!=null && this.jInternalFrameDetalleFormEstadoPedido!=null) {this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.setBorder(this.estadopedidoConstantesFunciones.resaltarcodigoEstadoPedido);}
		if(this.estadopedidoConstantesFunciones.resaltarnombreEstadoPedido!=null && this.jInternalFrameDetalleFormEstadoPedido!=null) {this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.setBorder(this.estadopedidoConstantesFunciones.resaltarnombreEstadoPedido);}
		if(this.estadopedidoConstantesFunciones.resaltarid_color_generalEstadoPedido!=null && this.jInternalFrameDetalleFormEstadoPedido!=null) {this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setBorder(this.estadopedidoConstantesFunciones.resaltarid_color_generalEstadoPedido);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoPedido() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
	
		//this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostraridEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jPanelidEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostraridEstadoPedido);
		//this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostrarcodigoEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jPanelcodigoEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostrarcodigoEstadoPedido);
		//this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostrarnombreEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jPanelnombreEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostrarnombreEstadoPedido);
		//this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostrarid_color_generalEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jPanelid_color_generalEstadoPedido.setVisible(this.estadopedidoConstantesFunciones.mostrarid_color_generalEstadoPedido);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoPedido() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPedido!=null) {
	
		this.jInternalFrameDetalleFormEstadoPedido.jTextFieldidEstadoPedido.setEnabled(this.estadopedidoConstantesFunciones.activaridEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jTextFieldcodigoEstadoPedido.setEnabled(this.estadopedidoConstantesFunciones.activarcodigoEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jTextAreanombreEstadoPedido.setEnabled(this.estadopedidoConstantesFunciones.activarnombreEstadoPedido);
		this.jInternalFrameDetalleFormEstadoPedido.jComboBoxid_color_generalEstadoPedido.setEnabled(this.estadopedidoConstantesFunciones.activarid_color_generalEstadoPedido);
		}
	}
	
		
}
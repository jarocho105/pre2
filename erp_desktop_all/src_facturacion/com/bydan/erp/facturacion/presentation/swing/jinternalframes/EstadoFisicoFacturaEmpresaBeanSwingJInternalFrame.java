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

import com.bydan.erp.facturacion.util.EstadoFisicoFacturaEmpresaConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoFisicoFacturaEmpresaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoFisicoFacturaEmpresaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoFisicoFacturaEmpresaBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame extends EstadoFisicoFacturaEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresaValidator = new ClassValidator<EstadoFisicoFacturaEmpresa>(EstadoFisicoFacturaEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoFisicoFacturaEmpresa estadofisicofacturaempresa;	
	public EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux;
	public EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoFisicoFacturaEmpresa estadofisicofacturaempresaTotales;
	public Long idEstadoFisicoFacturaEmpresaActual;
	public Long iIdNuevoEstadoFisicoFacturaEmpresa=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosFactura=false;

	public Boolean getIsTienePermisosFactura() {
		return isTienePermisosFactura;
	}

	public void setIsTienePermisosFactura(Boolean isTienePermisosFactura) {
		this.isTienePermisosFactura= isTienePermisosFactura;
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
	
	public Boolean isPermisoTodoEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoNuevoEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoActualizarEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoActualizarOriginalEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoEliminarEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoConsultaEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoBusquedaEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoReporteEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoCopiarEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoVerFormEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoDuplicarEstadoFisicoFacturaEmpresa;
	public Boolean isPermisoOrdenEstadoFisicoFacturaEmpresa;
	
	
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
	
	public EstadoFisicoFacturaEmpresaParameterReturnGeneral estadofisicofacturaempresaReturnGeneral;
	public EstadoFisicoFacturaEmpresaParameterReturnGeneral estadofisicofacturaempresaParameterGeneral;
	
	

	public FacturaLogic facturaLogic=null;

	public FacturaLogic getFacturaLogic() {
		return facturaLogic;
	}

	public void setFacturaLogic(FacturaLogic facturaLogic) {
		this.facturaLogic = facturaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoFisicoFacturaEmpresa=false;
	public Boolean esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoFisicoFacturaEmpresaSessionBeanAdditional estadofisicofacturaempresaSessionBeanAdditional=null;
	
	public EstadoFisicoFacturaEmpresaSessionBeanAdditional getEstadoFisicoFacturaEmpresaSessionBeanAdditional() {
		return this.estadofisicofacturaempresaSessionBeanAdditional;
	}
	
	public void setEstadoFisicoFacturaEmpresaSessionBeanAdditional(EstadoFisicoFacturaEmpresaSessionBeanAdditional estadofisicofacturaempresaSessionBeanAdditional) {
		try {
			this.estadofisicofacturaempresaSessionBeanAdditional=estadofisicofacturaempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional estadofisicofacturaempresaBeanSwingJInternalFrameAdditional=null;
	//public class EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame
	
	public EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional getEstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional() {
		return this.estadofisicofacturaempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional(EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional estadofisicofacturaempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.estadofisicofacturaempresaBeanSwingJInternalFrameAdditional=estadofisicofacturaempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoFisicoFacturaEmpresaLogic estadofisicofacturaempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoFisicoFacturaEmpresa estadofisicofacturaempresaBean;
	public EstadoFisicoFacturaEmpresaConstantesFunciones estadofisicofacturaempresaConstantesFunciones;
	//public EstadoFisicoFacturaEmpresaParameterReturnGeneral estadofisicofacturaempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas;	
	//public List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasEliminados;
	//public List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
	public Boolean isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEstadoFisicoFacturaEmpresa() {
		return this.iIdNuevoEstadoFisicoFacturaEmpresa;
	}

	public void setiIdNuevoEstadoFisicoFacturaEmpresa(Long iIdNuevoEstadoFisicoFacturaEmpresa) {
		this.iIdNuevoEstadoFisicoFacturaEmpresa = iIdNuevoEstadoFisicoFacturaEmpresa;
	}
	
	public Long getidEstadoFisicoFacturaEmpresaActual() {
		return this.idEstadoFisicoFacturaEmpresaActual;
	}

	public void setidEstadoFisicoFacturaEmpresaActual(Long idEstadoFisicoFacturaEmpresaActual) {
		this.idEstadoFisicoFacturaEmpresaActual = idEstadoFisicoFacturaEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoFisicoFacturaEmpresa getestadofisicofacturaempresa() {
		return this.estadofisicofacturaempresa;
	}

	public void setestadofisicofacturaempresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa) {
		this.estadofisicofacturaempresa = estadofisicofacturaempresa;
	}
	
	public EstadoFisicoFacturaEmpresa getestadofisicofacturaempresaAux() {
		return this.estadofisicofacturaempresaAux;
	}

	public void setestadofisicofacturaempresaAux(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux) {
		this.estadofisicofacturaempresaAux = estadofisicofacturaempresaAux;
	}				
	
	public EstadoFisicoFacturaEmpresa getestadofisicofacturaempresaAnterior() {
		return this.estadofisicofacturaempresaAnterior;
	}

	public void setestadofisicofacturaempresaAnterior(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAnterior) {
		this.estadofisicofacturaempresaAnterior = estadofisicofacturaempresaAnterior;
	}	
	
	public EstadoFisicoFacturaEmpresa getestadofisicofacturaempresaTotales() {
		return this.estadofisicofacturaempresaTotales;
	}

	public void setestadofisicofacturaempresaTotales(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaTotales) {
		this.estadofisicofacturaempresaTotales = estadofisicofacturaempresaTotales;
	}	
	
	public EstadoFisicoFacturaEmpresa getestadofisicofacturaempresaBean() {
		return this.estadofisicofacturaempresaBean;
	}

	public void setestadofisicofacturaempresaBean(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaBean) {
		this.estadofisicofacturaempresaBean = estadofisicofacturaempresaBean;
	}	
	
	public EstadoFisicoFacturaEmpresaParameterReturnGeneral getestadofisicofacturaempresaReturnGeneral() {
		return this.estadofisicofacturaempresaReturnGeneral;
	}

	public void setestadofisicofacturaempresaReturnGeneral(EstadoFisicoFacturaEmpresaParameterReturnGeneral estadofisicofacturaempresaReturnGeneral) {
		this.estadofisicofacturaempresaReturnGeneral = estadofisicofacturaempresaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoFisicoFacturaEmpresaLogic getEstadoFisicoFacturaEmpresaLogic()	{		
		return estadofisicofacturaempresaLogic;
	}

	public void setEstadoFisicoFacturaEmpresaLogic(EstadoFisicoFacturaEmpresaLogic estadofisicofacturaempresaLogic) {
		this.estadofisicofacturaempresaLogic = estadofisicofacturaempresaLogic;
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
	
	public Boolean getIsEsNuevoEstadoFisicoFacturaEmpresa() {
		return isEsNuevoEstadoFisicoFacturaEmpresa;
	}

	public void setIsEsNuevoEstadoFisicoFacturaEmpresa(Boolean isEsNuevoEstadoFisicoFacturaEmpresa) {
		this.isEsNuevoEstadoFisicoFacturaEmpresa = isEsNuevoEstadoFisicoFacturaEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa() {
		return esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa(Boolean esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa) {
		this.esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa = esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.estadofisicofacturaempresaSessionBean==null) {
				this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
			}

			if(!this.estadofisicofacturaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(estadofisicofacturaempresaSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.estadofisicofacturaempresa!=null) {
						this.estadofisicofacturaempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
						this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
						if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico!=null && jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,JComboBox jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEstadoFisicoFacturaEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				estadofisicofacturaempresa.setid_empresa(empresaAux.getId());
				estadofisicofacturaempresa.setempresa_descripcion(EstadoFisicoFacturaEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				estadofisicofacturaempresa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { 
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { 
					}

					if(!EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadoFisicoFacturaEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoFisicoFacturaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoFisicoFacturaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresas(this.estadofisicofacturaempresas);
			estadofisicofacturaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoFisicoFacturaEmpresaParameterReturnGeneral getEstadoFisicoFacturaEmpresaParameterGeneral() {
		return this.estadofisicofacturaempresaParameterGeneral;
	}
	
	public void setEstadoFisicoFacturaEmpresaParameterGeneral(EstadoFisicoFacturaEmpresaParameterReturnGeneral estadofisicofacturaempresaParameterGeneral) {
		this.estadofisicofacturaempresaParameterGeneral = estadofisicofacturaempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoFisicoFacturaEmpresa() {
		return isPermisoTodoEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoTodoEstadoFisicoFacturaEmpresa(Boolean isPermisoTodoEstadoFisicoFacturaEmpresa) {
		this.isPermisoTodoEstadoFisicoFacturaEmpresa = isPermisoTodoEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsPermisoNuevoEstadoFisicoFacturaEmpresa() {
		return isPermisoNuevoEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoNuevoEstadoFisicoFacturaEmpresa(Boolean isPermisoNuevoEstadoFisicoFacturaEmpresa) {
		this.isPermisoNuevoEstadoFisicoFacturaEmpresa = isPermisoNuevoEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsPermisoActualizarEstadoFisicoFacturaEmpresa() {
		return isPermisoActualizarEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoActualizarEstadoFisicoFacturaEmpresa(Boolean isPermisoActualizarEstadoFisicoFacturaEmpresa) {
		this.isPermisoActualizarEstadoFisicoFacturaEmpresa = isPermisoActualizarEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsPermisoEliminarEstadoFisicoFacturaEmpresa() {
		return isPermisoEliminarEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoEliminarEstadoFisicoFacturaEmpresa(Boolean isPermisoEliminarEstadoFisicoFacturaEmpresa) {
		this.isPermisoEliminarEstadoFisicoFacturaEmpresa = isPermisoEliminarEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoFisicoFacturaEmpresa() {
		return isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoGuardarCambiosEstadoFisicoFacturaEmpresa(Boolean isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa) {
		this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa = isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoConsultaEstadoFisicoFacturaEmpresa() {
		return isPermisoConsultaEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoConsultaEstadoFisicoFacturaEmpresa(Boolean isPermisoConsultaEstadoFisicoFacturaEmpresa) {
		this.isPermisoConsultaEstadoFisicoFacturaEmpresa = isPermisoConsultaEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsPermisoBusquedaEstadoFisicoFacturaEmpresa() {
		return isPermisoBusquedaEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoBusquedaEstadoFisicoFacturaEmpresa(Boolean isPermisoBusquedaEstadoFisicoFacturaEmpresa) {
		this.isPermisoBusquedaEstadoFisicoFacturaEmpresa = isPermisoBusquedaEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsPermisoReporteEstadoFisicoFacturaEmpresa() {
		return isPermisoReporteEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoReporteEstadoFisicoFacturaEmpresa(Boolean isPermisoReporteEstadoFisicoFacturaEmpresa) {
		this.isPermisoReporteEstadoFisicoFacturaEmpresa = isPermisoReporteEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoFisicoFacturaEmpresa() {
		return isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoPaginacionMedioEstadoFisicoFacturaEmpresa(Boolean isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa) {
		this.isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa = isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoFisicoFacturaEmpresa() {
		return isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoPaginacionTodoEstadoFisicoFacturaEmpresa(Boolean isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa) {
		this.isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa = isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoFisicoFacturaEmpresa() {
		return isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoPaginacionAltoEstadoFisicoFacturaEmpresa(Boolean isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa) {
		this.isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa = isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoCopiarEstadoFisicoFacturaEmpresa() {
		return isPermisoCopiarEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoCopiarEstadoFisicoFacturaEmpresa(Boolean isPermisoCopiarEstadoFisicoFacturaEmpresa) {
		this.isPermisoCopiarEstadoFisicoFacturaEmpresa = isPermisoCopiarEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoVerFormEstadoFisicoFacturaEmpresa() {
		return isPermisoVerFormEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoVerFormEstadoFisicoFacturaEmpresa(Boolean isPermisoVerFormEstadoFisicoFacturaEmpresa) {
		this.isPermisoVerFormEstadoFisicoFacturaEmpresa = isPermisoVerFormEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarEstadoFisicoFacturaEmpresa() {
		return isPermisoDuplicarEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoDuplicarEstadoFisicoFacturaEmpresa(Boolean isPermisoDuplicarEstadoFisicoFacturaEmpresa) {
		this.isPermisoDuplicarEstadoFisicoFacturaEmpresa = isPermisoDuplicarEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsPermisoOrdenEstadoFisicoFacturaEmpresa() {
		return isPermisoOrdenEstadoFisicoFacturaEmpresa;
	}

	public void setIsPermisoOrdenEstadoFisicoFacturaEmpresa(Boolean isPermisoOrdenEstadoFisicoFacturaEmpresa) {
		this.isPermisoOrdenEstadoFisicoFacturaEmpresa = isPermisoOrdenEstadoFisicoFacturaEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa = isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa = isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa = isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa = isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa = isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa = isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa = isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa = isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa = isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa = isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa = isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa() {
		return isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa(Boolean isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa = isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa;
	}
		
	public EstadoFisicoFacturaEmpresaSessionBean getestadofisicofacturaempresaSessionBean() {
		return this.estadofisicofacturaempresaSessionBean;
	}
	
	public void setestadofisicofacturaempresaSessionBean(EstadoFisicoFacturaEmpresaSessionBean estadofisicofacturaempresaSessionBean) {
		this.estadofisicofacturaempresaSessionBean=estadofisicofacturaempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(estadofisicofacturaempresa,null);
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
	
	public void bugActualizarReferenciaActual(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadofisicofacturaempresaAux.setId(estadofisicofacturaempresa.getId());
		estadofisicofacturaempresaAux.setVersionRow(estadofisicofacturaempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoFisicoFacturaEmpresa();
		
			int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadofisicofacturaempresaValidator.getInvalidValues(this.estadofisicofacturaempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadofisicofacturaempresaLogic.setDatosCliente(datosCliente);
			estadofisicofacturaempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadofisicofacturaempresaAux=new  EstadoFisicoFacturaEmpresa();
				
				estadofisicofacturaempresaAux.setIsNew(true);
				estadofisicofacturaempresaAux.setIsChanged(true);
				
				estadofisicofacturaempresaAux.setEstadoFisicoFacturaEmpresaOriginal(this.estadofisicofacturaempresa);
				
				estadofisicofacturaempresaAux.setId(this.estadofisicofacturaempresa.getId());	
				estadofisicofacturaempresaAux.setVersionRow(this.estadofisicofacturaempresa.getVersionRow());	
				estadofisicofacturaempresaAux.setid_empresa(this.estadofisicofacturaempresa.getid_empresa());	
				estadofisicofacturaempresaAux.setcodigo(this.estadofisicofacturaempresa.getcodigo());	
				estadofisicofacturaempresaAux.setnombre(this.estadofisicofacturaempresa.getnombre());	
				estadofisicofacturaempresaAux.setes_pendiente(this.estadofisicofacturaempresa.getes_pendiente());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresas();//WithConnection
						//estadofisicofacturaempresaLogic.getSetVersionRowEstadoFisicoFacturaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofisicofacturaempresa,estadofisicofacturaempresaAux);
					
					this.refrescarForeignKeysDescripcionesEstadoFisicoFacturaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas().addAll(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturas.addAll(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresaRelaciones(estadofisicofacturaempresaAux,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());//WithConnection
								//estadofisicofacturaempresaLogic.getSetVersionRowEstadoFisicoFacturaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadofisicofacturaempresa,estadofisicofacturaempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(new ArrayList<Factura>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturas= new ArrayList<Factura>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadofisicofacturaempresaAux.setFacturas(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadofisicofacturaempresa,estadofisicofacturaempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadofisicofacturaempresaAux=new  EstadoFisicoFacturaEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() && this.estadofisicofacturaempresa.getId()>=0)) {
						
					estadofisicofacturaempresaAux.setIsNew(false);
				}
				
				estadofisicofacturaempresaAux.setIsDeleted(false);
			
				estadofisicofacturaempresaAux.setId(this.estadofisicofacturaempresa.getId());	
				estadofisicofacturaempresaAux.setVersionRow(this.estadofisicofacturaempresa.getVersionRow());	
				estadofisicofacturaempresaAux.setid_empresa(this.estadofisicofacturaempresa.getid_empresa());	
				estadofisicofacturaempresaAux.setcodigo(this.estadofisicofacturaempresa.getcodigo());	
				estadofisicofacturaempresaAux.setnombre(this.estadofisicofacturaempresa.getnombre());	
				estadofisicofacturaempresaAux.setes_pendiente(this.estadofisicofacturaempresa.getes_pendiente());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresas();//WithConnection
						//estadofisicofacturaempresaLogic.getSetVersionRowEstadoFisicoFacturaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofisicofacturaempresa,estadofisicofacturaempresaAux);
					
					this.refrescarForeignKeysDescripcionesEstadoFisicoFacturaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas().addAll(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturas.addAll(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresaRelaciones(estadofisicofacturaempresaAux,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());//WithConnection
								//estadofisicofacturaempresaLogic.getSetVersionRowEstadoFisicoFacturaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadofisicofacturaempresa,estadofisicofacturaempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(new ArrayList<Factura>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturas= new ArrayList<Factura>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadofisicofacturaempresaAux.setFacturas(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadofisicofacturaempresa,estadofisicofacturaempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadofisicofacturaempresaAux=new  EstadoFisicoFacturaEmpresa();
				
				estadofisicofacturaempresaAux.setIsNew(false);
				estadofisicofacturaempresaAux.setIsChanged(false);
				
				estadofisicofacturaempresaAux.setIsDeleted(true);
				
				estadofisicofacturaempresaAux.setId(this.estadofisicofacturaempresa.getId());	
				estadofisicofacturaempresaAux.setVersionRow(this.estadofisicofacturaempresa.getVersionRow());	
				estadofisicofacturaempresaAux.setid_empresa(this.estadofisicofacturaempresa.getid_empresa());	
				estadofisicofacturaempresaAux.setcodigo(this.estadofisicofacturaempresa.getcodigo());	
				estadofisicofacturaempresaAux.setnombre(this.estadofisicofacturaempresa.getnombre());	
				estadofisicofacturaempresaAux.setes_pendiente(this.estadofisicofacturaempresa.getes_pendiente());	
				
				if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadofisicofacturaempresaAux.getId()>=0) {	
						this.estadofisicofacturaempresasEliminados.add(estadofisicofacturaempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresas();//WithConnection
						//estadofisicofacturaempresaLogic.getSetVersionRowEstadoFisicoFacturaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas().addAll(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturas.addAll(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jInternalFrameDetalleFormFactura.detallefacturaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresaRelaciones(estadofisicofacturaempresaAux,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());//WithConnection
								//estadofisicofacturaempresaLogic.getSetVersionRowEstadoFisicoFacturaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(new ArrayList<Factura>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturas= new ArrayList<Factura>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadofisicofacturaempresaAux.setFacturas(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadofisicofacturaempresaAux,estadofisicofacturaempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().addAll(this.estadofisicofacturaempresasEliminados);
					
					estadofisicofacturaempresaLogic.saveEstadoFisicoFacturaEmpresas();//WithConnection
					//estadofisicofacturaempresaLogic.getSetVersionRowEstadoFisicoFacturaEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEstadoFisicoFacturaEmpresa();
				
				this.estadofisicofacturaempresasEliminados= new ArrayList<EstadoFisicoFacturaEmpresa>();		
			}
			
			if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Fisico Factura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadofisicofacturaempresa=estadofisicofacturaempresaAux;
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
      		//this.finishProcessEstadoFisicoFacturaEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal) throws Exception {
		
		if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadofisicofacturaempresaLocal.setFacturas(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
			
			} else {
			
				estadofisicofacturaempresaLocal.setFacturas(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal) throws Exception {	
		if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				estadofisicofacturaempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadoFisicoFacturaEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadofisicofacturaempresaValidator.getInvalidValues(this.estadofisicofacturaempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas) throws Exception {
		try	{		
			EstadoFisicoFacturaEmpresaConstantesFunciones.actualizarLista(estadofisicofacturaempresa,estadofisicofacturaempresas,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas) throws Exception {
		try	{			
			EstadoFisicoFacturaEmpresaConstantesFunciones.actualizarSelectedLista(estadofisicofacturaempresa,estadofisicofacturaempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadofisicofacturaempresasLocal=this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadofisicofacturaempresasLocal=this.estadofisicofacturaempresas;
			}
			//ARCHITECTURE
		
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal:estadofisicofacturaempresasLocal) {
				if(this.permiteMantenimiento(estadofisicofacturaempresaLocal) && estadofisicofacturaempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoFisicoFacturaEmpresaConstantesFunciones.getEstadoFisicoFacturaEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoFisicoFacturaEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelid_empresaEstadoFisicoFacturaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoFisicoFacturaEmpresaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelcodigoEstadoFisicoFacturaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoFisicoFacturaEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelnombreEstadoFisicoFacturaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoFisicoFacturaEmpresaConstantesFunciones.ESPENDIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabeles_pendienteEstadoFisicoFacturaEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelid_empresaEstadoFisicoFacturaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelcodigoEstadoFisicoFacturaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelnombreEstadoFisicoFacturaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabeles_pendienteEstadoFisicoFacturaEmpresa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Factura")) {
			if(this.estadofisicofacturaempresa==null) {
				this.estadofisicofacturaempresa= new EstadoFisicoFacturaEmpresa();
			}

			if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoFisicoFacturaEmpresa
				this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);

				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.getfactura().setEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoFisicoFacturaEmpresa--;	
		
		
		this.estadofisicofacturaempresaAux=new EstadoFisicoFacturaEmpresa();
		
		this.estadofisicofacturaempresaAux.setId(this.iIdNuevoEstadoFisicoFacturaEmpresa);
		this.estadofisicofacturaempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().add(this.estadofisicofacturaempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadofisicofacturaempresas.add(this.estadofisicofacturaempresaAux);
		}
		//ARCHITECTURE
		
		this.estadofisicofacturaempresa=this.estadofisicofacturaempresaAux;
		
		if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
		}
				
		//this.setDefaultControlesEstadoFisicoFacturaEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoFisicoFacturaEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoFisicoFacturaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFisicoFacturaEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaBean,this.estadofisicofacturaempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
			classes=EstadoFisicoFacturaEmpresaConstantesFunciones.getClassesRelationshipsOfEstadoFisicoFacturaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadofisicofacturaempresaReturnGeneral=estadofisicofacturaempresaLogic.procesarEventosEstadoFisicoFacturaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas(),this.estadofisicofacturaempresa,this.estadofisicofacturaempresaParameterGeneral,this.isEsNuevoEstadoFisicoFacturaEmpresa,classes);//this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral,this.estadofisicofacturaempresaBean,false);
		
		if(this.estadofisicofacturaempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa());
		}
		
		if(this.estadofisicofacturaempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa(),classes);//this.estadofisicofacturaempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoFisicoFacturaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoFisicoFacturaEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.RecargarFormEstadoFisicoFacturaEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
						
			if(estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado() && FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFisicoFacturaEmpresa();
			}
			
			this.actualizarVisualTableDatosEstadoFisicoFacturaEmpresa();
			
			this.jTableDatosEstadoFisicoFacturaEmpresa.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFacturaEmpresa(), this.getIndiceNuevoEstadoFisicoFacturaEmpresa());
			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.setEnabled(isHabilitar && this.estadofisicofacturaempresaConstantesFunciones.activarcodigoEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.setEnabled(isHabilitar && this.estadofisicofacturaempresaConstantesFunciones.activarnombreEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setEnabled(isHabilitar && this.estadofisicofacturaempresaConstantesFunciones.activares_pendienteEstadoFisicoFacturaEmpresa);	
		//
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setEnabled(isHabilitar && this.estadofisicofacturaempresaConstantesFunciones.activarid_empresaEstadoFisicoFacturaEmpresa);
	};
	
	public void setDefaultControlesEstadoFisicoFacturaEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoFisicoFacturaEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadofisicofacturaempresaSessionBean.setConGuardarRelaciones(true);			
			this.estadofisicofacturaempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadofisicofacturaempresaSessionBean.setConGuardarRelaciones(false);			
			this.estadofisicofacturaempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoFisicoFacturaEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
				if(estadofisicofacturaempresaAux.getId().equals(this.iIdNuevoEstadoFisicoFacturaEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresas) {
				if(estadofisicofacturaempresaAux.getId().equals(this.iIdNuevoEstadoFisicoFacturaEmpresa)) {
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
	
	public int getIndiceActualEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
				if(estadofisicofacturaempresaAux.getId().equals(estadofisicofacturaempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresas) {
				if(estadofisicofacturaempresaAux.getId().equals(estadofisicofacturaempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
				if(estadofisicofacturaempresaAux.getEstadoFisicoFacturaEmpresaOriginal().getId().equals(estadofisicofacturaempresaOriginal.getId())) {
					existe=true;
					estadofisicofacturaempresaOriginal.setId(estadofisicofacturaempresaAux.getId());
					estadofisicofacturaempresaOriginal.setVersionRow(estadofisicofacturaempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresas) {
				if(estadofisicofacturaempresaAux.getEstadoFisicoFacturaEmpresaOriginal().getId().equals(estadofisicofacturaempresaOriginal.getId())) {
					existe=true;
					estadofisicofacturaempresaOriginal.setId(estadofisicofacturaempresaAux.getId());
					estadofisicofacturaempresaOriginal.setVersionRow(estadofisicofacturaempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoFisicoFacturaEmpresa(Boolean esParaCancelar) throws Exception {
		estadofisicofacturaempresasAux=new ArrayList<EstadoFisicoFacturaEmpresa>();
		estadofisicofacturaempresaAux=new EstadoFisicoFacturaEmpresa();
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
					if(estadofisicofacturaempresaAux.getId()<0) {
						estadofisicofacturaempresasAux.add(estadofisicofacturaempresaAux);
					}		
				}
				this.iIdNuevoEstadoFisicoFacturaEmpresa=0L;
				this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().removeAll(estadofisicofacturaempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresas) {
					if(estadofisicofacturaempresaAux.getId()<0) {
						estadofisicofacturaempresasAux.add(estadofisicofacturaempresaAux);
					}		
				}
				this.iIdNuevoEstadoFisicoFacturaEmpresa=0L;
				this.estadofisicofacturaempresas.removeAll(estadofisicofacturaempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoFisicoFacturaEmpresa 
					&& this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size()>0
					) {
					estadofisicofacturaempresaAux=this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().get(this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size() - 1);
				
					if(estadofisicofacturaempresaAux.getId()<0) {
						this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().remove(estadofisicofacturaempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoFisicoFacturaEmpresa && this.estadofisicofacturaempresas.size()>0) {
					estadofisicofacturaempresaAux=this.estadofisicofacturaempresas.get(this.estadofisicofacturaempresas.size() - 1);
				
					if(estadofisicofacturaempresaAux.getId()<0) {
						this.estadofisicofacturaempresas.remove(estadofisicofacturaempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoFisicoFacturaEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadofisicofacturaempresa.getId()<0) {
				this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().remove(this.estadofisicofacturaempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadofisicofacturaempresa.getId()<0) {
				this.estadofisicofacturaempresas.remove(this.estadofisicofacturaempresa);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoFisicoFacturaEmpresa(List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasAux) throws Exception {
		EstadoFisicoFacturaEmpresaConstantesFunciones.setEstadosInicialesEstadoFisicoFacturaEmpresa(estadofisicofacturaempresasAux);
	}
	
	public void setEstadosInicialesEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux) throws Exception {
		EstadoFisicoFacturaEmpresaConstantesFunciones.setEstadosInicialesEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoFisicoFacturaEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoFisicoFacturaEmpresaActual()) {
				if(!this.isEsNuevoEstadoFisicoFacturaEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoFisicoFacturaEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Fisico Factura ?", "MANTENIMIENTO DE Estado Fisico Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa) throws Exception {
		EstadoFisicoFacturaEmpresaConstantesFunciones.seleccionarAsignar(this.estadofisicofacturaempresa,estadofisicofacturaempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoFisicoFacturaEmpresa=this.isPermisoActualizarOriginalEstadoFisicoFacturaEmpresa;
			
			
			this.seleccionarAsignar(estadofisicofacturaempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoFisicoFacturaEmpresaConstantesFunciones.quitarEspaciosEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadofisicofacturaempresaSessionBean.setsFuncionBusquedaRapida(this.estadofisicofacturaempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoFisicoFacturaEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoFisicoFacturaEmpresa(esParaCancelar);				
				this.cancelarNuevoEstadoFisicoFacturaEmpresa(esParaCancelar);								
			}
			
			this.estadofisicofacturaempresa=new EstadoFisicoFacturaEmpresa();
			
			this.inicializarEstadoFisicoFacturaEmpresa();
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoFisicoFacturaEmpresa() throws Exception {
		try {
			EstadoFisicoFacturaEmpresaConstantesFunciones.inicializarEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoFisicoFacturaEmpresas(String sAccionBusqueda,List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoFisicoFacturaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoFisicoFacturaEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoFisicoFacturaEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoFisicoFacturaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Fisico Facturas");		
		parameters.put("busquedapor", EstadoFisicoFacturaEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Factura.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoFisicoFacturaEmpresaLogic estadofisicofacturaempresaLogicAuxiliar=new EstadoFisicoFacturaEmpresaLogic();
					estadofisicofacturaempresaLogicAuxiliar.setDatosCliente(estadofisicofacturaempresaLogic.getDatosCliente());				
					estadofisicofacturaempresaLogicAuxiliar.setEstadoFisicoFacturaEmpresas(estadofisicofacturaempresasParaReportes);
					
					estadofisicofacturaempresaLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoFisicoFacturaEmpresaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadofisicofacturaempresasParaReportes=estadofisicofacturaempresaLogicAuxiliar.getEstadoFisicoFacturaEmpresas();
					
					//estadofisicofacturaempresaLogic.getNewConnexionToDeep();
					
					//for (EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresasParaReportes) {
					//	estadofisicofacturaempresaLogic.deepLoad(estadofisicofacturaempresa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFactura = AuxiliarReportes.class.getResourceAsStream("FacturaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_factura", reportFileFactura);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoFisicoFacturaEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoFisicoFacturaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoFisicoFacturaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoFisicoFacturaEmpresa=new JRBeanArrayDataSource(EstadoFisicoFacturaEmpresaJInternalFrame.TraerEstadoFisicoFacturaEmpresaBeans(estadofisicofacturaempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoFisicoFacturaEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoFisicoFacturaEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoFisicoFacturaEmpresaBean.TraerEstadoFisicoFacturaEmpresaBeans(estadofisicofacturaempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoFisicoFacturaEmpresas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturaempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoFisicoFacturaEmpresas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturaempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(null);
					//this.generarExcelReporteEstadoFisicoFacturaEmpresas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturaempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoFisicoFacturaEmpresas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturaempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoFisicoFacturaEmpresas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturaempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoFisicoFacturaEmpresas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturaempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoFisicoFacturaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofacturaempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFisicoFacturaEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFisicoFacturaEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa : estadofisicofacturaempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoFisicoFacturaEmpresaConstantesFunciones.generarExcelReporteDataEstadoFisicoFacturaEmpresa("NORMAL",row,workbook,estadofisicofacturaempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoFisicoFacturaEmpresa(String sTipo,Row row,Workbook workbook) {
		
		EstadoFisicoFacturaEmpresaConstantesFunciones.generarExcelReporteHeaderEstadoFisicoFacturaEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoFisicoFacturaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofacturaempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFisicoFacturaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa : estadofisicofacturaempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.getEstadoFisicoFacturaEmpresaDescripcion(estadofisicofacturaempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofisicofacturaempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofisicofacturaempresa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofisicofacturaempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(estadofisicofacturaempresa.getes_pendiente()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoFisicoFacturaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasRespaldo=null;
		
		classes=EstadoFisicoFacturaEmpresaConstantesFunciones.getClassesRelationshipsOfEstadoFisicoFacturaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadofisicofacturaempresaLogic.setDatosCliente(this.datosCliente);
		this.estadofisicofacturaempresaLogic.setDatosDeep(this.datosDeep);
		this.estadofisicofacturaempresaLogic.setIsConDeep(true);
		
		estadofisicofacturaempresasRespaldo=this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas();
		
		this.estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresas(estadofisicofacturaempresasParaReportes);	
		this.estadofisicofacturaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadofisicofacturaempresasParaReportes=this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas();
		this.estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresas(estadofisicofacturaempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofacturaempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFisicoFacturaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFisicoFacturaEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa : estadofisicofacturaempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoFisicoFacturaEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoFisicoFacturaEmpresaConstantesFunciones.generarExcelReporteDataEstadoFisicoFacturaEmpresa("NORMAL",row,workbook,estadofisicofacturaempresa,cellStyleDataAux);
		
			
			


				//Factura
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadofisicofacturaempresa.getFacturas()!=null && estadofisicofacturaempresa.getFacturas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaConstantesFunciones.generarExcelReporteHeaderFactura("RELACIONADO",row,workbook);
				}

				if(estadofisicofacturaempresa.getFacturas()!=null) {
					i2=0;
					for(Factura factura : estadofisicofacturaempresa.getFacturas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaConstantesFunciones.generarExcelReporteDataFactura("RELACIONADO",row,workbook,factura,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.getEstadoFisicoFacturaEmpresaDescripcion(estadofisicofacturaempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoFisicoFacturaEmpresa() throws Exception {		
		this.startProcessEstadoFisicoFacturaEmpresa(true);
	}
	
	public void startProcessEstadoFisicoFacturaEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa ,this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa, this.jScrollPanelDatosEstadoFisicoFacturaEmpresa,this.jPanelPaginacionEstadoFisicoFacturaEmpresa, this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa, this.jPanelAccionesEstadoFisicoFacturaEmpresa,this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa,this.jmenuBarEstadoFisicoFacturaEmpresa,this.jmenuBarDetalleEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa=this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa; 
		
		final JPanel jPanelParametrosReportesEstadoFisicoFacturaEmpresa=this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa;
		//final JScrollPane jScrollPanelDatosEstadoFisicoFacturaEmpresa=this.jScrollPanelDatosEstadoFisicoFacturaEmpresa;
		final JTable jTableDatosEstadoFisicoFacturaEmpresa=this.jTableDatosEstadoFisicoFacturaEmpresa;		
		final JPanel jPanelPaginacionEstadoFisicoFacturaEmpresa=this.jPanelPaginacionEstadoFisicoFacturaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa=this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa;
		final JPanel jPanelAccionesEstadoFisicoFacturaEmpresa=this.jPanelAccionesEstadoFisicoFacturaEmpresa;
		
		JPanel jPanelCamposAuxiliarEstadoFisicoFacturaEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFisicoFacturaEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			jPanelCamposAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelCamposEstadoFisicoFacturaEmpresa;
			jPanelAccionesFormularioAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa;
		}
		
		final JPanel jPanelCamposEstadoFisicoFacturaEmpresa=jPanelCamposAuxiliarEstadoFisicoFacturaEmpresa;
		final JPanel jPanelAccionesFormularioEstadoFisicoFacturaEmpresa=jPanelAccionesFormularioAuxiliarEstadoFisicoFacturaEmpresa;
		
		
		final JMenuBar jmenuBarEstadoFisicoFacturaEmpresa=this.jmenuBarEstadoFisicoFacturaEmpresa;
		final JToolBar jTtoolBarEstadoFisicoFacturaEmpresa=this.jTtoolBarEstadoFisicoFacturaEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			jmenuBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jmenuBarDetalleEstadoFisicoFacturaEmpresa;
			jTtoolBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTtoolBarDetalleEstadoFisicoFacturaEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleEstadoFisicoFacturaEmpresa=jmenuBarDetalleAuxiliarEstadoFisicoFacturaEmpresa;
		final JToolBar jTtoolBarDetalleEstadoFisicoFacturaEmpresa=jTtoolBarDetalleAuxiliarEstadoFisicoFacturaEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFisicoFacturaEmpresa;
			processRunnable.jTableDatos=jTableDatosEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFisicoFacturaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFisicoFacturaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFisicoFacturaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarEstadoFisicoFacturaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFisicoFacturaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa ,jPanelParametrosReportesEstadoFisicoFacturaEmpresa,jTableDatosEstadoFisicoFacturaEmpresa, /*jScrollPanelDatosEstadoFisicoFacturaEmpresa,*/jPanelCamposEstadoFisicoFacturaEmpresa,jPanelPaginacionEstadoFisicoFacturaEmpresa, /*jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa,*/ jPanelAccionesEstadoFisicoFacturaEmpresa,jPanelAccionesFormularioEstadoFisicoFacturaEmpresa,jmenuBarEstadoFisicoFacturaEmpresa,jmenuBarDetalleEstadoFisicoFacturaEmpresa,jTtoolBarEstadoFisicoFacturaEmpresa,jTtoolBarDetalleEstadoFisicoFacturaEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa ,jPanelParametrosReportesEstadoFisicoFacturaEmpresa, jScrollPanelDatosEstadoFisicoFacturaEmpresa,jPanelPaginacionEstadoFisicoFacturaEmpresa, jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa, jPanelAccionesEstadoFisicoFacturaEmpresa,jPanelAccionesFormularioEstadoFisicoFacturaEmpresa,jmenuBarEstadoFisicoFacturaEmpresa,jmenuBarDetalleEstadoFisicoFacturaEmpresa,jTtoolBarEstadoFisicoFacturaEmpresa,jTtoolBarDetalleEstadoFisicoFacturaEmpresa);
						
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
	
	public void finishProcessEstadoFisicoFacturaEmpresa() {// throws Exception 
		this.finishProcessEstadoFisicoFacturaEmpresa(true);
	}
	
	public void finishProcessEstadoFisicoFacturaEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa ,this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa, this.jScrollPanelDatosEstadoFisicoFacturaEmpresa,this.jPanelPaginacionEstadoFisicoFacturaEmpresa, this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa, this.jPanelAccionesEstadoFisicoFacturaEmpresa,this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa,this.jmenuBarEstadoFisicoFacturaEmpresa,this.jmenuBarDetalleEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa=this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa; 
		
		final JPanel jPanelParametrosReportesEstadoFisicoFacturaEmpresa=this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa;
		//final JScrollPane jScrollPanelDatosEstadoFisicoFacturaEmpresa=this.jScrollPanelDatosEstadoFisicoFacturaEmpresa;
		final JTable jTableDatosEstadoFisicoFacturaEmpresa=this.jTableDatosEstadoFisicoFacturaEmpresa;		
		final JPanel jPanelPaginacionEstadoFisicoFacturaEmpresa=this.jPanelPaginacionEstadoFisicoFacturaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa=this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa;
		final JPanel jPanelAccionesEstadoFisicoFacturaEmpresa=this.jPanelAccionesEstadoFisicoFacturaEmpresa;
		
		JPanel jPanelCamposAuxiliarEstadoFisicoFacturaEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFisicoFacturaEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			jPanelCamposAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelCamposEstadoFisicoFacturaEmpresa;
			jPanelAccionesFormularioAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa;
		}
		
		final JPanel jPanelCamposEstadoFisicoFacturaEmpresa=jPanelCamposAuxiliarEstadoFisicoFacturaEmpresa;
		final JPanel jPanelAccionesFormularioEstadoFisicoFacturaEmpresa=jPanelAccionesFormularioAuxiliarEstadoFisicoFacturaEmpresa;
		
		
		final JMenuBar jmenuBarEstadoFisicoFacturaEmpresa=this.jmenuBarEstadoFisicoFacturaEmpresa;		
		final JToolBar jTtoolBarEstadoFisicoFacturaEmpresa=this.jTtoolBarEstadoFisicoFacturaEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			jmenuBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jmenuBarDetalleEstadoFisicoFacturaEmpresa;
			jTtoolBarDetalleAuxiliarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTtoolBarDetalleEstadoFisicoFacturaEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoFisicoFacturaEmpresa=jmenuBarDetalleAuxiliarEstadoFisicoFacturaEmpresa;
		final JToolBar jTtoolBarDetalleEstadoFisicoFacturaEmpresa=jTtoolBarDetalleAuxiliarEstadoFisicoFacturaEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFisicoFacturaEmpresa;
			processRunnable.jTableDatos=jTableDatosEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFisicoFacturaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFisicoFacturaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFisicoFacturaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFisicoFacturaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarEstadoFisicoFacturaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFisicoFacturaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa ,jPanelParametrosReportesEstadoFisicoFacturaEmpresa, jTableDatosEstadoFisicoFacturaEmpresa,/*jScrollPanelDatosEstadoFisicoFacturaEmpresa,*/jPanelCamposEstadoFisicoFacturaEmpresa,jPanelPaginacionEstadoFisicoFacturaEmpresa, /*jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa,*/ jPanelAccionesEstadoFisicoFacturaEmpresa,jPanelAccionesFormularioEstadoFisicoFacturaEmpresa,jmenuBarEstadoFisicoFacturaEmpresa,jmenuBarDetalleEstadoFisicoFacturaEmpresa,jTtoolBarEstadoFisicoFacturaEmpresa,jTtoolBarDetalleEstadoFisicoFacturaEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoFisicoFacturaEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoFisicoFacturaEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoFisicoFacturaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoFisicoFacturaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoFisicoFacturaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoFisicoFacturaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoFisicoFacturaEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadofisicofacturaempresaConstantesFunciones.getsFinalQueryEstadoFisicoFacturaEmpresa();
		String  finalQueryPaginacionTodos=this.estadofisicofacturaempresaConstantesFunciones.getsFinalQueryEstadoFisicoFacturaEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoFisicoFacturaEmpresaConstantesFunciones.getArrayColumnasGlobalesNoEstadoFisicoFacturaEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoFisicoFacturaEmpresaConstantesFunciones.getArrayColumnasGlobalesEstadoFisicoFacturaEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoFisicoFacturaEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadofisicofacturaempresasEliminados= new ArrayList<EstadoFisicoFacturaEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoFisicoFacturaEmpresa();
		
				///*EstadoFisicoFacturaEmpresaSessionBean*/this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
			
			if(this.estadofisicofacturaempresaSessionBean==null) {
				this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
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
					this.iNumeroPaginacion=EstadoFisicoFacturaEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoFisicoFacturaEmpresaConstantesFunciones.getClassesForeignKeysOfEstadoFisicoFacturaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadofisicofacturaempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadofisicofacturaempresasAux= new ArrayList<EstadoFisicoFacturaEmpresa>();
			
				
			estadofisicofacturaempresaLogic.setDatosCliente(this.datosCliente);
			estadofisicofacturaempresaLogic.setDatosDeep(this.datosDeep);
			estadofisicofacturaempresaLogic.setIsConDeep(true);
			
			
			estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadofisicofacturaempresaLogic.getTodosEstadoFisicoFacturaEmpresas(finalQueryGlobal,pagination);
					
					//estadofisicofacturaempresaLogic.getTodosEstadoFisicoFacturaEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()==null|| estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofisicofacturaempresasAux= new ArrayList<EstadoFisicoFacturaEmpresa>();
							estadofisicofacturaempresasAux.addAll(estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturaempresasAux= new ArrayList<EstadoFisicoFacturaEmpresa>();
							estadofisicofacturaempresasAux.addAll(estadofisicofacturaempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofisicofacturaempresaLogic.getTodosEstadoFisicoFacturaEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//estadofisicofacturaempresaLogic.getTodosEstadoFisicoFacturaEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresas(new ArrayList<EstadoFisicoFacturaEmpresa>());					
							estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().addAll(estadofisicofacturaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturaempresas=new ArrayList<EstadoFisicoFacturaEmpresa>();
							estadofisicofacturaempresas.addAll(estadofisicofacturaempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoFisicoFacturaEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoFisicoFacturaEmpresa=this.idActual;
				
				} else if(this.idEstadoFisicoFacturaEmpresaActual!=null && this.idEstadoFisicoFacturaEmpresaActual!=0L) {
					idEstadoFisicoFacturaEmpresa=idEstadoFisicoFacturaEmpresaActual;
				}
				
					
				this.sDetalleReporte=EstadoFisicoFacturaEmpresaConstantesFunciones.getDetalleIndicePorId(idEstadoFisicoFacturaEmpresa);
				
				this.estadofisicofacturaempresas=new ArrayList<EstadoFisicoFacturaEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadofisicofacturaempresaLogic.getEntity(idEstadoFisicoFacturaEmpresa);
					
					//estadofisicofacturaempresaLogic.getEntityWithConnection(idEstadoFisicoFacturaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresas(new ArrayList<EstadoFisicoFacturaEmpresa>());
					estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().add(estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofisicofacturaempresas=new ArrayList<EstadoFisicoFacturaEmpresa>();
					this.estadofisicofacturaempresas.add(estadofisicofacturaempresa);
				}
				
				if(estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EstadoFisicoFacturaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoFisicoFacturaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoFisicoFacturaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()==null||estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadofisicofacturaempresas==null|| estadofisicofacturaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaempresasAux=new ArrayList<EstadoFisicoFacturaEmpresa>();
						estadofisicofacturaempresasAux.addAll(estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturaempresasAux=new ArrayList<EstadoFisicoFacturaEmpresa>();
							estadofisicofacturaempresasAux.addAll(estadofisicofacturaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoFisicoFacturaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoFisicoFacturaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadoFisicoFacturaEmpresas("FK_IdEmpresa",estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadoFisicoFacturaEmpresas("FK_IdEmpresa",estadofisicofacturaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresas(new ArrayList<EstadoFisicoFacturaEmpresa>());
						estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().addAll(estadofisicofacturaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturaempresas=new ArrayList<EstadoFisicoFacturaEmpresa>();
							estadofisicofacturaempresas.addAll(estadofisicofacturaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoFisicoFacturaEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoFisicoFacturaEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofisicofacturaempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofisicofacturaempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa) {
		Boolean permite=true;
		
		if(this.estadofisicofacturaempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoFisicoFacturaEmpresaConstantesFunciones.getOrderByListaEstadoFisicoFacturaEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoFisicoFacturaEmpresaConstantesFunciones.getOrderByListaEstadoFisicoFacturaEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
				if(estadofisicofacturaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaempresaTotales=estadofisicofacturaempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:this.estadofisicofacturaempresas) {
				if(estadofisicofacturaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaempresaTotales=estadofisicofacturaempresa;
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
			this.estadofisicofacturaempresaAux=new EstadoFisicoFacturaEmpresa();
			this.estadofisicofacturaempresaAux.setsType(Constantes2.S_TOTALES);
			this.estadofisicofacturaempresaAux.setIsNew(false);
			this.estadofisicofacturaempresaAux.setIsChanged(false);
			this.estadofisicofacturaempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoFisicoFacturaEmpresaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas(),this.estadofisicofacturaempresaAux);
				
				this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().add(this.estadofisicofacturaempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoFisicoFacturaEmpresaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresas,this.estadofisicofacturaempresaAux);
				
				this.estadofisicofacturaempresas.add(this.estadofisicofacturaempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadofisicofacturaempresaTotales=new EstadoFisicoFacturaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().remove(estadofisicofacturaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofisicofacturaempresas.remove(estadofisicofacturaempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadofisicofacturaempresaTotales=new EstadoFisicoFacturaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
				if(estadofisicofacturaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaempresaTotales=estadofisicofacturaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFisicoFacturaEmpresaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas(),estadofisicofacturaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:this.estadofisicofacturaempresas) {
				if(estadofisicofacturaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaempresaTotales=estadofisicofacturaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFisicoFacturaEmpresaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresas,estadofisicofacturaempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoFisicoFacturaEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEstadoFisicoFacturaEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEstadoFisicoFacturaEmpresa() {
		this.isPermisoTodoEstadoFisicoFacturaEmpresa=false;
		this.isPermisoNuevoEstadoFisicoFacturaEmpresa=false;
		this.isPermisoActualizarEstadoFisicoFacturaEmpresa=false;
		this.isPermisoActualizarOriginalEstadoFisicoFacturaEmpresa=false;
		this.isPermisoEliminarEstadoFisicoFacturaEmpresa=false;
		this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa=false;
		this.isPermisoConsultaEstadoFisicoFacturaEmpresa=false;
		this.isPermisoBusquedaEstadoFisicoFacturaEmpresa=false;
		this.isPermisoReporteEstadoFisicoFacturaEmpresa=false;		
		this.isPermisoOrdenEstadoFisicoFacturaEmpresa=false;		
		this.isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa=false;		
		this.isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa=false;
		this.isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa=false;
		this.isPermisoCopiarEstadoFisicoFacturaEmpresa=false;		
		this.isPermisoVerFormEstadoFisicoFacturaEmpresa=false;		
		this.isPermisoDuplicarEstadoFisicoFacturaEmpresa=false;		
		this.isPermisoOrdenEstadoFisicoFacturaEmpresa=false;		
	}
	
	public void setPermisosUsuarioEstadoFisicoFacturaEmpresa(Boolean isPermiso) {
		this.isPermisoTodoEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoNuevoEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoActualizarEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoEliminarEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoConsultaEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoBusquedaEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoReporteEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoOrdenEstadoFisicoFacturaEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa=isPermiso;		
		this.isPermisoCopiarEstadoFisicoFacturaEmpresa=isPermiso;		
		this.isPermisoVerFormEstadoFisicoFacturaEmpresa=isPermiso;		
		this.isPermisoDuplicarEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoOrdenEstadoFisicoFacturaEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoFisicoFacturaEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoNuevoEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoActualizarEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoEliminarEstadoFisicoFacturaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa=isPermiso;
		//this.isPermisoConsultaEstadoFisicoFacturaEmpresa=isPermiso;
		//this.isPermisoBusquedaEstadoFisicoFacturaEmpresa=isPermiso;
		//this.isPermisoReporteEstadoFisicoFacturaEmpresa=isPermiso;
		//this.isPermisoOrdenEstadoFisicoFacturaEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa=isPermiso;		
		//this.isPermisoCopiarEstadoFisicoFacturaEmpresa=isPermiso;		
		//this.isPermisoDuplicarEstadoFisicoFacturaEmpresa=isPermiso;
		//this.isPermisoOrdenEstadoFisicoFacturaEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFisicoFacturaEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FacturaConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFactura=false;
		this.isTienePermisosFactura=this.verificarGetPermisosUsuarioOpcionEstadoFisicoFacturaEmpresaClaseRelacionada(this.opcionsRelacionadas,FacturaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoFisicoFacturaEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFisicoFacturaEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFactura=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoFisicoFacturaEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoFisicoFacturaEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoFisicoFacturaEmpresaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFactura && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.remove(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoFisicoFacturaEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoFisicoFacturaEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoFisicoFacturaEmpresa=this.isPermisoActualizarEstadoFisicoFacturaEmpresa;
			this.isPermisoEliminarEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoFisicoFacturaEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFisicoFacturaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoFisicoFacturaEmpresa.setToolTipText(this.jTableDatosEstadoFisicoFacturaEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoFisicoFacturaEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoFisicoFacturaEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoFisicoFacturaEmpresa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFactura && this.estadofisicofacturaempresaConstantesFunciones.mostrarFacturaEstadoFisicoFacturaEmpresa && !EstadoFisicoFacturaEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura");
			reporte.setsDescripcion("Factura");
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
	public void inicializarCombosForeignKeyEstadoFisicoFacturaEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoFisicoFacturaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoFisicoFacturaEmpresaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEstadoFisicoFacturaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EstadoFisicoFacturaEmpresaParameterReturnGeneral estadofisicofacturaempresaReturnGeneral=new EstadoFisicoFacturaEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.estadofisicofacturaempresaConstantesFunciones.cargarid_empresaEstadoFisicoFacturaEmpresa)
					 || (this.esRecargarFks && this.estadofisicofacturaempresaConstantesFunciones.cargarid_empresaEstadoFisicoFacturaEmpresa)) {

					if(!this.estadofisicofacturaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+estadofisicofacturaempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				estadofisicofacturaempresaReturnGeneral=estadofisicofacturaempresaLogic.cargarCombosLoteForeignKeyEstadoFisicoFacturaEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=estadofisicofacturaempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.estadofisicofacturaempresaSessionBean==null) {
				this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
			}

			if(!this.estadofisicofacturaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoFisicoFacturaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFisicoFacturaEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoFisicoFacturaEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoFisicoFacturaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoFisicoFacturaEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean(); 
		this.estadofisicofacturaempresaConstantesFunciones=new EstadoFisicoFacturaEmpresaConstantesFunciones(); 
		this.estadofisicofacturaempresaBean=new EstadoFisicoFacturaEmpresa();//(this.estadofisicofacturaempresaConstantesFunciones); 		
		this.estadofisicofacturaempresaReturnGeneral=new EstadoFisicoFacturaEmpresaParameterReturnGeneral(); 
		
		this.estadofisicofacturaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofisicofacturaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoFisicoFacturaEmpresa(true);
			
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
			
			this.estadofisicofacturaempresaConstantesFunciones=new EstadoFisicoFacturaEmpresaConstantesFunciones(); 
			this.estadofisicofacturaempresaBean=new EstadoFisicoFacturaEmpresa();//this.estadofisicofacturaempresaConstantesFunciones); 			
			this.estadofisicofacturaempresaReturnGeneral=new EstadoFisicoFacturaEmpresaParameterReturnGeneral(); 
		
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Fisico Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadofisicofacturaempresa=new EstadoFisicoFacturaEmpresa();
			this.estadofisicofacturaempresas = new ArrayList<EstadoFisicoFacturaEmpresa>();
			this.estadofisicofacturaempresasAux = new ArrayList<EstadoFisicoFacturaEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic=new EstadoFisicoFacturaEmpresaLogic();
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estadofisicofacturaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadofisicofacturaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa);	
					}
					
					if(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa);
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa);
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa);
					this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setVisible(false);
					this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa);
					this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setVisible(false);
					this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoFisicoFacturaEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoFisicoFacturaEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadofisicofacturaempresaReturnGeneral=new EstadoFisicoFacturaEmpresaParameterReturnGeneral();
			
			this.estadofisicofacturaempresaParameterGeneral=new EstadoFisicoFacturaEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadofisicofacturaempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FacturaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFisicoFacturaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado(),this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFisicoFacturaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado(),this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoFisicoFacturaEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoFisicoFacturaEmpresa(false);
			
			this.setPermisosUsuarioEstadoFisicoFacturaEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() && this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoFisicoFacturaEmpresaClasesRelacionadas();
			}
			
			if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoFisicoFacturaEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoFisicoFacturaEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoFisicoFacturaEmpresa();
			}
			
			if(!this.isPermisoBusquedaEstadoFisicoFacturaEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa,this.isPermisoPaginacionMedioEstadoFisicoFacturaEmpresa,this.isPermisoPaginacionTodoEstadoFisicoFacturaEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoFisicoFacturaEmpresaConstantesFunciones.getTiposSeleccionarEstadoFisicoFacturaEmpresa());
				
				this.tiposColumnasSelect=EstadoFisicoFacturaEmpresaConstantesFunciones.getTiposSeleccionarEstadoFisicoFacturaEmpresa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoFisicoFacturaEmpresa();				
				//this.tiposRelacionesSelect=EstadoFisicoFacturaEmpresaConstantesFunciones.getTiposRelacionesEstadoFisicoFacturaEmpresa(true);
				
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
			//if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoFisicoFacturaEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEstadoFisicoFacturaEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEstadoFisicoFacturaEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFacturaEmpresa() ;
			
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
			
			
			this.facturaLogic=new FacturaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadofisicofacturaempresaImplementable= (EstadoFisicoFacturaEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFisicoFacturaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadofisicofacturaempresaImplementableHome= (EstadoFisicoFacturaEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFisicoFacturaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadofisicofacturaempresas= new ArrayList<EstadoFisicoFacturaEmpresa>();
			this.estadofisicofacturaempresasEliminados= new ArrayList<EstadoFisicoFacturaEmpresa>();
						
			this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
			this.esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoFisicoFacturaEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoFisicoFacturaEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoFisicoFacturaEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoFisicoFacturaEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoFisicoFacturaEmpresa();
			}
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoFisicoFacturaEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoFisicoFacturaEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoFisicoFacturaEmpresa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FacturaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoFisicoFacturaEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();	
				
				

				if(sTitle.equals("Facturas")) {
					if(!FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoFisicoFacturaEmpresa();

						this.cargarParteTabPanelRelacionadaFactura(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoFisicoFacturaEmpresa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFactura(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.cargarSessionConBeanSwingJInternalFrameFactura(false,true,iIndex);
		this.jButtonFacturaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFactura();

		//this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.updateUI();
		//this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Factura")) {
				int row=this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
				jButtonFacturaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Factura")) {

					if(this.isTienePermisosFactura && this.estadofisicofacturaempresaConstantesFunciones.mostrarFacturaEstadoFisicoFacturaEmpresa && !EstadoFisicoFacturaEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Facturas"+"("+FacturaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Facturas");

						if(estadofisicofacturaempresaConstantesFunciones.resaltarFacturaEstadoFisicoFacturaEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadofisicofacturaempresaConstantesFunciones.resaltarFacturaEstadoFisicoFacturaEmpresa);
						}

						jmenuItem.setEnabled(this.estadofisicofacturaempresaConstantesFunciones.activarFacturaEstadoFisicoFacturaEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Factura"));

						

						this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jmenuDetalleEstadoFisicoFacturaEmpresa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoFisicoFacturaEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoFisicoFacturaEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoFisicoFacturaEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoFisicoFacturaEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoFisicoFacturaEmpresa();
		
		this.cargarCombosFrameForeignKeyEstadoFisicoFacturaEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoFisicoFacturaEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoFisicoFacturaEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
			
			if(jTableDatosEstadoFisicoFacturaEmpresa.getRowCount()>=1) {
				jTableDatosEstadoFisicoFacturaEmpresa.removeRowSelectionInterval(0, jTableDatosEstadoFisicoFacturaEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoFisicoFacturaEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoFisicoFacturaEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(true);			
			//this.estadofisicofacturaempresa=new EstadoFisicoFacturaEmpresa();
			//this.estadofisicofacturaempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa() ;
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFisicoFacturaEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadofisicofacturaempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);				
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
			if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoFisicoFacturaEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRows().length;			
			}
			
			estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoFisicoFacturaEmpresa--;			
				//EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux= new EstadoFisicoFacturaEmpresa();			
				//estadofisicofacturaempresaAux.setId(this.iIdNuevoEstadoFisicoFacturaEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoFisicoFacturaEmpresa estadofisicofacturaempresaOrigen=new EstadoFisicoFacturaEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaOrigen : estadofisicofacturaempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadofisicofacturaempresaOrigen =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturaempresaOrigen =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoFisicoFacturaEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadofisicofacturaempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaOrigen,this.estadofisicofacturaempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().add(this.estadofisicofacturaempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturaempresas.add(this.estadofisicofacturaempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
				
				this.jTableDatosEstadoFisicoFacturaEmpresa.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFacturaEmpresa(), this.getIndiceNuevoEstadoFisicoFacturaEmpresa());
				
				int iLastRow =  this.jTableDatosEstadoFisicoFacturaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFisicoFacturaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFisicoFacturaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();									
		
			EstadoFisicoFacturaEmpresa estadofisicofacturaempresaOrigen=new EstadoFisicoFacturaEmpresa();
			EstadoFisicoFacturaEmpresa estadofisicofacturaempresaDestino=new EstadoFisicoFacturaEmpresa();
				
			estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadofisicofacturaempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaempresaOrigen =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofisicofacturaempresaOrigen =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaempresaDestino =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofisicofacturaempresaDestino =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadofisicofacturaempresaOrigen =estadofisicofacturaempresasSeleccionados.get(0);
				estadofisicofacturaempresaDestino =estadofisicofacturaempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaOrigen,estadofisicofacturaempresaDestino,true,false);
				
				estadofisicofacturaempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofisicofacturaempresaDestino,estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaempresaDestino,estadofisicofacturaempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
				
				//this.jTableDatosEstadoFisicoFacturaEmpresa.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFacturaEmpresa(), this.getIndiceNuevoEstadoFisicoFacturaEmpresa());
				
				int iLastRow =  this.jTableDatosEstadoFisicoFacturaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFisicoFacturaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFisicoFacturaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(!isVisible);
			this.jPanelAccionesEstadoFisicoFacturaEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoFisicoFacturaEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoFisicoFacturaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoFisicoFacturaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoFisicoFacturaEmpresa();
			
			this.abrirFrameOrderByEstadoFisicoFacturaEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoFisicoFacturaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoFisicoFacturaEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setSize(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jContentPaneDetalleEstadoFisicoFacturaEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jContentPaneDetalleEstadoFisicoFacturaEmpresa.getWidth(),EstadoFisicoFacturaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jContentPaneDetalleEstadoFisicoFacturaEmpresa.getWidth(),EstadoFisicoFacturaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jContentPaneDetalleEstadoFisicoFacturaEmpresa.getWidth(),EstadoFisicoFacturaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFactura();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoFisicoFacturaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa);
				this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setVisible(false);
				this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFisicoFacturaEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoFisicoFacturaEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoFisicoFacturaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa==null) {
				
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa=new ImportacionJInternalFrame(EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa);
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setVisible(false);
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setSelected(false);


				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFisicoFacturaEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoFisicoFacturaEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa==null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa=new ReporteDinamicoJInternalFrame(EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa);
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFisicoFacturaEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFactura() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jContentPaneDetalleEstadoFisicoFacturaEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoFisicoFacturaEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa);
			
	       	this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.dispose();
			//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoFisicoFacturaEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoFisicoFacturaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setVisible(true);
	        this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoFisicoFacturaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setVisible(true);
	        this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoFisicoFacturaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setVisible(false);
	        this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoFisicoFacturaEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoFisicoFacturaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setVisible(false);
	        this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoFisicoFacturaEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoFisicoFacturaEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(true);
			//this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(false) ;
			
			if(estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado() && FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFisicoFacturaEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoFisicoFacturaEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(true);
			//this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadofisicofacturaempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(false) ;
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFisicoFacturaEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoFisicoFacturaEmpresa(false);
			
			//if(!this.isEsNuevoEstadoFisicoFacturaEmpresa) {								
				int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				
			}
			
			if(this.permiteMantenimiento(this.estadofisicofacturaempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoFisicoFacturaEmpresa=true;
					this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
					this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoFisicoFacturaEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(false);
				
				this.habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(false);
			
												
				
				if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoFisicoFacturaEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,estadofisicofacturaempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoFisicoFacturaEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadofisicofacturaempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadofisicofacturaempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.estadofisicofacturaempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.estadofisicofacturaempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadofisicofacturaempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoFisicoFacturaEmpresaModel) this.jTableDatosEstadoFisicoFacturaEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoFisicoFacturaEmpresa=true;
				this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
				this.isEsNuevoEstadoFisicoFacturaEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(false);
				
				this.habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(false);
				
				
				
				if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoFisicoFacturaEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoFisicoFacturaEmpresa.getRowCount()>=1) {
				jTableDatosEstadoFisicoFacturaEmpresa.removeRowSelectionInterval(0, jTableDatosEstadoFisicoFacturaEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoFisicoFacturaEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(false) ;
			
			this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
			
			if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoFisicoFacturaEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
				
				//SI ES MANUAL
				if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoFisicoFacturaEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoFisicoFacturaEmpresa--;			
			//EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux= new EstadoFisicoFacturaEmpresa();			
			//estadofisicofacturaempresaAux.setId(this.iIdNuevoEstadoFisicoFacturaEmpresa);
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoFisicoFacturaEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
			
			this.estadofisicofacturaempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().add(this.estadofisicofacturaempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadofisicofacturaempresas.add(this.estadofisicofacturaempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
			
			this.jTableDatosEstadoFisicoFacturaEmpresa.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFacturaEmpresa(), this.getIndiceNuevoEstadoFisicoFacturaEmpresa());
			
			int iLastRow =  this.jTableDatosEstadoFisicoFacturaEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoFisicoFacturaEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoFisicoFacturaEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFisicoFacturaEmpresa();
			}
			
			//this.abrirFrameTreeEstadoFisicoFacturaEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Fisico FacturaS ?", "MANTENIMIENTO DE Estado Fisico Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoFisicoFacturaEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadofisicofacturaempresaReturnGeneral=estadofisicofacturaempresaLogic.procesarImportacionEstadoFisicoFacturaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadofisicofacturaempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoFisicoFacturaEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setFileImportacion(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoFisicoFacturaEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		

		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoFisicoFacturaEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoFisicoFacturaEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pendiente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pendiente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pendiente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pendiente_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE:
					sNombreCampoCategoria="es_pendiente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE:
					sNombreCampoCategoriaValor="es_pendiente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Pendiente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_pendiente");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofacturaempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoFisicoFacturaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofisicofacturaempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofisicofacturaempresa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofisicofacturaempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE);
					iRow++;

					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofisicofacturaempresa.getes_pendiente());
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
			//	this.getFilaCabeceraExportarExcelEstadoFisicoFacturaEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFisicoFacturaEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFisicoFacturaEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFisicoFacturaEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoFisicoFacturaEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoFisicoFacturaEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoFisicoFacturaEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoFisicoFacturaEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoFisicoFacturaEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoFisicoFacturaEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoFisicoFacturaEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoFisicoFacturaEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoFisicoFacturaEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoFisicoFacturaEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFacturaEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoFisicoFacturaEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoFisicoFacturaEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa();
		
		this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFisicoFacturaEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFacturaEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFisicoFacturaEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFisicoFacturaEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoFisicoFacturaEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFisicoFacturaEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFacturaEmpresa() throws Exception {
		try	{
			if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFisicoFacturaEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFisicoFacturaEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFisicoFacturaEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.addItem(reporte);
			}
			
			
			if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFisicoFacturaEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFisicoFacturaEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoFisicoFacturaEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoFisicoFacturaEmpresa(Boolean esInicializar) throws Exception {				
		if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFisicoFacturaEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoFisicoFacturaEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoFisicoFacturaEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadofisicofacturaempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoFisicoFacturaEmpresa.setModel(new EstadoFisicoFacturaEmpresaModel(this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoFisicoFacturaEmpresa.setModel(new EstadoFisicoFacturaEmpresaModel(this.estadofisicofacturaempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoFisicoFacturaEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO,estadofisicofacturaempresaConstantesFunciones.resaltarSeleccionarEstadoFisicoFacturaEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO,estadofisicofacturaempresaConstantesFunciones.resaltarSeleccionarEstadoFisicoFacturaEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ID));

		if(this.estadofisicofacturaempresaConstantesFunciones.mostraridEstadoFisicoFacturaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltaridEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activaridEstadoFisicoFacturaEmpresa,this,true,"idEstadoFisicoFacturaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltaridEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activaridEstadoFisicoFacturaEmpresa,this,true,"idEstadoFisicoFacturaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.estadofisicofacturaempresaConstantesFunciones.mostrarid_empresaEstadoFisicoFacturaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.estadofisicofacturaempresaConstantesFunciones.resaltarid_empresaEstadoFisicoFacturaEmpresa,this,this.estadofisicofacturaempresaConstantesFunciones.activarid_empresaEstadoFisicoFacturaEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.estadofisicofacturaempresaConstantesFunciones.resaltarid_empresaEstadoFisicoFacturaEmpresa,this,this.estadofisicofacturaempresaConstantesFunciones.activarid_empresaEstadoFisicoFacturaEmpresa,false,"id_empresaEstadoFisicoFacturaEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO));

		if(this.estadofisicofacturaempresaConstantesFunciones.mostrarcodigoEstadoFisicoFacturaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltarcodigoEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activarcodigoEstadoFisicoFacturaEmpresa,this,true,"codigoEstadoFisicoFacturaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltarcodigoEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activarcodigoEstadoFisicoFacturaEmpresa,this,true,"codigoEstadoFisicoFacturaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.estadofisicofacturaempresaConstantesFunciones.mostrarnombreEstadoFisicoFacturaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltarnombreEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activarnombreEstadoFisicoFacturaEmpresa,this,true,"nombreEstadoFisicoFacturaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltarnombreEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activarnombreEstadoFisicoFacturaEmpresa,this,true,"nombreEstadoFisicoFacturaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE));

		if(this.estadofisicofacturaempresaConstantesFunciones.mostrares_pendienteEstadoFisicoFacturaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltares_pendienteEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activares_pendienteEstadoFisicoFacturaEmpresa));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.estadofisicofacturaempresaConstantesFunciones.resaltares_pendienteEstadoFisicoFacturaEmpresa,this.estadofisicofacturaempresaConstantesFunciones.activares_pendienteEstadoFisicoFacturaEmpresa,this,true,"es_pendienteEstadoFisicoFacturaEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFactura && this.estadofisicofacturaempresaConstantesFunciones.mostrarFacturaEstadoFisicoFacturaEmpresa && !EstadoFisicoFacturaEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Facturas");
				tableColumn.setHeaderValue("Facturas");
				tableColumn.setCellRenderer(new FacturaTableCell(estadofisicofacturaempresaConstantesFunciones.resaltarFacturaEstadoFisicoFacturaEmpresa,this,this.estadofisicofacturaempresaConstantesFunciones.activarFacturaEstadoFisicoFacturaEmpresa));
				tableColumn.setCellEditor(new FacturaTableCell(estadofisicofacturaempresaConstantesFunciones.resaltarFacturaEstadoFisicoFacturaEmpresa,this,this.estadofisicofacturaempresaConstantesFunciones.activarFacturaEstadoFisicoFacturaEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoFisicoFacturaEmpresa.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFisicoFacturaEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFisicoFacturaEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoFisicoFacturaEmpresa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoFisicoFacturaEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoFisicoFacturaEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoFisicoFacturaEmpresa.moveColumn(this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoFisicoFacturaEmpresa.moveColumn(this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoFisicoFacturaEmpresa.moveColumn(this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoFisicoFacturaEmpresa.moveColumn(this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoFisicoFacturaEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoFisicoFacturaEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoFisicoFacturaEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoFisicoFacturaEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadofisicofacturaempresas.size()-1;
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
		//this.jTableDatosEstadoFisicoFacturaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoFisicoFacturaEmpresa();
			
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
				
				//this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
					
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
				if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadofisicofacturaempresa.getsType().equals("DUPLICADO")
				   || this.estadofisicofacturaempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoFisicoFacturaEmpresa=true;
				
				} else {
					this.isEsNuevoEstadoFisicoFacturaEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.estadofisicofacturaempresa.getId()>=0 && !this.estadofisicofacturaempresa.getIsNew()) {						
						this.isEsNuevoEstadoFisicoFacturaEmpresa=false;
						
					} else {
						this.isEsNuevoEstadoFisicoFacturaEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoFisicoFacturaEmpresa(esRelaciones);						
				
				this.seleccionarEstadoFisicoFacturaEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadofisicofacturaempresa.getId()<0) {
					this.isEsNuevoEstadoFisicoFacturaEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoFisicoFacturaEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoFisicoFacturaEmpresa(evt,rowIndex);
				}	
				
				if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoFisicoFacturaEmpresa: " + this.dDif); 
					}
				}								
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoFisicoFacturaEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadofisicofacturaempresa)) {
					if(this.estadofisicofacturaempresa.getId()>0) {
						this.estadofisicofacturaempresa.setIsDeleted(true);
						
						this.estadofisicofacturaempresasEliminados.add(this.estadofisicofacturaempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().remove(this.estadofisicofacturaempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturaempresas.remove(this.estadofisicofacturaempresa);				
					}
					
					
					((EstadoFisicoFacturaEmpresaModel) this.jTableDatosEstadoFisicoFacturaEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoFisicoFacturaEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoFisicoFacturaEmpresa) {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.estadofisicofacturaempresaConstantesFunciones.cargarid_empresaEstadoFisicoFacturaEmpresa || this.estadofisicofacturaempresaConstantesFunciones.event_dependid_empresaEstadoFisicoFacturaEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.estadofisicofacturaempresa.getid_empresa());
									//this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(estadofisicofacturaempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(estadofisicofacturaempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.estadofisicofacturaempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresa.getId().toString());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresa.getcodigo());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresa.getnombre());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setSelected(estadofisicofacturaempresa.getes_pendiente());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadofisicofacturaempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadofisicofacturaempresaLocal=this.estadofisicofacturaempresa;
			} else {
				estadofisicofacturaempresaLocal=this.estadofisicofacturaempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadofisicofacturaempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaLocal,true);
					
					if(estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadofisicofacturaempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadofisicofacturaempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.getText()==null || this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.getText()=="" || this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.setText("0");
			}

			if(conColumnasBase) {estadofisicofacturaempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelIdEstadoFisicoFacturaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadofisicofacturaempresa.setcodigo(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelcodigoEstadoFisicoFacturaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadofisicofacturaempresa.setnombre(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelnombreEstadoFisicoFacturaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadofisicofacturaempresa.setes_pendiente(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabeles_pendienteEstadoFisicoFacturaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaBean,EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaOrigen,EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofisicofacturaempresaOrigen.getId()!=null && !estadofisicofacturaempresaOrigen.getId().equals(0L))) {estadofisicofacturaempresa.setId(estadofisicofacturaempresaOrigen.getId());}}
			if(conDefault || (!conDefault && estadofisicofacturaempresaOrigen.getcodigo()!=null && !estadofisicofacturaempresaOrigen.getcodigo().equals(""))) {estadofisicofacturaempresa.setcodigo(estadofisicofacturaempresaOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadofisicofacturaempresaOrigen.getnombre()!=null && !estadofisicofacturaempresaOrigen.getnombre().equals(""))) {estadofisicofacturaempresa.setnombre(estadofisicofacturaempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && estadofisicofacturaempresaOrigen.getes_pendiente()!=null && !estadofisicofacturaempresaOrigen.getes_pendiente().equals(false))) {estadofisicofacturaempresa.setes_pendiente(estadofisicofacturaempresaOrigen.getes_pendiente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresa.getId().toString());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresa.getcodigo());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresa.getnombre());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setSelected(estadofisicofacturaempresa.getes_pendiente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresaBean estadofisicofacturaempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresaBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresaBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.setText(estadofisicofacturaempresaBean.getnombre());
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setSelected(estadofisicofacturaempresaBean.getes_pendiente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresaParameterReturnGeneral estadofisicofacturaempresaReturnGeneral,EstadoFisicoFacturaEmpresaBean estadofisicofacturaempresaBean,Boolean conDefault) throws Exception { 
		try {
			EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal=new EstadoFisicoFacturaEmpresa();
			
			estadofisicofacturaempresaLocal=estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofisicofacturaempresaLocal.getId()!=null && !estadofisicofacturaempresaLocal.getId().equals(0L))) {estadofisicofacturaempresaBean.setId(estadofisicofacturaempresaLocal.getId());}}
			if(conDefault || (!conDefault && estadofisicofacturaempresaLocal.getcodigo()!=null && !estadofisicofacturaempresaLocal.getcodigo().equals(""))) {estadofisicofacturaempresaBean.setcodigo(estadofisicofacturaempresaLocal.getcodigo());}
			if(conDefault || (!conDefault && estadofisicofacturaempresaLocal.getnombre()!=null && !estadofisicofacturaempresaLocal.getnombre().equals(""))) {estadofisicofacturaempresaBean.setnombre(estadofisicofacturaempresaLocal.getnombre());}
			if(conDefault || (!conDefault && estadofisicofacturaempresaLocal.getes_pendiente()!=null && !estadofisicofacturaempresaLocal.getes_pendiente().equals(false))) {estadofisicofacturaempresaBean.setes_pendiente(estadofisicofacturaempresaLocal.getes_pendiente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoFisicoFacturaEmpresaGenerico(Long idEstadoFisicoFacturaEmpresaSeleccionado,JComboBox jComboBoxEstadoFisicoFacturaEmpresa,List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasLocal)throws Exception {
		try {
			EstadoFisicoFacturaEmpresa  estadofisicofacturaempresaTemp=null;

			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresasLocal) {
				if(estadofisicofacturaempresaAux.getId()!=null && estadofisicofacturaempresaAux.getId().equals(idEstadoFisicoFacturaEmpresaSeleccionado)) {
					estadofisicofacturaempresaTemp=estadofisicofacturaempresaAux;
					break;
				}
			}

			jComboBoxEstadoFisicoFacturaEmpresa.setSelectedItem(estadofisicofacturaempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoFisicoFacturaEmpresaGenerico(JComboBox jComboBoxEstadoFisicoFacturaEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFisicoFacturaEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoFisicoFacturaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFisicoFacturaEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoFisicoFacturaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Factura")) {
			jButtonFacturaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofisicofacturaempresa=(EstadoFisicoFacturaEmpresa) estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) estadofisicofacturaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!estadofisicofacturaempresa.getIsNew() && !estadofisicofacturaempresa.getIsChanged() && !estadofisicofacturaempresa.getIsDeleted()) {
				sDescripcion=estadofisicofacturaempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=estadofisicofacturaempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoFisicoFacturaEmpresa estadofisicofacturaempresaRow=new EstadoFisicoFacturaEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofisicofacturaempresaRow=(EstadoFisicoFacturaEmpresa) estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofisicofacturaempresaRow=(EstadoFisicoFacturaEmpresa) estadofisicofacturaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFacturaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoFisicoFacturaEmpresa estadofisicofacturaempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresa = (EstadoFisicoFacturaEmpresa)this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadofisicofacturaempresa = (EstadoFisicoFacturaEmpresa)this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadofisicofacturaempresa!=null) {
						this.estadofisicofacturaempresa = estadofisicofacturaempresa;
					} else {
						this.estadofisicofacturaempresa = new EstadoFisicoFacturaEmpresa();
					}
				}

				if(this.isTienePermisosFactura && this.permiteMantenimiento(this.estadofisicofacturaempresa)) {
					FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFramePopup=new FacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFramePopup;
					} else {
						facturaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame;
					}

					List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas=new ArrayList<EstadoFisicoFacturaEmpresa>();
					estadofisicofacturaempresas.add(this.estadofisicofacturaempresa);
					if(!esRelacionado) {
						//facturaBeanSwingJInternalFrame.facturaSessionBean.setConGuardarRelaciones(false);
						//facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.cargarFacturaBeanSwingJInternalFrame(estadofisicofacturaempresas,this.estadofisicofacturaempresa,facturaBeanSwingJInternalFrame,/*conInicializar,*/facturaBeanSwingJInternalFrame.facturaSessionBean.getConGuardarRelaciones(),facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado());
					facturaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("no_relacionado");

						facturaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaConstantesFunciones.ITAMANIOFILATABLA + (FacturaConstantesFunciones.ITAMANIOFILATABLA/2));

						facturaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoFisicoFacturaEmpresa=(TitledBorder)this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.getBorder();
						TitledBorder titledBorderFactura=(TitledBorder)facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

						titledBorderFactura.setTitle(titledBorderEstadoFisicoFacturaEmpresa.getTitle() + " -> Factura");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturaBeanSwingJInternalFrame);
						}

						facturaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturaBeanSwingJInternalFrame);

						facturaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa));			
			this.jButtonDuplicarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa && this.isPermisoDuplicarEstadoFisicoFacturaEmpresa));			
			this.jButtonCopiarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa && this.isPermisoCopiarEstadoFisicoFacturaEmpresa));
			this.jButtonVerFormEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa && this.isPermisoVerFormEstadoFisicoFacturaEmpresa));
			
			this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa && this.isPermisoOrdenEstadoFisicoFacturaEmpresa));			
			
			this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa));			
			this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa && this.isPermisoActualizarEstadoFisicoFacturaEmpresa));	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa && this.isPermisoActualizarEstadoFisicoFacturaEmpresa));	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa && this.isPermisoEliminarEstadoFisicoFacturaEmpresa));
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarEstadoFisicoFacturaEmpresa.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa);							
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa));						
			this.jButtonDuplicarToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa && this.isPermisoDuplicarEstadoFisicoFacturaEmpresa));						
			this.jButtonCopiarToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa && this.isPermisoCopiarEstadoFisicoFacturaEmpresa));			
			this.jButtonVerFormToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa && this.isPermisoVerFormEstadoFisicoFacturaEmpresa));			
			this.jButtonAbrirOrderByToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa && this.isPermisoOrdenEstadoFisicoFacturaEmpresa));
			this.jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));			
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa && this.isPermisoActualizarEstadoFisicoFacturaEmpresa));	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa  && this.isPermisoActualizarEstadoFisicoFacturaEmpresa));	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa && this.isPermisoEliminarEstadoFisicoFacturaEmpresa));
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa);				
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa));			
			this.jMenuItemDuplicarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa && this.isPermisoDuplicarEstadoFisicoFacturaEmpresa));			
			this.jMenuItemCopiarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa && this.isPermisoCopiarEstadoFisicoFacturaEmpresa));			
			this.jMenuItemVerFormEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa && this.isPermisoVerFormEstadoFisicoFacturaEmpresa));			
			this.jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa && this.isPermisoOrdenEstadoFisicoFacturaEmpresa));			
			//this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa && this.isPermisoOrdenEstadoFisicoFacturaEmpresa));
			this.jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa && this.isPermisoOrdenEstadoFisicoFacturaEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa && this.isPermisoOrdenEstadoFisicoFacturaEmpresa));			
			this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa));			
			this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa && this.isPermisoNuevoEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));									
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemModificarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa && this.isPermisoActualizarEstadoFisicoFacturaEmpresa));	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemActualizarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa && this.isPermisoActualizarEstadoFisicoFacturaEmpresa));	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemEliminarEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa && this.isPermisoEliminarEstadoFisicoFacturaEmpresa));
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemCancelarEstadoFisicoFacturaEmpresa.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));						
			this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=this.jButtonNuevoEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa=this.jButtonDuplicarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa=this.jButtonCopiarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa=this.jButtonVerFormEstadoFisicoFacturaEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoFisicoFacturaEmpresa=this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=this.jButtonModificarEstadoFisicoFacturaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=this.jButtonNuevoToolBarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=this.jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarToolBarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=this.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=this.jMenuItemNuevoEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemModificarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemActualizarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemEliminarEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemCancelarEstadoFisicoFacturaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoFisicoFacturaEmpresa(Boolean esInicializar) {
		if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFisicoFacturaEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoFisicoFacturaEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoFisicoFacturaEmpresa() {
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoNuevoEstadoFisicoFacturaEmpresa);			
		this.jButtonDuplicarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoDuplicarEstadoFisicoFacturaEmpresa);			
		this.jButtonCopiarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoCopiarEstadoFisicoFacturaEmpresa);			
		this.jButtonVerFormEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoVerFormEstadoFisicoFacturaEmpresa);			
		
		this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoOrdenEstadoFisicoFacturaEmpresa);					
		
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoNuevoEstadoFisicoFacturaEmpresa);			
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoActualizarEstadoFisicoFacturaEmpresa);	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoActualizarEstadoFisicoFacturaEmpresa);	
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoEliminarEstadoFisicoFacturaEmpresa);
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarEstadoFisicoFacturaEmpresa.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa);						
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoActualizarEstadoFisicoFacturaEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFisicoFacturaEmpresa() {
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoActualizarEstadoFisicoFacturaEmpresa);	
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoActualizarEstadoFisicoFacturaEmpresa);	
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarEstadoFisicoFacturaEmpresa.setVisible(this.isPermisoEliminarEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarEstadoFisicoFacturaEmpresa.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa);							
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa && this.isPermisoGuardarCambiosEstadoFisicoFacturaEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoFisicoFacturaEmpresa() {
		if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoFisicoFacturaEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoFisicoFacturaEmpresa() {
	}
	
	public void jTableDatosEstadoFisicoFacturaEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoFisicoFacturaEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoFisicoFacturaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.getestadofisicofacturaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofacturaempresa==null) {
						this.estadofisicofacturaempresa = new EstadoFisicoFacturaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				}

				if(this.estadofisicofacturaempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadofisicofacturaempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEstadoFisicoFacturaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEstadoFisicoFacturaEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadoFisicoFacturaEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadoFisicoFacturaEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.getestadofisicofacturaempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.estadofisicofacturaempresaLogic.getConnexion());

				if(this.estadofisicofacturaempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.estadofisicofacturaempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadoFisicoFacturaEmpresa=(TitledBorder)this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEstadoFisicoFacturaEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEstadoFisicoFacturaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.getestadofisicofacturaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofacturaempresa==null) {
						this.estadofisicofacturaempresa = new EstadoFisicoFacturaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				}

				if(this.estadofisicofacturaempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.estadofisicofacturaempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoFisicoFacturaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.getestadofisicofacturaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofacturaempresa==null) {
						this.estadofisicofacturaempresa = new EstadoFisicoFacturaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				}

				if(this.estadofisicofacturaempresa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadofisicofacturaempresa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoFisicoFacturaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.getestadofisicofacturaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofacturaempresa==null) {
						this.estadofisicofacturaempresa = new EstadoFisicoFacturaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				}

				if(this.estadofisicofacturaempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadofisicofacturaempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_pendienteEstadoFisicoFacturaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.getestadofisicofacturaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofacturaempresa==null) {
						this.estadofisicofacturaempresa = new EstadoFisicoFacturaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);
				}

				if(this.estadofisicofacturaempresa.getes_pendiente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_pendiente = "+this.estadofisicofacturaempresa.getes_pendiente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaEstadoFisicoFacturaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);

			this.getEstadoFisicoFacturaEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);

			//if(EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadoFisicoFacturaEmpresa() {
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.dispose();
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
			this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.dispose();
			this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa!=null) {
			this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.dispose();
			this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoFisicoFacturaEmpresa();
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoFisicoFacturaEmpresa")) {
				jButtonDuplicarEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoFisicoFacturaEmpresa")) {
				jButtonCopiarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoFisicoFacturaEmpresa")) {
				jButtonVerFormEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonDuplicarEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoFisicoFacturaEmpresa")) {
				jButtonDuplicarEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoFisicoFacturaEmpresa")) {
				jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoFisicoFacturaEmpresa")) {
				jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoFisicoFacturaEmpresa")) {
				jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoFisicoFacturaEmpresa")) {
				jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoFisicoFacturaEmpresa")) {
				jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoFisicoFacturaEmpresa")) {
				jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoFisicoFacturaEmpresa")) {
				jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoFisicoFacturaEmpresa")) {
				jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoFisicoFacturaEmpresa")) {
				jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoFisicoFacturaEmpresa")) {
				jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonMostrarOcultarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoFisicoFacturaEmpresa")) {
				jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonCopiarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonVerFormEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoFisicoFacturaEmpresa")) {
				jButtonCopiarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoFisicoFacturaEmpresa")) {
				jButtonVerFormEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoFisicoFacturaEmpresa")) {
				jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoFisicoFacturaEmpresa")) {
				jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoFisicoFacturaEmpresa")) {
				jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoFisicoFacturaEmpresa")) {
				jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoFisicoFacturaEmpresa")) {
				jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoFisicoFacturaEmpresa")) {
				jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoFisicoFacturaEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa")) {
				jButtonAbrirOrderByEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoFisicoFacturaEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoFisicoFacturaEmpresa")) {
				jButtonMostrarOcultarEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoFisicoFacturaEmpresa")) {
				jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoFisicoFacturaEmpresa")) {
				jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoFisicoFacturaEmpresa")) {
				jButtonCerrarImportacionEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoFisicoFacturaEmpresa")) {
				
				jButtonGenerarImportacionEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoFisicoFacturaEmpresa")) {
				
				jButtonAbrirImportacionEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoFisicoFacturaEmpresa")) {
				jComboBoxTiposAccionesEstadoFisicoFacturaEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoFisicoFacturaEmpresa")) {
				jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoFisicoFacturaEmpresa")) {
				jComboBoxTiposAccionesEstadoFisicoFacturaEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoFisicoFacturaEmpresa")) {
				
				jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoFisicoFacturaEmpresa")) {
				jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoFisicoFacturaEmpresa")) {
				jButtonAbrirOrderByEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoFisicoFacturaEmpresa")) {
				jButtonAbrirOrderByEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoFisicoFacturaEmpresa")) {
				jButtonCerrarOrderByEstadoFisicoFacturaEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtonidEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadoFisicoFacturaEmpresaUpdate")) {
				this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtoncodigoEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtonnombreEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_pendienteEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoFisicoFacturaEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadofisicofacturaempresaLocal=this.estadofisicofacturaempresa;
			} else {
				estadofisicofacturaempresaLocal=this.estadofisicofacturaempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
							
				
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
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
			
			


			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
								
						
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
								
				
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
							
				
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
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
			
			


			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
								
				
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoFisicoFacturaEmpresa")) {
					jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoFisicoFacturaEmpresa")) {
					jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoFisicoFacturaEmpresa")) {
					
				}
				
				


				
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
												
				
				


				
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
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
			
			


			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofacturaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofacturaempresa);
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
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
				
				


				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFacturaEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFacturaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaempresaAnterior =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoFisicoFacturaEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoFisicoFacturaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadofisicofacturaempresa =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadofisicofacturaempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoFisicoFacturaEmpresa")) {
				
				}
				
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoFisicoFacturaEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoFisicoFacturaEmpresa")) {
			
			}
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoFisicoFacturaEmpresa();
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoFisicoFacturaEmpresa")) {
				jButtonDuplicarEstadoFisicoFacturaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoFisicoFacturaEmpresa")) {
				jButtonCopiarEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoFisicoFacturaEmpresa")) {
				jButtonVerFormEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoFisicoFacturaEmpresa")) {
				jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoFisicoFacturaEmpresa")) {
				jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoFisicoFacturaEmpresa")) {
				jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoFisicoFacturaEmpresa")) {
				jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoFisicoFacturaEmpresa")) {
				jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoFisicoFacturaEmpresa")) {
				jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFisicoFacturaEmpresa")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoFisicoFacturaEmpresa")) {
				jButtonAbrirOrderByEstadoFisicoFacturaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoFisicoFacturaEmpresa")) {
				jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoFisicoFacturaEmpresa")) {
				jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoFisicoFacturaEmpresa")) {
				jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtonidEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadoFisicoFacturaEmpresaUpdate")) {
				this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtoncodigoEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtonnombreEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_pendienteEstadoFisicoFacturaEmpresaBusqueda")) {
				this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusquedaActionPerformed(evt);
			}
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoFisicoFacturaEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoFisicoFacturaEmpresa")) {
				closingInternalFrameEstadoFisicoFacturaEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarEstadoFisicoFacturaEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(null);
			}
			
			EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofisicofacturaempresa,new Object(),this.estadofisicofacturaempresaParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoFisicoFacturaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoFisicoFacturaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoFisicoFacturaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadofisicofacturaempresa)) {
			if(!esControlTabla) {
				if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);			
				}
				
				if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofisicofacturaempresaReturnGeneral=estadofisicofacturaempresaLogic.procesarEventosEstadoFisicoFacturaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas(),this.estadofisicofacturaempresa,this.estadofisicofacturaempresaParameterGeneral,this.isEsNuevoEstadoFisicoFacturaEmpresa,classes);//this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral,this.estadofisicofacturaempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFisicoFacturaEmpresa(classes,this.estadofisicofacturaempresaReturnGeneral,this.estadofisicofacturaempresaBean,false);
					}
						
					if(this.estadofisicofacturaempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa());	
					}
						
					if(this.estadofisicofacturaempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa(),classes);//this.estadofisicofacturaempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,classes);//this.estadofisicofacturaempresaBean);									
				}
			
				if(EstadoFisicoFacturaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadofisicofacturaempresaAnterior!=null) {
						this.estadofisicofacturaempresa=this.estadofisicofacturaempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofisicofacturaempresaReturnGeneral=estadofisicofacturaempresaLogic.procesarEventosEstadoFisicoFacturaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas(),this.estadofisicofacturaempresa,this.estadofisicofacturaempresaParameterGeneral,this.isEsNuevoEstadoFisicoFacturaEmpresa,classes);//this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa(),estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa(),this.estadofisicofacturaempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoFisicoFacturaEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoFisicoFacturaEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoFisicoFacturaEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoFisicoFacturaEmpresa() throws Exception {
		
		EstadoFisicoFacturaEmpresaModel estadofisicofacturaempresaModel=(EstadoFisicoFacturaEmpresaModel)this.jTableDatosEstadoFisicoFacturaEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofisicofacturaempresaModel.estadofisicofacturaempresas=this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadofisicofacturaempresaModel.estadofisicofacturaempresas=this.estadofisicofacturaempresas;
		}
		
		
		((EstadoFisicoFacturaEmpresaModel) this.jTableDatosEstadoFisicoFacturaEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoFisicoFacturaEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadofisicofacturaempresaAnterior(),this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadofisicofacturaempresaAnterior(),this.estadofisicofacturaempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoFisicoFacturaEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(estadofisicofacturaempresa.getFacturas());
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
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
										
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofacturaempresa,new Object(),generalEntityParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoFisicoFacturaEmpresaConstantesFunciones.getClassesRelationshipsOfEstadoFisicoFacturaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoFisicoFacturaEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoFisicoFacturaEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoFisicoFacturaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofacturaempresa,new Object(),generalEntityParameterGeneral,this.estadofisicofacturaempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresaBean estadofisicofacturaempresaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(estadofisicofacturaempresa.getFacturas());
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFisicoFacturaEmpresa(ArrayList<Classe> classes,EstadoFisicoFacturaEmpresaReturnGeneral estadofisicofacturaempresaReturnGeneral,EstadoFisicoFacturaEmpresaBean estadofisicofacturaempresaBean,Boolean conDefault) throws Exception {
		
			this.estadofisicofacturaempresaBean.setFacturas(estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa().getFacturas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					estadofisicofacturaempresa.setFacturas(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadofisicofacturaempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa = new EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones(),this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.estadofisicofacturaempresaLogic=this.estadofisicofacturaempresaLogic;
		
		this.cargarCombosFrameForeignKeyEstadoFisicoFacturaEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFisicoFacturaEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFisicoFacturaEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoFisicoFacturaEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoFisicoFacturaEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFisicoFacturaEmpresa"));
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarEstadoFisicoFacturaEmpresa"));

		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarToolBarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFisicoFacturaEmpresa"));
					
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemModificarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFisicoFacturaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFisicoFacturaEmpresa"));
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFisicoFacturaEmpresa"));
						
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemActualizarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFisicoFacturaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarEstadoFisicoFacturaEmpresa"));
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFisicoFacturaEmpresa"));
								
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemEliminarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFisicoFacturaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarEstadoFisicoFacturaEmpresa"));
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFisicoFacturaEmpresa"));
					
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemCancelarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFisicoFacturaEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFisicoFacturaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFisicoFacturaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFisicoFacturaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFisicoFacturaEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonidEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFisicoFacturaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoFisicoFacturaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_pendienteEstadoFisicoFacturaEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFisicoFacturaEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoFisicoFacturaEmpresa"));
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFisicoFacturaEmpresa"));
		}
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoFisicoFacturaEmpresa"));
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoFisicoFacturaEmpresa"));
		
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoEstadoFisicoFacturaEmpresa"));
		
		this.jButtonDuplicarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarEstadoFisicoFacturaEmpresa"));
		
		this.jButtonCopiarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"CopiarEstadoFisicoFacturaEmpresa"));
		
		this.jButtonVerFormEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"VerFormEstadoFisicoFacturaEmpresa"));
		
		
		this.jButtonNuevoToolBarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jButtonDuplicarToolBarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemNuevoEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemDuplicarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoFisicoFacturaEmpresa"));		
		
		
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoFisicoFacturaEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarEstadoFisicoFacturaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonModificarToolBarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFisicoFacturaEmpresa"));
			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemModificarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFisicoFacturaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFisicoFacturaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFisicoFacturaEmpresa"));
				
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemActualizarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFisicoFacturaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarEstadoFisicoFacturaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFisicoFacturaEmpresa"));
						
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemEliminarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFisicoFacturaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarEstadoFisicoFacturaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFisicoFacturaEmpresa"));
			
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemCancelarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFisicoFacturaEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoFisicoFacturaEmpresa"));		
		
		
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarEstadoFisicoFacturaEmpresa"));
		
		
		this.jButtonCerrarToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemCerrarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoFisicoFacturaEmpresa"));
			
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFisicoFacturaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoFisicoFacturaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFisicoFacturaEmpresa"));
		}
		
		this.jButtonCopiarToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jButtonVerFormToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoFisicoFacturaEmpresa"));
		
		this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemCopiarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoFisicoFacturaEmpresa"));		
		
		this.jMenuItemVerFormEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoFisicoFacturaEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFisicoFacturaEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFisicoFacturaEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoFisicoFacturaEmpresa"));
					
		this.jButtonRecargarInformacionToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoFisicoFacturaEmpresa"));
		
		this.jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoFisicoFacturaEmpresa"));		
		
		
		
		this.jButtonAnterioresEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresEstadoFisicoFacturaEmpresa"));
		
		
		this.jButtonAnterioresToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoFisicoFacturaEmpresa"));
		
		this.jMenuItemAnterioresEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoFisicoFacturaEmpresa"));		
		
		
		this.jButtonSiguientesEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesEstadoFisicoFacturaEmpresa"));
		
		
		this.jButtonSiguientesToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemSiguientesEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoFisicoFacturaEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoFisicoFacturaEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoFisicoFacturaEmpresa"));

		this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoFisicoFacturaEmpresa"));
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFisicoFacturaEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoFisicoFacturaEmpresa"));
			
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoFisicoFacturaEmpresa"));
					
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoFisicoFacturaEmpresa"));
			
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoFisicoFacturaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonidEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFisicoFacturaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoFisicoFacturaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_pendienteEstadoFisicoFacturaEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFisicoFacturaEmpresa"));				
			//this.jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFisicoFacturaEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa!=null) {
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFisicoFacturaEmpresa"));
				this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFisicoFacturaEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoFisicoFacturaEmpresa"));
			
			this.jButtonAbrirOrderByToolBarEstadoFisicoFacturaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoFisicoFacturaEmpresa"));			
			
			if(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa!=null) {
				this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFisicoFacturaEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFisicoFacturaEmpresa"));
		
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
            		closingInternalFrameEstadoFisicoFacturaEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoFisicoFacturaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonNuevoEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFisicoFacturaEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonModificarEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoFisicoFacturaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonActualizarEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoFisicoFacturaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonEliminarEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoFisicoFacturaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonCancelarEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonCerrarEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoFisicoFacturaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoFisicoFacturaEmpresa";
		inputMap = this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoFisicoFacturaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonidEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFisicoFacturaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoFisicoFacturaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFisicoFacturaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_pendienteEstadoFisicoFacturaEmpresaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoFisicoFacturaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoFisicoFacturaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoFisicoFacturaEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
					estadofisicofacturaempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresas) {
					estadofisicofacturaempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
						estadofisicofacturaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresas) {
						estadofisicofacturaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
					
						if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE)) {
							existe=true;
							estadofisicofacturaempresaAux.setes_pendiente(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresas) {
						
						if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE)) {
							existe=true;
							estadofisicofacturaempresaAux.setes_pendiente(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFisicoFacturaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFisicoFacturaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoFisicoFacturaEmpresa.getSelectedRows();
			
			EstadoFisicoFacturaEmpresa estadofisicofacturaempresaLocal=new EstadoFisicoFacturaEmpresa();
			
			//this.seleccionarTodosEstadoFisicoFacturaEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofisicofacturaempresaLocal =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadofisicofacturaempresaLocal =(EstadoFisicoFacturaEmpresa) this.estadofisicofacturaempresas.toArray()[this.jTableDatosEstadoFisicoFacturaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadofisicofacturaempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
						estadofisicofacturaempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresas) {
						estadofisicofacturaempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFisicoFacturaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFisicoFacturaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoFisicoFacturaEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoFisicoFacturaEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
				
						if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadofisicofacturaempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofisicofacturaempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresas) {
					
						if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadofisicofacturaempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofisicofacturaempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoFisicoFacturaEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoFisicoFacturaEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoFisicoFacturaEmpresa(conSplash);
				
					this.generarReporteEstadoFisicoFacturaEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoFisicoFacturaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFisicoFacturaEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFisicoFacturaEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFisicoFacturaEmpresa();
				
				this.exportarEstadoFisicoFacturaEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoFisicoFacturaEmpresas();
				//this.importarEstadoFisicoFacturaEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFisicoFacturaEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoFisicoFacturaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Fisico Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoFisicoFacturaEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoFisicoFacturaEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoFisicoFacturaEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoFisicoFacturaEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoFisicoFacturaEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralEstadoFisicoFacturaEmpresa();
						
						this.generarReporteProcesoAccionEstadoFisicoFacturaEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Fisico FacturaS SELECCIONADOS?", "MANTENIMIENTO DE Estado Fisico Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoFisicoFacturaEmpresa();
				
						this.actualizarParametrosGeneralEstadoFisicoFacturaEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadofisicofacturaempresaReturnGeneral=estadofisicofacturaempresaLogic.procesarAccionEstadoFisicoFacturaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas(),this.estadofisicofacturaempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoFisicoFacturaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoFisicoFacturaEmpresa();
					
					EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoFisicoFacturaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoFisicoFacturaEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoFisicoFacturaEmpresa();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
			EstadoFisicoFacturaEmpresa estadofisicofacturaempresa=new EstadoFisicoFacturaEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.getSelectedItem();
			
			
			
			
			estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadofisicofacturaempresasSeleccionados.size()==1) {
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresasSeleccionados) {
					estadofisicofacturaempresa=estadofisicofacturaempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Factura")) {
					jButtonFacturaActionPerformed(null,rowIndex,true,false,estadofisicofacturaempresa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoFisicoFacturaEmpresa();
			
      		//this.finishProcessEstadoFisicoFacturaEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoFisicoFacturaEmpresaReturnGeneral() throws Exception {
		if(this.estadofisicofacturaempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadofisicofacturaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadofisicofacturaempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadofisicofacturaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadofisicofacturaempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadofisicofacturaempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
		}
		
		if(this.estadofisicofacturaempresaReturnGeneral.getConRetornoLista() || this.estadofisicofacturaempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.estadofisicofacturaempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresas(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadofisicofacturaempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofisicofacturaempresaLogic.setEstadoFisicoFacturaEmpresa(this.estadofisicofacturaempresaReturnGeneral.getEstadoFisicoFacturaEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoFisicoFacturaEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoFisicoFacturaEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<EstadoFisicoFacturaEmpresa> getEstadoFisicoFacturaEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoFisicoFacturaEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas()) {
					if(estadofisicofacturaempresaAux.getIsSelected()) {
						estadofisicofacturaempresasSeleccionados.add(estadofisicofacturaempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:this.estadofisicofacturaempresas) {
					if(estadofisicofacturaempresaAux.getIsSelected()) {
						estadofisicofacturaempresasSeleccionados.add(estadofisicofacturaempresaAux);				
					}
				}
			}
			
			if(estadofisicofacturaempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadofisicofacturaempresasSeleccionados.addAll(this.estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadofisicofacturaempresasSeleccionados.addAll(this.estadofisicofacturaempresas);				
					}
				}
			}
		} else {
			estadofisicofacturaempresasSeleccionados.add(this.estadofisicofacturaempresa);
		}
		
		return estadofisicofacturaempresasSeleccionados;
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
	
	public void generarReporteEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoFisicoFacturaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoFisicoFacturaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFisicoFacturaEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFisicoFacturaEmpresasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoFisicoFacturaEmpresasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Fisico Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoFisicoFacturaEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoFisicoFacturaEmpresa();
		
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoFisicoFacturaEmpresa();
		
		
		//this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresasSeleccionados ,estadofisicofacturaempresaImplementable,estadofisicofacturaempresaImplementableHome);
	}
	
	public void mostrarImportacionEstadoFisicoFacturaEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoFisicoFacturaEmpresa();
		
		this.abrirFrameImportacionEstadoFisicoFacturaEmpresa();		
		
			
		//this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresasSeleccionados ,estadofisicofacturaempresaImplementable,estadofisicofacturaempresaImplementableHome);
	}
	
	public void importarEstadoFisicoFacturaEmpresas() throws Exception {		
	
	}
	
	public void exportarEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoFisicoFacturaEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoFisicoFacturaEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoFisicoFacturaEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Fisico Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofacturaempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoFisicoFacturaEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadofisicofacturaempresaAux.setsDetalleGeneralEntityReporte(estadofisicofacturaempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoFisicoFacturaEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadofisicofacturaempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofacturaempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofacturaempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofacturaempresa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofacturaempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofacturaempresa.getes_pendiente().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofacturaempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoFisicoFacturaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoFisicoFacturaEmpresa(row);				
				iRow++;
			}				
			
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoFisicoFacturaEmpresasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();		
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofacturaempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadofisicofacturaempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadofisicofacturaempresa");
			//elementRoot.appendChild(element);
		
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresasSeleccionados) {
				element = document.createElement("estadofisicofacturaempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoFisicoFacturaEmpresa(estadofisicofacturaempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoFisicoFacturaEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofacturaempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofacturaempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofacturaempresa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofacturaempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofacturaempresa.getes_pendiente());				
	}
	
	public void setFilaDatosExportarXmlEstadoFisicoFacturaEmpresa(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoFisicoFacturaEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadofisicofacturaempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoFisicoFacturaEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadofisicofacturaempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EstadoFisicoFacturaEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(estadofisicofacturaempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(EstadoFisicoFacturaEmpresaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadofisicofacturaempresa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoFisicoFacturaEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadofisicofacturaempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_pendiente = document.createElement(EstadoFisicoFacturaEmpresaConstantesFunciones.ESPENDIENTE);
		elementes_pendiente.appendChild(document.createTextNode(estadofisicofacturaempresa.getes_pendiente().toString().trim()));
		element.appendChild(elementes_pendiente);
	}
	
	public void generarReporteGroupGenericoEstadoFisicoFacturaEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados=new ArrayList<EstadoFisicoFacturaEmpresa>();
		
		estadofisicofacturaempresasSeleccionados=this.getEstadoFisicoFacturaEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoFisicoFacturaEmpresa(estadofisicofacturaempresasSeleccionados);
		
		this.generarReporteEstadoFisicoFacturaEmpresas("Todos",estadofisicofacturaempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoFisicoFacturaEmpresa(ArrayList<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresaAux:estadofisicofacturaempresasSeleccionados) {
				estadofisicofacturaempresaAux.setsDetalleGeneralEntityReporte(estadofisicofacturaempresaAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					estadofisicofacturaempresaAux.setsDescripcionGeneralEntityReporte1(estadofisicofacturaempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadofisicofacturaempresaAux.setsDescripcionGeneralEntityReporte1(estadofisicofacturaempresaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadofisicofacturaempresaAux.setsDescripcionGeneralEntityReporte1(estadofisicofacturaempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE)) {
					existe=true;
					estadofisicofacturaempresaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(estadofisicofacturaempresaAux.getes_pendiente()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoFisicoFacturaEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFacturaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFacturaEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=true;
		} else {
			this.actualizarEstadoPanelsEstadoFisicoFacturaEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoFisicoFacturaEmpresa=false;
			//this.isVisibilidadCeldaVerFormEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaDuplicarEstadoFisicoFacturaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;												
			}
			
			this.jButtonCerrarEstadoFisicoFacturaEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFacturaEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.estadofisicofacturaempresa)) {
			this.isVisibilidadCeldaActualizarEstadoFisicoFacturaEmpresa=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFacturaEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFisicoFacturaEmpresa() {
		this.isVisibilidadCeldaNuevoEstadoFisicoFacturaEmpresa=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFacturaEmpresa=false;
	}
	
	public void actualizarEstadoPanelsEstadoFisicoFacturaEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa!=null) {
				this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
					this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa!=null) {
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionEstadoFisicoFacturaEmpresaParaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(this.estadofisicofacturaempresaSessionBean==null) {
				this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean=new FacturaSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean.setsPathNavegacionActual(estadofisicofacturaempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFactura=this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(EstadoFisicoFacturaEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoFisicoFacturaEmpresa(true);
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.facturaSessionBean.setlidEstadoFisicoFacturaEmpresaActual(this.idEstadoFisicoFacturaEmpresaActual);

			estadofisicofacturaempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoFisicoFacturaEmpresa(true);
			estadofisicofacturaempresaSessionBean.setlIdEstadoFisicoFacturaEmpresaActualForeignKey(this.idEstadoFisicoFacturaEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoFisicoFacturaEmpresaSessionBean estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
		
		if(this.estadofisicofacturaempresaSessionBean==null) {
			this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
		}
		
		this.estadofisicofacturaempresaSessionBean.setsUltimaBusquedaEstadoFisicoFacturaEmpresa(this.getsAccionBusqueda());
		this.estadofisicofacturaempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadofisicofacturaempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			estadofisicofacturaempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoFisicoFacturaEmpresaSessionBean estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
		
		if(this.estadofisicofacturaempresaSessionBean==null) {
			this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
		}
		
		if(this.estadofisicofacturaempresaSessionBean.getsUltimaBusquedaEstadoFisicoFacturaEmpresa()!=null&&!this.estadofisicofacturaempresaSessionBean.getsUltimaBusquedaEstadoFisicoFacturaEmpresa().equals("")) {
			this.setsAccionBusqueda(estadofisicofacturaempresaSessionBean.getsUltimaBusquedaEstadoFisicoFacturaEmpresa());
			this.setiNumeroPaginacion(estadofisicofacturaempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadofisicofacturaempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(estadofisicofacturaempresaSessionBean.getid_empresa());
				estadofisicofacturaempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.estadofisicofacturaempresaSessionBean.setsUltimaBusquedaEstadoFisicoFacturaEmpresa("");
		this.estadofisicofacturaempresaSessionBean.setiNumeroPaginacion(EstadoFisicoFacturaEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.estadofisicofacturaempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoFisicoFacturaEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoFisicoFacturaEmpresa() {
		this.updateBorderResaltarBusquedasFormularioEstadoFisicoFacturaEmpresa();
		this.updateVisibilidadBusquedasFormularioEstadoFisicoFacturaEmpresa();
		this.updateHabilitarBusquedasFormularioEstadoFisicoFacturaEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoFisicoFacturaEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoFisicoFacturaEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadoFisicoFacturaEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadoFisicoFacturaEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadoFisicoFacturaEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoFisicoFacturaEmpresa();
		this.updateVisibilidadResaltarControlesFormularioEstadoFisicoFacturaEmpresa();
		this.updateHabilitarResaltarControlesFormularioEstadoFisicoFacturaEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoFisicoFacturaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadofisicofacturaempresaConstantesFunciones.resaltaridEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.setBorder(this.estadofisicofacturaempresaConstantesFunciones.resaltaridEstadoFisicoFacturaEmpresa);}
		if(this.estadofisicofacturaempresaConstantesFunciones.resaltarid_empresaEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setBorder(this.estadofisicofacturaempresaConstantesFunciones.resaltarid_empresaEstadoFisicoFacturaEmpresa);}
		if(this.estadofisicofacturaempresaConstantesFunciones.resaltarcodigoEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.setBorder(this.estadofisicofacturaempresaConstantesFunciones.resaltarcodigoEstadoFisicoFacturaEmpresa);}
		if(this.estadofisicofacturaempresaConstantesFunciones.resaltarnombreEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.setBorder(this.estadofisicofacturaempresaConstantesFunciones.resaltarnombreEstadoFisicoFacturaEmpresa);}
		if(this.estadofisicofacturaempresaConstantesFunciones.resaltares_pendienteEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setBorderPainted(true);this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setBorder(this.estadofisicofacturaempresaConstantesFunciones.resaltares_pendienteEstadoFisicoFacturaEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoFisicoFacturaEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostraridEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelidEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostraridEstadoFisicoFacturaEmpresa);
		//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrarid_empresaEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelid_empresaEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrarid_empresaEstadoFisicoFacturaEmpresa);
		//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrarcodigoEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelcodigoEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrarcodigoEstadoFisicoFacturaEmpresa);
		//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrarnombreEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPanelnombreEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrarnombreEstadoFisicoFacturaEmpresa);
		//this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrares_pendienteEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jPaneles_pendienteEstadoFisicoFacturaEmpresa.setVisible(this.estadofisicofacturaempresaConstantesFunciones.mostrares_pendienteEstadoFisicoFacturaEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoFisicoFacturaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa!=null) {
	
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jLabelidEstadoFisicoFacturaEmpresa.setEnabled(this.estadofisicofacturaempresaConstantesFunciones.activaridEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setEnabled(this.estadofisicofacturaempresaConstantesFunciones.activarid_empresaEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextFieldcodigoEstadoFisicoFacturaEmpresa.setEnabled(this.estadofisicofacturaempresaConstantesFunciones.activarcodigoEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jTextAreanombreEstadoFisicoFacturaEmpresa.setEnabled(this.estadofisicofacturaempresaConstantesFunciones.activarnombreEstadoFisicoFacturaEmpresa);
		this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa.jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setEnabled(this.estadofisicofacturaempresaConstantesFunciones.activares_pendienteEstadoFisicoFacturaEmpresa);
		}
	}
	
		
}
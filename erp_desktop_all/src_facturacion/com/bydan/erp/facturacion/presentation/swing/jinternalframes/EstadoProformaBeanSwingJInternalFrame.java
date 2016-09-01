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

import com.bydan.erp.facturacion.util.EstadoProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoProformaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoProformaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoProformaBeanSwingJInternalFrame extends EstadoProformaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoProformaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoProforma> estadoproformaValidator = new ClassValidator<EstadoProforma>(EstadoProforma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoProforma estadoproforma;	
	public EstadoProforma estadoproformaAux;
	public EstadoProforma estadoproformaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoProforma estadoproformaTotales;
	public Long idEstadoProformaActual;
	public Long iIdNuevoEstadoProforma=0L;
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
	
	public Boolean isPermisoTodoEstadoProforma;
	public Boolean isPermisoNuevoEstadoProforma;
	public Boolean isPermisoActualizarEstadoProforma;
	public Boolean isPermisoActualizarOriginalEstadoProforma;
	public Boolean isPermisoEliminarEstadoProforma;
	public Boolean isPermisoGuardarCambiosEstadoProforma;
	public Boolean isPermisoConsultaEstadoProforma;
	public Boolean isPermisoBusquedaEstadoProforma;
	public Boolean isPermisoReporteEstadoProforma;
	public Boolean isPermisoPaginacionMedioEstadoProforma;
	public Boolean isPermisoPaginacionAltoEstadoProforma;
	public Boolean isPermisoPaginacionTodoEstadoProforma;
	public Boolean isPermisoCopiarEstadoProforma;
	public Boolean isPermisoVerFormEstadoProforma;
	public Boolean isPermisoDuplicarEstadoProforma;
	public Boolean isPermisoOrdenEstadoProforma;
	
	
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
	
	public EstadoProformaParameterReturnGeneral estadoproformaReturnGeneral;
	public EstadoProformaParameterReturnGeneral estadoproformaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoProforma=false;
	public Boolean esParaAccionDesdeFormularioEstadoProforma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoProformaLogic estadoproformaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoProforma estadoproformaBean;
	public EstadoProformaConstantesFunciones estadoproformaConstantesFunciones;
	//public EstadoProformaParameterReturnGeneral estadoproformaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ColorGeneralLogic colorgeneralLogic;
	
	//PARAMETROS
	
	
	//public List<EstadoProforma> estadoproformas;	
	//public List<EstadoProforma> estadoproformasEliminados;
	//public List<EstadoProforma> estadoproformasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoProforma=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoProforma=true;
	public Boolean isVisibilidadCeldaCopiarEstadoProforma=true;
	public Boolean isVisibilidadCeldaVerFormEstadoProforma=true;
	public Boolean isVisibilidadCeldaOrdenEstadoProforma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
	public Boolean isVisibilidadCeldaModificarEstadoProforma=false;
	public Boolean isVisibilidadCeldaActualizarEstadoProforma=false;
	public Boolean isVisibilidadCeldaEliminarEstadoProforma=false;
	public Boolean isVisibilidadCeldaCancelarEstadoProforma=false;
	public Boolean isVisibilidadCeldaGuardarEstadoProforma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoProforma=false;	
	
	
	public Boolean isVisibilidadFK_IdColorGeneral=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEstadoProforma() {
		return this.iIdNuevoEstadoProforma;
	}

	public void setiIdNuevoEstadoProforma(Long iIdNuevoEstadoProforma) {
		this.iIdNuevoEstadoProforma = iIdNuevoEstadoProforma;
	}
	
	public Long getidEstadoProformaActual() {
		return this.idEstadoProformaActual;
	}

	public void setidEstadoProformaActual(Long idEstadoProformaActual) {
		this.idEstadoProformaActual = idEstadoProformaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoProforma getestadoproforma() {
		return this.estadoproforma;
	}

	public void setestadoproforma(EstadoProforma estadoproforma) {
		this.estadoproforma = estadoproforma;
	}
	
	public EstadoProforma getestadoproformaAux() {
		return this.estadoproformaAux;
	}

	public void setestadoproformaAux(EstadoProforma estadoproformaAux) {
		this.estadoproformaAux = estadoproformaAux;
	}				
	
	public EstadoProforma getestadoproformaAnterior() {
		return this.estadoproformaAnterior;
	}

	public void setestadoproformaAnterior(EstadoProforma estadoproformaAnterior) {
		this.estadoproformaAnterior = estadoproformaAnterior;
	}	
	
	public EstadoProforma getestadoproformaTotales() {
		return this.estadoproformaTotales;
	}

	public void setestadoproformaTotales(EstadoProforma estadoproformaTotales) {
		this.estadoproformaTotales = estadoproformaTotales;
	}	
	
	public EstadoProforma getestadoproformaBean() {
		return this.estadoproformaBean;
	}

	public void setestadoproformaBean(EstadoProforma estadoproformaBean) {
		this.estadoproformaBean = estadoproformaBean;
	}	
	
	public EstadoProformaParameterReturnGeneral getestadoproformaReturnGeneral() {
		return this.estadoproformaReturnGeneral;
	}

	public void setestadoproformaReturnGeneral(EstadoProformaParameterReturnGeneral estadoproformaReturnGeneral) {
		this.estadoproformaReturnGeneral = estadoproformaReturnGeneral;
	}	
	
	
	public Long id_color_generalFK_IdColorGeneral=-1L;

	public Long getid_color_generalFK_IdColorGeneral() {
		return this.id_color_generalFK_IdColorGeneral;
	}

	public void setid_color_generalFK_IdColorGeneral(Long id_color_generalFK_IdColorGeneral) {
		this.id_color_generalFK_IdColorGeneral = id_color_generalFK_IdColorGeneral;
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
	
	
	public EstadoProformaLogic getEstadoProformaLogic()	{		
		return estadoproformaLogic;
	}

	public void setEstadoProformaLogic(EstadoProformaLogic estadoproformaLogic) {
		this.estadoproformaLogic = estadoproformaLogic;
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
	
	public Boolean getIsEsNuevoEstadoProforma() {
		return isEsNuevoEstadoProforma;
	}

	public void setIsEsNuevoEstadoProforma(Boolean isEsNuevoEstadoProforma) {
		this.isEsNuevoEstadoProforma = isEsNuevoEstadoProforma;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoProforma() {
		return esParaAccionDesdeFormularioEstadoProforma;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoProforma(Boolean esParaAccionDesdeFormularioEstadoProforma) {
		this.esParaAccionDesdeFormularioEstadoProforma = esParaAccionDesdeFormularioEstadoProforma;
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

			if(this.estadoproformaSessionBean==null) {
				this.estadoproformaSessionBean=new EstadoProformaSessionBean();
			}

			if(!this.estadoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(estadoproformaSessionBean.getlidEmpresaActual());
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

			//colorgeneralLogic.getColorGeneralDataAccess().setIsForForeingKeyData(true);

			if(this.estadoproformaSessionBean==null) {
				this.estadoproformaSessionBean=new EstadoProformaSessionBean();
			}

			if(!this.estadoproformaSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//colorgeneralLogic.getColorGeneralDataAccess().setIsForForeingKeyData(true);

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
					colorgeneralLogic.getEntityWithConnection(estadoproformaSessionBean.getlidColorGeneralActual());
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

					if(this.estadoproforma!=null) {
						this.estadoproforma.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
						this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEstadoProforma.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
						if(this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEstadoProformaGenerico)throws Exception
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
				jComboBoxid_empresaEstadoProformaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEstadoProformaGenerico!=null && jComboBoxid_empresaEstadoProformaGenerico.getItemCount()>0) {
					jComboBoxid_empresaEstadoProformaGenerico.setSelectedIndex(0);
				}
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

					if(this.estadoproforma!=null) {
						this.estadoproforma.setColorGeneral(colorgeneralTemp);
					}

					if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
						this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setSelectedItem(colorgeneralTemp);
					}
				} else {
					//jComboBoxid_color_generalEstadoProforma.setSelectedItem(colorgeneralTemp);
					if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
						if(this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdColorGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(colorgeneralTemp!=null && jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma!=null) {
						jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setSelectedItem(colorgeneralTemp);
					} else {
						if(jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma!=null) {
							//jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setSelectedItem(colorgeneralTemp);
							if(jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.getItemCount()>0) {
								jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setSelectedIndex(0);
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
	public void setActualColorGeneralForeignKeyGenerico(Long idColorGeneralSeleccionado,JComboBox jComboBoxid_color_generalEstadoProformaGenerico)throws Exception
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
				jComboBoxid_color_generalEstadoProformaGenerico.setSelectedItem(colorgeneralTemp);
			} else {
				if(jComboBoxid_color_generalEstadoProformaGenerico!=null && jComboBoxid_color_generalEstadoProformaGenerico.getItemCount()>0) {
					jComboBoxid_color_generalEstadoProformaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EstadoProforma estadoproforma,JComboBox jComboBoxid_empresaEstadoProformaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEstadoProformaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEstadoProformaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				estadoproforma.setid_empresa(empresaAux.getId());
				estadoproforma.setempresa_descripcion(EstadoProformaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				estadoproforma.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarColorGeneralForeignKey(EstadoProforma estadoproforma,JComboBox jComboBoxid_color_generalEstadoProformaGenerico)throws Exception
	{
		try
		{
			ColorGeneral  colorgeneralAux=new ColorGeneral();

			if(jComboBoxid_color_generalEstadoProformaGenerico==null) {
				colorgeneralAux=(ColorGeneral)this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.getSelectedItem();
			} else {
				colorgeneralAux=(ColorGeneral)jComboBoxid_color_generalEstadoProformaGenerico.getSelectedItem();
			}

			if(colorgeneralAux!=null && colorgeneralAux.getId()!=null) {
				estadoproforma.setid_color_general(colorgeneralAux.getId());
				estadoproforma.setcolorgeneral_descripcion(EstadoProformaConstantesFunciones.getColorGeneralDescripcion(colorgeneralAux));
				estadoproforma.setColorGeneral(colorgeneralAux);			}
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

					if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadoProforma!=null) { 
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadoProforma!=null) { 
					}

					if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameColorGeneralsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingColorGeneral=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadoProforma!=null) { 
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.removeAllItems();

							for(ColorGeneral colorgeneral:this.colorgeneralsForeignKey) {
								this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.addItem(colorgeneral);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadoProforma!=null) { 
					}

					if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdColorGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.removeAllItems();

							for(ColorGeneral colorgeneral:this.colorgeneralsForeignKey) {
								this.jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.addItem(colorgeneral);
							}
						}

						if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameColorGeneralForeignKey(ColorGeneral colorgeneral,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setSelectedItem(colorgeneral);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
							this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setSelectedItem(colorgeneral);
						} else {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadoProforma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoProformaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoProforma(this.estadoproformaLogic.getEstadoProformas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoProformaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoProforma(this.estadoproformas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(ColorGeneral.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoproformaLogic.setEstadoProformas(this.estadoproformas);
			estadoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoProformaParameterReturnGeneral getEstadoProformaParameterGeneral() {
		return this.estadoproformaParameterGeneral;
	}
	
	public void setEstadoProformaParameterGeneral(EstadoProformaParameterReturnGeneral estadoproformaParameterGeneral) {
		this.estadoproformaParameterGeneral = estadoproformaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoProforma() {
		return isPermisoTodoEstadoProforma;
	}

	public void setIsPermisoTodoEstadoProforma(Boolean isPermisoTodoEstadoProforma) {
		this.isPermisoTodoEstadoProforma = isPermisoTodoEstadoProforma;
	}

	public Boolean getIsPermisoNuevoEstadoProforma() {
		return isPermisoNuevoEstadoProforma;
	}

	public void setIsPermisoNuevoEstadoProforma(Boolean isPermisoNuevoEstadoProforma) {
		this.isPermisoNuevoEstadoProforma = isPermisoNuevoEstadoProforma;
	}

	public Boolean getIsPermisoActualizarEstadoProforma() {
		return isPermisoActualizarEstadoProforma;
	}

	public void setIsPermisoActualizarEstadoProforma(Boolean isPermisoActualizarEstadoProforma) {
		this.isPermisoActualizarEstadoProforma = isPermisoActualizarEstadoProforma;
	}

	public Boolean getIsPermisoEliminarEstadoProforma() {
		return isPermisoEliminarEstadoProforma;
	}

	public void setIsPermisoEliminarEstadoProforma(Boolean isPermisoEliminarEstadoProforma) {
		this.isPermisoEliminarEstadoProforma = isPermisoEliminarEstadoProforma;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoProforma() {
		return isPermisoGuardarCambiosEstadoProforma;
	}

	public void setIsPermisoGuardarCambiosEstadoProforma(Boolean isPermisoGuardarCambiosEstadoProforma) {
		this.isPermisoGuardarCambiosEstadoProforma = isPermisoGuardarCambiosEstadoProforma;
	}
	
	public Boolean getIsPermisoConsultaEstadoProforma() {
		return isPermisoConsultaEstadoProforma;
	}

	public void setIsPermisoConsultaEstadoProforma(Boolean isPermisoConsultaEstadoProforma) {
		this.isPermisoConsultaEstadoProforma = isPermisoConsultaEstadoProforma;
	}

	public Boolean getIsPermisoBusquedaEstadoProforma() {
		return isPermisoBusquedaEstadoProforma;
	}

	public void setIsPermisoBusquedaEstadoProforma(Boolean isPermisoBusquedaEstadoProforma) {
		this.isPermisoBusquedaEstadoProforma = isPermisoBusquedaEstadoProforma;
	}

	public Boolean getIsPermisoReporteEstadoProforma() {
		return isPermisoReporteEstadoProforma;
	}

	public void setIsPermisoReporteEstadoProforma(Boolean isPermisoReporteEstadoProforma) {
		this.isPermisoReporteEstadoProforma = isPermisoReporteEstadoProforma;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoProforma() {
		return isPermisoPaginacionMedioEstadoProforma;
	}

	public void setIsPermisoPaginacionMedioEstadoProforma(Boolean isPermisoPaginacionMedioEstadoProforma) {
		this.isPermisoPaginacionMedioEstadoProforma = isPermisoPaginacionMedioEstadoProforma;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoProforma() {
		return isPermisoPaginacionTodoEstadoProforma;
	}

	public void setIsPermisoPaginacionTodoEstadoProforma(Boolean isPermisoPaginacionTodoEstadoProforma) {
		this.isPermisoPaginacionTodoEstadoProforma = isPermisoPaginacionTodoEstadoProforma;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoProforma() {
		return isPermisoPaginacionAltoEstadoProforma;
	}

	public void setIsPermisoPaginacionAltoEstadoProforma(Boolean isPermisoPaginacionAltoEstadoProforma) {
		this.isPermisoPaginacionAltoEstadoProforma = isPermisoPaginacionAltoEstadoProforma;
	}
	
	public Boolean getIsPermisoCopiarEstadoProforma() {
		return isPermisoCopiarEstadoProforma;
	}

	public void setIsPermisoCopiarEstadoProforma(Boolean isPermisoCopiarEstadoProforma) {
		this.isPermisoCopiarEstadoProforma = isPermisoCopiarEstadoProforma;
	}
	
	public Boolean getIsPermisoVerFormEstadoProforma() {
		return isPermisoVerFormEstadoProforma;
	}

	public void setIsPermisoVerFormEstadoProforma(Boolean isPermisoVerFormEstadoProforma) {
		this.isPermisoVerFormEstadoProforma = isPermisoVerFormEstadoProforma;
	}
	
	public Boolean getIsPermisoDuplicarEstadoProforma() {
		return isPermisoDuplicarEstadoProforma;
	}

	public void setIsPermisoDuplicarEstadoProforma(Boolean isPermisoDuplicarEstadoProforma) {
		this.isPermisoDuplicarEstadoProforma = isPermisoDuplicarEstadoProforma;
	}
	
	public Boolean getIsPermisoOrdenEstadoProforma() {
		return isPermisoOrdenEstadoProforma;
	}

	public void setIsPermisoOrdenEstadoProforma(Boolean isPermisoOrdenEstadoProforma) {
		this.isPermisoOrdenEstadoProforma = isPermisoOrdenEstadoProforma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoProforma() {
		return isVisibilidadCeldaNuevoEstadoProforma;
	}

	public void setIsVisibilidadCeldaNuevoEstadoProforma(Boolean isVisibilidadCeldaNuevoEstadoProforma) {
		this.isVisibilidadCeldaNuevoEstadoProforma = isVisibilidadCeldaNuevoEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoProforma() {
		return isVisibilidadCeldaDuplicarEstadoProforma;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoProforma(Boolean isVisibilidadCeldaDuplicarEstadoProforma) {
		this.isVisibilidadCeldaDuplicarEstadoProforma = isVisibilidadCeldaDuplicarEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoProforma() {
		return isVisibilidadCeldaCopiarEstadoProforma;
	}

	public void setIsVisibilidadCeldaCopiarEstadoProforma(Boolean isVisibilidadCeldaCopiarEstadoProforma) {
		this.isVisibilidadCeldaCopiarEstadoProforma = isVisibilidadCeldaCopiarEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoProforma() {
		return isVisibilidadCeldaVerFormEstadoProforma;
	}

	public void setIsVisibilidadCeldaVerFormEstadoProforma(Boolean isVisibilidadCeldaVerFormEstadoProforma) {
		this.isVisibilidadCeldaVerFormEstadoProforma = isVisibilidadCeldaVerFormEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoProforma() {
		return isVisibilidadCeldaOrdenEstadoProforma;
	}

	public void setIsVisibilidadCeldaOrdenEstadoProforma(Boolean isVisibilidadCeldaOrdenEstadoProforma) {
		this.isVisibilidadCeldaOrdenEstadoProforma = isVisibilidadCeldaOrdenEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoProforma() {
		return isVisibilidadCeldaNuevoRelacionesEstadoProforma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoProforma(Boolean isVisibilidadCeldaNuevoRelacionesEstadoProforma) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoProforma = isVisibilidadCeldaNuevoRelacionesEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoProforma() {
		return isVisibilidadCeldaModificarEstadoProforma;
	}

	public void setIsVisibilidadCeldaModificarEstadoProforma(Boolean isVisibilidadCeldaModificarEstadoProforma) {
		this.isVisibilidadCeldaModificarEstadoProforma = isVisibilidadCeldaModificarEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoProforma() {
		return isVisibilidadCeldaActualizarEstadoProforma;
	}

	public void setIsVisibilidadCeldaActualizarEstadoProforma(Boolean isVisibilidadCeldaActualizarEstadoProforma) {
		this.isVisibilidadCeldaActualizarEstadoProforma = isVisibilidadCeldaActualizarEstadoProforma;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoProforma() {
		return isVisibilidadCeldaEliminarEstadoProforma;
	}

	public void setIsVisibilidadCeldaEliminarEstadoProforma(Boolean isVisibilidadCeldaEliminarEstadoProforma) {
		this.isVisibilidadCeldaEliminarEstadoProforma = isVisibilidadCeldaEliminarEstadoProforma;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoProforma() {
		return isVisibilidadCeldaCancelarEstadoProforma;
	}

	public void setIsVisibilidadCeldaCancelarEstadoProforma(Boolean isVisibilidadCeldaCancelarEstadoProforma) {
		this.isVisibilidadCeldaCancelarEstadoProforma = isVisibilidadCeldaCancelarEstadoProforma;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoProforma() {
		return isVisibilidadCeldaGuardarEstadoProforma;
	}

	public void setIsVisibilidadCeldaGuardarEstadoProforma(Boolean isVisibilidadCeldaGuardarEstadoProforma) {
		this.isVisibilidadCeldaGuardarEstadoProforma = isVisibilidadCeldaGuardarEstadoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoProforma() {
		return isVisibilidadCeldaGuardarCambiosEstadoProforma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoProforma(Boolean isVisibilidadCeldaGuardarCambiosEstadoProforma) {
		this.isVisibilidadCeldaGuardarCambiosEstadoProforma = isVisibilidadCeldaGuardarCambiosEstadoProforma;
	}
		
	public EstadoProformaSessionBean getestadoproformaSessionBean() {
		return this.estadoproformaSessionBean;
	}
	
	public void setestadoproformaSessionBean(EstadoProformaSessionBean estadoproformaSessionBean) {
		this.estadoproformaSessionBean=estadoproformaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdColorGeneral() {
		return this.isVisibilidadFK_IdColorGeneral;
	}

	public void setisVisibilidadFK_IdColorGeneral(Boolean isVisibilidadFK_IdColorGeneral) {
		this.isVisibilidadFK_IdColorGeneral=isVisibilidadFK_IdColorGeneral;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(EstadoProforma estadoproforma)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(estadoproforma,null);
				this.setActualParaGuardarColorGeneralForeignKey(estadoproforma,null);
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
	
	public void bugActualizarReferenciaActual(EstadoProforma estadoproforma,EstadoProforma estadoproformaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoProforma(estadoproforma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoproformaAux.setId(estadoproforma.getId());
		estadoproformaAux.setVersionRow(estadoproforma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoProforma();
		
			int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoproformaValidator.getInvalidValues(this.estadoproforma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoproformaLogic.setDatosCliente(datosCliente);
			estadoproformaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoproformaAux=new  EstadoProforma();
				
				estadoproformaAux.setIsNew(true);
				estadoproformaAux.setIsChanged(true);
				
				estadoproformaAux.setEstadoProformaOriginal(this.estadoproforma);
				
				estadoproformaAux.setId(this.estadoproforma.getId());	
				estadoproformaAux.setVersionRow(this.estadoproforma.getVersionRow());	
				estadoproformaAux.setid_empresa(this.estadoproforma.getid_empresa());	
				estadoproformaAux.setcodigo(this.estadoproforma.getcodigo());	
				estadoproformaAux.setnombre(this.estadoproforma.getnombre());	
				estadoproformaAux.setid_color_general(this.estadoproforma.getid_color_general());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoproformaAux,estadoproformaLogic.getEstadoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoproformaAux,estadoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformaLogic.saveEstadoProformas();//WithConnection
						//estadoproformaLogic.getSetVersionRowEstadoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoproforma,estadoproformaAux);
					
					this.refrescarForeignKeysDescripcionesEstadoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoproformaAux=new  EstadoProforma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoproformaSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoproformaSessionBean.getEsGuardarRelacionado() && this.estadoproforma.getId()>=0)) {
						
					estadoproformaAux.setIsNew(false);
				}
				
				estadoproformaAux.setIsDeleted(false);
			
				estadoproformaAux.setId(this.estadoproforma.getId());	
				estadoproformaAux.setVersionRow(this.estadoproforma.getVersionRow());	
				estadoproformaAux.setid_empresa(this.estadoproforma.getid_empresa());	
				estadoproformaAux.setcodigo(this.estadoproforma.getcodigo());	
				estadoproformaAux.setnombre(this.estadoproforma.getnombre());	
				estadoproformaAux.setid_color_general(this.estadoproforma.getid_color_general());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoproformaAux,estadoproformaLogic.getEstadoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoproformaAux,estadoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformaLogic.saveEstadoProformas();//WithConnection
						//estadoproformaLogic.getSetVersionRowEstadoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoproforma,estadoproformaAux);
					
					this.refrescarForeignKeysDescripcionesEstadoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoproformaAux=new  EstadoProforma();
				
				estadoproformaAux.setIsNew(false);
				estadoproformaAux.setIsChanged(false);
				
				estadoproformaAux.setIsDeleted(true);
				
				estadoproformaAux.setId(this.estadoproforma.getId());	
				estadoproformaAux.setVersionRow(this.estadoproforma.getVersionRow());	
				estadoproformaAux.setid_empresa(this.estadoproforma.getid_empresa());	
				estadoproformaAux.setcodigo(this.estadoproforma.getcodigo());	
				estadoproformaAux.setnombre(this.estadoproforma.getnombre());	
				estadoproformaAux.setid_color_general(this.estadoproforma.getid_color_general());	
				
				if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoproformaAux.getId()>=0) {	
						this.estadoproformasEliminados.add(estadoproformaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoproformaAux,estadoproformaLogic.getEstadoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoproformaAux,estadoproformas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformaLogic.saveEstadoProformas();//WithConnection
						//estadoproformaLogic.getSetVersionRowEstadoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoproformaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoproformaAux,estadoproformaLogic.getEstadoProformas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoproformaAux,estadoproformas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.getEstadoProformas().addAll(this.estadoproformasEliminados);
					
					estadoproformaLogic.saveEstadoProformas();//WithConnection
					//estadoproformaLogic.getSetVersionRowEstadoProformas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEstadoProforma();
				
				this.estadoproformasEliminados= new ArrayList<EstadoProforma>();		
			}
			
			if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Proforma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoproforma=estadoproformaAux;
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
      		//this.finishProcessEstadoProforma();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoProforma estadoproformaLocal) throws Exception {
		
		if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoProforma estadoproformaLocal) throws Exception {	
		if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				estadoproformaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ColorGeneralDetalleFormJInternalFrame.class)) {
				ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrameLocal=(ColorGeneralBeanSwingJInternalFrame) ((ColorGeneralDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				colorgeneralBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoColorGeneral(colorgeneralBeanSwingJInternalFrameLocal.getcolorgeneral(),true);
				colorgeneralBeanSwingJInternalFrameLocal.actualizarLista(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral,this.colorgeneralsForeignKey);

				colorgeneralBeanSwingJInternalFrameLocal.actualizarRelaciones(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral);

				estadoproformaLocal.setColorGeneral(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral);

				this.addItemDefectoCombosForeignKeyColorGeneral();
				this.cargarCombosFrameColorGeneralsForeignKey("Formulario");
				this.setActualColorGeneralForeignKey(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadoProformaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoproformaValidator.getInvalidValues(this.estadoproforma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoProforma estadoproforma,List<EstadoProforma> estadoproformas) throws Exception {
		try	{		
			EstadoProformaConstantesFunciones.actualizarLista(estadoproforma,estadoproformas,this.estadoproformaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoProforma estadoproforma,List<EstadoProforma> estadoproformas) throws Exception {
		try	{			
			EstadoProformaConstantesFunciones.actualizarSelectedLista(estadoproforma,estadoproformas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoProforma> estadoproformasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoproformasLocal=this.estadoproformaLogic.getEstadoProformas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoproformasLocal=this.estadoproformas;
			}
			//ARCHITECTURE
		
			for(EstadoProforma estadoproformaLocal:estadoproformasLocal) {
				if(this.permiteMantenimiento(estadoproformaLocal) && estadoproformaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoProformaConstantesFunciones.getEstadoProformaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoProformaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoProforma.jLabelid_empresaEstadoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoProformaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoProforma.jLabelcodigoEstadoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoProformaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoProforma.jLabelnombreEstadoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoProformaConstantesFunciones.IDCOLORGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoProforma.jLabelid_color_generalEstadoProforma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoProforma.jLabelid_empresaEstadoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoProforma.jLabelcodigoEstadoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoProforma.jLabelnombreEstadoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoProforma.jLabelid_color_generalEstadoProforma,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoProforma--;	
		
		
		this.estadoproformaAux=new EstadoProforma();
		
		this.estadoproformaAux.setId(this.iIdNuevoEstadoProforma);
		this.estadoproformaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoproformaLogic.getEstadoProformas().add(this.estadoproformaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoproformas.add(this.estadoproformaAux);
		}
		//ARCHITECTURE
		
		this.estadoproforma=this.estadoproformaAux;
		
		if(EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoProforma(this.estadoproforma);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoProforma(this.estadoproforma);
		}
				
		//this.setDefaultControlesEstadoProforma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoProforma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoProforma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoProforma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoProforma(this.estadoproformaBean,this.estadoproforma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoProformaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
			classes=EstadoProformaConstantesFunciones.getClassesRelationshipsOfEstadoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoproformaReturnGeneral=estadoproformaLogic.procesarEventosEstadoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoproformaLogic.getEstadoProformas(),this.estadoproforma,this.estadoproformaParameterGeneral,this.isEsNuevoEstadoProforma,classes);//this.estadoproformaLogic.getEstadoProforma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoProforma(this.estadoproformaReturnGeneral,this.estadoproformaBean,false);
		
		if(this.estadoproformaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoProforma(this.estadoproformaReturnGeneral.getEstadoProforma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoProforma(this.estadoproformaReturnGeneral.getEstadoProforma());
		}
		
		if(this.estadoproformaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoProforma(this.estadoproformaReturnGeneral.getEstadoProforma(),classes);//this.estadoproformaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoProforma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoProforma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoProforma(false);
						
			if(estadoproformaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoProforma();
			}
			
			this.actualizarVisualTableDatosEstadoProforma();
			
			this.jTableDatosEstadoProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoProforma(), this.getIndiceNuevoEstadoProforma());
			
			this.seleccionarFilaTablaEstadoProformaActual();
						
			this.actualizarEstadoCeldasBotonesEstadoProforma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoProforma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.setEnabled(isHabilitar && this.estadoproformaConstantesFunciones.activarcodigoEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.setEnabled(isHabilitar && this.estadoproformaConstantesFunciones.activarnombreEstadoProforma);	
		//
		this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setEnabled(isHabilitar && this.estadoproformaConstantesFunciones.activarid_empresaEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setEnabled(isHabilitar && this.estadoproformaConstantesFunciones.activarid_color_generalEstadoProforma);
	};
	
	public void setDefaultControlesEstadoProforma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoProforma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoproformaSessionBean.setConGuardarRelaciones(true);			
			this.estadoproformaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.setVisible(true);
			
					
		} else {
			//this.estadoproformaSessionBean.setConGuardarRelaciones(false);			
			this.estadoproformaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoProforma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
				if(estadoproformaAux.getId().equals(this.iIdNuevoEstadoProforma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoProforma estadoproformaAux:this.estadoproformas) {
				if(estadoproformaAux.getId().equals(this.iIdNuevoEstadoProforma)) {
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
	
	public int getIndiceActualEstadoProforma(EstadoProforma estadoproforma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
				if(estadoproformaAux.getId().equals(estadoproforma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoProforma estadoproformaAux:this.estadoproformas) {
				if(estadoproformaAux.getId().equals(estadoproforma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoProforma(EstadoProforma estadoproformaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
				if(estadoproformaAux.getEstadoProformaOriginal().getId().equals(estadoproformaOriginal.getId())) {
					existe=true;
					estadoproformaOriginal.setId(estadoproformaAux.getId());
					estadoproformaOriginal.setVersionRow(estadoproformaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoProforma estadoproformaAux:this.estadoproformas) {
				if(estadoproformaAux.getEstadoProformaOriginal().getId().equals(estadoproformaOriginal.getId())) {
					existe=true;
					estadoproformaOriginal.setId(estadoproformaAux.getId());
					estadoproformaOriginal.setVersionRow(estadoproformaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoProforma(Boolean esParaCancelar) throws Exception {
		estadoproformasAux=new ArrayList<EstadoProforma>();
		estadoproformaAux=new EstadoProforma();
		
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
					if(estadoproformaAux.getId()<0) {
						estadoproformasAux.add(estadoproformaAux);
					}		
				}
				this.iIdNuevoEstadoProforma=0L;
				this.estadoproformaLogic.getEstadoProformas().removeAll(estadoproformasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoProforma estadoproformaAux:this.estadoproformas) {
					if(estadoproformaAux.getId()<0) {
						estadoproformasAux.add(estadoproformaAux);
					}		
				}
				this.iIdNuevoEstadoProforma=0L;
				this.estadoproformas.removeAll(estadoproformasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoProforma 
					&& this.estadoproformaLogic.getEstadoProformas().size()>0
					) {
					estadoproformaAux=this.estadoproformaLogic.getEstadoProformas().get(this.estadoproformaLogic.getEstadoProformas().size() - 1);
				
					if(estadoproformaAux.getId()<0) {
						this.estadoproformaLogic.getEstadoProformas().remove(estadoproformaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoProforma && this.estadoproformas.size()>0) {
					estadoproformaAux=this.estadoproformas.get(this.estadoproformas.size() - 1);
				
					if(estadoproformaAux.getId()<0) {
						this.estadoproformas.remove(estadoproformaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoProforma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoproforma.getId()<0) {
				this.estadoproformaLogic.getEstadoProformas().remove(this.estadoproforma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoproforma.getId()<0) {
				this.estadoproformas.remove(this.estadoproforma);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoProforma(List<EstadoProforma> estadoproformasAux) throws Exception {
		EstadoProformaConstantesFunciones.setEstadosInicialesEstadoProforma(estadoproformasAux);
	}
	
	public void setEstadosInicialesEstadoProforma(EstadoProforma estadoproformaAux) throws Exception {
		EstadoProformaConstantesFunciones.setEstadosInicialesEstadoProforma(estadoproformaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoProformaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoProformaActual()) {
				if(!this.isEsNuevoEstadoProforma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoProforma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoProformaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Proforma ?", "MANTENIMIENTO DE Estado Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoProforma estadoproforma) throws Exception {
		EstadoProformaConstantesFunciones.seleccionarAsignar(this.estadoproforma,estadoproforma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoProforma=this.isPermisoActualizarOriginalEstadoProforma;
			
			
			this.seleccionarAsignar(estadoproforma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoProformaConstantesFunciones.quitarEspaciosEstadoProforma(this.estadoproforma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoproformaSessionBean.setsFuncionBusquedaRapida(this.estadoproformaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoProforma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoProforma(esParaCancelar);				
				this.cancelarNuevoEstadoProforma(esParaCancelar);								
			}
			
			this.estadoproforma=new EstadoProforma();
			
			this.inicializarEstadoProforma();
			
			this.actualizarEstadoCeldasBotonesEstadoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoProforma() throws Exception {
		try {
			EstadoProformaConstantesFunciones.inicializarEstadoProforma(this.estadoproforma);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoproformaLogic.getEstadoProformas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoProformas(String sAccionBusqueda,List<EstadoProforma> estadoproformasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoProforma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoProformaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoProformaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoProforma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Proformas");		
		parameters.put("busquedapor", EstadoProformaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoProforma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoProforma=new JRBeanArrayDataSource(EstadoProformaJInternalFrame.TraerEstadoProformaBeans(estadoproformasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoProforma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoProformaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoProformaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoProformaBean.TraerEstadoProformaBeans(estadoproformasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoProformas(sAccionBusqueda,sTipoArchivoReporte,estadoproformasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoProformas(sAccionBusqueda,sTipoArchivoReporte,estadoproformasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoProformaActionPerformed(null);
					//this.generarExcelReporteEstadoProformas(sAccionBusqueda,sTipoArchivoReporte,estadoproformasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoProformas(sAccionBusqueda,sTipoArchivoReporte,estadoproformasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoProformas(sAccionBusqueda,sTipoArchivoReporte,estadoproformasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoProformas(sAccionBusqueda,sTipoArchivoReporte,estadoproformasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoProforma> estadoproformasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoproforma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoProformas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoProforma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoProforma estadoproforma : estadoproformasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoProformaConstantesFunciones.generarExcelReporteDataEstadoProforma("NORMAL",row,workbook,estadoproforma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoProforma(String sTipo,Row row,Workbook workbook) {
		
		EstadoProformaConstantesFunciones.generarExcelReporteHeaderEstadoProforma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoProforma> estadoproformasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoproforma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoProforma estadoproforma : estadoproformasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoProformaConstantesFunciones.getEstadoProformaDescripcion(estadoproforma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoProformaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoproforma.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoProformaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoproforma.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoProformaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoproforma.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoproforma.getcolorgeneral_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoProforma> estadoproformasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoProforma> estadoproformasRespaldo=null;
		
		classes=EstadoProformaConstantesFunciones.getClassesRelationshipsOfEstadoProforma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoproformaLogic.setDatosCliente(this.datosCliente);
		this.estadoproformaLogic.setDatosDeep(this.datosDeep);
		this.estadoproformaLogic.setIsConDeep(true);
		
		estadoproformasRespaldo=this.estadoproformaLogic.getEstadoProformas();
		
		this.estadoproformaLogic.setEstadoProformas(estadoproformasParaReportes);	
		this.estadoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoproformasParaReportes=this.estadoproformaLogic.getEstadoProformas();
		this.estadoproformaLogic.setEstadoProformas(estadoproformasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoproforma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoProforma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoProforma estadoproforma : estadoproformasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoProforma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoProformaConstantesFunciones.generarExcelReporteDataEstadoProforma("NORMAL",row,workbook,estadoproforma,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoProformaConstantesFunciones.getEstadoProformaDescripcion(estadoproforma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoProforma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoProforma() throws Exception {		
		this.startProcessEstadoProforma(true);
	}
	
	public void startProcessEstadoProforma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadoProforma ,this.jPanelParametrosReportesEstadoProforma, this.jScrollPanelDatosEstadoProforma,this.jPanelPaginacionEstadoProforma, this.jScrollPanelDatosEdicionEstadoProforma, this.jPanelAccionesEstadoProforma,this.jPanelAccionesFormularioEstadoProforma,this.jmenuBarEstadoProforma,this.jmenuBarDetalleEstadoProforma,this.jTtoolBarEstadoProforma,this.jTtoolBarDetalleEstadoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoProforma=this.jTabbedPaneBusquedasEstadoProforma; 
		
		final JPanel jPanelParametrosReportesEstadoProforma=this.jPanelParametrosReportesEstadoProforma;
		//final JScrollPane jScrollPanelDatosEstadoProforma=this.jScrollPanelDatosEstadoProforma;
		final JTable jTableDatosEstadoProforma=this.jTableDatosEstadoProforma;		
		final JPanel jPanelPaginacionEstadoProforma=this.jPanelPaginacionEstadoProforma;
		//final JScrollPane jScrollPanelDatosEdicionEstadoProforma=this.jScrollPanelDatosEdicionEstadoProforma;
		final JPanel jPanelAccionesEstadoProforma=this.jPanelAccionesEstadoProforma;
		
		JPanel jPanelCamposAuxiliarEstadoProforma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoProforma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			jPanelCamposAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jPanelCamposEstadoProforma;
			jPanelAccionesFormularioAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jPanelAccionesFormularioEstadoProforma;
		}
		
		final JPanel jPanelCamposEstadoProforma=jPanelCamposAuxiliarEstadoProforma;
		final JPanel jPanelAccionesFormularioEstadoProforma=jPanelAccionesFormularioAuxiliarEstadoProforma;
		
		
		final JMenuBar jmenuBarEstadoProforma=this.jmenuBarEstadoProforma;
		final JToolBar jTtoolBarEstadoProforma=this.jTtoolBarEstadoProforma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoProforma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			jmenuBarDetalleAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jmenuBarDetalleEstadoProforma;
			jTtoolBarDetalleAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jTtoolBarDetalleEstadoProforma;
		}
		
		final JMenuBar jmenuBarDetalleEstadoProforma=jmenuBarDetalleAuxiliarEstadoProforma;
		final JToolBar jTtoolBarDetalleEstadoProforma=jTtoolBarDetalleAuxiliarEstadoProforma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoProforma;
			processRunnable.jTableDatos=jTableDatosEstadoProforma;
			processRunnable.jPanelCampos=jPanelCamposEstadoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoProforma;
			processRunnable.jTtoolBar=jTtoolBarEstadoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoProforma ,jPanelParametrosReportesEstadoProforma,jTableDatosEstadoProforma, /*jScrollPanelDatosEstadoProforma,*/jPanelCamposEstadoProforma,jPanelPaginacionEstadoProforma, /*jScrollPanelDatosEdicionEstadoProforma,*/ jPanelAccionesEstadoProforma,jPanelAccionesFormularioEstadoProforma,jmenuBarEstadoProforma,jmenuBarDetalleEstadoProforma,jTtoolBarEstadoProforma,jTtoolBarDetalleEstadoProforma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoProforma ,jPanelParametrosReportesEstadoProforma, jScrollPanelDatosEstadoProforma,jPanelPaginacionEstadoProforma, jScrollPanelDatosEdicionEstadoProforma, jPanelAccionesEstadoProforma,jPanelAccionesFormularioEstadoProforma,jmenuBarEstadoProforma,jmenuBarDetalleEstadoProforma,jTtoolBarEstadoProforma,jTtoolBarDetalleEstadoProforma);
						
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
	
	public void finishProcessEstadoProforma() {// throws Exception 
		this.finishProcessEstadoProforma(true);
	}
	
	public void finishProcessEstadoProforma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadoProforma ,this.jPanelParametrosReportesEstadoProforma, this.jScrollPanelDatosEstadoProforma,this.jPanelPaginacionEstadoProforma, this.jScrollPanelDatosEdicionEstadoProforma, this.jPanelAccionesEstadoProforma,this.jPanelAccionesFormularioEstadoProforma,this.jmenuBarEstadoProforma,this.jmenuBarDetalleEstadoProforma,this.jTtoolBarEstadoProforma,this.jTtoolBarDetalleEstadoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoProforma=this.jTabbedPaneBusquedasEstadoProforma; 
		
		final JPanel jPanelParametrosReportesEstadoProforma=this.jPanelParametrosReportesEstadoProforma;
		//final JScrollPane jScrollPanelDatosEstadoProforma=this.jScrollPanelDatosEstadoProforma;
		final JTable jTableDatosEstadoProforma=this.jTableDatosEstadoProforma;		
		final JPanel jPanelPaginacionEstadoProforma=this.jPanelPaginacionEstadoProforma;
		//final JScrollPane jScrollPanelDatosEdicionEstadoProforma=this.jScrollPanelDatosEdicionEstadoProforma;
		final JPanel jPanelAccionesEstadoProforma=this.jPanelAccionesEstadoProforma;
		
		JPanel jPanelCamposAuxiliarEstadoProforma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoProforma=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			jPanelCamposAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jPanelCamposEstadoProforma;
			jPanelAccionesFormularioAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jPanelAccionesFormularioEstadoProforma;
		}
		
		final JPanel jPanelCamposEstadoProforma=jPanelCamposAuxiliarEstadoProforma;
		final JPanel jPanelAccionesFormularioEstadoProforma=jPanelAccionesFormularioAuxiliarEstadoProforma;
		
		
		final JMenuBar jmenuBarEstadoProforma=this.jmenuBarEstadoProforma;		
		final JToolBar jTtoolBarEstadoProforma=this.jTtoolBarEstadoProforma;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoProforma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			jmenuBarDetalleAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jmenuBarDetalleEstadoProforma;
			jTtoolBarDetalleAuxiliarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jTtoolBarDetalleEstadoProforma;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoProforma=jmenuBarDetalleAuxiliarEstadoProforma;
		final JToolBar jTtoolBarDetalleEstadoProforma=jTtoolBarDetalleAuxiliarEstadoProforma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoProforma;
			processRunnable.jTableDatos=jTableDatosEstadoProforma;
			processRunnable.jPanelCampos=jPanelCamposEstadoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoProforma;
			processRunnable.jTtoolBar=jTtoolBarEstadoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoProforma ,jPanelParametrosReportesEstadoProforma, jTableDatosEstadoProforma,/*jScrollPanelDatosEstadoProforma,*/jPanelCamposEstadoProforma,jPanelPaginacionEstadoProforma, /*jScrollPanelDatosEdicionEstadoProforma,*/ jPanelAccionesEstadoProforma,jPanelAccionesFormularioEstadoProforma,jmenuBarEstadoProforma,jmenuBarDetalleEstadoProforma,jTtoolBarEstadoProforma,jTtoolBarDetalleEstadoProforma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoProforma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoProforma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoProforma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoProforma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoProforma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoproformaConstantesFunciones.getsFinalQueryEstadoProforma();
		String  finalQueryPaginacionTodos=this.estadoproformaConstantesFunciones.getsFinalQueryEstadoProforma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoProformaConstantesFunciones.getArrayColumnasGlobalesNoEstadoProforma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoProformaConstantesFunciones.getArrayColumnasGlobalesEstadoProforma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoProformaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoproformasEliminados= new ArrayList<EstadoProforma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoProforma();
		
				///*EstadoProformaSessionBean*/this.estadoproformaSessionBean=new EstadoProformaSessionBean();
			
			if(this.estadoproformaSessionBean==null) {
				this.estadoproformaSessionBean=new EstadoProformaSessionBean();
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
					this.iNumeroPaginacion=EstadoProformaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoProformaConstantesFunciones.getClassesForeignKeysOfEstadoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoproforma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoproformasAux= new ArrayList<EstadoProforma>();
			
				
			estadoproformaLogic.setDatosCliente(this.datosCliente);
			estadoproformaLogic.setDatosDeep(this.datosDeep);
			estadoproformaLogic.setIsConDeep(true);
			
			
			estadoproformaLogic.getEstadoProformaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoproformaLogic.getTodosEstadoProformas(finalQueryGlobal,pagination);
					
					//estadoproformaLogic.getTodosEstadoProformasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoproformaLogic.getEstadoProformas()==null|| estadoproformaLogic.getEstadoProformas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoproformasAux= new ArrayList<EstadoProforma>();
							estadoproformasAux.addAll(estadoproformaLogic.getEstadoProformas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoproformasAux= new ArrayList<EstadoProforma>();
							estadoproformasAux.addAll(estadoproformas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoproformaLogic.getTodosEstadoProformas(finalQueryGlobal+"",this.pagination);												
							
							//estadoproformaLogic.getTodosEstadoProformasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoProformas("Todos",estadoproformaLogic.getEstadoProformas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoproformaLogic.setEstadoProformas(new ArrayList<EstadoProforma>());					
							estadoproformaLogic.getEstadoProformas().addAll(estadoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoproformas=new ArrayList<EstadoProforma>();
							estadoproformas.addAll(estadoproformasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoProforma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoProforma=this.idActual;
				
				} else if(this.idEstadoProformaActual!=null && this.idEstadoProformaActual!=0L) {
					idEstadoProforma=idEstadoProformaActual;
				}
				
					
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndicePorId(idEstadoProforma);
				
				this.estadoproformas=new ArrayList<EstadoProforma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoproformaLogic.getEntity(idEstadoProforma);
					
					//estadoproformaLogic.getEntityWithConnection(idEstadoProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoproformaLogic.setEstadoProformas(new ArrayList<EstadoProforma>());
					estadoproformaLogic.getEstadoProformas().add(estadoproformaLogic.getEstadoProforma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoproformas=new ArrayList<EstadoProforma>();
					this.estadoproformas.add(estadoproforma);
				}
				
				if(estadoproformaLogic.getEstadoProforma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdColorGeneral")) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadoproformaLogic.getEstadoProformasFK_IdColorGeneral(finalQueryGlobal,pagination,id_color_generalFK_IdColorGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadoproformaLogic.getEstadoProformas()==null||estadoproformaLogic.getEstadoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadoproformas==null|| estadoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformasAux=new ArrayList<EstadoProforma>();
						estadoproformasAux.addAll(estadoproformaLogic.getEstadoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoproformasAux=new ArrayList<EstadoProforma>();
							estadoproformasAux.addAll(estadoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadoproformaLogic.getEstadoProformasFK_IdColorGeneral(finalQueryGlobal,pagination,id_color_generalFK_IdColorGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadoProformas("FK_IdColorGeneral",estadoproformaLogic.getEstadoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadoProformas("FK_IdColorGeneral",estadoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformaLogic.setEstadoProformas(new ArrayList<EstadoProforma>());
						estadoproformaLogic.getEstadoProformas().addAll(estadoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoproformas=new ArrayList<EstadoProforma>();
							estadoproformas.addAll(estadoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadoproformaLogic.getEstadoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadoproformaLogic.getEstadoProformas()==null||estadoproformaLogic.getEstadoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadoproformas==null|| estadoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformasAux=new ArrayList<EstadoProforma>();
						estadoproformasAux.addAll(estadoproformaLogic.getEstadoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoproformasAux=new ArrayList<EstadoProforma>();
							estadoproformasAux.addAll(estadoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadoproformaLogic.getEstadoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadoProformas("FK_IdEmpresa",estadoproformaLogic.getEstadoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadoProformas("FK_IdEmpresa",estadoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformaLogic.setEstadoProformas(new ArrayList<EstadoProforma>());
						estadoproformaLogic.getEstadoProformas().addAll(estadoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoproformas=new ArrayList<EstadoProforma>();
							estadoproformas.addAll(estadoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoProforma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoProforma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoproformaLogic.getEstadoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoproformas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoproformaLogic.getEstadoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoproformas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoProforma estadoproforma) {
		Boolean permite=true;
		
		if(this.estadoproforma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoProformaConstantesFunciones.getOrderByListaEstadoProforma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoProformaConstantesFunciones.getOrderByListaEstadoProforma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoProforma estadoproforma:estadoproformaLogic.getEstadoProformas()) {
				if(estadoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadoproformaTotales=estadoproforma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoProforma estadoproforma:this.estadoproformas) {
				if(estadoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadoproformaTotales=estadoproforma;
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
			this.estadoproformaAux=new EstadoProforma();
			this.estadoproformaAux.setsType(Constantes2.S_TOTALES);
			this.estadoproformaAux.setIsNew(false);
			this.estadoproformaAux.setIsChanged(false);
			this.estadoproformaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoProformaConstantesFunciones.TotalizarValoresFilaEstadoProforma(this.estadoproformaLogic.getEstadoProformas(),this.estadoproformaAux);
				
				this.estadoproformaLogic.getEstadoProformas().add(this.estadoproformaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoProformaConstantesFunciones.TotalizarValoresFilaEstadoProforma(this.estadoproformas,this.estadoproformaAux);
				
				this.estadoproformas.add(this.estadoproformaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoproformaTotales=new EstadoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoproformaLogic.getEstadoProformas().remove(estadoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoproformas.remove(estadoproformaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoproformaTotales=new EstadoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoProforma estadoproforma:estadoproformaLogic.getEstadoProformas()) {
				if(estadoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadoproformaTotales=estadoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoProformaConstantesFunciones.TotalizarValoresFilaEstadoProforma(this.estadoproformaLogic.getEstadoProformas(),estadoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoProforma estadoproforma:this.estadoproformas) {
				if(estadoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadoproformaTotales=estadoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoProformaConstantesFunciones.TotalizarValoresFilaEstadoProforma(this.estadoproformas,estadoproformaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoProformasFK_IdColorGeneral()throws Exception {
		try {
			sAccionBusqueda="FK_IdColorGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadoProformasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEstadoProformasFK_IdColorGeneral(String sFinalQuery,Long id_color_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoproformaLogic.getEstadoProformasFK_IdColorGeneral(sFinalQuery,this.pagination,id_color_general);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadoProformasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoproformaLogic.getEstadoProformasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEstadoProforma() {
		this.isPermisoTodoEstadoProforma=false;
		this.isPermisoNuevoEstadoProforma=false;
		this.isPermisoActualizarEstadoProforma=false;
		this.isPermisoActualizarOriginalEstadoProforma=false;
		this.isPermisoEliminarEstadoProforma=false;
		this.isPermisoGuardarCambiosEstadoProforma=false;
		this.isPermisoConsultaEstadoProforma=false;
		this.isPermisoBusquedaEstadoProforma=false;
		this.isPermisoReporteEstadoProforma=false;		
		this.isPermisoOrdenEstadoProforma=false;		
		this.isPermisoPaginacionMedioEstadoProforma=false;		
		this.isPermisoPaginacionAltoEstadoProforma=false;
		this.isPermisoPaginacionTodoEstadoProforma=false;
		this.isPermisoCopiarEstadoProforma=false;		
		this.isPermisoVerFormEstadoProforma=false;		
		this.isPermisoDuplicarEstadoProforma=false;		
		this.isPermisoOrdenEstadoProforma=false;		
	}
	
	public void setPermisosUsuarioEstadoProforma(Boolean isPermiso) {
		this.isPermisoTodoEstadoProforma=isPermiso;
		this.isPermisoNuevoEstadoProforma=isPermiso;
		this.isPermisoActualizarEstadoProforma=isPermiso;
		this.isPermisoActualizarOriginalEstadoProforma=isPermiso;
		this.isPermisoEliminarEstadoProforma=isPermiso;
		this.isPermisoGuardarCambiosEstadoProforma=isPermiso;
		this.isPermisoConsultaEstadoProforma=isPermiso;
		this.isPermisoBusquedaEstadoProforma=isPermiso;
		this.isPermisoReporteEstadoProforma=isPermiso;
		this.isPermisoOrdenEstadoProforma=isPermiso;		
		this.isPermisoPaginacionMedioEstadoProforma=isPermiso;		
		this.isPermisoPaginacionAltoEstadoProforma=isPermiso;		
		this.isPermisoPaginacionTodoEstadoProforma=isPermiso;		
		this.isPermisoCopiarEstadoProforma=isPermiso;		
		this.isPermisoVerFormEstadoProforma=isPermiso;		
		this.isPermisoDuplicarEstadoProforma=isPermiso;
		this.isPermisoOrdenEstadoProforma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoProforma(Boolean isPermiso) {
		//this.isPermisoTodoEstadoProforma=isPermiso;
		this.isPermisoNuevoEstadoProforma=isPermiso;
		this.isPermisoActualizarEstadoProforma=isPermiso;
		this.isPermisoActualizarOriginalEstadoProforma=isPermiso;
		this.isPermisoEliminarEstadoProforma=isPermiso;
		this.isPermisoGuardarCambiosEstadoProforma=isPermiso;
		//this.isPermisoConsultaEstadoProforma=isPermiso;
		//this.isPermisoBusquedaEstadoProforma=isPermiso;
		//this.isPermisoReporteEstadoProforma=isPermiso;
		//this.isPermisoOrdenEstadoProforma=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoProforma=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoProforma=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoProforma=isPermiso;		
		//this.isPermisoCopiarEstadoProforma=isPermiso;		
		//this.isPermisoDuplicarEstadoProforma=isPermiso;
		//this.isPermisoOrdenEstadoProforma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoProformaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoProforma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoProformaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoProformaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoProformaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoProformaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoProforma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoProformaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoProforma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoProforma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoProforma=this.isPermisoActualizarEstadoProforma;
			this.isPermisoEliminarEstadoProforma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoProforma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoProforma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoProforma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoProforma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoProforma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoProforma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoProforma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoProforma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoProforma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoProforma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoProforma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoProforma.setToolTipText(this.jTableDatosEstadoProforma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoProforma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoProforma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoProforma() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyEstadoProformaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.colorgeneralsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoProformaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoProformaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyColorGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEstadoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EstadoProformaParameterReturnGeneral estadoproformaReturnGeneral=new EstadoProformaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.estadoproformaConstantesFunciones.cargarid_empresaEstadoProforma)
					 || (this.esRecargarFks && this.estadoproformaConstantesFunciones.cargarid_empresaEstadoProforma)) {

					if(!this.estadoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+estadoproformaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalColorGeneral="";

				if(((this.colorgeneralsForeignKey==null||this.colorgeneralsForeignKey.size()<=0) && this.estadoproformaConstantesFunciones.cargarid_color_generalEstadoProforma)
					 || (this.esRecargarFks && this.estadoproformaConstantesFunciones.cargarid_color_generalEstadoProforma)) {

					if(!this.estadoproformaSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ColorGeneralConstantesFunciones.getArrayColumnasGlobalesColorGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalColorGeneral=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ColorGeneralConstantesFunciones.TABLENAME);

						finalQueryGlobalColorGeneral=Funciones.GetFinalQueryAppend(finalQueryGlobalColorGeneral, "");
						finalQueryGlobalColorGeneral+=ColorGeneralConstantesFunciones.SFINALQUERY;

						//this.cargarCombosColorGeneralsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalColorGeneral=" WHERE " + ConstantesSql.ID + "="+estadoproformaSessionBean.getlidColorGeneralActual();
					}
				} else {
					finalQueryGlobalColorGeneral="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				estadoproformaReturnGeneral=estadoproformaLogic.cargarCombosLoteForeignKeyEstadoProforma(finalQueryGlobalEmpresa,finalQueryGlobalColorGeneral);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=estadoproformaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalColorGeneral.equals("NONE")) {
				this.colorgeneralsForeignKey=estadoproformaReturnGeneral.getcolorgeneralsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoProforma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyColorGeneral();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.estadoproformaSessionBean==null) {
				this.estadoproformaSessionBean=new EstadoProformaSessionBean();
			}

			if(!this.estadoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyColorGeneral()throws Exception {
		try {

			if(!this.estadoproformaSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {
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
	
	public void initActionsCombosTodosForeignKeyEstadoProforma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoProforma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoProforma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoProforma(EstadoProforma estadoproforma)throws Exception {	
		try {
			
			this.setActualColorGeneralForeignKey(estadoproforma.getid_color_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoProforma(EstadoProforma estadoproforma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoProforma()throws Exception {	
		try {
			
			this.setActualColorGeneralForeignKey(this.estadoproformaConstantesFunciones.getid_color_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoProforma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoProforma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoProforma()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameColorGeneralsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameColorGeneralsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoProforma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma!=null && this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma!=null && this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public EstadoProformaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoProformaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoProformaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoproformaSessionBean=new EstadoProformaSessionBean(); 
		this.estadoproformaConstantesFunciones=new EstadoProformaConstantesFunciones(); 
		this.estadoproformaBean=new EstadoProforma();//(this.estadoproformaConstantesFunciones); 		
		this.estadoproformaReturnGeneral=new EstadoProformaParameterReturnGeneral(); 
		
		this.estadoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoProforma(true);
			
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
			
			this.estadoproformaConstantesFunciones=new EstadoProformaConstantesFunciones(); 
			this.estadoproformaBean=new EstadoProforma();//this.estadoproformaConstantesFunciones); 			
			this.estadoproformaReturnGeneral=new EstadoProformaParameterReturnGeneral(); 
		
			EstadoProformaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Proforma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoproforma=new EstadoProforma();
			this.estadoproformas = new ArrayList<EstadoProforma>();
			this.estadoproformasAux = new ArrayList<EstadoProforma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic=new EstadoProformaLogic();
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoProforma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoProforma);	
					}
					
					if(this.jInternalFrameImportacionEstadoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoProforma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoProforma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoProforma);
				this.jInternalFrameDetalleFormEstadoProforma.setVisible(false);
				this.jInternalFrameDetalleFormEstadoProforma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoProforma);
					this.jInternalFrameReporteDinamicoEstadoProforma.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoProforma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoProforma);
					this.jInternalFrameImportacionEstadoProforma.setVisible(false);
					this.jInternalFrameImportacionEstadoProforma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoProforma);
					this.jInternalFrameOrderByEstadoProforma.setVisible(false);
					this.jInternalFrameOrderByEstadoProforma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoProformaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoProformaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoproformaReturnGeneral=new EstadoProformaParameterReturnGeneral();
			
			this.estadoproformaParameterGeneral=new EstadoProformaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoproformaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoproformaSessionBean.getEsGuardarRelacionado(),this.estadoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoproformaSessionBean.getEsGuardarRelacionado(),this.estadoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoProforma=false;
			this.isVisibilidadCeldaDuplicarEstadoProforma=true;
			this.isVisibilidadCeldaCopiarEstadoProforma=true;
			this.isVisibilidadCeldaVerFormEstadoProforma=true;
			this.isVisibilidadCeldaOrdenEstadoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
			this.isVisibilidadCeldaModificarEstadoProforma=false;
			this.isVisibilidadCeldaActualizarEstadoProforma=false;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
			this.isVisibilidadCeldaCancelarEstadoProforma=false;
			this.isVisibilidadCeldaGuardarEstadoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=false;
			
			
			this.isVisibilidadFK_IdColorGeneral=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoProforma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoProforma(false);
			
			this.setPermisosUsuarioEstadoProforma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoproformaSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoproformaSessionBean.getEsGuardarRelacionado() && this.estadoproformaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoProformaClasesRelacionadas();
			}
			
			if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoProformaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoProforma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoProforma();
			}
			
			if(!this.isPermisoBusquedaEstadoProforma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoProforma,this.isPermisoPaginacionMedioEstadoProforma,this.isPermisoPaginacionTodoEstadoProforma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoProformaConstantesFunciones.getTiposSeleccionarEstadoProforma());
				
				this.tiposColumnasSelect=EstadoProformaConstantesFunciones.getTiposSeleccionarEstadoProforma(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoProforma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEstadoProforma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEstadoProforma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoProforma() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
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
				estadoproformaImplementable= (EstadoProformaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoproformaImplementableHome= (EstadoProformaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoproformas= new ArrayList<EstadoProforma>();
			this.estadoproformasEliminados= new ArrayList<EstadoProforma>();
						
			this.isEsNuevoEstadoProforma=false;
			this.esParaAccionDesdeFormularioEstadoProforma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoProforma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoProforma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoProformaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoProforma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoProforma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoProforma();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadoProforma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadoProforma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadoProforma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoProforma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoProforma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoProforma() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoProforma")) {
				iIndex=this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoProforma();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyEstadoProforma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoProforma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoProforma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoProformaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoProforma();
		
		this.cargarCombosFrameForeignKeyEstadoProforma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoProforma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoProforma();
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
	
	public void jButtonNuevoEstadoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
			
			if(jTableDatosEstadoProforma.getRowCount()>=1) {
				jTableDatosEstadoProforma.removeRowSelectionInterval(0, jTableDatosEstadoProforma.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoProforma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoProforma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoProforma(true);			
			//this.estadoproforma=new EstadoProforma();
			//this.estadoproforma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoProforma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoProforma() ;
			
			if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoProforma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoproforma);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);				
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
			if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoProforma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoProforma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoProforma.getSelectedRows().length;			
			}
			
			estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoProforma--;			
				//EstadoProforma estadoproformaAux= new EstadoProforma();			
				//estadoproformaAux.setId(this.iIdNuevoEstadoProforma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoProforma estadoproformaOrigen=new EstadoProforma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoProforma estadoproformaOrigen : estadoproformasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoproformaOrigen =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoproformaOrigen =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoProforma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoproforma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoProforma(estadoproformaOrigen,this.estadoproforma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoproformaLogic.getEstadoProformas().add(this.estadoproformaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoproformas.add(this.estadoproformaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoProforma(false);
				
				this.jTableDatosEstadoProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoProforma(), this.getIndiceNuevoEstadoProforma());
				
				int iLastRow =  this.jTableDatosEstadoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoProforma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();									
		
			EstadoProforma estadoproformaOrigen=new EstadoProforma();
			EstadoProforma estadoproformaDestino=new EstadoProforma();
				
			estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoProforma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoproformasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoProforma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformaOrigen =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoproformaOrigen =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoproformaDestino =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoproformaDestino =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoproformaOrigen =estadoproformasSeleccionados.get(0);
				estadoproformaDestino =estadoproformasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoProforma(estadoproformaOrigen,estadoproformaDestino,true,false);
				
				estadoproformaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoproformaDestino,estadoproformaLogic.getEstadoProformas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoproformaDestino,estadoproformas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoProforma(false);
				
				//this.jTableDatosEstadoProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoProforma(), this.getIndiceNuevoEstadoProforma());
				
				int iLastRow =  this.jTableDatosEstadoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoProforma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoProforma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoProforma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadoProforma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadoProforma.setVisible(!isVisible);
			this.jPanelPaginacionEstadoProforma.setVisible(!isVisible);
			this.jPanelAccionesEstadoProforma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoProforma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoProforma();
			
			this.abrirFrameOrderByEstadoProforma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoProforma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoProforma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoProforma.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoProforma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoProforma.setSize(this.jInternalFrameDetalleFormEstadoProforma.iWidthFormulario,this.jInternalFrameDetalleFormEstadoProforma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoProforma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoProforma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoProforma.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoProforma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoProforma.jContentPaneDetalleEstadoProforma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoProforma.jContentPaneDetalleEstadoProforma.getWidth(),EstadoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoProforma.jContentPaneDetalleEstadoProforma.getWidth(),EstadoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoProforma.jContentPaneDetalleEstadoProforma.getWidth(),EstadoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoProforma.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoProforma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoProforma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoProforma,false,this);
				} else {
					this.jInternalFrameOrderByEstadoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoProforma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoProforma);
				this.jInternalFrameOrderByEstadoProforma.setVisible(false);
				this.jInternalFrameOrderByEstadoProforma.setSelected(false);
				
				this.jInternalFrameOrderByEstadoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoProforma"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoProforma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoProforma==null) {
				
				this.jInternalFrameImportacionEstadoProforma=new ImportacionJInternalFrame(EstadoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoProforma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoProforma);
				this.jInternalFrameImportacionEstadoProforma.setVisible(false);
				this.jInternalFrameImportacionEstadoProforma.setSelected(false);


				this.jInternalFrameImportacionEstadoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoProforma"));
				this.jInternalFrameImportacionEstadoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoProforma"));
				this.jInternalFrameImportacionEstadoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoProforma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoProforma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoProforma==null) {
				this.jInternalFrameReporteDinamicoEstadoProforma=new ReporteDinamicoJInternalFrame(EstadoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoProforma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoProforma);
				this.jInternalFrameReporteDinamicoEstadoProforma.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoProforma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoProforma"));
				this.jInternalFrameReporteDinamicoEstadoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoProforma"));
				this.jInternalFrameReporteDinamicoEstadoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoProforma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoProforma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoProforma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoProforma);
			
	       	this.jInternalFrameDetalleFormEstadoProforma.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoProforma.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoProforma.dispose();
			//this.jInternalFrameDetalleFormEstadoProforma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoProforma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoProforma.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoProforma.setVisible(true);
	        this.jInternalFrameImportacionEstadoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoProforma.setVisible(true);
	        this.jInternalFrameOrderByEstadoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoProforma.setVisible(false);
	        this.jInternalFrameOrderByEstadoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoProforma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoProforma.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoProforma.setVisible(false);
	        this.jInternalFrameImportacionEstadoProforma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoProforma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoProforma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoProforma(true);
			//this.isEsNuevoEstadoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoProforma(false) ;
			
			if(estadoproformaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoProforma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoProformaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoProforma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoProforma(true);
			//this.isEsNuevoEstadoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoproforma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoProforma(false) ;
			
			if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoProforma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaColorGeneral(List<ColorGeneral> colorgeneralsForeignKey)throws Exception{
		TableColumn tableColumnColorGeneral=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL));
		TableCellEditor tableCellEditorColorGeneral =tableColumnColorGeneral.getCellEditor();

		ColorGeneralTableCell colorgeneralTableCellFk=(ColorGeneralTableCell)tableCellEditorColorGeneral;

		if(colorgeneralTableCellFk!=null) {
			colorgeneralTableCellFk.setcolorgeneralsForeignKey(colorgeneralsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEstadoProforma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//colorgeneralTableCellFk.setRowActual(intSelectedRow);
			//colorgeneralTableCellFk.setcolorgeneralsForeignKeyActual(colorgeneralsForeignKey);
		//}


		if(colorgeneralTableCellFk!=null) {
			colorgeneralTableCellFk.RecargarColorGeneralsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoProforma(false);
			
			//if(!this.isEsNuevoEstadoProforma) {								
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
				
			}
			
			if(this.permiteMantenimiento(this.estadoproforma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoProforma=true;
					this.inicializarActualizarBindingTablaEstadoProforma(false);
					this.isEsNuevoEstadoProforma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoProforma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoProforma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoProforma(false);
				
				this.habilitarDeshabilitarControlesEstadoProforma(false);
			
												
				
				if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoProforma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoProformaActionPerformed(evt,estadoproformaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoProforma(this.estadoproforma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoProforma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoproformaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoproforma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				this.estadoproforma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				this.estadoproforma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoproforma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoProformaModel) this.jTableDatosEstadoProforma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoProforma=true;
				this.inicializarActualizarBindingTablaEstadoProforma(false);
				this.isEsNuevoEstadoProforma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoProforma(false);
				
				this.habilitarDeshabilitarControlesEstadoProforma(false);
				
				
				
				if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoProforma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoProformaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoProforma.getRowCount()>=1) {
				jTableDatosEstadoProforma.removeRowSelectionInterval(0, jTableDatosEstadoProforma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoProforma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoProforma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoProforma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoProforma(false) ;
			
			this.isEsNuevoEstadoProforma=false;
			
			if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoProforma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoProforma(false);
				
				//SI ES MANUAL
				if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoProforma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoProforma--;			
			//EstadoProforma estadoproformaAux= new EstadoProforma();			
			//estadoproformaAux.setId(this.iIdNuevoEstadoProforma);
			
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoProforma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
			
			this.estadoproforma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoproformaLogic.getEstadoProformas().add(this.estadoproformaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoproformas.add(this.estadoproformaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoProforma(false);
			
			this.jTableDatosEstadoProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoProforma(), this.getIndiceNuevoEstadoProforma());
			
			int iLastRow =  this.jTableDatosEstadoProforma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoProforma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoProforma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoProforma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoProforma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoProforma(false);
			
			//SI ES MANUAL
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoProforma();
			}
			
			//this.abrirFrameTreeEstadoProforma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado ProformaS ?", "MANTENIMIENTO DE Estado Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoProforma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoProforma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoproformaReturnGeneral=estadoproformaLogic.procesarImportacionEstadoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoproformaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoProformaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoProforma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoProforma.setFileImportacion(this.jInternalFrameImportacionEstadoProforma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoProforma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoProforma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoProforma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoProforma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		

		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoProformaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoProformaBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoProformas("Todos",estadoproformasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoProformaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoProformaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoProforma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EstadoProformaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoProformaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL:
					sNombreCampoCategoria="id_color_general";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EstadoProformaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoProformaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL:
					sNombreCampoCategoriaValor="id_color_general";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoProformaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EstadoProformaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoProformaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idcolor General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_color_general");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoProformaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoproforma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EstadoProforma estadoproforma:estadoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoproforma.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoProformaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoProforma estadoproforma:estadoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoproforma.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoProformaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoProforma estadoproforma:estadoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoproforma.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL);
					iRow++;

					for(EstadoProforma estadoproforma:estadoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoproforma.getcolorgeneral_descripcion());
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
			//	this.getFilaCabeceraExportarExcelEstadoProforma(row);				
			//	iRow++;
			//}				
			
			//for(EstadoProforma estadoproformaAux:estadoproformasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoProforma(estadoproformaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoProforma(false);
			
			//SI ES MANUAL
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoProforma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoProforma(false);
			
			//SI ES MANUAL
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoProforma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoProforma(false);
			
			//SI ES MANUAL
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoProforma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoProforma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoProforma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoProforma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoProforma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoProforma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoProforma.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoProforma.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoProforma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoProforma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoProforma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoProforma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoProforma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoProforma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoProforma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoProforma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoProforma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoProforma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoProforma();
		
		this.inicializarActualizarBindingBotonesManualEstadoProforma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoProforma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoProforma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoProforma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoProforma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoProforma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoProforma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoProforma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoProforma.jCheckBoxPostAccionNuevoEstadoProforma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoProforma.jCheckBoxPostAccionSinCerrarEstadoProforma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoProforma.jCheckBoxPostAccionSinMensajeEstadoProforma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoProforma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoProforma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoProforma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
				this.jInternalFrameDetalleFormEstadoProforma.jCheckBoxPostAccionNuevoEstadoProforma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoProforma.jCheckBoxPostAccionSinCerrarEstadoProforma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoProforma.jCheckBoxPostAccionSinMensajeEstadoProforma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoProforma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoProforma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoProforma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoProforma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoProforma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoProforma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoProforma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoProforma(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoProforma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoProforma() throws Exception {
		try	{
			if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoProforma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoProforma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoProforma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoProforma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoProforma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoProforma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoProforma.addItem(reporte);
			}
			
			
			if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoProforma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoProforma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoProforma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoProforma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
				this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
				this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoProforma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoProforma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoProforma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoProforma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoProforma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoProforma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.getSelectedItem()!=null){this.id_color_generalFK_IdColorGeneral=((ColorGeneral)this.jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoProforma(Boolean esInicializar) throws Exception {				
		if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoProforma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoProforma() throws Exception {
		this.inicializarActualizarBindingTablaEstadoProforma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoProforma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoProformaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProformaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoProforma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoproformaLogic.getEstadoProformas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoproformas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoProforma.setModel(new EstadoProformaModel(this.estadoproformaLogic.getEstadoProformas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoProforma.setModel(new EstadoProformaModel(this.estadoproformas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoProforma!=null && this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoProforma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO,estadoproformaConstantesFunciones.resaltarSeleccionarEstadoProforma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO,estadoproformaConstantesFunciones.resaltarSeleccionarEstadoProforma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,EstadoProformaConstantesFunciones.LABEL_ID));

		if(this.estadoproformaConstantesFunciones.mostraridEstadoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoProformaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoproformaConstantesFunciones.resaltaridEstadoProforma,this.estadoproformaConstantesFunciones.activaridEstadoProforma,this,true,"idEstadoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoproformaConstantesFunciones.resaltaridEstadoProforma,this.estadoproformaConstantesFunciones.activaridEstadoProforma,this,true,"idEstadoProforma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,EstadoProformaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.estadoproformaConstantesFunciones.mostrarid_empresaEstadoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoProformaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.estadoproformaConstantesFunciones.resaltarid_empresaEstadoProforma,this,this.estadoproformaConstantesFunciones.activarid_empresaEstadoProforma));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.estadoproformaConstantesFunciones.resaltarid_empresaEstadoProforma,this,this.estadoproformaConstantesFunciones.activarid_empresaEstadoProforma,false,"id_empresaEstadoProforma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,EstadoProformaConstantesFunciones.LABEL_CODIGO));

		if(this.estadoproformaConstantesFunciones.mostrarcodigoEstadoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoProformaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoproformaConstantesFunciones.resaltarcodigoEstadoProforma,this.estadoproformaConstantesFunciones.activarcodigoEstadoProforma,this,true,"codigoEstadoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoproformaConstantesFunciones.resaltarcodigoEstadoProforma,this.estadoproformaConstantesFunciones.activarcodigoEstadoProforma,this,true,"codigoEstadoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,EstadoProformaConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoproformaConstantesFunciones.mostrarnombreEstadoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoProformaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoproformaConstantesFunciones.resaltarnombreEstadoProforma,this.estadoproformaConstantesFunciones.activarnombreEstadoProforma,this,true,"nombreEstadoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoproformaConstantesFunciones.resaltarnombreEstadoProforma,this.estadoproformaConstantesFunciones.activarnombreEstadoProforma,this,true,"nombreEstadoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL));

		if(this.estadoproformaConstantesFunciones.mostrarid_color_generalEstadoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ColorGeneralTableCell(this.colorgeneralsForeignKey,this.estadoproformaConstantesFunciones.resaltarid_color_generalEstadoProforma,this,this.estadoproformaConstantesFunciones.activarid_color_generalEstadoProforma));
			tableColumn.setCellEditor(new ColorGeneralTableCell(this.colorgeneralsForeignKey,this.estadoproformaConstantesFunciones.resaltarid_color_generalEstadoProforma,this,this.estadoproformaConstantesFunciones.activarid_color_generalEstadoProforma,true,"id_color_generalEstadoProforma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoproformaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoProforma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoproformaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoProforma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoproformaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoproformaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoProforma.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoProforma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoProforma.moveColumn(this.jTableDatosEstadoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoProforma.moveColumn(this.jTableDatosEstadoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoProforma.moveColumn(this.jTableDatosEstadoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoProforma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoProforma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoProforma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoProforma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoProforma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoProforma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoProforma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoProforma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoproformaLogic.getEstadoProformas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoproformas.size()-1;
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
		//this.jTableDatosEstadoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoProforma();
			
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
				
				//this.isEsNuevoEstadoProforma=false;
					
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
				if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoProforma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoProforma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoproforma.getsType().equals("DUPLICADO")
				   || this.estadoproforma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoProforma=true;
				
				} else {
					this.isEsNuevoEstadoProforma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoproforma.getId()>=0 && !this.estadoproforma.getIsNew()) {						
						this.isEsNuevoEstadoProforma=false;
						
					} else {
						this.isEsNuevoEstadoProforma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoProforma(esRelaciones);						
				
				this.seleccionarEstadoProforma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoproforma.getId()<0) {
					this.isEsNuevoEstadoProforma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoProforma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoProforma(evt,rowIndex);
				}	
				
				if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoProforma: " + this.dDif); 
					}
				}								
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoProforma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoproforma)) {
					if(this.estadoproforma.getId()>0) {
						this.estadoproforma.setIsDeleted(true);
						
						this.estadoproformasEliminados.add(this.estadoproforma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoproformaLogic.getEstadoProformas().remove(this.estadoproforma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoproformas.remove(this.estadoproforma);				
					}
					
					
					((EstadoProformaModel) this.jTableDatosEstadoProforma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoProforma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoProforma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoProforma) {
			
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoProforma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoProforma(this.estadoproforma);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.estadoproformaConstantesFunciones.cargarid_empresaEstadoProforma || this.estadoproformaConstantesFunciones.event_dependid_empresaEstadoProforma) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.estadoproforma.getid_empresa());
									//this.inicializarActualizarBindingEstadoProforma(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(estadoproforma.getEmpresa()!=null) {
							this.empresasForeignKey.add(estadoproforma.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.estadoproforma.getid_empresa(),false,"Formulario");

					//ColorGeneral
					if(!this.estadoproformaConstantesFunciones.cargarid_color_generalEstadoProforma || this.estadoproformaConstantesFunciones.event_dependid_color_generalEstadoProforma) {
						//this.cargarCombosColorGeneralsForeignKeyLista(" where id="+this.estadoproforma.getid_color_general());
									//this.inicializarActualizarBindingEstadoProforma(false,false);
						this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>();

						if(estadoproforma.getColorGeneral()!=null) {
							this.colorgeneralsForeignKey.add(estadoproforma.getColorGeneral());
						}

						this.addItemDefectoCombosForeignKeyColorGeneral();
						this.cargarCombosFrameColorGeneralsForeignKey("Todos");
					}
					this.setActualColorGeneralForeignKey(this.estadoproforma.getid_color_general(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoProforma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoProforma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoProforma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoProforma(EstadoProforma estadoproforma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoProforma(estadoproforma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoProforma(EstadoProforma estadoproforma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoProforma(estadoproforma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoProforma(estadoproforma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoProforma(estadoproforma);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoProforma(EstadoProforma estadoproforma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.setText(estadoproforma.getId().toString());
			this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.setText(estadoproforma.getcodigo());
			this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.setText(estadoproforma.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoProforma estadoproformaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoproformaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoProforma estadoproformaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoproformaLocal=this.estadoproforma;
			} else {
				estadoproformaLocal=this.estadoproformaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoproformaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoProforma(estadoproformaLocal,true);
					
					if(estadoproformaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoproformaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoproformaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoProforma(EstadoProforma estadoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoProforma(estadoproforma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(estadoproforma);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoProforma(EstadoProforma estadoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoProforma(estadoproforma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoProforma(EstadoProforma estadoproforma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.getText()==null || this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.getText()=="" || this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.setText("0");
			}

			if(conColumnasBase) {estadoproforma.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoProformaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoProforma.jLabelIdEstadoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoproforma.setcodigo(this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoProformaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoProforma.jLabelcodigoEstadoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoproforma.setnombre(this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoProformaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoProforma.jLabelnombreEstadoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoProforma(EstadoProforma estadoproformaBean,EstadoProforma estadoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && estadoproformaBean.getid_color_general()!=null && !estadoproformaBean.getid_color_general().equals(-1L))) {estadoproforma.setid_color_general(estadoproformaBean.getid_color_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoProforma(EstadoProforma estadoproformaOrigen,EstadoProforma estadoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoproformaOrigen.getId()!=null && !estadoproformaOrigen.getId().equals(0L))) {estadoproforma.setId(estadoproformaOrigen.getId());}}
			if(conDefault || (!conDefault && estadoproformaOrigen.getcodigo()!=null && !estadoproformaOrigen.getcodigo().equals(""))) {estadoproforma.setcodigo(estadoproformaOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoproformaOrigen.getnombre()!=null && !estadoproformaOrigen.getnombre().equals(""))) {estadoproforma.setnombre(estadoproformaOrigen.getnombre());}
			if(conDefault || (!conDefault && estadoproformaOrigen.getid_color_general()!=null && !estadoproformaOrigen.getid_color_general().equals(-1L))) {estadoproforma.setid_color_general(estadoproformaOrigen.getid_color_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoProforma(EstadoProforma estadoproforma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.setText(estadoproforma.getId().toString());
			this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.setText(estadoproforma.getcodigo());
			this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.setText(estadoproforma.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoProforma(EstadoProformaBean estadoproformaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.setText(estadoproformaBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.setText(estadoproformaBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.setText(estadoproformaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoProforma(EstadoProformaParameterReturnGeneral estadoproformaReturnGeneral,EstadoProformaBean estadoproformaBean,Boolean conDefault) throws Exception { 
		try {
			EstadoProforma estadoproformaLocal=new EstadoProforma();
			
			estadoproformaLocal=estadoproformaReturnGeneral.getEstadoProforma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoproformaLocal.getId()!=null && !estadoproformaLocal.getId().equals(0L))) {estadoproformaBean.setId(estadoproformaLocal.getId());}}
			if(conDefault || (!conDefault && estadoproformaLocal.getcodigo()!=null && !estadoproformaLocal.getcodigo().equals(""))) {estadoproformaBean.setcodigo(estadoproformaLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoproformaLocal.getnombre()!=null && !estadoproformaLocal.getnombre().equals(""))) {estadoproformaBean.setnombre(estadoproformaLocal.getnombre());}
			if(conDefault || (!conDefault && estadoproformaLocal.getid_color_general()!=null && !estadoproformaLocal.getid_color_general().equals(-1L))) {estadoproformaBean.setid_color_general(estadoproformaLocal.getid_color_general());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoProformaGenerico(Long idEstadoProformaSeleccionado,JComboBox jComboBoxEstadoProforma,List<EstadoProforma> estadoproformasLocal)throws Exception {
		try {
			EstadoProforma  estadoproformaTemp=null;

			for(EstadoProforma estadoproformaAux:estadoproformasLocal) {
				if(estadoproformaAux.getId()!=null && estadoproformaAux.getId().equals(idEstadoProformaSeleccionado)) {
					estadoproformaTemp=estadoproformaAux;
					break;
				}
			}

			jComboBoxEstadoProforma.setSelectedItem(estadoproformaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoProformaGenerico(JComboBox jComboBoxEstadoProforma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoProforma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoProforma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoproforma=(EstadoProforma) estadoproformaLogic.getEstadoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoproforma =(EstadoProforma) estadoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!estadoproforma.getIsNew() && !estadoproforma.getIsChanged() && !estadoproforma.getIsDeleted()) {
				sDescripcion=estadoproforma.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=estadoproforma.getempresa_descripcion();
			}
		}

		if(sTipo.equals("ColorGeneral")) {
			//sDescripcion=this.getActualColorGeneralForeignKeyDescripcion((Long)value);
			if(!estadoproforma.getIsNew() && !estadoproforma.getIsChanged() && !estadoproforma.getIsDeleted()) {
				sDescripcion=estadoproforma.getcolorgeneral_descripcion();
			} else {
				//sDescripcion=this.getActualColorGeneralForeignKeyDescripcion((Long)value);
				sDescripcion=estadoproforma.getcolorgeneral_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoProforma estadoproformaRow=new EstadoProforma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoproformaRow=(EstadoProforma) estadoproformaLogic.getEstadoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoproformaRow=(EstadoProforma) estadoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoProforma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoProforma && this.isPermisoNuevoEstadoProforma));			
			this.jButtonDuplicarEstadoProforma.setVisible((this.isVisibilidadCeldaDuplicarEstadoProforma && this.isPermisoDuplicarEstadoProforma));			
			this.jButtonCopiarEstadoProforma.setVisible((this.isVisibilidadCeldaCopiarEstadoProforma && this.isPermisoCopiarEstadoProforma));
			this.jButtonVerFormEstadoProforma.setVisible((this.isVisibilidadCeldaVerFormEstadoProforma && this.isPermisoVerFormEstadoProforma));
			
			this.jButtonAbrirOrderByEstadoProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoProforma && this.isPermisoOrdenEstadoProforma));			
			
			this.jButtonNuevoRelacionesEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoProforma && this.isPermisoNuevoEstadoProforma));			
			this.jButtonNuevoGuardarCambiosEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoProforma && this.isPermisoNuevoEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));
			
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarEstadoProforma.setVisible((this.isVisibilidadCeldaModificarEstadoProforma && this.isPermisoActualizarEstadoProforma));	
			this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarEstadoProforma.setVisible((this.isVisibilidadCeldaActualizarEstadoProforma && this.isPermisoActualizarEstadoProforma));	
			this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarEstadoProforma.setVisible((this.isVisibilidadCeldaEliminarEstadoProforma && this.isPermisoEliminarEstadoProforma));
			this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarEstadoProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoProforma);							
			this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoProforma && this.isPermisoNuevoEstadoProforma));						
			this.jButtonDuplicarToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaDuplicarEstadoProforma && this.isPermisoDuplicarEstadoProforma));						
			this.jButtonCopiarToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaCopiarEstadoProforma && this.isPermisoCopiarEstadoProforma));			
			this.jButtonVerFormToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaVerFormEstadoProforma && this.isPermisoVerFormEstadoProforma));			
			this.jButtonAbrirOrderByToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoProforma && this.isPermisoOrdenEstadoProforma));
			this.jButtonNuevoRelacionesToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoProforma && this.isPermisoNuevoEstadoProforma));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoProforma && this.isPermisoNuevoEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));			
			
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaModificarEstadoProforma && this.isPermisoActualizarEstadoProforma));	
			this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaActualizarEstadoProforma  && this.isPermisoActualizarEstadoProforma));	
			this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaEliminarEstadoProforma && this.isPermisoEliminarEstadoProforma));
			this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarToolBarEstadoProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoProforma);				
			this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoProforma && this.isPermisoNuevoEstadoProforma));			
			this.jMenuItemDuplicarEstadoProforma.setVisible((this.isVisibilidadCeldaDuplicarEstadoProforma && this.isPermisoDuplicarEstadoProforma));			
			this.jMenuItemCopiarEstadoProforma.setVisible((this.isVisibilidadCeldaCopiarEstadoProforma && this.isPermisoCopiarEstadoProforma));			
			this.jMenuItemVerFormEstadoProforma.setVisible((this.isVisibilidadCeldaVerFormEstadoProforma && this.isPermisoVerFormEstadoProforma));			
			this.jMenuItemAbrirOrderByEstadoProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoProforma && this.isPermisoOrdenEstadoProforma));			
			//this.jMenuItemMostrarOcultarEstadoProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoProforma && this.isPermisoOrdenEstadoProforma));
			this.jMenuItemDetalleAbrirOrderByEstadoProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoProforma && this.isPermisoOrdenEstadoProforma));			
			//this.jMenuItemDetalleMostrarOcultarEstadoProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoProforma && this.isPermisoOrdenEstadoProforma));			
			this.jMenuItemNuevoRelacionesEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoProforma && this.isPermisoNuevoEstadoProforma));			
			this.jMenuItemNuevoGuardarCambiosEstadoProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoProforma && this.isPermisoNuevoEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));									
			
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemModificarEstadoProforma.setVisible((this.isVisibilidadCeldaModificarEstadoProforma && this.isPermisoActualizarEstadoProforma));	
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemActualizarEstadoProforma.setVisible((this.isVisibilidadCeldaActualizarEstadoProforma && this.isPermisoActualizarEstadoProforma));	
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemEliminarEstadoProforma.setVisible((this.isVisibilidadCeldaEliminarEstadoProforma && this.isPermisoEliminarEstadoProforma));
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemCancelarEstadoProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoProforma);				
			}
			
			this.jMenuItemGuardarCambiosEstadoProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));						
			this.jMenuItemGuardarCambiosTablaEstadoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoProforma=this.jButtonNuevoEstadoProforma.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoProforma=this.jButtonDuplicarEstadoProforma.isVisible();
			this.isVisibilidadCeldaCopiarEstadoProforma=this.jButtonCopiarEstadoProforma.isVisible();
			this.isVisibilidadCeldaVerFormEstadoProforma=this.jButtonVerFormEstadoProforma.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoProforma=this.jButtonAbrirOrderByEstadoProforma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=this.jButtonNuevoRelacionesEstadoProforma.isVisible();
			this.isVisibilidadCeldaModificarEstadoProforma=this.jButtonModificarEstadoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.isVisibilidadCeldaActualizarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarEstadoProforma.isVisible();
			this.isVisibilidadCeldaEliminarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarEstadoProforma.isVisible();
			this.isVisibilidadCeldaCancelarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarEstadoProforma.isVisible();
			this.isVisibilidadCeldaGuardarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=this.jButtonGuardarCambiosTablaEstadoProforma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoProforma=this.jButtonNuevoToolBarEstadoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=this.jButtonNuevoRelacionesToolBarEstadoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.isVisibilidadCeldaModificarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarToolBarEstadoProforma.isVisible();
			this.isVisibilidadCeldaActualizarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarToolBarEstadoProforma.isVisible();
			this.isVisibilidadCeldaEliminarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarToolBarEstadoProforma.isVisible();
			this.isVisibilidadCeldaCancelarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarToolBarEstadoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoProforma=this.jButtonGuardarCambiosToolBarEstadoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=this.jButtonGuardarCambiosTablaToolBarEstadoProforma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoProforma=this.jMenuItemNuevoEstadoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=this.jMenuItemNuevoRelacionesEstadoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.isVisibilidadCeldaModificarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jMenuItemModificarEstadoProforma.isVisible();
			this.isVisibilidadCeldaActualizarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jMenuItemActualizarEstadoProforma.isVisible();
			this.isVisibilidadCeldaEliminarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jMenuItemEliminarEstadoProforma.isVisible();
			this.isVisibilidadCeldaCancelarEstadoProforma=this.jInternalFrameDetalleFormEstadoProforma.jMenuItemCancelarEstadoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoProforma=this.jMenuItemGuardarCambiosEstadoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=this.jMenuItemGuardarCambiosTablaEstadoProforma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoProforma(Boolean esInicializar) {
		if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoProforma();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoProforma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoProforma() {
		this.jButtonNuevoEstadoProforma.setVisible(this.isPermisoNuevoEstadoProforma);			
		this.jButtonDuplicarEstadoProforma.setVisible(this.isPermisoDuplicarEstadoProforma);			
		this.jButtonCopiarEstadoProforma.setVisible(this.isPermisoCopiarEstadoProforma);			
		this.jButtonVerFormEstadoProforma.setVisible(this.isPermisoVerFormEstadoProforma);			
		
		this.jButtonAbrirOrderByEstadoProforma.setVisible(this.isPermisoOrdenEstadoProforma);					
		
		this.jButtonNuevoRelacionesEstadoProforma.setVisible(this.isPermisoNuevoEstadoProforma);			
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarEstadoProforma.setVisible(this.isPermisoActualizarEstadoProforma);	
			this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarEstadoProforma.setVisible(this.isPermisoActualizarEstadoProforma);	
			this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarEstadoProforma.setVisible(this.isPermisoEliminarEstadoProforma);
			this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarEstadoProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoProforma);						
			this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.setVisible(this.isPermisoGuardarCambiosEstadoProforma);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoProforma.setVisible(this.isPermisoActualizarEstadoProforma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoProforma() {
		this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarEstadoProforma.setVisible(this.isPermisoActualizarEstadoProforma);	
		this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarEstadoProforma.setVisible(this.isPermisoActualizarEstadoProforma);	
		this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarEstadoProforma.setVisible(this.isPermisoEliminarEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarEstadoProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoProforma);							
		this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoProforma && this.isPermisoGuardarCambiosEstadoProforma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoProforma() {
		if(EstadoProformaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoProforma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoProforma() {
	}
	
	public void jTableDatosEstadoProformaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoProforma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoProforma(this.getestadoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoproforma==null) {
						this.estadoproforma = new EstadoProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
				}

				if(this.estadoproforma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoproforma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEstadoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEstadoProforma(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadoProforma(this.getestadoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.estadoproformaLogic.getConnexion());

				if(this.estadoproforma.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.estadoproforma.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadoProforma=(TitledBorder)this.jScrollPanelDatosEstadoProforma.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEstadoProforma.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEstadoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoProforma(this.getestadoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoproforma==null) {
						this.estadoproforma = new EstadoProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
				}

				if(this.estadoproforma.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.estadoproforma.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoProforma(this.getestadoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoproforma==null) {
						this.estadoproforma = new EstadoProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
				}

				if(this.estadoproforma.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoproforma.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoProforma(this.getestadoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoproforma==null) {
						this.estadoproforma = new EstadoProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
				}

				if(this.estadoproforma.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoproforma.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_color_generalEstadoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocolorgeneral=true;

			idTienePermisocolorgeneral=this.tienePermisosUsuarioEnPaginaWebEstadoProforma(ColorGeneralConstantesFunciones.CLASSNAME);

			if(idTienePermisocolorgeneral) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadoProforma(this.getestadoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);

				this.colorgeneralBeanSwingJInternalFrame=new ColorGeneralBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.colorgeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.colorgeneralBeanSwingJInternalFrame.getColorGeneralLogic().setConnexion(this.estadoproformaLogic.getConnexion());

				if(this.estadoproforma.getid_color_general()!=null) {
					this.colorgeneralBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.colorgeneralBeanSwingJInternalFrame.setIdActual(this.estadoproforma.getid_color_general());
					this.colorgeneralBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.colorgeneralBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.colorgeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorGeneral();
				}

				JInternalFrameBase jinternalFrame =this.colorgeneralBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadoProforma=(TitledBorder)this.jScrollPanelDatosEstadoProforma.getBorder();
				TitledBorder titledBordercolorgeneral=(TitledBorder)this.colorgeneralBeanSwingJInternalFrame.jScrollPanelDatosColorGeneral.getBorder();

				titledBordercolorgeneral.setTitle(titledBorderEstadoProforma.getTitle() + " -> Color");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_color_generalEstadoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoProforma(this.getestadoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoproforma==null) {
						this.estadoproforma = new EstadoProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);
				}

				if(this.estadoproforma.getid_color_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_color_general = "+this.estadoproforma.getid_color_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdColorGeneralEstadoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadoProforma(false,false);

			this.getEstadoProformasFK_IdColorGeneral();

			this.inicializarActualizarBindingEstadoProforma(false);

			//if(EstadoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEstadoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadoProforma(false,false);

			this.getEstadoProformasFK_IdEmpresa();

			this.inicializarActualizarBindingEstadoProforma(false);

			//if(EstadoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadoProforma() {
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
			this.jInternalFrameDetalleFormEstadoProforma.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoProforma.dispose();
			this.jInternalFrameDetalleFormEstadoProforma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
			this.jInternalFrameReporteDinamicoEstadoProforma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoProforma.dispose();
			this.jInternalFrameReporteDinamicoEstadoProforma=null;
		}
		
		if(this.jInternalFrameImportacionEstadoProforma!=null) {
			this.jInternalFrameImportacionEstadoProforma.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoProforma.dispose();
			this.jInternalFrameImportacionEstadoProforma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoProforma();
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoProforma")) {
				jButtonDuplicarEstadoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoProforma")) {
				jButtonCopiarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoProforma")) {
				jButtonVerFormEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoProforma")) {
				jButtonDuplicarEstadoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoProforma")) {
				jButtonDuplicarEstadoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoProforma")) {
				jButtonModificarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoProforma")) {
				jButtonModificarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoProforma")) {
				jButtonModificarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoProforma")) {
				jButtonActualizarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoProforma")) {
				jButtonActualizarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoProforma")) {
				jButtonActualizarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoProforma")) {
				jButtonEliminarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoProforma")) {
				jButtonEliminarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoProforma")) {
				jButtonEliminarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoProforma")) {
				jButtonCancelarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoProforma")) {
				jButtonCancelarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoProforma")) {
				jButtonCancelarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoProforma")) {
				jButtonCerrarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoProforma")) {
				jButtonCerrarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoProforma")) {
				jButtonCerrarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoProforma")) {
				jButtonMostrarOcultarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoProforma")) {
				jButtonCancelarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoProforma")) {
				jButtonCopiarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoProforma")) {
				jButtonVerFormEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoProforma")) {
				jButtonCopiarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoProforma")) {
				jButtonVerFormEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoProforma")) {
				jButtonRecargarInformacionEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoProforma")) {
				jButtonRecargarInformacionEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoProforma")) {
				jButtonRecargarInformacionEstadoProformaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoProforma")) {
				jButtonAnterioresEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoProforma")) {
				jButtonAnterioresEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoProforma")) {
				jButtonAnterioresEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoProforma")) {
				jButtonSiguientesEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoProforma")) {
				jButtonSiguientesEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoProforma")) {
				jButtonSiguientesEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoProforma") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoProforma")) {
				jButtonAbrirOrderByEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoProforma") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoProforma")) {
				jButtonMostrarOcultarEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoProforma")) {
				jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoProforma")) {
				jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoProforma")) {
				jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoProforma")) {
				jButtonCerrarReporteDinamicoEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoProforma")) {
				jButtonGenerarReporteDinamicoEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoProforma")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoProforma")) {
				jButtonCerrarImportacionEstadoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoProforma")) {
				
				jButtonGenerarImportacionEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoProforma")) {
				
				jButtonAbrirImportacionEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoProforma")) {
				jComboBoxTiposAccionesEstadoProformaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoProforma")) {
				jComboBoxTiposRelacionesEstadoProformaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoProforma")) {
				jComboBoxTiposAccionesEstadoProformaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoProforma")) {
				
				jComboBoxTiposSeleccionarEstadoProformaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoProforma")) {
				jTextFieldValorCampoGeneralEstadoProformaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoProforma")) {
				jButtonAbrirOrderByEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoProforma")) {
				jButtonAbrirOrderByEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoProforma")) {
				jButtonCerrarOrderByEstadoProformaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoProformaBusqueda")) {
				this.jButtonidEstadoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadoProformaUpdate")) {
				this.jButtonid_empresaEstadoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadoProformaBusqueda")) {
				this.jButtonid_empresaEstadoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoProformaBusqueda")) {
				this.jButtoncodigoEstadoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoProformaBusqueda")) {
				this.jButtonnombreEstadoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_color_generalEstadoProformaUpdate")) {
				this.jButtonid_color_generalEstadoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_color_generalEstadoProformaBusqueda")) {
				this.jButtonid_color_generalEstadoProformaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdColorGeneralEstadoProforma")) {
				this.jButtonFK_IdColorGeneralEstadoProformaActionPerformed(evt);
			}
			
			;
			
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoProforma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoProforma estadoproformaLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoproformaLocal=this.estadoproforma;
			} else {
				estadoproformaLocal=this.estadoproformaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
							
				
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
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
			
			


			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
								
						
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
								
				
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
							
				
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoproformaAnterior =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoproformaAnterior =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
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
			
			


			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
								
				
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoProforma")) {
					jCheckBoxSeleccionarTodosEstadoProformaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoProforma")) {
					jCheckBoxSeleccionadosEstadoProformaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoProforma")) {
					
				}
				
				


				
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
												
				
				


				
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoproformaAnterior =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoproformaAnterior =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoProformaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
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
			
			


			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoproforma);
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
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
				
				


				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoProforma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoproformaAnterior =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoProforma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoProforma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoproforma =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoproforma =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoproforma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoProforma")) {
				
				}
				
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoProforma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoProforma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoProforma")) {
			
			}
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoProforma();
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoProforma")) {
				jButtonDuplicarEstadoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoProforma")) {
				jButtonCopiarEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoProforma")) {
				jButtonVerFormEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoProforma")) {
				jButtonNuevoEstadoProformaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoProforma")) {
				jButtonModificarEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoProforma")) {
				jButtonActualizarEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoProforma")) {
				jButtonEliminarEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoProforma")) {
				jButtonCancelarEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoProforma")) {
				jButtonCerrarEstadoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoProforma")) {
				jButtonGuardarCambiosEstadoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoProforma")) {
				jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoProforma")) {
				jButtonAbrirOrderByEstadoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoProforma")) {
				jButtonRecargarInformacionEstadoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoProforma")) {
				jButtonAnterioresEstadoProformaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoProforma")) {
				jButtonSiguientesEstadoProformaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoProformaBusqueda")) {
				this.jButtonidEstadoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadoProformaUpdate")) {
				this.jButtonid_empresaEstadoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadoProformaBusqueda")) {
				this.jButtonid_empresaEstadoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoProformaBusqueda")) {
				this.jButtoncodigoEstadoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoProformaBusqueda")) {
				this.jButtonnombreEstadoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_color_generalEstadoProformaUpdate")) {
				this.jButtonid_color_generalEstadoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_color_generalEstadoProformaBusqueda")) {
				this.jButtonid_color_generalEstadoProformaBusquedaActionPerformed(evt);
			}
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoProforma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoProforma")) {
				closingInternalFrameEstadoProforma();
				
			} else if(sTipo.equals("jButtonCancelarEstadoProforma")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoProforma = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoProformaBeanSwingJInternalFrame jInternalFrameParent=(EstadoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoProforma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoProformaActionPerformed(null);
			}
			
			EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoproforma,new Object(),this.estadoproformaParameterGeneral,this.estadoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoproforma)) {
			if(!esControlTabla) {
				if(EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);			
				}
				
				if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoProforma(this.estadoproforma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoproformaReturnGeneral=estadoproformaLogic.procesarEventosEstadoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoproformaLogic.getEstadoProformas(),this.estadoproforma,this.estadoproformaParameterGeneral,this.isEsNuevoEstadoProforma,classes);//this.estadoproformaLogic.getEstadoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoProforma(this.estadoproformaReturnGeneral,this.estadoproformaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoProforma(classes,this.estadoproformaReturnGeneral,this.estadoproformaBean,false);
					}
						
					if(this.estadoproformaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoProforma(this.estadoproformaReturnGeneral.getEstadoProforma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoProforma(this.estadoproformaReturnGeneral.getEstadoProforma());	
					}
						
					if(this.estadoproformaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoProforma(this.estadoproformaReturnGeneral.getEstadoProforma(),classes);//this.estadoproformaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoProforma(this.estadoproforma,classes);//this.estadoproformaBean);									
				}
			
				if(EstadoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoProforma(this.estadoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoProforma(this.estadoproforma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoproformaAnterior!=null) {
						this.estadoproforma=this.estadoproformaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoproformaReturnGeneral=estadoproformaLogic.procesarEventosEstadoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoproformaLogic.getEstadoProformas(),this.estadoproforma,this.estadoproformaParameterGeneral,this.isEsNuevoEstadoProforma,classes);//this.estadoproformaLogic.getEstadoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoproformaReturnGeneral.getEstadoProforma(),estadoproformaLogic.getEstadoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoproformaReturnGeneral.getEstadoProforma(),this.estadoproformas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoProforma.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoProforma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoProforma();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoProforma() throws Exception {
		
		EstadoProformaModel estadoproformaModel=(EstadoProformaModel)this.jTableDatosEstadoProforma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoproformaModel.estadoproformas=this.estadoproformaLogic.getEstadoProformas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoproformaModel.estadoproformas=this.estadoproformas;
		}
		
		
		((EstadoProformaModel) this.jTableDatosEstadoProforma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoProforma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoproformaAnterior(),this.estadoproformaLogic.getEstadoProformas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoproformaAnterior(),this.estadoproformas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoProforma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoProforma(EstadoProforma estadoproforma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
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
										
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoproforma,new Object(),generalEntityParameterGeneral,this.estadoproformaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoProformaConstantesFunciones.getClassesRelationshipsOfEstadoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoProformaConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoProforma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoproforma,new Object(),generalEntityParameterGeneral,this.estadoproformaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoProforma(EstadoProformaBean estadoproformaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoProforma(ArrayList<Classe> classes,EstadoProformaReturnGeneral estadoproformaReturnGeneral,EstadoProformaBean estadoproformaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoProforma(EstadoProforma estadoproforma,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadoproforma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoProforma = new EstadoProformaDetalleFormJInternalFrame(jDesktopPane,this.estadoproformaSessionBean.getConGuardarRelaciones(),this.estadoproformaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.setVisible(false);
		this.jInternalFrameDetalleFormEstadoProforma.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoProforma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoProforma.estadoproformaLogic=this.estadoproformaLogic;
		
		this.cargarCombosFrameForeignKeyEstadoProforma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoProforma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoProforma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoProforma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoProforma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoProforma"));
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarEstadoProforma.addActionListener(new ButtonActionListener(this,"ModificarEstadoProforma"));

		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarToolBarEstadoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoProforma"));
					
		this.jInternalFrameDetalleFormEstadoProforma.jMenuItemModificarEstadoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarEstadoProforma.addActionListener (new ButtonActionListener(this,"ActualizarEstadoProforma"));
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarToolBarEstadoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoProforma"));
						
		this.jInternalFrameDetalleFormEstadoProforma.jMenuItemActualizarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarEstadoProforma.addActionListener (new ButtonActionListener(this,"EliminarEstadoProforma"));
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoProforma"));
								
		this.jInternalFrameDetalleFormEstadoProforma.jMenuItemEliminarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarEstadoProforma.addActionListener (new ButtonActionListener(this,"CancelarEstadoProforma"));
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoProforma"));
					
		this.jInternalFrameDetalleFormEstadoProforma.jMenuItemCancelarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoProforma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jMenuItemDetalleCerrarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoProforma"));
		
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoProforma"));
		
		
		
		this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoProforma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonidEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_empresaEstadoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_empresaEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtoncodigoEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonnombreEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_color_generalEstadoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_color_generalEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoProformaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoProforma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoProforma"));
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoProforma"));
		}
		
		this.jTableDatosEstadoProforma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoProforma"));
		
		this.jTableDatosEstadoProforma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoProforma"));
		
		this.jButtonNuevoEstadoProforma.addActionListener(new ButtonActionListener(this,"NuevoEstadoProforma"));
		
		this.jButtonDuplicarEstadoProforma.addActionListener(new ButtonActionListener(this,"DuplicarEstadoProforma"));
		
		this.jButtonCopiarEstadoProforma.addActionListener(new ButtonActionListener(this,"CopiarEstadoProforma"));
		
		this.jButtonVerFormEstadoProforma.addActionListener(new ButtonActionListener(this,"VerFormEstadoProforma"));
		
		
		this.jButtonNuevoToolBarEstadoProforma.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoProforma"));
			
		this.jButtonDuplicarToolBarEstadoProforma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoProforma"));
			
		this.jMenuItemNuevoEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoProforma"));
			
		this.jMenuItemDuplicarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoProforma"));		
		
		
		this.jButtonNuevoRelacionesEstadoProforma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoProforma"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoProforma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoProforma"));
			
		this.jMenuItemNuevoRelacionesEstadoProforma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarEstadoProforma.addActionListener(new ButtonActionListener(this,"ModificarEstadoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonModificarToolBarEstadoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoProforma"));
			
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemModificarEstadoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarEstadoProforma.addActionListener (new ButtonActionListener(this,"ActualizarEstadoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonActualizarToolBarEstadoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoProforma"));
				
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemActualizarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarEstadoProforma.addActionListener (new ButtonActionListener(this,"EliminarEstadoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonEliminarToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoProforma"));
						
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemEliminarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarEstadoProforma.addActionListener (new ButtonActionListener(this,"CancelarEstadoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonCancelarToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoProforma"));
			
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemCancelarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoProforma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoProforma"));		
		
		
		this.jButtonCerrarEstadoProforma.addActionListener (new ButtonActionListener(this,"CerrarEstadoProforma"));
		
		
		this.jButtonCerrarToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoProforma"));
			
		this.jMenuItemCerrarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoProforma"));
			
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jMenuItemDetalleCerrarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoProforma"));
		}
		
		this.jButtonCopiarToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoProforma"));
			
		this.jButtonVerFormToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoProforma"));
		
		this.jMenuItemGuardarCambiosEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoProforma"));
			
		this.jMenuItemCopiarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoProforma"));		
		
		this.jMenuItemVerFormEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoProforma"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoProforma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoProforma"));
			
		this.jMenuItemGuardarCambiosTablaEstadoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoProforma"));		
		
		
		
		this.jButtonRecargarInformacionEstadoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoProforma"));
					
		this.jButtonRecargarInformacionToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoProforma"));
		
		this.jMenuItemRecargarInformacionEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoProforma"));		
		
		
		
		this.jButtonAnterioresEstadoProforma.addActionListener (new ButtonActionListener(this,"AnterioresEstadoProforma"));
		
		
		this.jButtonAnterioresToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoProforma"));
		
		this.jMenuItemAnterioresEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoProforma"));		
		
		
		this.jButtonSiguientesEstadoProforma.addActionListener (new ButtonActionListener(this,"SiguientesEstadoProforma"));
		
		
		this.jButtonSiguientesToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoProforma"));
			
		this.jMenuItemSiguientesEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoProforma"));
			
		this.jMenuItemAbrirOrderByEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoProforma"));
			
		this.jMenuItemMostrarOcultarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoProforma"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoProforma"));
			
		this.jMenuItemDetalleMostarOcultarEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoProforma"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoProforma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoProforma"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoProforma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoProforma"));

		this.jCheckBoxSeleccionadosEstadoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoProforma"));
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoProforma"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoProforma.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoProforma"));
			
		this.jComboBoxTiposAccionesEstadoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoProforma"));
					
		this.jComboBoxTiposSeleccionarEstadoProforma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoProforma"));
			
		this.jTextFieldValorCampoGeneralEstadoProforma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonidEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_empresaEstadoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_empresaEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtoncodigoEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonnombreEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_color_generalEstadoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_color_generalEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoProformaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdColorGeneralEstadoProforma.addActionListener(new ButtonActionListener(this,"FK_IdColorGeneralEstadoProforma"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoProforma!=null) {
				this.jInternalFrameReporteDinamicoEstadoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoProforma"));
				this.jInternalFrameReporteDinamicoEstadoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoProforma"));
				this.jInternalFrameReporteDinamicoEstadoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoProforma"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoProforma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoProforma"));				
			//this.jButtonGenerarReporteDinamicoEstadoProforma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoProforma"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoProforma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoProforma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoProforma!=null) {
				this.jInternalFrameImportacionEstadoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoProforma"));
				this.jInternalFrameImportacionEstadoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoProforma"));
				this.jInternalFrameImportacionEstadoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoProforma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoProforma"));
			
			this.jButtonAbrirOrderByToolBarEstadoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoProforma"));			
			
			if(this.jInternalFrameOrderByEstadoProforma!=null) {
				this.jInternalFrameOrderByEstadoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoProforma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoProforma.jTabbedPaneRelacionesEstadoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoProforma"));
		
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
            		closingInternalFrameEstadoProforma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoProforma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoProforma = (JInternalFrameBase)event.getSource();
	            	
	            EstadoProformaBeanSwingJInternalFrame jInternalFrameParent=(EstadoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoProforma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoProformaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoProforma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoProforma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoProforma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoProforma";
		inputMap = this.jButtonNuevoEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoProformaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoProforma";
		inputMap = this.jButtonNuevoRelacionesEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoProformaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoProforma";
		inputMap = this.jButtonModificarEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoProforma";
		inputMap = this.jButtonActualizarEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoProforma";
		inputMap = this.jButtonEliminarEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoProforma";
		inputMap = this.jButtonCancelarEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoProforma";
		inputMap = this.jButtonCerrarEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoProforma";
		inputMap = this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoProforma.jButtonGuardarCambiosEstadoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoProforma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoProformaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonidEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_empresaEstadoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_empresaEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtoncodigoEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonnombreEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_color_generalEstadoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoProforma.jButtonid_color_generalEstadoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoProformaBusqueda"));
		
		
		this.jButtonFK_IdColorGeneralEstadoProforma.addActionListener(new ButtonActionListener(this,"FK_IdColorGeneralEstadoProforma"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoProforma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoProforma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
					estadoproformaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoProforma estadoproformaAux:estadoproformas) {
					estadoproformaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
						estadoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoProforma estadoproformaAux:estadoproformas) {
						estadoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoProforma estadoproformaAux:estadoproformas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoProforma.getSelectedRows();
			
			EstadoProforma estadoproformaLocal=new EstadoProforma();
			
			//this.seleccionarTodosEstadoProforma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoproformaLocal =(EstadoProforma) this.estadoproformaLogic.getEstadoProformas().toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoproformaLocal =(EstadoProforma) this.estadoproformas.toArray()[this.jTableDatosEstadoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoproformaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
						estadoproformaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoProforma estadoproformaAux:estadoproformas) {
						estadoproformaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoProforma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoProformaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoProformaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoProforma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoProforma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoProforma estadoproformaAux:this.estadoproformaLogic.getEstadoProformas()) {
				
						if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoproformaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoproformaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoProforma estadoproformaAux:estadoproformas) {
					
						if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoproformaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoproformaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoProformaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoProforma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoProforma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoProforma) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoProforma(conSplash);
				
					this.generarReporteEstadoProformasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoProformasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoProformasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoProformasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoProforma();
				
				this.exportarEstadoProformasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoProformas();
				//this.importarEstadoProformas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoProforma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoProformasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoProforma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoProforma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoProforma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoProforma.jComboBoxTiposAccionesFormularioEstadoProforma.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoProforma();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoProforma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoProformaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoProforma();
			
			if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
			EstadoProforma estadoproforma=new EstadoProforma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoProforma.getSelectedItem();
			
			
			
			
			estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoproformasSeleccionados.size()==1) {
				for(EstadoProforma estadoproformaAux:estadoproformasSeleccionados) {
					estadoproforma=estadoproformaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoProforma();
			
      		//this.finishProcessEstadoProforma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoProformaReturnGeneral() throws Exception {
		if(this.estadoproformaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoproformaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoproformaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoproformaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoProforma(false);
		}
		
		if(this.estadoproformaReturnGeneral.getConRetornoLista() || this.estadoproformaReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoproformaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoproformaLogic.setEstadoProformas(this.estadoproformaReturnGeneral.getEstadoProformas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoproformaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoproformaLogic.setEstadoProforma(this.estadoproformaReturnGeneral.getEstadoProforma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoProforma(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoProforma() throws Exception {
		
		
	}
	
	public ArrayList<EstadoProforma> getEstadoProformasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoProforma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoProforma estadoproformaAux:estadoproformaLogic.getEstadoProformas()) {
					if(estadoproformaAux.getIsSelected()) {
						estadoproformasSeleccionados.add(estadoproformaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoProforma estadoproformaAux:this.estadoproformas) {
					if(estadoproformaAux.getIsSelected()) {
						estadoproformasSeleccionados.add(estadoproformaAux);				
					}
				}
			}
			
			if(estadoproformasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoproformasSeleccionados.addAll(this.estadoproformaLogic.getEstadoProformas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoproformasSeleccionados.addAll(this.estadoproformas);				
					}
				}
			}
		} else {
			estadoproformasSeleccionados.add(this.estadoproforma);
		}
		
		return estadoproformasSeleccionados;
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
	
	public void generarReporteEstadoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoProformasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoProformasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoProformasSeleccionados() throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoProformas("Todos",estadoproformasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoProformasSeleccionados() throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoProformas("Todos",estadoproformasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoProformasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoProformas("Todos",estadoproformasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoProformasSeleccionados() throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoProforma();
		
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoProforma();
		
		
		//this.generarReporteEstadoProformas("Todos",estadoproformasSeleccionados ,estadoproformaImplementable,estadoproformaImplementableHome);
	}
	
	public void mostrarImportacionEstadoProformas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoProforma();
		
		this.abrirFrameImportacionEstadoProforma();		
		
			
		//this.generarReporteEstadoProformas("Todos",estadoproformasSeleccionados ,estadoproformaImplementable,estadoproformaImplementableHome);
	}
	
	public void importarEstadoProformas() throws Exception {		
	
	}
	
	public void exportarEstadoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoProformasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoProformasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoProformasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoProformasSeleccionados() throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoproforma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoProforma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoProforma estadoproformaAux:estadoproformasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoProforma(estadoproformaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoproformaAux.setsDetalleGeneralEntityReporte(estadoproformaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoProforma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoProformaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoProformaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoProformaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoProformaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoProformaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoProforma(EstadoProforma estadoproforma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoproforma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoproforma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoproforma.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoproforma.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoproforma.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoproforma.getcolorgeneral_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoProformasSeleccionados() throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoproforma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoProforma(row);				
				iRow++;
			}				
			
			for(EstadoProforma estadoproformaAux:estadoproformasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoProforma(estadoproformaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoProformasSeleccionados() throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();		
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoproforma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoproformas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoproforma");
			//elementRoot.appendChild(element);
		
			for(EstadoProforma estadoproformaAux:estadoproformasSeleccionados) {
				element = document.createElement("estadoproforma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoProforma(estadoproformaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoProforma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoProforma(EstadoProforma estadoproforma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoproforma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoproforma.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoproforma.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoproforma.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoproforma.getcolorgeneral_descripcion());				
	}
	
	public void setFilaDatosExportarXmlEstadoProforma(EstadoProforma estadoproforma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoProformaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoproforma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoProformaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoproforma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EstadoProformaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(estadoproforma.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(EstadoProformaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoproforma.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoProformaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoproforma.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcolorgeneral_descripcion = document.createElement(EstadoProformaConstantesFunciones.IDCOLORGENERAL);
		elementcolorgeneral_descripcion.appendChild(document.createTextNode(estadoproforma.getcolorgeneral_descripcion()));
		element.appendChild(elementcolorgeneral_descripcion);
	}
	
	public void generarReporteGroupGenericoEstadoProformasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoProforma> estadoproformasSeleccionados=new ArrayList<EstadoProforma>();
		
		estadoproformasSeleccionados=this.getEstadoProformasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoProforma(estadoproformasSeleccionados);
		
		this.generarReporteEstadoProformas("Todos",estadoproformasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoProforma(ArrayList<EstadoProforma> estadoproformasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoProforma estadoproformaAux:estadoproformasSeleccionados) {
				estadoproformaAux.setsDetalleGeneralEntityReporte(estadoproformaAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					estadoproformaAux.setsDescripcionGeneralEntityReporte1(estadoproformaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoproformaAux.setsDescripcionGeneralEntityReporte1(estadoproformaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoproformaAux.setsDescripcionGeneralEntityReporte1(estadoproformaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL)) {
					existe=true;
					estadoproformaAux.setsDescripcionGeneralEntityReporte1(estadoproformaAux.getcolorgeneral_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoProforma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoProforma=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoProforma=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoProforma=false;
			this.isVisibilidadCeldaActualizarEstadoProforma=false;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
			this.isVisibilidadCeldaCancelarEstadoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=false;
			this.isVisibilidadCeldaModificarEstadoProforma=false;
			this.isVisibilidadCeldaActualizarEstadoProforma=true;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
			this.isVisibilidadCeldaCancelarEstadoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=false;
			this.isVisibilidadCeldaModificarEstadoProforma=false;
			this.isVisibilidadCeldaActualizarEstadoProforma=true;
			this.isVisibilidadCeldaEliminarEstadoProforma=true;
			this.isVisibilidadCeldaCancelarEstadoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=false;
			this.isVisibilidadCeldaModificarEstadoProforma=false;
			this.isVisibilidadCeldaActualizarEstadoProforma=true;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
			this.isVisibilidadCeldaCancelarEstadoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=true;
			this.isVisibilidadCeldaModificarEstadoProforma=false;
			this.isVisibilidadCeldaActualizarEstadoProforma=false;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
			this.isVisibilidadCeldaCancelarEstadoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=false;
			this.isVisibilidadCeldaActualizarEstadoProforma=false;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
			this.isVisibilidadCeldaCancelarEstadoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=false;
			this.isVisibilidadCeldaModificarEstadoProforma=true;
			this.isVisibilidadCeldaActualizarEstadoProforma=false;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
			this.isVisibilidadCeldaCancelarEstadoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoProforma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoProformaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=true;
		} else {
			this.actualizarEstadoPanelsEstadoProforma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoProforma=false;
			//this.isVisibilidadCeldaVerFormEstadoProforma=false;
			this.isVisibilidadCeldaDuplicarEstadoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoproformaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!estadoproformaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;												
			}
			
			this.jButtonCerrarEstadoProforma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoProforma=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoproforma)) {
			this.isVisibilidadCeldaActualizarEstadoProforma=false;
			this.isVisibilidadCeldaEliminarEstadoProforma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoProforma() {
	}
	
	public void actualizarEstadoPanelsEstadoProforma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoProforma!=null) {
				this.jScrollPanelDatosEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoProforma!=null) {
				this.jPanelPaginacionEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoProforma!=null) {
				this.jScrollPanelDatosEstadoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoProforma!=null) {
				this.jPanelPaginacionEstadoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoProforma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoProforma!=null) {
				this.jScrollPanelDatosEstadoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoProforma!=null) {
				this.jPanelPaginacionEstadoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoProforma!=null) {
				this.jScrollPanelDatosEstadoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoProforma!=null) {
				this.jPanelPaginacionEstadoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoProforma!=null) {
				this.jScrollPanelDatosEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoProforma!=null) {
				this.jPanelPaginacionEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoProforma!=null) {
				this.jScrollPanelDatosEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoProforma!=null) {
				this.jPanelPaginacionEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoProforma!=null) {
				this.jScrollPanelDatosEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoProforma!=null) {
				this.jPanelPaginacionEstadoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
					this.jTabbedPaneBusquedasEstadoProforma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoProforma!=null) {
				this.jTabbedPaneBusquedasEstadoProforma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadoProforma!=null) {
				this.jPanelParametrosReportesEstadoProforma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdColorGeneral=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdColorGeneral) {this.jTabbedPaneBusquedasEstadoProforma.remove(jPanelFK_IdColorGeneralEstadoProforma);}
		}
		
	}

	public void setVisibilidadBusquedasParaColorGeneral(Boolean isParaColorGeneral){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaColorGeneralNegation=!isParaColorGeneral;

			this.isVisibilidadFK_IdColorGeneral=isParaColorGeneral;
			if(!this.isVisibilidadFK_IdColorGeneral) {this.jTabbedPaneBusquedasEstadoProforma.remove(jPanelFK_IdColorGeneralEstadoProforma);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoProformaSessionBean estadoproformaSessionBean=new EstadoProformaSessionBean();
		
		if(this.estadoproformaSessionBean==null) {
			this.estadoproformaSessionBean=new EstadoProformaSessionBean();
		}
		
		this.estadoproformaSessionBean.setsUltimaBusquedaEstadoProforma(this.getsAccionBusqueda());
		this.estadoproformaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoproformaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdColorGeneral")) {
			estadoproformaSessionBean.setid_color_general(this.getid_color_generalFK_IdColorGeneral());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			estadoproformaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoProformaSessionBean estadoproformaSessionBean=new EstadoProformaSessionBean();
		
		if(this.estadoproformaSessionBean==null) {
			this.estadoproformaSessionBean=new EstadoProformaSessionBean();
		}
		
		if(this.estadoproformaSessionBean.getsUltimaBusquedaEstadoProforma()!=null&&!this.estadoproformaSessionBean.getsUltimaBusquedaEstadoProforma().equals("")) {
			this.setsAccionBusqueda(estadoproformaSessionBean.getsUltimaBusquedaEstadoProforma());
			this.setiNumeroPaginacion(estadoproformaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoproformaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdColorGeneral")) {
				this.setid_color_generalFK_IdColorGeneral(estadoproformaSessionBean.getid_color_general());
				estadoproformaSessionBean.setid_color_general(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(estadoproformaSessionBean.getid_empresa());
				estadoproformaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.estadoproformaSessionBean.setsUltimaBusquedaEstadoProforma("");
		this.estadoproformaSessionBean.setiNumeroPaginacion(EstadoProformaConstantesFunciones.INUMEROPAGINACION);
		this.estadoproformaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoProforma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoProforma() {
		this.updateBorderResaltarBusquedasFormularioEstadoProforma();
		this.updateVisibilidadBusquedasFormularioEstadoProforma();
		this.updateHabilitarBusquedasFormularioEstadoProforma();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoProforma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadoProforma.getComponents().length>0) {
	

		if(this.estadoproformaConstantesFunciones.resaltarFK_IdColorGeneralEstadoProforma!=null) {
			index= this.jTabbedPaneBusquedasEstadoProforma.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoProforma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoProforma.getComponent(index);
				jPanel.setBorder(this.estadoproformaConstantesFunciones.resaltarFK_IdColorGeneralEstadoProforma);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoProforma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadoProforma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoProforma.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoProforma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoProforma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.estadoproformaConstantesFunciones.mostrarFK_IdColorGeneralEstadoProforma);
			if(!this.estadoproformaConstantesFunciones.mostrarFK_IdColorGeneralEstadoProforma && index>-1) {
				this.jTabbedPaneBusquedasEstadoProforma.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadoProforma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadoProforma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoProforma.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoProforma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoProforma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.estadoproformaConstantesFunciones.activarFK_IdColorGeneralEstadoProforma);
				this.jTabbedPaneBusquedasEstadoProforma.setEnabledAt(index,this.estadoproformaConstantesFunciones.activarFK_IdColorGeneralEstadoProforma);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadoProforma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdColorGeneral")) {
			index= this.jTabbedPaneBusquedasEstadoProforma.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoProforma);

			this.jTabbedPaneBusquedasEstadoProforma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoProforma.getComponent(index);

			this.estadoproformaConstantesFunciones.setResaltarFK_IdColorGeneralEstadoProforma(resaltar);

			jPanel.setBorder(this.estadoproformaConstantesFunciones.resaltarFK_IdColorGeneralEstadoProforma);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEstadoProforma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadoProforma() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoProforma();
		this.updateVisibilidadResaltarControlesFormularioEstadoProforma();
		this.updateHabilitarResaltarControlesFormularioEstadoProforma();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoproformaConstantesFunciones.resaltaridEstadoProforma!=null && this.jInternalFrameDetalleFormEstadoProforma!=null) {this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.setBorder(this.estadoproformaConstantesFunciones.resaltaridEstadoProforma);}
		if(this.estadoproformaConstantesFunciones.resaltarid_empresaEstadoProforma!=null && this.jInternalFrameDetalleFormEstadoProforma!=null) {this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setBorder(this.estadoproformaConstantesFunciones.resaltarid_empresaEstadoProforma);}
		if(this.estadoproformaConstantesFunciones.resaltarcodigoEstadoProforma!=null && this.jInternalFrameDetalleFormEstadoProforma!=null) {this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.setBorder(this.estadoproformaConstantesFunciones.resaltarcodigoEstadoProforma);}
		if(this.estadoproformaConstantesFunciones.resaltarnombreEstadoProforma!=null && this.jInternalFrameDetalleFormEstadoProforma!=null) {this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.setBorder(this.estadoproformaConstantesFunciones.resaltarnombreEstadoProforma);}
		if(this.estadoproformaConstantesFunciones.resaltarid_color_generalEstadoProforma!=null && this.jInternalFrameDetalleFormEstadoProforma!=null) {this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setBorder(this.estadoproformaConstantesFunciones.resaltarid_color_generalEstadoProforma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoProforma() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
	
		//this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostraridEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jPanelidEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostraridEstadoProforma);
		//this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarid_empresaEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jPanelid_empresaEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarid_empresaEstadoProforma);
		//this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarcodigoEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jPanelcodigoEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarcodigoEstadoProforma);
		//this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarnombreEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jPanelnombreEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarnombreEstadoProforma);
		//this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarid_color_generalEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jPanelid_color_generalEstadoProforma.setVisible(this.estadoproformaConstantesFunciones.mostrarid_color_generalEstadoProforma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoProforma!=null) {
	
		this.jInternalFrameDetalleFormEstadoProforma.jLabelidEstadoProforma.setEnabled(this.estadoproformaConstantesFunciones.activaridEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_empresaEstadoProforma.setEnabled(this.estadoproformaConstantesFunciones.activarid_empresaEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jTextFieldcodigoEstadoProforma.setEnabled(this.estadoproformaConstantesFunciones.activarcodigoEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jTextAreanombreEstadoProforma.setEnabled(this.estadoproformaConstantesFunciones.activarnombreEstadoProforma);
		this.jInternalFrameDetalleFormEstadoProforma.jComboBoxid_color_generalEstadoProforma.setEnabled(this.estadoproformaConstantesFunciones.activarid_color_generalEstadoProforma);
		}
	}
	
		
}
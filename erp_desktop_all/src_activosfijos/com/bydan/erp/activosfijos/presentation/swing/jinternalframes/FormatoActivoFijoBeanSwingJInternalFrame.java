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

import com.bydan.erp.activosfijos.util.FormatoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.FormatoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.FormatoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.FormatoActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FormatoActivoFijoBeanSwingJInternalFrame extends FormatoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormatoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormatoActivoFijo> formatoactivofijoValidator = new ClassValidator<FormatoActivoFijo>(FormatoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormatoActivoFijo formatoactivofijo;	
	public FormatoActivoFijo formatoactivofijoAux;
	public FormatoActivoFijo formatoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormatoActivoFijo formatoactivofijoTotales;
	public Long idFormatoActivoFijoActual;
	public Long iIdNuevoFormatoActivoFijo=0L;
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

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

	public String sFinalQueryComboFormato2="";

	public List<Formato> formato2sForeignKey;

	public List<Formato> getformato2sForeignKey() {
		return formato2sForeignKey;
	}

	public void setformato2sForeignKey(List<Formato> formato2sForeignKey) {
		this.formato2sForeignKey = formato2sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formato2ForeignKey;

	public Formato getformato2ForeignKey() {
		return formato2ForeignKey;
	}

	public void setformato2ForeignKey(Formato formato2ForeignKey) {
		this.formato2ForeignKey = formato2ForeignKey;
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
	
	public Boolean isPermisoTodoFormatoActivoFijo;
	public Boolean isPermisoNuevoFormatoActivoFijo;
	public Boolean isPermisoActualizarFormatoActivoFijo;
	public Boolean isPermisoActualizarOriginalFormatoActivoFijo;
	public Boolean isPermisoEliminarFormatoActivoFijo;
	public Boolean isPermisoGuardarCambiosFormatoActivoFijo;
	public Boolean isPermisoConsultaFormatoActivoFijo;
	public Boolean isPermisoBusquedaFormatoActivoFijo;
	public Boolean isPermisoReporteFormatoActivoFijo;
	public Boolean isPermisoPaginacionMedioFormatoActivoFijo;
	public Boolean isPermisoPaginacionAltoFormatoActivoFijo;
	public Boolean isPermisoPaginacionTodoFormatoActivoFijo;
	public Boolean isPermisoCopiarFormatoActivoFijo;
	public Boolean isPermisoVerFormFormatoActivoFijo;
	public Boolean isPermisoDuplicarFormatoActivoFijo;
	public Boolean isPermisoOrdenFormatoActivoFijo;
	
	
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
	
	public FormatoActivoFijoParameterReturnGeneral formatoactivofijoReturnGeneral;
	public FormatoActivoFijoParameterReturnGeneral formatoactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormatoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioFormatoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormatoActivoFijoSessionBeanAdditional formatoactivofijoSessionBeanAdditional=null;
	
	public FormatoActivoFijoSessionBeanAdditional getFormatoActivoFijoSessionBeanAdditional() {
		return this.formatoactivofijoSessionBeanAdditional;
	}
	
	public void setFormatoActivoFijoSessionBeanAdditional(FormatoActivoFijoSessionBeanAdditional formatoactivofijoSessionBeanAdditional) {
		try {
			this.formatoactivofijoSessionBeanAdditional=formatoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormatoActivoFijoBeanSwingJInternalFrameAdditional formatoactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class FormatoActivoFijoBeanSwingJInternalFrame
	
	public FormatoActivoFijoBeanSwingJInternalFrameAdditional getFormatoActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.formatoactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormatoActivoFijoBeanSwingJInternalFrameAdditional(FormatoActivoFijoBeanSwingJInternalFrameAdditional formatoactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.formatoactivofijoBeanSwingJInternalFrameAdditional=formatoactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormatoActivoFijoLogic formatoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormatoActivoFijo formatoactivofijoBean;
	public FormatoActivoFijoConstantesFunciones formatoactivofijoConstantesFunciones;
	//public FormatoActivoFijoParameterReturnGeneral formatoactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public FormatoLogic formatoLogic;
	public FormatoLogic formato2Logic;
	
	//PARAMETROS
	
	
	//public List<FormatoActivoFijo> formatoactivofijos;	
	//public List<FormatoActivoFijo> formatoactivofijosEliminados;
	//public List<FormatoActivoFijo> formatoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormatoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarFormatoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarFormatoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormFormatoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenFormatoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarFormatoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarFormatoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarFormatoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarFormatoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarFormatoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdFormato2=false;
	
	public Long getiIdNuevoFormatoActivoFijo() {
		return this.iIdNuevoFormatoActivoFijo;
	}

	public void setiIdNuevoFormatoActivoFijo(Long iIdNuevoFormatoActivoFijo) {
		this.iIdNuevoFormatoActivoFijo = iIdNuevoFormatoActivoFijo;
	}
	
	public Long getidFormatoActivoFijoActual() {
		return this.idFormatoActivoFijoActual;
	}

	public void setidFormatoActivoFijoActual(Long idFormatoActivoFijoActual) {
		this.idFormatoActivoFijoActual = idFormatoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormatoActivoFijo getformatoactivofijo() {
		return this.formatoactivofijo;
	}

	public void setformatoactivofijo(FormatoActivoFijo formatoactivofijo) {
		this.formatoactivofijo = formatoactivofijo;
	}
	
	public FormatoActivoFijo getformatoactivofijoAux() {
		return this.formatoactivofijoAux;
	}

	public void setformatoactivofijoAux(FormatoActivoFijo formatoactivofijoAux) {
		this.formatoactivofijoAux = formatoactivofijoAux;
	}				
	
	public FormatoActivoFijo getformatoactivofijoAnterior() {
		return this.formatoactivofijoAnterior;
	}

	public void setformatoactivofijoAnterior(FormatoActivoFijo formatoactivofijoAnterior) {
		this.formatoactivofijoAnterior = formatoactivofijoAnterior;
	}	
	
	public FormatoActivoFijo getformatoactivofijoTotales() {
		return this.formatoactivofijoTotales;
	}

	public void setformatoactivofijoTotales(FormatoActivoFijo formatoactivofijoTotales) {
		this.formatoactivofijoTotales = formatoactivofijoTotales;
	}	
	
	public FormatoActivoFijo getformatoactivofijoBean() {
		return this.formatoactivofijoBean;
	}

	public void setformatoactivofijoBean(FormatoActivoFijo formatoactivofijoBean) {
		this.formatoactivofijoBean = formatoactivofijoBean;
	}	
	
	public FormatoActivoFijoParameterReturnGeneral getformatoactivofijoReturnGeneral() {
		return this.formatoactivofijoReturnGeneral;
	}

	public void setformatoactivofijoReturnGeneral(FormatoActivoFijoParameterReturnGeneral formatoactivofijoReturnGeneral) {
		this.formatoactivofijoReturnGeneral = formatoactivofijoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_formatoFK_IdFormato=-1L;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_formato2FK_IdFormato2=-1L;

	public Long getid_formato2FK_IdFormato2() {
		return this.id_formato2FK_IdFormato2;
	}

	public void setid_formato2FK_IdFormato2(Long id_formato2FK_IdFormato2) {
		this.id_formato2FK_IdFormato2 = id_formato2FK_IdFormato2;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormatoActivoFijoLogic getFormatoActivoFijoLogic()	{		
		return formatoactivofijoLogic;
	}

	public void setFormatoActivoFijoLogic(FormatoActivoFijoLogic formatoactivofijoLogic) {
		this.formatoactivofijoLogic = formatoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoFormatoActivoFijo() {
		return isEsNuevoFormatoActivoFijo;
	}

	public void setIsEsNuevoFormatoActivoFijo(Boolean isEsNuevoFormatoActivoFijo) {
		this.isEsNuevoFormatoActivoFijo = isEsNuevoFormatoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioFormatoActivoFijo() {
		return esParaAccionDesdeFormularioFormatoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioFormatoActivoFijo(Boolean esParaAccionDesdeFormularioFormatoActivoFijo) {
		this.esParaAccionDesdeFormularioFormatoActivoFijo = esParaAccionDesdeFormularioFormatoActivoFijo;
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

			if(this.formatoactivofijoSessionBean==null) {
				this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
			}

			if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formatoactivofijoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.formatoactivofijoSessionBean==null) {
				this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
			}

			if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(formatoactivofijoSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

	public void cargarCombosFormato2sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formato2sForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.formatoactivofijoSessionBean==null) {
				this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
			}

			if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionFormato2()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formato2Logic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formato2sForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato2(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(formatoactivofijoSessionBean.getlidFormato2Actual());
					this.formato2sForeignKey.add(formatoLogic.getFormato());
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

					if(this.formatoactivofijo!=null) {
						this.formatoactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
						this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormatoActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormatoActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaFormatoActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormatoActivoFijoGenerico!=null && jComboBoxid_empresaFormatoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormatoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.formatoactivofijo!=null) {
						this.formatoactivofijo.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
						this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoFormatoActivoFijo.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoFormatoActivoFijoGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoFormatoActivoFijoGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoFormatoActivoFijoGenerico!=null && jComboBoxid_formatoFormatoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_formatoFormatoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormato2ForeignKey(Long idFormato2Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formato2Temp=null;

			for(Formato formato2Aux:formato2sForeignKey) {
				if(formato2Aux.getId()!=null && formato2Aux.getId().equals(idFormato2Seleccionado)) {
					formato2Temp=formato2Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formato2Temp!=null) {

					if(this.formatoactivofijo!=null) {
						this.formatoactivofijo.setFormato2(formato2Temp);
					}

					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
						this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setSelectedItem(formato2Temp);
					}
				} else {
					//jComboBoxid_formato2FormatoActivoFijo.setSelectedItem(formato2Temp);
					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setSelectedIndex(0);
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

	public String getActualFormato2ForeignKeyDescripcion(Long idFormato2Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formato2Temp=null;

			for(Formato formato2Aux:formato2sForeignKey) {
				if(formato2Aux.getId()!=null && formato2Aux.getId().equals(idFormato2Seleccionado)) {
					formato2Temp=formato2Aux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formato2Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormato2ForeignKeyGenerico(Long idFormato2Seleccionado,JComboBox jComboBoxid_formato2FormatoActivoFijoGenerico)throws Exception
	{
		try
		{
			Formato  formato2Temp=null;

			for(Formato formato2Aux:formato2sForeignKey) {
				if(formato2Aux.getId()!=null && formato2Aux.getId().equals(idFormato2Seleccionado)) {
					formato2Temp=formato2Aux;
					break;
				}
			}

			if(formato2Temp!=null) {
				jComboBoxid_formato2FormatoActivoFijoGenerico.setSelectedItem(formato2Temp);
			} else {
				if(jComboBoxid_formato2FormatoActivoFijoGenerico!=null && jComboBoxid_formato2FormatoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_formato2FormatoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormatoActivoFijo formatoactivofijo,JComboBox jComboBoxid_empresaFormatoActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormatoActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormatoActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formatoactivofijo.setid_empresa(empresaAux.getId());
				formatoactivofijo.setempresa_descripcion(FormatoActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formatoactivofijo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(FormatoActivoFijo formatoactivofijo,JComboBox jComboBoxid_formatoFormatoActivoFijoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoFormatoActivoFijoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoFormatoActivoFijoGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				formatoactivofijo.setid_formato(formatoAux.getId());
				formatoactivofijo.setformato_descripcion(FormatoActivoFijoConstantesFunciones.getFormatoDescripcion(formatoAux));
				formatoactivofijo.setFormato(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormato2ForeignKey(FormatoActivoFijo formatoactivofijo,JComboBox jComboBoxid_formato2FormatoActivoFijoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formato2FormatoActivoFijoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formato2FormatoActivoFijoGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				formatoactivofijo.setid_formato2(formatoAux.getId());
				formatoactivofijo.setformato2_descripcion(FormatoActivoFijoConstantesFunciones.getFormato2Descripcion(formatoAux));
				formatoactivofijo.setFormato2(formatoAux);			}
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

					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { 
					}

					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { 
					}

					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormato2sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.removeAllItems();

							for(Formato formato2:this.formato2sForeignKey) {
								this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.addItem(formato2);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { 
					}

					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormato2ForeignKey(Formato formato2,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setSelectedItem(formato2);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesFormatoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormatoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesFormatoActivoFijo(this.formatoactivofijoLogic.getFormatoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormatoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesFormatoActivoFijo(this.formatoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Formato.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formatoactivofijoLogic.setFormatoActivoFijos(this.formatoactivofijos);
			formatoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormatoActivoFijoParameterReturnGeneral getFormatoActivoFijoParameterGeneral() {
		return this.formatoactivofijoParameterGeneral;
	}
	
	public void setFormatoActivoFijoParameterGeneral(FormatoActivoFijoParameterReturnGeneral formatoactivofijoParameterGeneral) {
		this.formatoactivofijoParameterGeneral = formatoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormatoActivoFijo() {
		return isPermisoTodoFormatoActivoFijo;
	}

	public void setIsPermisoTodoFormatoActivoFijo(Boolean isPermisoTodoFormatoActivoFijo) {
		this.isPermisoTodoFormatoActivoFijo = isPermisoTodoFormatoActivoFijo;
	}

	public Boolean getIsPermisoNuevoFormatoActivoFijo() {
		return isPermisoNuevoFormatoActivoFijo;
	}

	public void setIsPermisoNuevoFormatoActivoFijo(Boolean isPermisoNuevoFormatoActivoFijo) {
		this.isPermisoNuevoFormatoActivoFijo = isPermisoNuevoFormatoActivoFijo;
	}

	public Boolean getIsPermisoActualizarFormatoActivoFijo() {
		return isPermisoActualizarFormatoActivoFijo;
	}

	public void setIsPermisoActualizarFormatoActivoFijo(Boolean isPermisoActualizarFormatoActivoFijo) {
		this.isPermisoActualizarFormatoActivoFijo = isPermisoActualizarFormatoActivoFijo;
	}

	public Boolean getIsPermisoEliminarFormatoActivoFijo() {
		return isPermisoEliminarFormatoActivoFijo;
	}

	public void setIsPermisoEliminarFormatoActivoFijo(Boolean isPermisoEliminarFormatoActivoFijo) {
		this.isPermisoEliminarFormatoActivoFijo = isPermisoEliminarFormatoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosFormatoActivoFijo() {
		return isPermisoGuardarCambiosFormatoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosFormatoActivoFijo(Boolean isPermisoGuardarCambiosFormatoActivoFijo) {
		this.isPermisoGuardarCambiosFormatoActivoFijo = isPermisoGuardarCambiosFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaFormatoActivoFijo() {
		return isPermisoConsultaFormatoActivoFijo;
	}

	public void setIsPermisoConsultaFormatoActivoFijo(Boolean isPermisoConsultaFormatoActivoFijo) {
		this.isPermisoConsultaFormatoActivoFijo = isPermisoConsultaFormatoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaFormatoActivoFijo() {
		return isPermisoBusquedaFormatoActivoFijo;
	}

	public void setIsPermisoBusquedaFormatoActivoFijo(Boolean isPermisoBusquedaFormatoActivoFijo) {
		this.isPermisoBusquedaFormatoActivoFijo = isPermisoBusquedaFormatoActivoFijo;
	}

	public Boolean getIsPermisoReporteFormatoActivoFijo() {
		return isPermisoReporteFormatoActivoFijo;
	}

	public void setIsPermisoReporteFormatoActivoFijo(Boolean isPermisoReporteFormatoActivoFijo) {
		this.isPermisoReporteFormatoActivoFijo = isPermisoReporteFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormatoActivoFijo() {
		return isPermisoPaginacionMedioFormatoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioFormatoActivoFijo(Boolean isPermisoPaginacionMedioFormatoActivoFijo) {
		this.isPermisoPaginacionMedioFormatoActivoFijo = isPermisoPaginacionMedioFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormatoActivoFijo() {
		return isPermisoPaginacionTodoFormatoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoFormatoActivoFijo(Boolean isPermisoPaginacionTodoFormatoActivoFijo) {
		this.isPermisoPaginacionTodoFormatoActivoFijo = isPermisoPaginacionTodoFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormatoActivoFijo() {
		return isPermisoPaginacionAltoFormatoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoFormatoActivoFijo(Boolean isPermisoPaginacionAltoFormatoActivoFijo) {
		this.isPermisoPaginacionAltoFormatoActivoFijo = isPermisoPaginacionAltoFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarFormatoActivoFijo() {
		return isPermisoCopiarFormatoActivoFijo;
	}

	public void setIsPermisoCopiarFormatoActivoFijo(Boolean isPermisoCopiarFormatoActivoFijo) {
		this.isPermisoCopiarFormatoActivoFijo = isPermisoCopiarFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormFormatoActivoFijo() {
		return isPermisoVerFormFormatoActivoFijo;
	}

	public void setIsPermisoVerFormFormatoActivoFijo(Boolean isPermisoVerFormFormatoActivoFijo) {
		this.isPermisoVerFormFormatoActivoFijo = isPermisoVerFormFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarFormatoActivoFijo() {
		return isPermisoDuplicarFormatoActivoFijo;
	}

	public void setIsPermisoDuplicarFormatoActivoFijo(Boolean isPermisoDuplicarFormatoActivoFijo) {
		this.isPermisoDuplicarFormatoActivoFijo = isPermisoDuplicarFormatoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenFormatoActivoFijo() {
		return isPermisoOrdenFormatoActivoFijo;
	}

	public void setIsPermisoOrdenFormatoActivoFijo(Boolean isPermisoOrdenFormatoActivoFijo) {
		this.isPermisoOrdenFormatoActivoFijo = isPermisoOrdenFormatoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormatoActivoFijo() {
		return isVisibilidadCeldaNuevoFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoFormatoActivoFijo(Boolean isVisibilidadCeldaNuevoFormatoActivoFijo) {
		this.isVisibilidadCeldaNuevoFormatoActivoFijo = isVisibilidadCeldaNuevoFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormatoActivoFijo() {
		return isVisibilidadCeldaDuplicarFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarFormatoActivoFijo(Boolean isVisibilidadCeldaDuplicarFormatoActivoFijo) {
		this.isVisibilidadCeldaDuplicarFormatoActivoFijo = isVisibilidadCeldaDuplicarFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormatoActivoFijo() {
		return isVisibilidadCeldaCopiarFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarFormatoActivoFijo(Boolean isVisibilidadCeldaCopiarFormatoActivoFijo) {
		this.isVisibilidadCeldaCopiarFormatoActivoFijo = isVisibilidadCeldaCopiarFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormatoActivoFijo() {
		return isVisibilidadCeldaVerFormFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormFormatoActivoFijo(Boolean isVisibilidadCeldaVerFormFormatoActivoFijo) {
		this.isVisibilidadCeldaVerFormFormatoActivoFijo = isVisibilidadCeldaVerFormFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormatoActivoFijo() {
		return isVisibilidadCeldaOrdenFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenFormatoActivoFijo(Boolean isVisibilidadCeldaOrdenFormatoActivoFijo) {
		this.isVisibilidadCeldaOrdenFormatoActivoFijo = isVisibilidadCeldaOrdenFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormatoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormatoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo = isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormatoActivoFijo() {
		return isVisibilidadCeldaModificarFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarFormatoActivoFijo(Boolean isVisibilidadCeldaModificarFormatoActivoFijo) {
		this.isVisibilidadCeldaModificarFormatoActivoFijo = isVisibilidadCeldaModificarFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormatoActivoFijo() {
		return isVisibilidadCeldaActualizarFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarFormatoActivoFijo(Boolean isVisibilidadCeldaActualizarFormatoActivoFijo) {
		this.isVisibilidadCeldaActualizarFormatoActivoFijo = isVisibilidadCeldaActualizarFormatoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormatoActivoFijo() {
		return isVisibilidadCeldaEliminarFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarFormatoActivoFijo(Boolean isVisibilidadCeldaEliminarFormatoActivoFijo) {
		this.isVisibilidadCeldaEliminarFormatoActivoFijo = isVisibilidadCeldaEliminarFormatoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormatoActivoFijo() {
		return isVisibilidadCeldaCancelarFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarFormatoActivoFijo(Boolean isVisibilidadCeldaCancelarFormatoActivoFijo) {
		this.isVisibilidadCeldaCancelarFormatoActivoFijo = isVisibilidadCeldaCancelarFormatoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormatoActivoFijo() {
		return isVisibilidadCeldaGuardarFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarFormatoActivoFijo(Boolean isVisibilidadCeldaGuardarFormatoActivoFijo) {
		this.isVisibilidadCeldaGuardarFormatoActivoFijo = isVisibilidadCeldaGuardarFormatoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormatoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosFormatoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormatoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosFormatoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo = isVisibilidadCeldaGuardarCambiosFormatoActivoFijo;
	}
		
	public FormatoActivoFijoSessionBean getformatoactivofijoSessionBean() {
		return this.formatoactivofijoSessionBean;
	}
	
	public void setformatoactivofijoSessionBean(FormatoActivoFijoSessionBean formatoactivofijoSessionBean) {
		this.formatoactivofijoSessionBean=formatoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdFormato2() {
		return this.isVisibilidadFK_IdFormato2;
	}

	public void setisVisibilidadFK_IdFormato2(Boolean isVisibilidadFK_IdFormato2) {
		this.isVisibilidadFK_IdFormato2=isVisibilidadFK_IdFormato2;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(FormatoActivoFijo formatoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formatoactivofijo,null);
				this.setActualParaGuardarFormatoForeignKey(formatoactivofijo,null);
				this.setActualParaGuardarFormato2ForeignKey(formatoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(FormatoActivoFijo formatoactivofijo,FormatoActivoFijo formatoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormatoActivoFijo(formatoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formatoactivofijoAux.setId(formatoactivofijo.getId());
		formatoactivofijoAux.setVersionRow(formatoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormatoActivoFijo();
		
			int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formatoactivofijoValidator.getInvalidValues(this.formatoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formatoactivofijoLogic.setDatosCliente(datosCliente);
			formatoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formatoactivofijoAux=new  FormatoActivoFijo();
				
				formatoactivofijoAux.setIsNew(true);
				formatoactivofijoAux.setIsChanged(true);
				
				formatoactivofijoAux.setFormatoActivoFijoOriginal(this.formatoactivofijo);
				
				formatoactivofijoAux.setId(this.formatoactivofijo.getId());	
				formatoactivofijoAux.setVersionRow(this.formatoactivofijo.getVersionRow());	
				formatoactivofijoAux.setid_empresa(this.formatoactivofijo.getid_empresa());	
				formatoactivofijoAux.setid_formato(this.formatoactivofijo.getid_formato());	
				formatoactivofijoAux.setid_formato2(this.formatoactivofijo.getid_formato2());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formatoactivofijoAux,formatoactivofijoLogic.getFormatoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoactivofijoAux,formatoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoactivofijoLogic.saveFormatoActivoFijos();//WithConnection
						//formatoactivofijoLogic.getSetVersionRowFormatoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatoactivofijo,formatoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesFormatoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatoactivofijoLogic.saveFormatoActivoFijoRelaciones(formatoactivofijoAux);//WithConnection
								//formatoactivofijoLogic.getSetVersionRowFormatoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatoactivofijo,formatoactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatoactivofijoAux,formatoactivofijoLogic.getFormatoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatoactivofijoAux,formatoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatoactivofijo,formatoactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formatoactivofijoAux=new  FormatoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.formatoactivofijoSessionBean.getEsGuardarRelacionado() && this.formatoactivofijo.getId()>=0)) {
						
					formatoactivofijoAux.setIsNew(false);
				}
				
				formatoactivofijoAux.setIsDeleted(false);
			
				formatoactivofijoAux.setId(this.formatoactivofijo.getId());	
				formatoactivofijoAux.setVersionRow(this.formatoactivofijo.getVersionRow());	
				formatoactivofijoAux.setid_empresa(this.formatoactivofijo.getid_empresa());	
				formatoactivofijoAux.setid_formato(this.formatoactivofijo.getid_formato());	
				formatoactivofijoAux.setid_formato2(this.formatoactivofijo.getid_formato2());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatoactivofijoAux,formatoactivofijoLogic.getFormatoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoactivofijoAux,formatoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoactivofijoLogic.saveFormatoActivoFijos();//WithConnection
						//formatoactivofijoLogic.getSetVersionRowFormatoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatoactivofijo,formatoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesFormatoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatoactivofijoLogic.saveFormatoActivoFijoRelaciones(formatoactivofijoAux);//WithConnection
								//formatoactivofijoLogic.getSetVersionRowFormatoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatoactivofijo,formatoactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatoactivofijoAux,formatoactivofijoLogic.getFormatoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatoactivofijoAux,formatoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatoactivofijo,formatoactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formatoactivofijoAux=new  FormatoActivoFijo();
				
				formatoactivofijoAux.setIsNew(false);
				formatoactivofijoAux.setIsChanged(false);
				
				formatoactivofijoAux.setIsDeleted(true);
				
				formatoactivofijoAux.setId(this.formatoactivofijo.getId());	
				formatoactivofijoAux.setVersionRow(this.formatoactivofijo.getVersionRow());	
				formatoactivofijoAux.setid_empresa(this.formatoactivofijo.getid_empresa());	
				formatoactivofijoAux.setid_formato(this.formatoactivofijo.getid_formato());	
				formatoactivofijoAux.setid_formato2(this.formatoactivofijo.getid_formato2());	
				
				if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formatoactivofijoAux.getId()>=0) {	
						this.formatoactivofijosEliminados.add(formatoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formatoactivofijoAux,formatoactivofijoLogic.getFormatoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoactivofijoAux,formatoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoactivofijoLogic.saveFormatoActivoFijos();//WithConnection
						//formatoactivofijoLogic.getSetVersionRowFormatoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatoactivofijoLogic.saveFormatoActivoFijoRelaciones(formatoactivofijoAux);//WithConnection
								//formatoactivofijoLogic.getSetVersionRowFormatoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formatoactivofijoAux,formatoactivofijoLogic.getFormatoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formatoactivofijoAux,formatoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.getFormatoActivoFijos().addAll(this.formatoactivofijosEliminados);
					
					formatoactivofijoLogic.saveFormatoActivoFijos();//WithConnection
					//formatoactivofijoLogic.getSetVersionRowFormatoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormatoActivoFijo();
				
				this.formatoactivofijosEliminados= new ArrayList<FormatoActivoFijo>();		
			}
			
			if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formatos GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formatoactivofijo=formatoactivofijoAux;
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
      		//this.finishProcessFormatoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(FormatoActivoFijo formatoactivofijoLocal) throws Exception {
		
		if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormatoActivoFijo formatoactivofijoLocal) throws Exception {	
		if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formatoactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				formatoactivofijoLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formato2BeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formato2BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formato2BeanSwingJInternalFrameLocal.getformato(),true);
				formato2BeanSwingJInternalFrameLocal.actualizarLista(formato2BeanSwingJInternalFrameLocal.formato,this.formato2sForeignKey);

				formato2BeanSwingJInternalFrameLocal.actualizarRelaciones(formato2BeanSwingJInternalFrameLocal.formato);

				formatoactivofijoLocal.setFormato2(formato2BeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato2();
				this.cargarCombosFrameFormato2sForeignKey("Formulario");
				this.setActualFormato2ForeignKey(formato2BeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormatoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formatoactivofijoValidator.getInvalidValues(this.formatoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormatoActivoFijo formatoactivofijo,List<FormatoActivoFijo> formatoactivofijos) throws Exception {
		try	{		
			FormatoActivoFijoConstantesFunciones.actualizarLista(formatoactivofijo,formatoactivofijos,this.formatoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormatoActivoFijo formatoactivofijo,List<FormatoActivoFijo> formatoactivofijos) throws Exception {
		try	{			
			FormatoActivoFijoConstantesFunciones.actualizarSelectedLista(formatoactivofijo,formatoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormatoActivoFijo> formatoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formatoactivofijosLocal=this.formatoactivofijoLogic.getFormatoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formatoactivofijosLocal=this.formatoactivofijos;
			}
			//ARCHITECTURE
		
			for(FormatoActivoFijo formatoactivofijoLocal:formatoactivofijosLocal) {
				if(this.permiteMantenimiento(formatoactivofijoLocal) && formatoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormatoActivoFijoConstantesFunciones.getFormatoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormatoActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelid_empresaFormatoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoActivoFijoConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelid_formatoFormatoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoActivoFijoConstantesFunciones.IDFORMATO2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelid_formato2FormatoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelid_empresaFormatoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelid_formatoFormatoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelid_formato2FormatoActivoFijo,"");
		
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
		this.iIdNuevoFormatoActivoFijo--;	
		
		
		this.formatoactivofijoAux=new FormatoActivoFijo();
		
		this.formatoactivofijoAux.setId(this.iIdNuevoFormatoActivoFijo);
		this.formatoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatoactivofijoLogic.getFormatoActivoFijos().add(this.formatoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formatoactivofijos.add(this.formatoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.formatoactivofijo=this.formatoactivofijoAux;
		
		if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormatoActivoFijo(this.formatoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoActivoFijo(this.formatoactivofijo);
		}
				
		//this.setDefaultControlesFormatoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormatoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormatoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoActivoFijo(this.formatoactivofijoBean,this.formatoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=FormatoActivoFijoConstantesFunciones.getClassesRelationshipsOfFormatoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formatoactivofijoReturnGeneral=formatoactivofijoLogic.procesarEventosFormatoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatoactivofijoLogic.getFormatoActivoFijos(),this.formatoactivofijo,this.formatoactivofijoParameterGeneral,this.isEsNuevoFormatoActivoFijo,classes);//this.formatoactivofijoLogic.getFormatoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormatoActivoFijo(this.formatoactivofijoReturnGeneral,this.formatoactivofijoBean,false);
		
		if(this.formatoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoActivoFijo(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormatoActivoFijo(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo());
		}
		
		if(this.formatoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormatoActivoFijo(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo(),classes);//this.formatoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormatoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormatoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormFormatoActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormatoActivoFijo(false);
						
			if(formatoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoActivoFijo();
			}
			
			this.actualizarVisualTableDatosFormatoActivoFijo();
			
			this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoFormatoActivoFijo(), this.getIndiceNuevoFormatoActivoFijo());
			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesFormatoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormatoActivoFijo(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setEnabled(isHabilitar && this.formatoactivofijoConstantesFunciones.activarid_empresaFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setEnabled(isHabilitar && this.formatoactivofijoConstantesFunciones.activarid_formatoFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setEnabled(isHabilitar && this.formatoactivofijoConstantesFunciones.activarid_formato2FormatoActivoFijo);
	};
	
	public void setDefaultControlesFormatoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormatoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formatoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.formatoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.setVisible(true);
			
					
		} else {
			//this.formatoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.formatoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFormatoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
				if(formatoactivofijoAux.getId().equals(this.iIdNuevoFormatoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijos) {
				if(formatoactivofijoAux.getId().equals(this.iIdNuevoFormatoActivoFijo)) {
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
	
	public int getIndiceActualFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
				if(formatoactivofijoAux.getId().equals(formatoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijos) {
				if(formatoactivofijoAux.getId().equals(formatoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormatoActivoFijo(FormatoActivoFijo formatoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
				if(formatoactivofijoAux.getFormatoActivoFijoOriginal().getId().equals(formatoactivofijoOriginal.getId())) {
					existe=true;
					formatoactivofijoOriginal.setId(formatoactivofijoAux.getId());
					formatoactivofijoOriginal.setVersionRow(formatoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijos) {
				if(formatoactivofijoAux.getFormatoActivoFijoOriginal().getId().equals(formatoactivofijoOriginal.getId())) {
					existe=true;
					formatoactivofijoOriginal.setId(formatoactivofijoAux.getId());
					formatoactivofijoOriginal.setVersionRow(formatoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormatoActivoFijo(Boolean esParaCancelar) throws Exception {
		formatoactivofijosAux=new ArrayList<FormatoActivoFijo>();
		formatoactivofijoAux=new FormatoActivoFijo();
		
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
					if(formatoactivofijoAux.getId()<0) {
						formatoactivofijosAux.add(formatoactivofijoAux);
					}		
				}
				this.iIdNuevoFormatoActivoFijo=0L;
				this.formatoactivofijoLogic.getFormatoActivoFijos().removeAll(formatoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijos) {
					if(formatoactivofijoAux.getId()<0) {
						formatoactivofijosAux.add(formatoactivofijoAux);
					}		
				}
				this.iIdNuevoFormatoActivoFijo=0L;
				this.formatoactivofijos.removeAll(formatoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormatoActivoFijo 
					&& this.formatoactivofijoLogic.getFormatoActivoFijos().size()>0
					) {
					formatoactivofijoAux=this.formatoactivofijoLogic.getFormatoActivoFijos().get(this.formatoactivofijoLogic.getFormatoActivoFijos().size() - 1);
				
					if(formatoactivofijoAux.getId()<0) {
						this.formatoactivofijoLogic.getFormatoActivoFijos().remove(formatoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormatoActivoFijo && this.formatoactivofijos.size()>0) {
					formatoactivofijoAux=this.formatoactivofijos.get(this.formatoactivofijos.size() - 1);
				
					if(formatoactivofijoAux.getId()<0) {
						this.formatoactivofijos.remove(formatoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormatoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formatoactivofijo.getId()<0) {
				this.formatoactivofijoLogic.getFormatoActivoFijos().remove(this.formatoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formatoactivofijo.getId()<0) {
				this.formatoactivofijos.remove(this.formatoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesFormatoActivoFijo(List<FormatoActivoFijo> formatoactivofijosAux) throws Exception {
		FormatoActivoFijoConstantesFunciones.setEstadosInicialesFormatoActivoFijo(formatoactivofijosAux);
	}
	
	public void setEstadosInicialesFormatoActivoFijo(FormatoActivoFijo formatoactivofijoAux) throws Exception {
		FormatoActivoFijoConstantesFunciones.setEstadosInicialesFormatoActivoFijo(formatoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormatoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormatoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormatoActivoFijoActual()) {
				if(!this.isEsNuevoFormatoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormatoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormatoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormatoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formatos ?", "MANTENIMIENTO DE Formatos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormatoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormatoActivoFijo formatoactivofijo) throws Exception {
		FormatoActivoFijoConstantesFunciones.seleccionarAsignar(this.formatoactivofijo,formatoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormatoActivoFijo=this.isPermisoActualizarOriginalFormatoActivoFijo;
			
			
			this.seleccionarAsignar(formatoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoActivoFijoConstantesFunciones.quitarEspaciosFormatoActivoFijo(this.formatoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormatoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formatoactivofijoSessionBean.setsFuncionBusquedaRapida(this.formatoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormatoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormatoActivoFijo(esParaCancelar);				
				this.cancelarNuevoFormatoActivoFijo(esParaCancelar);								
			}
			
			this.formatoactivofijo=new FormatoActivoFijo();
			
			this.inicializarFormatoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesFormatoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormatoActivoFijo() throws Exception {
		try {
			FormatoActivoFijoConstantesFunciones.inicializarFormatoActivoFijo(this.formatoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formatoactivofijoLogic.getFormatoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormatoActivoFijos(String sAccionBusqueda,List<FormatoActivoFijo> formatoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="FormatoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormatoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormatoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormatoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formatoss");		
		parameters.put("busquedapor", FormatoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormatoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormatoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormatoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormatoActivoFijo=new JRBeanArrayDataSource(FormatoActivoFijoJInternalFrame.TraerFormatoActivoFijoBeans(formatoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormatoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormatoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormatoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormatoActivoFijoBean.TraerFormatoActivoFijoBeans(formatoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteFormatoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,formatoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormatoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,formatoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijoActionPerformed(null);
					//this.generarExcelReporteFormatoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,formatoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormatoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,formatoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormatoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,formatoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormatoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,formatoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormatoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoActivoFijo> formatoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormatoActivoFijo formatoactivofijo : formatoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormatoActivoFijoConstantesFunciones.generarExcelReporteDataFormatoActivoFijo("NORMAL",row,workbook,formatoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormatoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		FormatoActivoFijoConstantesFunciones.generarExcelReporteHeaderFormatoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormatoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoActivoFijo> formatoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormatoActivoFijo formatoactivofijo : formatoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormatoActivoFijoConstantesFunciones.getFormatoActivoFijoDescripcion(formatoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatoactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatoactivofijo.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatoactivofijo.getformato2_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormatoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoActivoFijo> formatoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormatoActivoFijo> formatoactivofijosRespaldo=null;
		
		classes=FormatoActivoFijoConstantesFunciones.getClassesRelationshipsOfFormatoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formatoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.formatoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.formatoactivofijoLogic.setIsConDeep(true);
		
		formatoactivofijosRespaldo=this.formatoactivofijoLogic.getFormatoActivoFijos();
		
		this.formatoactivofijoLogic.setFormatoActivoFijos(formatoactivofijosParaReportes);	
		this.formatoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formatoactivofijosParaReportes=this.formatoactivofijoLogic.getFormatoActivoFijos();
		this.formatoactivofijoLogic.setFormatoActivoFijos(formatoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormatoActivoFijo formatoactivofijo : formatoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormatoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormatoActivoFijoConstantesFunciones.generarExcelReporteDataFormatoActivoFijo("NORMAL",row,workbook,formatoactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FormatoActivoFijoConstantesFunciones.getFormatoActivoFijoDescripcion(formatoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormatoActivoFijo() throws Exception {		
		this.startProcessFormatoActivoFijo(true);
	}
	
	public void startProcessFormatoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormatoActivoFijo ,this.jPanelParametrosReportesFormatoActivoFijo, this.jScrollPanelDatosFormatoActivoFijo,this.jPanelPaginacionFormatoActivoFijo, this.jScrollPanelDatosEdicionFormatoActivoFijo, this.jPanelAccionesFormatoActivoFijo,this.jPanelAccionesFormularioFormatoActivoFijo,this.jmenuBarFormatoActivoFijo,this.jmenuBarDetalleFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,this.jTtoolBarDetalleFormatoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoActivoFijo=this.jTabbedPaneBusquedasFormatoActivoFijo; 
		
		final JPanel jPanelParametrosReportesFormatoActivoFijo=this.jPanelParametrosReportesFormatoActivoFijo;
		//final JScrollPane jScrollPanelDatosFormatoActivoFijo=this.jScrollPanelDatosFormatoActivoFijo;
		final JTable jTableDatosFormatoActivoFijo=this.jTableDatosFormatoActivoFijo;		
		final JPanel jPanelPaginacionFormatoActivoFijo=this.jPanelPaginacionFormatoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionFormatoActivoFijo=this.jScrollPanelDatosEdicionFormatoActivoFijo;
		final JPanel jPanelAccionesFormatoActivoFijo=this.jPanelAccionesFormatoActivoFijo;
		
		JPanel jPanelCamposAuxiliarFormatoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormatoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			jPanelCamposAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelCamposFormatoActivoFijo;
			jPanelAccionesFormularioAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelAccionesFormularioFormatoActivoFijo;
		}
		
		final JPanel jPanelCamposFormatoActivoFijo=jPanelCamposAuxiliarFormatoActivoFijo;
		final JPanel jPanelAccionesFormularioFormatoActivoFijo=jPanelAccionesFormularioAuxiliarFormatoActivoFijo;
		
		
		final JMenuBar jmenuBarFormatoActivoFijo=this.jmenuBarFormatoActivoFijo;
		final JToolBar jTtoolBarFormatoActivoFijo=this.jTtoolBarFormatoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormatoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jmenuBarDetalleFormatoActivoFijo;
			jTtoolBarDetalleAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jTtoolBarDetalleFormatoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleFormatoActivoFijo=jmenuBarDetalleAuxiliarFormatoActivoFijo;
		final JToolBar jTtoolBarDetalleFormatoActivoFijo=jTtoolBarDetalleAuxiliarFormatoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoActivoFijo;
			processRunnable.jTableDatos=jTableDatosFormatoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposFormatoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarFormatoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoActivoFijo ,jPanelParametrosReportesFormatoActivoFijo,jTableDatosFormatoActivoFijo, /*jScrollPanelDatosFormatoActivoFijo,*/jPanelCamposFormatoActivoFijo,jPanelPaginacionFormatoActivoFijo, /*jScrollPanelDatosEdicionFormatoActivoFijo,*/ jPanelAccionesFormatoActivoFijo,jPanelAccionesFormularioFormatoActivoFijo,jmenuBarFormatoActivoFijo,jmenuBarDetalleFormatoActivoFijo,jTtoolBarFormatoActivoFijo,jTtoolBarDetalleFormatoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoActivoFijo ,jPanelParametrosReportesFormatoActivoFijo, jScrollPanelDatosFormatoActivoFijo,jPanelPaginacionFormatoActivoFijo, jScrollPanelDatosEdicionFormatoActivoFijo, jPanelAccionesFormatoActivoFijo,jPanelAccionesFormularioFormatoActivoFijo,jmenuBarFormatoActivoFijo,jmenuBarDetalleFormatoActivoFijo,jTtoolBarFormatoActivoFijo,jTtoolBarDetalleFormatoActivoFijo);
						
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
	
	public void finishProcessFormatoActivoFijo() {// throws Exception 
		this.finishProcessFormatoActivoFijo(true);
	}
	
	public void finishProcessFormatoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormatoActivoFijo ,this.jPanelParametrosReportesFormatoActivoFijo, this.jScrollPanelDatosFormatoActivoFijo,this.jPanelPaginacionFormatoActivoFijo, this.jScrollPanelDatosEdicionFormatoActivoFijo, this.jPanelAccionesFormatoActivoFijo,this.jPanelAccionesFormularioFormatoActivoFijo,this.jmenuBarFormatoActivoFijo,this.jmenuBarDetalleFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,this.jTtoolBarDetalleFormatoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoActivoFijo=this.jTabbedPaneBusquedasFormatoActivoFijo; 
		
		final JPanel jPanelParametrosReportesFormatoActivoFijo=this.jPanelParametrosReportesFormatoActivoFijo;
		//final JScrollPane jScrollPanelDatosFormatoActivoFijo=this.jScrollPanelDatosFormatoActivoFijo;
		final JTable jTableDatosFormatoActivoFijo=this.jTableDatosFormatoActivoFijo;		
		final JPanel jPanelPaginacionFormatoActivoFijo=this.jPanelPaginacionFormatoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionFormatoActivoFijo=this.jScrollPanelDatosEdicionFormatoActivoFijo;
		final JPanel jPanelAccionesFormatoActivoFijo=this.jPanelAccionesFormatoActivoFijo;
		
		JPanel jPanelCamposAuxiliarFormatoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormatoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			jPanelCamposAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelCamposFormatoActivoFijo;
			jPanelAccionesFormularioAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelAccionesFormularioFormatoActivoFijo;
		}
		
		final JPanel jPanelCamposFormatoActivoFijo=jPanelCamposAuxiliarFormatoActivoFijo;
		final JPanel jPanelAccionesFormularioFormatoActivoFijo=jPanelAccionesFormularioAuxiliarFormatoActivoFijo;
		
		
		final JMenuBar jmenuBarFormatoActivoFijo=this.jmenuBarFormatoActivoFijo;		
		final JToolBar jTtoolBarFormatoActivoFijo=this.jTtoolBarFormatoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarFormatoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jmenuBarDetalleFormatoActivoFijo;
			jTtoolBarDetalleAuxiliarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jTtoolBarDetalleFormatoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleFormatoActivoFijo=jmenuBarDetalleAuxiliarFormatoActivoFijo;
		final JToolBar jTtoolBarDetalleFormatoActivoFijo=jTtoolBarDetalleAuxiliarFormatoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoActivoFijo;
			processRunnable.jTableDatos=jTableDatosFormatoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposFormatoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarFormatoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormatoActivoFijo ,jPanelParametrosReportesFormatoActivoFijo, jTableDatosFormatoActivoFijo,/*jScrollPanelDatosFormatoActivoFijo,*/jPanelCamposFormatoActivoFijo,jPanelPaginacionFormatoActivoFijo, /*jScrollPanelDatosEdicionFormatoActivoFijo,*/ jPanelAccionesFormatoActivoFijo,jPanelAccionesFormularioFormatoActivoFijo,jmenuBarFormatoActivoFijo,jmenuBarDetalleFormatoActivoFijo,jTtoolBarFormatoActivoFijo,jTtoolBarDetalleFormatoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormatoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormatoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormatoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormatoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormatoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormatoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormatoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormatoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormatoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formatoactivofijoConstantesFunciones.getsFinalQueryFormatoActivoFijo();
		String  finalQueryPaginacionTodos=this.formatoactivofijoConstantesFunciones.getsFinalQueryFormatoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormatoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoFormatoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormatoActivoFijoConstantesFunciones.getArrayColumnasGlobalesFormatoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormatoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formatoactivofijosEliminados= new ArrayList<FormatoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormatoActivoFijo();
		
				///*FormatoActivoFijoSessionBean*/this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
			
			if(this.formatoactivofijoSessionBean==null) {
				this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=FormatoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormatoActivoFijoConstantesFunciones.getClassesForeignKeysOfFormatoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formatoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formatoactivofijosAux= new ArrayList<FormatoActivoFijo>();
			
				
			formatoactivofijoLogic.setDatosCliente(this.datosCliente);
			formatoactivofijoLogic.setDatosDeep(this.datosDeep);
			formatoactivofijoLogic.setIsConDeep(true);
			
			
			formatoactivofijoLogic.getFormatoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formatoactivofijoLogic.getTodosFormatoActivoFijos(finalQueryGlobal,pagination);
					
					//formatoactivofijoLogic.getTodosFormatoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formatoactivofijoLogic.getFormatoActivoFijos()==null|| formatoactivofijoLogic.getFormatoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatoactivofijosAux= new ArrayList<FormatoActivoFijo>();
							formatoactivofijosAux.addAll(formatoactivofijoLogic.getFormatoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatoactivofijosAux= new ArrayList<FormatoActivoFijo>();
							formatoactivofijosAux.addAll(formatoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatoactivofijoLogic.getTodosFormatoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//formatoactivofijoLogic.getTodosFormatoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormatoActivoFijos("Todos",formatoactivofijoLogic.getFormatoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatoactivofijoLogic.setFormatoActivoFijos(new ArrayList<FormatoActivoFijo>());					
							formatoactivofijoLogic.getFormatoActivoFijos().addAll(formatoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatoactivofijos=new ArrayList<FormatoActivoFijo>();
							formatoactivofijos.addAll(formatoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormatoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormatoActivoFijo=this.idActual;
				
				} else if(this.idFormatoActivoFijoActual!=null && this.idFormatoActivoFijoActual!=0L) {
					idFormatoActivoFijo=idFormatoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=FormatoActivoFijoConstantesFunciones.getDetalleIndicePorId(idFormatoActivoFijo);
				
				this.formatoactivofijos=new ArrayList<FormatoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formatoactivofijoLogic.getEntity(idFormatoActivoFijo);
					
					//formatoactivofijoLogic.getEntityWithConnection(idFormatoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoactivofijoLogic.setFormatoActivoFijos(new ArrayList<FormatoActivoFijo>());
					formatoactivofijoLogic.getFormatoActivoFijos().add(formatoactivofijoLogic.getFormatoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatoactivofijos=new ArrayList<FormatoActivoFijo>();
					this.formatoactivofijos.add(formatoactivofijo);
				}
				
				if(formatoactivofijoLogic.getFormatoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormatoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatoactivofijoLogic.getFormatoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatoactivofijoLogic.getFormatoActivoFijos()==null||formatoactivofijoLogic.getFormatoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatoactivofijos==null|| formatoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoactivofijosAux=new ArrayList<FormatoActivoFijo>();
						formatoactivofijosAux.addAll(formatoactivofijoLogic.getFormatoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatoactivofijosAux=new ArrayList<FormatoActivoFijo>();
							formatoactivofijosAux.addAll(formatoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatoactivofijoLogic.getFormatoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoActivoFijos("FK_IdEmpresa",formatoactivofijoLogic.getFormatoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoActivoFijos("FK_IdEmpresa",formatoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoactivofijoLogic.setFormatoActivoFijos(new ArrayList<FormatoActivoFijo>());
						formatoactivofijoLogic.getFormatoActivoFijos().addAll(formatoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatoactivofijos=new ArrayList<FormatoActivoFijo>();
							formatoactivofijos.addAll(formatoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormatoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormatoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatoactivofijoLogic.getFormatoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatoactivofijoLogic.getFormatoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormatoActivoFijo formatoactivofijo) {
		Boolean permite=true;
		
		if(this.formatoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormatoActivoFijoConstantesFunciones.getOrderByListaFormatoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormatoActivoFijoConstantesFunciones.getOrderByListaFormatoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoActivoFijo formatoactivofijo:formatoactivofijoLogic.getFormatoActivoFijos()) {
				if(formatoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					formatoactivofijoTotales=formatoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoActivoFijo formatoactivofijo:this.formatoactivofijos) {
				if(formatoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					formatoactivofijoTotales=formatoactivofijo;
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
			this.formatoactivofijoAux=new FormatoActivoFijo();
			this.formatoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.formatoactivofijoAux.setIsNew(false);
			this.formatoactivofijoAux.setIsChanged(false);
			this.formatoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormatoActivoFijoConstantesFunciones.TotalizarValoresFilaFormatoActivoFijo(this.formatoactivofijoLogic.getFormatoActivoFijos(),this.formatoactivofijoAux);
				
				this.formatoactivofijoLogic.getFormatoActivoFijos().add(this.formatoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormatoActivoFijoConstantesFunciones.TotalizarValoresFilaFormatoActivoFijo(this.formatoactivofijos,this.formatoactivofijoAux);
				
				this.formatoactivofijos.add(this.formatoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formatoactivofijoTotales=new FormatoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatoactivofijoLogic.getFormatoActivoFijos().remove(formatoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatoactivofijos.remove(formatoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formatoactivofijoTotales=new FormatoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoActivoFijo formatoactivofijo:formatoactivofijoLogic.getFormatoActivoFijos()) {
				if(formatoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					formatoactivofijoTotales=formatoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoActivoFijoConstantesFunciones.TotalizarValoresFilaFormatoActivoFijo(this.formatoactivofijoLogic.getFormatoActivoFijos(),formatoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoActivoFijo formatoactivofijo:this.formatoactivofijos) {
				if(formatoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					formatoactivofijoTotales=formatoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoActivoFijoConstantesFunciones.TotalizarValoresFilaFormatoActivoFijo(this.formatoactivofijos,formatoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormatoActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoActivoFijosFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoActivoFijosFK_IdFormato2()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato2";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormatoActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoactivofijoLogic.getFormatoActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoActivoFijosFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoactivofijoLogic.getFormatoActivoFijosFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoActivoFijosFK_IdFormato2(String sFinalQuery,Long id_formato2)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoactivofijoLogic.getFormatoActivoFijosFK_IdFormato2(sFinalQuery,this.pagination,id_formato2);
				
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
	
	public void inicializarPermisosFormatoActivoFijo() {
		this.isPermisoTodoFormatoActivoFijo=false;
		this.isPermisoNuevoFormatoActivoFijo=false;
		this.isPermisoActualizarFormatoActivoFijo=false;
		this.isPermisoActualizarOriginalFormatoActivoFijo=false;
		this.isPermisoEliminarFormatoActivoFijo=false;
		this.isPermisoGuardarCambiosFormatoActivoFijo=false;
		this.isPermisoConsultaFormatoActivoFijo=false;
		this.isPermisoBusquedaFormatoActivoFijo=false;
		this.isPermisoReporteFormatoActivoFijo=false;		
		this.isPermisoOrdenFormatoActivoFijo=false;		
		this.isPermisoPaginacionMedioFormatoActivoFijo=false;		
		this.isPermisoPaginacionAltoFormatoActivoFijo=false;
		this.isPermisoPaginacionTodoFormatoActivoFijo=false;
		this.isPermisoCopiarFormatoActivoFijo=false;		
		this.isPermisoVerFormFormatoActivoFijo=false;		
		this.isPermisoDuplicarFormatoActivoFijo=false;		
		this.isPermisoOrdenFormatoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioFormatoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoFormatoActivoFijo=isPermiso;
		this.isPermisoNuevoFormatoActivoFijo=isPermiso;
		this.isPermisoActualizarFormatoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalFormatoActivoFijo=isPermiso;
		this.isPermisoEliminarFormatoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosFormatoActivoFijo=isPermiso;
		this.isPermisoConsultaFormatoActivoFijo=isPermiso;
		this.isPermisoBusquedaFormatoActivoFijo=isPermiso;
		this.isPermisoReporteFormatoActivoFijo=isPermiso;
		this.isPermisoOrdenFormatoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioFormatoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoFormatoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoFormatoActivoFijo=isPermiso;		
		this.isPermisoCopiarFormatoActivoFijo=isPermiso;		
		this.isPermisoVerFormFormatoActivoFijo=isPermiso;		
		this.isPermisoDuplicarFormatoActivoFijo=isPermiso;
		this.isPermisoOrdenFormatoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormatoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoFormatoActivoFijo=isPermiso;
		this.isPermisoNuevoFormatoActivoFijo=isPermiso;
		this.isPermisoActualizarFormatoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalFormatoActivoFijo=isPermiso;
		this.isPermisoEliminarFormatoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosFormatoActivoFijo=isPermiso;
		//this.isPermisoConsultaFormatoActivoFijo=isPermiso;
		//this.isPermisoBusquedaFormatoActivoFijo=isPermiso;
		//this.isPermisoReporteFormatoActivoFijo=isPermiso;
		//this.isPermisoOrdenFormatoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioFormatoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoFormatoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoFormatoActivoFijo=isPermiso;		
		//this.isPermisoCopiarFormatoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarFormatoActivoFijo=isPermiso;
		//this.isPermisoOrdenFormatoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormatoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FormatoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormatoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormatoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFormatoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormatoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormatoActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFormatoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormatoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormatoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormatoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormatoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormatoActivoFijo=this.isPermisoActualizarFormatoActivoFijo;
			this.isPermisoEliminarFormatoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormatoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormatoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormatoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormatoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormatoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormatoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormatoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormatoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormatoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormatoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormatoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormatoActivoFijo.setToolTipText(this.jTableDatosFormatoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormatoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormatoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormatoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormatoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormatoActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyFormatoActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
				this.formato2sForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormatoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormatoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormatoActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormato2Listas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato2Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formato2sForeignKey==null||this.formato2sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormato2sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormatoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormatoActivoFijoParameterReturnGeneral formatoactivofijoReturnGeneral=new FormatoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formatoactivofijoConstantesFunciones.cargarid_empresaFormatoActivoFijo)
					 || (this.esRecargarFks && this.formatoactivofijoConstantesFunciones.cargarid_empresaFormatoActivoFijo)) {

					if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formatoactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.formatoactivofijoConstantesFunciones.cargarid_formatoFormatoActivoFijo)
					 || (this.esRecargarFks && this.formatoactivofijoConstantesFunciones.cargarid_formatoFormatoActivoFijo)) {

					if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+formatoactivofijoSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}


				String finalQueryGlobalFormato2="";

				if(((this.formato2sForeignKey==null||this.formato2sForeignKey.size()<=0) && this.formatoactivofijoConstantesFunciones.cargarid_formato2FormatoActivoFijo)
					 || (this.esRecargarFks && this.formatoactivofijoConstantesFunciones.cargarid_formato2FormatoActivoFijo)) {

					if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionFormato2()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato2=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato2=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato2, "");
						finalQueryGlobalFormato2+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormato2sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato2=" WHERE " + ConstantesSql.ID + "="+formatoactivofijoSessionBean.getlidFormato2Actual();
					}
				} else {
					finalQueryGlobalFormato2="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formatoactivofijoReturnGeneral=formatoactivofijoLogic.cargarCombosLoteForeignKeyFormatoActivoFijo(finalQueryGlobalEmpresa,finalQueryGlobalFormato,finalQueryGlobalFormato2);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formatoactivofijoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=formatoactivofijoReturnGeneral.getformatosForeignKey();
			}

			if(!finalQueryGlobalFormato2.equals("NONE")) {
				this.formato2sForeignKey=formatoactivofijoReturnGeneral.getformato2sForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormatoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyFormato();
			this.addItemDefectoCombosForeignKeyFormato2();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formatoactivofijoSessionBean==null) {
				this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
			}

			if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato2()throws Exception {
		try {

			if(!this.formatoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionFormato2()) {
				Formato formato2=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato2,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato2.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formato2sForeignKey,formato2,true)) {

					this.formato2sForeignKey.add(0,formato2);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormatoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormatoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormatoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormatoActivoFijo(FormatoActivoFijo formatoactivofijo)throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(formatoactivofijo.getid_formato(),false,"Formulario");
			this.setActualFormato2ForeignKey(formatoactivofijo.getid_formato2(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormatoActivoFijo()throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(this.formatoactivofijoConstantesFunciones.getid_formato(),false,"Formulario");
			this.setActualFormato2ForeignKey(this.formatoactivofijoConstantesFunciones.getid_formato2(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormatoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormatoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormatoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormatoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");
			this.cargarCombosFrameFormato2sForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormatoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormato2sForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormatoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo!=null && this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo!=null && this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo!=null && this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public FormatoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormatoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormatoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean(); 
		this.formatoactivofijoConstantesFunciones=new FormatoActivoFijoConstantesFunciones(); 
		this.formatoactivofijoBean=new FormatoActivoFijo();//(this.formatoactivofijoConstantesFunciones); 		
		this.formatoactivofijoReturnGeneral=new FormatoActivoFijoParameterReturnGeneral(); 
		
		this.formatoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormatoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormatoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormatoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormatoActivoFijo(true);
			
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
			
			this.formatoactivofijoConstantesFunciones=new FormatoActivoFijoConstantesFunciones(); 
			this.formatoactivofijoBean=new FormatoActivoFijo();//this.formatoactivofijoConstantesFunciones); 			
			this.formatoactivofijoReturnGeneral=new FormatoActivoFijoParameterReturnGeneral(); 
		
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formatos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.formatoactivofijo=new FormatoActivoFijo();
			this.formatoactivofijos = new ArrayList<FormatoActivoFijo>();
			this.formatoactivofijosAux = new ArrayList<FormatoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic=new FormatoActivoFijoLogic();
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.formatoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formatoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormatoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionFormatoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormatoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormatoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoActivoFijo);
				this.jInternalFrameDetalleFormFormatoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormFormatoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoActivoFijo);
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormatoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormatoActivoFijo);
					this.jInternalFrameImportacionFormatoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionFormatoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormatoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormatoActivoFijo);
					this.jInternalFrameOrderByFormatoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByFormatoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormatoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormatoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formatoactivofijoReturnGeneral=new FormatoActivoFijoParameterReturnGeneral();
			
			this.formatoactivofijoParameterGeneral=new FormatoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formatoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormatoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatoactivofijoSessionBean.getEsGuardarRelacionado(),this.formatoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatoactivofijoSessionBean.getEsGuardarRelacionado(),this.formatoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarFormatoActivoFijo=true;
			this.isVisibilidadCeldaCopiarFormatoActivoFijo=true;
			this.isVisibilidadCeldaVerFormFormatoActivoFijo=true;
			this.isVisibilidadCeldaOrdenFormatoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
			this.isVisibilidadCeldaModificarFormatoActivoFijo=false;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=false;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdFormato2=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormatoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormatoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormatoActivoFijo(false);
			
			this.setPermisosUsuarioFormatoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.formatoactivofijoSessionBean.getEsGuardarRelacionado() && this.formatoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormatoActivoFijoClasesRelacionadas();
			}
			
			if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormatoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormatoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormatoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaFormatoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormatoActivoFijo,this.isPermisoPaginacionMedioFormatoActivoFijo,this.isPermisoPaginacionTodoFormatoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormatoActivoFijoConstantesFunciones.getTiposSeleccionarFormatoActivoFijo());
				
				this.tiposColumnasSelect=FormatoActivoFijoConstantesFunciones.getTiposSeleccionarFormatoActivoFijo(true);
				
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
			//if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormatoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFormatoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFormatoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoActivoFijo() ;
			
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
			this.formatoLogic=new FormatoLogic();
			this.formato2Logic=new FormatoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formatoactivofijoImplementable= (FormatoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formatoactivofijoImplementableHome= (FormatoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formatoactivofijos= new ArrayList<FormatoActivoFijo>();
			this.formatoactivofijosEliminados= new ArrayList<FormatoActivoFijo>();
						
			this.isEsNuevoFormatoActivoFijo=false;
			this.esParaAccionDesdeFormularioFormatoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			this.formato2sForeignKey=new ArrayList<Formato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormatoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormatoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormatoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormatoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormatoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormatoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormatoActivoFijo();
			}
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormatoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormatoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormatoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormatoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormatoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormatoActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormatoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormatoActivoFijo();	
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
	
	public void cargarCombosForeignKeyFormatoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormatoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormatoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormatoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormatoActivoFijo();
		
		this.cargarCombosFrameForeignKeyFormatoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormatoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormatoActivoFijo();
		}
	}
	
	

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato2(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormato2Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato2();
				this.cargarCombosFrameFormato2sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato2(this.formato2sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormatoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
			
			if(jTableDatosFormatoActivoFijo.getRowCount()>=1) {
				jTableDatosFormatoActivoFijo.removeRowSelectionInterval(0, jTableDatosFormatoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoFormatoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormatoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormatoActivoFijo(true);			
			//this.formatoactivofijo=new FormatoActivoFijo();
			//this.formatoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoActivoFijo() ;
			
			if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formatoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);				
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
			if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormatoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormatoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormatoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormatoActivoFijo.getSelectedRows().length;			
			}
			
			formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormatoActivoFijo--;			
				//FormatoActivoFijo formatoactivofijoAux= new FormatoActivoFijo();			
				//formatoactivofijoAux.setId(this.iIdNuevoFormatoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormatoActivoFijo formatoactivofijoOrigen=new FormatoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormatoActivoFijo formatoactivofijoOrigen : formatoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formatoactivofijoOrigen =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatoactivofijoOrigen =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormatoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formatoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormatoActivoFijo(formatoactivofijoOrigen,this.formatoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatoactivofijoLogic.getFormatoActivoFijos().add(this.formatoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatoactivofijos.add(this.formatoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
				
				this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoFormatoActivoFijo(), this.getIndiceNuevoFormatoActivoFijo());
				
				int iLastRow =  this.jTableDatosFormatoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();									
		
			FormatoActivoFijo formatoactivofijoOrigen=new FormatoActivoFijo();
			FormatoActivoFijo formatoactivofijoDestino=new FormatoActivoFijo();
				
			formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormatoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formatoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormatoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoactivofijoOrigen =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatoactivofijoOrigen =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoactivofijoDestino =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatoactivofijoDestino =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formatoactivofijoOrigen =formatoactivofijosSeleccionados.get(0);
				formatoactivofijoDestino =formatoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormatoActivoFijo(formatoactivofijoOrigen,formatoactivofijoDestino,true,false);
				
				formatoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatoactivofijoDestino,formatoactivofijoLogic.getFormatoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoactivofijoDestino,formatoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
				
				//this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoFormatoActivoFijo(), this.getIndiceNuevoFormatoActivoFijo());
				
				int iLastRow =  this.jTableDatosFormatoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormatoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormatoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormatoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionFormatoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesFormatoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormatoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormatoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormatoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormatoActivoFijo();
			
			this.abrirFrameOrderByFormatoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormatoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormatoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormatoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormFormatoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormatoActivoFijo.setSize(this.jInternalFrameDetalleFormFormatoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormFormatoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormatoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormatoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormatoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormFormatoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormatoActivoFijo.jContentPaneDetalleFormatoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormatoActivoFijo.jContentPaneDetalleFormatoActivoFijo.getWidth(),FormatoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormatoActivoFijo.jContentPaneDetalleFormatoActivoFijo.getWidth(),FormatoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormatoActivoFijo.jContentPaneDetalleFormatoActivoFijo.getWidth(),FormatoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormatoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormFormatoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormatoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormatoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormatoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByFormatoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormatoActivoFijo);
				this.jInternalFrameOrderByFormatoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByFormatoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByFormatoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByFormatoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormatoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormatoActivoFijo==null) {
				
				this.jInternalFrameImportacionFormatoActivoFijo=new ImportacionJInternalFrame(FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormatoActivoFijo);
				this.jInternalFrameImportacionFormatoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionFormatoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionFormatoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoActivoFijo"));
				this.jInternalFrameImportacionFormatoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoActivoFijo"));
				this.jInternalFrameImportacionFormatoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormatoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormatoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoFormatoActivoFijo=new ReporteDinamicoJInternalFrame(FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoActivoFijo);
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoActivoFijo"));
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoActivoFijo"));
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFormatoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoActivoFijo);
			
	       	this.jInternalFrameDetalleFormFormatoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormFormatoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormatoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormFormatoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormatoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormatoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormatoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormatoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormatoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionFormatoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormatoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormatoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByFormatoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormatoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormatoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByFormatoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormatoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormatoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormatoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormatoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormatoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionFormatoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormatoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormatoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormatoActivoFijo(true);
			//this.isEsNuevoFormatoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormatoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoActivoFijo(false) ;
			
			if(formatoactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormatoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormatoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormatoActivoFijo(true);
			//this.isEsNuevoFormatoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formatoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormatoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormatoActivoFijo(false) ;
			
			if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato2(List<Formato> formato2sForeignKey)throws Exception{
		TableColumn tableColumnFormato2=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2));
		TableCellEditor tableCellEditorFormato2 =tableColumnFormato2.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato2;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formato2sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formato2sForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormatoActivoFijo(false);
			
			//if(!this.isEsNuevoFormatoActivoFijo) {								
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.formatoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormatoActivoFijo=true;
					this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
					this.isEsNuevoFormatoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormatoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormatoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesFormatoActivoFijo(false);
			
												
				
				if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormatoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormatoActivoFijoActionPerformed(evt,formatoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormatoActivoFijo(this.formatoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formatoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formatoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.formatoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.formatoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formatoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormatoActivoFijoModel) this.jTableDatosFormatoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormatoActivoFijo=true;
				this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
				this.isEsNuevoFormatoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesFormatoActivoFijo(false);
				
				
				
				if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormatoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormatoActivoFijo.getRowCount()>=1) {
				jTableDatosFormatoActivoFijo.removeRowSelectionInterval(0, jTableDatosFormatoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormatoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoActivoFijo(false) ;
			
			this.isEsNuevoFormatoActivoFijo=false;
			
			if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormatoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormatoActivoFijo(false);
				
				//SI ES MANUAL
				if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormatoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormatoActivoFijo--;			
			//FormatoActivoFijo formatoactivofijoAux= new FormatoActivoFijo();			
			//formatoactivofijoAux.setId(this.iIdNuevoFormatoActivoFijo);
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormatoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
			
			this.formatoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formatoactivofijoLogic.getFormatoActivoFijos().add(this.formatoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formatoactivofijos.add(this.formatoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
			
			this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoFormatoActivoFijo(), this.getIndiceNuevoFormatoActivoFijo());
			
			int iLastRow =  this.jTableDatosFormatoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormatoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormatoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoActivoFijo(false);
			
			//SI ES MANUAL
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoActivoFijo();
			}
			
			//this.abrirFrameTreeFormatoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE FormatosS ?", "MANTENIMIENTO DE Formatos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormatoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormatoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formatoactivofijoReturnGeneral=formatoactivofijoLogic.procesarImportacionFormatoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formatoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormatoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormatoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormatoActivoFijo.setFileImportacion(this.jInternalFrameImportacionFormatoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormatoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormatoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormatoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormatoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		

		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormatoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormatoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteFormatoActivoFijos("Todos",formatoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato2_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2:
					sNombreCampoCategoria="id_formato2";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2:
					sNombreCampoCategoriaValor="id_formato2";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato2");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormatoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormatoActivoFijo formatoactivofijo:formatoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatoactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(FormatoActivoFijo formatoactivofijo:formatoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatoactivofijo.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2);
					iRow++;

					for(FormatoActivoFijo formatoactivofijo:formatoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatoactivofijo.getformato2_descripcion());
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
			//	this.getFilaCabeceraExportarExcelFormatoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormatoActivoFijo(formatoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
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
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoActivoFijo(false);
			
			//SI ES MANUAL
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoActivoFijo(false);
			
			//SI ES MANUAL
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoActivoFijo(false);
			
			//SI ES MANUAL
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormatoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormatoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormatoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormatoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormatoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormatoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormatoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormatoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormatoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormatoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormatoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormatoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormatoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormatoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormatoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormatoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormatoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualFormatoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormatoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormatoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormatoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormatoActivoFijo.jCheckBoxPostAccionNuevoFormatoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormatoActivoFijo.jCheckBoxPostAccionSinCerrarFormatoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormatoActivoFijo.jCheckBoxPostAccionSinMensajeFormatoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormatoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormatoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormatoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
				this.jInternalFrameDetalleFormFormatoActivoFijo.jCheckBoxPostAccionNuevoFormatoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormatoActivoFijo.jCheckBoxPostAccionSinCerrarFormatoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormatoActivoFijo.jCheckBoxPostAccionSinMensajeFormatoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormatoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormatoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormatoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormatoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormatoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormatoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormatoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormatoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormatoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormatoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormatoActivoFijo() throws Exception {
		try	{
			if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormatoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormatoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormatoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormatoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormatoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormatoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormatoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormatoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormatoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormatoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormatoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormatoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormatoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormatoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormatoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormatoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormatoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormatoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormatoActivoFijo(Boolean esInicializar) throws Exception {				
		if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormatoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormatoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormatoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormatoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formatoactivofijoLogic.getFormatoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formatoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormatoActivoFijo.setModel(new FormatoActivoFijoModel(this.formatoactivofijoLogic.getFormatoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormatoActivoFijo.setModel(new FormatoActivoFijoModel(this.formatoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormatoActivoFijo!=null && this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormatoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO,formatoactivofijoConstantesFunciones.resaltarSeleccionarFormatoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO,formatoactivofijoConstantesFunciones.resaltarSeleccionarFormatoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,FormatoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.formatoactivofijoConstantesFunciones.mostraridFormatoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formatoactivofijoConstantesFunciones.resaltaridFormatoActivoFijo,this.formatoactivofijoConstantesFunciones.activaridFormatoActivoFijo,this,true,"idFormatoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatoactivofijoConstantesFunciones.resaltaridFormatoActivoFijo,this.formatoactivofijoConstantesFunciones.activaridFormatoActivoFijo,this,true,"idFormatoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formatoactivofijoConstantesFunciones.mostrarid_empresaFormatoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formatoactivofijoConstantesFunciones.resaltarid_empresaFormatoActivoFijo,this,this.formatoactivofijoConstantesFunciones.activarid_empresaFormatoActivoFijo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formatoactivofijoConstantesFunciones.resaltarid_empresaFormatoActivoFijo,this,this.formatoactivofijoConstantesFunciones.activarid_empresaFormatoActivoFijo,false,"id_empresaFormatoActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO));

		if(this.formatoactivofijoConstantesFunciones.mostrarid_formatoFormatoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.formatoactivofijoConstantesFunciones.resaltarid_formatoFormatoActivoFijo,this,this.formatoactivofijoConstantesFunciones.activarid_formatoFormatoActivoFijo));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.formatoactivofijoConstantesFunciones.resaltarid_formatoFormatoActivoFijo,this,this.formatoactivofijoConstantesFunciones.activarid_formatoFormatoActivoFijo,true,"id_formatoFormatoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2));

		if(this.formatoactivofijoConstantesFunciones.mostrarid_formato2FormatoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formato2sForeignKey,this.formatoactivofijoConstantesFunciones.resaltarid_formato2FormatoActivoFijo,this,this.formatoactivofijoConstantesFunciones.activarid_formato2FormatoActivoFijo));
			tableColumn.setCellEditor(new FormatoTableCell(this.formato2sForeignKey,this.formatoactivofijoConstantesFunciones.resaltarid_formato2FormatoActivoFijo,this,this.formatoactivofijoConstantesFunciones.activarid_formato2FormatoActivoFijo,true,"id_formato2FormatoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formatoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formatoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormatoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosFormatoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormatoActivoFijo.moveColumn(this.jTableDatosFormatoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormatoActivoFijo.moveColumn(this.jTableDatosFormatoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormatoActivoFijo.moveColumn(this.jTableDatosFormatoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormatoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormatoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormatoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormatoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormatoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormatoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormatoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formatoactivofijoLogic.getFormatoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formatoactivofijos.size()-1;
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
		//this.jTableDatosFormatoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormatoActivoFijo();
			
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
				
				//this.isEsNuevoFormatoActivoFijo=false;
					
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
				if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formatoactivofijo.getsType().equals("DUPLICADO")
				   || this.formatoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormatoActivoFijo=true;
				
				} else {
					this.isEsNuevoFormatoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.formatoactivofijo.getId()>=0 && !this.formatoactivofijo.getIsNew()) {						
						this.isEsNuevoFormatoActivoFijo=false;
						
					} else {
						this.isEsNuevoFormatoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormatoActivoFijo(esRelaciones);						
				
				this.seleccionarFormatoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formatoactivofijo.getId()<0) {
					this.isEsNuevoFormatoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormatoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormatoActivoFijo(evt,rowIndex);
				}	
				
				if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormatoActivoFijo: " + this.dDif); 
					}
				}								
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormatoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formatoactivofijo)) {
					if(this.formatoactivofijo.getId()>0) {
						this.formatoactivofijo.setIsDeleted(true);
						
						this.formatoactivofijosEliminados.add(this.formatoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatoactivofijoLogic.getFormatoActivoFijos().remove(this.formatoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatoactivofijos.remove(this.formatoactivofijo);				
					}
					
					
					((FormatoActivoFijoModel) this.jTableDatosFormatoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormatoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormatoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormatoActivoFijo(this.formatoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formatoactivofijoConstantesFunciones.cargarid_empresaFormatoActivoFijo || this.formatoactivofijoConstantesFunciones.event_dependid_empresaFormatoActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formatoactivofijo.getid_empresa());
									//this.inicializarActualizarBindingFormatoActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formatoactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(formatoactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formatoactivofijo.getid_empresa(),false,"Formulario");

					//Formato
					if(!this.formatoactivofijoConstantesFunciones.cargarid_formatoFormatoActivoFijo || this.formatoactivofijoConstantesFunciones.event_dependid_formatoFormatoActivoFijo) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.formatoactivofijo.getid_formato());
									//this.inicializarActualizarBindingFormatoActivoFijo(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(formatoactivofijo.getFormato()!=null) {
							this.formatosForeignKey.add(formatoactivofijo.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.formatoactivofijo.getid_formato(),false,"Formulario");

					//Formato2
					if(!this.formatoactivofijoConstantesFunciones.cargarid_formato2FormatoActivoFijo || this.formatoactivofijoConstantesFunciones.event_dependid_formato2FormatoActivoFijo) {
						//this.cargarCombosFormato2sForeignKeyLista(" where id="+this.formatoactivofijo.getid_formato2());
									//this.inicializarActualizarBindingFormatoActivoFijo(false,false);
						this.formato2sForeignKey=new ArrayList<Formato>();

						if(formatoactivofijo.getFormato2()!=null) {
							this.formato2sForeignKey.add(formatoactivofijo.getFormato2());
						}

						this.addItemDefectoCombosForeignKeyFormato2();
						this.cargarCombosFrameFormato2sForeignKey("Todos");
					}
					this.setActualFormato2ForeignKey(this.formatoactivofijo.getid_formato2(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormatoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormatoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoActivoFijo(FormatoActivoFijo formatoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormatoActivoFijo(formatoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormatoActivoFijo(formatoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormatoActivoFijo(formatoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormatoActivoFijo(formatoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioFormatoActivoFijo(FormatoActivoFijo formatoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.setText(formatoactivofijo.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormatoActivoFijo formatoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formatoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormatoActivoFijo formatoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formatoactivofijoLocal=this.formatoactivofijo;
			} else {
				formatoactivofijoLocal=this.formatoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formatoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormatoActivoFijo(formatoactivofijoLocal,true);
					
					if(formatoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formatoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formatoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoActivoFijo(formatoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(formatoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoActivoFijo(formatoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.getText()==null || this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.setText("0");
			}

			if(conColumnasBase) {formatoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelIdFormatoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoActivoFijo(FormatoActivoFijo formatoactivofijoBean,FormatoActivoFijo formatoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formatoactivofijoBean.getid_formato()!=null && !formatoactivofijoBean.getid_formato().equals(-1L))) {formatoactivofijo.setid_formato(formatoactivofijoBean.getid_formato());}
			if(conDefault || (!conDefault && formatoactivofijoBean.getid_formato2()!=null && !formatoactivofijoBean.getid_formato2().equals(-1L))) {formatoactivofijo.setid_formato2(formatoactivofijoBean.getid_formato2());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormatoActivoFijo(FormatoActivoFijo formatoactivofijoOrigen,FormatoActivoFijo formatoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatoactivofijoOrigen.getId()!=null && !formatoactivofijoOrigen.getId().equals(0L))) {formatoactivofijo.setId(formatoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && formatoactivofijoOrigen.getid_formato()!=null && !formatoactivofijoOrigen.getid_formato().equals(-1L))) {formatoactivofijo.setid_formato(formatoactivofijoOrigen.getid_formato());}
			if(conDefault || (!conDefault && formatoactivofijoOrigen.getid_formato2()!=null && !formatoactivofijoOrigen.getid_formato2().equals(-1L))) {formatoactivofijo.setid_formato2(formatoactivofijoOrigen.getid_formato2());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoActivoFijo(FormatoActivoFijo formatoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.setText(formatoactivofijo.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoActivoFijo(FormatoActivoFijoBean formatoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.setText(formatoactivofijoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormatoActivoFijo(FormatoActivoFijoParameterReturnGeneral formatoactivofijoReturnGeneral,FormatoActivoFijoBean formatoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			FormatoActivoFijo formatoactivofijoLocal=new FormatoActivoFijo();
			
			formatoactivofijoLocal=formatoactivofijoReturnGeneral.getFormatoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatoactivofijoLocal.getId()!=null && !formatoactivofijoLocal.getId().equals(0L))) {formatoactivofijoBean.setId(formatoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && formatoactivofijoLocal.getid_formato()!=null && !formatoactivofijoLocal.getid_formato().equals(-1L))) {formatoactivofijoBean.setid_formato(formatoactivofijoLocal.getid_formato());}
			if(conDefault || (!conDefault && formatoactivofijoLocal.getid_formato2()!=null && !formatoactivofijoLocal.getid_formato2().equals(-1L))) {formatoactivofijoBean.setid_formato2(formatoactivofijoLocal.getid_formato2());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormatoActivoFijoGenerico(Long idFormatoActivoFijoSeleccionado,JComboBox jComboBoxFormatoActivoFijo,List<FormatoActivoFijo> formatoactivofijosLocal)throws Exception {
		try {
			FormatoActivoFijo  formatoactivofijoTemp=null;

			for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijosLocal) {
				if(formatoactivofijoAux.getId()!=null && formatoactivofijoAux.getId().equals(idFormatoActivoFijoSeleccionado)) {
					formatoactivofijoTemp=formatoactivofijoAux;
					break;
				}
			}

			jComboBoxFormatoActivoFijo.setSelectedItem(formatoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormatoActivoFijoGenerico(JComboBox jComboBoxFormatoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormatoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormatoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatoactivofijo=(FormatoActivoFijo) formatoactivofijoLogic.getFormatoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatoactivofijo =(FormatoActivoFijo) formatoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formatoactivofijo.getIsNew() && !formatoactivofijo.getIsChanged() && !formatoactivofijo.getIsDeleted()) {
				sDescripcion=formatoactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formatoactivofijo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!formatoactivofijo.getIsNew() && !formatoactivofijo.getIsChanged() && !formatoactivofijo.getIsDeleted()) {
				sDescripcion=formatoactivofijo.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=formatoactivofijo.getformato_descripcion();
			}
		}

		if(sTipo.equals("Formato2")) {
			//sDescripcion=this.getActualFormato2ForeignKeyDescripcion((Long)value);
			if(!formatoactivofijo.getIsNew() && !formatoactivofijo.getIsChanged() && !formatoactivofijo.getIsDeleted()) {
				sDescripcion=formatoactivofijo.getformato2_descripcion();
			} else {
				//sDescripcion=this.getActualFormato2ForeignKeyDescripcion((Long)value);
				sDescripcion=formatoactivofijo.getformato2_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormatoActivoFijo formatoactivofijoRow=new FormatoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatoactivofijoRow=(FormatoActivoFijo) formatoactivofijoLogic.getFormatoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatoactivofijoRow=(FormatoActivoFijo) formatoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormatoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo));			
			this.jButtonDuplicarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarFormatoActivoFijo && this.isPermisoDuplicarFormatoActivoFijo));			
			this.jButtonCopiarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarFormatoActivoFijo && this.isPermisoCopiarFormatoActivoFijo));
			this.jButtonVerFormFormatoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormFormatoActivoFijo && this.isPermisoVerFormFormatoActivoFijo));
			
			this.jButtonAbrirOrderByFormatoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenFormatoActivoFijo && this.isPermisoOrdenFormatoActivoFijo));			
			
			this.jButtonNuevoRelacionesFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo));			
			this.jButtonNuevoGuardarCambiosFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaModificarFormatoActivoFijo && this.isPermisoActualizarFormatoActivoFijo));	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarFormatoActivoFijo && this.isPermisoActualizarFormatoActivoFijo));	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarFormatoActivoFijo && this.isPermisoEliminarFormatoActivoFijo));
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarFormatoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarFormatoActivoFijo);							
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormatoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo));						
			this.jButtonDuplicarToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarFormatoActivoFijo && this.isPermisoDuplicarFormatoActivoFijo));						
			this.jButtonCopiarToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarFormatoActivoFijo && this.isPermisoCopiarFormatoActivoFijo));			
			this.jButtonVerFormToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormFormatoActivoFijo && this.isPermisoVerFormFormatoActivoFijo));			
			this.jButtonAbrirOrderByToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenFormatoActivoFijo && this.isPermisoOrdenFormatoActivoFijo));
			this.jButtonNuevoRelacionesToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaModificarFormatoActivoFijo && this.isPermisoActualizarFormatoActivoFijo));	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarFormatoActivoFijo  && this.isPermisoActualizarFormatoActivoFijo));	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarFormatoActivoFijo && this.isPermisoEliminarFormatoActivoFijo));
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarToolBarFormatoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarFormatoActivoFijo);				
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo));			
			this.jMenuItemDuplicarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarFormatoActivoFijo && this.isPermisoDuplicarFormatoActivoFijo));			
			this.jMenuItemCopiarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarFormatoActivoFijo && this.isPermisoCopiarFormatoActivoFijo));			
			this.jMenuItemVerFormFormatoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormFormatoActivoFijo && this.isPermisoVerFormFormatoActivoFijo));			
			this.jMenuItemAbrirOrderByFormatoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenFormatoActivoFijo && this.isPermisoOrdenFormatoActivoFijo));			
			//this.jMenuItemMostrarOcultarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenFormatoActivoFijo && this.isPermisoOrdenFormatoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByFormatoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenFormatoActivoFijo && this.isPermisoOrdenFormatoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenFormatoActivoFijo && this.isPermisoOrdenFormatoActivoFijo));			
			this.jMenuItemNuevoRelacionesFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoFormatoActivoFijo && this.isPermisoNuevoFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemModificarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaModificarFormatoActivoFijo && this.isPermisoActualizarFormatoActivoFijo));	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemActualizarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarFormatoActivoFijo && this.isPermisoActualizarFormatoActivoFijo));	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemEliminarFormatoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarFormatoActivoFijo && this.isPermisoEliminarFormatoActivoFijo));
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemCancelarFormatoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarFormatoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosFormatoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaFormatoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=this.jButtonNuevoFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarFormatoActivoFijo=this.jButtonDuplicarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarFormatoActivoFijo=this.jButtonCopiarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormFormatoActivoFijo=this.jButtonVerFormFormatoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenFormatoActivoFijo=this.jButtonAbrirOrderByFormatoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=this.jButtonNuevoRelacionesFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarFormatoActivoFijo=this.jButtonModificarFormatoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=this.jButtonGuardarCambiosTablaFormatoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=this.jButtonNuevoToolBarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=this.jButtonNuevoRelacionesToolBarFormatoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarToolBarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarToolBarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarToolBarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarToolBarFormatoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoActivoFijo=this.jButtonGuardarCambiosToolBarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=this.jButtonGuardarCambiosTablaToolBarFormatoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=this.jMenuItemNuevoFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=this.jMenuItemNuevoRelacionesFormatoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemModificarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemActualizarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemEliminarFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemCancelarFormatoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoActivoFijo=this.jMenuItemGuardarCambiosFormatoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=this.jMenuItemGuardarCambiosTablaFormatoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormatoActivoFijo(Boolean esInicializar) {
		if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualFormatoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormatoActivoFijo() {
		this.jButtonNuevoFormatoActivoFijo.setVisible(this.isPermisoNuevoFormatoActivoFijo);			
		this.jButtonDuplicarFormatoActivoFijo.setVisible(this.isPermisoDuplicarFormatoActivoFijo);			
		this.jButtonCopiarFormatoActivoFijo.setVisible(this.isPermisoCopiarFormatoActivoFijo);			
		this.jButtonVerFormFormatoActivoFijo.setVisible(this.isPermisoVerFormFormatoActivoFijo);			
		
		this.jButtonAbrirOrderByFormatoActivoFijo.setVisible(this.isPermisoOrdenFormatoActivoFijo);					
		
		this.jButtonNuevoRelacionesFormatoActivoFijo.setVisible(this.isPermisoNuevoFormatoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarFormatoActivoFijo.setVisible(this.isPermisoActualizarFormatoActivoFijo);	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarFormatoActivoFijo.setVisible(this.isPermisoActualizarFormatoActivoFijo);	
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarFormatoActivoFijo.setVisible(this.isPermisoEliminarFormatoActivoFijo);
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarFormatoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarFormatoActivoFijo);						
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.setVisible(this.isPermisoGuardarCambiosFormatoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.setVisible(this.isPermisoActualizarFormatoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoActivoFijo() {
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarFormatoActivoFijo.setVisible(this.isPermisoActualizarFormatoActivoFijo);	
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarFormatoActivoFijo.setVisible(this.isPermisoActualizarFormatoActivoFijo);	
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarFormatoActivoFijo.setVisible(this.isPermisoEliminarFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarFormatoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarFormatoActivoFijo);							
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarFormatoActivoFijo && this.isPermisoGuardarCambiosFormatoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormatoActivoFijo() {
		if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormatoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormatoActivoFijo() {
	}
	
	public void jTableDatosFormatoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormatoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormatoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.getformatoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatoactivofijo==null) {
						this.formatoactivofijo = new FormatoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
				}

				if(this.formatoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formatoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormatoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormatoActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.getformatoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formatoactivofijoLogic.getConnexion());

				if(this.formatoactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formatoactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoActivoFijo=(TitledBorder)this.jScrollPanelDatosFormatoActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormatoActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormatoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.getformatoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatoactivofijo==null) {
						this.formatoactivofijo = new FormatoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
				}

				if(this.formatoactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formatoactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoFormatoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebFormatoActivoFijo(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.getformatoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.formatoactivofijoLogic.getConnexion());

				if(this.formatoactivofijo.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.formatoactivofijo.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoActivoFijo=(TitledBorder)this.jScrollPanelDatosFormatoActivoFijo.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderFormatoActivoFijo.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoFormatoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.getformatoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatoactivofijo==null) {
						this.formatoactivofijo = new FormatoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
				}

				if(this.formatoactivofijo.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.formatoactivofijo.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato2FormatoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato2=true;

			idTienePermisoformato2=this.tienePermisosUsuarioEnPaginaWebFormatoActivoFijo(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato2) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.getformatoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);

				this.formato2BeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formato2BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formato2BeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.formatoactivofijoLogic.getConnexion());

				if(this.formatoactivofijo.getid_formato2()!=null) {
					this.formato2BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formato2BeanSwingJInternalFrame.setIdActual(this.formatoactivofijo.getid_formato2());
					this.formato2BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formato2BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formato2BeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formato2BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoActivoFijo=(TitledBorder)this.jScrollPanelDatosFormatoActivoFijo.getBorder();
				TitledBorder titledBorderformato2=(TitledBorder)this.formato2BeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato2.setTitle(titledBorderFormatoActivoFijo.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato2FormatoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.getformatoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatoactivofijo==null) {
						this.formatoactivofijo = new FormatoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);
				}

				if(this.formatoactivofijo.getid_formato2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato2 = "+this.formatoactivofijo.getid_formato2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);

			this.getFormatoActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingFormatoActivoFijo(false);

			//if(FormatoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoFormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);

			this.getFormatoActivoFijosFK_IdFormato();

			this.inicializarActualizarBindingFormatoActivoFijo(false);

			//if(FormatoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormato2FormatoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);

			this.getFormatoActivoFijosFK_IdFormato2();

			this.inicializarActualizarBindingFormatoActivoFijo(false);

			//if(FormatoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormatoActivoFijo() {
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormatoActivoFijo.dispose();
			this.jInternalFrameDetalleFormFormatoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoFormatoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormatoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoFormatoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionFormatoActivoFijo!=null) {
			this.jInternalFrameImportacionFormatoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionFormatoActivoFijo.dispose();
			this.jInternalFrameImportacionFormatoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormatoActivoFijo();
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormatoActivoFijo")) {
				jButtonDuplicarFormatoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormatoActivoFijo")) {
				jButtonCopiarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormatoActivoFijo")) {
				jButtonVerFormFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormatoActivoFijo")) {
				jButtonDuplicarFormatoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormatoActivoFijo")) {
				jButtonDuplicarFormatoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormatoActivoFijo")) {
				jButtonModificarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormatoActivoFijo")) {
				jButtonModificarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormatoActivoFijo")) {
				jButtonModificarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormatoActivoFijo")) {
				jButtonActualizarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormatoActivoFijo")) {
				jButtonActualizarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormatoActivoFijo")) {
				jButtonActualizarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormatoActivoFijo")) {
				jButtonEliminarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormatoActivoFijo")) {
				jButtonEliminarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormatoActivoFijo")) {
				jButtonEliminarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormatoActivoFijo")) {
				jButtonCancelarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormatoActivoFijo")) {
				jButtonCancelarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormatoActivoFijo")) {
				jButtonCancelarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormatoActivoFijo")) {
				jButtonCerrarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormatoActivoFijo")) {
				jButtonCerrarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormatoActivoFijo")) {
				jButtonCerrarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormatoActivoFijo")) {
				jButtonMostrarOcultarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormatoActivoFijo")) {
				jButtonCancelarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormatoActivoFijo")) {
				jButtonCopiarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormatoActivoFijo")) {
				jButtonVerFormFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormatoActivoFijo")) {
				jButtonCopiarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormatoActivoFijo")) {
				jButtonVerFormFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormatoActivoFijo")) {
				jButtonRecargarInformacionFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormatoActivoFijo")) {
				jButtonRecargarInformacionFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormatoActivoFijo")) {
				jButtonRecargarInformacionFormatoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormatoActivoFijo")) {
				jButtonAnterioresFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormatoActivoFijo")) {
				jButtonAnterioresFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormatoActivoFijo")) {
				jButtonAnterioresFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormatoActivoFijo")) {
				jButtonSiguientesFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormatoActivoFijo")) {
				jButtonSiguientesFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormatoActivoFijo")) {
				jButtonSiguientesFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormatoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByFormatoActivoFijo")) {
				jButtonAbrirOrderByFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormatoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarFormatoActivoFijo")) {
				jButtonMostrarOcultarFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoActivoFijo")) {
				jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormatoActivoFijo")) {
				jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormatoActivoFijo")) {
				jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormatoActivoFijo")) {
				jButtonCerrarReporteDinamicoFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormatoActivoFijo")) {
				jButtonGenerarReporteDinamicoFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormatoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormatoActivoFijo")) {
				jButtonCerrarImportacionFormatoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormatoActivoFijo")) {
				
				jButtonGenerarImportacionFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormatoActivoFijo")) {
				
				jButtonAbrirImportacionFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormatoActivoFijo")) {
				jComboBoxTiposAccionesFormatoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormatoActivoFijo")) {
				jComboBoxTiposRelacionesFormatoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormatoActivoFijo")) {
				jComboBoxTiposAccionesFormatoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormatoActivoFijo")) {
				
				jComboBoxTiposSeleccionarFormatoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormatoActivoFijo")) {
				jTextFieldValorCampoGeneralFormatoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormatoActivoFijo")) {
				jButtonAbrirOrderByFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormatoActivoFijo")) {
				jButtonAbrirOrderByFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormatoActivoFijo")) {
				jButtonCerrarOrderByFormatoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoActivoFijoBusqueda")) {
				this.jButtonidFormatoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoActivoFijoUpdate")) {
				this.jButtonid_empresaFormatoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoActivoFijoBusqueda")) {
				this.jButtonid_empresaFormatoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoFormatoActivoFijoUpdate")) {
				this.jButtonid_formatoFormatoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoFormatoActivoFijoBusqueda")) {
				this.jButtonid_formatoFormatoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato2FormatoActivoFijoUpdate")) {
				this.jButtonid_formato2FormatoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato2FormatoActivoFijoBusqueda")) {
				this.jButtonid_formato2FormatoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormatoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormatoActivoFijo formatoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				formatoactivofijoLocal=this.formatoactivofijo;
			} else {
				formatoactivofijoLocal=this.formatoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
							
				
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
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
			
			


			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
								
						
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
								
				
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
							
				
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
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
			
			


			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
								
				
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormatoActivoFijo")) {
					jCheckBoxSeleccionarTodosFormatoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormatoActivoFijo")) {
					jCheckBoxSeleccionadosFormatoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormatoActivoFijo")) {
					
				}
				
				


				
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
												
				
				


				
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
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
			
			


			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatoactivofijo);
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
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
				
				


				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoactivofijoAnterior =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormatoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormatoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormatoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formatoactivofijo =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formatoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormatoActivoFijo")) {
				
				}
				
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormatoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormatoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormatoActivoFijo")) {
			
			}
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormatoActivoFijo();
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormatoActivoFijo")) {
				jButtonDuplicarFormatoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormatoActivoFijo")) {
				jButtonCopiarFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormatoActivoFijo")) {
				jButtonVerFormFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormatoActivoFijo")) {
				jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormatoActivoFijo")) {
				jButtonModificarFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormatoActivoFijo")) {
				jButtonActualizarFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormatoActivoFijo")) {
				jButtonEliminarFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormatoActivoFijo")) {
				jButtonCancelarFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormatoActivoFijo")) {
				jButtonCerrarFormatoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormatoActivoFijo")) {
				jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoActivoFijo")) {
				jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormatoActivoFijo")) {
				jButtonAbrirOrderByFormatoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormatoActivoFijo")) {
				jButtonRecargarInformacionFormatoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormatoActivoFijo")) {
				jButtonAnterioresFormatoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormatoActivoFijo")) {
				jButtonSiguientesFormatoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoActivoFijoBusqueda")) {
				this.jButtonidFormatoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoActivoFijoUpdate")) {
				this.jButtonid_empresaFormatoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoActivoFijoBusqueda")) {
				this.jButtonid_empresaFormatoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoFormatoActivoFijoUpdate")) {
				this.jButtonid_formatoFormatoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoFormatoActivoFijoBusqueda")) {
				this.jButtonid_formatoFormatoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato2FormatoActivoFijoUpdate")) {
				this.jButtonid_formato2FormatoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato2FormatoActivoFijoBusqueda")) {
				this.jButtonid_formato2FormatoActivoFijoBusquedaActionPerformed(evt);
			}
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormatoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormatoActivoFijo")) {
				closingInternalFrameFormatoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarFormatoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormFormatoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            FormatoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(FormatoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormatoActivoFijoActionPerformed(null);
			}
			
			FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatoactivofijo,new Object(),this.formatoactivofijoParameterGeneral,this.formatoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormatoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormatoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormatoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formatoactivofijo)) {
			if(!esControlTabla) {
				if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);			
				}
				
				if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormatoActivoFijo(this.formatoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatoactivofijoReturnGeneral=formatoactivofijoLogic.procesarEventosFormatoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatoactivofijoLogic.getFormatoActivoFijos(),this.formatoactivofijo,this.formatoactivofijoParameterGeneral,this.isEsNuevoFormatoActivoFijo,classes);//this.formatoactivofijoLogic.getFormatoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormatoActivoFijo(this.formatoactivofijoReturnGeneral,this.formatoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormatoActivoFijo(classes,this.formatoactivofijoReturnGeneral,this.formatoactivofijoBean,false);
					}
						
					if(this.formatoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormatoActivoFijo(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormatoActivoFijo(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo());	
					}
						
					if(this.formatoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormatoActivoFijo(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo(),classes);//this.formatoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormatoActivoFijo(this.formatoactivofijo,classes);//this.formatoactivofijoBean);									
				}
			
				if(FormatoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormatoActivoFijo(this.formatoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoActivoFijo(this.formatoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formatoactivofijoAnterior!=null) {
						this.formatoactivofijo=this.formatoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatoactivofijoReturnGeneral=formatoactivofijoLogic.procesarEventosFormatoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatoactivofijoLogic.getFormatoActivoFijos(),this.formatoactivofijo,this.formatoactivofijoParameterGeneral,this.isEsNuevoFormatoActivoFijo,classes);//this.formatoactivofijoLogic.getFormatoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo(),formatoactivofijoLogic.getFormatoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo(),this.formatoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormatoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormatoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormatoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormatoActivoFijo() throws Exception {
		
		FormatoActivoFijoModel formatoactivofijoModel=(FormatoActivoFijoModel)this.jTableDatosFormatoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatoactivofijoModel.formatoactivofijos=this.formatoactivofijoLogic.getFormatoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formatoactivofijoModel.formatoactivofijos=this.formatoactivofijos;
		}
		
		
		((FormatoActivoFijoModel) this.jTableDatosFormatoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormatoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformatoactivofijoAnterior(),this.formatoactivofijoLogic.getFormatoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformatoactivofijoAnterior(),this.formatoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormatoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatoactivofijo,new Object(),generalEntityParameterGeneral,this.formatoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormatoActivoFijoConstantesFunciones.getClassesRelationshipsOfFormatoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormatoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfFormatoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormatoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormatoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatoactivofijo,new Object(),generalEntityParameterGeneral,this.formatoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormatoActivoFijo(FormatoActivoFijoBean formatoactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormatoActivoFijo(ArrayList<Classe> classes,FormatoActivoFijoReturnGeneral formatoactivofijoReturnGeneral,FormatoActivoFijoBean formatoactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.formatoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormatoActivoFijo = new FormatoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.formatoactivofijoSessionBean.getConGuardarRelaciones(),this.formatoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormFormatoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.formatoactivofijoLogic=this.formatoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyFormatoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormatoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormatoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoActivoFijo"));
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarFormatoActivoFijo"));

		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarToolBarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoActivoFijo"));
					
		this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemModificarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarFormatoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarToolBarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoActivoFijo"));
						
		this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemActualizarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarFormatoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoActivoFijo"));
								
		this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemEliminarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarFormatoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoActivoFijo"));
					
		this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemCancelarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemDetalleCerrarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonidFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_empresaFormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_empresaFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formatoFormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoFormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formatoFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formato2FormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_formato2FormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formato2FormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato2FormatoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormatoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoActivoFijo"));
		}
		
		this.jTableDatosFormatoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormatoActivoFijo"));
		
		this.jTableDatosFormatoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormatoActivoFijo"));
		
		this.jButtonNuevoFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoFormatoActivoFijo"));
		
		this.jButtonDuplicarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarFormatoActivoFijo"));
		
		this.jButtonCopiarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarFormatoActivoFijo"));
		
		this.jButtonVerFormFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormFormatoActivoFijo"));
		
		
		this.jButtonNuevoToolBarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormatoActivoFijo"));
			
		this.jButtonDuplicarToolBarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormatoActivoFijo"));
			
		this.jMenuItemNuevoFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormatoActivoFijo"));
			
		this.jMenuItemDuplicarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormatoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormatoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormatoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormatoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarFormatoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonModificarToolBarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoActivoFijo"));
			
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemModificarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarFormatoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonActualizarToolBarFormatoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoActivoFijo"));
				
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemActualizarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarFormatoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonEliminarToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoActivoFijo"));
						
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemEliminarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarFormatoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonCancelarToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoActivoFijo"));
			
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemCancelarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormatoActivoFijo"));		
		
		
		this.jButtonCerrarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarFormatoActivoFijo"));
		
		
		this.jButtonCerrarToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormatoActivoFijo"));
			
		this.jMenuItemCerrarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormatoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jMenuItemDetalleCerrarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormatoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormatoActivoFijo"));
			
		this.jButtonVerFormToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormatoActivoFijo"));
		
		this.jMenuItemGuardarCambiosFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormatoActivoFijo"));
			
		this.jMenuItemCopiarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormatoActivoFijo"));		
		
		this.jMenuItemVerFormFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormatoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormatoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormatoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormatoActivoFijo"));
		
		this.jMenuItemRecargarInformacionFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormatoActivoFijo"));		
		
		
		
		this.jButtonAnterioresFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresFormatoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormatoActivoFijo"));
		
		this.jMenuItemAnterioresFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormatoActivoFijo"));		
		
		
		this.jButtonSiguientesFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesFormatoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormatoActivoFijo"));
			
		this.jMenuItemSiguientesFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormatoActivoFijo"));
			
		this.jMenuItemAbrirOrderByFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormatoActivoFijo"));
			
		this.jMenuItemMostrarOcultarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormatoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormatoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormatoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormatoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormatoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormatoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormatoActivoFijo"));

		this.jCheckBoxSeleccionadosFormatoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormatoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormatoActivoFijo"));
			
		this.jComboBoxTiposAccionesFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormatoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormatoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormatoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonidFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_empresaFormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_empresaFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formatoFormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoFormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formatoFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formato2FormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_formato2FormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formato2FormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato2FormatoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormatoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoActivoFijo"));
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoActivoFijo"));
				this.jInternalFrameReporteDinamicoFormatoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormatoActivoFijo!=null) {
				this.jInternalFrameImportacionFormatoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoActivoFijo"));
				this.jInternalFrameImportacionFormatoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoActivoFijo"));
				this.jInternalFrameImportacionFormatoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormatoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarFormatoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormatoActivoFijo"));			
			
			if(this.jInternalFrameOrderByFormatoActivoFijo!=null) {
				this.jInternalFrameOrderByFormatoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoActivoFijo.jTabbedPaneRelacionesFormatoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoActivoFijo"));
		
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
            		closingInternalFrameFormatoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormatoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            FormatoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(FormatoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormatoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormatoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormatoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormatoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormatoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormatoActivoFijo";
		inputMap = this.jButtonNuevoFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormatoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormatoActivoFijo";
		inputMap = this.jButtonModificarFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormatoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormatoActivoFijo";
		inputMap = this.jButtonActualizarFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormatoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormatoActivoFijo";
		inputMap = this.jButtonEliminarFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormatoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormatoActivoFijo";
		inputMap = this.jButtonCancelarFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormatoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormatoActivoFijo";
		inputMap = this.jButtonCerrarFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormatoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormatoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonGuardarCambiosFormatoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormatoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormatoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormatoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormatoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormatoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormatoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormatoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormatoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonidFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_empresaFormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_empresaFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formatoFormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoFormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formatoFormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoFormatoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formato2FormatoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_formato2FormatoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoActivoFijo.jButtonid_formato2FormatoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato2FormatoActivoFijoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormatoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormatoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormatoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormatoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormatoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
					formatoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijos) {
					formatoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormatoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
						formatoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijos) {
						formatoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormatoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormatoActivoFijo.getSelectedRows();
			
			FormatoActivoFijo formatoactivofijoLocal=new FormatoActivoFijo();
			
			//this.seleccionarTodosFormatoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoactivofijoLocal =(FormatoActivoFijo) this.formatoactivofijoLogic.getFormatoActivoFijos().toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formatoactivofijoLocal =(FormatoActivoFijo) this.formatoactivofijos.toArray()[this.jTableDatosFormatoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formatoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
						formatoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijos) {
						formatoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormatoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormatoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormatoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormatoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijoLogic.getFormatoActivoFijos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormatoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormatoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormatoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormatoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessFormatoActivoFijo(conSplash);
				
					this.generarReporteFormatoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormatoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoActivoFijo();
				
				this.exportarFormatoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormatoActivoFijos();
				//this.importarFormatoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormatoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formatos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormatoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormatoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormatoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(FormatoActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormatoActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormatoActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralFormatoActivoFijo();
						
						this.generarReporteProcesoAccionFormatoActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormatoActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO FormatosS SELECCIONADOS?", "MANTENIMIENTO DE Formatos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormatoActivoFijo();
				
						this.actualizarParametrosGeneralFormatoActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formatoactivofijoReturnGeneral=formatoactivofijoLogic.procesarAccionFormatoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formatoactivofijoLogic.getFormatoActivoFijos(),this.formatoactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormatoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormatoActivoFijo();
					
					FormatoActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormatoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormatoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormatoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormatoActivoFijo();
			
			if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
			FormatoActivoFijo formatoactivofijo=new FormatoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormatoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormatoActivoFijo.getSelectedItem();
			
			
			
			
			formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(formatoactivofijosSeleccionados.size()==1) {
				for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijosSeleccionados) {
					formatoactivofijo=formatoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormatoActivoFijo();
			
      		//this.finishProcessFormatoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormatoActivoFijoReturnGeneral() throws Exception {
		if(this.formatoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formatoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formatoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formatoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formatoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formatoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormatoActivoFijo(false);
		}
		
		if(this.formatoactivofijoReturnGeneral.getConRetornoLista() || this.formatoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.formatoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatoactivofijoLogic.setFormatoActivoFijos(this.formatoactivofijoReturnGeneral.getFormatoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formatoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatoactivofijoLogic.setFormatoActivoFijo(this.formatoactivofijoReturnGeneral.getFormatoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormatoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralFormatoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<FormatoActivoFijo> getFormatoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormatoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijoLogic.getFormatoActivoFijos()) {
					if(formatoactivofijoAux.getIsSelected()) {
						formatoactivofijosSeleccionados.add(formatoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoActivoFijo formatoactivofijoAux:this.formatoactivofijos) {
					if(formatoactivofijoAux.getIsSelected()) {
						formatoactivofijosSeleccionados.add(formatoactivofijoAux);				
					}
				}
			}
			
			if(formatoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formatoactivofijosSeleccionados.addAll(this.formatoactivofijoLogic.getFormatoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formatoactivofijosSeleccionados.addAll(this.formatoactivofijos);				
					}
				}
			}
		} else {
			formatoactivofijosSeleccionados.add(this.formatoactivofijo);
		}
		
		return formatoactivofijosSeleccionados;
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
	
	public void generarReporteFormatoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormatoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormatoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formatos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormatoActivoFijosSeleccionados() throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormatoActivoFijos("Todos",formatoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalFormatoActivoFijosSeleccionados() throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormatoActivoFijos("Todos",formatoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormatoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormatoActivoFijos("Todos",formatoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormatoActivoFijosSeleccionados() throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormatoActivoFijo();
		
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormatoActivoFijo();
		
		
		//this.generarReporteFormatoActivoFijos("Todos",formatoactivofijosSeleccionados ,formatoactivofijoImplementable,formatoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionFormatoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormatoActivoFijo();
		
		this.abrirFrameImportacionFormatoActivoFijo();		
		
			
		//this.generarReporteFormatoActivoFijos("Todos",formatoactivofijosSeleccionados ,formatoactivofijoImplementable,formatoactivofijoImplementableHome);
	}
	
	public void importarFormatoActivoFijos() throws Exception {		
	
	}
	
	public void exportarFormatoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormatoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormatoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormatoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formatos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormatoActivoFijosSeleccionados() throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormatoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormatoActivoFijo(formatoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formatoactivofijoAux.setsDetalleGeneralEntityReporte(formatoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormatoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormatoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formatoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formatoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatoactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatoactivofijo.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatoactivofijo.getformato2_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormatoActivoFijosSeleccionados() throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormatoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormatoActivoFijo(row);				
				iRow++;
			}				
			
			for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormatoActivoFijo(formatoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormatoActivoFijosSeleccionados() throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();		
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formatoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formatoactivofijo");
			//elementRoot.appendChild(element);
		
			for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijosSeleccionados) {
				element = document.createElement("formatoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormatoActivoFijo(formatoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formatos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormatoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formatoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formatoactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatoactivofijo.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatoactivofijo.getformato2_descripcion());				
	}
	
	public void setFilaDatosExportarXmlFormatoActivoFijo(FormatoActivoFijo formatoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormatoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formatoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormatoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formatoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormatoActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formatoactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementformato_descripcion = document.createElement(FormatoActivoFijoConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(formatoactivofijo.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementformato2_descripcion = document.createElement(FormatoActivoFijoConstantesFunciones.IDFORMATO2);
		elementformato2_descripcion.appendChild(document.createTextNode(formatoactivofijo.getformato2_descripcion()));
		element.appendChild(elementformato2_descripcion);
	}
	
	public void generarReporteGroupGenericoFormatoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados=new ArrayList<FormatoActivoFijo>();
		
		formatoactivofijosSeleccionados=this.getFormatoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormatoActivoFijo(formatoactivofijosSeleccionados);
		
		this.generarReporteFormatoActivoFijos("Todos",formatoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormatoActivoFijo(ArrayList<FormatoActivoFijo> formatoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormatoActivoFijo formatoactivofijoAux:formatoactivofijosSeleccionados) {
				formatoactivofijoAux.setsDetalleGeneralEntityReporte(formatoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formatoactivofijoAux.setsDescripcionGeneralEntityReporte1(formatoactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					formatoactivofijoAux.setsDescripcionGeneralEntityReporte1(formatoactivofijoAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2)) {
					existe=true;
					formatoactivofijoAux.setsDescripcionGeneralEntityReporte1(formatoactivofijoAux.getformato2_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormatoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormatoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarFormatoActivoFijo=false;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=false;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;
			this.isVisibilidadCeldaModificarFormatoActivoFijo=false;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=true;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;
			this.isVisibilidadCeldaModificarFormatoActivoFijo=false;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=true;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=true;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;
			this.isVisibilidadCeldaModificarFormatoActivoFijo=false;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=true;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=true;
			this.isVisibilidadCeldaModificarFormatoActivoFijo=false;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=false;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=false;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;
			this.isVisibilidadCeldaModificarFormatoActivoFijo=true;
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=false;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
			this.isVisibilidadCeldaCancelarFormatoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsFormatoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormatoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormFormatoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarFormatoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formatoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoFormatoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!formatoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;												
			}
			
			this.jButtonCerrarFormatoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.formatoactivofijo)) {
			this.isVisibilidadCeldaActualizarFormatoActivoFijo=false;
			this.isVisibilidadCeldaEliminarFormatoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoActivoFijo() {
	}
	
	public void actualizarEstadoPanelsFormatoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormatoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionFormatoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoActivoFijo!=null) {
				this.jScrollPanelDatosFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoActivoFijo!=null) {
				this.jPanelPaginacionFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormatoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionFormatoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormatoActivoFijo!=null) {
				this.jScrollPanelDatosFormatoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoActivoFijo!=null) {
				this.jPanelPaginacionFormatoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormatoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionFormatoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoActivoFijo!=null) {
				this.jScrollPanelDatosFormatoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoActivoFijo!=null) {
				this.jPanelPaginacionFormatoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormatoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionFormatoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoActivoFijo!=null) {
				this.jScrollPanelDatosFormatoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoActivoFijo!=null) {
				this.jPanelPaginacionFormatoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormatoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionFormatoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoActivoFijo!=null) {
				this.jScrollPanelDatosFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoActivoFijo!=null) {
				this.jPanelPaginacionFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormatoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionFormatoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoActivoFijo!=null) {
				this.jScrollPanelDatosFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoActivoFijo!=null) {
				this.jPanelPaginacionFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormatoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionFormatoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoActivoFijo!=null) {
				this.jScrollPanelDatosFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoActivoFijo!=null) {
				this.jPanelPaginacionFormatoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
					this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoActivoFijo!=null) {
				this.jTabbedPaneBusquedasFormatoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormatoActivoFijo!=null) {
				this.jPanelParametrosReportesFormatoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;
		}
		
	}

	public void setVisibilidadBusquedasParaFormato2(Boolean isParaFormato2){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormato2Negation=!isParaFormato2;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormatoActivoFijoSessionBean formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
		
		if(this.formatoactivofijoSessionBean==null) {
			this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
		}
		
		this.formatoactivofijoSessionBean.setsUltimaBusquedaFormatoActivoFijo(this.getsAccionBusqueda());
		this.formatoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formatoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formatoactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormatoActivoFijoSessionBean formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
		
		if(this.formatoactivofijoSessionBean==null) {
			this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
		}
		
		if(this.formatoactivofijoSessionBean.getsUltimaBusquedaFormatoActivoFijo()!=null&&!this.formatoactivofijoSessionBean.getsUltimaBusquedaFormatoActivoFijo().equals("")) {
			this.setsAccionBusqueda(formatoactivofijoSessionBean.getsUltimaBusquedaFormatoActivoFijo());
			this.setiNumeroPaginacion(formatoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formatoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formatoactivofijoSessionBean.getid_empresa());
				formatoactivofijoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.formatoactivofijoSessionBean.setsUltimaBusquedaFormatoActivoFijo("");
		this.formatoactivofijoSessionBean.setiNumeroPaginacion(FormatoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.formatoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormatoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormatoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioFormatoActivoFijo();
		this.updateVisibilidadBusquedasFormularioFormatoActivoFijo();
		this.updateHabilitarBusquedasFormularioFormatoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormatoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormatoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormatoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormatoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormatoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormatoActivoFijo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormatoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarFormatoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormatoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormatoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioFormatoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioFormatoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormatoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formatoactivofijoConstantesFunciones.resaltaridFormatoActivoFijo!=null && this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.setBorder(this.formatoactivofijoConstantesFunciones.resaltaridFormatoActivoFijo);}
		if(this.formatoactivofijoConstantesFunciones.resaltarid_empresaFormatoActivoFijo!=null && this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setBorder(this.formatoactivofijoConstantesFunciones.resaltarid_empresaFormatoActivoFijo);}
		if(this.formatoactivofijoConstantesFunciones.resaltarid_formatoFormatoActivoFijo!=null && this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setBorder(this.formatoactivofijoConstantesFunciones.resaltarid_formatoFormatoActivoFijo);}
		if(this.formatoactivofijoConstantesFunciones.resaltarid_formato2FormatoActivoFijo!=null && this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setBorder(this.formatoactivofijoConstantesFunciones.resaltarid_formato2FormatoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormatoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostraridFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelidFormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostraridFormatoActivoFijo);
		//this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostrarid_empresaFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelid_empresaFormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostrarid_empresaFormatoActivoFijo);
		//this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostrarid_formatoFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelid_formatoFormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostrarid_formatoFormatoActivoFijo);
		//this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostrarid_formato2FormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jPanelid_formato2FormatoActivoFijo.setVisible(this.formatoactivofijoConstantesFunciones.mostrarid_formato2FormatoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormatoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormFormatoActivoFijo.jLabelidFormatoActivoFijo.setEnabled(this.formatoactivofijoConstantesFunciones.activaridFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_empresaFormatoActivoFijo.setEnabled(this.formatoactivofijoConstantesFunciones.activarid_empresaFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formatoFormatoActivoFijo.setEnabled(this.formatoactivofijoConstantesFunciones.activarid_formatoFormatoActivoFijo);
		this.jInternalFrameDetalleFormFormatoActivoFijo.jComboBoxid_formato2FormatoActivoFijo.setEnabled(this.formatoactivofijoConstantesFunciones.activarid_formato2FormatoActivoFijo);
		}
	}
	
		
}
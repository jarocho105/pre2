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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.ParroquiaConstantesFunciones;
import com.bydan.erp.seguridad.util.ParroquiaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ParroquiaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ParroquiaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParroquiaBeanSwingJInternalFrame extends ParroquiaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParroquiaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Parroquia> parroquiaValidator = new ClassValidator<Parroquia>(Parroquia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Parroquia parroquia;	
	public Parroquia parroquiaAux;
	public Parroquia parroquiaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Parroquia parroquiaTotales;
	public Long idParroquiaActual;
	public Long iIdNuevoParroquia=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCanton="";

	public List<Canton> cantonsForeignKey;

	public List<Canton> getcantonsForeignKey() {
		return cantonsForeignKey;
	}

	public void setcantonsForeignKey(List<Canton> cantonsForeignKey) {
		this.cantonsForeignKey = cantonsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Canton cantonForeignKey;

	public Canton getcantonForeignKey() {
		return cantonForeignKey;
	}

	public void setcantonForeignKey(Canton cantonForeignKey) {
		this.cantonForeignKey = cantonForeignKey;
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
	
	public Boolean isPermisoTodoParroquia;
	public Boolean isPermisoNuevoParroquia;
	public Boolean isPermisoActualizarParroquia;
	public Boolean isPermisoActualizarOriginalParroquia;
	public Boolean isPermisoEliminarParroquia;
	public Boolean isPermisoGuardarCambiosParroquia;
	public Boolean isPermisoConsultaParroquia;
	public Boolean isPermisoBusquedaParroquia;
	public Boolean isPermisoReporteParroquia;
	public Boolean isPermisoPaginacionMedioParroquia;
	public Boolean isPermisoPaginacionAltoParroquia;
	public Boolean isPermisoPaginacionTodoParroquia;
	public Boolean isPermisoCopiarParroquia;
	public Boolean isPermisoVerFormParroquia;
	public Boolean isPermisoDuplicarParroquia;
	public Boolean isPermisoOrdenParroquia;
	
	
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
	
	public ParroquiaParameterReturnGeneral parroquiaReturnGeneral;
	public ParroquiaParameterReturnGeneral parroquiaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParroquia=false;
	public Boolean esParaAccionDesdeFormularioParroquia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParroquiaSessionBeanAdditional parroquiaSessionBeanAdditional=null;
	
	public ParroquiaSessionBeanAdditional getParroquiaSessionBeanAdditional() {
		return this.parroquiaSessionBeanAdditional;
	}
	
	public void setParroquiaSessionBeanAdditional(ParroquiaSessionBeanAdditional parroquiaSessionBeanAdditional) {
		try {
			this.parroquiaSessionBeanAdditional=parroquiaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParroquiaBeanSwingJInternalFrameAdditional parroquiaBeanSwingJInternalFrameAdditional=null;
	//public class ParroquiaBeanSwingJInternalFrame
	
	public ParroquiaBeanSwingJInternalFrameAdditional getParroquiaBeanSwingJInternalFrameAdditional() {
		return this.parroquiaBeanSwingJInternalFrameAdditional;
	}
	
	public void setParroquiaBeanSwingJInternalFrameAdditional(ParroquiaBeanSwingJInternalFrameAdditional parroquiaBeanSwingJInternalFrameAdditional) {
		try {
			this.parroquiaBeanSwingJInternalFrameAdditional=parroquiaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParroquiaLogic parroquiaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Parroquia parroquiaBean;
	public ParroquiaConstantesFunciones parroquiaConstantesFunciones;
	//public ParroquiaParameterReturnGeneral parroquiaReturnGeneral;
	
	//FK
	
	public CantonLogic cantonLogic;
	
	//PARAMETROS
	
	
	//public List<Parroquia> parroquias;	
	//public List<Parroquia> parroquiasEliminados;
	//public List<Parroquia> parroquiasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParroquia=false;
	public Boolean isVisibilidadCeldaDuplicarParroquia=true;
	public Boolean isVisibilidadCeldaCopiarParroquia=true;
	public Boolean isVisibilidadCeldaVerFormParroquia=true;
	public Boolean isVisibilidadCeldaOrdenParroquia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParroquia=false;
	public Boolean isVisibilidadCeldaModificarParroquia=false;
	public Boolean isVisibilidadCeldaActualizarParroquia=false;
	public Boolean isVisibilidadCeldaEliminarParroquia=false;
	public Boolean isVisibilidadCeldaCancelarParroquia=false;
	public Boolean isVisibilidadCeldaGuardarParroquia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParroquia=false;	
	
	
	public Boolean isVisibilidadFK_IdCanton=false;
	
	public Long getiIdNuevoParroquia() {
		return this.iIdNuevoParroquia;
	}

	public void setiIdNuevoParroquia(Long iIdNuevoParroquia) {
		this.iIdNuevoParroquia = iIdNuevoParroquia;
	}
	
	public Long getidParroquiaActual() {
		return this.idParroquiaActual;
	}

	public void setidParroquiaActual(Long idParroquiaActual) {
		this.idParroquiaActual = idParroquiaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Parroquia getparroquia() {
		return this.parroquia;
	}

	public void setparroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}
	
	public Parroquia getparroquiaAux() {
		return this.parroquiaAux;
	}

	public void setparroquiaAux(Parroquia parroquiaAux) {
		this.parroquiaAux = parroquiaAux;
	}				
	
	public Parroquia getparroquiaAnterior() {
		return this.parroquiaAnterior;
	}

	public void setparroquiaAnterior(Parroquia parroquiaAnterior) {
		this.parroquiaAnterior = parroquiaAnterior;
	}	
	
	public Parroquia getparroquiaTotales() {
		return this.parroquiaTotales;
	}

	public void setparroquiaTotales(Parroquia parroquiaTotales) {
		this.parroquiaTotales = parroquiaTotales;
	}	
	
	public Parroquia getparroquiaBean() {
		return this.parroquiaBean;
	}

	public void setparroquiaBean(Parroquia parroquiaBean) {
		this.parroquiaBean = parroquiaBean;
	}	
	
	public ParroquiaParameterReturnGeneral getparroquiaReturnGeneral() {
		return this.parroquiaReturnGeneral;
	}

	public void setparroquiaReturnGeneral(ParroquiaParameterReturnGeneral parroquiaReturnGeneral) {
		this.parroquiaReturnGeneral = parroquiaReturnGeneral;
	}	
	
	
	public Long id_cantonFK_IdCanton=-1L;

	public Long getid_cantonFK_IdCanton() {
		return this.id_cantonFK_IdCanton;
	}

	public void setid_cantonFK_IdCanton(Long id_cantonFK_IdCanton) {
		this.id_cantonFK_IdCanton = id_cantonFK_IdCanton;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParroquiaLogic getParroquiaLogic()	{		
		return parroquiaLogic;
	}

	public void setParroquiaLogic(ParroquiaLogic parroquiaLogic) {
		this.parroquiaLogic = parroquiaLogic;
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
	
	public Boolean getIsEsNuevoParroquia() {
		return isEsNuevoParroquia;
	}

	public void setIsEsNuevoParroquia(Boolean isEsNuevoParroquia) {
		this.isEsNuevoParroquia = isEsNuevoParroquia;
	}

	public Boolean getEsParaAccionDesdeFormularioParroquia() {
		return esParaAccionDesdeFormularioParroquia;
	}
	
	public void setEsParaAccionDesdeFormularioParroquia(Boolean esParaAccionDesdeFormularioParroquia) {
		this.esParaAccionDesdeFormularioParroquia = esParaAccionDesdeFormularioParroquia;
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
	
	
	public void cargarCombosCantonsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cantonsForeignKey=new ArrayList<Canton>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CantonLogic cantonLogic=new CantonLogic();

			cantonLogic.getCantonDataAccess().setIsForForeingKeyData(true);

			if(this.parroquiaSessionBean==null) {
				this.parroquiaSessionBean=new ParroquiaSessionBean();
			}

			if(!this.parroquiaSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLogic.getCantonDataAccess().setIsForForeingKeyData(true);

					cantonLogic.getTodosCantonsWithConnection(sFinalQuery,new Pagination());

					this.cantonsForeignKey=cantonLogic.getCantons();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCanton(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLogic.getEntityWithConnection(parroquiaSessionBean.getlidCantonActual());
					this.cantonsForeignKey.add(cantonLogic.getCanton());
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

	
	
	public void setActualCantonForeignKey(Long idCantonSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cantonTemp!=null) {

					if(this.parroquia!=null) {
						this.parroquia.setCanton(cantonTemp);
					}

					if(this.jInternalFrameDetalleFormParroquia!=null) {
						this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setSelectedItem(cantonTemp);
					}
				} else {
					//jComboBoxid_cantonParroquia.setSelectedItem(cantonTemp);
					if(this.jInternalFrameDetalleFormParroquia!=null) {
						if(this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.getItemCount()>0) {
							this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCanton") || sFormularioTipoBusqueda.equals("Todos")){
					if(cantonTemp!=null && jComboBoxid_cantonFK_IdCantonParroquia!=null) {
						jComboBoxid_cantonFK_IdCantonParroquia.setSelectedItem(cantonTemp);
					} else {
						if(jComboBoxid_cantonFK_IdCantonParroquia!=null) {
							//jComboBoxid_cantonFK_IdCantonParroquia.setSelectedItem(cantonTemp);
							if(jComboBoxid_cantonFK_IdCantonParroquia.getItemCount()>0) {
								jComboBoxid_cantonFK_IdCantonParroquia.setSelectedIndex(0);
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

	public String getActualCantonForeignKeyDescripcion(Long idCantonSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}


			sDescripcion=CantonConstantesFunciones.getCantonDescripcion(cantonTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCantonForeignKeyGenerico(Long idCantonSeleccionado,JComboBox jComboBoxid_cantonParroquiaGenerico)throws Exception
	{
		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}

			if(cantonTemp!=null) {
				jComboBoxid_cantonParroquiaGenerico.setSelectedItem(cantonTemp);
			} else {
				if(jComboBoxid_cantonParroquiaGenerico!=null && jComboBoxid_cantonParroquiaGenerico.getItemCount()>0) {
					jComboBoxid_cantonParroquiaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCantonForeignKey(Parroquia parroquia,JComboBox jComboBoxid_cantonParroquiaGenerico)throws Exception
	{
		try
		{
			Canton  cantonAux=new Canton();

			if(jComboBoxid_cantonParroquiaGenerico==null) {
				cantonAux=(Canton)this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.getSelectedItem();
			} else {
				cantonAux=(Canton)jComboBoxid_cantonParroquiaGenerico.getSelectedItem();
			}

			if(cantonAux!=null && cantonAux.getId()!=null) {
				parroquia.setid_canton(cantonAux.getId());
				parroquia.setcanton_descripcion(ParroquiaConstantesFunciones.getCantonDescripcion(cantonAux));
				parroquia.setCanton(cantonAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCantonsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCanton=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParroquiaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParroquia!=null) { 
							this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.removeAllItems();

							for(Canton canton:this.cantonsForeignKey) {
								this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.addItem(canton);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParroquia!=null) { 
					}

					if(!ParroquiaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCanton") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParroquiaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cantonFK_IdCantonParroquia.removeAllItems();

							for(Canton canton:this.cantonsForeignKey) {
								this.jComboBoxid_cantonFK_IdCantonParroquia.addItem(canton);
							}
						}

						if(!ParroquiaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCantonForeignKey(Canton canton,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParroquia!=null) {
							this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setSelectedItem(canton);
						}
					} else {
						if(this.jInternalFrameDetalleFormParroquia!=null) {
							this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cantonFK_IdCantonParroquia.setSelectedItem(canton);
						} else {
							this.jComboBoxid_cantonFK_IdCantonParroquia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParroquia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParroquiaConstantesFunciones.refrescarForeignKeysDescripcionesParroquia(this.parroquiaLogic.getParroquias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParroquiaConstantesFunciones.refrescarForeignKeysDescripcionesParroquia(this.parroquias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Canton.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parroquiaLogic.setParroquias(this.parroquias);
			parroquiaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParroquiaParameterReturnGeneral getParroquiaParameterGeneral() {
		return this.parroquiaParameterGeneral;
	}
	
	public void setParroquiaParameterGeneral(ParroquiaParameterReturnGeneral parroquiaParameterGeneral) {
		this.parroquiaParameterGeneral = parroquiaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParroquia() {
		return isPermisoTodoParroquia;
	}

	public void setIsPermisoTodoParroquia(Boolean isPermisoTodoParroquia) {
		this.isPermisoTodoParroquia = isPermisoTodoParroquia;
	}

	public Boolean getIsPermisoNuevoParroquia() {
		return isPermisoNuevoParroquia;
	}

	public void setIsPermisoNuevoParroquia(Boolean isPermisoNuevoParroquia) {
		this.isPermisoNuevoParroquia = isPermisoNuevoParroquia;
	}

	public Boolean getIsPermisoActualizarParroquia() {
		return isPermisoActualizarParroquia;
	}

	public void setIsPermisoActualizarParroquia(Boolean isPermisoActualizarParroquia) {
		this.isPermisoActualizarParroquia = isPermisoActualizarParroquia;
	}

	public Boolean getIsPermisoEliminarParroquia() {
		return isPermisoEliminarParroquia;
	}

	public void setIsPermisoEliminarParroquia(Boolean isPermisoEliminarParroquia) {
		this.isPermisoEliminarParroquia = isPermisoEliminarParroquia;
	}

	public Boolean getIsPermisoGuardarCambiosParroquia() {
		return isPermisoGuardarCambiosParroquia;
	}

	public void setIsPermisoGuardarCambiosParroquia(Boolean isPermisoGuardarCambiosParroquia) {
		this.isPermisoGuardarCambiosParroquia = isPermisoGuardarCambiosParroquia;
	}
	
	public Boolean getIsPermisoConsultaParroquia() {
		return isPermisoConsultaParroquia;
	}

	public void setIsPermisoConsultaParroquia(Boolean isPermisoConsultaParroquia) {
		this.isPermisoConsultaParroquia = isPermisoConsultaParroquia;
	}

	public Boolean getIsPermisoBusquedaParroquia() {
		return isPermisoBusquedaParroquia;
	}

	public void setIsPermisoBusquedaParroquia(Boolean isPermisoBusquedaParroquia) {
		this.isPermisoBusquedaParroquia = isPermisoBusquedaParroquia;
	}

	public Boolean getIsPermisoReporteParroquia() {
		return isPermisoReporteParroquia;
	}

	public void setIsPermisoReporteParroquia(Boolean isPermisoReporteParroquia) {
		this.isPermisoReporteParroquia = isPermisoReporteParroquia;
	}
	
	public Boolean getIsPermisoPaginacionMedioParroquia() {
		return isPermisoPaginacionMedioParroquia;
	}

	public void setIsPermisoPaginacionMedioParroquia(Boolean isPermisoPaginacionMedioParroquia) {
		this.isPermisoPaginacionMedioParroquia = isPermisoPaginacionMedioParroquia;
	}
	
	public Boolean getIsPermisoPaginacionTodoParroquia() {
		return isPermisoPaginacionTodoParroquia;
	}

	public void setIsPermisoPaginacionTodoParroquia(Boolean isPermisoPaginacionTodoParroquia) {
		this.isPermisoPaginacionTodoParroquia = isPermisoPaginacionTodoParroquia;
	}
	
	public Boolean getIsPermisoPaginacionAltoParroquia() {
		return isPermisoPaginacionAltoParroquia;
	}

	public void setIsPermisoPaginacionAltoParroquia(Boolean isPermisoPaginacionAltoParroquia) {
		this.isPermisoPaginacionAltoParroquia = isPermisoPaginacionAltoParroquia;
	}
	
	public Boolean getIsPermisoCopiarParroquia() {
		return isPermisoCopiarParroquia;
	}

	public void setIsPermisoCopiarParroquia(Boolean isPermisoCopiarParroquia) {
		this.isPermisoCopiarParroquia = isPermisoCopiarParroquia;
	}
	
	public Boolean getIsPermisoVerFormParroquia() {
		return isPermisoVerFormParroquia;
	}

	public void setIsPermisoVerFormParroquia(Boolean isPermisoVerFormParroquia) {
		this.isPermisoVerFormParroquia = isPermisoVerFormParroquia;
	}
	
	public Boolean getIsPermisoDuplicarParroquia() {
		return isPermisoDuplicarParroquia;
	}

	public void setIsPermisoDuplicarParroquia(Boolean isPermisoDuplicarParroquia) {
		this.isPermisoDuplicarParroquia = isPermisoDuplicarParroquia;
	}
	
	public Boolean getIsPermisoOrdenParroquia() {
		return isPermisoOrdenParroquia;
	}

	public void setIsPermisoOrdenParroquia(Boolean isPermisoOrdenParroquia) {
		this.isPermisoOrdenParroquia = isPermisoOrdenParroquia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParroquia() {
		return isVisibilidadCeldaNuevoParroquia;
	}

	public void setIsVisibilidadCeldaNuevoParroquia(Boolean isVisibilidadCeldaNuevoParroquia) {
		this.isVisibilidadCeldaNuevoParroquia = isVisibilidadCeldaNuevoParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParroquia() {
		return isVisibilidadCeldaDuplicarParroquia;
	}

	public void setIsVisibilidadCeldaDuplicarParroquia(Boolean isVisibilidadCeldaDuplicarParroquia) {
		this.isVisibilidadCeldaDuplicarParroquia = isVisibilidadCeldaDuplicarParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParroquia() {
		return isVisibilidadCeldaCopiarParroquia;
	}

	public void setIsVisibilidadCeldaCopiarParroquia(Boolean isVisibilidadCeldaCopiarParroquia) {
		this.isVisibilidadCeldaCopiarParroquia = isVisibilidadCeldaCopiarParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParroquia() {
		return isVisibilidadCeldaVerFormParroquia;
	}

	public void setIsVisibilidadCeldaVerFormParroquia(Boolean isVisibilidadCeldaVerFormParroquia) {
		this.isVisibilidadCeldaVerFormParroquia = isVisibilidadCeldaVerFormParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParroquia() {
		return isVisibilidadCeldaOrdenParroquia;
	}

	public void setIsVisibilidadCeldaOrdenParroquia(Boolean isVisibilidadCeldaOrdenParroquia) {
		this.isVisibilidadCeldaOrdenParroquia = isVisibilidadCeldaOrdenParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParroquia() {
		return isVisibilidadCeldaNuevoRelacionesParroquia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParroquia(Boolean isVisibilidadCeldaNuevoRelacionesParroquia) {
		this.isVisibilidadCeldaNuevoRelacionesParroquia = isVisibilidadCeldaNuevoRelacionesParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParroquia() {
		return isVisibilidadCeldaModificarParroquia;
	}

	public void setIsVisibilidadCeldaModificarParroquia(Boolean isVisibilidadCeldaModificarParroquia) {
		this.isVisibilidadCeldaModificarParroquia = isVisibilidadCeldaModificarParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParroquia() {
		return isVisibilidadCeldaActualizarParroquia;
	}

	public void setIsVisibilidadCeldaActualizarParroquia(Boolean isVisibilidadCeldaActualizarParroquia) {
		this.isVisibilidadCeldaActualizarParroquia = isVisibilidadCeldaActualizarParroquia;
	}

	public Boolean getIsVisibilidadCeldaEliminarParroquia() {
		return isVisibilidadCeldaEliminarParroquia;
	}

	public void setIsVisibilidadCeldaEliminarParroquia(Boolean isVisibilidadCeldaEliminarParroquia) {
		this.isVisibilidadCeldaEliminarParroquia = isVisibilidadCeldaEliminarParroquia;
	}

	public Boolean getIsVisibilidadCeldaCancelarParroquia() {
		return isVisibilidadCeldaCancelarParroquia;
	}

	public void setIsVisibilidadCeldaCancelarParroquia(Boolean isVisibilidadCeldaCancelarParroquia) {
		this.isVisibilidadCeldaCancelarParroquia = isVisibilidadCeldaCancelarParroquia;
	}

	public Boolean getIsVisibilidadCeldaGuardarParroquia() {
		return isVisibilidadCeldaGuardarParroquia;
	}

	public void setIsVisibilidadCeldaGuardarParroquia(Boolean isVisibilidadCeldaGuardarParroquia) {
		this.isVisibilidadCeldaGuardarParroquia = isVisibilidadCeldaGuardarParroquia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParroquia() {
		return isVisibilidadCeldaGuardarCambiosParroquia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParroquia(Boolean isVisibilidadCeldaGuardarCambiosParroquia) {
		this.isVisibilidadCeldaGuardarCambiosParroquia = isVisibilidadCeldaGuardarCambiosParroquia;
	}
		
	public ParroquiaSessionBean getparroquiaSessionBean() {
		return this.parroquiaSessionBean;
	}
	
	public void setparroquiaSessionBean(ParroquiaSessionBean parroquiaSessionBean) {
		this.parroquiaSessionBean=parroquiaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCanton() {
		return this.isVisibilidadFK_IdCanton;
	}

	public void setisVisibilidadFK_IdCanton(Boolean isVisibilidadFK_IdCanton) {
		this.isVisibilidadFK_IdCanton=isVisibilidadFK_IdCanton;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParroquia(Parroquia parroquia)throws Exception {
		try {
			
				this.setActualParaGuardarCantonForeignKey(parroquia,null);
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
	
	public void bugActualizarReferenciaActual(Parroquia parroquia,Parroquia parroquiaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParroquia(parroquia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parroquiaAux.setId(parroquia.getId());
		parroquiaAux.setVersionRow(parroquia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParroquia();
		
			int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parroquiaValidator.getInvalidValues(this.parroquia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parroquiaLogic.setDatosCliente(datosCliente);
			parroquiaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parroquiaAux=new  Parroquia();
				
				parroquiaAux.setIsNew(true);
				parroquiaAux.setIsChanged(true);
				
				parroquiaAux.setParroquiaOriginal(this.parroquia);
				
				parroquiaAux.setId(this.parroquia.getId());	
				parroquiaAux.setVersionRow(this.parroquia.getVersionRow());	
				parroquiaAux.setid_canton(this.parroquia.getid_canton());	
				parroquiaAux.setcodigo(this.parroquia.getcodigo());	
				parroquiaAux.setnombre(this.parroquia.getnombre());	
				parroquiaAux.setes_activo(this.parroquia.getes_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parroquiaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parroquiaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parroquiaAux,parroquiaLogic.getParroquias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parroquiaAux,parroquias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parroquiaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parroquiaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parroquiaLogic.saveParroquias();//WithConnection
						//parroquiaLogic.getSetVersionRowParroquias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parroquia,parroquiaAux);
					
					this.refrescarForeignKeysDescripcionesParroquia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parroquiaAux=new  Parroquia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parroquiaSessionBean.getEsGuardarRelacionado() 
					|| (this.parroquiaSessionBean.getEsGuardarRelacionado() && this.parroquia.getId()>=0)) {
						
					parroquiaAux.setIsNew(false);
				}
				
				parroquiaAux.setIsDeleted(false);
			
				parroquiaAux.setId(this.parroquia.getId());	
				parroquiaAux.setVersionRow(this.parroquia.getVersionRow());	
				parroquiaAux.setid_canton(this.parroquia.getid_canton());	
				parroquiaAux.setcodigo(this.parroquia.getcodigo());	
				parroquiaAux.setnombre(this.parroquia.getnombre());	
				parroquiaAux.setes_activo(this.parroquia.getes_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parroquiaAux,parroquiaLogic.getParroquias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parroquiaAux,parroquias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parroquiaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parroquiaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parroquiaLogic.saveParroquias();//WithConnection
						//parroquiaLogic.getSetVersionRowParroquias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parroquia,parroquiaAux);
					
					this.refrescarForeignKeysDescripcionesParroquia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parroquiaAux=new  Parroquia();
				
				parroquiaAux.setIsNew(false);
				parroquiaAux.setIsChanged(false);
				
				parroquiaAux.setIsDeleted(true);
				
				parroquiaAux.setId(this.parroquia.getId());	
				parroquiaAux.setVersionRow(this.parroquia.getVersionRow());	
				parroquiaAux.setid_canton(this.parroquia.getid_canton());	
				parroquiaAux.setcodigo(this.parroquia.getcodigo());	
				parroquiaAux.setnombre(this.parroquia.getnombre());	
				parroquiaAux.setes_activo(this.parroquia.getes_activo());	
				
				if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parroquiaAux.getId()>=0) {	
						this.parroquiasEliminados.add(parroquiaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parroquiaAux,parroquiaLogic.getParroquias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parroquiaAux,parroquias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parroquiaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parroquiaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parroquiaLogic.saveParroquias();//WithConnection
						//parroquiaLogic.getSetVersionRowParroquias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.getParroquias().addAll(this.parroquiasEliminados);
					
					parroquiaLogic.saveParroquias();//WithConnection
					//parroquiaLogic.getSetVersionRowParroquias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParroquia();
				
				this.parroquiasEliminados= new ArrayList<Parroquia>();		
			}
			
			if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parroquia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parroquia=parroquiaAux;
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
      		//this.finishProcessParroquia();
      	}
		
	}	
	
	public void actualizarRelaciones(Parroquia parroquiaLocal) throws Exception {
		
		if(this.parroquiaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Parroquia parroquiaLocal) throws Exception {	
		if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CantonDetalleFormJInternalFrame.class)) {
				CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrameLocal=(CantonBeanSwingJInternalFrame) ((CantonDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cantonBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCanton(cantonBeanSwingJInternalFrameLocal.getcanton(),true);
				cantonBeanSwingJInternalFrameLocal.actualizarLista(cantonBeanSwingJInternalFrameLocal.canton,this.cantonsForeignKey);

				cantonBeanSwingJInternalFrameLocal.actualizarRelaciones(cantonBeanSwingJInternalFrameLocal.canton);

				parroquiaLocal.setCanton(cantonBeanSwingJInternalFrameLocal.canton);

				this.addItemDefectoCombosForeignKeyCanton();
				this.cargarCombosFrameCantonsForeignKey("Formulario");
				this.setActualCantonForeignKey(cantonBeanSwingJInternalFrameLocal.canton.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParroquiaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parroquiaValidator.getInvalidValues(this.parroquia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Parroquia parroquia,List<Parroquia> parroquias) throws Exception {
		try	{		
			ParroquiaConstantesFunciones.actualizarLista(parroquia,parroquias,this.parroquiaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Parroquia parroquia,List<Parroquia> parroquias) throws Exception {
		try	{			
			ParroquiaConstantesFunciones.actualizarSelectedLista(parroquia,parroquias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Parroquia> parroquiasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parroquiasLocal=this.parroquiaLogic.getParroquias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parroquiasLocal=this.parroquias;
			}
			//ARCHITECTURE
		
			for(Parroquia parroquiaLocal:parroquiasLocal) {
				if(this.permiteMantenimiento(parroquiaLocal) && parroquiaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParroquiaConstantesFunciones.getParroquiaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParroquiaConstantesFunciones.IDCANTON)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabelid_cantonParroquia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParroquiaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabelcodigoParroquia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParroquiaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabelnombreParroquia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParroquiaConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabeles_activoParroquia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParroquia.jLabelid_cantonParroquia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParroquia.jLabelcodigoParroquia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParroquia.jLabelnombreParroquia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParroquia.jLabeles_activoParroquia,"");
		
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
		this.iIdNuevoParroquia--;	
		
		
		this.parroquiaAux=new Parroquia();
		
		this.parroquiaAux.setId(this.iIdNuevoParroquia);
		this.parroquiaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parroquiaLogic.getParroquias().add(this.parroquiaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parroquias.add(this.parroquiaAux);
		}
		//ARCHITECTURE
		
		this.parroquia=this.parroquiaAux;
		
		if(ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParroquia(this.parroquia);
			this.setVariablesObjetoActualToFormularioForeignKeyParroquia(this.parroquia);
		}
				
		//this.setDefaultControlesParroquia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParroquia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParroquia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParroquia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParroquia(this.parroquiaBean,this.parroquia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParroquiaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
			classes=ParroquiaConstantesFunciones.getClassesRelationshipsOfParroquia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parroquiaReturnGeneral=parroquiaLogic.procesarEventosParroquiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parroquiaLogic.getParroquias(),this.parroquia,this.parroquiaParameterGeneral,this.isEsNuevoParroquia,classes);//this.parroquiaLogic.getParroquia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParroquia(this.parroquiaReturnGeneral,this.parroquiaBean,false);
		
		if(this.parroquiaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParroquia(this.parroquiaReturnGeneral.getParroquia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParroquia(this.parroquiaReturnGeneral.getParroquia());
		}
		
		if(this.parroquiaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParroquia(this.parroquiaReturnGeneral.getParroquia(),classes);//this.parroquiaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParroquia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParroquia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParroquiaBeanSwingJInternalFrameAdditional.RecargarFormParroquia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParroquia(false);
						
			if(parroquiaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParroquia();
			}
			
			this.actualizarVisualTableDatosParroquia();
			
			this.jTableDatosParroquia.setRowSelectionInterval(this.getIndiceNuevoParroquia(), this.getIndiceNuevoParroquia());
			
			this.seleccionarFilaTablaParroquiaActual();
						
			this.actualizarEstadoCeldasBotonesParroquia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParroquia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.setEnabled(isHabilitar && this.parroquiaConstantesFunciones.activarcodigoParroquia);
		this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.setEnabled(isHabilitar && this.parroquiaConstantesFunciones.activarnombreParroquia);
		this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setEnabled(isHabilitar && this.parroquiaConstantesFunciones.activares_activoParroquia);	
		
		this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setEnabled(isHabilitar && this.parroquiaConstantesFunciones.activarid_cantonParroquia);
	};
	
	public void setDefaultControlesParroquia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParroquia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parroquiaSessionBean.setConGuardarRelaciones(true);			
			this.parroquiaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.setVisible(true);
			
					
		} else {
			//this.parroquiaSessionBean.setConGuardarRelaciones(false);			
			this.parroquiaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParroquia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
				if(parroquiaAux.getId().equals(this.iIdNuevoParroquia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parroquia parroquiaAux:this.parroquias) {
				if(parroquiaAux.getId().equals(this.iIdNuevoParroquia)) {
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
	
	public int getIndiceActualParroquia(Parroquia parroquia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
				if(parroquiaAux.getId().equals(parroquia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parroquia parroquiaAux:this.parroquias) {
				if(parroquiaAux.getId().equals(parroquia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParroquia(Parroquia parroquiaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
				if(parroquiaAux.getParroquiaOriginal().getId().equals(parroquiaOriginal.getId())) {
					existe=true;
					parroquiaOriginal.setId(parroquiaAux.getId());
					parroquiaOriginal.setVersionRow(parroquiaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parroquia parroquiaAux:this.parroquias) {
				if(parroquiaAux.getParroquiaOriginal().getId().equals(parroquiaOriginal.getId())) {
					existe=true;
					parroquiaOriginal.setId(parroquiaAux.getId());
					parroquiaOriginal.setVersionRow(parroquiaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParroquia(Boolean esParaCancelar) throws Exception {
		parroquiasAux=new ArrayList<Parroquia>();
		parroquiaAux=new Parroquia();
		
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
					if(parroquiaAux.getId()<0) {
						parroquiasAux.add(parroquiaAux);
					}		
				}
				this.iIdNuevoParroquia=0L;
				this.parroquiaLogic.getParroquias().removeAll(parroquiasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parroquia parroquiaAux:this.parroquias) {
					if(parroquiaAux.getId()<0) {
						parroquiasAux.add(parroquiaAux);
					}		
				}
				this.iIdNuevoParroquia=0L;
				this.parroquias.removeAll(parroquiasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParroquia 
					&& this.parroquiaLogic.getParroquias().size()>0
					) {
					parroquiaAux=this.parroquiaLogic.getParroquias().get(this.parroquiaLogic.getParroquias().size() - 1);
				
					if(parroquiaAux.getId()<0) {
						this.parroquiaLogic.getParroquias().remove(parroquiaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParroquia && this.parroquias.size()>0) {
					parroquiaAux=this.parroquias.get(this.parroquias.size() - 1);
				
					if(parroquiaAux.getId()<0) {
						this.parroquias.remove(parroquiaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParroquia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parroquia.getId()<0) {
				this.parroquiaLogic.getParroquias().remove(this.parroquia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parroquia.getId()<0) {
				this.parroquias.remove(this.parroquia);
			}
		}			
	}
	
	public void setEstadosInicialesParroquia(List<Parroquia> parroquiasAux) throws Exception {
		ParroquiaConstantesFunciones.setEstadosInicialesParroquia(parroquiasAux);
	}
	
	public void setEstadosInicialesParroquia(Parroquia parroquiaAux) throws Exception {
		ParroquiaConstantesFunciones.setEstadosInicialesParroquia(parroquiaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParroquiaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParroquia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParroquiaActual()) {
				if(!this.isEsNuevoParroquia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParroquia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParroquia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParroquiaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parroquia ?", "MANTENIMIENTO DE Parroquia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParroquia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Parroquia parroquia) throws Exception {
		ParroquiaConstantesFunciones.seleccionarAsignar(this.parroquia,parroquia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParroquia=this.isPermisoActualizarOriginalParroquia;
			
			
			this.seleccionarAsignar(parroquia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParroquiaConstantesFunciones.quitarEspaciosParroquia(this.parroquia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParroquia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parroquiaSessionBean.setsFuncionBusquedaRapida(this.parroquiaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParroquia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParroquia(esParaCancelar);				
				this.cancelarNuevoParroquia(esParaCancelar);								
			}
			
			this.parroquia=new Parroquia();
			
			this.inicializarParroquia();
			
			this.actualizarEstadoCeldasBotonesParroquia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParroquia() throws Exception {
		try {
			ParroquiaConstantesFunciones.inicializarParroquia(this.parroquia);
			
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
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parroquiaLogic.getParroquias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParroquias(String sAccionBusqueda,List<Parroquia> parroquiasParaReportes) throws Exception {
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
					sPathReporteFinal="Parroquia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParroquiaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParroquiaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Parroquia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parroquias");		
		parameters.put("busquedapor", ParroquiaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParroquia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParroquiaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParroquiaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParroquia=new JRBeanArrayDataSource(ParroquiaJInternalFrame.TraerParroquiaBeans(parroquiasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParroquia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParroquiaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParroquiaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParroquiaBean.TraerParroquiaBeans(parroquiasParaReportes).toArray()));
							
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
				this.generarExcelReporteParroquias(sAccionBusqueda,sTipoArchivoReporte,parroquiasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParroquias(sAccionBusqueda,sTipoArchivoReporte,parroquiasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParroquiaActionPerformed(null);
					//this.generarExcelReporteParroquias(sAccionBusqueda,sTipoArchivoReporte,parroquiasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParroquias(sAccionBusqueda,sTipoArchivoReporte,parroquiasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParroquias(sAccionBusqueda,sTipoArchivoReporte,parroquiasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParroquias(sAccionBusqueda,sTipoArchivoReporte,parroquiasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParroquias(String sAccionBusqueda,String sTipoArchivoReporte,List<Parroquia> parroquiasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parroquia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Parroquias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParroquia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Parroquia parroquia : parroquiasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParroquiaConstantesFunciones.generarExcelReporteDataParroquia("NORMAL",row,workbook,parroquia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParroquia(String sTipo,Row row,Workbook workbook) {
		
		ParroquiaConstantesFunciones.generarExcelReporteHeaderParroquia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParroquias(String sAccionBusqueda,String sTipoArchivoReporte,List<Parroquia> parroquiasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parroquia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Parroquias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Parroquia parroquia : parroquiasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParroquiaConstantesFunciones.getParroquiaDescripcion(parroquia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParroquiaConstantesFunciones.LABEL_IDCANTON))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParroquiaConstantesFunciones.LABEL_IDCANTON);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parroquia.getcanton_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParroquiaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParroquiaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parroquia.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParroquiaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParroquiaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parroquia.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParroquiaConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParroquiaConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parroquia.getes_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParroquias(String sAccionBusqueda,String sTipoArchivoReporte,List<Parroquia> parroquiasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Parroquia> parroquiasRespaldo=null;
		
		classes=ParroquiaConstantesFunciones.getClassesRelationshipsOfParroquia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parroquiaLogic.setDatosCliente(this.datosCliente);
		this.parroquiaLogic.setDatosDeep(this.datosDeep);
		this.parroquiaLogic.setIsConDeep(true);
		
		parroquiasRespaldo=this.parroquiaLogic.getParroquias();
		
		this.parroquiaLogic.setParroquias(parroquiasParaReportes);	
		this.parroquiaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parroquiasParaReportes=this.parroquiaLogic.getParroquias();
		this.parroquiaLogic.setParroquias(parroquiasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parroquia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Parroquias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParroquia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Parroquia parroquia : parroquiasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParroquia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParroquiaConstantesFunciones.generarExcelReporteDataParroquia("NORMAL",row,workbook,parroquia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParroquiaConstantesFunciones.getParroquiaDescripcion(parroquia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParroquia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParroquia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParroquia() throws Exception {		
		this.startProcessParroquia(true);
	}
	
	public void startProcessParroquia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParroquia ,this.jPanelParametrosReportesParroquia, this.jScrollPanelDatosParroquia,this.jPanelPaginacionParroquia, this.jScrollPanelDatosEdicionParroquia, this.jPanelAccionesParroquia,this.jPanelAccionesFormularioParroquia,this.jmenuBarParroquia,this.jmenuBarDetalleParroquia,this.jTtoolBarParroquia,this.jTtoolBarDetalleParroquia);		
		
		final JTabbedPane jTabbedPaneBusquedasParroquia=this.jTabbedPaneBusquedasParroquia; 
		
		final JPanel jPanelParametrosReportesParroquia=this.jPanelParametrosReportesParroquia;
		//final JScrollPane jScrollPanelDatosParroquia=this.jScrollPanelDatosParroquia;
		final JTable jTableDatosParroquia=this.jTableDatosParroquia;		
		final JPanel jPanelPaginacionParroquia=this.jPanelPaginacionParroquia;
		//final JScrollPane jScrollPanelDatosEdicionParroquia=this.jScrollPanelDatosEdicionParroquia;
		final JPanel jPanelAccionesParroquia=this.jPanelAccionesParroquia;
		
		JPanel jPanelCamposAuxiliarParroquia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParroquia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
			jPanelCamposAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jPanelCamposParroquia;
			jPanelAccionesFormularioAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jPanelAccionesFormularioParroquia;
		}
		
		final JPanel jPanelCamposParroquia=jPanelCamposAuxiliarParroquia;
		final JPanel jPanelAccionesFormularioParroquia=jPanelAccionesFormularioAuxiliarParroquia;
		
		
		final JMenuBar jmenuBarParroquia=this.jmenuBarParroquia;
		final JToolBar jTtoolBarParroquia=this.jTtoolBarParroquia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParroquia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParroquia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
			jmenuBarDetalleAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jmenuBarDetalleParroquia;
			jTtoolBarDetalleAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jTtoolBarDetalleParroquia;
		}
		
		final JMenuBar jmenuBarDetalleParroquia=jmenuBarDetalleAuxiliarParroquia;
		final JToolBar jTtoolBarDetalleParroquia=jTtoolBarDetalleAuxiliarParroquia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParroquia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParroquia;
			processRunnable.jTableDatos=jTableDatosParroquia;
			processRunnable.jPanelCampos=jPanelCamposParroquia;
			processRunnable.jPanelPaginacion=jPanelPaginacionParroquia;
			processRunnable.jPanelAcciones=jPanelAccionesParroquia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParroquia;
			
			
			processRunnable.jmenuBar=jmenuBarParroquia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParroquia;
			processRunnable.jTtoolBar=jTtoolBarParroquia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParroquia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParroquia ,jPanelParametrosReportesParroquia,jTableDatosParroquia, /*jScrollPanelDatosParroquia,*/jPanelCamposParroquia,jPanelPaginacionParroquia, /*jScrollPanelDatosEdicionParroquia,*/ jPanelAccionesParroquia,jPanelAccionesFormularioParroquia,jmenuBarParroquia,jmenuBarDetalleParroquia,jTtoolBarParroquia,jTtoolBarDetalleParroquia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParroquia ,jPanelParametrosReportesParroquia, jScrollPanelDatosParroquia,jPanelPaginacionParroquia, jScrollPanelDatosEdicionParroquia, jPanelAccionesParroquia,jPanelAccionesFormularioParroquia,jmenuBarParroquia,jmenuBarDetalleParroquia,jTtoolBarParroquia,jTtoolBarDetalleParroquia);
						
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
	
	public void finishProcessParroquia() {// throws Exception 
		this.finishProcessParroquia(true);
	}
	
	public void finishProcessParroquia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParroquia ,this.jPanelParametrosReportesParroquia, this.jScrollPanelDatosParroquia,this.jPanelPaginacionParroquia, this.jScrollPanelDatosEdicionParroquia, this.jPanelAccionesParroquia,this.jPanelAccionesFormularioParroquia,this.jmenuBarParroquia,this.jmenuBarDetalleParroquia,this.jTtoolBarParroquia,this.jTtoolBarDetalleParroquia);		
		
		final JTabbedPane jTabbedPaneBusquedasParroquia=this.jTabbedPaneBusquedasParroquia; 
		
		final JPanel jPanelParametrosReportesParroquia=this.jPanelParametrosReportesParroquia;
		//final JScrollPane jScrollPanelDatosParroquia=this.jScrollPanelDatosParroquia;
		final JTable jTableDatosParroquia=this.jTableDatosParroquia;		
		final JPanel jPanelPaginacionParroquia=this.jPanelPaginacionParroquia;
		//final JScrollPane jScrollPanelDatosEdicionParroquia=this.jScrollPanelDatosEdicionParroquia;
		final JPanel jPanelAccionesParroquia=this.jPanelAccionesParroquia;
		
		JPanel jPanelCamposAuxiliarParroquia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParroquia=new JPanel();
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
			jPanelCamposAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jPanelCamposParroquia;
			jPanelAccionesFormularioAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jPanelAccionesFormularioParroquia;
		}
		
		final JPanel jPanelCamposParroquia=jPanelCamposAuxiliarParroquia;
		final JPanel jPanelAccionesFormularioParroquia=jPanelAccionesFormularioAuxiliarParroquia;
		
		
		final JMenuBar jmenuBarParroquia=this.jmenuBarParroquia;		
		final JToolBar jTtoolBarParroquia=this.jTtoolBarParroquia;
				
		JMenuBar jmenuBarDetalleAuxiliarParroquia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParroquia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
			jmenuBarDetalleAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jmenuBarDetalleParroquia;
			jTtoolBarDetalleAuxiliarParroquia=this.jInternalFrameDetalleFormParroquia.jTtoolBarDetalleParroquia;		
		}
		
		final JMenuBar jmenuBarDetalleParroquia=jmenuBarDetalleAuxiliarParroquia;
		final JToolBar jTtoolBarDetalleParroquia=jTtoolBarDetalleAuxiliarParroquia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParroquia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParroquia;
			processRunnable.jTableDatos=jTableDatosParroquia;
			processRunnable.jPanelCampos=jPanelCamposParroquia;
			processRunnable.jPanelPaginacion=jPanelPaginacionParroquia;
			processRunnable.jPanelAcciones=jPanelAccionesParroquia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParroquia;
			
			
			processRunnable.jmenuBar=jmenuBarParroquia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParroquia;
			processRunnable.jTtoolBar=jTtoolBarParroquia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParroquia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParroquia ,jPanelParametrosReportesParroquia, jTableDatosParroquia,/*jScrollPanelDatosParroquia,*/jPanelCamposParroquia,jPanelPaginacionParroquia, /*jScrollPanelDatosEdicionParroquia,*/ jPanelAccionesParroquia,jPanelAccionesFormularioParroquia,jmenuBarParroquia,jmenuBarDetalleParroquia,jTtoolBarParroquia,jTtoolBarDetalleParroquia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParroquia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParroquia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParroquia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParroquia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParroquia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParroquia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParroquia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParroquia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParroquia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parroquiaConstantesFunciones.getsFinalQueryParroquia();
		String  finalQueryPaginacionTodos=this.parroquiaConstantesFunciones.getsFinalQueryParroquia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParroquiaConstantesFunciones.getArrayColumnasGlobalesNoParroquia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParroquiaConstantesFunciones.getArrayColumnasGlobalesParroquia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParroquiaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parroquiasEliminados= new ArrayList<Parroquia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParroquia();
		
				///*ParroquiaSessionBean*/this.parroquiaSessionBean=new ParroquiaSessionBean();
			
			if(this.parroquiaSessionBean==null) {
				this.parroquiaSessionBean=new ParroquiaSessionBean();
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
					this.iNumeroPaginacion=ParroquiaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParroquiaConstantesFunciones.getClassesForeignKeysOfParroquia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parroquia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parroquiasAux= new ArrayList<Parroquia>();
			
				
			parroquiaLogic.setDatosCliente(this.datosCliente);
			parroquiaLogic.setDatosDeep(this.datosDeep);
			parroquiaLogic.setIsConDeep(true);
			
			
			parroquiaLogic.getParroquiaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parroquiaLogic.getTodosParroquias(finalQueryGlobal,pagination);
					
					//parroquiaLogic.getTodosParroquiasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parroquiaLogic.getParroquias()==null|| parroquiaLogic.getParroquias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parroquiasAux= new ArrayList<Parroquia>();
							parroquiasAux.addAll(parroquiaLogic.getParroquias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parroquiasAux= new ArrayList<Parroquia>();
							parroquiasAux.addAll(parroquias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parroquiaLogic.getTodosParroquias(finalQueryGlobal+"",this.pagination);												
							
							//parroquiaLogic.getTodosParroquiasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParroquias("Todos",parroquiaLogic.getParroquias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parroquiaLogic.setParroquias(new ArrayList<Parroquia>());					
							parroquiaLogic.getParroquias().addAll(parroquiasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parroquias=new ArrayList<Parroquia>();
							parroquias.addAll(parroquiasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParroquia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParroquia=this.idActual;
				
				} else if(this.idParroquiaActual!=null && this.idParroquiaActual!=0L) {
					idParroquia=idParroquiaActual;
				}
				
					
				this.sDetalleReporte=ParroquiaConstantesFunciones.getDetalleIndicePorId(idParroquia);
				
				this.parroquias=new ArrayList<Parroquia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parroquiaLogic.getEntity(idParroquia);
					
					//parroquiaLogic.getEntityWithConnection(idParroquia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parroquiaLogic.setParroquias(new ArrayList<Parroquia>());
					parroquiaLogic.getParroquias().add(parroquiaLogic.getParroquia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parroquias=new ArrayList<Parroquia>();
					this.parroquias.add(parroquia);
				}
				
				if(parroquiaLogic.getParroquia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCanton")) {
				this.sDetalleReporte=ParroquiaConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parroquiaLogic.getParroquiasFK_IdCanton(finalQueryGlobal,pagination,id_cantonFK_IdCanton);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParroquiaConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParroquiaConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parroquiaLogic.getParroquias()==null||parroquiaLogic.getParroquias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parroquias==null|| parroquias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parroquiasAux=new ArrayList<Parroquia>();
						parroquiasAux.addAll(parroquiaLogic.getParroquias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parroquiasAux=new ArrayList<Parroquia>();
							parroquiasAux.addAll(parroquias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parroquiaLogic.getParroquiasFK_IdCanton(finalQueryGlobal,pagination,id_cantonFK_IdCanton);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParroquiaConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParroquiaConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParroquias("FK_IdCanton",parroquiaLogic.getParroquias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParroquias("FK_IdCanton",parroquias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parroquiaLogic.setParroquias(new ArrayList<Parroquia>());
						parroquiaLogic.getParroquias().addAll(parroquiasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parroquias=new ArrayList<Parroquia>();
							parroquias.addAll(parroquiasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParroquia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParroquia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parroquiaLogic.getParroquias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parroquias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parroquiaLogic.getParroquias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parroquias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Parroquia parroquia) {
		Boolean permite=true;
		
		if(this.parroquia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParroquiaConstantesFunciones.getOrderByListaParroquia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParroquiaConstantesFunciones.getOrderByListaParroquia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parroquia parroquia:parroquiaLogic.getParroquias()) {
				if(parroquia.getsType().equals(Constantes2.S_TOTALES)) {
					parroquiaTotales=parroquia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parroquia parroquia:this.parroquias) {
				if(parroquia.getsType().equals(Constantes2.S_TOTALES)) {
					parroquiaTotales=parroquia;
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
			this.parroquiaAux=new Parroquia();
			this.parroquiaAux.setsType(Constantes2.S_TOTALES);
			this.parroquiaAux.setIsNew(false);
			this.parroquiaAux.setIsChanged(false);
			this.parroquiaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParroquiaConstantesFunciones.TotalizarValoresFilaParroquia(this.parroquiaLogic.getParroquias(),this.parroquiaAux);
				
				this.parroquiaLogic.getParroquias().add(this.parroquiaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParroquiaConstantesFunciones.TotalizarValoresFilaParroquia(this.parroquias,this.parroquiaAux);
				
				this.parroquias.add(this.parroquiaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parroquiaTotales=new Parroquia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parroquiaLogic.getParroquias().remove(parroquiaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parroquias.remove(parroquiaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parroquiaTotales=new Parroquia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parroquia parroquia:parroquiaLogic.getParroquias()) {
				if(parroquia.getsType().equals(Constantes2.S_TOTALES)) {
					parroquiaTotales=parroquia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParroquiaConstantesFunciones.TotalizarValoresFilaParroquia(this.parroquiaLogic.getParroquias(),parroquiaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parroquia parroquia:this.parroquias) {
				if(parroquia.getsType().equals(Constantes2.S_TOTALES)) {
					parroquiaTotales=parroquia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParroquiaConstantesFunciones.TotalizarValoresFilaParroquia(this.parroquias,parroquiaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParroquiasFK_IdCanton()throws Exception {
		try {
			sAccionBusqueda="FK_IdCanton";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParroquiasFK_IdCanton(String sFinalQuery,Long id_canton)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parroquiaLogic.getParroquiasFK_IdCanton(sFinalQuery,this.pagination,id_canton);
				
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
	
	public void inicializarPermisosParroquia() {
		this.isPermisoTodoParroquia=false;
		this.isPermisoNuevoParroquia=false;
		this.isPermisoActualizarParroquia=false;
		this.isPermisoActualizarOriginalParroquia=false;
		this.isPermisoEliminarParroquia=false;
		this.isPermisoGuardarCambiosParroquia=false;
		this.isPermisoConsultaParroquia=false;
		this.isPermisoBusquedaParroquia=false;
		this.isPermisoReporteParroquia=false;		
		this.isPermisoOrdenParroquia=false;		
		this.isPermisoPaginacionMedioParroquia=false;		
		this.isPermisoPaginacionAltoParroquia=false;
		this.isPermisoPaginacionTodoParroquia=false;
		this.isPermisoCopiarParroquia=false;		
		this.isPermisoVerFormParroquia=false;		
		this.isPermisoDuplicarParroquia=false;		
		this.isPermisoOrdenParroquia=false;		
	}
	
	public void setPermisosUsuarioParroquia(Boolean isPermiso) {
		this.isPermisoTodoParroquia=isPermiso;
		this.isPermisoNuevoParroquia=isPermiso;
		this.isPermisoActualizarParroquia=isPermiso;
		this.isPermisoActualizarOriginalParroquia=isPermiso;
		this.isPermisoEliminarParroquia=isPermiso;
		this.isPermisoGuardarCambiosParroquia=isPermiso;
		this.isPermisoConsultaParroquia=isPermiso;
		this.isPermisoBusquedaParroquia=isPermiso;
		this.isPermisoReporteParroquia=isPermiso;
		this.isPermisoOrdenParroquia=isPermiso;		
		this.isPermisoPaginacionMedioParroquia=isPermiso;		
		this.isPermisoPaginacionAltoParroquia=isPermiso;		
		this.isPermisoPaginacionTodoParroquia=isPermiso;		
		this.isPermisoCopiarParroquia=isPermiso;		
		this.isPermisoVerFormParroquia=isPermiso;		
		this.isPermisoDuplicarParroquia=isPermiso;
		this.isPermisoOrdenParroquia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParroquia(Boolean isPermiso) {
		//this.isPermisoTodoParroquia=isPermiso;
		this.isPermisoNuevoParroquia=isPermiso;
		this.isPermisoActualizarParroquia=isPermiso;
		this.isPermisoActualizarOriginalParroquia=isPermiso;
		this.isPermisoEliminarParroquia=isPermiso;
		this.isPermisoGuardarCambiosParroquia=isPermiso;
		//this.isPermisoConsultaParroquia=isPermiso;
		//this.isPermisoBusquedaParroquia=isPermiso;
		//this.isPermisoReporteParroquia=isPermiso;
		//this.isPermisoOrdenParroquia=isPermiso;		
		//this.isPermisoPaginacionMedioParroquia=isPermiso;		
		//this.isPermisoPaginacionAltoParroquia=isPermiso;		
		//this.isPermisoPaginacionTodoParroquia=isPermiso;		
		//this.isPermisoCopiarParroquia=isPermiso;		
		//this.isPermisoDuplicarParroquia=isPermiso;
		//this.isPermisoOrdenParroquia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParroquiaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParroquiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParroquia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParroquiaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParroquiaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParroquiaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParroquiaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParroquia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParroquiaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParroquiaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParroquia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParroquia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParroquia=this.isPermisoActualizarParroquia;
			this.isPermisoEliminarParroquia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParroquia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParroquia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParroquia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParroquia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParroquia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParroquia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParroquia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParroquia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParroquia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParroquia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParroquia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParroquia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParroquia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParroquia.setToolTipText(this.jTableDatosParroquia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParroquia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParroquia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParroquiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParroquiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParroquia() throws Exception {
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
	public void inicializarCombosForeignKeyParroquiaListas()throws Exception {
		try	{						
			
				this.cantonsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParroquiaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParroquiaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParroquiaListas(false);
			} else {
			
				this.cargarCombosForeignKeyCantonListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyCantonListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cantonsForeignKey==null||this.cantonsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CantonConstantesFunciones.getArrayColumnasGlobalesCanton(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CantonConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CantonConstantesFunciones.SFINALQUERY;

				this.cargarCombosCantonsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParroquiaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParroquiaParameterReturnGeneral parroquiaReturnGeneral=new ParroquiaParameterReturnGeneral();
						
			


				String finalQueryGlobalCanton="";

				if(((this.cantonsForeignKey==null||this.cantonsForeignKey.size()<=0) && this.parroquiaConstantesFunciones.cargarid_cantonParroquia)
					 || (this.esRecargarFks && this.parroquiaConstantesFunciones.cargarid_cantonParroquia)) {

					if(!this.parroquiaSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CantonConstantesFunciones.getArrayColumnasGlobalesCanton(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCanton=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CantonConstantesFunciones.TABLENAME);

						finalQueryGlobalCanton=Funciones.GetFinalQueryAppend(finalQueryGlobalCanton, "");
						finalQueryGlobalCanton+=CantonConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCantonsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCanton=" WHERE " + ConstantesSql.ID + "="+parroquiaSessionBean.getlidCantonActual();
					}
				} else {
					finalQueryGlobalCanton="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parroquiaReturnGeneral=parroquiaLogic.cargarCombosLoteForeignKeyParroquia(finalQueryGlobalCanton);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCanton.equals("NONE")) {
				this.cantonsForeignKey=parroquiaReturnGeneral.getcantonsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParroquia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCanton();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCanton()throws Exception {
		try {
			if(this.parroquiaSessionBean==null) {
				this.parroquiaSessionBean=new ParroquiaSessionBean();
			}

			if(!this.parroquiaSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {
				Canton canton=new Canton();
				CantonConstantesFunciones.setCantonDescripcion(canton,Constantes.SMENSAJE_ESCOJA_OPCION);
				canton.setId(null);

				if(!CantonConstantesFunciones.ExisteEnLista(this.cantonsForeignKey,canton,true)) {

					this.cantonsForeignKey.add(0,canton);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParroquia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParroquia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParroquia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParroquia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParroquia(Parroquia parroquia)throws Exception {	
		try {
			
			this.setActualCantonForeignKey(parroquia.getid_canton(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParroquia(Parroquia parroquia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParroquia()throws Exception {	
		try {
			
			this.setActualCantonForeignKey(this.parroquiaConstantesFunciones.getid_canton(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParroquia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParroquia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParroquia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParroquia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParroquia()throws Exception {
		try {
			

			this.cargarCombosFrameCantonsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParroquia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCantonsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParroquia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia!=null && this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.getItemCount()>0) {
				this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ParroquiaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParroquiaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParroquiaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parroquiaSessionBean=new ParroquiaSessionBean(); 
		this.parroquiaConstantesFunciones=new ParroquiaConstantesFunciones(); 
		this.parroquiaBean=new Parroquia();//(this.parroquiaConstantesFunciones); 		
		this.parroquiaReturnGeneral=new ParroquiaParameterReturnGeneral(); 
		
		this.parroquiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parroquiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParroquiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParroquiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParroquiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParroquia(true);
			
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
			
			this.parroquiaConstantesFunciones=new ParroquiaConstantesFunciones(); 
			this.parroquiaBean=new Parroquia();//this.parroquiaConstantesFunciones); 			
			this.parroquiaReturnGeneral=new ParroquiaParameterReturnGeneral(); 
		
			ParroquiaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parroquia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parroquia=new Parroquia();
			this.parroquias = new ArrayList<Parroquia>();
			this.parroquiasAux = new ArrayList<Parroquia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic=new ParroquiaLogic();
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			//this.parroquiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parroquiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParroquia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParroquia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParroquia);	
					}
					
					if(this.jInternalFrameImportacionParroquia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParroquia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParroquia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParroquia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParroquia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParroquia);
				this.jInternalFrameDetalleFormParroquia.setVisible(false);
				this.jInternalFrameDetalleFormParroquia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParroquia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParroquia);
					this.jInternalFrameReporteDinamicoParroquia.setVisible(false);
					this.jInternalFrameReporteDinamicoParroquia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParroquia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParroquia);
					this.jInternalFrameImportacionParroquia.setVisible(false);
					this.jInternalFrameImportacionParroquia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParroquia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParroquia);
					this.jInternalFrameOrderByParroquia.setVisible(false);
					this.jInternalFrameOrderByParroquia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParroquiaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParroquiaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parroquiaReturnGeneral=new ParroquiaParameterReturnGeneral();
			
			this.parroquiaParameterGeneral=new ParroquiaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parroquiaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParroquiaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParroquiaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parroquiaSessionBean.getEsGuardarRelacionado(),this.parroquiaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParroquiaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parroquiaSessionBean.getEsGuardarRelacionado(),this.parroquiaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParroquia=false;
			this.isVisibilidadCeldaDuplicarParroquia=true;
			this.isVisibilidadCeldaCopiarParroquia=true;
			this.isVisibilidadCeldaVerFormParroquia=true;
			this.isVisibilidadCeldaOrdenParroquia=true;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
			this.isVisibilidadCeldaModificarParroquia=false;
			this.isVisibilidadCeldaActualizarParroquia=false;
			this.isVisibilidadCeldaEliminarParroquia=false;
			this.isVisibilidadCeldaCancelarParroquia=false;
			this.isVisibilidadCeldaGuardarParroquia=false;
			this.isVisibilidadCeldaGuardarCambiosParroquia=false;
			
			
			this.isVisibilidadFK_IdCanton=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParroquia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParroquia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParroquia(false);
			
			this.setPermisosUsuarioParroquia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parroquiaSessionBean.getEsGuardarRelacionado() 
				|| (this.parroquiaSessionBean.getEsGuardarRelacionado() && this.parroquiaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParroquiaClasesRelacionadas();
			}
			
			if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParroquiaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParroquiaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParroquia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParroquia();
			}
			
			if(!this.isPermisoBusquedaParroquia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParroquia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParroquia,this.isPermisoPaginacionMedioParroquia,this.isPermisoPaginacionTodoParroquia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParroquiaConstantesFunciones.getTiposSeleccionarParroquia());
				
				this.tiposColumnasSelect=ParroquiaConstantesFunciones.getTiposSeleccionarParroquia(true);
				
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
			//if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParroquia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParroquia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParroquia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParroquia() ;
			
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
			
			this.cantonLogic=new CantonLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parroquiaImplementable= (ParroquiaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParroquiaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parroquiaImplementableHome= (ParroquiaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParroquiaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parroquias= new ArrayList<Parroquia>();
			this.parroquiasEliminados= new ArrayList<Parroquia>();
						
			this.isEsNuevoParroquia=false;
			this.esParaAccionDesdeFormularioParroquia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.cantonsForeignKey=new ArrayList<Canton>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParroquia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParroquia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParroquiaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParroquiaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParroquia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParroquia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParroquia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParroquia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParroquia();
			}
			
			ParroquiaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParroquia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParroquia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParroquia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParroquia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Parroquia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParroquia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParroquia")) {
				iIndex=this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParroquia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParroquia();	
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
	
	public void cargarCombosForeignKeyParroquia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParroquia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParroquia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParroquiaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParroquia();
		
		this.cargarCombosFrameForeignKeyParroquia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParroquia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParroquia();
		}
	}
	
	

	public void cargarCombosForeignKeyCanton(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCantonListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCanton();
				this.cargarCombosFrameCantonsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCanton(this.cantonsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParroquiaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
			
			if(jTableDatosParroquia.getRowCount()>=1) {
				jTableDatosParroquia.removeRowSelectionInterval(0, jTableDatosParroquia.getRowCount()-1);						
			}
			
			this.isEsNuevoParroquia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParroquia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParroquia(true);			
			//this.parroquia=new Parroquia();
			//this.parroquia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParroquia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParroquia() ;
			
			if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParroquia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parroquia);	
			this.actualizarInformacion("INFO_PADRE",false,this.parroquia);				
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
			if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Parroquia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParroquiaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParroquia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParroquia.getSelectedRows().length;			
			}
			
			parroquiasSeleccionados=this.getParroquiasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParroquia--;			
				//Parroquia parroquiaAux= new Parroquia();			
				//parroquiaAux.setId(this.iIdNuevoParroquia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Parroquia parroquiaOrigen=new Parroquia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Parroquia parroquiaOrigen : parroquiasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parroquiaOrigen =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parroquiaOrigen =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParroquia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parroquia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParroquia(parroquiaOrigen,this.parroquia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parroquiaLogic.getParroquias().add(this.parroquiaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parroquias.add(this.parroquiaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParroquia(false);
				
				this.jTableDatosParroquia.setRowSelectionInterval(this.getIndiceNuevoParroquia(), this.getIndiceNuevoParroquia());
				
				int iLastRow =  this.jTableDatosParroquia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParroquia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParroquia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParroquia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();									
		
			Parroquia parroquiaOrigen=new Parroquia();
			Parroquia parroquiaDestino=new Parroquia();
				
			parroquiasSeleccionados=this.getParroquiasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParroquia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parroquiasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParroquia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parroquiaOrigen =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parroquiaOrigen =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parroquiaDestino =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parroquiaDestino =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parroquiaOrigen =parroquiasSeleccionados.get(0);
				parroquiaDestino =parroquiasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParroquia(parroquiaOrigen,parroquiaDestino,true,false);
				
				parroquiaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parroquiaDestino,parroquiaLogic.getParroquias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parroquiaDestino,parroquias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParroquia(false);
				
				//this.jTableDatosParroquia.setRowSelectionInterval(this.getIndiceNuevoParroquia(), this.getIndiceNuevoParroquia());
				
				int iLastRow =  this.jTableDatosParroquia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParroquia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParroquia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParroquia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParroquia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParroquia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParroquia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParroquia.setVisible(!isVisible);
			this.jPanelPaginacionParroquia.setVisible(!isVisible);
			this.jPanelAccionesParroquia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParroquia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParroquia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParroquia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParroquia();
			
			this.abrirFrameOrderByParroquia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParroquia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParroquia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParroquia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParroquia.isMaximum()) {
					this.jInternalFrameDetalleFormParroquia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParroquia.setSize(this.jInternalFrameDetalleFormParroquia.iWidthFormulario,this.jInternalFrameDetalleFormParroquia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParroquia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParroquia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParroquia.isMaximum()) {
						this.jInternalFrameDetalleFormParroquia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParroquia.jContentPaneDetalleParroquia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParroquia.jContentPaneDetalleParroquia.getWidth(),ParroquiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParroquia.jContentPaneDetalleParroquia.getWidth(),ParroquiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParroquia.jContentPaneDetalleParroquia.getWidth(),ParroquiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParroquia.setVisible(true);
	        this.jInternalFrameDetalleFormParroquia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParroquia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParroquia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParroquia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParroquia,false,this);
				} else {
					this.jInternalFrameOrderByParroquia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParroquia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParroquia);
				this.jInternalFrameOrderByParroquia.setVisible(false);
				this.jInternalFrameOrderByParroquia.setSelected(false);
				
				this.jInternalFrameOrderByParroquia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParroquia"));
				
				this.inicializarActualizarBindingTablaOrderByParroquia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParroquia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParroquia==null) {
				
				this.jInternalFrameImportacionParroquia=new ImportacionJInternalFrame(ParroquiaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParroquia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParroquia);
				this.jInternalFrameImportacionParroquia.setVisible(false);
				this.jInternalFrameImportacionParroquia.setSelected(false);


				this.jInternalFrameImportacionParroquia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParroquia"));
				this.jInternalFrameImportacionParroquia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParroquia"));
				this.jInternalFrameImportacionParroquia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParroquia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParroquia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParroquia==null) {
				this.jInternalFrameReporteDinamicoParroquia=new ReporteDinamicoJInternalFrame(ParroquiaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParroquia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParroquia);
				this.jInternalFrameReporteDinamicoParroquia.setVisible(false);
				this.jInternalFrameReporteDinamicoParroquia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParroquia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParroquia"));
				this.jInternalFrameReporteDinamicoParroquia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParroquia"));
				this.jInternalFrameReporteDinamicoParroquia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParroquia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParroquia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleParroquia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParroquia);
			
	       	this.jInternalFrameDetalleFormParroquia.setVisible(false);
	        this.jInternalFrameDetalleFormParroquia.setSelected(false);
			
			//this.jInternalFrameDetalleFormParroquia.dispose();
			//this.jInternalFrameDetalleFormParroquia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParroquia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParroquia.setVisible(true);
	        this.jInternalFrameReporteDinamicoParroquia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParroquia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParroquia.setVisible(true);
	        this.jInternalFrameImportacionParroquia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParroquia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParroquia.setVisible(true);
	        this.jInternalFrameOrderByParroquia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParroquia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParroquia.setVisible(false);
	        this.jInternalFrameOrderByParroquia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParroquia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParroquia.setVisible(false);
	        this.jInternalFrameReporteDinamicoParroquia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParroquia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParroquia.setVisible(false);
	        this.jInternalFrameImportacionParroquia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParroquia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParroquia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParroquia(true);
			//this.isEsNuevoParroquia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParroquia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParroquia(false) ;
			
			if(parroquiaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParroquia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParroquia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParroquiaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParroquia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParroquia(true);
			//this.isEsNuevoParroquia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parroquia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParroquia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParroquia(false) ;
			
			if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParroquia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParroquia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCanton(List<Canton> cantonsForeignKey)throws Exception{
		TableColumn tableColumnCanton=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquia,ParroquiaConstantesFunciones.LABEL_IDCANTON));
		TableCellEditor tableCellEditorCanton =tableColumnCanton.getCellEditor();

		CantonTableCell cantonTableCellFk=(CantonTableCell)tableCellEditorCanton;

		if(cantonTableCellFk!=null) {
			cantonTableCellFk.setcantonsForeignKey(cantonsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParroquia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cantonTableCellFk.setRowActual(intSelectedRow);
			//cantonTableCellFk.setcantonsForeignKeyActual(cantonsForeignKey);
		//}


		if(cantonTableCellFk!=null) {
			cantonTableCellFk.RecargarCantonsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParroquia(false);
			
			//if(!this.isEsNuevoParroquia) {								
				int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
				
			}
			
			if(this.permiteMantenimiento(this.parroquia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParroquia=true;
					this.inicializarActualizarBindingTablaParroquia(false);
					this.isEsNuevoParroquia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParroquia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParroquia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParroquia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParroquia(false);
				
				this.habilitarDeshabilitarControlesParroquia(false);
			
												
				
				if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParroquia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParroquiaActionPerformed(evt,parroquiaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParroquia(this.parroquia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParroquia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parroquiaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parroquia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParroquiaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				this.parroquia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				this.parroquia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parroquia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParroquiaModel) this.jTableDatosParroquia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParroquia=true;
				this.inicializarActualizarBindingTablaParroquia(false);
				this.isEsNuevoParroquia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParroquia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParroquia(false);
				
				this.habilitarDeshabilitarControlesParroquia(false);
				
				
				
				if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParroquia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParroquiaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParroquia.getRowCount()>=1) {
				jTableDatosParroquia.removeRowSelectionInterval(0, jTableDatosParroquia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParroquia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParroquia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParroquia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParroquia(false) ;
			
			this.isEsNuevoParroquia=false;
			
			if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParroquia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParroquiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParroquia(false);
				
				//SI ES MANUAL
				if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParroquia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParroquiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParroquia--;			
			//Parroquia parroquiaAux= new Parroquia();			
			//parroquiaAux.setId(this.iIdNuevoParroquia);
			
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParroquia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
			
			this.parroquia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parroquiaLogic.getParroquias().add(this.parroquiaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parroquias.add(this.parroquiaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParroquia(false);
			
			this.jTableDatosParroquia.setRowSelectionInterval(this.getIndiceNuevoParroquia(), this.getIndiceNuevoParroquia());
			
			int iLastRow =  this.jTableDatosParroquia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParroquia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParroquia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParroquia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParroquiaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParroquia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParroquia(false);
			
			//SI ES MANUAL
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParroquia();
			}
			
			//this.abrirFrameTreeParroquia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParroquiaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ParroquiaS ?", "MANTENIMIENTO DE Parroquia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParroquia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParroquia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parroquiaReturnGeneral=parroquiaLogic.procesarImportacionParroquiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parroquiaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParroquiaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParroquiaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParroquia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParroquia.setFileImportacion(this.jInternalFrameImportacionParroquia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParroquia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParroquia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParroquia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParroquia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParroquiaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		

		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParroquiaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParroquiaBaseDesign.jrxml";
			
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
			
			this.generarReporteParroquias("Todos",parroquiasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParroquiaConstantesFunciones.LABEL_IDCANTON:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Canton_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Canton_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Canton_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Canton_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParroquiaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParroquiaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParroquiaConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParroquia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParroquia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParroquiaConstantesFunciones.LABEL_IDCANTON:
					sNombreCampoCategoria="id_canton";
					break;

				case ParroquiaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ParroquiaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ParroquiaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="es_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParroquia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParroquiaConstantesFunciones.LABEL_IDCANTON:
					sNombreCampoCategoriaValor="id_canton";
					break;

				case ParroquiaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ParroquiaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ParroquiaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="es_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParroquia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParroquia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParroquiaConstantesFunciones.LABEL_IDCANTON:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Canton",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_canton");
					break;

				case ParroquiaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ParroquiaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ParroquiaConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoParroquiaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parroquia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Parroquias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParroquiaConstantesFunciones.LABEL_IDCANTON:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParroquiaConstantesFunciones.LABEL_IDCANTON);
					iRow++;

					for(Parroquia parroquia:parroquiasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parroquia.getcanton_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParroquiaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParroquiaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Parroquia parroquia:parroquiasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parroquia.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParroquiaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParroquiaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Parroquia parroquia:parroquiasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parroquia.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParroquiaConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParroquiaConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(Parroquia parroquia:parroquiasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parroquia.getes_activo());
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
			//	this.getFilaCabeceraExportarExcelParroquia(row);				
			//	iRow++;
			//}				
			
			//for(Parroquia parroquiaAux:parroquiasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParroquia(parroquiaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
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
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParroquia(false);
			
			//SI ES MANUAL
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParroquia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParroquiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParroquia(false);
			
			//SI ES MANUAL
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParroquia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParroquiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParroquia(false);
			
			//SI ES MANUAL
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParroquia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParroquia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParroquia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParroquia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParroquia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParroquia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParroquia.setMinimumSize(dimensionMinimum);
		this.jTableDatosParroquia.setMaximumSize(dimensionMaximum);
		this.jTableDatosParroquia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParroquia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParroquia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParroquia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParroquia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParroquia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParroquia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParroquia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParroquia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParroquiaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParroquia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParroquia();
		
		this.inicializarActualizarBindingBotonesManualParroquia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParroquia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParroquia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParroquia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParroquia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParroquia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParroquia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParroquia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParroquia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParroquia.jCheckBoxPostAccionNuevoParroquia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParroquia.jCheckBoxPostAccionSinCerrarParroquia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParroquia.jCheckBoxPostAccionSinMensajeParroquia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParroquia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParroquia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParroquia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParroquia!=null) {
				this.jInternalFrameDetalleFormParroquia.jCheckBoxPostAccionNuevoParroquia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParroquia.jCheckBoxPostAccionSinCerrarParroquia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParroquia.jCheckBoxPostAccionSinMensajeParroquia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParroquia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParroquia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParroquia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParroquia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParroquia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParroquia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParroquia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParroquia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParroquia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParroquia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParroquia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParroquia(Boolean esInicializar) throws Exception {
		try	{	
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParroquia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParroquia() throws Exception {
		try	{
			if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParroquia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParroquia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParroquia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParroquia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParroquia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParroquia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParroquia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParroquia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParroquia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParroquia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParroquia.addItem(reporte);
			}
			
			
			if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParroquia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParroquia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParroquia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParroquia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParroquia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParroquia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParroquia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParroquia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParroquia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParroquia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParroquia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParroquia!=null) {
				this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParroquia!=null) {
				this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParroquia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParroquia!=null) {
				
				if(this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParroquia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParroquia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParroquia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParroquia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParroquia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cantonFK_IdCantonParroquia.getSelectedItem()!=null){this.id_cantonFK_IdCanton=((Canton)this.jComboBoxid_cantonFK_IdCantonParroquia.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParroquia(Boolean esInicializar) throws Exception {				
		if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParroquia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParroquia() throws Exception {
		this.inicializarActualizarBindingTablaParroquia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParroquia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParroquiaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquiaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParroquia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parroquiaLogic.getParroquias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parroquias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParroquia.setModel(new ParroquiaModel(this.parroquiaLogic.getParroquias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParroquia.setModel(new ParroquiaModel(this.parroquias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParroquia!=null && this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParroquia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParroquiaConstantesFunciones.SCLASSWEBTITULO,parroquiaConstantesFunciones.resaltarSeleccionarParroquia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParroquiaConstantesFunciones.SCLASSWEBTITULO,parroquiaConstantesFunciones.resaltarSeleccionarParroquia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquia,ParroquiaConstantesFunciones.LABEL_ID));

		if(this.parroquiaConstantesFunciones.mostraridParroquia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParroquiaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parroquiaConstantesFunciones.resaltaridParroquia,this.parroquiaConstantesFunciones.activaridParroquia,this,true,"idParroquia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parroquiaConstantesFunciones.resaltaridParroquia,this.parroquiaConstantesFunciones.activaridParroquia,this,true,"idParroquia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquia,ParroquiaConstantesFunciones.LABEL_IDCANTON));

		if(this.parroquiaConstantesFunciones.mostrarid_cantonParroquia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParroquiaConstantesFunciones.LABEL_IDCANTON,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CantonTableCell(this.cantonsForeignKey,this.parroquiaConstantesFunciones.resaltarid_cantonParroquia,this,this.parroquiaConstantesFunciones.activarid_cantonParroquia));
			tableColumn.setCellEditor(new CantonTableCell(this.cantonsForeignKey,this.parroquiaConstantesFunciones.resaltarid_cantonParroquia,this,this.parroquiaConstantesFunciones.activarid_cantonParroquia,true,"id_cantonParroquia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquia,ParroquiaConstantesFunciones.LABEL_CODIGO));

		if(this.parroquiaConstantesFunciones.mostrarcodigoParroquia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParroquiaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parroquiaConstantesFunciones.resaltarcodigoParroquia,this.parroquiaConstantesFunciones.activarcodigoParroquia,this,true,"codigoParroquia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parroquiaConstantesFunciones.resaltarcodigoParroquia,this.parroquiaConstantesFunciones.activarcodigoParroquia,this,true,"codigoParroquia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquia,ParroquiaConstantesFunciones.LABEL_NOMBRE));

		if(this.parroquiaConstantesFunciones.mostrarnombreParroquia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParroquiaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parroquiaConstantesFunciones.resaltarnombreParroquia,this.parroquiaConstantesFunciones.activarnombreParroquia,this,true,"nombreParroquia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parroquiaConstantesFunciones.resaltarnombreParroquia,this.parroquiaConstantesFunciones.activarnombreParroquia,this,true,"nombreParroquia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParroquia,ParroquiaConstantesFunciones.LABEL_ESACTIVO));

		if(this.parroquiaConstantesFunciones.mostrares_activoParroquia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParroquiaConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parroquiaConstantesFunciones.resaltares_activoParroquia,this.parroquiaConstantesFunciones.activares_activoParroquia));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parroquiaConstantesFunciones.resaltares_activoParroquia,this.parroquiaConstantesFunciones.activares_activoParroquia,this,true,"es_activoParroquia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParroquiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parroquiaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parroquiaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParroquia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parroquiaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parroquiaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParroquia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParroquia && this.isPermisoGuardarCambiosParroquia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parroquiaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parroquiaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParroquia.addColumn(tableColumn);
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
			
			this.jTableDatosParroquia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParroquia && this.isPermisoGuardarCambiosParroquia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParroquia && this.isPermisoGuardarCambiosParroquia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParroquia.moveColumn(this.jTableDatosParroquia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParroquia.moveColumn(this.jTableDatosParroquia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParroquia.moveColumn(this.jTableDatosParroquia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParroquia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParroquia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParroquia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParroquia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParroquia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParroquia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParroquia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParroquia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parroquiaLogic.getParroquias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parroquias.size()-1;
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
		//this.jTableDatosParroquia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParroquia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParroquia();
			
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
				
				//this.isEsNuevoParroquia=false;
					
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
				if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParroquia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParroquia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParroquia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parroquia.getsType().equals("DUPLICADO")
				   || this.parroquia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParroquia=true;
				
				} else {
					this.isEsNuevoParroquia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
					if(this.parroquia.getId()>=0 && !this.parroquia.getIsNew()) {						
						this.isEsNuevoParroquia=false;
						
					} else {
						this.isEsNuevoParroquia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParroquia(esRelaciones);						
				
				this.seleccionarParroquia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parroquia.getId()<0) {
					this.isEsNuevoParroquia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParroquia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParroquia(evt,rowIndex);
				}	
				
				if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Parroquia: " + this.dDif); 
					}
				}								
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParroquia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parroquia)) {
					if(this.parroquia.getId()>0) {
						this.parroquia.setIsDeleted(true);
						
						this.parroquiasEliminados.add(this.parroquia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parroquiaLogic.getParroquias().remove(this.parroquia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parroquias.remove(this.parroquia);				
					}
					
					
					((ParroquiaModel) this.jTableDatosParroquia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParroquia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParroquia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParroquia) {
			
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParroquia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParroquia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParroquia(this.parroquia);
				}
				
				//ARCHITECTURE
				try {
					

					//Canton
					if(!this.parroquiaConstantesFunciones.cargarid_cantonParroquia || this.parroquiaConstantesFunciones.event_dependid_cantonParroquia) {
						//this.cargarCombosCantonsForeignKeyLista(" where id="+this.parroquia.getid_canton());
									//this.inicializarActualizarBindingParroquia(false,false);
						this.cantonsForeignKey=new ArrayList<Canton>();

						if(parroquia.getCanton()!=null) {
							this.cantonsForeignKey.add(parroquia.getCanton());
						}

						this.addItemDefectoCombosForeignKeyCanton();
						this.cargarCombosFrameCantonsForeignKey("Todos");
					}
					this.setActualCantonForeignKey(this.parroquia.getid_canton(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParroquia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParroquia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParroquia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParroquia(Parroquia parroquia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParroquia(parroquia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParroquia(Parroquia parroquia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParroquia(parroquia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParroquia(parroquia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParroquia(parroquia);
	}
	
	public void setVariablesObjetoActualToFormularioParroquia(Parroquia parroquia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.setText(parroquia.getId().toString());
			this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.setText(parroquia.getcodigo());
			this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.setText(parroquia.getnombre());
			this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setSelected(parroquia.getes_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Parroquia parroquiaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parroquiaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Parroquia parroquiaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parroquiaLocal=this.parroquia;
			} else {
				parroquiaLocal=this.parroquiaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parroquiaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParroquia(parroquiaLocal,true);
					
					if(parroquiaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parroquiaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parroquiaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParroquia(Parroquia parroquia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParroquia(parroquia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParroquia(parroquia);
	}
	
	public void setVariablesFormularioToObjetoActualParroquia(Parroquia parroquia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParroquia(parroquia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParroquia(Parroquia parroquia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.getText()==null || this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.getText()=="" || this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.getText()=="Id") {
				this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.setText("0");
			}

			if(conColumnasBase) {parroquia.setId(Long.parseLong(this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParroquiaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabelIdParroquia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parroquia.setcodigo(this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParroquiaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabelcodigoParroquia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parroquia.setnombre(this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParroquiaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabelnombreParroquia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parroquia.setes_activo(this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParroquiaConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParroquia.jLabeles_activoParroquia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParroquia(Parroquia parroquiaBean,Parroquia parroquia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parroquiaBean.getid_canton()!=null && !parroquiaBean.getid_canton().equals(-1L))) {parroquia.setid_canton(parroquiaBean.getid_canton());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParroquia(Parroquia parroquiaOrigen,Parroquia parroquia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parroquiaOrigen.getId()!=null && !parroquiaOrigen.getId().equals(0L))) {parroquia.setId(parroquiaOrigen.getId());}}
			if(conDefault || (!conDefault && parroquiaOrigen.getid_canton()!=null && !parroquiaOrigen.getid_canton().equals(-1L))) {parroquia.setid_canton(parroquiaOrigen.getid_canton());}
			if(conDefault || (!conDefault && parroquiaOrigen.getcodigo()!=null && !parroquiaOrigen.getcodigo().equals(""))) {parroquia.setcodigo(parroquiaOrigen.getcodigo());}
			if(conDefault || (!conDefault && parroquiaOrigen.getnombre()!=null && !parroquiaOrigen.getnombre().equals(""))) {parroquia.setnombre(parroquiaOrigen.getnombre());}
			if(conDefault || (!conDefault && parroquiaOrigen.getes_activo()!=null && !parroquiaOrigen.getes_activo().equals(false))) {parroquia.setes_activo(parroquiaOrigen.getes_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParroquia(Parroquia parroquia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.setText(parroquia.getId().toString());
			this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.setText(parroquia.getcodigo());
			this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.setText(parroquia.getnombre());
			this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setSelected(parroquia.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParroquia(ParroquiaBean parroquiaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.setText(parroquiaBean.getId().toString());
			this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.setText(parroquiaBean.getcodigo());
			this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.setText(parroquiaBean.getnombre());
			this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setSelected(parroquiaBean.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParroquia(ParroquiaParameterReturnGeneral parroquiaReturnGeneral,ParroquiaBean parroquiaBean,Boolean conDefault) throws Exception { 
		try {
			Parroquia parroquiaLocal=new Parroquia();
			
			parroquiaLocal=parroquiaReturnGeneral.getParroquia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parroquiaLocal.getId()!=null && !parroquiaLocal.getId().equals(0L))) {parroquiaBean.setId(parroquiaLocal.getId());}}
			if(conDefault || (!conDefault && parroquiaLocal.getid_canton()!=null && !parroquiaLocal.getid_canton().equals(-1L))) {parroquiaBean.setid_canton(parroquiaLocal.getid_canton());}
			if(conDefault || (!conDefault && parroquiaLocal.getcodigo()!=null && !parroquiaLocal.getcodigo().equals(""))) {parroquiaBean.setcodigo(parroquiaLocal.getcodigo());}
			if(conDefault || (!conDefault && parroquiaLocal.getnombre()!=null && !parroquiaLocal.getnombre().equals(""))) {parroquiaBean.setnombre(parroquiaLocal.getnombre());}
			if(conDefault || (!conDefault && parroquiaLocal.getes_activo()!=null && !parroquiaLocal.getes_activo().equals(false))) {parroquiaBean.setes_activo(parroquiaLocal.getes_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParroquiaGenerico(Long idParroquiaSeleccionado,JComboBox jComboBoxParroquia,List<Parroquia> parroquiasLocal)throws Exception {
		try {
			Parroquia  parroquiaTemp=null;

			for(Parroquia parroquiaAux:parroquiasLocal) {
				if(parroquiaAux.getId()!=null && parroquiaAux.getId().equals(idParroquiaSeleccionado)) {
					parroquiaTemp=parroquiaAux;
					break;
				}
			}

			jComboBoxParroquia.setSelectedItem(parroquiaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParroquiaGenerico(JComboBox jComboBoxParroquia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParroquia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParroquia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParroquia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParroquia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parroquia=(Parroquia) parroquiaLogic.getParroquias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parroquia =(Parroquia) parroquias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Canton")) {
			//sDescripcion=this.getActualCantonForeignKeyDescripcion((Long)value);
			if(!parroquia.getIsNew() && !parroquia.getIsChanged() && !parroquia.getIsDeleted()) {
				sDescripcion=parroquia.getcanton_descripcion();
			} else {
				//sDescripcion=this.getActualCantonForeignKeyDescripcion((Long)value);
				sDescripcion=parroquia.getcanton_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Parroquia parroquiaRow=new Parroquia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parroquiaRow=(Parroquia) parroquiaLogic.getParroquias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parroquiaRow=(Parroquia) parroquias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParroquia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParroquia.setVisible((this.isVisibilidadCeldaNuevoParroquia && this.isPermisoNuevoParroquia));			
			this.jButtonDuplicarParroquia.setVisible((this.isVisibilidadCeldaDuplicarParroquia && this.isPermisoDuplicarParroquia));			
			this.jButtonCopiarParroquia.setVisible((this.isVisibilidadCeldaCopiarParroquia && this.isPermisoCopiarParroquia));
			this.jButtonVerFormParroquia.setVisible((this.isVisibilidadCeldaVerFormParroquia && this.isPermisoVerFormParroquia));
			
			this.jButtonAbrirOrderByParroquia.setVisible((this.isVisibilidadCeldaOrdenParroquia && this.isPermisoOrdenParroquia));			
			
			this.jButtonNuevoRelacionesParroquia.setVisible((this.isVisibilidadCeldaNuevoRelacionesParroquia && this.isPermisoNuevoParroquia));			
			this.jButtonNuevoGuardarCambiosParroquia.setVisible((this.isVisibilidadCeldaNuevoParroquia && this.isPermisoNuevoParroquia && this.isPermisoGuardarCambiosParroquia));
			
			if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.jInternalFrameDetalleFormParroquia.jButtonModificarParroquia.setVisible((this.isVisibilidadCeldaModificarParroquia && this.isPermisoActualizarParroquia));	
			this.jInternalFrameDetalleFormParroquia.jButtonActualizarParroquia.setVisible((this.isVisibilidadCeldaActualizarParroquia && this.isPermisoActualizarParroquia));	
			this.jInternalFrameDetalleFormParroquia.jButtonEliminarParroquia.setVisible((this.isVisibilidadCeldaEliminarParroquia && this.isPermisoEliminarParroquia));
			this.jInternalFrameDetalleFormParroquia.jButtonCancelarParroquia.setVisible(this.isVisibilidadCeldaCancelarParroquia);							
			this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.setVisible((this.isVisibilidadCeldaGuardarParroquia && this.isPermisoGuardarCambiosParroquia));			
			
			}
						
			this.jButtonGuardarCambiosTablaParroquia.setVisible((this.isVisibilidadCeldaGuardarCambiosParroquia && this.isPermisoGuardarCambiosParroquia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParroquia.setVisible((this.isVisibilidadCeldaNuevoParroquia && this.isPermisoNuevoParroquia));						
			this.jButtonDuplicarToolBarParroquia.setVisible((this.isVisibilidadCeldaDuplicarParroquia && this.isPermisoDuplicarParroquia));						
			this.jButtonCopiarToolBarParroquia.setVisible((this.isVisibilidadCeldaCopiarParroquia && this.isPermisoCopiarParroquia));			
			this.jButtonVerFormToolBarParroquia.setVisible((this.isVisibilidadCeldaVerFormParroquia && this.isPermisoVerFormParroquia));			
			this.jButtonAbrirOrderByToolBarParroquia.setVisible((this.isVisibilidadCeldaOrdenParroquia && this.isPermisoOrdenParroquia));
			this.jButtonNuevoRelacionesToolBarParroquia.setVisible((this.isVisibilidadCeldaNuevoRelacionesParroquia && this.isPermisoNuevoParroquia));			
			this.jButtonNuevoGuardarCambiosToolBarParroquia.setVisible((this.isVisibilidadCeldaNuevoParroquia && this.isPermisoNuevoParroquia && this.isPermisoGuardarCambiosParroquia));			
			
			if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.jInternalFrameDetalleFormParroquia.jButtonModificarToolBarParroquia.setVisible((this.isVisibilidadCeldaModificarParroquia && this.isPermisoActualizarParroquia));	
			this.jInternalFrameDetalleFormParroquia.jButtonActualizarToolBarParroquia.setVisible((this.isVisibilidadCeldaActualizarParroquia  && this.isPermisoActualizarParroquia));	
			this.jInternalFrameDetalleFormParroquia.jButtonEliminarToolBarParroquia.setVisible((this.isVisibilidadCeldaEliminarParroquia && this.isPermisoEliminarParroquia));
			this.jInternalFrameDetalleFormParroquia.jButtonCancelarToolBarParroquia.setVisible(this.isVisibilidadCeldaCancelarParroquia);				
			this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosToolBarParroquia.setVisible((this.isVisibilidadCeldaGuardarParroquia && this.isPermisoGuardarCambiosParroquia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParroquia.setVisible((this.isVisibilidadCeldaGuardarCambiosParroquia && this.isPermisoGuardarCambiosParroquia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParroquia.setVisible((this.isVisibilidadCeldaNuevoParroquia && this.isPermisoNuevoParroquia));			
			this.jMenuItemDuplicarParroquia.setVisible((this.isVisibilidadCeldaDuplicarParroquia && this.isPermisoDuplicarParroquia));			
			this.jMenuItemCopiarParroquia.setVisible((this.isVisibilidadCeldaCopiarParroquia && this.isPermisoCopiarParroquia));			
			this.jMenuItemVerFormParroquia.setVisible((this.isVisibilidadCeldaVerFormParroquia && this.isPermisoVerFormParroquia));			
			this.jMenuItemAbrirOrderByParroquia.setVisible((this.isVisibilidadCeldaOrdenParroquia && this.isPermisoOrdenParroquia));			
			//this.jMenuItemMostrarOcultarParroquia.setVisible((this.isVisibilidadCeldaOrdenParroquia && this.isPermisoOrdenParroquia));
			this.jMenuItemDetalleAbrirOrderByParroquia.setVisible((this.isVisibilidadCeldaOrdenParroquia && this.isPermisoOrdenParroquia));			
			//this.jMenuItemDetalleMostrarOcultarParroquia.setVisible((this.isVisibilidadCeldaOrdenParroquia && this.isPermisoOrdenParroquia));			
			this.jMenuItemNuevoRelacionesParroquia.setVisible((this.isVisibilidadCeldaNuevoRelacionesParroquia && this.isPermisoNuevoParroquia));			
			this.jMenuItemNuevoGuardarCambiosParroquia.setVisible((this.isVisibilidadCeldaNuevoParroquia && this.isPermisoNuevoParroquia && this.isPermisoGuardarCambiosParroquia));									
			
			if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.jInternalFrameDetalleFormParroquia.jMenuItemModificarParroquia.setVisible((this.isVisibilidadCeldaModificarParroquia && this.isPermisoActualizarParroquia));	
			this.jInternalFrameDetalleFormParroquia.jMenuItemActualizarParroquia.setVisible((this.isVisibilidadCeldaActualizarParroquia && this.isPermisoActualizarParroquia));	
			this.jInternalFrameDetalleFormParroquia.jMenuItemEliminarParroquia.setVisible((this.isVisibilidadCeldaEliminarParroquia && this.isPermisoEliminarParroquia));
			this.jInternalFrameDetalleFormParroquia.jMenuItemCancelarParroquia.setVisible(this.isVisibilidadCeldaCancelarParroquia);				
			}
			
			this.jMenuItemGuardarCambiosParroquia.setVisible((this.isVisibilidadCeldaGuardarParroquia && this.isPermisoGuardarCambiosParroquia));						
			this.jMenuItemGuardarCambiosTablaParroquia.setVisible((this.isVisibilidadCeldaGuardarCambiosParroquia && this.isPermisoGuardarCambiosParroquia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParroquia=this.jButtonNuevoParroquia.isVisible();
			this.isVisibilidadCeldaDuplicarParroquia=this.jButtonDuplicarParroquia.isVisible();
			this.isVisibilidadCeldaCopiarParroquia=this.jButtonCopiarParroquia.isVisible();
			this.isVisibilidadCeldaVerFormParroquia=this.jButtonVerFormParroquia.isVisible();
			
			this.isVisibilidadCeldaOrdenParroquia=this.jButtonAbrirOrderByParroquia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParroquia=this.jButtonNuevoRelacionesParroquia.isVisible();
			this.isVisibilidadCeldaModificarParroquia=this.jButtonModificarParroquia.isVisible();
			
			if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.isVisibilidadCeldaActualizarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonActualizarParroquia.isVisible();
			this.isVisibilidadCeldaEliminarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonEliminarParroquia.isVisible();
			this.isVisibilidadCeldaCancelarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonCancelarParroquia.isVisible();
			this.isVisibilidadCeldaGuardarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParroquia=this.jButtonGuardarCambiosTablaParroquia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParroquia=this.jButtonNuevoToolBarParroquia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParroquia=this.jButtonNuevoRelacionesToolBarParroquia.isVisible();
			
			if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.isVisibilidadCeldaModificarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonModificarToolBarParroquia.isVisible();
			this.isVisibilidadCeldaActualizarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonActualizarToolBarParroquia.isVisible();
			this.isVisibilidadCeldaEliminarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonEliminarToolBarParroquia.isVisible();
			this.isVisibilidadCeldaCancelarParroquia=this.jInternalFrameDetalleFormParroquia.jButtonCancelarToolBarParroquia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParroquia=this.jButtonGuardarCambiosToolBarParroquia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParroquia=this.jButtonGuardarCambiosTablaToolBarParroquia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParroquia=this.jMenuItemNuevoParroquia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParroquia=this.jMenuItemNuevoRelacionesParroquia.isVisible();
			
			if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.isVisibilidadCeldaModificarParroquia=this.jInternalFrameDetalleFormParroquia.jMenuItemModificarParroquia.isVisible();
			this.isVisibilidadCeldaActualizarParroquia=this.jInternalFrameDetalleFormParroquia.jMenuItemActualizarParroquia.isVisible();
			this.isVisibilidadCeldaEliminarParroquia=this.jInternalFrameDetalleFormParroquia.jMenuItemEliminarParroquia.isVisible();
			this.isVisibilidadCeldaCancelarParroquia=this.jInternalFrameDetalleFormParroquia.jMenuItemCancelarParroquia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParroquia=this.jMenuItemGuardarCambiosParroquia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParroquia=this.jMenuItemGuardarCambiosTablaParroquia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParroquia(Boolean esInicializar) {
		if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
				//if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParroquia();
			}
			
			this.inicializarActualizarBindingBotonesManualParroquia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParroquia() {
		this.jButtonNuevoParroquia.setVisible(this.isPermisoNuevoParroquia);			
		this.jButtonDuplicarParroquia.setVisible(this.isPermisoDuplicarParroquia);			
		this.jButtonCopiarParroquia.setVisible(this.isPermisoCopiarParroquia);			
		this.jButtonVerFormParroquia.setVisible(this.isPermisoVerFormParroquia);			
		
		this.jButtonAbrirOrderByParroquia.setVisible(this.isPermisoOrdenParroquia);					
		
		this.jButtonNuevoRelacionesParroquia.setVisible(this.isPermisoNuevoParroquia);			
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonModificarParroquia.setVisible(this.isPermisoActualizarParroquia);	
			this.jInternalFrameDetalleFormParroquia.jButtonActualizarParroquia.setVisible(this.isPermisoActualizarParroquia);	
			this.jInternalFrameDetalleFormParroquia.jButtonEliminarParroquia.setVisible(this.isPermisoEliminarParroquia);
			this.jInternalFrameDetalleFormParroquia.jButtonCancelarParroquia.setVisible(this.isVisibilidadCeldaCancelarParroquia);						
			this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.setVisible(this.isPermisoGuardarCambiosParroquia);							
		}
		
		this.jButtonGuardarCambiosTablaParroquia.setVisible(this.isPermisoActualizarParroquia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParroquia() {
		this.jInternalFrameDetalleFormParroquia.jButtonModificarParroquia.setVisible(this.isPermisoActualizarParroquia);	
		this.jInternalFrameDetalleFormParroquia.jButtonActualizarParroquia.setVisible(this.isPermisoActualizarParroquia);	
		this.jInternalFrameDetalleFormParroquia.jButtonEliminarParroquia.setVisible(this.isPermisoEliminarParroquia);
		this.jInternalFrameDetalleFormParroquia.jButtonCancelarParroquia.setVisible(this.isVisibilidadCeldaCancelarParroquia);							
		this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.setVisible((this.isVisibilidadCeldaGuardarParroquia && this.isPermisoGuardarCambiosParroquia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParroquia() {
		if(ParroquiaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParroquia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParroquia() {
	}
	
	public void jTableDatosParroquiaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParroquia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParroquiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParroquia(this.getparroquia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parroquia==null) {
						this.parroquia = new Parroquia();
					}

					this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
				}

				if(this.parroquia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parroquia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParroquia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cantonParroquiaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocanton=true;

			idTienePermisocanton=this.tienePermisosUsuarioEnPaginaWebParroquia(CantonConstantesFunciones.CLASSNAME);

			if(idTienePermisocanton) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParroquia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParroquia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParroquia(this.getparroquia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);

				this.cantonBeanSwingJInternalFrame=new CantonBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cantonBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cantonBeanSwingJInternalFrame.getCantonLogic().setConnexion(this.parroquiaLogic.getConnexion());

				if(this.parroquia.getid_canton()!=null) {
					this.cantonBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cantonBeanSwingJInternalFrame.setIdActual(this.parroquia.getid_canton());
					this.cantonBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cantonBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cantonBeanSwingJInternalFrame.inicializarActualizarBindingTablaCanton();
				}

				JInternalFrameBase jinternalFrame =this.cantonBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParroquia=(TitledBorder)this.jScrollPanelDatosParroquia.getBorder();
				TitledBorder titledBordercanton=(TitledBorder)this.cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.getBorder();

				titledBordercanton.setTitle(titledBorderParroquia.getTitle() + " -> Canton");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cantonParroquiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParroquia(this.getparroquia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parroquia==null) {
						this.parroquia = new Parroquia();
					}

					this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
				}

				if(this.parroquia.getid_canton()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_canton = "+this.parroquia.getid_canton().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParroquia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoParroquiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParroquia(this.getparroquia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parroquia==null) {
						this.parroquia = new Parroquia();
					}

					this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
				}

				if(this.parroquia.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.parroquia.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParroquia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreParroquiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParroquia(this.getparroquia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parroquia==null) {
						this.parroquia = new Parroquia();
					}

					this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
				}

				if(this.parroquia.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.parroquia.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParroquia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_activoParroquiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParroquia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParroquia(this.getparroquia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parroquia==null) {
						this.parroquia = new Parroquia();
					}

					this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);
				}

				if(this.parroquia.getes_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_activo = "+this.parroquia.getes_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParroquia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCantonParroquiaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParroquia(false,false);

			this.getParroquiasFK_IdCanton();

			this.inicializarActualizarBindingParroquia(false);

			//if(ParroquiaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParroquia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parroquiaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParroquia() {
		if(this.jInternalFrameDetalleFormParroquia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
			this.jInternalFrameDetalleFormParroquia.setVisible(false);	    			
			this.jInternalFrameDetalleFormParroquia.dispose();
			this.jInternalFrameDetalleFormParroquia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParroquia!=null) {
			this.jInternalFrameReporteDinamicoParroquia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParroquia.dispose();
			this.jInternalFrameReporteDinamicoParroquia=null;
		}
		
		if(this.jInternalFrameImportacionParroquia!=null) {
			this.jInternalFrameImportacionParroquia.setVisible(false);	    			
			this.jInternalFrameImportacionParroquia.dispose();
			this.jInternalFrameImportacionParroquia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParroquia();
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
			
			if(sTipo.equals("NuevoParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParroquia")) {
				jButtonDuplicarParroquiaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParroquia")) {
				jButtonCopiarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("VerFormParroquia")) {
				jButtonVerFormParroquiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParroquia")) {
				jButtonDuplicarParroquiaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParroquia")) {
				jButtonDuplicarParroquiaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParroquia")) {
				jButtonModificarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParroquia")) {
				jButtonModificarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParroquia")) {
				jButtonModificarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParroquia")) {
				jButtonActualizarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParroquia")) {
				jButtonActualizarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParroquia")) {
				jButtonActualizarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("EliminarParroquia")) {
				jButtonEliminarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParroquia")) {
				jButtonEliminarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParroquia")) {
				jButtonEliminarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("CancelarParroquia")) {
				jButtonCancelarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParroquia")) {
				jButtonCancelarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParroquia")) {
				jButtonCancelarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("CerrarParroquia")) {
				jButtonCerrarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParroquia")) {
				jButtonCerrarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParroquia")) {
				jButtonCerrarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParroquia")) {
				jButtonMostrarOcultarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParroquia")) {
				jButtonCancelarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParroquia")) {
				jButtonCopiarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParroquia")) {
				jButtonVerFormParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParroquia")) {
				jButtonCopiarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParroquia")) {
				jButtonVerFormParroquiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParroquia")) {
				jButtonRecargarInformacionParroquiaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParroquia")) {
				jButtonRecargarInformacionParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParroquia")) {
				jButtonRecargarInformacionParroquiaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParroquia")) {
				jButtonAnterioresParroquiaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParroquia")) {
				jButtonAnterioresParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParroquia")) {
				jButtonAnterioresParroquiaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParroquia")) {
				jButtonSiguientesParroquiaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParroquia")) {
				jButtonSiguientesParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParroquia")) {
				jButtonSiguientesParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParroquia") || sTipo.equals("MenuItemDetalleAbrirOrderByParroquia")) {
				jButtonAbrirOrderByParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParroquia") || sTipo.equals("MenuItemDetalleMostrarOcultarParroquia")) {
				jButtonMostrarOcultarParroquiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParroquia")) {
				jButtonNuevoGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParroquia")) {
				jButtonNuevoGuardarCambiosParroquiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParroquia")) {
				jButtonNuevoGuardarCambiosParroquiaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParroquia")) {
				jButtonCerrarReporteDinamicoParroquiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParroquia")) {
				jButtonGenerarReporteDinamicoParroquiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParroquia")) {
				
				jButtonGenerarExcelReporteDinamicoParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParroquia")) {
				jButtonCerrarImportacionParroquiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParroquia")) {
				
				jButtonGenerarImportacionParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParroquia")) {
				
				jButtonAbrirImportacionParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParroquia")) {
				jComboBoxTiposAccionesParroquiaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParroquia")) {
				jComboBoxTiposRelacionesParroquiaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParroquia")) {
				jComboBoxTiposAccionesParroquiaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParroquia")) {
				
				jComboBoxTiposSeleccionarParroquiaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParroquia")) {
				jTextFieldValorCampoGeneralParroquiaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParroquia")) {
				jButtonAbrirOrderByParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParroquia")) {
				jButtonAbrirOrderByParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParroquia")) {
				jButtonCerrarOrderByParroquiaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParroquiaBusqueda")) {
				this.jButtonidParroquiaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cantonParroquiaUpdate")) {
				this.jButtonid_cantonParroquiaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cantonParroquiaBusqueda")) {
				this.jButtonid_cantonParroquiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParroquiaBusqueda")) {
				this.jButtoncodigoParroquiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParroquiaBusqueda")) {
				this.jButtonnombreParroquiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoParroquiaBusqueda")) {
				this.jButtones_activoParroquiaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCantonParroquia")) {
				this.jButtonFK_IdCantonParroquiaActionPerformed(evt);
			}
			
			;
			
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParroquia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParroquiaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Parroquia parroquiaLocal=null;
			
			if(!this.getEsControlTabla()) {
				parroquiaLocal=this.parroquia;
			} else {
				parroquiaLocal=this.parroquiaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
							
				
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaAnterior =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquiaAnterior =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
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
			
			


			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParroquiaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
								
						
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
								
				
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaAnterior =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquiaAnterior =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaAnterior =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquiaAnterior =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
							
				
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParroquiaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parroquiaAnterior =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parroquiaAnterior =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
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
			
			


			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
								
				
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaAnterior =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquiaAnterior =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParroquiaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParroquia")) {
					jCheckBoxSeleccionarTodosParroquiaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParroquia")) {
					jCheckBoxSeleccionadosParroquiaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParroquia")) {
					
				}
				
				


				
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
												
				
				


				
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParroquiaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parroquiaAnterior =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parroquiaAnterior =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParroquiaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
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
			
			


			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParroquiaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parroquia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parroquia);
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
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
				
				


				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parroquia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parroquia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParroquiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parroquiaAnterior =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parroquiaAnterior =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParroquia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParroquiaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParroquia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parroquia =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parroquia =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parroquia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParroquia")) {
				
				}
				
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParroquia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParroquia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParroquia")) {
			
			}
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParroquia();
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
			if(sTipo.equals("NuevoParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParroquia")) {
				jButtonDuplicarParroquiaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParroquia")) {
				jButtonCopiarParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParroquia")) {
				jButtonVerFormParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParroquia")) {
				jButtonNuevoParroquiaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParroquia")) {
				jButtonModificarParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParroquia")) {
				jButtonActualizarParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParroquia")) {
				jButtonEliminarParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParroquia")) {
				jButtonCancelarParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParroquia")) {
				jButtonCerrarParroquiaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParroquia")) {
				jButtonGuardarCambiosParroquiaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParroquia")) {
				jButtonNuevoGuardarCambiosParroquiaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParroquia")) {
				jButtonAbrirOrderByParroquiaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParroquia")) {
				jButtonRecargarInformacionParroquiaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParroquia")) {
				jButtonAnterioresParroquiaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParroquia")) {
				jButtonSiguientesParroquiaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParroquiaBusqueda")) {
				this.jButtonidParroquiaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cantonParroquiaUpdate")) {
				this.jButtonid_cantonParroquiaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cantonParroquiaBusqueda")) {
				this.jButtonid_cantonParroquiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParroquiaBusqueda")) {
				this.jButtoncodigoParroquiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParroquiaBusqueda")) {
				this.jButtonnombreParroquiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoParroquiaBusqueda")) {
				this.jButtones_activoParroquiaBusquedaActionPerformed(evt);
			}
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParroquia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParroquia")) {
				closingInternalFrameParroquia();
				
			} else if(sTipo.equals("jButtonCancelarParroquia")) {
				JInternalFrameBase jInternalFrameDetalleFormParroquia = (JInternalFrameBase)evt.getSource();
	            	
	            ParroquiaBeanSwingJInternalFrame jInternalFrameParent=(ParroquiaBeanSwingJInternalFrame)jInternalFrameDetalleFormParroquia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParroquiaActionPerformed(null);
			}
			
			ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parroquia,new Object(),this.parroquiaParameterGeneral,this.parroquiaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParroquia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParroquia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParroquia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parroquia)) {
			if(!esControlTabla) {
				if(ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);			
				}
				
				if(this.parroquiaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParroquia(this.parroquia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parroquiaReturnGeneral=parroquiaLogic.procesarEventosParroquiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parroquiaLogic.getParroquias(),this.parroquia,this.parroquiaParameterGeneral,this.isEsNuevoParroquia,classes);//this.parroquiaLogic.getParroquia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParroquia(this.parroquiaReturnGeneral,this.parroquiaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parroquiaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParroquia(classes,this.parroquiaReturnGeneral,this.parroquiaBean,false);
					}
						
					if(this.parroquiaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParroquia(this.parroquiaReturnGeneral.getParroquia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParroquia(this.parroquiaReturnGeneral.getParroquia());	
					}
						
					if(this.parroquiaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParroquia(this.parroquiaReturnGeneral.getParroquia(),classes);//this.parroquiaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParroquia(this.parroquia,classes);//this.parroquiaBean);									
				}
			
				if(ParroquiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParroquia(this.parroquia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParroquia(this.parroquia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parroquiaAnterior!=null) {
						this.parroquia=this.parroquiaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parroquiaReturnGeneral=parroquiaLogic.procesarEventosParroquiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parroquiaLogic.getParroquias(),this.parroquia,this.parroquiaParameterGeneral,this.isEsNuevoParroquia,classes);//this.parroquiaLogic.getParroquia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parroquiaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parroquiaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parroquiaReturnGeneral.getParroquia(),parroquiaLogic.getParroquias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parroquiaReturnGeneral.getParroquia(),this.parroquias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParroquia.repaint();
				
				//((AbstractTableModel) this.jTableDatosParroquia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParroquia();
			}
		}
	}
	
	public void actualizarVisualTableDatosParroquia() throws Exception {
		
		ParroquiaModel parroquiaModel=(ParroquiaModel)this.jTableDatosParroquia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parroquiaModel.parroquias=this.parroquiaLogic.getParroquias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parroquiaModel.parroquias=this.parroquias;
		}
		
		
		((ParroquiaModel) this.jTableDatosParroquia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParroquia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparroquiaAnterior(),this.parroquiaLogic.getParroquias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparroquiaAnterior(),this.parroquias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParroquia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParroquia(Parroquia parroquia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
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
										
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parroquia,new Object(),generalEntityParameterGeneral,this.parroquiaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParroquiaConstantesFunciones.getClassesRelationshipsOfParroquia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParroquiaConstantesFunciones.getClassesRelationshipsFromStringsOfParroquia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParroquia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParroquiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parroquia,new Object(),generalEntityParameterGeneral,this.parroquiaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParroquia(ParroquiaBean parroquiaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParroquia(ArrayList<Classe> classes,ParroquiaReturnGeneral parroquiaReturnGeneral,ParroquiaBean parroquiaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParroquia(Parroquia parroquia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parroquia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParroquia = new ParroquiaDetalleFormJInternalFrame(jDesktopPane,this.parroquiaSessionBean.getConGuardarRelaciones(),this.parroquiaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParroquia);
		this.jInternalFrameDetalleFormParroquia.setVisible(false);
		this.jInternalFrameDetalleFormParroquia.setSelected(false);						
		
		this.jInternalFrameDetalleFormParroquia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParroquia.parroquiaLogic=this.parroquiaLogic;
		
		this.cargarCombosFrameForeignKeyParroquia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParroquia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParroquia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParroquia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParroquia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParroquia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParroquia"));
		
		this.jInternalFrameDetalleFormParroquia.jButtonModificarParroquia.addActionListener(new ButtonActionListener(this,"ModificarParroquia"));

		
		this.jInternalFrameDetalleFormParroquia.jButtonModificarToolBarParroquia.addActionListener(new ButtonActionListener(this,"ModificarToolBarParroquia"));
					
		this.jInternalFrameDetalleFormParroquia.jMenuItemModificarParroquia.addActionListener(new ButtonActionListener(this,"MenuItemModificarParroquia"));		
		
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonActualizarParroquia.addActionListener (new ButtonActionListener(this,"ActualizarParroquia"));
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonActualizarToolBarParroquia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParroquia"));
						
		this.jInternalFrameDetalleFormParroquia.jMenuItemActualizarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParroquia"));		
		
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonEliminarParroquia.addActionListener (new ButtonActionListener(this,"EliminarParroquia"));
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonEliminarToolBarParroquia.addActionListener (new ButtonActionListener(this,"EliminarToolBarParroquia"));
								
		this.jInternalFrameDetalleFormParroquia.jMenuItemEliminarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParroquia"));		
		
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonCancelarParroquia.addActionListener (new ButtonActionListener(this,"CancelarParroquia"));
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonCancelarToolBarParroquia.addActionListener (new ButtonActionListener(this,"CancelarToolBarParroquia"));
					
		this.jInternalFrameDetalleFormParroquia.jMenuItemCancelarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParroquia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParroquia.jMenuItemDetalleCerrarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParroquia"));		
		
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosToolBarParroquia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParroquia"));
		
		
		
		this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosToolBarParroquia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParroquia"));
		
		
		
		this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParroquia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonidParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"idParroquiaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParroquia.jButtonid_cantonParroquiaUpdate.addActionListener(new ButtonActionListener(this,"id_cantonParroquiaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonid_cantonParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtoncodigoParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"codigoParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonnombreParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtones_activoParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"es_activoParroquiaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParroquia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParroquia"));
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParroquia"));
		}
		
		this.jTableDatosParroquia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParroquia"));
		
		this.jTableDatosParroquia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParroquia"));
		
		this.jButtonNuevoParroquia.addActionListener(new ButtonActionListener(this,"NuevoParroquia"));
		
		this.jButtonDuplicarParroquia.addActionListener(new ButtonActionListener(this,"DuplicarParroquia"));
		
		this.jButtonCopiarParroquia.addActionListener(new ButtonActionListener(this,"CopiarParroquia"));
		
		this.jButtonVerFormParroquia.addActionListener(new ButtonActionListener(this,"VerFormParroquia"));
		
		
		this.jButtonNuevoToolBarParroquia.addActionListener(new ButtonActionListener(this,"NuevoToolBarParroquia"));
			
		this.jButtonDuplicarToolBarParroquia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParroquia"));
			
		this.jMenuItemNuevoParroquia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParroquia"));
			
		this.jMenuItemDuplicarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParroquia"));		
		
		
		this.jButtonNuevoRelacionesParroquia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParroquia"));
		
		
		this.jButtonNuevoRelacionesToolBarParroquia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParroquia"));
			
		this.jMenuItemNuevoRelacionesParroquia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParroquia"));		
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonModificarParroquia.addActionListener(new ButtonActionListener(this,"ModificarParroquia"));
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonModificarToolBarParroquia.addActionListener(new ButtonActionListener(this,"ModificarToolBarParroquia"));
			
			this.jInternalFrameDetalleFormParroquia.jMenuItemModificarParroquia.addActionListener(new ButtonActionListener(this,"MenuItemModificarParroquia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParroquia.jButtonActualizarParroquia.addActionListener (new ButtonActionListener(this,"ActualizarParroquia"));
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonActualizarToolBarParroquia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParroquia"));
				
			this.jInternalFrameDetalleFormParroquia.jMenuItemActualizarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParroquia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonEliminarParroquia.addActionListener (new ButtonActionListener(this,"EliminarParroquia"));
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonEliminarToolBarParroquia.addActionListener (new ButtonActionListener(this,"EliminarToolBarParroquia"));
						
			this.jInternalFrameDetalleFormParroquia.jMenuItemEliminarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParroquia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonCancelarParroquia.addActionListener (new ButtonActionListener(this,"CancelarParroquia"));
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonCancelarToolBarParroquia.addActionListener (new ButtonActionListener(this,"CancelarToolBarParroquia"));
			
			this.jInternalFrameDetalleFormParroquia.jMenuItemCancelarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParroquia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParroquia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParroquia"));		
		
		
		this.jButtonCerrarParroquia.addActionListener (new ButtonActionListener(this,"CerrarParroquia"));
		
		
		this.jButtonCerrarToolBarParroquia.addActionListener (new ButtonActionListener(this,"CerrarToolBarParroquia"));
			
		this.jMenuItemCerrarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParroquia"));
			
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jMenuItemDetalleCerrarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParroquia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.addActionListener (new ButtonActionListener(this,"GuardarCambiosParroquia"));
		}
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosToolBarParroquia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParroquia"));
		}
		
		this.jButtonCopiarToolBarParroquia.addActionListener (new ButtonActionListener(this,"CopiarToolBarParroquia"));
			
		this.jButtonVerFormToolBarParroquia.addActionListener (new ButtonActionListener(this,"VerFormToolBarParroquia"));
		
		this.jMenuItemGuardarCambiosParroquia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParroquia"));
			
		this.jMenuItemCopiarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParroquia"));		
		
		this.jMenuItemVerFormParroquia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParroquia"));		
		
		
		this.jButtonGuardarCambiosTablaParroquia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParroquia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParroquia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParroquia"));
			
		this.jMenuItemGuardarCambiosTablaParroquia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParroquia"));		
		
		
		
		this.jButtonRecargarInformacionParroquia.addActionListener (new ButtonActionListener(this,"RecargarInformacionParroquia"));
					
		this.jButtonRecargarInformacionToolBarParroquia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParroquia"));
		
		this.jMenuItemRecargarInformacionParroquia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParroquia"));		
		
		
		
		this.jButtonAnterioresParroquia.addActionListener (new ButtonActionListener(this,"AnterioresParroquia"));
		
		
		this.jButtonAnterioresToolBarParroquia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParroquia"));
		
		this.jMenuItemAnterioresParroquia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParroquia"));		
		
		
		this.jButtonSiguientesParroquia.addActionListener (new ButtonActionListener(this,"SiguientesParroquia"));
		
		
		this.jButtonSiguientesToolBarParroquia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParroquia"));
			
		this.jMenuItemSiguientesParroquia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParroquia"));
			
		this.jMenuItemAbrirOrderByParroquia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParroquia"));
			
		this.jMenuItemMostrarOcultarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParroquia"));
			
		this.jMenuItemDetalleAbrirOrderByParroquia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParroquia"));
			
		this.jMenuItemDetalleMostarOcultarParroquia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParroquia"));		
		
		
		this.jButtonNuevoGuardarCambiosParroquia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParroquia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParroquia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParroquia"));
			
		this.jMenuItemNuevoGuardarCambiosParroquia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParroquia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParroquia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParroquia"));

		this.jCheckBoxSeleccionadosParroquia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParroquia"));
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParroquia"));
		}
		
		
		this.jComboBoxTiposRelacionesParroquia.addActionListener (new ButtonActionListener(this,"TiposRelacionesParroquia"));
			
		this.jComboBoxTiposAccionesParroquia.addActionListener (new ButtonActionListener(this,"TiposAccionesParroquia"));
					
		this.jComboBoxTiposSeleccionarParroquia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParroquia"));
			
		this.jTextFieldValorCampoGeneralParroquia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParroquia"));		
		
		
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonidParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"idParroquiaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParroquia.jButtonid_cantonParroquiaUpdate.addActionListener(new ButtonActionListener(this,"id_cantonParroquiaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonid_cantonParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtoncodigoParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"codigoParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonnombreParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtones_activoParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"es_activoParroquiaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCantonParroquia.addActionListener(new ButtonActionListener(this,"FK_IdCantonParroquia"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParroquia!=null) {
				this.jInternalFrameReporteDinamicoParroquia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParroquia"));
				this.jInternalFrameReporteDinamicoParroquia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParroquia"));
				this.jInternalFrameReporteDinamicoParroquia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParroquia"));
			}
			
			//this.jButtonCerrarReporteDinamicoParroquia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParroquia"));				
			//this.jButtonGenerarReporteDinamicoParroquia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParroquia"));
			//this.jButtonGenerarExcelReporteDinamicoParroquia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParroquia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParroquia!=null) {
				this.jInternalFrameImportacionParroquia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParroquia"));
				this.jInternalFrameImportacionParroquia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParroquia"));
				this.jInternalFrameImportacionParroquia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParroquia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParroquia.addActionListener (new ButtonActionListener(this,"AbrirOrderByParroquia"));
			
			this.jButtonAbrirOrderByToolBarParroquia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParroquia"));			
			
			if(this.jInternalFrameOrderByParroquia!=null) {
				this.jInternalFrameOrderByParroquia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParroquia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParroquia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParroquia.jTabbedPaneRelacionesParroquia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParroquia"));
		
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
            		closingInternalFrameParroquia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParroquia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParroquia = (JInternalFrameBase)event.getSource();
	            	
	            ParroquiaBeanSwingJInternalFrame jInternalFrameParent=(ParroquiaBeanSwingJInternalFrame)jInternalFrameDetalleFormParroquia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParroquiaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParroquia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParroquiaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParroquia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParroquia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParroquiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParroquiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParroquiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParroquia";
		inputMap = this.jButtonNuevoParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParroquiaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParroquiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParroquiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParroquiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParroquia";
		inputMap = this.jButtonNuevoRelacionesParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParroquiaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParroquia";
		inputMap = this.jButtonModificarParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParroquiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParroquia";
		inputMap = this.jButtonActualizarParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParroquiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParroquia";
		inputMap = this.jButtonEliminarParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParroquiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParroquia";
		inputMap = this.jButtonCancelarParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParroquiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParroquia";
		inputMap = this.jButtonCerrarParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParroquiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParroquia";
		inputMap = this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParroquia.jButtonGuardarCambiosParroquia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParroquiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParroquia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParroquiaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParroquia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParroquiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParroquia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParroquiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParroquia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParroquiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonidParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"idParroquiaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParroquia.jButtonid_cantonParroquiaUpdate.addActionListener(new ButtonActionListener(this,"id_cantonParroquiaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonid_cantonParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtoncodigoParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"codigoParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtonnombreParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreParroquiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParroquia.jButtones_activoParroquiaBusqueda.addActionListener(new ButtonActionListener(this,"es_activoParroquiaBusqueda"));
		
		
		this.jButtonFK_IdCantonParroquia.addActionListener(new ButtonActionListener(this,"FK_IdCantonParroquia"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParroquia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParroquiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParroquiaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParroquia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParroquia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
					parroquiaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parroquia parroquiaAux:parroquias) {
					parroquiaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParroquiaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParroquia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
						parroquiaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Parroquia parroquiaAux:parroquias) {
						parroquiaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
					
						if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							parroquiaAux.setes_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Parroquia parroquiaAux:parroquias) {
						
						if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							parroquiaAux.setes_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParroquia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParroquia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParroquia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParroquia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParroquiaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParroquia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParroquia.getSelectedRows();
			
			Parroquia parroquiaLocal=new Parroquia();
			
			//this.seleccionarTodosParroquia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parroquiaLocal =(Parroquia) this.parroquiaLogic.getParroquias().toArray()[this.jTableDatosParroquia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parroquiaLocal =(Parroquia) this.parroquias.toArray()[this.jTableDatosParroquia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parroquiaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
						parroquiaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Parroquia parroquiaAux:parroquias) {
						parroquiaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParroquia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParroquia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParroquia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParroquia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParroquiaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParroquiaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParroquiaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParroquia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParroquia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Parroquia parroquiaAux:this.parroquiaLogic.getParroquias()) {
				
						if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parroquiaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parroquiaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parroquia parroquiaAux:parroquias) {
					
						if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parroquiaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parroquiaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParroquia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParroquiaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParroquia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParroquia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParroquia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParroquia) {				
					conSplash=true;//false;										
					
					//this.startProcessParroquia(conSplash);
				
					this.generarReporteParroquiasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParroquiasSeleccionados();
				//this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParroquiasSeleccionados(false);
				//this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParroquiasSeleccionados(true);
				//this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParroquia();
				
				this.exportarParroquiasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParroquias();
				//this.importarParroquias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParroquia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParroquiasSeleccionados();
				//this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parroquia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParroquia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParroquia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParroquia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.setSelectedIndex(0);					
				}	
			} 			
			else if(ParroquiaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParroquia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParroquia(conSplash);
					
						//this.actualizarParametrosGeneralParroquia();
						
						this.generarReporteProcesoAccionParroquiasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParroquiaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ParroquiaS SELECCIONADOS?", "MANTENIMIENTO DE Parroquia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParroquia();
				
						this.actualizarParametrosGeneralParroquia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parroquiaReturnGeneral=parroquiaLogic.procesarAccionParroquiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parroquiaLogic.getParroquias(),this.parroquiaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParroquiaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParroquia();
					
					ParroquiaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParroquiaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParroquia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParroquia.jComboBoxTiposAccionesFormularioParroquia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParroquia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParroquiaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParroquia();
			
			if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
			Parroquia parroquia=new Parroquia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParroquia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParroquia.getSelectedItem();
			
			
			
			
			parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
			//this.sTipoAccion;
			
			if(parroquiasSeleccionados.size()==1) {
				for(Parroquia parroquiaAux:parroquiasSeleccionados) {
					parroquia=parroquiaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParroquia();
			
      		//this.finishProcessParroquia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParroquiaReturnGeneral() throws Exception {
		if(this.parroquiaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parroquiaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parroquiaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parroquiaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parroquiaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parroquiaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParroquia(false);
		}
		
		if(this.parroquiaReturnGeneral.getConRetornoLista() || this.parroquiaReturnGeneral.getConRetornoObjeto()) {
			if(this.parroquiaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parroquiaLogic.setParroquias(this.parroquiaReturnGeneral.getParroquias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parroquiaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parroquiaLogic.setParroquia(this.parroquiaReturnGeneral.getParroquia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParroquia(false);
		}
	}
	
	public void actualizarParametrosGeneralParroquia() throws Exception {
		
		
	}
	
	public ArrayList<Parroquia> getParroquiasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParroquia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Parroquia parroquiaAux:parroquiaLogic.getParroquias()) {
					if(parroquiaAux.getIsSelected()) {
						parroquiasSeleccionados.add(parroquiaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parroquia parroquiaAux:this.parroquias) {
					if(parroquiaAux.getIsSelected()) {
						parroquiasSeleccionados.add(parroquiaAux);				
					}
				}
			}
			
			if(parroquiasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parroquiasSeleccionados.addAll(this.parroquiaLogic.getParroquias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parroquiasSeleccionados.addAll(this.parroquias);				
					}
				}
			}
		} else {
			parroquiasSeleccionados.add(this.parroquia);
		}
		
		return parroquiasSeleccionados;
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
	
	public void generarReporteParroquiasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParroquiasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParroquiasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParroquiasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParroquiasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parroquia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParroquiasSeleccionados() throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParroquias("Todos",parroquiasSeleccionados);
		
	}	
	
	public void generarReporteNormalParroquiasSeleccionados() throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParroquias("Todos",parroquiasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParroquiasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParroquias("Todos",parroquiasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParroquiasSeleccionados() throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParroquia();
		
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParroquia();
		
		
		//this.generarReporteParroquias("Todos",parroquiasSeleccionados ,parroquiaImplementable,parroquiaImplementableHome);
	}
	
	public void mostrarImportacionParroquias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParroquia();
		
		this.abrirFrameImportacionParroquia();		
		
			
		//this.generarReporteParroquias("Todos",parroquiasSeleccionados ,parroquiaImplementable,parroquiaImplementableHome);
	}
	
	public void importarParroquias() throws Exception {		
	
	}
	
	public void exportarParroquiasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParroquiasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParroquiasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParroquiasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parroquia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParroquiasSeleccionados() throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parroquia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParroquia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Parroquia parroquiaAux:parroquiasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParroquia(parroquiaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parroquiaAux.setsDetalleGeneralEntityReporte(parroquiaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParroquia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParroquiaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParroquiaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParroquiaConstantesFunciones.LABEL_IDCANTON;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParroquiaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParroquiaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParroquiaConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParroquia(Parroquia parroquia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parroquia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parroquia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parroquia.getcanton_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parroquia.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parroquia.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parroquia.getes_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParroquiasSeleccionados() throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parroquia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Parroquias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParroquia(row);				
				iRow++;
			}				
			
			for(Parroquia parroquiaAux:parroquiasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParroquia(parroquiaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParroquiasSeleccionados() throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();		
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parroquia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parroquias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parroquia");
			//elementRoot.appendChild(element);
		
			for(Parroquia parroquiaAux:parroquiasSeleccionados) {
				element = document.createElement("parroquia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParroquia(parroquiaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parroquia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParroquia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParroquiaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParroquiaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParroquiaConstantesFunciones.LABEL_IDCANTON);
		cell = row.createCell(iColumn++);cell.setCellValue(ParroquiaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParroquiaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParroquiaConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParroquia(Parroquia parroquia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parroquia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parroquia.getcanton_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parroquia.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(parroquia.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(parroquia.getes_activo());				
	}
	
	public void setFilaDatosExportarXmlParroquia(Parroquia parroquia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParroquiaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parroquia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParroquiaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parroquia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcanton_descripcion = document.createElement(ParroquiaConstantesFunciones.IDCANTON);
		elementcanton_descripcion.appendChild(document.createTextNode(parroquia.getcanton_descripcion()));
		element.appendChild(elementcanton_descripcion);

		Element elementcodigo = document.createElement(ParroquiaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(parroquia.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ParroquiaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(parroquia.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_activo = document.createElement(ParroquiaConstantesFunciones.ESACTIVO);
		elementes_activo.appendChild(document.createTextNode(parroquia.getes_activo().toString().trim()));
		element.appendChild(elementes_activo);
	}
	
	public void generarReporteGroupGenericoParroquiasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Parroquia> parroquiasSeleccionados=new ArrayList<Parroquia>();
		
		parroquiasSeleccionados=this.getParroquiasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParroquia(parroquiasSeleccionados);
		
		this.generarReporteParroquias("Todos",parroquiasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParroquia(ArrayList<Parroquia> parroquiasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Parroquia parroquiaAux:parroquiasSeleccionados) {
				parroquiaAux.setsDetalleGeneralEntityReporte(parroquiaAux.toString());
			
				if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_IDCANTON)) {
					existe=true;
					parroquiaAux.setsDescripcionGeneralEntityReporte1(parroquiaAux.getcanton_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					parroquiaAux.setsDescripcionGeneralEntityReporte1(parroquiaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					parroquiaAux.setsDescripcionGeneralEntityReporte1(parroquiaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ParroquiaConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					parroquiaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parroquiaAux.getes_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParroquiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParroquia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParroquia=true;
				this.isVisibilidadCeldaNuevoRelacionesParroquia=true;
				this.isVisibilidadCeldaGuardarCambiosParroquia=true;
			}
			
			this.isVisibilidadCeldaModificarParroquia=false;
			this.isVisibilidadCeldaActualizarParroquia=false;
			this.isVisibilidadCeldaEliminarParroquia=false;
			this.isVisibilidadCeldaCancelarParroquia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParroquia=true;
				} else {
					this.isVisibilidadCeldaGuardarParroquia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParroquia=false;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
			this.isVisibilidadCeldaGuardarCambiosParroquia=false;
			this.isVisibilidadCeldaModificarParroquia=false;
			this.isVisibilidadCeldaActualizarParroquia=true;
			this.isVisibilidadCeldaEliminarParroquia=false;
			this.isVisibilidadCeldaCancelarParroquia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParroquia=true;
				} else {
					this.isVisibilidadCeldaGuardarParroquia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParroquia=false;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
			this.isVisibilidadCeldaGuardarCambiosParroquia=false;
			this.isVisibilidadCeldaModificarParroquia=false;
			this.isVisibilidadCeldaActualizarParroquia=true;
			this.isVisibilidadCeldaEliminarParroquia=true;
			this.isVisibilidadCeldaCancelarParroquia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParroquia=true;
				} else {
					this.isVisibilidadCeldaGuardarParroquia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParroquia=false;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
			this.isVisibilidadCeldaGuardarCambiosParroquia=false;
			this.isVisibilidadCeldaModificarParroquia=false;
			this.isVisibilidadCeldaActualizarParroquia=true;
			this.isVisibilidadCeldaEliminarParroquia=false;
			this.isVisibilidadCeldaCancelarParroquia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParroquia=false;
				} else {
					this.isVisibilidadCeldaGuardarParroquia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParroquia=true;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=true;
			this.isVisibilidadCeldaGuardarCambiosParroquia=true;
			this.isVisibilidadCeldaModificarParroquia=false;
			this.isVisibilidadCeldaActualizarParroquia=false;
			this.isVisibilidadCeldaEliminarParroquia=false;
			this.isVisibilidadCeldaCancelarParroquia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParroquia=true;
				} else {
					this.isVisibilidadCeldaGuardarParroquia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParroquia=false;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
			this.isVisibilidadCeldaGuardarCambiosParroquia=false;
			this.isVisibilidadCeldaActualizarParroquia=false;
			this.isVisibilidadCeldaEliminarParroquia=false;
			this.isVisibilidadCeldaCancelarParroquia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParroquia=false;
				} else {
					this.isVisibilidadCeldaGuardarParroquia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParroquia=false;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
			this.isVisibilidadCeldaGuardarCambiosParroquia=false;
			this.isVisibilidadCeldaModificarParroquia=true;
			this.isVisibilidadCeldaActualizarParroquia=false;
			this.isVisibilidadCeldaEliminarParroquia=false;
			this.isVisibilidadCeldaCancelarParroquia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParroquia=false;
				} else {
					this.isVisibilidadCeldaGuardarParroquia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParroquiaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParroquia=true;
			this.isVisibilidadCeldaNuevoRelacionesParroquia=true;
			this.isVisibilidadCeldaGuardarCambiosParroquia=true;
		} else {
			this.actualizarEstadoPanelsParroquia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParroquia=false;
			//this.isVisibilidadCeldaVerFormParroquia=false;
			this.isVisibilidadCeldaDuplicarParroquia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parroquiaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
		} else {
			this.isVisibilidadCeldaNuevoParroquia=false;
			this.isVisibilidadCeldaGuardarCambiosParroquia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parroquiaSessionBean.getEsGuardarRelacionado()) {
			if(!parroquiaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParroquia=false;												
			}
			
			this.jButtonCerrarParroquia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParroquia=false;
		}
		
		if(!this.permiteMantenimiento(this.parroquia)) {
			this.isVisibilidadCeldaActualizarParroquia=false;
			this.isVisibilidadCeldaEliminarParroquia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParroquia() {
	}
	
	public void actualizarEstadoPanelsParroquia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParroquia!=null) {
				this.jScrollPanelDatosEdicionParroquia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParroquia!=null) {
				this.jScrollPanelDatosParroquia.setVisible(true);
			}
			
			if(this.jPanelPaginacionParroquia!=null) {
				this.jPanelPaginacionParroquia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParroquia!=null) {
				this.jScrollPanelDatosEdicionParroquia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParroquia!=null) {
				this.jScrollPanelDatosParroquia.setVisible(false);
			}
			
			if(this.jPanelPaginacionParroquia!=null) {
				this.jPanelPaginacionParroquia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParroquia!=null) {
				this.jScrollPanelDatosEdicionParroquia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParroquia!=null) {
				this.jScrollPanelDatosParroquia.setVisible(false);
			}
			
			if(this.jPanelPaginacionParroquia!=null) {
				this.jPanelPaginacionParroquia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParroquia!=null) {
				this.jScrollPanelDatosEdicionParroquia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParroquia!=null) {
				this.jScrollPanelDatosParroquia.setVisible(false);
			}
			
			if(this.jPanelPaginacionParroquia!=null) {
				this.jPanelPaginacionParroquia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParroquia!=null) {
				this.jScrollPanelDatosEdicionParroquia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParroquia!=null) {
				this.jScrollPanelDatosParroquia.setVisible(true);
			}
			
			if(this.jPanelPaginacionParroquia!=null) {
				this.jPanelPaginacionParroquia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParroquia!=null) {
				this.jScrollPanelDatosEdicionParroquia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParroquia!=null) {
				this.jScrollPanelDatosParroquia.setVisible(true);
			}
			
			if(this.jPanelPaginacionParroquia!=null) {
				this.jPanelPaginacionParroquia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParroquia!=null) {
				this.jScrollPanelDatosEdicionParroquia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParroquia!=null) {
				this.jScrollPanelDatosParroquia.setVisible(true);
			}
			
			if(this.jPanelPaginacionParroquia!=null) {
				this.jPanelPaginacionParroquia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParroquia!=null) {
					this.jTabbedPaneBusquedasParroquia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParroquia!=null) {
				this.jTabbedPaneBusquedasParroquia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParroquia!=null) {
				this.jPanelParametrosReportesParroquia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCanton(Boolean isParaCanton){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCantonNegation=!isParaCanton;

			this.isVisibilidadFK_IdCanton=isParaCanton;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasParroquia.remove(jPanelFK_IdCantonParroquia);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParroquiaSessionBean parroquiaSessionBean=new ParroquiaSessionBean();
		
		if(this.parroquiaSessionBean==null) {
			this.parroquiaSessionBean=new ParroquiaSessionBean();
		}
		
		this.parroquiaSessionBean.setsUltimaBusquedaParroquia(this.getsAccionBusqueda());
		this.parroquiaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parroquiaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCanton")) {
			parroquiaSessionBean.setid_canton(this.getid_cantonFK_IdCanton());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParroquiaSessionBean parroquiaSessionBean=new ParroquiaSessionBean();
		
		if(this.parroquiaSessionBean==null) {
			this.parroquiaSessionBean=new ParroquiaSessionBean();
		}
		
		if(this.parroquiaSessionBean.getsUltimaBusquedaParroquia()!=null&&!this.parroquiaSessionBean.getsUltimaBusquedaParroquia().equals("")) {
			this.setsAccionBusqueda(parroquiaSessionBean.getsUltimaBusquedaParroquia());
			this.setiNumeroPaginacion(parroquiaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parroquiaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCanton")) {
				this.setid_cantonFK_IdCanton(parroquiaSessionBean.getid_canton());
				parroquiaSessionBean.setid_canton(-1L);
			}
		}
		
		this.parroquiaSessionBean.setsUltimaBusquedaParroquia("");
		this.parroquiaSessionBean.setiNumeroPaginacion(ParroquiaConstantesFunciones.INUMEROPAGINACION);
		this.parroquiaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParroquia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParroquia() {
		this.updateBorderResaltarBusquedasFormularioParroquia();
		this.updateVisibilidadBusquedasFormularioParroquia();
		this.updateHabilitarBusquedasFormularioParroquia();
	}
	
	public void updateBorderResaltarBusquedasFormularioParroquia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParroquia.getComponents().length>0) {
	

		if(this.parroquiaConstantesFunciones.resaltarFK_IdCantonParroquia!=null) {
			index= this.jTabbedPaneBusquedasParroquia.indexOfComponent(this.jPanelFK_IdCantonParroquia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParroquia.getComponent(index);
				jPanel.setBorder(this.parroquiaConstantesFunciones.resaltarFK_IdCantonParroquia);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParroquia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParroquia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParroquia.indexOfComponent(this.jPanelFK_IdCantonParroquia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParroquia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parroquiaConstantesFunciones.mostrarFK_IdCantonParroquia);
			if(!this.parroquiaConstantesFunciones.mostrarFK_IdCantonParroquia && index>-1) {
				this.jTabbedPaneBusquedasParroquia.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParroquia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParroquia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParroquia.indexOfComponent(this.jPanelFK_IdCantonParroquia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParroquia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parroquiaConstantesFunciones.activarFK_IdCantonParroquia);
				this.jTabbedPaneBusquedasParroquia.setEnabledAt(index,this.parroquiaConstantesFunciones.activarFK_IdCantonParroquia);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParroquia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCanton")) {
			index= this.jTabbedPaneBusquedasParroquia.indexOfComponent(this.jPanelFK_IdCantonParroquia);

			this.jTabbedPaneBusquedasParroquia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParroquia.getComponent(index);

			this.parroquiaConstantesFunciones.setResaltarFK_IdCantonParroquia(resaltar);

			jPanel.setBorder(this.parroquiaConstantesFunciones.resaltarFK_IdCantonParroquia);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParroquia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParroquia() throws Exception {

		if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParroquia();
		this.updateVisibilidadResaltarControlesFormularioParroquia();
		this.updateHabilitarResaltarControlesFormularioParroquia();
		
	}
	
	public void updateBorderResaltarControlesFormularioParroquia() throws Exception {
		if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parroquiaConstantesFunciones.resaltaridParroquia!=null && this.jInternalFrameDetalleFormParroquia!=null) {this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.setBorder(this.parroquiaConstantesFunciones.resaltaridParroquia);}
		if(this.parroquiaConstantesFunciones.resaltarid_cantonParroquia!=null && this.jInternalFrameDetalleFormParroquia!=null) {this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setBorder(this.parroquiaConstantesFunciones.resaltarid_cantonParroquia);}
		if(this.parroquiaConstantesFunciones.resaltarcodigoParroquia!=null && this.jInternalFrameDetalleFormParroquia!=null) {this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.setBorder(this.parroquiaConstantesFunciones.resaltarcodigoParroquia);}
		if(this.parroquiaConstantesFunciones.resaltarnombreParroquia!=null && this.jInternalFrameDetalleFormParroquia!=null) {this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.setBorder(this.parroquiaConstantesFunciones.resaltarnombreParroquia);}
		if(this.parroquiaConstantesFunciones.resaltares_activoParroquia!=null && this.jInternalFrameDetalleFormParroquia!=null) {this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setBorderPainted(true);this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setBorder(this.parroquiaConstantesFunciones.resaltares_activoParroquia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParroquia() throws Exception {		
		if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
	
		//this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.setVisible(this.parroquiaConstantesFunciones.mostraridParroquia);
		this.jInternalFrameDetalleFormParroquia.jPanelidParroquia.setVisible(this.parroquiaConstantesFunciones.mostraridParroquia);
		//this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setVisible(this.parroquiaConstantesFunciones.mostrarid_cantonParroquia);
		this.jInternalFrameDetalleFormParroquia.jPanelid_cantonParroquia.setVisible(this.parroquiaConstantesFunciones.mostrarid_cantonParroquia);
		//this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.setVisible(this.parroquiaConstantesFunciones.mostrarcodigoParroquia);
		this.jInternalFrameDetalleFormParroquia.jPanelcodigoParroquia.setVisible(this.parroquiaConstantesFunciones.mostrarcodigoParroquia);
		//this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.setVisible(this.parroquiaConstantesFunciones.mostrarnombreParroquia);
		this.jInternalFrameDetalleFormParroquia.jPanelnombreParroquia.setVisible(this.parroquiaConstantesFunciones.mostrarnombreParroquia);
		//this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setVisible(this.parroquiaConstantesFunciones.mostrares_activoParroquia);
		this.jInternalFrameDetalleFormParroquia.jPaneles_activoParroquia.setVisible(this.parroquiaConstantesFunciones.mostrares_activoParroquia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParroquia() throws Exception {
		if(this.jInternalFrameDetalleFormParroquia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParroquia!=null) {
	
		this.jInternalFrameDetalleFormParroquia.jLabelidParroquia.setEnabled(this.parroquiaConstantesFunciones.activaridParroquia);
		this.jInternalFrameDetalleFormParroquia.jComboBoxid_cantonParroquia.setEnabled(this.parroquiaConstantesFunciones.activarid_cantonParroquia);
		this.jInternalFrameDetalleFormParroquia.jTextFieldcodigoParroquia.setEnabled(this.parroquiaConstantesFunciones.activarcodigoParroquia);
		this.jInternalFrameDetalleFormParroquia.jTextAreanombreParroquia.setEnabled(this.parroquiaConstantesFunciones.activarnombreParroquia);
		this.jInternalFrameDetalleFormParroquia.jCheckBoxes_activoParroquia.setEnabled(this.parroquiaConstantesFunciones.activares_activoParroquia);
		}
	}
	
		
}
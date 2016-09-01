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

import com.bydan.erp.nomina.util.IdiomaConstantesFunciones;
import com.bydan.erp.nomina.util.IdiomaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.IdiomaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.IdiomaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class IdiomaBeanSwingJInternalFrame extends IdiomaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(IdiomaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Idioma> idiomaValidator = new ClassValidator<Idioma>(Idioma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Idioma idioma;	
	public Idioma idiomaAux;
	public Idioma idiomaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Idioma idiomaTotales;
	public Long idIdiomaActual;
	public Long iIdNuevoIdioma=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosEmpleadoIdioma=false;

	public Boolean getIsTienePermisosEmpleadoIdioma() {
		return isTienePermisosEmpleadoIdioma;
	}

	public void setIsTienePermisosEmpleadoIdioma(Boolean isTienePermisosEmpleadoIdioma) {
		this.isTienePermisosEmpleadoIdioma= isTienePermisosEmpleadoIdioma;
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
	
	public Boolean isPermisoTodoIdioma;
	public Boolean isPermisoNuevoIdioma;
	public Boolean isPermisoActualizarIdioma;
	public Boolean isPermisoActualizarOriginalIdioma;
	public Boolean isPermisoEliminarIdioma;
	public Boolean isPermisoGuardarCambiosIdioma;
	public Boolean isPermisoConsultaIdioma;
	public Boolean isPermisoBusquedaIdioma;
	public Boolean isPermisoReporteIdioma;
	public Boolean isPermisoPaginacionMedioIdioma;
	public Boolean isPermisoPaginacionAltoIdioma;
	public Boolean isPermisoPaginacionTodoIdioma;
	public Boolean isPermisoCopiarIdioma;
	public Boolean isPermisoVerFormIdioma;
	public Boolean isPermisoDuplicarIdioma;
	public Boolean isPermisoOrdenIdioma;
	
	
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
	
	public IdiomaParameterReturnGeneral idiomaReturnGeneral;
	public IdiomaParameterReturnGeneral idiomaParameterGeneral;
	
	

	public EmpleadoIdiomaLogic empleadoidiomaLogic=null;

	public EmpleadoIdiomaLogic getEmpleadoIdiomaLogic() {
		return empleadoidiomaLogic;
	}

	public void setEmpleadoIdiomaLogic(EmpleadoIdiomaLogic empleadoidiomaLogic) {
		this.empleadoidiomaLogic = empleadoidiomaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoIdioma=false;
	public Boolean esParaAccionDesdeFormularioIdioma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected IdiomaSessionBeanAdditional idiomaSessionBeanAdditional=null;
	
	public IdiomaSessionBeanAdditional getIdiomaSessionBeanAdditional() {
		return this.idiomaSessionBeanAdditional;
	}
	
	public void setIdiomaSessionBeanAdditional(IdiomaSessionBeanAdditional idiomaSessionBeanAdditional) {
		try {
			this.idiomaSessionBeanAdditional=idiomaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected IdiomaBeanSwingJInternalFrameAdditional idiomaBeanSwingJInternalFrameAdditional=null;
	//public class IdiomaBeanSwingJInternalFrame
	
	public IdiomaBeanSwingJInternalFrameAdditional getIdiomaBeanSwingJInternalFrameAdditional() {
		return this.idiomaBeanSwingJInternalFrameAdditional;
	}
	
	public void setIdiomaBeanSwingJInternalFrameAdditional(IdiomaBeanSwingJInternalFrameAdditional idiomaBeanSwingJInternalFrameAdditional) {
		try {
			this.idiomaBeanSwingJInternalFrameAdditional=idiomaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public IdiomaLogic idiomaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Idioma idiomaBean;
	public IdiomaConstantesFunciones idiomaConstantesFunciones;
	//public IdiomaParameterReturnGeneral idiomaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Idioma> idiomas;	
	//public List<Idioma> idiomasEliminados;
	//public List<Idioma> idiomasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoIdioma=false;
	public Boolean isVisibilidadCeldaDuplicarIdioma=true;
	public Boolean isVisibilidadCeldaCopiarIdioma=true;
	public Boolean isVisibilidadCeldaVerFormIdioma=true;
	public Boolean isVisibilidadCeldaOrdenIdioma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesIdioma=false;
	public Boolean isVisibilidadCeldaModificarIdioma=false;
	public Boolean isVisibilidadCeldaActualizarIdioma=false;
	public Boolean isVisibilidadCeldaEliminarIdioma=false;
	public Boolean isVisibilidadCeldaCancelarIdioma=false;
	public Boolean isVisibilidadCeldaGuardarIdioma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosIdioma=false;	
	
	
	
	public Long getiIdNuevoIdioma() {
		return this.iIdNuevoIdioma;
	}

	public void setiIdNuevoIdioma(Long iIdNuevoIdioma) {
		this.iIdNuevoIdioma = iIdNuevoIdioma;
	}
	
	public Long getidIdiomaActual() {
		return this.idIdiomaActual;
	}

	public void setidIdiomaActual(Long idIdiomaActual) {
		this.idIdiomaActual = idIdiomaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Idioma getidioma() {
		return this.idioma;
	}

	public void setidioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public Idioma getidiomaAux() {
		return this.idiomaAux;
	}

	public void setidiomaAux(Idioma idiomaAux) {
		this.idiomaAux = idiomaAux;
	}				
	
	public Idioma getidiomaAnterior() {
		return this.idiomaAnterior;
	}

	public void setidiomaAnterior(Idioma idiomaAnterior) {
		this.idiomaAnterior = idiomaAnterior;
	}	
	
	public Idioma getidiomaTotales() {
		return this.idiomaTotales;
	}

	public void setidiomaTotales(Idioma idiomaTotales) {
		this.idiomaTotales = idiomaTotales;
	}	
	
	public Idioma getidiomaBean() {
		return this.idiomaBean;
	}

	public void setidiomaBean(Idioma idiomaBean) {
		this.idiomaBean = idiomaBean;
	}	
	
	public IdiomaParameterReturnGeneral getidiomaReturnGeneral() {
		return this.idiomaReturnGeneral;
	}

	public void setidiomaReturnGeneral(IdiomaParameterReturnGeneral idiomaReturnGeneral) {
		this.idiomaReturnGeneral = idiomaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public IdiomaLogic getIdiomaLogic()	{		
		return idiomaLogic;
	}

	public void setIdiomaLogic(IdiomaLogic idiomaLogic) {
		this.idiomaLogic = idiomaLogic;
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
	
	public Boolean getIsEsNuevoIdioma() {
		return isEsNuevoIdioma;
	}

	public void setIsEsNuevoIdioma(Boolean isEsNuevoIdioma) {
		this.isEsNuevoIdioma = isEsNuevoIdioma;
	}

	public Boolean getEsParaAccionDesdeFormularioIdioma() {
		return esParaAccionDesdeFormularioIdioma;
	}
	
	public void setEsParaAccionDesdeFormularioIdioma(Boolean esParaAccionDesdeFormularioIdioma) {
		this.esParaAccionDesdeFormularioIdioma = esParaAccionDesdeFormularioIdioma;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesIdioma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			IdiomaConstantesFunciones.refrescarForeignKeysDescripcionesIdioma(this.idiomaLogic.getIdiomas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			IdiomaConstantesFunciones.refrescarForeignKeysDescripcionesIdioma(this.idiomas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//idiomaLogic.setIdiomas(this.idiomas);
			idiomaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public IdiomaParameterReturnGeneral getIdiomaParameterGeneral() {
		return this.idiomaParameterGeneral;
	}
	
	public void setIdiomaParameterGeneral(IdiomaParameterReturnGeneral idiomaParameterGeneral) {
		this.idiomaParameterGeneral = idiomaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoIdioma() {
		return isPermisoTodoIdioma;
	}

	public void setIsPermisoTodoIdioma(Boolean isPermisoTodoIdioma) {
		this.isPermisoTodoIdioma = isPermisoTodoIdioma;
	}

	public Boolean getIsPermisoNuevoIdioma() {
		return isPermisoNuevoIdioma;
	}

	public void setIsPermisoNuevoIdioma(Boolean isPermisoNuevoIdioma) {
		this.isPermisoNuevoIdioma = isPermisoNuevoIdioma;
	}

	public Boolean getIsPermisoActualizarIdioma() {
		return isPermisoActualizarIdioma;
	}

	public void setIsPermisoActualizarIdioma(Boolean isPermisoActualizarIdioma) {
		this.isPermisoActualizarIdioma = isPermisoActualizarIdioma;
	}

	public Boolean getIsPermisoEliminarIdioma() {
		return isPermisoEliminarIdioma;
	}

	public void setIsPermisoEliminarIdioma(Boolean isPermisoEliminarIdioma) {
		this.isPermisoEliminarIdioma = isPermisoEliminarIdioma;
	}

	public Boolean getIsPermisoGuardarCambiosIdioma() {
		return isPermisoGuardarCambiosIdioma;
	}

	public void setIsPermisoGuardarCambiosIdioma(Boolean isPermisoGuardarCambiosIdioma) {
		this.isPermisoGuardarCambiosIdioma = isPermisoGuardarCambiosIdioma;
	}
	
	public Boolean getIsPermisoConsultaIdioma() {
		return isPermisoConsultaIdioma;
	}

	public void setIsPermisoConsultaIdioma(Boolean isPermisoConsultaIdioma) {
		this.isPermisoConsultaIdioma = isPermisoConsultaIdioma;
	}

	public Boolean getIsPermisoBusquedaIdioma() {
		return isPermisoBusquedaIdioma;
	}

	public void setIsPermisoBusquedaIdioma(Boolean isPermisoBusquedaIdioma) {
		this.isPermisoBusquedaIdioma = isPermisoBusquedaIdioma;
	}

	public Boolean getIsPermisoReporteIdioma() {
		return isPermisoReporteIdioma;
	}

	public void setIsPermisoReporteIdioma(Boolean isPermisoReporteIdioma) {
		this.isPermisoReporteIdioma = isPermisoReporteIdioma;
	}
	
	public Boolean getIsPermisoPaginacionMedioIdioma() {
		return isPermisoPaginacionMedioIdioma;
	}

	public void setIsPermisoPaginacionMedioIdioma(Boolean isPermisoPaginacionMedioIdioma) {
		this.isPermisoPaginacionMedioIdioma = isPermisoPaginacionMedioIdioma;
	}
	
	public Boolean getIsPermisoPaginacionTodoIdioma() {
		return isPermisoPaginacionTodoIdioma;
	}

	public void setIsPermisoPaginacionTodoIdioma(Boolean isPermisoPaginacionTodoIdioma) {
		this.isPermisoPaginacionTodoIdioma = isPermisoPaginacionTodoIdioma;
	}
	
	public Boolean getIsPermisoPaginacionAltoIdioma() {
		return isPermisoPaginacionAltoIdioma;
	}

	public void setIsPermisoPaginacionAltoIdioma(Boolean isPermisoPaginacionAltoIdioma) {
		this.isPermisoPaginacionAltoIdioma = isPermisoPaginacionAltoIdioma;
	}
	
	public Boolean getIsPermisoCopiarIdioma() {
		return isPermisoCopiarIdioma;
	}

	public void setIsPermisoCopiarIdioma(Boolean isPermisoCopiarIdioma) {
		this.isPermisoCopiarIdioma = isPermisoCopiarIdioma;
	}
	
	public Boolean getIsPermisoVerFormIdioma() {
		return isPermisoVerFormIdioma;
	}

	public void setIsPermisoVerFormIdioma(Boolean isPermisoVerFormIdioma) {
		this.isPermisoVerFormIdioma = isPermisoVerFormIdioma;
	}
	
	public Boolean getIsPermisoDuplicarIdioma() {
		return isPermisoDuplicarIdioma;
	}

	public void setIsPermisoDuplicarIdioma(Boolean isPermisoDuplicarIdioma) {
		this.isPermisoDuplicarIdioma = isPermisoDuplicarIdioma;
	}
	
	public Boolean getIsPermisoOrdenIdioma() {
		return isPermisoOrdenIdioma;
	}

	public void setIsPermisoOrdenIdioma(Boolean isPermisoOrdenIdioma) {
		this.isPermisoOrdenIdioma = isPermisoOrdenIdioma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoIdioma() {
		return isVisibilidadCeldaNuevoIdioma;
	}

	public void setIsVisibilidadCeldaNuevoIdioma(Boolean isVisibilidadCeldaNuevoIdioma) {
		this.isVisibilidadCeldaNuevoIdioma = isVisibilidadCeldaNuevoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarIdioma() {
		return isVisibilidadCeldaDuplicarIdioma;
	}

	public void setIsVisibilidadCeldaDuplicarIdioma(Boolean isVisibilidadCeldaDuplicarIdioma) {
		this.isVisibilidadCeldaDuplicarIdioma = isVisibilidadCeldaDuplicarIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarIdioma() {
		return isVisibilidadCeldaCopiarIdioma;
	}

	public void setIsVisibilidadCeldaCopiarIdioma(Boolean isVisibilidadCeldaCopiarIdioma) {
		this.isVisibilidadCeldaCopiarIdioma = isVisibilidadCeldaCopiarIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormIdioma() {
		return isVisibilidadCeldaVerFormIdioma;
	}

	public void setIsVisibilidadCeldaVerFormIdioma(Boolean isVisibilidadCeldaVerFormIdioma) {
		this.isVisibilidadCeldaVerFormIdioma = isVisibilidadCeldaVerFormIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenIdioma() {
		return isVisibilidadCeldaOrdenIdioma;
	}

	public void setIsVisibilidadCeldaOrdenIdioma(Boolean isVisibilidadCeldaOrdenIdioma) {
		this.isVisibilidadCeldaOrdenIdioma = isVisibilidadCeldaOrdenIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesIdioma() {
		return isVisibilidadCeldaNuevoRelacionesIdioma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesIdioma(Boolean isVisibilidadCeldaNuevoRelacionesIdioma) {
		this.isVisibilidadCeldaNuevoRelacionesIdioma = isVisibilidadCeldaNuevoRelacionesIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarIdioma() {
		return isVisibilidadCeldaModificarIdioma;
	}

	public void setIsVisibilidadCeldaModificarIdioma(Boolean isVisibilidadCeldaModificarIdioma) {
		this.isVisibilidadCeldaModificarIdioma = isVisibilidadCeldaModificarIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarIdioma() {
		return isVisibilidadCeldaActualizarIdioma;
	}

	public void setIsVisibilidadCeldaActualizarIdioma(Boolean isVisibilidadCeldaActualizarIdioma) {
		this.isVisibilidadCeldaActualizarIdioma = isVisibilidadCeldaActualizarIdioma;
	}

	public Boolean getIsVisibilidadCeldaEliminarIdioma() {
		return isVisibilidadCeldaEliminarIdioma;
	}

	public void setIsVisibilidadCeldaEliminarIdioma(Boolean isVisibilidadCeldaEliminarIdioma) {
		this.isVisibilidadCeldaEliminarIdioma = isVisibilidadCeldaEliminarIdioma;
	}

	public Boolean getIsVisibilidadCeldaCancelarIdioma() {
		return isVisibilidadCeldaCancelarIdioma;
	}

	public void setIsVisibilidadCeldaCancelarIdioma(Boolean isVisibilidadCeldaCancelarIdioma) {
		this.isVisibilidadCeldaCancelarIdioma = isVisibilidadCeldaCancelarIdioma;
	}

	public Boolean getIsVisibilidadCeldaGuardarIdioma() {
		return isVisibilidadCeldaGuardarIdioma;
	}

	public void setIsVisibilidadCeldaGuardarIdioma(Boolean isVisibilidadCeldaGuardarIdioma) {
		this.isVisibilidadCeldaGuardarIdioma = isVisibilidadCeldaGuardarIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosIdioma() {
		return isVisibilidadCeldaGuardarCambiosIdioma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosIdioma(Boolean isVisibilidadCeldaGuardarCambiosIdioma) {
		this.isVisibilidadCeldaGuardarCambiosIdioma = isVisibilidadCeldaGuardarCambiosIdioma;
	}
		
	public IdiomaSessionBean getidiomaSessionBean() {
		return this.idiomaSessionBean;
	}
	
	public void setidiomaSessionBean(IdiomaSessionBean idiomaSessionBean) {
		this.idiomaSessionBean=idiomaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysIdioma(Idioma idioma)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(Idioma idioma,Idioma idiomaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalIdioma(idioma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		idiomaAux.setId(idioma.getId());
		idiomaAux.setVersionRow(idioma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessIdioma();
		
			int intSelectedRow = this.jTableDatosIdioma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = idiomaValidator.getInvalidValues(this.idioma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			idiomaLogic.setDatosCliente(datosCliente);
			idiomaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				idiomaAux=new  Idioma();
				
				idiomaAux.setIsNew(true);
				idiomaAux.setIsChanged(true);
				
				idiomaAux.setIdiomaOriginal(this.idioma);
				
				idiomaAux.setId(this.idioma.getId());	
				idiomaAux.setVersionRow(this.idioma.getVersionRow());	
				idiomaAux.setnombre(this.idioma.getnombre());	
				idiomaAux.setdescripcion(this.idioma.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.idiomaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(idiomaAux,idiomaLogic.getIdiomas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(idiomaAux,idiomas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.idiomaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						idiomaLogic.saveIdiomas();//WithConnection
						//idiomaLogic.getSetVersionRowIdiomas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.idioma,idiomaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.idiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas().addAll(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomas.addAll(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								idiomaLogic.saveIdiomaRelaciones(idiomaAux,this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());//WithConnection
								//idiomaLogic.getSetVersionRowIdiomas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.idioma,idiomaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomas= new ArrayList<EmpleadoIdioma>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();}
							idiomaAux.setEmpleadoIdiomas(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.idiomaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(idiomaAux,idiomaLogic.getIdiomas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(idiomaAux,idiomas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.idioma,idiomaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				idiomaAux=new  Idioma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.idiomaSessionBean.getEsGuardarRelacionado() 
					|| (this.idiomaSessionBean.getEsGuardarRelacionado() && this.idioma.getId()>=0)) {
						
					idiomaAux.setIsNew(false);
				}
				
				idiomaAux.setIsDeleted(false);
			
				idiomaAux.setId(this.idioma.getId());	
				idiomaAux.setVersionRow(this.idioma.getVersionRow());	
				idiomaAux.setnombre(this.idioma.getnombre());	
				idiomaAux.setdescripcion(this.idioma.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(idiomaAux,idiomaLogic.getIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(idiomaAux,idiomas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.idiomaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						idiomaLogic.saveIdiomas();//WithConnection
						//idiomaLogic.getSetVersionRowIdiomas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.idioma,idiomaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.idiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas().addAll(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomas.addAll(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								idiomaLogic.saveIdiomaRelaciones(idiomaAux,this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());//WithConnection
								//idiomaLogic.getSetVersionRowIdiomas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.idioma,idiomaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomas= new ArrayList<EmpleadoIdioma>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();}
							idiomaAux.setEmpleadoIdiomas(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.idiomaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(idiomaAux,idiomaLogic.getIdiomas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(idiomaAux,idiomas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.idioma,idiomaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				idiomaAux=new  Idioma();
				
				idiomaAux.setIsNew(false);
				idiomaAux.setIsChanged(false);
				
				idiomaAux.setIsDeleted(true);
				
				idiomaAux.setId(this.idioma.getId());	
				idiomaAux.setVersionRow(this.idioma.getVersionRow());	
				idiomaAux.setnombre(this.idioma.getnombre());	
				idiomaAux.setdescripcion(this.idioma.getdescripcion());	
				
				if(this.idiomaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.idiomaAux.getId()>=0) {	
						this.idiomasEliminados.add(idiomaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(idiomaAux,idiomaLogic.getIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(idiomaAux,idiomas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.idiomaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						idiomaLogic.saveIdiomas();//WithConnection
						//idiomaLogic.getSetVersionRowIdiomas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.idiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas().addAll(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomas.addAll(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								idiomaLogic.saveIdiomaRelaciones(idiomaAux,this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());//WithConnection
								//idiomaLogic.getSetVersionRowIdiomas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomas= new ArrayList<EmpleadoIdioma>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.quitarFilaTotales();}
							idiomaAux.setEmpleadoIdiomas(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.idiomaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(idiomaAux,idiomaLogic.getIdiomas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(idiomaAux,idiomas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.getIdiomas().addAll(this.idiomasEliminados);
					
					idiomaLogic.saveIdiomas();//WithConnection
					//idiomaLogic.getSetVersionRowIdiomas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.idiomasEliminados= new ArrayList<Idioma>();		
			}
			
			if(this.idiomaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Idioma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.idioma=idiomaAux;
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
      		//this.finishProcessIdioma();
      	}
		
	}	
	
	public void actualizarRelaciones(Idioma idiomaLocal) throws Exception {
		
		if(this.idiomaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				idiomaLocal.setEmpleadoIdiomas(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());
			
			} else {
			
				idiomaLocal.setEmpleadoIdiomas(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Idioma idiomaLocal) throws Exception {	
		if(this.idiomaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarIdiomaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = idiomaValidator.getInvalidValues(this.idioma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Idioma idioma,List<Idioma> idiomas) throws Exception {
		try	{		
			IdiomaConstantesFunciones.actualizarLista(idioma,idiomas,this.idiomaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Idioma idioma,List<Idioma> idiomas) throws Exception {
		try	{			
			IdiomaConstantesFunciones.actualizarSelectedLista(idioma,idiomas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Idioma> idiomasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				idiomasLocal=this.idiomaLogic.getIdiomas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				idiomasLocal=this.idiomas;
			}
			//ARCHITECTURE
		
			for(Idioma idiomaLocal:idiomasLocal) {
				if(this.permiteMantenimiento(idiomaLocal) && idiomaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+IdiomaConstantesFunciones.getIdiomaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(IdiomaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIdioma.jLabelnombreIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IdiomaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIdioma.jLabeldescripcionIdioma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIdioma.jLabelnombreIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIdioma.jLabeldescripcionIdioma,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("EmpleadoIdioma")) {
			if(this.idioma==null) {
				this.idioma= new Idioma();
			}

			if(this.idiomaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoIdioma
				this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);

				this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.getempleadoidioma().setIdioma(this.idioma);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoIdioma--;	
		
		
		this.idiomaAux=new Idioma();
		
		this.idiomaAux.setId(this.iIdNuevoIdioma);
		this.idiomaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.idiomaLogic.getIdiomas().add(this.idiomaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.idiomas.add(this.idiomaAux);
		}
		//ARCHITECTURE
		
		this.idioma=this.idiomaAux;
		
		if(IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioIdioma(this.idioma);
			this.setVariablesObjetoActualToFormularioForeignKeyIdioma(this.idioma);
		}
				
		//this.setDefaultControlesIdioma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyIdioma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyIdioma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyIdioma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIdioma(this.idiomaBean,this.idioma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(IdiomaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.idiomaSessionBean.getConGuardarRelaciones()) {
			classes=IdiomaConstantesFunciones.getClassesRelationshipsOfIdioma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.idiomaReturnGeneral=idiomaLogic.procesarEventosIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.idiomaLogic.getIdiomas(),this.idioma,this.idiomaParameterGeneral,this.isEsNuevoIdioma,classes);//this.idiomaLogic.getIdioma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanIdioma(this.idiomaReturnGeneral,this.idiomaBean,false);
		
		if(this.idiomaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyIdioma(this.idiomaReturnGeneral.getIdioma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioIdioma(this.idiomaReturnGeneral.getIdioma());
		}
		
		if(this.idiomaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioIdioma(this.idiomaReturnGeneral.getIdioma(),classes);//this.idiomaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualIdioma(this.idioma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyIdioma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyIdioma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IdiomaBeanSwingJInternalFrameAdditional.RecargarFormIdioma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingIdioma(false);
						
			if(idiomaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.getEsGuardarRelacionado() && EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoIdiomaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIdioma();
			}
			
			this.actualizarVisualTableDatosIdioma();
			
			this.jTableDatosIdioma.setRowSelectionInterval(this.getIndiceNuevoIdioma(), this.getIndiceNuevoIdioma());
			
			this.seleccionarFilaTablaIdiomaActual();
						
			this.actualizarEstadoCeldasBotonesIdioma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesIdioma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.setEnabled(isHabilitar && this.idiomaConstantesFunciones.activarnombreIdioma);
		this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.setEnabled(isHabilitar && this.idiomaConstantesFunciones.activardescripcionIdioma);	
		
	};
	
	public void setDefaultControlesIdioma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoIdioma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.idiomaSessionBean.setConGuardarRelaciones(true);			
			this.idiomaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.idiomaSessionBean.setConGuardarRelaciones(false);			
			this.idiomaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoIdioma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
				if(idiomaAux.getId().equals(this.iIdNuevoIdioma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Idioma idiomaAux:this.idiomas) {
				if(idiomaAux.getId().equals(this.iIdNuevoIdioma)) {
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
	
	public int getIndiceActualIdioma(Idioma idioma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
				if(idiomaAux.getId().equals(idioma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Idioma idiomaAux:this.idiomas) {
				if(idiomaAux.getId().equals(idioma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalIdioma(Idioma idiomaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
				if(idiomaAux.getIdiomaOriginal().getId().equals(idiomaOriginal.getId())) {
					existe=true;
					idiomaOriginal.setId(idiomaAux.getId());
					idiomaOriginal.setVersionRow(idiomaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Idioma idiomaAux:this.idiomas) {
				if(idiomaAux.getIdiomaOriginal().getId().equals(idiomaOriginal.getId())) {
					existe=true;
					idiomaOriginal.setId(idiomaAux.getId());
					idiomaOriginal.setVersionRow(idiomaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosIdioma(Boolean esParaCancelar) throws Exception {
		idiomasAux=new ArrayList<Idioma>();
		idiomaAux=new Idioma();
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
					if(idiomaAux.getId()<0) {
						idiomasAux.add(idiomaAux);
					}		
				}
				this.iIdNuevoIdioma=0L;
				this.idiomaLogic.getIdiomas().removeAll(idiomasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Idioma idiomaAux:this.idiomas) {
					if(idiomaAux.getId()<0) {
						idiomasAux.add(idiomaAux);
					}		
				}
				this.iIdNuevoIdioma=0L;
				this.idiomas.removeAll(idiomasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoIdioma 
					&& this.idiomaLogic.getIdiomas().size()>0
					) {
					idiomaAux=this.idiomaLogic.getIdiomas().get(this.idiomaLogic.getIdiomas().size() - 1);
				
					if(idiomaAux.getId()<0) {
						this.idiomaLogic.getIdiomas().remove(idiomaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoIdioma && this.idiomas.size()>0) {
					idiomaAux=this.idiomas.get(this.idiomas.size() - 1);
				
					if(idiomaAux.getId()<0) {
						this.idiomas.remove(idiomaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoIdioma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(idioma.getId()<0) {
				this.idiomaLogic.getIdiomas().remove(this.idioma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(idioma.getId()<0) {
				this.idiomas.remove(this.idioma);
			}
		}			
	}
	
	public void setEstadosInicialesIdioma(List<Idioma> idiomasAux) throws Exception {
		IdiomaConstantesFunciones.setEstadosInicialesIdioma(idiomasAux);
	}
	
	public void setEstadosInicialesIdioma(Idioma idiomaAux) throws Exception {
		IdiomaConstantesFunciones.setEstadosInicialesIdioma(idiomaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarIdiomaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarIdiomaActual()) {
				if(!this.isEsNuevoIdioma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoIdioma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarIdiomaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Idioma ?", "MANTENIMIENTO DE Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Idioma idioma) throws Exception {
		IdiomaConstantesFunciones.seleccionarAsignar(this.idioma,idioma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarIdioma=this.isPermisoActualizarOriginalIdioma;
			
			
			this.seleccionarAsignar(idioma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IdiomaConstantesFunciones.quitarEspaciosIdioma(this.idioma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesIdioma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.idiomaSessionBean.setsFuncionBusquedaRapida(this.idiomaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoIdioma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosIdioma(esParaCancelar);				
				this.cancelarNuevoIdioma(esParaCancelar);								
			}
			
			this.idioma=new Idioma();
			
			this.inicializarIdioma();
			
			this.actualizarEstadoCeldasBotonesIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarIdioma() throws Exception {
		try {
			IdiomaConstantesFunciones.inicializarIdioma(this.idioma);
			
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
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.idiomaLogic.getIdiomas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteIdiomas(String sAccionBusqueda,List<Idioma> idiomasParaReportes) throws Exception {
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
					sPathReporteFinal="Idioma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="IdiomaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("IdiomaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Idioma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Idiomas");		
		parameters.put("busquedapor", IdiomaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(EmpleadoIdioma.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					IdiomaLogic idiomaLogicAuxiliar=new IdiomaLogic();
					idiomaLogicAuxiliar.setDatosCliente(idiomaLogic.getDatosCliente());				
					idiomaLogicAuxiliar.setIdiomas(idiomasParaReportes);
					
					idiomaLogicAuxiliar.cargarRelacionesLoteForeignKeyIdiomaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					idiomasParaReportes=idiomaLogicAuxiliar.getIdiomas();
					
					//idiomaLogic.getNewConnexionToDeep();
					
					//for (Idioma idioma:idiomasParaReportes) {
					//	idiomaLogic.deepLoad(idioma, false, DeepLoadType.INCLUDE, classes);
					//}						
					//idiomaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//idiomaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleadoIdioma = AuxiliarReportes.class.getResourceAsStream("EmpleadoIdiomaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleadoidioma", reportFileEmpleadoIdioma);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceIdioma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			IdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			IdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceIdioma=new JRBeanArrayDataSource(IdiomaJInternalFrame.TraerIdiomaBeans(idiomasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceIdioma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+IdiomaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+IdiomaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(IdiomaBean.TraerIdiomaBeans(idiomasParaReportes).toArray()));
							
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
				this.generarExcelReporteIdiomas(sAccionBusqueda,sTipoArchivoReporte,idiomasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalIdiomas(sAccionBusqueda,sTipoArchivoReporte,idiomasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoIdiomaActionPerformed(null);
					//this.generarExcelReporteIdiomas(sAccionBusqueda,sTipoArchivoReporte,idiomasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalIdiomas(sAccionBusqueda,sTipoArchivoReporte,idiomasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesIdiomas(sAccionBusqueda,sTipoArchivoReporte,idiomasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesIdiomas(sAccionBusqueda,sTipoArchivoReporte,idiomasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteIdiomas(String sAccionBusqueda,String sTipoArchivoReporte,List<Idioma> idiomasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"idioma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Idiomas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIdioma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Idioma idioma : idiomasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			IdiomaConstantesFunciones.generarExcelReporteDataIdioma("NORMAL",row,workbook,idioma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderIdioma(String sTipo,Row row,Workbook workbook) {
		
		IdiomaConstantesFunciones.generarExcelReporteHeaderIdioma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalIdiomas(String sAccionBusqueda,String sTipoArchivoReporte,List<Idioma> idiomasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"idioma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Idiomas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Idioma idioma : idiomasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(IdiomaConstantesFunciones.getIdiomaDescripcion(idioma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IdiomaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IdiomaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(idioma.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IdiomaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IdiomaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(idioma.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesIdiomas(String sAccionBusqueda,String sTipoArchivoReporte,List<Idioma> idiomasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Idioma> idiomasRespaldo=null;
		
		classes=IdiomaConstantesFunciones.getClassesRelationshipsOfIdioma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.idiomaLogic.setDatosCliente(this.datosCliente);
		this.idiomaLogic.setDatosDeep(this.datosDeep);
		this.idiomaLogic.setIsConDeep(true);
		
		idiomasRespaldo=this.idiomaLogic.getIdiomas();
		
		this.idiomaLogic.setIdiomas(idiomasParaReportes);	
		this.idiomaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		idiomasParaReportes=this.idiomaLogic.getIdiomas();
		this.idiomaLogic.setIdiomas(idiomasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"idioma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Idiomas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIdioma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Idioma idioma : idiomasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderIdioma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			IdiomaConstantesFunciones.generarExcelReporteDataIdioma("NORMAL",row,workbook,idioma,cellStyleDataAux);
		
			
			


				//EmpleadoIdioma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO))) {

				if(idioma.getEmpleadoIdiomas()!=null && idioma.getEmpleadoIdiomas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoIdiomaConstantesFunciones.generarExcelReporteHeaderEmpleadoIdioma("RELACIONADO",row,workbook);
				}

				if(idioma.getEmpleadoIdiomas()!=null) {
					i2=0;
					for(EmpleadoIdioma empleadoidioma : idioma.getEmpleadoIdiomas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoIdiomaConstantesFunciones.generarExcelReporteDataEmpleadoIdioma("RELACIONADO",row,workbook,empleadoidioma,cellStyleDataAuxHijo);
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
		cell.setCellValue(IdiomaConstantesFunciones.getIdiomaDescripcion(idioma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoIdioma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIdioma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessIdioma() throws Exception {		
		this.startProcessIdioma(true);
	}
	
	public void startProcessIdioma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesIdioma, this.jScrollPanelDatosIdioma,this.jPanelPaginacionIdioma, this.jScrollPanelDatosEdicionIdioma, this.jPanelAccionesIdioma,this.jPanelAccionesFormularioIdioma,this.jmenuBarIdioma,this.jmenuBarDetalleIdioma,this.jTtoolBarIdioma,this.jTtoolBarDetalleIdioma);		
		
		final JTabbedPane jTabbedPaneBusquedasIdioma=null; 
		
		final JPanel jPanelParametrosReportesIdioma=this.jPanelParametrosReportesIdioma;
		//final JScrollPane jScrollPanelDatosIdioma=this.jScrollPanelDatosIdioma;
		final JTable jTableDatosIdioma=this.jTableDatosIdioma;		
		final JPanel jPanelPaginacionIdioma=this.jPanelPaginacionIdioma;
		//final JScrollPane jScrollPanelDatosEdicionIdioma=this.jScrollPanelDatosEdicionIdioma;
		final JPanel jPanelAccionesIdioma=this.jPanelAccionesIdioma;
		
		JPanel jPanelCamposAuxiliarIdioma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarIdioma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
			jPanelCamposAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jPanelCamposIdioma;
			jPanelAccionesFormularioAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jPanelAccionesFormularioIdioma;
		}
		
		final JPanel jPanelCamposIdioma=jPanelCamposAuxiliarIdioma;
		final JPanel jPanelAccionesFormularioIdioma=jPanelAccionesFormularioAuxiliarIdioma;
		
		
		final JMenuBar jmenuBarIdioma=this.jmenuBarIdioma;
		final JToolBar jTtoolBarIdioma=this.jTtoolBarIdioma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarIdioma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIdioma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
			jmenuBarDetalleAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jmenuBarDetalleIdioma;
			jTtoolBarDetalleAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jTtoolBarDetalleIdioma;
		}
		
		final JMenuBar jmenuBarDetalleIdioma=jmenuBarDetalleAuxiliarIdioma;
		final JToolBar jTtoolBarDetalleIdioma=jTtoolBarDetalleAuxiliarIdioma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIdioma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIdioma;
			processRunnable.jTableDatos=jTableDatosIdioma;
			processRunnable.jPanelCampos=jPanelCamposIdioma;
			processRunnable.jPanelPaginacion=jPanelPaginacionIdioma;
			processRunnable.jPanelAcciones=jPanelAccionesIdioma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIdioma;
			
			
			processRunnable.jmenuBar=jmenuBarIdioma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIdioma;
			processRunnable.jTtoolBar=jTtoolBarIdioma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIdioma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIdioma ,jPanelParametrosReportesIdioma,jTableDatosIdioma, /*jScrollPanelDatosIdioma,*/jPanelCamposIdioma,jPanelPaginacionIdioma, /*jScrollPanelDatosEdicionIdioma,*/ jPanelAccionesIdioma,jPanelAccionesFormularioIdioma,jmenuBarIdioma,jmenuBarDetalleIdioma,jTtoolBarIdioma,jTtoolBarDetalleIdioma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesIdioma, jScrollPanelDatosIdioma,jPanelPaginacionIdioma, jScrollPanelDatosEdicionIdioma, jPanelAccionesIdioma,jPanelAccionesFormularioIdioma,jmenuBarIdioma,jmenuBarDetalleIdioma,jTtoolBarIdioma,jTtoolBarDetalleIdioma);
						
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
	
	public void finishProcessIdioma() {// throws Exception 
		this.finishProcessIdioma(true);
	}
	
	public void finishProcessIdioma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesIdioma, this.jScrollPanelDatosIdioma,this.jPanelPaginacionIdioma, this.jScrollPanelDatosEdicionIdioma, this.jPanelAccionesIdioma,this.jPanelAccionesFormularioIdioma,this.jmenuBarIdioma,this.jmenuBarDetalleIdioma,this.jTtoolBarIdioma,this.jTtoolBarDetalleIdioma);		
		
		final JTabbedPane jTabbedPaneBusquedasIdioma=null; 
		
		final JPanel jPanelParametrosReportesIdioma=this.jPanelParametrosReportesIdioma;
		//final JScrollPane jScrollPanelDatosIdioma=this.jScrollPanelDatosIdioma;
		final JTable jTableDatosIdioma=this.jTableDatosIdioma;		
		final JPanel jPanelPaginacionIdioma=this.jPanelPaginacionIdioma;
		//final JScrollPane jScrollPanelDatosEdicionIdioma=this.jScrollPanelDatosEdicionIdioma;
		final JPanel jPanelAccionesIdioma=this.jPanelAccionesIdioma;
		
		JPanel jPanelCamposAuxiliarIdioma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarIdioma=new JPanel();
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
			jPanelCamposAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jPanelCamposIdioma;
			jPanelAccionesFormularioAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jPanelAccionesFormularioIdioma;
		}
		
		final JPanel jPanelCamposIdioma=jPanelCamposAuxiliarIdioma;
		final JPanel jPanelAccionesFormularioIdioma=jPanelAccionesFormularioAuxiliarIdioma;
		
		
		final JMenuBar jmenuBarIdioma=this.jmenuBarIdioma;		
		final JToolBar jTtoolBarIdioma=this.jTtoolBarIdioma;
				
		JMenuBar jmenuBarDetalleAuxiliarIdioma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIdioma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
			jmenuBarDetalleAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jmenuBarDetalleIdioma;
			jTtoolBarDetalleAuxiliarIdioma=this.jInternalFrameDetalleFormIdioma.jTtoolBarDetalleIdioma;		
		}
		
		final JMenuBar jmenuBarDetalleIdioma=jmenuBarDetalleAuxiliarIdioma;
		final JToolBar jTtoolBarDetalleIdioma=jTtoolBarDetalleAuxiliarIdioma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIdioma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIdioma;
			processRunnable.jTableDatos=jTableDatosIdioma;
			processRunnable.jPanelCampos=jPanelCamposIdioma;
			processRunnable.jPanelPaginacion=jPanelPaginacionIdioma;
			processRunnable.jPanelAcciones=jPanelAccionesIdioma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIdioma;
			
			
			processRunnable.jmenuBar=jmenuBarIdioma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIdioma;
			processRunnable.jTtoolBar=jTtoolBarIdioma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIdioma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasIdioma ,jPanelParametrosReportesIdioma, jTableDatosIdioma,/*jScrollPanelDatosIdioma,*/jPanelCamposIdioma,jPanelPaginacionIdioma, /*jScrollPanelDatosEdicionIdioma,*/ jPanelAccionesIdioma,jPanelAccionesFormularioIdioma,jmenuBarIdioma,jmenuBarDetalleIdioma,jTtoolBarIdioma,jTtoolBarDetalleIdioma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesIdioma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarIdioma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuIdioma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarIdioma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarIdioma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleIdioma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuIdioma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarIdioma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleIdioma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.idiomaConstantesFunciones.getsFinalQueryIdioma();
		String  finalQueryPaginacionTodos=this.idiomaConstantesFunciones.getsFinalQueryIdioma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=IdiomaConstantesFunciones.getArrayColumnasGlobalesNoIdioma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=IdiomaConstantesFunciones.getArrayColumnasGlobalesIdioma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,IdiomaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.idiomasEliminados= new ArrayList<Idioma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessIdioma();
		
				///*IdiomaSessionBean*/this.idiomaSessionBean=new IdiomaSessionBean();
			
			if(this.idiomaSessionBean==null) {
				this.idiomaSessionBean=new IdiomaSessionBean();
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
					this.iNumeroPaginacion=IdiomaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=IdiomaConstantesFunciones.getClassesForeignKeysOfIdioma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/idioma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			idiomasAux= new ArrayList<Idioma>();
			
				
			idiomaLogic.setDatosCliente(this.datosCliente);
			idiomaLogic.setDatosDeep(this.datosDeep);
			idiomaLogic.setIsConDeep(true);
			
			
			idiomaLogic.getIdiomaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					idiomaLogic.getTodosIdiomas(finalQueryGlobal,pagination);
					
					//idiomaLogic.getTodosIdiomasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(idiomaLogic.getIdiomas()==null|| idiomaLogic.getIdiomas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							idiomasAux= new ArrayList<Idioma>();
							idiomasAux.addAll(idiomaLogic.getIdiomas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							idiomasAux= new ArrayList<Idioma>();
							idiomasAux.addAll(idiomas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							idiomaLogic.getTodosIdiomas(finalQueryGlobal+"",this.pagination);												
							
							//idiomaLogic.getTodosIdiomasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteIdiomas("Todos",idiomaLogic.getIdiomas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							idiomaLogic.setIdiomas(new ArrayList<Idioma>());					
							idiomaLogic.getIdiomas().addAll(idiomasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							idiomas=new ArrayList<Idioma>();
							idiomas.addAll(idiomasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idIdioma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idIdioma=this.idActual;
				
				} else if(this.idIdiomaActual!=null && this.idIdiomaActual!=0L) {
					idIdioma=idIdiomaActual;
				}
				
					
				this.sDetalleReporte=IdiomaConstantesFunciones.getDetalleIndicePorId(idIdioma);
				
				this.idiomas=new ArrayList<Idioma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					idiomaLogic.getEntity(idIdioma);
					
					//idiomaLogic.getEntityWithConnection(idIdioma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					idiomaLogic.setIdiomas(new ArrayList<Idioma>());
					idiomaLogic.getIdiomas().add(idiomaLogic.getIdioma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.idiomas=new ArrayList<Idioma>();
					this.idiomas.add(idioma);
				}
				
				if(idiomaLogic.getIdioma()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesIdioma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessIdioma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=idiomaLogic.getIdiomas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=idiomas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=idiomaLogic.getIdiomas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=idiomas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Idioma idioma) {
		Boolean permite=true;
		
		if(this.idioma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=IdiomaConstantesFunciones.getOrderByListaIdioma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=IdiomaConstantesFunciones.getOrderByListaIdioma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Idioma idioma:idiomaLogic.getIdiomas()) {
				if(idioma.getsType().equals(Constantes2.S_TOTALES)) {
					idiomaTotales=idioma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Idioma idioma:this.idiomas) {
				if(idioma.getsType().equals(Constantes2.S_TOTALES)) {
					idiomaTotales=idioma;
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
			this.idiomaAux=new Idioma();
			this.idiomaAux.setsType(Constantes2.S_TOTALES);
			this.idiomaAux.setIsNew(false);
			this.idiomaAux.setIsChanged(false);
			this.idiomaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				IdiomaConstantesFunciones.TotalizarValoresFilaIdioma(this.idiomaLogic.getIdiomas(),this.idiomaAux);
				
				this.idiomaLogic.getIdiomas().add(this.idiomaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				IdiomaConstantesFunciones.TotalizarValoresFilaIdioma(this.idiomas,this.idiomaAux);
				
				this.idiomas.add(this.idiomaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		idiomaTotales=new Idioma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.idiomaLogic.getIdiomas().remove(idiomaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.idiomas.remove(idiomaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		idiomaTotales=new Idioma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Idioma idioma:idiomaLogic.getIdiomas()) {
				if(idioma.getsType().equals(Constantes2.S_TOTALES)) {
					idiomaTotales=idioma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IdiomaConstantesFunciones.TotalizarValoresFilaIdioma(this.idiomaLogic.getIdiomas(),idiomaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Idioma idioma:this.idiomas) {
				if(idioma.getsType().equals(Constantes2.S_TOTALES)) {
					idiomaTotales=idioma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IdiomaConstantesFunciones.TotalizarValoresFilaIdioma(this.idiomas,idiomaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosIdioma() {
		this.isPermisoTodoIdioma=false;
		this.isPermisoNuevoIdioma=false;
		this.isPermisoActualizarIdioma=false;
		this.isPermisoActualizarOriginalIdioma=false;
		this.isPermisoEliminarIdioma=false;
		this.isPermisoGuardarCambiosIdioma=false;
		this.isPermisoConsultaIdioma=false;
		this.isPermisoBusquedaIdioma=false;
		this.isPermisoReporteIdioma=false;		
		this.isPermisoOrdenIdioma=false;		
		this.isPermisoPaginacionMedioIdioma=false;		
		this.isPermisoPaginacionAltoIdioma=false;
		this.isPermisoPaginacionTodoIdioma=false;
		this.isPermisoCopiarIdioma=false;		
		this.isPermisoVerFormIdioma=false;		
		this.isPermisoDuplicarIdioma=false;		
		this.isPermisoOrdenIdioma=false;		
	}
	
	public void setPermisosUsuarioIdioma(Boolean isPermiso) {
		this.isPermisoTodoIdioma=isPermiso;
		this.isPermisoNuevoIdioma=isPermiso;
		this.isPermisoActualizarIdioma=isPermiso;
		this.isPermisoActualizarOriginalIdioma=isPermiso;
		this.isPermisoEliminarIdioma=isPermiso;
		this.isPermisoGuardarCambiosIdioma=isPermiso;
		this.isPermisoConsultaIdioma=isPermiso;
		this.isPermisoBusquedaIdioma=isPermiso;
		this.isPermisoReporteIdioma=isPermiso;
		this.isPermisoOrdenIdioma=isPermiso;		
		this.isPermisoPaginacionMedioIdioma=isPermiso;		
		this.isPermisoPaginacionAltoIdioma=isPermiso;		
		this.isPermisoPaginacionTodoIdioma=isPermiso;		
		this.isPermisoCopiarIdioma=isPermiso;		
		this.isPermisoVerFormIdioma=isPermiso;		
		this.isPermisoDuplicarIdioma=isPermiso;
		this.isPermisoOrdenIdioma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioIdioma(Boolean isPermiso) {
		//this.isPermisoTodoIdioma=isPermiso;
		this.isPermisoNuevoIdioma=isPermiso;
		this.isPermisoActualizarIdioma=isPermiso;
		this.isPermisoActualizarOriginalIdioma=isPermiso;
		this.isPermisoEliminarIdioma=isPermiso;
		this.isPermisoGuardarCambiosIdioma=isPermiso;
		//this.isPermisoConsultaIdioma=isPermiso;
		//this.isPermisoBusquedaIdioma=isPermiso;
		//this.isPermisoReporteIdioma=isPermiso;
		//this.isPermisoOrdenIdioma=isPermiso;		
		//this.isPermisoPaginacionMedioIdioma=isPermiso;		
		//this.isPermisoPaginacionAltoIdioma=isPermiso;		
		//this.isPermisoPaginacionTodoIdioma=isPermiso;		
		//this.isPermisoCopiarIdioma=isPermiso;		
		//this.isPermisoDuplicarIdioma=isPermiso;
		//this.isPermisoOrdenIdioma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioIdiomaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoIdiomaConstantesFunciones.SNOMBREOPCION);
		
		if(IdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleadoIdioma=false;
		this.isTienePermisosEmpleadoIdioma=this.verificarGetPermisosUsuarioOpcionIdiomaClaseRelacionada(this.opcionsRelacionadas,EmpleadoIdiomaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebIdioma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioIdiomaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleadoIdioma=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioIdiomaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionIdiomaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioIdiomaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleadoIdioma && this.jInternalFrameDetalleFormIdioma!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.remove(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioIdioma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(IdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.idiomaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, IdiomaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoIdioma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarIdioma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalIdioma=this.isPermisoActualizarIdioma;
			this.isPermisoEliminarIdioma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosIdioma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaIdioma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaIdioma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoIdioma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteIdioma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIdioma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioIdioma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoIdioma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoIdioma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarIdioma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormIdioma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarIdioma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIdioma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.idiomaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosIdioma.setToolTipText(this.jTableDatosIdioma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioIdioma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioIdioma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(IdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(IdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioIdioma() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleadoIdioma && this.idiomaConstantesFunciones.mostrarEmpleadoIdiomaIdioma && !IdiomaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado Idioma");
			reporte.setsDescripcion("Empleado Idioma");
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
	
		
	public void inicializarCombosForeignKeyIdiomaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyIdiomaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(IdiomaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyIdiomaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyIdiomaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyIdioma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyIdioma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyIdioma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyIdioma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyIdioma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyIdioma(Idioma idioma)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyIdioma(Idioma idioma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyIdioma()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyIdioma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyIdioma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyIdioma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroIdioma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyIdioma()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyIdioma(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyIdioma()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public IdiomaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public IdiomaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public IdiomaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.idiomaSessionBean=new IdiomaSessionBean(); 
		this.idiomaConstantesFunciones=new IdiomaConstantesFunciones(); 
		this.idiomaBean=new Idioma();//(this.idiomaConstantesFunciones); 		
		this.idiomaReturnGeneral=new IdiomaParameterReturnGeneral(); 
		
		this.idiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.idiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public IdiomaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public IdiomaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public IdiomaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessIdioma(true);
			
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
			
			this.idiomaConstantesFunciones=new IdiomaConstantesFunciones(); 
			this.idiomaBean=new Idioma();//this.idiomaConstantesFunciones); 			
			this.idiomaReturnGeneral=new IdiomaParameterReturnGeneral(); 
		
			IdiomaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Idioma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.idioma=new Idioma();
			this.idiomas = new ArrayList<Idioma>();
			this.idiomasAux = new ArrayList<Idioma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic=new IdiomaLogic();
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			//this.idiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.idiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormIdioma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoIdioma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIdioma);	
					}
					
					if(this.jInternalFrameImportacionIdioma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIdioma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByIdioma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByIdioma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormIdioma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormIdioma);
				this.jInternalFrameDetalleFormIdioma.setVisible(false);
				this.jInternalFrameDetalleFormIdioma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoIdioma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIdioma);
					this.jInternalFrameReporteDinamicoIdioma.setVisible(false);
					this.jInternalFrameReporteDinamicoIdioma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionIdioma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionIdioma);
					this.jInternalFrameImportacionIdioma.setVisible(false);
					this.jInternalFrameImportacionIdioma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByIdioma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByIdioma);
					this.jInternalFrameOrderByIdioma.setVisible(false);
					this.jInternalFrameOrderByIdioma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idIdiomaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=IdiomaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.idiomaReturnGeneral=new IdiomaParameterReturnGeneral();
			
			this.idiomaParameterGeneral=new IdiomaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.idiomaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(IdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.idiomaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoIdiomaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IdiomaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.idiomaSessionBean.getEsGuardarRelacionado(),this.idiomaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IdiomaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.idiomaSessionBean.getEsGuardarRelacionado(),this.idiomaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoIdioma=false;
			this.isVisibilidadCeldaDuplicarIdioma=true;
			this.isVisibilidadCeldaCopiarIdioma=true;
			this.isVisibilidadCeldaVerFormIdioma=true;
			this.isVisibilidadCeldaOrdenIdioma=true;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
			this.isVisibilidadCeldaModificarIdioma=false;
			this.isVisibilidadCeldaActualizarIdioma=false;
			this.isVisibilidadCeldaEliminarIdioma=false;
			this.isVisibilidadCeldaCancelarIdioma=false;
			this.isVisibilidadCeldaGuardarIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosIdioma=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosIdioma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioIdioma(false);
			
			this.setPermisosUsuarioIdioma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.idiomaSessionBean.getEsGuardarRelacionado() 
				|| (this.idiomaSessionBean.getEsGuardarRelacionado() && this.idiomaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioIdiomaClasesRelacionadas();
			}
			
			if(this.idiomaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioIdiomaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!IdiomaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosIdioma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualIdioma();
			}
			
			if(!this.isPermisoBusquedaIdioma) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioIdioma,this.isPermisoPaginacionMedioIdioma,this.isPermisoPaginacionTodoIdioma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(IdiomaConstantesFunciones.getTiposSeleccionarIdioma());
				
				this.tiposColumnasSelect=IdiomaConstantesFunciones.getTiposSeleccionarIdioma(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectIdioma();				
				//this.tiposRelacionesSelect=IdiomaConstantesFunciones.getTiposRelacionesIdioma(true);
				
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
			//if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioIdioma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioIdioma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioIdioma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesIdioma() ;
			
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
			
			
			this.empleadoidiomaLogic=new EmpleadoIdiomaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				idiomaImplementable= (IdiomaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IdiomaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				idiomaImplementableHome= (IdiomaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IdiomaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.idiomas= new ArrayList<Idioma>();
			this.idiomasEliminados= new ArrayList<Idioma>();
						
			this.isEsNuevoIdioma=false;
			this.esParaAccionDesdeFormularioIdioma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyIdioma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroIdioma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			IdiomaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=IdiomaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingIdioma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormIdioma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioIdioma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioIdioma();
			}
			
			IdiomaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessIdioma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Idioma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectIdioma() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesIdioma")) {
				iIndex=this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosIdioma.getSelectedRow();	
				
				

				if(sTitle.equals("Empleado Idiomas")) {
					if(!EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessIdioma();

						this.cargarParteTabPanelRelacionadaEmpleadoIdioma(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessIdioma();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleadoIdioma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormIdioma.cargarSessionConBeanSwingJInternalFrameEmpleadoIdioma(false,true,iIndex);
		this.jButtonEmpleadoIdiomaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleadoIdioma();

		//this.jTabbedPaneRelacionesIdioma.updateUI();
		//this.jTabbedPaneRelacionesIdioma.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesIdioma.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("EmpleadoIdioma")) {
				int row=this.jTableDatosIdioma.getSelectedRow();
				jButtonEmpleadoIdiomaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado Idioma")) {

					if(this.isTienePermisosEmpleadoIdioma && this.idiomaConstantesFunciones.mostrarEmpleadoIdiomaIdioma && !IdiomaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleado Idiomas"+"("+EmpleadoIdiomaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleado Idiomas");

						if(idiomaConstantesFunciones.resaltarEmpleadoIdiomaIdioma!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(idiomaConstantesFunciones.resaltarEmpleadoIdiomaIdioma);
						}

						jmenuItem.setEnabled(this.idiomaConstantesFunciones.activarEmpleadoIdiomaIdioma);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EmpleadoIdioma"));

						

						this.jInternalFrameDetalleFormIdioma.jmenuDetalleIdioma.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyIdioma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyIdioma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyIdioma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyIdiomaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyIdioma();
		
		this.cargarCombosFrameForeignKeyIdioma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyIdioma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyIdioma();
		}
	}
	
	
	
	public void jButtonNuevoIdiomaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.idiomaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
			
			if(jTableDatosIdioma.getRowCount()>=1) {
				jTableDatosIdioma.removeRowSelectionInterval(0, jTableDatosIdioma.getRowCount()-1);						
			}
			
			this.isEsNuevoIdioma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoIdioma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesIdioma(true);			
			//this.idioma=new Idioma();
			//this.idioma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIdioma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIdioma() ;
			
			if(IdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIdioma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.idioma);	
			this.actualizarInformacion("INFO_PADRE",false,this.idioma);				
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
			if(this.idiomaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Idioma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarIdiomaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosIdioma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosIdioma.getSelectedRows().length;			
			}
			
			idiomasSeleccionados=this.getIdiomasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoIdioma--;			
				//Idioma idiomaAux= new Idioma();			
				//idiomaAux.setId(this.iIdNuevoIdioma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Idioma idiomaOrigen=new Idioma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Idioma idiomaOrigen : idiomasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							idiomaOrigen =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							idiomaOrigen =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaIdioma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.idioma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosIdioma(idiomaOrigen,this.idioma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.idiomaLogic.getIdiomas().add(this.idiomaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.idiomas.add(this.idiomaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaIdioma(false);
				
				this.jTableDatosIdioma.setRowSelectionInterval(this.getIndiceNuevoIdioma(), this.getIndiceNuevoIdioma());
				
				int iLastRow =  this.jTableDatosIdioma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIdioma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIdioma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIdioma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();									
		
			Idioma idiomaOrigen=new Idioma();
			Idioma idiomaDestino=new Idioma();
				
			idiomasSeleccionados=this.getIdiomasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosIdioma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || idiomasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosIdioma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						idiomaOrigen =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						idiomaOrigen =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						idiomaDestino =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						idiomaDestino =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				idiomaOrigen =idiomasSeleccionados.get(0);
				idiomaDestino =idiomasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosIdioma(idiomaOrigen,idiomaDestino,true,false);
				
				idiomaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(idiomaDestino,idiomaLogic.getIdiomas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(idiomaDestino,idiomas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaIdioma(false);
				
				//this.jTableDatosIdioma.setRowSelectionInterval(this.getIndiceNuevoIdioma(), this.getIndiceNuevoIdioma());
				
				int iLastRow =  this.jTableDatosIdioma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIdioma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIdioma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIdioma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormIdioma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesIdioma.isVisible();
			
			
			this.jPanelParametrosReportesIdioma.setVisible(!isVisible);
			this.jPanelPaginacionIdioma.setVisible(!isVisible);
			this.jPanelAccionesIdioma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameIdioma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoIdioma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionIdioma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByIdioma();
			
			this.abrirFrameOrderByIdioma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByIdioma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleIdioma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormIdioma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormIdioma.isMaximum()) {
					this.jInternalFrameDetalleFormIdioma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormIdioma.setSize(this.jInternalFrameDetalleFormIdioma.iWidthFormulario,this.jInternalFrameDetalleFormIdioma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormIdioma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormIdioma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormIdioma.isMaximum()) {
						this.jInternalFrameDetalleFormIdioma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormIdioma.jContentPaneDetalleIdioma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormIdioma.jContentPaneDetalleIdioma.getWidth(),IdiomaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormIdioma.jContentPaneDetalleIdioma.getWidth(),IdiomaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormIdioma.jContentPaneDetalleIdioma.getWidth(),IdiomaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleadoIdioma();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormIdioma.setVisible(true);
	        this.jInternalFrameDetalleFormIdioma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByIdioma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByIdioma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIdioma,false,this);
				} else {
					this.jInternalFrameOrderByIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIdioma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByIdioma);
				this.jInternalFrameOrderByIdioma.setVisible(false);
				this.jInternalFrameOrderByIdioma.setSelected(false);
				
				this.jInternalFrameOrderByIdioma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIdioma"));
				
				this.inicializarActualizarBindingTablaOrderByIdioma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionIdioma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionIdioma==null) {
				
				this.jInternalFrameImportacionIdioma=new ImportacionJInternalFrame(IdiomaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIdioma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionIdioma);
				this.jInternalFrameImportacionIdioma.setVisible(false);
				this.jInternalFrameImportacionIdioma.setSelected(false);


				this.jInternalFrameImportacionIdioma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIdioma"));
				this.jInternalFrameImportacionIdioma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIdioma"));
				this.jInternalFrameImportacionIdioma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIdioma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoIdioma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoIdioma==null) {
				this.jInternalFrameReporteDinamicoIdioma=new ReporteDinamicoJInternalFrame(IdiomaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIdioma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIdioma);
				this.jInternalFrameReporteDinamicoIdioma.setVisible(false);
				this.jInternalFrameReporteDinamicoIdioma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoIdioma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIdioma"));
				this.jInternalFrameReporteDinamicoIdioma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIdioma"));
				this.jInternalFrameReporteDinamicoIdioma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIdioma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIdioma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleadoIdioma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoIdioma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormIdioma.jContentPaneDetalleIdioma.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoIdioma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoIdioma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoIdioma.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleIdioma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormIdioma);
			
	       	this.jInternalFrameDetalleFormIdioma.setVisible(false);
	        this.jInternalFrameDetalleFormIdioma.setSelected(false);
			
			//this.jInternalFrameDetalleFormIdioma.dispose();
			//this.jInternalFrameDetalleFormIdioma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoIdioma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoIdioma.setVisible(true);
	        this.jInternalFrameReporteDinamicoIdioma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionIdioma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionIdioma.setVisible(true);
	        this.jInternalFrameImportacionIdioma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByIdioma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByIdioma.setVisible(true);
	        this.jInternalFrameOrderByIdioma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByIdioma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByIdioma.setVisible(false);
	        this.jInternalFrameOrderByIdioma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoIdioma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoIdioma.setVisible(false);
	        this.jInternalFrameReporteDinamicoIdioma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionIdioma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionIdioma.setVisible(false);
	        this.jInternalFrameImportacionIdioma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarIdioma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarIdioma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesIdioma(true);
			//this.isEsNuevoIdioma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesIdioma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIdioma(false) ;
			
			if(idiomaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.getEsGuardarRelacionado() && EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoIdiomaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(IdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIdioma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIdioma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaIdiomaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarIdioma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesIdioma(true);
			//this.isEsNuevoIdioma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.idioma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesIdioma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesIdioma(false) ;
			
			if(IdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIdioma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIdioma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesIdioma(false);
			
			//if(!this.isEsNuevoIdioma) {								
				int intSelectedRow = this.jTableDatosIdioma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
				
			}
			
			if(this.permiteMantenimiento(this.idioma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.idiomaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoIdioma=true;
					this.inicializarActualizarBindingTablaIdioma(false);
					this.isEsNuevoIdioma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoIdioma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoIdioma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIdioma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIdioma(false);
				
				this.habilitarDeshabilitarControlesIdioma(false);
			
												
				
				if(IdiomaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleIdioma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoIdiomaActionPerformed(evt,idiomaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualIdioma(this.idioma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosIdioma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,idiomaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.idioma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosIdioma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				this.idioma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				this.idioma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.idioma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.idiomaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((IdiomaModel) this.jTableDatosIdioma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoIdioma=true;
				this.inicializarActualizarBindingTablaIdioma(false);
				this.isEsNuevoIdioma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIdioma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIdioma(false);
				
				this.habilitarDeshabilitarControlesIdioma(false);
				
				
				
				if(IdiomaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleIdioma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarIdiomaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosIdioma.getRowCount()>=1) {
				jTableDatosIdioma.removeRowSelectionInterval(0, jTableDatosIdioma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesIdioma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaIdioma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIdioma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIdioma(false) ;
			
			this.isEsNuevoIdioma=false;
			
			if(IdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleIdioma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingIdioma(false);
				
				//SI ES MANUAL
				if(IdiomaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualIdioma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoIdioma--;			
			//Idioma idiomaAux= new Idioma();			
			//idiomaAux.setId(this.iIdNuevoIdioma);
			
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaIdioma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
			
			this.idioma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.idiomaLogic.getIdiomas().add(this.idiomaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.idiomas.add(this.idiomaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaIdioma(false);
			
			this.jTableDatosIdioma.setRowSelectionInterval(this.getIndiceNuevoIdioma(), this.getIndiceNuevoIdioma());
			
			int iLastRow =  this.jTableDatosIdioma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosIdioma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosIdioma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaIdioma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingIdioma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIdioma(false);
			
			//SI ES MANUAL
			if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIdioma();
			}
			
			//this.abrirFrameTreeIdioma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionIdiomaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE IdiomaS ?", "MANTENIMIENTO DE Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionIdioma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralIdioma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.idiomaReturnGeneral=idiomaLogic.procesarImportacionIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.idiomaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarIdiomaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionIdiomaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionIdioma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionIdioma.setFileImportacion(this.jInternalFrameImportacionIdioma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionIdioma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionIdioma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionIdioma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionIdioma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		

		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("IdiomaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"IdiomaBaseDesign.jrxml";
			
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
			
			this.generarReporteIdiomas("Todos",idiomasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IdiomaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IdiomaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoIdioma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoIdioma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case IdiomaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case IdiomaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoIdioma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case IdiomaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case IdiomaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoIdioma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIdioma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IdiomaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case IdiomaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoIdiomaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"idioma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Idiomas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case IdiomaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IdiomaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Idioma idioma:idiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(idioma.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IdiomaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IdiomaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Idioma idioma:idiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(idioma.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelIdioma(row);				
			//	iRow++;
			//}				
			
			//for(Idioma idiomaAux:idiomasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelIdioma(idiomaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
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
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIdioma(false);
			
			//SI ES MANUAL
			if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIdioma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIdioma(false);
			
			//SI ES MANUAL
			if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIdioma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIdioma(false);
			
			//SI ES MANUAL
			if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIdioma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.idiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaIdioma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosIdioma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosIdioma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosIdioma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosIdioma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosIdioma.setMinimumSize(dimensionMinimum);
		this.jTableDatosIdioma.setMaximumSize(dimensionMaximum);
		this.jTableDatosIdioma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingIdioma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingIdioma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingIdioma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaIdioma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesIdioma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasIdioma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIdioma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesIdioma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!IdiomaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualIdioma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaIdioma();
		
		this.inicializarActualizarBindingBotonesManualIdioma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualIdioma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIdioma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualIdioma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualIdioma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosIdioma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosIdioma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteIdioma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormIdioma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormIdioma.jCheckBoxPostAccionNuevoIdioma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormIdioma.jCheckBoxPostAccionSinCerrarIdioma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormIdioma.jCheckBoxPostAccionSinMensajeIdioma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosIdioma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosIdioma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteIdioma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormIdioma!=null) {
				this.jInternalFrameDetalleFormIdioma.jCheckBoxPostAccionNuevoIdioma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormIdioma.jCheckBoxPostAccionSinCerrarIdioma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormIdioma.jCheckBoxPostAccionSinMensajeIdioma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionIdioma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionIdioma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesIdioma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoIdioma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesIdioma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesIdioma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarIdioma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesIdioma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoIdioma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesIdioma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralIdioma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesIdioma(Boolean esInicializar) throws Exception {
		try	{	
			if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualIdioma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesIdioma() throws Exception {
		try	{
			if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualIdioma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIdioma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualIdioma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesIdioma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesIdioma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesIdioma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionIdioma.addItem(reporte);
			}
			
			
			if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionIdioma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionIdioma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesIdioma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesIdioma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarIdioma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarIdioma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIdioma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIdioma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIdioma!=null) {
				this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIdioma!=null) {
				this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoIdioma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoIdioma!=null) {
				
				if(this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIdioma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoIdioma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIdioma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIdioma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualIdioma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasIdioma(Boolean esInicializar) throws Exception {				
		if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualIdioma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaIdioma() throws Exception {
		this.inicializarActualizarBindingTablaIdioma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByIdioma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new IdiomaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new IdiomaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosIdiomaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIdiomaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new IdiomaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new IdiomaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaIdioma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=idiomaLogic.getIdiomas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=idiomas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosIdioma.setModel(new IdiomaModel(this.idiomaLogic.getIdiomas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosIdioma.setModel(new IdiomaModel(this.idiomas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByIdioma!=null && this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByIdioma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIdioma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new IdiomaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+IdiomaConstantesFunciones.SCLASSWEBTITULO,idiomaConstantesFunciones.resaltarSeleccionarIdioma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+IdiomaConstantesFunciones.SCLASSWEBTITULO,idiomaConstantesFunciones.resaltarSeleccionarIdioma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIdioma,IdiomaConstantesFunciones.LABEL_ID));

		if(this.idiomaConstantesFunciones.mostraridIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IdiomaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.idiomaConstantesFunciones.resaltaridIdioma,this.idiomaConstantesFunciones.activaridIdioma,this,true,"idIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.idiomaConstantesFunciones.resaltaridIdioma,this.idiomaConstantesFunciones.activaridIdioma,this,true,"idIdioma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIdioma,IdiomaConstantesFunciones.LABEL_NOMBRE));

		if(this.idiomaConstantesFunciones.mostrarnombreIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IdiomaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.idiomaConstantesFunciones.resaltarnombreIdioma,this.idiomaConstantesFunciones.activarnombreIdioma,this,true,"nombreIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.idiomaConstantesFunciones.resaltarnombreIdioma,this.idiomaConstantesFunciones.activarnombreIdioma,this,true,"nombreIdioma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIdioma,IdiomaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.idiomaConstantesFunciones.mostrardescripcionIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IdiomaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.idiomaConstantesFunciones.resaltardescripcionIdioma,this.idiomaConstantesFunciones.activardescripcionIdioma,this,true,"descripcionIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.idiomaConstantesFunciones.resaltardescripcionIdioma,this.idiomaConstantesFunciones.activardescripcionIdioma,this,true,"descripcionIdioma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleadoIdioma && this.idiomaConstantesFunciones.mostrarEmpleadoIdiomaIdioma && !IdiomaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleado Idiomas");
				tableColumn.setHeaderValue("Empleado Idiomas");
				tableColumn.setCellRenderer(new EmpleadoIdiomaTableCell(idiomaConstantesFunciones.resaltarEmpleadoIdiomaIdioma,this,this.idiomaConstantesFunciones.activarEmpleadoIdiomaIdioma));
				tableColumn.setCellEditor(new EmpleadoIdiomaTableCell(idiomaConstantesFunciones.resaltarEmpleadoIdiomaIdioma,this,this.idiomaConstantesFunciones.activarEmpleadoIdiomaIdioma));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosIdioma.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.idiomaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.idiomaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIdioma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.idiomaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.idiomaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIdioma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarIdioma && this.isPermisoGuardarCambiosIdioma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.idiomaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.idiomaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosIdioma.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.idiomaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosIdioma.addColumn(tableColumn);
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
			
			this.jTableDatosIdioma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIdioma && this.isPermisoGuardarCambiosIdioma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.idiomaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIdioma && this.isPermisoGuardarCambiosIdioma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosIdioma.moveColumn(this.jTableDatosIdioma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosIdioma.moveColumn(this.jTableDatosIdioma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.idiomaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosIdioma.moveColumn(this.jTableDatosIdioma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosIdioma.moveColumn(this.jTableDatosIdioma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosIdioma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosIdioma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosIdioma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosIdioma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosIdioma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosIdioma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosIdioma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosIdioma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=idiomaLogic.getIdiomas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=idiomas.size()-1;
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
		//this.jTableDatosIdioma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosIdioma();
			
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
				
				//this.isEsNuevoIdioma=false;
					
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
				if(this.idiomaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormIdioma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIdioma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIdioma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.idioma.getsType().equals("DUPLICADO")
				   || this.idioma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoIdioma=true;
				
				} else {
					this.isEsNuevoIdioma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
					if(this.idioma.getId()>=0 && !this.idioma.getIsNew()) {						
						this.isEsNuevoIdioma=false;
						
					} else {
						this.isEsNuevoIdioma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoIdioma(esRelaciones);						
				
				this.seleccionarIdioma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.idioma.getId()<0) {
					this.isEsNuevoIdioma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarIdioma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarIdioma(evt,rowIndex);
				}	
				
				if(this.idiomaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Idioma: " + this.dDif); 
					}
				}								
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarIdioma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.idioma)) {
					if(this.idioma.getId()>0) {
						this.idioma.setIsDeleted(true);
						
						this.idiomasEliminados.add(this.idioma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.idiomaLogic.getIdiomas().remove(this.idioma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.idiomas.remove(this.idioma);				
					}
					
					
					((IdiomaModel) this.jTableDatosIdioma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaIdioma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarIdioma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoIdioma) {
			
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIdioma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIdioma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioIdioma(this.idioma);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesIdioma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesIdioma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIdioma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoIdioma(Idioma idioma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoIdioma(idioma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoIdioma(Idioma idioma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioIdioma(idioma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyIdioma(idioma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyIdioma(idioma);
	}
	
	public void setVariablesObjetoActualToFormularioIdioma(Idioma idioma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.setText(idioma.getId().toString());
			this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.setText(idioma.getnombre());
			this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.setText(idioma.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Idioma idiomaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,idiomaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Idioma idiomaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				idiomaLocal=this.idioma;
			} else {
				idiomaLocal=this.idiomaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(idiomaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoIdioma(idiomaLocal,true);
					
					if(idiomaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(idiomaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.idiomaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(idiomaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoIdioma(Idioma idioma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIdioma(idioma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysIdioma(idioma);
	}
	
	public void setVariablesFormularioToObjetoActualIdioma(Idioma idioma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIdioma(idioma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualIdioma(Idioma idioma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.getText()==null || this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.getText()=="" || this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.getText()=="Id") {
				this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.setText("0");
			}

			if(conColumnasBase) {idioma.setId(Long.parseLong(this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IdiomaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIdioma.jLabelIdIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			idioma.setnombre(this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IdiomaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIdioma.jLabelnombreIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			idioma.setdescripcion(this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IdiomaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIdioma.jLabeldescripcionIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIdioma(Idioma idiomaBean,Idioma idioma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosIdioma(Idioma idiomaOrigen,Idioma idioma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && idiomaOrigen.getId()!=null && !idiomaOrigen.getId().equals(0L))) {idioma.setId(idiomaOrigen.getId());}}
			if(conDefault || (!conDefault && idiomaOrigen.getnombre()!=null && !idiomaOrigen.getnombre().equals(""))) {idioma.setnombre(idiomaOrigen.getnombre());}
			if(conDefault || (!conDefault && idiomaOrigen.getdescripcion()!=null && !idiomaOrigen.getdescripcion().equals(""))) {idioma.setdescripcion(idiomaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIdioma(Idioma idioma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.setText(idioma.getId().toString());
			this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.setText(idioma.getnombre());
			this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.setText(idioma.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIdioma(IdiomaBean idiomaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.setText(idiomaBean.getId().toString());
			this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.setText(idiomaBean.getnombre());
			this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.setText(idiomaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanIdioma(IdiomaParameterReturnGeneral idiomaReturnGeneral,IdiomaBean idiomaBean,Boolean conDefault) throws Exception { 
		try {
			Idioma idiomaLocal=new Idioma();
			
			idiomaLocal=idiomaReturnGeneral.getIdioma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && idiomaLocal.getId()!=null && !idiomaLocal.getId().equals(0L))) {idiomaBean.setId(idiomaLocal.getId());}}
			if(conDefault || (!conDefault && idiomaLocal.getnombre()!=null && !idiomaLocal.getnombre().equals(""))) {idiomaBean.setnombre(idiomaLocal.getnombre());}
			if(conDefault || (!conDefault && idiomaLocal.getdescripcion()!=null && !idiomaLocal.getdescripcion().equals(""))) {idiomaBean.setdescripcion(idiomaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxIdiomaGenerico(Long idIdiomaSeleccionado,JComboBox jComboBoxIdioma,List<Idioma> idiomasLocal)throws Exception {
		try {
			Idioma  idiomaTemp=null;

			for(Idioma idiomaAux:idiomasLocal) {
				if(idiomaAux.getId()!=null && idiomaAux.getId().equals(idIdiomaSeleccionado)) {
					idiomaTemp=idiomaAux;
					break;
				}
			}

			jComboBoxIdioma.setSelectedItem(idiomaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxIdiomaGenerico(JComboBox jComboBoxIdioma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIdioma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxIdioma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIdioma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxIdioma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("EmpleadoIdioma")) {
			jButtonEmpleadoIdiomaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			idioma=(Idioma) idiomaLogic.getIdiomas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			idioma =(Idioma) idiomas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Idioma idiomaRow=new Idioma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			idiomaRow=(Idioma) idiomaLogic.getIdiomas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			idiomaRow=(Idioma) idiomas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoIdiomaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Idioma idioma) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormIdioma==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.idioma = (Idioma)this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.idioma = (Idioma)this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(idioma!=null) {
						this.idioma = idioma;
					} else {
						this.idioma = new Idioma();
					}
				}

				if(this.isTienePermisosEmpleadoIdioma && this.permiteMantenimiento(this.idioma)) {
					EmpleadoIdiomaBeanSwingJInternalFrame empleadoidiomaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFramePopup=new EmpleadoIdiomaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoidiomaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFramePopup;
					} else {
						empleadoidiomaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame;
					}

					List<Idioma> idiomas=new ArrayList<Idioma>();
					idiomas.add(this.idioma);
					if(!esRelacionado) {
						//empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setConGuardarRelaciones(false);
						//empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoidiomaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormIdioma.cargarEmpleadoIdiomaBeanSwingJInternalFrame(idiomas,this.idioma,empleadoidiomaBeanSwingJInternalFrame,/*conInicializar,*/empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.getConGuardarRelaciones(),empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.getEsGuardarRelacionado());
					empleadoidiomaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoidiomaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoIdioma("no_relacionado");

						empleadoidiomaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoIdiomaConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoIdiomaConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoidiomaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderIdioma=(TitledBorder)this.jScrollPanelDatosIdioma.getBorder();
						TitledBorder titledBorderEmpleadoIdioma=(TitledBorder)empleadoidiomaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoIdioma.getBorder();

						titledBorderEmpleadoIdioma.setTitle(titledBorderIdioma.getTitle() + " -> Empleado Idioma");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoidiomaBeanSwingJInternalFrame);
						}

						empleadoidiomaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoidiomaBeanSwingJInternalFrame);

						empleadoidiomaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.idiomaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado Idioma",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualIdioma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoIdioma.setVisible((this.isVisibilidadCeldaNuevoIdioma && this.isPermisoNuevoIdioma));			
			this.jButtonDuplicarIdioma.setVisible((this.isVisibilidadCeldaDuplicarIdioma && this.isPermisoDuplicarIdioma));			
			this.jButtonCopiarIdioma.setVisible((this.isVisibilidadCeldaCopiarIdioma && this.isPermisoCopiarIdioma));
			this.jButtonVerFormIdioma.setVisible((this.isVisibilidadCeldaVerFormIdioma && this.isPermisoVerFormIdioma));
			
			this.jButtonAbrirOrderByIdioma.setVisible((this.isVisibilidadCeldaOrdenIdioma && this.isPermisoOrdenIdioma));			
			
			this.jButtonNuevoRelacionesIdioma.setVisible((this.isVisibilidadCeldaNuevoRelacionesIdioma && this.isPermisoNuevoIdioma));			
			this.jButtonNuevoGuardarCambiosIdioma.setVisible((this.isVisibilidadCeldaNuevoIdioma && this.isPermisoNuevoIdioma && this.isPermisoGuardarCambiosIdioma));
			
			if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.jInternalFrameDetalleFormIdioma.jButtonModificarIdioma.setVisible((this.isVisibilidadCeldaModificarIdioma && this.isPermisoActualizarIdioma));	
			this.jInternalFrameDetalleFormIdioma.jButtonActualizarIdioma.setVisible((this.isVisibilidadCeldaActualizarIdioma && this.isPermisoActualizarIdioma));	
			this.jInternalFrameDetalleFormIdioma.jButtonEliminarIdioma.setVisible((this.isVisibilidadCeldaEliminarIdioma && this.isPermisoEliminarIdioma));
			this.jInternalFrameDetalleFormIdioma.jButtonCancelarIdioma.setVisible(this.isVisibilidadCeldaCancelarIdioma);							
			this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.setVisible((this.isVisibilidadCeldaGuardarIdioma && this.isPermisoGuardarCambiosIdioma));			
			
			}
						
			this.jButtonGuardarCambiosTablaIdioma.setVisible((this.isVisibilidadCeldaGuardarCambiosIdioma && this.isPermisoGuardarCambiosIdioma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarIdioma.setVisible((this.isVisibilidadCeldaNuevoIdioma && this.isPermisoNuevoIdioma));						
			this.jButtonDuplicarToolBarIdioma.setVisible((this.isVisibilidadCeldaDuplicarIdioma && this.isPermisoDuplicarIdioma));						
			this.jButtonCopiarToolBarIdioma.setVisible((this.isVisibilidadCeldaCopiarIdioma && this.isPermisoCopiarIdioma));			
			this.jButtonVerFormToolBarIdioma.setVisible((this.isVisibilidadCeldaVerFormIdioma && this.isPermisoVerFormIdioma));			
			this.jButtonAbrirOrderByToolBarIdioma.setVisible((this.isVisibilidadCeldaOrdenIdioma && this.isPermisoOrdenIdioma));
			this.jButtonNuevoRelacionesToolBarIdioma.setVisible((this.isVisibilidadCeldaNuevoRelacionesIdioma && this.isPermisoNuevoIdioma));			
			this.jButtonNuevoGuardarCambiosToolBarIdioma.setVisible((this.isVisibilidadCeldaNuevoIdioma && this.isPermisoNuevoIdioma && this.isPermisoGuardarCambiosIdioma));			
			
			if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.jInternalFrameDetalleFormIdioma.jButtonModificarToolBarIdioma.setVisible((this.isVisibilidadCeldaModificarIdioma && this.isPermisoActualizarIdioma));	
			this.jInternalFrameDetalleFormIdioma.jButtonActualizarToolBarIdioma.setVisible((this.isVisibilidadCeldaActualizarIdioma  && this.isPermisoActualizarIdioma));	
			this.jInternalFrameDetalleFormIdioma.jButtonEliminarToolBarIdioma.setVisible((this.isVisibilidadCeldaEliminarIdioma && this.isPermisoEliminarIdioma));
			this.jInternalFrameDetalleFormIdioma.jButtonCancelarToolBarIdioma.setVisible(this.isVisibilidadCeldaCancelarIdioma);				
			this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosToolBarIdioma.setVisible((this.isVisibilidadCeldaGuardarIdioma && this.isPermisoGuardarCambiosIdioma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarIdioma.setVisible((this.isVisibilidadCeldaGuardarCambiosIdioma && this.isPermisoGuardarCambiosIdioma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoIdioma.setVisible((this.isVisibilidadCeldaNuevoIdioma && this.isPermisoNuevoIdioma));			
			this.jMenuItemDuplicarIdioma.setVisible((this.isVisibilidadCeldaDuplicarIdioma && this.isPermisoDuplicarIdioma));			
			this.jMenuItemCopiarIdioma.setVisible((this.isVisibilidadCeldaCopiarIdioma && this.isPermisoCopiarIdioma));			
			this.jMenuItemVerFormIdioma.setVisible((this.isVisibilidadCeldaVerFormIdioma && this.isPermisoVerFormIdioma));			
			this.jMenuItemAbrirOrderByIdioma.setVisible((this.isVisibilidadCeldaOrdenIdioma && this.isPermisoOrdenIdioma));			
			//this.jMenuItemMostrarOcultarIdioma.setVisible((this.isVisibilidadCeldaOrdenIdioma && this.isPermisoOrdenIdioma));
			this.jMenuItemDetalleAbrirOrderByIdioma.setVisible((this.isVisibilidadCeldaOrdenIdioma && this.isPermisoOrdenIdioma));			
			//this.jMenuItemDetalleMostrarOcultarIdioma.setVisible((this.isVisibilidadCeldaOrdenIdioma && this.isPermisoOrdenIdioma));			
			this.jMenuItemNuevoRelacionesIdioma.setVisible((this.isVisibilidadCeldaNuevoRelacionesIdioma && this.isPermisoNuevoIdioma));			
			this.jMenuItemNuevoGuardarCambiosIdioma.setVisible((this.isVisibilidadCeldaNuevoIdioma && this.isPermisoNuevoIdioma && this.isPermisoGuardarCambiosIdioma));									
			
			if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.jInternalFrameDetalleFormIdioma.jMenuItemModificarIdioma.setVisible((this.isVisibilidadCeldaModificarIdioma && this.isPermisoActualizarIdioma));	
			this.jInternalFrameDetalleFormIdioma.jMenuItemActualizarIdioma.setVisible((this.isVisibilidadCeldaActualizarIdioma && this.isPermisoActualizarIdioma));	
			this.jInternalFrameDetalleFormIdioma.jMenuItemEliminarIdioma.setVisible((this.isVisibilidadCeldaEliminarIdioma && this.isPermisoEliminarIdioma));
			this.jInternalFrameDetalleFormIdioma.jMenuItemCancelarIdioma.setVisible(this.isVisibilidadCeldaCancelarIdioma);				
			}
			
			this.jMenuItemGuardarCambiosIdioma.setVisible((this.isVisibilidadCeldaGuardarIdioma && this.isPermisoGuardarCambiosIdioma));						
			this.jMenuItemGuardarCambiosTablaIdioma.setVisible((this.isVisibilidadCeldaGuardarCambiosIdioma && this.isPermisoGuardarCambiosIdioma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoIdioma=this.jButtonNuevoIdioma.isVisible();
			this.isVisibilidadCeldaDuplicarIdioma=this.jButtonDuplicarIdioma.isVisible();
			this.isVisibilidadCeldaCopiarIdioma=this.jButtonCopiarIdioma.isVisible();
			this.isVisibilidadCeldaVerFormIdioma=this.jButtonVerFormIdioma.isVisible();
			
			this.isVisibilidadCeldaOrdenIdioma=this.jButtonAbrirOrderByIdioma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesIdioma=this.jButtonNuevoRelacionesIdioma.isVisible();
			this.isVisibilidadCeldaModificarIdioma=this.jButtonModificarIdioma.isVisible();
			
			if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.isVisibilidadCeldaActualizarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonActualizarIdioma.isVisible();
			this.isVisibilidadCeldaEliminarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonEliminarIdioma.isVisible();
			this.isVisibilidadCeldaCancelarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonCancelarIdioma.isVisible();
			this.isVisibilidadCeldaGuardarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosIdioma=this.jButtonGuardarCambiosTablaIdioma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoIdioma=this.jButtonNuevoToolBarIdioma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIdioma=this.jButtonNuevoRelacionesToolBarIdioma.isVisible();
			
			if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.isVisibilidadCeldaModificarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonModificarToolBarIdioma.isVisible();
			this.isVisibilidadCeldaActualizarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonActualizarToolBarIdioma.isVisible();
			this.isVisibilidadCeldaEliminarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonEliminarToolBarIdioma.isVisible();
			this.isVisibilidadCeldaCancelarIdioma=this.jInternalFrameDetalleFormIdioma.jButtonCancelarToolBarIdioma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIdioma=this.jButtonGuardarCambiosToolBarIdioma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIdioma=this.jButtonGuardarCambiosTablaToolBarIdioma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoIdioma=this.jMenuItemNuevoIdioma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIdioma=this.jMenuItemNuevoRelacionesIdioma.isVisible();
			
			if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.isVisibilidadCeldaModificarIdioma=this.jInternalFrameDetalleFormIdioma.jMenuItemModificarIdioma.isVisible();
			this.isVisibilidadCeldaActualizarIdioma=this.jInternalFrameDetalleFormIdioma.jMenuItemActualizarIdioma.isVisible();
			this.isVisibilidadCeldaEliminarIdioma=this.jInternalFrameDetalleFormIdioma.jMenuItemEliminarIdioma.isVisible();
			this.isVisibilidadCeldaCancelarIdioma=this.jInternalFrameDetalleFormIdioma.jMenuItemCancelarIdioma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIdioma=this.jMenuItemGuardarCambiosIdioma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIdioma=this.jMenuItemGuardarCambiosTablaIdioma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesIdioma(Boolean esInicializar) {
		if(IdiomaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.idiomaSessionBean.getConGuardarRelaciones()) {
				//if(this.idiomaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesIdioma();
			}
			
			this.inicializarActualizarBindingBotonesManualIdioma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualIdioma() {
		this.jButtonNuevoIdioma.setVisible(this.isPermisoNuevoIdioma);			
		this.jButtonDuplicarIdioma.setVisible(this.isPermisoDuplicarIdioma);			
		this.jButtonCopiarIdioma.setVisible(this.isPermisoCopiarIdioma);			
		this.jButtonVerFormIdioma.setVisible(this.isPermisoVerFormIdioma);			
		
		this.jButtonAbrirOrderByIdioma.setVisible(this.isPermisoOrdenIdioma);					
		
		this.jButtonNuevoRelacionesIdioma.setVisible(this.isPermisoNuevoIdioma);			
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonModificarIdioma.setVisible(this.isPermisoActualizarIdioma);	
			this.jInternalFrameDetalleFormIdioma.jButtonActualizarIdioma.setVisible(this.isPermisoActualizarIdioma);	
			this.jInternalFrameDetalleFormIdioma.jButtonEliminarIdioma.setVisible(this.isPermisoEliminarIdioma);
			this.jInternalFrameDetalleFormIdioma.jButtonCancelarIdioma.setVisible(this.isVisibilidadCeldaCancelarIdioma);						
			this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.setVisible(this.isPermisoGuardarCambiosIdioma);							
		}
		
		this.jButtonGuardarCambiosTablaIdioma.setVisible(this.isPermisoActualizarIdioma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleIdioma() {
		this.jInternalFrameDetalleFormIdioma.jButtonModificarIdioma.setVisible(this.isPermisoActualizarIdioma);	
		this.jInternalFrameDetalleFormIdioma.jButtonActualizarIdioma.setVisible(this.isPermisoActualizarIdioma);	
		this.jInternalFrameDetalleFormIdioma.jButtonEliminarIdioma.setVisible(this.isPermisoEliminarIdioma);
		this.jInternalFrameDetalleFormIdioma.jButtonCancelarIdioma.setVisible(this.isVisibilidadCeldaCancelarIdioma);							
		this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.setVisible((this.isVisibilidadCeldaGuardarIdioma && this.isPermisoGuardarCambiosIdioma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosIdioma() {
		if(IdiomaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualIdioma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesIdioma() {
	}
	
	public void jTableDatosIdiomaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarIdioma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIdioma(this.getidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.idioma==null) {
						this.idioma = new Idioma();
					}

					this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
				}

				if(this.idioma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.idioma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIdioma(this.getidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.idioma==null) {
						this.idioma = new Idioma();
					}

					this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
				}

				if(this.idioma.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.idioma.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIdioma(this.getidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.idioma==null) {
						this.idioma = new Idioma();
					}

					this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);
				}

				if(this.idioma.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.idioma.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameIdioma() {
		if(this.jInternalFrameDetalleFormIdioma!=null) {
		

		if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
			this.jInternalFrameDetalleFormIdioma.setVisible(false);	    			
			this.jInternalFrameDetalleFormIdioma.dispose();
			this.jInternalFrameDetalleFormIdioma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoIdioma!=null) {
			this.jInternalFrameReporteDinamicoIdioma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoIdioma.dispose();
			this.jInternalFrameReporteDinamicoIdioma=null;
		}
		
		if(this.jInternalFrameImportacionIdioma!=null) {
			this.jInternalFrameImportacionIdioma.setVisible(false);	    			
			this.jInternalFrameImportacionIdioma.dispose();
			this.jInternalFrameImportacionIdioma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessIdioma();
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
			
			if(sTipo.equals("NuevoIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarIdioma")) {
				jButtonDuplicarIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarIdioma")) {
				jButtonCopiarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("VerFormIdioma")) {
				jButtonVerFormIdiomaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarIdioma")) {
				jButtonDuplicarIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarIdioma")) {
				jButtonDuplicarIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarIdioma")) {
				jButtonModificarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarIdioma")) {
				jButtonModificarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarIdioma")) {
				jButtonModificarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarIdioma")) {
				jButtonActualizarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarIdioma")) {
				jButtonActualizarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarIdioma")) {
				jButtonActualizarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("EliminarIdioma")) {
				jButtonEliminarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarIdioma")) {
				jButtonEliminarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarIdioma")) {
				jButtonEliminarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CancelarIdioma")) {
				jButtonCancelarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarIdioma")) {
				jButtonCancelarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarIdioma")) {
				jButtonCancelarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CerrarIdioma")) {
				jButtonCerrarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarIdioma")) {
				jButtonCerrarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarIdioma")) {
				jButtonCerrarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarIdioma")) {
				jButtonMostrarOcultarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarIdioma")) {
				jButtonCancelarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarIdioma")) {
				jButtonCopiarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarIdioma")) {
				jButtonVerFormIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarIdioma")) {
				jButtonCopiarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormIdioma")) {
				jButtonVerFormIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionIdioma")) {
				jButtonRecargarInformacionIdiomaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarIdioma")) {
				jButtonRecargarInformacionIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionIdioma")) {
				jButtonRecargarInformacionIdiomaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresIdioma")) {
				jButtonAnterioresIdiomaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarIdioma")) {
				jButtonAnterioresIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreIdioma")) {
				jButtonAnterioresIdiomaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesIdioma")) {
				jButtonSiguientesIdiomaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarIdioma")) {
				jButtonSiguientesIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesIdioma")) {
				jButtonSiguientesIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByIdioma") || sTipo.equals("MenuItemDetalleAbrirOrderByIdioma")) {
				jButtonAbrirOrderByIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarIdioma") || sTipo.equals("MenuItemDetalleMostrarOcultarIdioma")) {
				jButtonMostrarOcultarIdiomaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosIdioma")) {
				jButtonNuevoGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarIdioma")) {
				jButtonNuevoGuardarCambiosIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosIdioma")) {
				jButtonNuevoGuardarCambiosIdiomaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoIdioma")) {
				jButtonCerrarReporteDinamicoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoIdioma")) {
				jButtonGenerarReporteDinamicoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoIdioma")) {
				
				jButtonGenerarExcelReporteDinamicoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionIdioma")) {
				jButtonCerrarImportacionIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionIdioma")) {
				
				jButtonGenerarImportacionIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionIdioma")) {
				
				jButtonAbrirImportacionIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesIdioma")) {
				jComboBoxTiposAccionesIdiomaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesIdioma")) {
				jComboBoxTiposRelacionesIdiomaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioIdioma")) {
				jComboBoxTiposAccionesIdiomaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarIdioma")) {
				
				jComboBoxTiposSeleccionarIdiomaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralIdioma")) {
				jTextFieldValorCampoGeneralIdiomaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByIdioma")) {
				jButtonAbrirOrderByIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarIdioma")) {
				jButtonAbrirOrderByIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByIdioma")) {
				jButtonCerrarOrderByIdiomaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIdiomaBusqueda")) {
				this.jButtonidIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreIdiomaBusqueda")) {
				this.jButtonnombreIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionIdiomaBusqueda")) {
				this.jButtondescripcionIdiomaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessIdioma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIdiomaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Idioma idiomaLocal=null;
			
			if(!this.getEsControlTabla()) {
				idiomaLocal=this.idioma;
			} else {
				idiomaLocal=this.idiomaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
							
				
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaAnterior =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idiomaAnterior =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
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
			
			


			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIdiomaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
								
						
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
								
				
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaAnterior =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idiomaAnterior =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaAnterior =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idiomaAnterior =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
							
				
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIdiomaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.idiomaAnterior =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.idiomaAnterior =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
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
			
			


			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
								
				
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaAnterior =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idiomaAnterior =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIdiomaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosIdioma")) {
					jCheckBoxSeleccionarTodosIdiomaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosIdioma")) {
					jCheckBoxSeleccionadosIdiomaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarIdioma")) {
					
				}
				
				


				
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
												
				
				


				
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIdiomaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.idiomaAnterior =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.idiomaAnterior =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIdiomaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
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
			
			


			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIdiomaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.idioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.idioma);
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
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
				
				


				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Idioma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Idioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.idiomaAnterior =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.idiomaAnterior =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarIdioma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosIdiomaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosIdioma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.idioma =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.idioma =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.idioma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarIdioma")) {
				
				}
				
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarIdioma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosIdioma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarIdioma")) {
			
			}
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessIdioma();
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
			if(sTipo.equals("NuevoIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarIdioma")) {
				jButtonDuplicarIdiomaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarIdioma")) {
				jButtonCopiarIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormIdioma")) {
				jButtonVerFormIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesIdioma")) {
				jButtonNuevoIdiomaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarIdioma")) {
				jButtonModificarIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarIdioma")) {
				jButtonActualizarIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarIdioma")) {
				jButtonEliminarIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarIdioma")) {
				jButtonCancelarIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarIdioma")) {
				jButtonCerrarIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosIdioma")) {
				jButtonGuardarCambiosIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosIdioma")) {
				jButtonNuevoGuardarCambiosIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByIdioma")) {
				jButtonAbrirOrderByIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionIdioma")) {
				jButtonRecargarInformacionIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresIdioma")) {
				jButtonAnterioresIdiomaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesIdioma")) {
				jButtonSiguientesIdiomaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIdiomaBusqueda")) {
				this.jButtonidIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreIdiomaBusqueda")) {
				this.jButtonnombreIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionIdiomaBusqueda")) {
				this.jButtondescripcionIdiomaBusquedaActionPerformed(evt);
			}
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessIdioma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameIdioma")) {
				closingInternalFrameIdioma();
				
			} else if(sTipo.equals("jButtonCancelarIdioma")) {
				JInternalFrameBase jInternalFrameDetalleFormIdioma = (JInternalFrameBase)evt.getSource();
	            	
	            IdiomaBeanSwingJInternalFrame jInternalFrameParent=(IdiomaBeanSwingJInternalFrame)jInternalFrameDetalleFormIdioma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarIdiomaActionPerformed(null);
			}
			
			IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.idioma,new Object(),this.idiomaParameterGeneral,this.idiomaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormIdioma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormIdioma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormIdioma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.idioma)) {
			if(!esControlTabla) {
				if(IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);			
				}
				
				if(this.idiomaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualIdioma(this.idioma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.idiomaReturnGeneral=idiomaLogic.procesarEventosIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.idiomaLogic.getIdiomas(),this.idioma,this.idiomaParameterGeneral,this.isEsNuevoIdioma,classes);//this.idiomaLogic.getIdioma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanIdioma(this.idiomaReturnGeneral,this.idiomaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.idiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanIdioma(classes,this.idiomaReturnGeneral,this.idiomaBean,false);
					}
						
					if(this.idiomaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyIdioma(this.idiomaReturnGeneral.getIdioma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioIdioma(this.idiomaReturnGeneral.getIdioma());	
					}
						
					if(this.idiomaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioIdioma(this.idiomaReturnGeneral.getIdioma(),classes);//this.idiomaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioIdioma(this.idioma,classes);//this.idiomaBean);									
				}
			
				if(IdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualIdioma(this.idioma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIdioma(this.idioma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.idiomaAnterior!=null) {
						this.idioma=this.idiomaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.idiomaReturnGeneral=idiomaLogic.procesarEventosIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.idiomaLogic.getIdiomas(),this.idioma,this.idiomaParameterGeneral,this.isEsNuevoIdioma,classes);//this.idiomaLogic.getIdioma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.idiomaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.idiomaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.idiomaReturnGeneral.getIdioma(),idiomaLogic.getIdiomas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.idiomaReturnGeneral.getIdioma(),this.idiomas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosIdioma.repaint();
				
				//((AbstractTableModel) this.jTableDatosIdioma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosIdioma();
			}
		}
	}
	
	public void actualizarVisualTableDatosIdioma() throws Exception {
		
		IdiomaModel idiomaModel=(IdiomaModel)this.jTableDatosIdioma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			idiomaModel.idiomas=this.idiomaLogic.getIdiomas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			idiomaModel.idiomas=this.idiomas;
		}
		
		
		((IdiomaModel) this.jTableDatosIdioma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaIdioma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getidiomaAnterior(),this.idiomaLogic.getIdiomas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getidiomaAnterior(),this.idiomas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosIdioma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioIdioma(Idioma idioma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoIdioma.class)) {
					this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.setEmpleadoIdiomas(idioma.getEmpleadoIdiomas());
					this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoIdioma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
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
										
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.idioma,new Object(),generalEntityParameterGeneral,this.idiomaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.idiomaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=IdiomaConstantesFunciones.getClassesRelationshipsOfIdioma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=IdiomaConstantesFunciones.getClassesRelationshipsFromStringsOfIdioma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormIdioma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				IdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.idioma,new Object(),generalEntityParameterGeneral,this.idiomaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioIdioma(IdiomaBean idiomaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoIdioma.class)) {
					this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.setEmpleadoIdiomas(idioma.getEmpleadoIdiomas());
					this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoIdioma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanIdioma(ArrayList<Classe> classes,IdiomaReturnGeneral idiomaReturnGeneral,IdiomaBean idiomaBean,Boolean conDefault) throws Exception {
		
			this.idiomaBean.setEmpleadoIdiomas(idiomaReturnGeneral.getIdioma().getEmpleadoIdiomas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualIdioma(Idioma idioma,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoIdioma.class)) {
					idioma.setEmpleadoIdiomas(this.jInternalFrameDetalleFormIdioma.empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaLogic.getEmpleadoIdiomas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.idioma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormIdioma = new IdiomaDetalleFormJInternalFrame(jDesktopPane,this.idiomaSessionBean.getConGuardarRelaciones(),this.idiomaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormIdioma);
		this.jInternalFrameDetalleFormIdioma.setVisible(false);
		this.jInternalFrameDetalleFormIdioma.setSelected(false);						
		
		this.jInternalFrameDetalleFormIdioma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormIdioma.idiomaLogic=this.idiomaLogic;
		
		this.cargarCombosFrameForeignKeyIdioma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleIdioma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIdioma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyIdioma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyIdioma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormIdioma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIdioma"));
		
		this.jInternalFrameDetalleFormIdioma.jButtonModificarIdioma.addActionListener(new ButtonActionListener(this,"ModificarIdioma"));

		
		this.jInternalFrameDetalleFormIdioma.jButtonModificarToolBarIdioma.addActionListener(new ButtonActionListener(this,"ModificarToolBarIdioma"));
					
		this.jInternalFrameDetalleFormIdioma.jMenuItemModificarIdioma.addActionListener(new ButtonActionListener(this,"MenuItemModificarIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonActualizarIdioma.addActionListener (new ButtonActionListener(this,"ActualizarIdioma"));
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonActualizarToolBarIdioma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIdioma"));
						
		this.jInternalFrameDetalleFormIdioma.jMenuItemActualizarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonEliminarIdioma.addActionListener (new ButtonActionListener(this,"EliminarIdioma"));
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonEliminarToolBarIdioma.addActionListener (new ButtonActionListener(this,"EliminarToolBarIdioma"));
								
		this.jInternalFrameDetalleFormIdioma.jMenuItemEliminarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonCancelarIdioma.addActionListener (new ButtonActionListener(this,"CancelarIdioma"));
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonCancelarToolBarIdioma.addActionListener (new ButtonActionListener(this,"CancelarToolBarIdioma"));
					
		this.jInternalFrameDetalleFormIdioma.jMenuItemCancelarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIdioma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormIdioma.jMenuItemDetalleCerrarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosToolBarIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIdioma"));
		
		
		
		this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosToolBarIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIdioma"));
		
		
		
		this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIdioma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtonidIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"idIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtonnombreIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"nombreIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtondescripcionIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionIdiomaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIdioma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameIdioma"));
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIdioma"));
		}
		
		this.jTableDatosIdioma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarIdioma"));
		
		this.jTableDatosIdioma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarIdioma"));
		
		this.jButtonNuevoIdioma.addActionListener(new ButtonActionListener(this,"NuevoIdioma"));
		
		this.jButtonDuplicarIdioma.addActionListener(new ButtonActionListener(this,"DuplicarIdioma"));
		
		this.jButtonCopiarIdioma.addActionListener(new ButtonActionListener(this,"CopiarIdioma"));
		
		this.jButtonVerFormIdioma.addActionListener(new ButtonActionListener(this,"VerFormIdioma"));
		
		
		this.jButtonNuevoToolBarIdioma.addActionListener(new ButtonActionListener(this,"NuevoToolBarIdioma"));
			
		this.jButtonDuplicarToolBarIdioma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarIdioma"));
			
		this.jMenuItemNuevoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoIdioma"));
			
		this.jMenuItemDuplicarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarIdioma"));		
		
		
		this.jButtonNuevoRelacionesIdioma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesIdioma"));
		
		
		this.jButtonNuevoRelacionesToolBarIdioma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarIdioma"));
			
		this.jMenuItemNuevoRelacionesIdioma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesIdioma"));		
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonModificarIdioma.addActionListener(new ButtonActionListener(this,"ModificarIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonModificarToolBarIdioma.addActionListener(new ButtonActionListener(this,"ModificarToolBarIdioma"));
			
			this.jInternalFrameDetalleFormIdioma.jMenuItemModificarIdioma.addActionListener(new ButtonActionListener(this,"MenuItemModificarIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormIdioma.jButtonActualizarIdioma.addActionListener (new ButtonActionListener(this,"ActualizarIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonActualizarToolBarIdioma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIdioma"));
				
			this.jInternalFrameDetalleFormIdioma.jMenuItemActualizarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonEliminarIdioma.addActionListener (new ButtonActionListener(this,"EliminarIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonEliminarToolBarIdioma.addActionListener (new ButtonActionListener(this,"EliminarToolBarIdioma"));
						
			this.jInternalFrameDetalleFormIdioma.jMenuItemEliminarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonCancelarIdioma.addActionListener (new ButtonActionListener(this,"CancelarIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonCancelarToolBarIdioma.addActionListener (new ButtonActionListener(this,"CancelarToolBarIdioma"));
			
			this.jInternalFrameDetalleFormIdioma.jMenuItemCancelarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIdioma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarIdioma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarIdioma"));		
		
		
		this.jButtonCerrarIdioma.addActionListener (new ButtonActionListener(this,"CerrarIdioma"));
		
		
		this.jButtonCerrarToolBarIdioma.addActionListener (new ButtonActionListener(this,"CerrarToolBarIdioma"));
			
		this.jMenuItemCerrarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarIdioma"));
			
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jMenuItemDetalleCerrarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosToolBarIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIdioma"));
		}
		
		this.jButtonCopiarToolBarIdioma.addActionListener (new ButtonActionListener(this,"CopiarToolBarIdioma"));
			
		this.jButtonVerFormToolBarIdioma.addActionListener (new ButtonActionListener(this,"VerFormToolBarIdioma"));
		
		this.jMenuItemGuardarCambiosIdioma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosIdioma"));
			
		this.jMenuItemCopiarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarIdioma"));		
		
		this.jMenuItemVerFormIdioma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormIdioma"));		
		
		
		this.jButtonGuardarCambiosTablaIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIdioma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarIdioma"));
			
		this.jMenuItemGuardarCambiosTablaIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIdioma"));		
		
		
		
		this.jButtonRecargarInformacionIdioma.addActionListener (new ButtonActionListener(this,"RecargarInformacionIdioma"));
					
		this.jButtonRecargarInformacionToolBarIdioma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarIdioma"));
		
		this.jMenuItemRecargarInformacionIdioma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionIdioma"));		
		
		
		
		this.jButtonAnterioresIdioma.addActionListener (new ButtonActionListener(this,"AnterioresIdioma"));
		
		
		this.jButtonAnterioresToolBarIdioma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarIdioma"));
		
		this.jMenuItemAnterioresIdioma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresIdioma"));		
		
		
		this.jButtonSiguientesIdioma.addActionListener (new ButtonActionListener(this,"SiguientesIdioma"));
		
		
		this.jButtonSiguientesToolBarIdioma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarIdioma"));
			
		this.jMenuItemSiguientesIdioma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesIdioma"));
			
		this.jMenuItemAbrirOrderByIdioma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByIdioma"));
			
		this.jMenuItemMostrarOcultarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarIdioma"));
			
		this.jMenuItemDetalleAbrirOrderByIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByIdioma"));
			
		this.jMenuItemDetalleMostarOcultarIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarIdioma"));		
		
		
		this.jButtonNuevoGuardarCambiosIdioma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosIdioma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarIdioma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarIdioma"));
			
		this.jMenuItemNuevoGuardarCambiosIdioma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosIdioma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosIdioma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosIdioma"));

		this.jCheckBoxSeleccionadosIdioma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosIdioma"));
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIdioma"));
		}
		
		
		this.jComboBoxTiposRelacionesIdioma.addActionListener (new ButtonActionListener(this,"TiposRelacionesIdioma"));
			
		this.jComboBoxTiposAccionesIdioma.addActionListener (new ButtonActionListener(this,"TiposAccionesIdioma"));
					
		this.jComboBoxTiposSeleccionarIdioma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarIdioma"));
			
		this.jTextFieldValorCampoGeneralIdioma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralIdioma"));		
		
		
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtonidIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"idIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtonnombreIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"nombreIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtondescripcionIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionIdiomaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoIdioma!=null) {
				this.jInternalFrameReporteDinamicoIdioma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIdioma"));
				this.jInternalFrameReporteDinamicoIdioma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIdioma"));
				this.jInternalFrameReporteDinamicoIdioma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIdioma"));
			}
			
			//this.jButtonCerrarReporteDinamicoIdioma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIdioma"));				
			//this.jButtonGenerarReporteDinamicoIdioma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIdioma"));
			//this.jButtonGenerarExcelReporteDinamicoIdioma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIdioma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionIdioma!=null) {
				this.jInternalFrameImportacionIdioma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIdioma"));
				this.jInternalFrameImportacionIdioma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIdioma"));
				this.jInternalFrameImportacionIdioma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIdioma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByIdioma.addActionListener (new ButtonActionListener(this,"AbrirOrderByIdioma"));
			
			this.jButtonAbrirOrderByToolBarIdioma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarIdioma"));			
			
			if(this.jInternalFrameOrderByIdioma!=null) {
				this.jInternalFrameOrderByIdioma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIdioma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIdioma.jTabbedPaneRelacionesIdioma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIdioma"));
		
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
            		closingInternalFrameIdioma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormIdioma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormIdioma = (JInternalFrameBase)event.getSource();
	            	
	            IdiomaBeanSwingJInternalFrame jInternalFrameParent=(IdiomaBeanSwingJInternalFrame)jInternalFrameDetalleFormIdioma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarIdiomaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosIdioma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosIdiomaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosIdioma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosIdioma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIdiomaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIdiomaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIdiomaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoIdioma";
		inputMap = this.jButtonNuevoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIdiomaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIdiomaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIdiomaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIdiomaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesIdioma";
		inputMap = this.jButtonNuevoRelacionesIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIdiomaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarIdioma";
		inputMap = this.jButtonModificarIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarIdioma";
		inputMap = this.jButtonActualizarIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarIdioma";
		inputMap = this.jButtonEliminarIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarIdioma";
		inputMap = this.jButtonCancelarIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarIdioma";
		inputMap = this.jButtonCerrarIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosIdioma";
		inputMap = this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormIdioma.jButtonGuardarCambiosIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosIdioma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosIdiomaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesIdioma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesIdiomaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarIdioma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarIdiomaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralIdioma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralIdiomaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtonidIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"idIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtonnombreIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"nombreIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIdioma.jButtondescripcionIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionIdiomaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarIdiomaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarIdioma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosIdioma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
					idiomaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Idioma idiomaAux:idiomas) {
					idiomaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosIdiomaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIdioma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
						idiomaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Idioma idiomaAux:idiomas) {
						idiomaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Idioma idiomaAux:idiomas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaIdioma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIdioma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIdioma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIdioma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosIdiomaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIdioma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosIdioma.getSelectedRows();
			
			Idioma idiomaLocal=new Idioma();
			
			//this.seleccionarTodosIdioma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					idiomaLocal =(Idioma) this.idiomaLogic.getIdiomas().toArray()[this.jTableDatosIdioma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					idiomaLocal =(Idioma) this.idiomas.toArray()[this.jTableDatosIdioma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				idiomaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
						idiomaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Idioma idiomaAux:idiomas) {
						idiomaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaIdioma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIdioma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIdioma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIdioma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualIdiomaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarIdiomaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralIdiomaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingIdioma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralIdioma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Idioma idiomaAux:this.idiomaLogic.getIdiomas()) {
				
						if(sTipoSeleccionar.equals(IdiomaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							idiomaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IdiomaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							idiomaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Idioma idiomaAux:idiomas) {
					
						if(sTipoSeleccionar.equals(IdiomaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							idiomaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IdiomaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							idiomaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaIdioma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesIdiomaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingIdioma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioIdioma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesIdioma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteIdioma) {				
					conSplash=true;//false;										
					
					//this.startProcessIdioma(conSplash);
				
					this.generarReporteIdiomasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoIdiomasSeleccionados();
				//this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIdiomasSeleccionados(false);
				//this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIdiomasSeleccionados(true);
				//this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIdioma();
				
				this.exportarIdiomasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionIdiomas();
				//this.importarIdiomas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIdioma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelIdiomasSeleccionados();
				//this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessIdioma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoIdioma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyIdioma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.setSelectedIndex(0);					
				}	
			} 			
			else if(IdiomaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteIdioma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessIdioma(conSplash);
					
						//this.actualizarParametrosGeneralIdioma();
						
						this.generarReporteProcesoAccionIdiomasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(IdiomaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO IdiomaS SELECCIONADOS?", "MANTENIMIENTO DE Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessIdioma();
				
						this.actualizarParametrosGeneralIdioma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.idiomaReturnGeneral=idiomaLogic.procesarAccionIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.idiomaLogic.getIdiomas(),this.idiomaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarIdiomaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralIdioma();
					
					IdiomaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarIdiomaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIdioma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIdioma.jComboBoxTiposAccionesFormularioIdioma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessIdioma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesIdiomaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessIdioma();
			
			if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
			Idioma idioma=new Idioma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingIdioma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesIdioma.getSelectedItem();
			
			
			
			
			idiomasSeleccionados=this.getIdiomasSeleccionados(true);
			//this.sTipoAccion;
			
			if(idiomasSeleccionados.size()==1) {
				for(Idioma idiomaAux:idiomasSeleccionados) {
					idioma=idiomaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado Idioma")) {
					jButtonEmpleadoIdiomaActionPerformed(null,rowIndex,true,false,idioma);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessIdioma();
			
      		//this.finishProcessIdioma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarIdiomaReturnGeneral() throws Exception {
		if(this.idiomaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.idiomaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.idiomaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.idiomaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.idiomaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.idiomaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingIdioma(false);
		}
		
		if(this.idiomaReturnGeneral.getConRetornoLista() || this.idiomaReturnGeneral.getConRetornoObjeto()) {
			if(this.idiomaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.idiomaLogic.setIdiomas(this.idiomaReturnGeneral.getIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.idiomaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.idiomaLogic.setIdioma(this.idiomaReturnGeneral.getIdioma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingIdioma(false);
		}
	}
	
	public void actualizarParametrosGeneralIdioma() throws Exception {
		
		
	}
	
	public ArrayList<Idioma> getIdiomasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioIdioma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Idioma idiomaAux:idiomaLogic.getIdiomas()) {
					if(idiomaAux.getIsSelected()) {
						idiomasSeleccionados.add(idiomaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Idioma idiomaAux:this.idiomas) {
					if(idiomaAux.getIsSelected()) {
						idiomasSeleccionados.add(idiomaAux);				
					}
				}
			}
			
			if(idiomasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						idiomasSeleccionados.addAll(this.idiomaLogic.getIdiomas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						idiomasSeleccionados.addAll(this.idiomas);				
					}
				}
			}
		} else {
			idiomasSeleccionados.add(this.idioma);
		}
		
		return idiomasSeleccionados;
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
	
	public void generarReporteIdiomasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalIdiomasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoIdiomasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIdiomasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIdiomasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesIdiomasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Idioma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesIdiomasSeleccionados() throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteIdiomas("Todos",idiomasSeleccionados);
		
	}	
	
	public void generarReporteNormalIdiomasSeleccionados() throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteIdiomas("Todos",idiomasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionIdiomasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteIdiomas("Todos",idiomasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoIdiomasSeleccionados() throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoIdioma();
		
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoIdioma();
		
		
		//this.generarReporteIdiomas("Todos",idiomasSeleccionados ,idiomaImplementable,idiomaImplementableHome);
	}
	
	public void mostrarImportacionIdiomas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionIdioma();
		
		this.abrirFrameImportacionIdioma();		
		
			
		//this.generarReporteIdiomas("Todos",idiomasSeleccionados ,idiomaImplementable,idiomaImplementableHome);
	}
	
	public void importarIdiomas() throws Exception {		
	
	}
	
	public void exportarIdiomasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelIdiomasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoIdiomasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlIdiomasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Idioma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoIdiomasSeleccionados() throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"idioma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarIdioma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Idioma idiomaAux:idiomasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarIdioma(idiomaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//idiomaAux.setsDetalleGeneralEntityReporte(idiomaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarIdioma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=IdiomaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IdiomaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IdiomaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IdiomaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarIdioma(Idioma idioma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=idioma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=idioma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=idioma.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=idioma.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelIdiomasSeleccionados() throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"idioma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Idiomas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelIdioma(row);				
				iRow++;
			}				
			
			for(Idioma idiomaAux:idiomasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelIdioma(idiomaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlIdiomasSeleccionados() throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();		
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"idioma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("idiomas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("idioma");
			//elementRoot.appendChild(element);
		
			for(Idioma idiomaAux:idiomasSeleccionados) {
				element = document.createElement("idioma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlIdioma(idiomaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelIdioma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(IdiomaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(IdiomaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(IdiomaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(IdiomaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelIdioma(Idioma idioma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(idioma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(idioma.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(idioma.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlIdioma(Idioma idioma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(IdiomaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(idioma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(IdiomaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(idioma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(IdiomaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(idioma.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(IdiomaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(idioma.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoIdiomasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Idioma> idiomasSeleccionados=new ArrayList<Idioma>();
		
		idiomasSeleccionados=this.getIdiomasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoIdioma(idiomasSeleccionados);
		
		this.generarReporteIdiomas("Todos",idiomasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoIdioma(ArrayList<Idioma> idiomasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Idioma idiomaAux:idiomasSeleccionados) {
				idiomaAux.setsDetalleGeneralEntityReporte(idiomaAux.toString());
			
				if(sTipoSeleccionar.equals(IdiomaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					idiomaAux.setsDescripcionGeneralEntityReporte1(idiomaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(IdiomaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					idiomaAux.setsDescripcionGeneralEntityReporte1(idiomaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesIdioma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoIdioma=true;
				this.isVisibilidadCeldaNuevoRelacionesIdioma=true;
				this.isVisibilidadCeldaGuardarCambiosIdioma=true;
			}
			
			this.isVisibilidadCeldaModificarIdioma=false;
			this.isVisibilidadCeldaActualizarIdioma=false;
			this.isVisibilidadCeldaEliminarIdioma=false;
			this.isVisibilidadCeldaCancelarIdioma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarIdioma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosIdioma=false;
			this.isVisibilidadCeldaModificarIdioma=false;
			this.isVisibilidadCeldaActualizarIdioma=true;
			this.isVisibilidadCeldaEliminarIdioma=false;
			this.isVisibilidadCeldaCancelarIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarIdioma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosIdioma=false;
			this.isVisibilidadCeldaModificarIdioma=false;
			this.isVisibilidadCeldaActualizarIdioma=true;
			this.isVisibilidadCeldaEliminarIdioma=true;
			this.isVisibilidadCeldaCancelarIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarIdioma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosIdioma=false;
			this.isVisibilidadCeldaModificarIdioma=false;
			this.isVisibilidadCeldaActualizarIdioma=true;
			this.isVisibilidadCeldaEliminarIdioma=false;
			this.isVisibilidadCeldaCancelarIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIdioma=false;
				} else {
					this.isVisibilidadCeldaGuardarIdioma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoIdioma=true;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=true;
			this.isVisibilidadCeldaGuardarCambiosIdioma=true;
			this.isVisibilidadCeldaModificarIdioma=false;
			this.isVisibilidadCeldaActualizarIdioma=false;
			this.isVisibilidadCeldaEliminarIdioma=false;
			this.isVisibilidadCeldaCancelarIdioma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarIdioma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosIdioma=false;
			this.isVisibilidadCeldaActualizarIdioma=false;
			this.isVisibilidadCeldaEliminarIdioma=false;
			this.isVisibilidadCeldaCancelarIdioma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIdioma=false;
				} else {
					this.isVisibilidadCeldaGuardarIdioma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosIdioma=false;
			this.isVisibilidadCeldaModificarIdioma=true;
			this.isVisibilidadCeldaActualizarIdioma=false;
			this.isVisibilidadCeldaEliminarIdioma=false;
			this.isVisibilidadCeldaCancelarIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIdioma=false;
				} else {
					this.isVisibilidadCeldaGuardarIdioma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(IdiomaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoIdioma=true;
			this.isVisibilidadCeldaNuevoRelacionesIdioma=true;
			this.isVisibilidadCeldaGuardarCambiosIdioma=true;
		} else {
			this.actualizarEstadoPanelsIdioma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarIdioma=false;
			//this.isVisibilidadCeldaVerFormIdioma=false;
			this.isVisibilidadCeldaDuplicarIdioma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!idiomaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
		} else {
			this.isVisibilidadCeldaNuevoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosIdioma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(idiomaSessionBean.getEsGuardarRelacionado()) {
			if(!idiomaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesIdioma=false;												
			}
			
			this.jButtonCerrarIdioma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesIdioma=false;
		}
		
		if(!this.permiteMantenimiento(this.idioma)) {
			this.isVisibilidadCeldaActualizarIdioma=false;
			this.isVisibilidadCeldaEliminarIdioma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesIdioma() {
		this.isVisibilidadCeldaNuevoIdioma=false;
		this.isVisibilidadCeldaGuardarCambiosIdioma=false;
	}
	
	public void actualizarEstadoPanelsIdioma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionIdioma!=null) {
				this.jScrollPanelDatosEdicionIdioma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIdioma!=null) {
				this.jScrollPanelDatosIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionIdioma!=null) {
				this.jPanelPaginacionIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIdioma!=null) {
				this.jPanelParametrosReportesIdioma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionIdioma!=null) {
				this.jScrollPanelDatosEdicionIdioma.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosIdioma!=null) {
				this.jScrollPanelDatosIdioma.setVisible(false);
			}
			
			if(this.jPanelPaginacionIdioma!=null) {
				this.jPanelPaginacionIdioma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIdioma!=null) {
				this.jPanelParametrosReportesIdioma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionIdioma!=null) {
				this.jScrollPanelDatosEdicionIdioma.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosIdioma!=null) {
				this.jScrollPanelDatosIdioma.setVisible(false);
			}
			
			if(this.jPanelPaginacionIdioma!=null) {
				this.jPanelPaginacionIdioma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIdioma!=null) {
				this.jPanelParametrosReportesIdioma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionIdioma!=null) {
				this.jScrollPanelDatosEdicionIdioma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIdioma!=null) {
				this.jScrollPanelDatosIdioma.setVisible(false);
			}
			
			if(this.jPanelPaginacionIdioma!=null) {
				this.jPanelPaginacionIdioma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIdioma!=null) {
				this.jPanelParametrosReportesIdioma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionIdioma!=null) {
				this.jScrollPanelDatosEdicionIdioma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIdioma!=null) {
				this.jScrollPanelDatosIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionIdioma!=null) {
				this.jPanelPaginacionIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIdioma!=null) {
				this.jPanelParametrosReportesIdioma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionIdioma!=null) {
				this.jScrollPanelDatosEdicionIdioma.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosIdioma!=null) {
				this.jScrollPanelDatosIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionIdioma!=null) {
				this.jPanelPaginacionIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIdioma!=null) {
				this.jPanelParametrosReportesIdioma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionIdioma!=null) {
				this.jScrollPanelDatosEdicionIdioma.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosIdioma!=null) {
				this.jScrollPanelDatosIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionIdioma!=null) {
				this.jPanelPaginacionIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIdioma!=null) {
				this.jPanelParametrosReportesIdioma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.idiomaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.idiomaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionIdiomaParaEmpleadoIdiomas() throws Exception {
		Boolean isPaginaPopupEmpleadoIdioma=false;

		try {

			if(this.idiomaSessionBean==null) {
				this.idiomaSessionBean=new IdiomaSessionBean();
			}

			if(this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean==null) {
				this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
			}

			this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean.setsPathNavegacionActual(idiomaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleadoIdioma=this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoIdioma(true);
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoIdioma(IdiomaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean.setisBusquedaDesdeForeignKeySesionIdioma(true);
			this.jInternalFrameDetalleFormIdioma.empleadoidiomaSessionBean.setlidIdiomaActual(this.idIdiomaActual);

			idiomaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyIdioma(true);
			idiomaSessionBean.setlIdIdiomaActualForeignKey(this.idIdiomaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//IdiomaSessionBean idiomaSessionBean=new IdiomaSessionBean();
		
		if(this.idiomaSessionBean==null) {
			this.idiomaSessionBean=new IdiomaSessionBean();
		}
		
		this.idiomaSessionBean.setsUltimaBusquedaIdioma(this.getsAccionBusqueda());
		this.idiomaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.idiomaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//IdiomaSessionBean idiomaSessionBean=new IdiomaSessionBean();
		
		if(this.idiomaSessionBean==null) {
			this.idiomaSessionBean=new IdiomaSessionBean();
		}
		
		if(this.idiomaSessionBean.getsUltimaBusquedaIdioma()!=null&&!this.idiomaSessionBean.getsUltimaBusquedaIdioma().equals("")) {
			this.setsAccionBusqueda(idiomaSessionBean.getsUltimaBusquedaIdioma());
			this.setiNumeroPaginacion(idiomaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(idiomaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.idiomaSessionBean.setsUltimaBusquedaIdioma("");
		this.idiomaSessionBean.setiNumeroPaginacion(IdiomaConstantesFunciones.INUMEROPAGINACION);
		this.idiomaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaIdioma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioIdioma() {
		this.updateBorderResaltarBusquedasFormularioIdioma();
		this.updateVisibilidadBusquedasFormularioIdioma();
		this.updateHabilitarBusquedasFormularioIdioma();
	}
	
	public void updateBorderResaltarBusquedasFormularioIdioma() {					
	}
	
	public void updateVisibilidadBusquedasFormularioIdioma() {
	}
	
	public void updateHabilitarBusquedasFormularioIdioma() {
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
	
	public void updateControlesFormularioIdioma() throws Exception {

		if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioIdioma();
		this.updateVisibilidadResaltarControlesFormularioIdioma();
		this.updateHabilitarResaltarControlesFormularioIdioma();
		
	}
	
	public void updateBorderResaltarControlesFormularioIdioma() throws Exception {
		if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.idiomaConstantesFunciones.resaltaridIdioma!=null && this.jInternalFrameDetalleFormIdioma!=null) {this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.setBorder(this.idiomaConstantesFunciones.resaltaridIdioma);}
		if(this.idiomaConstantesFunciones.resaltarnombreIdioma!=null && this.jInternalFrameDetalleFormIdioma!=null) {this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.setBorder(this.idiomaConstantesFunciones.resaltarnombreIdioma);}
		if(this.idiomaConstantesFunciones.resaltardescripcionIdioma!=null && this.jInternalFrameDetalleFormIdioma!=null) {this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.setBorder(this.idiomaConstantesFunciones.resaltardescripcionIdioma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioIdioma() throws Exception {		
		if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
	
		//this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.setVisible(this.idiomaConstantesFunciones.mostraridIdioma);
		this.jInternalFrameDetalleFormIdioma.jPanelidIdioma.setVisible(this.idiomaConstantesFunciones.mostraridIdioma);
		//this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.setVisible(this.idiomaConstantesFunciones.mostrarnombreIdioma);
		this.jInternalFrameDetalleFormIdioma.jPanelnombreIdioma.setVisible(this.idiomaConstantesFunciones.mostrarnombreIdioma);
		//this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.setVisible(this.idiomaConstantesFunciones.mostrardescripcionIdioma);
		this.jInternalFrameDetalleFormIdioma.jPaneldescripcionIdioma.setVisible(this.idiomaConstantesFunciones.mostrardescripcionIdioma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioIdioma() throws Exception {
		if(this.jInternalFrameDetalleFormIdioma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIdioma!=null) {
	
		this.jInternalFrameDetalleFormIdioma.jTextFieldidIdioma.setEnabled(this.idiomaConstantesFunciones.activaridIdioma);
		this.jInternalFrameDetalleFormIdioma.jTextAreanombreIdioma.setEnabled(this.idiomaConstantesFunciones.activarnombreIdioma);
		this.jInternalFrameDetalleFormIdioma.jTextAreadescripcionIdioma.setEnabled(this.idiomaConstantesFunciones.activardescripcionIdioma);
		}
	}
	
		
}
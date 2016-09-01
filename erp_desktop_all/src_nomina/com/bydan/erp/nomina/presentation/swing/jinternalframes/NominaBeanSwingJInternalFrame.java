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

import com.bydan.erp.nomina.util.NominaConstantesFunciones;
import com.bydan.erp.nomina.util.NominaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.NominaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.NominaBean;
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
public class NominaBeanSwingJInternalFrame extends NominaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NominaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Nomina> nominaValidator = new ClassValidator<Nomina>(Nomina.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Nomina nomina;	
	public Nomina nominaAux;
	public Nomina nominaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Nomina nominaTotales;
	public Long idNominaActual;
	public Long iIdNuevoNomina=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoNomina;
	public Boolean isPermisoNuevoNomina;
	public Boolean isPermisoActualizarNomina;
	public Boolean isPermisoActualizarOriginalNomina;
	public Boolean isPermisoEliminarNomina;
	public Boolean isPermisoGuardarCambiosNomina;
	public Boolean isPermisoConsultaNomina;
	public Boolean isPermisoBusquedaNomina;
	public Boolean isPermisoReporteNomina;
	public Boolean isPermisoPaginacionMedioNomina;
	public Boolean isPermisoPaginacionAltoNomina;
	public Boolean isPermisoPaginacionTodoNomina;
	public Boolean isPermisoCopiarNomina;
	public Boolean isPermisoVerFormNomina;
	public Boolean isPermisoDuplicarNomina;
	public Boolean isPermisoOrdenNomina;
	
	
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
	
	public NominaParameterReturnGeneral nominaReturnGeneral;
	public NominaParameterReturnGeneral nominaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNomina=false;
	public Boolean esParaAccionDesdeFormularioNomina=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NominaSessionBeanAdditional nominaSessionBeanAdditional=null;
	
	public NominaSessionBeanAdditional getNominaSessionBeanAdditional() {
		return this.nominaSessionBeanAdditional;
	}
	
	public void setNominaSessionBeanAdditional(NominaSessionBeanAdditional nominaSessionBeanAdditional) {
		try {
			this.nominaSessionBeanAdditional=nominaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NominaBeanSwingJInternalFrameAdditional nominaBeanSwingJInternalFrameAdditional=null;
	//public class NominaBeanSwingJInternalFrame
	
	public NominaBeanSwingJInternalFrameAdditional getNominaBeanSwingJInternalFrameAdditional() {
		return this.nominaBeanSwingJInternalFrameAdditional;
	}
	
	public void setNominaBeanSwingJInternalFrameAdditional(NominaBeanSwingJInternalFrameAdditional nominaBeanSwingJInternalFrameAdditional) {
		try {
			this.nominaBeanSwingJInternalFrameAdditional=nominaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NominaLogic nominaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Nomina nominaBean;
	public NominaConstantesFunciones nominaConstantesFunciones;
	//public NominaParameterReturnGeneral nominaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Nomina> nominas;	
	//public List<Nomina> nominasEliminados;
	//public List<Nomina> nominasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNomina=false;
	public Boolean isVisibilidadCeldaDuplicarNomina=true;
	public Boolean isVisibilidadCeldaCopiarNomina=true;
	public Boolean isVisibilidadCeldaVerFormNomina=true;
	public Boolean isVisibilidadCeldaOrdenNomina=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNomina=false;
	public Boolean isVisibilidadCeldaModificarNomina=false;
	public Boolean isVisibilidadCeldaActualizarNomina=false;
	public Boolean isVisibilidadCeldaEliminarNomina=false;
	public Boolean isVisibilidadCeldaCancelarNomina=false;
	public Boolean isVisibilidadCeldaGuardarNomina=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNomina=false;	
	
	
	
	public Long getiIdNuevoNomina() {
		return this.iIdNuevoNomina;
	}

	public void setiIdNuevoNomina(Long iIdNuevoNomina) {
		this.iIdNuevoNomina = iIdNuevoNomina;
	}
	
	public Long getidNominaActual() {
		return this.idNominaActual;
	}

	public void setidNominaActual(Long idNominaActual) {
		this.idNominaActual = idNominaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Nomina getnomina() {
		return this.nomina;
	}

	public void setnomina(Nomina nomina) {
		this.nomina = nomina;
	}
	
	public Nomina getnominaAux() {
		return this.nominaAux;
	}

	public void setnominaAux(Nomina nominaAux) {
		this.nominaAux = nominaAux;
	}				
	
	public Nomina getnominaAnterior() {
		return this.nominaAnterior;
	}

	public void setnominaAnterior(Nomina nominaAnterior) {
		this.nominaAnterior = nominaAnterior;
	}	
	
	public Nomina getnominaTotales() {
		return this.nominaTotales;
	}

	public void setnominaTotales(Nomina nominaTotales) {
		this.nominaTotales = nominaTotales;
	}	
	
	public Nomina getnominaBean() {
		return this.nominaBean;
	}

	public void setnominaBean(Nomina nominaBean) {
		this.nominaBean = nominaBean;
	}	
	
	public NominaParameterReturnGeneral getnominaReturnGeneral() {
		return this.nominaReturnGeneral;
	}

	public void setnominaReturnGeneral(NominaParameterReturnGeneral nominaReturnGeneral) {
		this.nominaReturnGeneral = nominaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NominaLogic getNominaLogic()	{		
		return nominaLogic;
	}

	public void setNominaLogic(NominaLogic nominaLogic) {
		this.nominaLogic = nominaLogic;
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
	
	public Boolean getIsEsNuevoNomina() {
		return isEsNuevoNomina;
	}

	public void setIsEsNuevoNomina(Boolean isEsNuevoNomina) {
		this.isEsNuevoNomina = isEsNuevoNomina;
	}

	public Boolean getEsParaAccionDesdeFormularioNomina() {
		return esParaAccionDesdeFormularioNomina;
	}
	
	public void setEsParaAccionDesdeFormularioNomina(Boolean esParaAccionDesdeFormularioNomina) {
		this.esParaAccionDesdeFormularioNomina = esParaAccionDesdeFormularioNomina;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesNomina() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NominaConstantesFunciones.refrescarForeignKeysDescripcionesNomina(this.nominaLogic.getNominas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NominaConstantesFunciones.refrescarForeignKeysDescripcionesNomina(this.nominas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//nominaLogic.setNominas(this.nominas);
			nominaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NominaParameterReturnGeneral getNominaParameterGeneral() {
		return this.nominaParameterGeneral;
	}
	
	public void setNominaParameterGeneral(NominaParameterReturnGeneral nominaParameterGeneral) {
		this.nominaParameterGeneral = nominaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNomina() {
		return isPermisoTodoNomina;
	}

	public void setIsPermisoTodoNomina(Boolean isPermisoTodoNomina) {
		this.isPermisoTodoNomina = isPermisoTodoNomina;
	}

	public Boolean getIsPermisoNuevoNomina() {
		return isPermisoNuevoNomina;
	}

	public void setIsPermisoNuevoNomina(Boolean isPermisoNuevoNomina) {
		this.isPermisoNuevoNomina = isPermisoNuevoNomina;
	}

	public Boolean getIsPermisoActualizarNomina() {
		return isPermisoActualizarNomina;
	}

	public void setIsPermisoActualizarNomina(Boolean isPermisoActualizarNomina) {
		this.isPermisoActualizarNomina = isPermisoActualizarNomina;
	}

	public Boolean getIsPermisoEliminarNomina() {
		return isPermisoEliminarNomina;
	}

	public void setIsPermisoEliminarNomina(Boolean isPermisoEliminarNomina) {
		this.isPermisoEliminarNomina = isPermisoEliminarNomina;
	}

	public Boolean getIsPermisoGuardarCambiosNomina() {
		return isPermisoGuardarCambiosNomina;
	}

	public void setIsPermisoGuardarCambiosNomina(Boolean isPermisoGuardarCambiosNomina) {
		this.isPermisoGuardarCambiosNomina = isPermisoGuardarCambiosNomina;
	}
	
	public Boolean getIsPermisoConsultaNomina() {
		return isPermisoConsultaNomina;
	}

	public void setIsPermisoConsultaNomina(Boolean isPermisoConsultaNomina) {
		this.isPermisoConsultaNomina = isPermisoConsultaNomina;
	}

	public Boolean getIsPermisoBusquedaNomina() {
		return isPermisoBusquedaNomina;
	}

	public void setIsPermisoBusquedaNomina(Boolean isPermisoBusquedaNomina) {
		this.isPermisoBusquedaNomina = isPermisoBusquedaNomina;
	}

	public Boolean getIsPermisoReporteNomina() {
		return isPermisoReporteNomina;
	}

	public void setIsPermisoReporteNomina(Boolean isPermisoReporteNomina) {
		this.isPermisoReporteNomina = isPermisoReporteNomina;
	}
	
	public Boolean getIsPermisoPaginacionMedioNomina() {
		return isPermisoPaginacionMedioNomina;
	}

	public void setIsPermisoPaginacionMedioNomina(Boolean isPermisoPaginacionMedioNomina) {
		this.isPermisoPaginacionMedioNomina = isPermisoPaginacionMedioNomina;
	}
	
	public Boolean getIsPermisoPaginacionTodoNomina() {
		return isPermisoPaginacionTodoNomina;
	}

	public void setIsPermisoPaginacionTodoNomina(Boolean isPermisoPaginacionTodoNomina) {
		this.isPermisoPaginacionTodoNomina = isPermisoPaginacionTodoNomina;
	}
	
	public Boolean getIsPermisoPaginacionAltoNomina() {
		return isPermisoPaginacionAltoNomina;
	}

	public void setIsPermisoPaginacionAltoNomina(Boolean isPermisoPaginacionAltoNomina) {
		this.isPermisoPaginacionAltoNomina = isPermisoPaginacionAltoNomina;
	}
	
	public Boolean getIsPermisoCopiarNomina() {
		return isPermisoCopiarNomina;
	}

	public void setIsPermisoCopiarNomina(Boolean isPermisoCopiarNomina) {
		this.isPermisoCopiarNomina = isPermisoCopiarNomina;
	}
	
	public Boolean getIsPermisoVerFormNomina() {
		return isPermisoVerFormNomina;
	}

	public void setIsPermisoVerFormNomina(Boolean isPermisoVerFormNomina) {
		this.isPermisoVerFormNomina = isPermisoVerFormNomina;
	}
	
	public Boolean getIsPermisoDuplicarNomina() {
		return isPermisoDuplicarNomina;
	}

	public void setIsPermisoDuplicarNomina(Boolean isPermisoDuplicarNomina) {
		this.isPermisoDuplicarNomina = isPermisoDuplicarNomina;
	}
	
	public Boolean getIsPermisoOrdenNomina() {
		return isPermisoOrdenNomina;
	}

	public void setIsPermisoOrdenNomina(Boolean isPermisoOrdenNomina) {
		this.isPermisoOrdenNomina = isPermisoOrdenNomina;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNomina() {
		return isVisibilidadCeldaNuevoNomina;
	}

	public void setIsVisibilidadCeldaNuevoNomina(Boolean isVisibilidadCeldaNuevoNomina) {
		this.isVisibilidadCeldaNuevoNomina = isVisibilidadCeldaNuevoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNomina() {
		return isVisibilidadCeldaDuplicarNomina;
	}

	public void setIsVisibilidadCeldaDuplicarNomina(Boolean isVisibilidadCeldaDuplicarNomina) {
		this.isVisibilidadCeldaDuplicarNomina = isVisibilidadCeldaDuplicarNomina;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNomina() {
		return isVisibilidadCeldaCopiarNomina;
	}

	public void setIsVisibilidadCeldaCopiarNomina(Boolean isVisibilidadCeldaCopiarNomina) {
		this.isVisibilidadCeldaCopiarNomina = isVisibilidadCeldaCopiarNomina;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNomina() {
		return isVisibilidadCeldaVerFormNomina;
	}

	public void setIsVisibilidadCeldaVerFormNomina(Boolean isVisibilidadCeldaVerFormNomina) {
		this.isVisibilidadCeldaVerFormNomina = isVisibilidadCeldaVerFormNomina;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNomina() {
		return isVisibilidadCeldaOrdenNomina;
	}

	public void setIsVisibilidadCeldaOrdenNomina(Boolean isVisibilidadCeldaOrdenNomina) {
		this.isVisibilidadCeldaOrdenNomina = isVisibilidadCeldaOrdenNomina;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNomina() {
		return isVisibilidadCeldaNuevoRelacionesNomina;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNomina(Boolean isVisibilidadCeldaNuevoRelacionesNomina) {
		this.isVisibilidadCeldaNuevoRelacionesNomina = isVisibilidadCeldaNuevoRelacionesNomina;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNomina() {
		return isVisibilidadCeldaModificarNomina;
	}

	public void setIsVisibilidadCeldaModificarNomina(Boolean isVisibilidadCeldaModificarNomina) {
		this.isVisibilidadCeldaModificarNomina = isVisibilidadCeldaModificarNomina;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNomina() {
		return isVisibilidadCeldaActualizarNomina;
	}

	public void setIsVisibilidadCeldaActualizarNomina(Boolean isVisibilidadCeldaActualizarNomina) {
		this.isVisibilidadCeldaActualizarNomina = isVisibilidadCeldaActualizarNomina;
	}

	public Boolean getIsVisibilidadCeldaEliminarNomina() {
		return isVisibilidadCeldaEliminarNomina;
	}

	public void setIsVisibilidadCeldaEliminarNomina(Boolean isVisibilidadCeldaEliminarNomina) {
		this.isVisibilidadCeldaEliminarNomina = isVisibilidadCeldaEliminarNomina;
	}

	public Boolean getIsVisibilidadCeldaCancelarNomina() {
		return isVisibilidadCeldaCancelarNomina;
	}

	public void setIsVisibilidadCeldaCancelarNomina(Boolean isVisibilidadCeldaCancelarNomina) {
		this.isVisibilidadCeldaCancelarNomina = isVisibilidadCeldaCancelarNomina;
	}

	public Boolean getIsVisibilidadCeldaGuardarNomina() {
		return isVisibilidadCeldaGuardarNomina;
	}

	public void setIsVisibilidadCeldaGuardarNomina(Boolean isVisibilidadCeldaGuardarNomina) {
		this.isVisibilidadCeldaGuardarNomina = isVisibilidadCeldaGuardarNomina;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNomina() {
		return isVisibilidadCeldaGuardarCambiosNomina;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNomina(Boolean isVisibilidadCeldaGuardarCambiosNomina) {
		this.isVisibilidadCeldaGuardarCambiosNomina = isVisibilidadCeldaGuardarCambiosNomina;
	}
		
	public NominaSessionBean getnominaSessionBean() {
		return this.nominaSessionBean;
	}
	
	public void setnominaSessionBean(NominaSessionBean nominaSessionBean) {
		this.nominaSessionBean=nominaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNomina(Nomina nomina)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Nomina nomina,Nomina nominaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNomina(nomina);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		nominaAux.setId(nomina.getId());
		nominaAux.setVersionRow(nomina.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNomina();
		
			int intSelectedRow = this.jTableDatosNomina.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNomina(this.nomina,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = nominaValidator.getInvalidValues(this.nomina);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			nominaLogic.setDatosCliente(datosCliente);
			nominaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				nominaAux=new  Nomina();
				
				nominaAux.setIsNew(true);
				nominaAux.setIsChanged(true);
				
				nominaAux.setNominaOriginal(this.nomina);
				
				nominaAux.setId(this.nomina.getId());	
				nominaAux.setVersionRow(this.nomina.getVersionRow());	
				nominaAux.setcodigo(this.nomina.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nominaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nominaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(nominaAux,nominaLogic.getNominas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nominaAux,nominas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.nominaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nominaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nominaLogic.saveNominas();//WithConnection
						//nominaLogic.getSetVersionRowNominas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nomina,nominaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nominaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nominaLogic.saveNominaRelaciones(nominaAux);//WithConnection
								//nominaLogic.getSetVersionRowNominas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nomina,nominaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nominaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nominaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nominaAux,nominaLogic.getNominas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nominaAux,nominas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nomina,nominaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				nominaAux=new  Nomina();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.nominaSessionBean.getEsGuardarRelacionado() 
					|| (this.nominaSessionBean.getEsGuardarRelacionado() && this.nomina.getId()>=0)) {
						
					nominaAux.setIsNew(false);
				}
				
				nominaAux.setIsDeleted(false);
			
				nominaAux.setId(this.nomina.getId());	
				nominaAux.setVersionRow(this.nomina.getVersionRow());	
				nominaAux.setcodigo(this.nomina.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nominaAux,nominaLogic.getNominas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nominaAux,nominas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.nominaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nominaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nominaLogic.saveNominas();//WithConnection
						//nominaLogic.getSetVersionRowNominas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nomina,nominaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nominaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nominaLogic.saveNominaRelaciones(nominaAux);//WithConnection
								//nominaLogic.getSetVersionRowNominas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nomina,nominaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nominaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nominaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nominaAux,nominaLogic.getNominas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nominaAux,nominas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nomina,nominaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				nominaAux=new  Nomina();
				
				nominaAux.setIsNew(false);
				nominaAux.setIsChanged(false);
				
				nominaAux.setIsDeleted(true);
				
				nominaAux.setId(this.nomina.getId());	
				nominaAux.setVersionRow(this.nomina.getVersionRow());	
				nominaAux.setcodigo(this.nomina.getcodigo());	
				
				if(this.nominaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.nominaAux.getId()>=0) {	
						this.nominasEliminados.add(nominaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(nominaAux,nominaLogic.getNominas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nominaAux,nominas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.nominaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nominaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nominaLogic.saveNominas();//WithConnection
						//nominaLogic.getSetVersionRowNominas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nominaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nominaLogic.saveNominaRelaciones(nominaAux);//WithConnection
								//nominaLogic.getSetVersionRowNominas();//WithConnection
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
							if(this.nominaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.nominaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(nominaAux,nominaLogic.getNominas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(nominaAux,nominas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.getNominas().addAll(this.nominasEliminados);
					
					nominaLogic.saveNominas();//WithConnection
					//nominaLogic.getSetVersionRowNominas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.nominasEliminados= new ArrayList<Nomina>();		
			}
			
			if(this.nominaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Nomina GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.nomina=nominaAux;
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
      		//this.finishProcessNomina();
      	}
		
	}	
	
	public void actualizarRelaciones(Nomina nominaLocal) throws Exception {
		
		if(this.nominaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Nomina nominaLocal) throws Exception {	
		if(this.nominaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarNominaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNomina.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = nominaValidator.getInvalidValues(this.nomina);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Nomina nomina,List<Nomina> nominas) throws Exception {
		try	{		
			NominaConstantesFunciones.actualizarLista(nomina,nominas,this.nominaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Nomina nomina,List<Nomina> nominas) throws Exception {
		try	{			
			NominaConstantesFunciones.actualizarSelectedLista(nomina,nominas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Nomina> nominasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				nominasLocal=this.nominaLogic.getNominas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				nominasLocal=this.nominas;
			}
			//ARCHITECTURE
		
			for(Nomina nominaLocal:nominasLocal) {
				if(this.permiteMantenimiento(nominaLocal) && nominaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NominaConstantesFunciones.getNominaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NominaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNomina.jLabelcodigoNomina,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNomina.jLabelcodigoNomina,"");
		
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
		this.iIdNuevoNomina--;	
		
		
		this.nominaAux=new Nomina();
		
		this.nominaAux.setId(this.iIdNuevoNomina);
		this.nominaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nominaLogic.getNominas().add(this.nominaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.nominas.add(this.nominaAux);
		}
		//ARCHITECTURE
		
		this.nomina=this.nominaAux;
		
		if(NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNomina(this.nomina);
			this.setVariablesObjetoActualToFormularioForeignKeyNomina(this.nomina);
		}
				
		//this.setDefaultControlesNomina();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNomina();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNomina();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNomina();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNomina(this.nominaBean,this.nomina,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNomina(this.nominaReturnGeneral,this.nominaBean,false);
		
		if(this.nominaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNomina(this.nominaReturnGeneral.getNomina());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNomina(this.nominaReturnGeneral.getNomina());
		}
		
		if(this.nominaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNomina(this.nominaReturnGeneral.getNomina(),classes);//this.nominaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNomina(this.nomina,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNomina();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNomina();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NominaBeanSwingJInternalFrameAdditional.RecargarFormNomina(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNomina(false);
						
			if(nominaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNomina();
			}
			
			this.actualizarVisualTableDatosNomina();
			
			this.jTableDatosNomina.setRowSelectionInterval(this.getIndiceNuevoNomina(), this.getIndiceNuevoNomina());
			
			this.seleccionarFilaTablaNominaActual();
						
			this.actualizarEstadoCeldasBotonesNomina("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNomina(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.setEnabled(isHabilitar && this.nominaConstantesFunciones.activarcodigoNomina);	
		
	};
	
	public void setDefaultControlesNomina() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNomina(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.nominaSessionBean.setConGuardarRelaciones(true);			
			this.nominaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.setVisible(true);
			
					
		} else {
			//this.nominaSessionBean.setConGuardarRelaciones(false);			
			this.nominaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNomina() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Nomina nominaAux:this.nominaLogic.getNominas()) {
				if(nominaAux.getId().equals(this.iIdNuevoNomina)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Nomina nominaAux:this.nominas) {
				if(nominaAux.getId().equals(this.iIdNuevoNomina)) {
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
	
	public int getIndiceActualNomina(Nomina nomina,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Nomina nominaAux:this.nominaLogic.getNominas()) {
				if(nominaAux.getId().equals(nomina.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Nomina nominaAux:this.nominas) {
				if(nominaAux.getId().equals(nomina.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNomina(Nomina nominaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Nomina nominaAux:this.nominaLogic.getNominas()) {
				if(nominaAux.getNominaOriginal().getId().equals(nominaOriginal.getId())) {
					existe=true;
					nominaOriginal.setId(nominaAux.getId());
					nominaOriginal.setVersionRow(nominaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Nomina nominaAux:this.nominas) {
				if(nominaAux.getNominaOriginal().getId().equals(nominaOriginal.getId())) {
					existe=true;
					nominaOriginal.setId(nominaAux.getId());
					nominaOriginal.setVersionRow(nominaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNomina(Boolean esParaCancelar) throws Exception {
		nominasAux=new ArrayList<Nomina>();
		nominaAux=new Nomina();
		
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Nomina nominaAux:this.nominaLogic.getNominas()) {
					if(nominaAux.getId()<0) {
						nominasAux.add(nominaAux);
					}		
				}
				this.iIdNuevoNomina=0L;
				this.nominaLogic.getNominas().removeAll(nominasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Nomina nominaAux:this.nominas) {
					if(nominaAux.getId()<0) {
						nominasAux.add(nominaAux);
					}		
				}
				this.iIdNuevoNomina=0L;
				this.nominas.removeAll(nominasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNomina 
					&& this.nominaLogic.getNominas().size()>0
					) {
					nominaAux=this.nominaLogic.getNominas().get(this.nominaLogic.getNominas().size() - 1);
				
					if(nominaAux.getId()<0) {
						this.nominaLogic.getNominas().remove(nominaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNomina && this.nominas.size()>0) {
					nominaAux=this.nominas.get(this.nominas.size() - 1);
				
					if(nominaAux.getId()<0) {
						this.nominas.remove(nominaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNomina(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(nomina.getId()<0) {
				this.nominaLogic.getNominas().remove(this.nomina);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(nomina.getId()<0) {
				this.nominas.remove(this.nomina);
			}
		}			
	}
	
	public void setEstadosInicialesNomina(List<Nomina> nominasAux) throws Exception {
		NominaConstantesFunciones.setEstadosInicialesNomina(nominasAux);
	}
	
	public void setEstadosInicialesNomina(Nomina nominaAux) throws Exception {
		NominaConstantesFunciones.setEstadosInicialesNomina(nominaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNominaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNominaActual()) {
				if(!this.isEsNuevoNomina) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNomina=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNominaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Nomina ?", "MANTENIMIENTO DE Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Nomina nomina) throws Exception {
		NominaConstantesFunciones.seleccionarAsignar(this.nomina,nomina);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNomina=this.isPermisoActualizarOriginalNomina;
			
			
			this.seleccionarAsignar(nomina);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NominaConstantesFunciones.quitarEspaciosNomina(this.nomina,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.nominaSessionBean.setsFuncionBusquedaRapida(this.nominaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNomina) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNomina(esParaCancelar);				
				this.cancelarNuevoNomina(esParaCancelar);								
			}
			
			this.nomina=new Nomina();
			
			this.inicializarNomina();
			
			this.actualizarEstadoCeldasBotonesNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNomina() throws Exception {
		try {
			NominaConstantesFunciones.inicializarNomina(this.nomina);
			
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
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.nominaLogic.getNominas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNominas(String sAccionBusqueda,List<Nomina> nominasParaReportes) throws Exception {
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
					sPathReporteFinal="Nomina"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NominaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NominaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Nomina"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Nominas");		
		parameters.put("busquedapor", NominaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNomina=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NominaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NominaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNomina=new JRBeanArrayDataSource(NominaJInternalFrame.TraerNominaBeans(nominasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNomina);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NominaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NominaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NominaBean.TraerNominaBeans(nominasParaReportes).toArray()));
							
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
				this.generarExcelReporteNominas(sAccionBusqueda,sTipoArchivoReporte,nominasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNominas(sAccionBusqueda,sTipoArchivoReporte,nominasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNominaActionPerformed(null);
					//this.generarExcelReporteNominas(sAccionBusqueda,sTipoArchivoReporte,nominasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNominas(sAccionBusqueda,sTipoArchivoReporte,nominasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNominas(sAccionBusqueda,sTipoArchivoReporte,nominasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNominas(sAccionBusqueda,sTipoArchivoReporte,nominasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<Nomina> nominasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nomina";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Nominas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNomina("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Nomina nomina : nominasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NominaConstantesFunciones.generarExcelReporteDataNomina("NORMAL",row,workbook,nomina,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNomina(String sTipo,Row row,Workbook workbook) {
		
		NominaConstantesFunciones.generarExcelReporteHeaderNomina(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<Nomina> nominasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nomina_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Nominas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Nomina nomina : nominasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NominaConstantesFunciones.getNominaDescripcion(nomina));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NominaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NominaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nomina.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<Nomina> nominasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Nomina> nominasRespaldo=null;
		
		classes=NominaConstantesFunciones.getClassesRelationshipsOfNomina(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.nominaLogic.setDatosCliente(this.datosCliente);
		this.nominaLogic.setDatosDeep(this.datosDeep);
		this.nominaLogic.setIsConDeep(true);
		
		nominasRespaldo=this.nominaLogic.getNominas();
		
		this.nominaLogic.setNominas(nominasParaReportes);	
		this.nominaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		nominasParaReportes=this.nominaLogic.getNominas();
		this.nominaLogic.setNominas(nominasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nomina_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Nominas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNomina("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Nomina nomina : nominasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNomina("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NominaConstantesFunciones.generarExcelReporteDataNomina("NORMAL",row,workbook,nomina,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NominaConstantesFunciones.getNominaDescripcion(nomina));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNomina.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNomina.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNomina() throws Exception {		
		this.startProcessNomina(true);
	}
	
	public void startProcessNomina(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesNomina, this.jScrollPanelDatosNomina,this.jPanelPaginacionNomina, this.jScrollPanelDatosEdicionNomina, this.jPanelAccionesNomina,this.jPanelAccionesFormularioNomina,this.jmenuBarNomina,this.jmenuBarDetalleNomina,this.jTtoolBarNomina,this.jTtoolBarDetalleNomina);		
		
		final JTabbedPane jTabbedPaneBusquedasNomina=null; 
		
		final JPanel jPanelParametrosReportesNomina=this.jPanelParametrosReportesNomina;
		//final JScrollPane jScrollPanelDatosNomina=this.jScrollPanelDatosNomina;
		final JTable jTableDatosNomina=this.jTableDatosNomina;		
		final JPanel jPanelPaginacionNomina=this.jPanelPaginacionNomina;
		//final JScrollPane jScrollPanelDatosEdicionNomina=this.jScrollPanelDatosEdicionNomina;
		final JPanel jPanelAccionesNomina=this.jPanelAccionesNomina;
		
		JPanel jPanelCamposAuxiliarNomina=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNomina=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
			jPanelCamposAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jPanelCamposNomina;
			jPanelAccionesFormularioAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jPanelAccionesFormularioNomina;
		}
		
		final JPanel jPanelCamposNomina=jPanelCamposAuxiliarNomina;
		final JPanel jPanelAccionesFormularioNomina=jPanelAccionesFormularioAuxiliarNomina;
		
		
		final JMenuBar jmenuBarNomina=this.jmenuBarNomina;
		final JToolBar jTtoolBarNomina=this.jTtoolBarNomina;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNomina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNomina=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
			jmenuBarDetalleAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jmenuBarDetalleNomina;
			jTtoolBarDetalleAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jTtoolBarDetalleNomina;
		}
		
		final JMenuBar jmenuBarDetalleNomina=jmenuBarDetalleAuxiliarNomina;
		final JToolBar jTtoolBarDetalleNomina=jTtoolBarDetalleAuxiliarNomina;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNomina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNomina;
			processRunnable.jTableDatos=jTableDatosNomina;
			processRunnable.jPanelCampos=jPanelCamposNomina;
			processRunnable.jPanelPaginacion=jPanelPaginacionNomina;
			processRunnable.jPanelAcciones=jPanelAccionesNomina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNomina;
			
			
			processRunnable.jmenuBar=jmenuBarNomina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNomina;
			processRunnable.jTtoolBar=jTtoolBarNomina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNomina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNomina ,jPanelParametrosReportesNomina,jTableDatosNomina, /*jScrollPanelDatosNomina,*/jPanelCamposNomina,jPanelPaginacionNomina, /*jScrollPanelDatosEdicionNomina,*/ jPanelAccionesNomina,jPanelAccionesFormularioNomina,jmenuBarNomina,jmenuBarDetalleNomina,jTtoolBarNomina,jTtoolBarDetalleNomina);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesNomina, jScrollPanelDatosNomina,jPanelPaginacionNomina, jScrollPanelDatosEdicionNomina, jPanelAccionesNomina,jPanelAccionesFormularioNomina,jmenuBarNomina,jmenuBarDetalleNomina,jTtoolBarNomina,jTtoolBarDetalleNomina);
						
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
	
	public void finishProcessNomina() {// throws Exception 
		this.finishProcessNomina(true);
	}
	
	public void finishProcessNomina(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesNomina, this.jScrollPanelDatosNomina,this.jPanelPaginacionNomina, this.jScrollPanelDatosEdicionNomina, this.jPanelAccionesNomina,this.jPanelAccionesFormularioNomina,this.jmenuBarNomina,this.jmenuBarDetalleNomina,this.jTtoolBarNomina,this.jTtoolBarDetalleNomina);		
		
		final JTabbedPane jTabbedPaneBusquedasNomina=null; 
		
		final JPanel jPanelParametrosReportesNomina=this.jPanelParametrosReportesNomina;
		//final JScrollPane jScrollPanelDatosNomina=this.jScrollPanelDatosNomina;
		final JTable jTableDatosNomina=this.jTableDatosNomina;		
		final JPanel jPanelPaginacionNomina=this.jPanelPaginacionNomina;
		//final JScrollPane jScrollPanelDatosEdicionNomina=this.jScrollPanelDatosEdicionNomina;
		final JPanel jPanelAccionesNomina=this.jPanelAccionesNomina;
		
		JPanel jPanelCamposAuxiliarNomina=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNomina=new JPanel();
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
			jPanelCamposAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jPanelCamposNomina;
			jPanelAccionesFormularioAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jPanelAccionesFormularioNomina;
		}
		
		final JPanel jPanelCamposNomina=jPanelCamposAuxiliarNomina;
		final JPanel jPanelAccionesFormularioNomina=jPanelAccionesFormularioAuxiliarNomina;
		
		
		final JMenuBar jmenuBarNomina=this.jmenuBarNomina;		
		final JToolBar jTtoolBarNomina=this.jTtoolBarNomina;
				
		JMenuBar jmenuBarDetalleAuxiliarNomina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNomina=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
			jmenuBarDetalleAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jmenuBarDetalleNomina;
			jTtoolBarDetalleAuxiliarNomina=this.jInternalFrameDetalleFormNomina.jTtoolBarDetalleNomina;		
		}
		
		final JMenuBar jmenuBarDetalleNomina=jmenuBarDetalleAuxiliarNomina;
		final JToolBar jTtoolBarDetalleNomina=jTtoolBarDetalleAuxiliarNomina;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNomina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNomina;
			processRunnable.jTableDatos=jTableDatosNomina;
			processRunnable.jPanelCampos=jPanelCamposNomina;
			processRunnable.jPanelPaginacion=jPanelPaginacionNomina;
			processRunnable.jPanelAcciones=jPanelAccionesNomina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNomina;
			
			
			processRunnable.jmenuBar=jmenuBarNomina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNomina;
			processRunnable.jTtoolBar=jTtoolBarNomina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNomina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNomina ,jPanelParametrosReportesNomina, jTableDatosNomina,/*jScrollPanelDatosNomina,*/jPanelCamposNomina,jPanelPaginacionNomina, /*jScrollPanelDatosEdicionNomina,*/ jPanelAccionesNomina,jPanelAccionesFormularioNomina,jmenuBarNomina,jmenuBarDetalleNomina,jTtoolBarNomina,jTtoolBarDetalleNomina));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNomina(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNomina(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNomina(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNomina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNomina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNomina,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNomina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNomina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNomina,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.nominaConstantesFunciones.getsFinalQueryNomina();
		String  finalQueryPaginacionTodos=this.nominaConstantesFunciones.getsFinalQueryNomina();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NominaConstantesFunciones.getArrayColumnasGlobalesNoNomina(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NominaConstantesFunciones.getArrayColumnasGlobalesNomina(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NominaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.nominasEliminados= new ArrayList<Nomina>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNomina();
		
				///*NominaSessionBean*/this.nominaSessionBean=new NominaSessionBean();
			
			if(this.nominaSessionBean==null) {
				this.nominaSessionBean=new NominaSessionBean();
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
					this.iNumeroPaginacion=NominaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NominaConstantesFunciones.getClassesForeignKeysOfNomina(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/nomina."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			nominasAux= new ArrayList<Nomina>();
			
				
			nominaLogic.setDatosCliente(this.datosCliente);
			nominaLogic.setDatosDeep(this.datosDeep);
			nominaLogic.setIsConDeep(true);
			
			
			nominaLogic.getNominaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					nominaLogic.getTodosNominas(finalQueryGlobal,pagination);
					
					//nominaLogic.getTodosNominasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(nominaLogic.getNominas()==null|| nominaLogic.getNominas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nominasAux= new ArrayList<Nomina>();
							nominasAux.addAll(nominaLogic.getNominas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nominasAux= new ArrayList<Nomina>();
							nominasAux.addAll(nominas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nominaLogic.getTodosNominas(finalQueryGlobal+"",this.pagination);												
							
							//nominaLogic.getTodosNominasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNominas("Todos",nominaLogic.getNominas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nominaLogic.setNominas(new ArrayList<Nomina>());					
							nominaLogic.getNominas().addAll(nominasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nominas=new ArrayList<Nomina>();
							nominas.addAll(nominasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNomina=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNomina=this.idActual;
				
				} else if(this.idNominaActual!=null && this.idNominaActual!=0L) {
					idNomina=idNominaActual;
				}
				
					
				this.sDetalleReporte=NominaConstantesFunciones.getDetalleIndicePorId(idNomina);
				
				this.nominas=new ArrayList<Nomina>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					nominaLogic.getEntity(idNomina);
					
					//nominaLogic.getEntityWithConnection(idNomina);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nominaLogic.setNominas(new ArrayList<Nomina>());
					nominaLogic.getNominas().add(nominaLogic.getNomina());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nominas=new ArrayList<Nomina>();
					this.nominas.add(nomina);
				}
				
				if(nominaLogic.getNomina()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNomina();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNomina();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nominaLogic.getNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nominas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nominaLogic.getNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nominas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Nomina nomina) {
		Boolean permite=true;
		
		if(this.nomina.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NominaConstantesFunciones.getOrderByListaNomina();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NominaConstantesFunciones.getOrderByListaNomina();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Nomina nomina:nominaLogic.getNominas()) {
				if(nomina.getsType().equals(Constantes2.S_TOTALES)) {
					nominaTotales=nomina;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Nomina nomina:this.nominas) {
				if(nomina.getsType().equals(Constantes2.S_TOTALES)) {
					nominaTotales=nomina;
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
			this.nominaAux=new Nomina();
			this.nominaAux.setsType(Constantes2.S_TOTALES);
			this.nominaAux.setIsNew(false);
			this.nominaAux.setIsChanged(false);
			this.nominaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NominaConstantesFunciones.TotalizarValoresFilaNomina(this.nominaLogic.getNominas(),this.nominaAux);
				
				this.nominaLogic.getNominas().add(this.nominaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NominaConstantesFunciones.TotalizarValoresFilaNomina(this.nominas,this.nominaAux);
				
				this.nominas.add(this.nominaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		nominaTotales=new Nomina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nominaLogic.getNominas().remove(nominaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nominas.remove(nominaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		nominaTotales=new Nomina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Nomina nomina:nominaLogic.getNominas()) {
				if(nomina.getsType().equals(Constantes2.S_TOTALES)) {
					nominaTotales=nomina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NominaConstantesFunciones.TotalizarValoresFilaNomina(this.nominaLogic.getNominas(),nominaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Nomina nomina:this.nominas) {
				if(nomina.getsType().equals(Constantes2.S_TOTALES)) {
					nominaTotales=nomina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NominaConstantesFunciones.TotalizarValoresFilaNomina(this.nominas,nominaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosNomina() {
		this.isPermisoTodoNomina=false;
		this.isPermisoNuevoNomina=false;
		this.isPermisoActualizarNomina=false;
		this.isPermisoActualizarOriginalNomina=false;
		this.isPermisoEliminarNomina=false;
		this.isPermisoGuardarCambiosNomina=false;
		this.isPermisoConsultaNomina=false;
		this.isPermisoBusquedaNomina=false;
		this.isPermisoReporteNomina=false;		
		this.isPermisoOrdenNomina=false;		
		this.isPermisoPaginacionMedioNomina=false;		
		this.isPermisoPaginacionAltoNomina=false;
		this.isPermisoPaginacionTodoNomina=false;
		this.isPermisoCopiarNomina=false;		
		this.isPermisoVerFormNomina=false;		
		this.isPermisoDuplicarNomina=false;		
		this.isPermisoOrdenNomina=false;		
	}
	
	public void setPermisosUsuarioNomina(Boolean isPermiso) {
		this.isPermisoTodoNomina=isPermiso;
		this.isPermisoNuevoNomina=isPermiso;
		this.isPermisoActualizarNomina=isPermiso;
		this.isPermisoActualizarOriginalNomina=isPermiso;
		this.isPermisoEliminarNomina=isPermiso;
		this.isPermisoGuardarCambiosNomina=isPermiso;
		this.isPermisoConsultaNomina=isPermiso;
		this.isPermisoBusquedaNomina=isPermiso;
		this.isPermisoReporteNomina=isPermiso;
		this.isPermisoOrdenNomina=isPermiso;		
		this.isPermisoPaginacionMedioNomina=isPermiso;		
		this.isPermisoPaginacionAltoNomina=isPermiso;		
		this.isPermisoPaginacionTodoNomina=isPermiso;		
		this.isPermisoCopiarNomina=isPermiso;		
		this.isPermisoVerFormNomina=isPermiso;		
		this.isPermisoDuplicarNomina=isPermiso;
		this.isPermisoOrdenNomina=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNomina(Boolean isPermiso) {
		//this.isPermisoTodoNomina=isPermiso;
		this.isPermisoNuevoNomina=isPermiso;
		this.isPermisoActualizarNomina=isPermiso;
		this.isPermisoActualizarOriginalNomina=isPermiso;
		this.isPermisoEliminarNomina=isPermiso;
		this.isPermisoGuardarCambiosNomina=isPermiso;
		//this.isPermisoConsultaNomina=isPermiso;
		//this.isPermisoBusquedaNomina=isPermiso;
		//this.isPermisoReporteNomina=isPermiso;
		//this.isPermisoOrdenNomina=isPermiso;		
		//this.isPermisoPaginacionMedioNomina=isPermiso;		
		//this.isPermisoPaginacionAltoNomina=isPermiso;		
		//this.isPermisoPaginacionTodoNomina=isPermiso;		
		//this.isPermisoCopiarNomina=isPermiso;		
		//this.isPermisoDuplicarNomina=isPermiso;
		//this.isPermisoOrdenNomina=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNominaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebNomina(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNominaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNominaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNominaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNominaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNomina() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NominaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.nominaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NominaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNomina=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNomina=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNomina=this.isPermisoActualizarNomina;
			this.isPermisoEliminarNomina=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNomina=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNomina=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNomina=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNomina=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNomina=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNomina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNomina=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNomina=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNomina=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNomina=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNomina=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNomina=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNomina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.nominaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNomina.setToolTipText(this.jTableDatosNomina.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNomina(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNomina(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNomina() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyNominaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNominaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NominaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNominaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyNominaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNomina()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyNomina()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNomina(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNomina()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNomina();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNomina(Nomina nomina)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNomina(Nomina nomina,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNomina()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNomina()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNomina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNomina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNomina()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNomina()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNomina(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNomina()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public NominaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NominaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NominaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.nominaSessionBean=new NominaSessionBean(); 
		this.nominaConstantesFunciones=new NominaConstantesFunciones(); 
		this.nominaBean=new Nomina();//(this.nominaConstantesFunciones); 		
		this.nominaReturnGeneral=new NominaParameterReturnGeneral(); 
		
		this.nominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNomina(true);
			
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
			
			this.nominaConstantesFunciones=new NominaConstantesFunciones(); 
			this.nominaBean=new Nomina();//this.nominaConstantesFunciones); 			
			this.nominaReturnGeneral=new NominaParameterReturnGeneral(); 
		
			NominaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nomina Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.nomina=new Nomina();
			this.nominas = new ArrayList<Nomina>();
			this.nominasAux = new ArrayList<Nomina>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic=new NominaLogic();
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			//this.nominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.nominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNomina);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNomina);	
					}
					
					if(this.jInternalFrameImportacionNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNomina);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNomina);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNomina!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNomina);
				this.jInternalFrameDetalleFormNomina.setVisible(false);
				this.jInternalFrameDetalleFormNomina.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNomina);
					this.jInternalFrameReporteDinamicoNomina.setVisible(false);
					this.jInternalFrameReporteDinamicoNomina.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNomina);
					this.jInternalFrameImportacionNomina.setVisible(false);
					this.jInternalFrameImportacionNomina.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNomina);
					this.jInternalFrameOrderByNomina.setVisible(false);
					this.jInternalFrameOrderByNomina.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNominaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NominaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.nominaReturnGeneral=new NominaParameterReturnGeneral();
			
			this.nominaParameterGeneral=new NominaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.nominaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NominaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.nominaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NominaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nominaSessionBean.getEsGuardarRelacionado(),this.nominaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NominaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nominaSessionBean.getEsGuardarRelacionado(),this.nominaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNomina=false;
			this.isVisibilidadCeldaDuplicarNomina=true;
			this.isVisibilidadCeldaCopiarNomina=true;
			this.isVisibilidadCeldaVerFormNomina=true;
			this.isVisibilidadCeldaOrdenNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
			this.isVisibilidadCeldaModificarNomina=false;
			this.isVisibilidadCeldaActualizarNomina=false;
			this.isVisibilidadCeldaEliminarNomina=false;
			this.isVisibilidadCeldaCancelarNomina=false;
			this.isVisibilidadCeldaGuardarNomina=false;
			this.isVisibilidadCeldaGuardarCambiosNomina=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNomina();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNomina(false);
			
			this.setPermisosUsuarioNomina();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nominaSessionBean.getEsGuardarRelacionado() 
				|| (this.nominaSessionBean.getEsGuardarRelacionado() && this.nominaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNominaClasesRelacionadas();
			}
			
			if(this.nominaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNominaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NominaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNomina();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNomina();
			}
			
			if(!this.isPermisoBusquedaNomina) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nominaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNomina,this.isPermisoPaginacionMedioNomina,this.isPermisoPaginacionTodoNomina);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NominaConstantesFunciones.getTiposSeleccionarNomina());
				
				this.tiposColumnasSelect=NominaConstantesFunciones.getTiposSeleccionarNomina(true);
				
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
			//if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNomina();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioNomina(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioNomina(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNomina() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				nominaImplementable= (NominaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NominaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				nominaImplementableHome= (NominaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NominaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.nominas= new ArrayList<Nomina>();
			this.nominasEliminados= new ArrayList<Nomina>();
						
			this.isEsNuevoNomina=false;
			this.esParaAccionDesdeFormularioNomina=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNomina(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNomina();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NominaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NominaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNomina(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNomina!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNomina();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNomina();
			}
			
			NominaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNomina(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Nomina: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNomina() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNomina")) {
				iIndex=this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNomina.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNomina();	
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
	
	public void cargarCombosForeignKeyNomina(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNomina(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNomina(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNominaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNomina();
		
		this.cargarCombosFrameForeignKeyNomina();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNomina();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNomina();
		}
	}
	
	
	
	public void jButtonNuevoNominaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.nominaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
			
			if(jTableDatosNomina.getRowCount()>=1) {
				jTableDatosNomina.removeRowSelectionInterval(0, jTableDatosNomina.getRowCount()-1);						
			}
			
			this.isEsNuevoNomina=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNomina(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNomina(true);			
			//this.nomina=new Nomina();
			//this.nomina.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNomina(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNomina() ;
			
			if(NominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNomina(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.nomina);	
			this.actualizarInformacion("INFO_PADRE",false,this.nomina);				
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
			if(this.nominaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Nomina: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNominaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNomina.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNomina.getSelectedRows().length;			
			}
			
			nominasSeleccionados=this.getNominasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNomina--;			
				//Nomina nominaAux= new Nomina();			
				//nominaAux.setId(this.iIdNuevoNomina);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Nomina nominaOrigen=new Nomina();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Nomina nominaOrigen : nominasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNomina.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							nominaOrigen =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nominaOrigen =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNomina();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.nomina.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNomina(nominaOrigen,this.nomina,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nominaLogic.getNominas().add(this.nominaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nominas.add(this.nominaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNomina(false);
				
				this.jTableDatosNomina.setRowSelectionInterval(this.getIndiceNuevoNomina(), this.getIndiceNuevoNomina());
				
				int iLastRow =  this.jTableDatosNomina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNomina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNomina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNomina(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();									
		
			Nomina nominaOrigen=new Nomina();
			Nomina nominaDestino=new Nomina();
				
			nominasSeleccionados=this.getNominasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNomina.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || nominasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNomina.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nominaOrigen =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nominaOrigen =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nominaDestino =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nominaDestino =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				nominaOrigen =nominasSeleccionados.get(0);
				nominaDestino =nominasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNomina(nominaOrigen,nominaDestino,true,false);
				
				nominaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nominaDestino,nominaLogic.getNominas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nominaDestino,nominas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNomina(false);
				
				//this.jTableDatosNomina.setRowSelectionInterval(this.getIndiceNuevoNomina(), this.getIndiceNuevoNomina());
				
				int iLastRow =  this.jTableDatosNomina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNomina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNomina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNomina(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNomina.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNomina.isVisible();
			
			
			this.jPanelParametrosReportesNomina.setVisible(!isVisible);
			this.jPanelPaginacionNomina.setVisible(!isVisible);
			this.jPanelAccionesNomina.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNomina();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNomina();
			
			this.abrirFrameOrderByNomina();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNomina(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNomina);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNomina.isMaximum()) {
					this.jInternalFrameDetalleFormNomina.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNomina.setSize(this.jInternalFrameDetalleFormNomina.iWidthFormulario,this.jInternalFrameDetalleFormNomina.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNomina.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNomina.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNomina.isMaximum()) {
						this.jInternalFrameDetalleFormNomina.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNomina.jContentPaneDetalleNomina.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNomina.jContentPaneDetalleNomina.getWidth(),NominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNomina.jContentPaneDetalleNomina.getWidth(),NominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNomina.jContentPaneDetalleNomina.getWidth(),NominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNomina.setVisible(true);
	        this.jInternalFrameDetalleFormNomina.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNomina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNomina==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNomina,false,this);
				} else {
					this.jInternalFrameOrderByNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNomina,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNomina);
				this.jInternalFrameOrderByNomina.setVisible(false);
				this.jInternalFrameOrderByNomina.setSelected(false);
				
				this.jInternalFrameOrderByNomina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNomina"));
				
				this.inicializarActualizarBindingTablaOrderByNomina();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNomina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNomina==null) {
				
				this.jInternalFrameImportacionNomina=new ImportacionJInternalFrame(NominaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNomina);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNomina);
				this.jInternalFrameImportacionNomina.setVisible(false);
				this.jInternalFrameImportacionNomina.setSelected(false);


				this.jInternalFrameImportacionNomina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNomina"));
				this.jInternalFrameImportacionNomina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNomina"));
				this.jInternalFrameImportacionNomina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNomina"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNomina() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNomina==null) {
				this.jInternalFrameReporteDinamicoNomina=new ReporteDinamicoJInternalFrame(NominaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNomina);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNomina);
				this.jInternalFrameReporteDinamicoNomina.setVisible(false);
				this.jInternalFrameReporteDinamicoNomina.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNomina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNomina"));
				this.jInternalFrameReporteDinamicoNomina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNomina"));
				this.jInternalFrameReporteDinamicoNomina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNomina"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNomina();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNomina() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNomina);
			
	       	this.jInternalFrameDetalleFormNomina.setVisible(false);
	        this.jInternalFrameDetalleFormNomina.setSelected(false);
			
			//this.jInternalFrameDetalleFormNomina.dispose();
			//this.jInternalFrameDetalleFormNomina=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNomina() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNomina.setVisible(true);
	        this.jInternalFrameReporteDinamicoNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNomina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNomina.setVisible(true);
	        this.jInternalFrameImportacionNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNomina() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNomina.setVisible(true);
	        this.jInternalFrameOrderByNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNomina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNomina.setVisible(false);
	        this.jInternalFrameOrderByNomina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNomina() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNomina.setVisible(false);
	        this.jInternalFrameReporteDinamicoNomina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNomina() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNomina.setVisible(false);
	        this.jInternalFrameImportacionNomina.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNomina(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNomina(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNomina.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNomina(true);
			//this.isEsNuevoNomina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNomina(false) ;
			
			if(nominaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNomina(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNomina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNominaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNomina(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNomina.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNomina(true);
			//this.isEsNuevoNomina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.nomina.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNomina(false) ;
			
			if(NominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNomina(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNomina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarNominaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNomina(false);
			
			//if(!this.isEsNuevoNomina) {								
				int intSelectedRow = this.jTableDatosNomina.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNomina(this.nomina,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
				
			}
			
			if(this.permiteMantenimiento(this.nomina)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.nominaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNomina=true;
					this.inicializarActualizarBindingTablaNomina(false);
					this.isEsNuevoNomina=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNomina=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNomina=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNomina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNomina(false);
				
				this.habilitarDeshabilitarControlesNomina(false);
			
												
				
				if(NominaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNomina();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNominaActionPerformed(evt,nominaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNomina(this.nomina,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNomina.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,nominaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.nomina.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNominaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNomina.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				this.nomina.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				this.nomina.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.nomina)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.nominaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NominaModel) this.jTableDatosNomina.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNomina=true;
				this.inicializarActualizarBindingTablaNomina(false);
				this.isEsNuevoNomina=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNomina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNomina(false);
				
				this.habilitarDeshabilitarControlesNomina(false);
				
				
				
				if(NominaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNomina();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNominaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNomina.getRowCount()>=1) {
				jTableDatosNomina.removeRowSelectionInterval(0, jTableDatosNomina.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNomina(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNomina(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNomina(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNomina(false) ;
			
			this.isEsNuevoNomina=false;
			
			if(NominaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNomina();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNomina(false);
				
				//SI ES MANUAL
				if(NominaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNomina();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNomina--;			
			//Nomina nominaAux= new Nomina();			
			//nominaAux.setId(this.iIdNuevoNomina);
			
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNomina();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
			
			this.nomina.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.nominaLogic.getNominas().add(this.nominaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.nominas.add(this.nominaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNomina(false);
			
			this.jTableDatosNomina.setRowSelectionInterval(this.getIndiceNuevoNomina(), this.getIndiceNuevoNomina());
			
			int iLastRow =  this.jTableDatosNomina.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNomina.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNomina.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNomina(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNomina(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNomina(false);
			
			//SI ES MANUAL
			if(NominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNomina();
			}
			
			//this.abrirFrameTreeNomina();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNominaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE NominaS ?", "MANTENIMIENTO DE Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNomina.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNomina();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.nominaReturnGeneral=nominaLogic.procesarImportacionNominasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.nominaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNominaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNominaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNomina.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNomina.setFileImportacion(this.jInternalFrameImportacionNomina.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNomina.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNomina.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNomina.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNomina.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		

		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NominaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NominaBaseDesign.jrxml";
			
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
			
			this.generarReporteNominas("Todos",nominasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NominaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNomina.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNomina.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NominaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNomina.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NominaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNomina.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNomina.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NominaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoNominaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nomina";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Nominas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NominaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NominaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Nomina nomina:nominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nomina.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelNomina(row);				
			//	iRow++;
			//}				
			
			//for(Nomina nominaAux:nominasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNomina(nominaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
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
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNomina(false);
			
			//SI ES MANUAL
			if(NominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNomina();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNomina(false);
			
			//SI ES MANUAL
			if(NominaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNomina();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNomina(false);
			
			//SI ES MANUAL
			if(NominaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNomina();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNomina() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNomina.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNomina.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNomina.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNomina.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNomina.setMinimumSize(dimensionMinimum);
		this.jTableDatosNomina.setMaximumSize(dimensionMaximum);
		this.jTableDatosNomina.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNomina(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNomina(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNomina(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNomina(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNomina(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNomina(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNomina(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNomina(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NominaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NominaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNomina() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNomina();
		
		this.inicializarActualizarBindingBotonesManualNomina(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNomina();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNomina() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNomina(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNomina(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNomina.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNomina.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNomina.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNomina!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNomina.jCheckBoxPostAccionNuevoNomina.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNomina.jCheckBoxPostAccionSinCerrarNomina.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNomina.jCheckBoxPostAccionSinMensajeNomina.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNomina.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNomina.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNomina.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNomina!=null) {
				this.jInternalFrameDetalleFormNomina.jCheckBoxPostAccionNuevoNomina.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNomina.jCheckBoxPostAccionSinCerrarNomina.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNomina.jCheckBoxPostAccionSinMensajeNomina.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNomina.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNomina.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNomina!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNomina.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNomina!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNomina.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNomina.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNomina.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNomina.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNomina!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNomina.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNomina.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNomina(Boolean esInicializar) throws Exception {
		try	{	
			if(NominaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNomina(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNomina() throws Exception {
		try	{
			if(NominaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNomina();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNomina() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNomina() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNomina.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNomina.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNomina.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNomina.addItem(reporte);
			}
			
			
			if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNomina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNomina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNomina.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNomina.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNomina.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNomina.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNomina();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNomina() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNomina!=null) {
				this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNomina!=null) {
				this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNomina.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNomina!=null) {
				
				if(this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNomina.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNomina.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNomina.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNomina.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNomina()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNomina(Boolean esInicializar) throws Exception {				
		if(NominaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNomina();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNomina() throws Exception {
		this.inicializarActualizarBindingTablaNomina(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNomina() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNomina.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NominaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNomina.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NominaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNominaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNominaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NominaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNomina.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NominaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNomina(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=nominaLogic.getNominas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=nominas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNomina.setModel(new NominaModel(this.nominaLogic.getNominas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNomina.setModel(new NominaModel(this.nominas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNomina!=null && this.jInternalFrameOrderByNomina.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNomina();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNomina,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NominaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NominaConstantesFunciones.SCLASSWEBTITULO,nominaConstantesFunciones.resaltarSeleccionarNomina,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NominaConstantesFunciones.SCLASSWEBTITULO,nominaConstantesFunciones.resaltarSeleccionarNomina,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNomina,NominaConstantesFunciones.LABEL_ID));

		if(this.nominaConstantesFunciones.mostraridNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NominaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nominaConstantesFunciones.resaltaridNomina,this.nominaConstantesFunciones.activaridNomina,this,true,"idNomina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nominaConstantesFunciones.resaltaridNomina,this.nominaConstantesFunciones.activaridNomina,this,true,"idNomina","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNomina,NominaConstantesFunciones.LABEL_CODIGO));

		if(this.nominaConstantesFunciones.mostrarcodigoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NominaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.nominaConstantesFunciones.resaltarcodigoNomina,this.nominaConstantesFunciones.activarcodigoNomina,this,true,"codigoNomina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nominaConstantesFunciones.resaltarcodigoNomina,this.nominaConstantesFunciones.activarcodigoNomina,this,true,"codigoNomina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.nominaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nominaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nominaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNomina.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nominaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nominaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNomina.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNomina && this.isPermisoGuardarCambiosNomina) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.nominaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.nominaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNomina.addColumn(tableColumn);
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
			
			this.jTableDatosNomina.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNomina && this.isPermisoGuardarCambiosNomina) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNomina && this.isPermisoGuardarCambiosNomina) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNomina.moveColumn(this.jTableDatosNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNomina.moveColumn(this.jTableDatosNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNomina.moveColumn(this.jTableDatosNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNomina.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNomina.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNomina,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNomina.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNomina.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNomina.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNomina.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNomina.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=nominaLogic.getNominas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=nominas.size()-1;
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
		//this.jTableDatosNomina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNomina();
			
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
				
				//this.isEsNuevoNomina=false;
					
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
				if(this.nominaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNomina==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNomina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNomina.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.nomina.getsType().equals("DUPLICADO")
				   || this.nomina.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNomina=true;
				
				} else {
					this.isEsNuevoNomina=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
					if(this.nomina.getId()>=0 && !this.nomina.getIsNew()) {						
						this.isEsNuevoNomina=false;
						
					} else {
						this.isEsNuevoNomina=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNomina(esRelaciones);						
				
				this.seleccionarNomina(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.nomina.getId()<0) {
					this.isEsNuevoNomina=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNomina(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNomina(evt,rowIndex);
				}	
				
				if(this.nominaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Nomina: " + this.dDif); 
					}
				}								
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNomina(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.nomina)) {
					if(this.nomina.getId()>0) {
						this.nomina.setIsDeleted(true);
						
						this.nominasEliminados.add(this.nomina);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nominaLogic.getNominas().remove(this.nomina);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nominas.remove(this.nomina);				
					}
					
					
					((NominaModel) this.jTableDatosNomina.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNomina(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNomina(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNomina) {
			
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNomina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNomina.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNomina(this.nomina);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNomina("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNomina(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNomina() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNomina(Nomina nomina) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNomina(nomina,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNomina(Nomina nomina,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNomina(nomina);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNomina(nomina,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNomina(nomina);
	}
	
	public void setVariablesObjetoActualToFormularioNomina(Nomina nomina) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNomina.jLabelidNomina.setText(nomina.getId().toString());
			this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.setText(nomina.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Nomina nominaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,nominaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Nomina nominaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				nominaLocal=this.nomina;
			} else {
				nominaLocal=this.nominaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(nominaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNomina(nominaLocal,true);
					
					if(nominaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(nominaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.nominaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(nominaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNomina(Nomina nomina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNomina(nomina,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNomina(nomina);
	}
	
	public void setVariablesFormularioToObjetoActualNomina(Nomina nomina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNomina(nomina,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNomina(Nomina nomina,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNomina.jLabelidNomina.getText()==null || this.jInternalFrameDetalleFormNomina.jLabelidNomina.getText()=="" || this.jInternalFrameDetalleFormNomina.jLabelidNomina.getText()=="Id") {
				this.jInternalFrameDetalleFormNomina.jLabelidNomina.setText("0");
			}

			if(conColumnasBase) {nomina.setId(Long.parseLong(this.jInternalFrameDetalleFormNomina.jLabelidNomina.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NominaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNomina.jLabelIdNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nomina.setcodigo(this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NominaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNomina.jLabelcodigoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNomina(Nomina nominaBean,Nomina nomina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNomina(Nomina nominaOrigen,Nomina nomina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nominaOrigen.getId()!=null && !nominaOrigen.getId().equals(0L))) {nomina.setId(nominaOrigen.getId());}}
			if(conDefault || (!conDefault && nominaOrigen.getcodigo()!=null && !nominaOrigen.getcodigo().equals(""))) {nomina.setcodigo(nominaOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNomina(Nomina nomina) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNomina.jLabelidNomina.setText(nomina.getId().toString());
			this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.setText(nomina.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNomina(NominaBean nominaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNomina.jLabelidNomina.setText(nominaBean.getId().toString());
			this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.setText(nominaBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNomina(NominaParameterReturnGeneral nominaReturnGeneral,NominaBean nominaBean,Boolean conDefault) throws Exception { 
		try {
			Nomina nominaLocal=new Nomina();
			
			nominaLocal=nominaReturnGeneral.getNomina();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nominaLocal.getId()!=null && !nominaLocal.getId().equals(0L))) {nominaBean.setId(nominaLocal.getId());}}
			if(conDefault || (!conDefault && nominaLocal.getcodigo()!=null && !nominaLocal.getcodigo().equals(""))) {nominaBean.setcodigo(nominaLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNominaGenerico(Long idNominaSeleccionado,JComboBox jComboBoxNomina,List<Nomina> nominasLocal)throws Exception {
		try {
			Nomina  nominaTemp=null;

			for(Nomina nominaAux:nominasLocal) {
				if(nominaAux.getId()!=null && nominaAux.getId().equals(idNominaSeleccionado)) {
					nominaTemp=nominaAux;
					break;
				}
			}

			jComboBoxNomina.setSelectedItem(nominaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNominaGenerico(JComboBox jComboBoxNomina,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNomina.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNomina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNomina.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNomina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nomina=(Nomina) nominaLogic.getNominas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nomina =(Nomina) nominas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Nomina nominaRow=new Nomina();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nominaRow=(Nomina) nominaLogic.getNominas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nominaRow=(Nomina) nominas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNomina(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNomina.setVisible((this.isVisibilidadCeldaNuevoNomina && this.isPermisoNuevoNomina));			
			this.jButtonDuplicarNomina.setVisible((this.isVisibilidadCeldaDuplicarNomina && this.isPermisoDuplicarNomina));			
			this.jButtonCopiarNomina.setVisible((this.isVisibilidadCeldaCopiarNomina && this.isPermisoCopiarNomina));
			this.jButtonVerFormNomina.setVisible((this.isVisibilidadCeldaVerFormNomina && this.isPermisoVerFormNomina));
			
			this.jButtonAbrirOrderByNomina.setVisible((this.isVisibilidadCeldaOrdenNomina && this.isPermisoOrdenNomina));			
			
			this.jButtonNuevoRelacionesNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesNomina && this.isPermisoNuevoNomina));			
			this.jButtonNuevoGuardarCambiosNomina.setVisible((this.isVisibilidadCeldaNuevoNomina && this.isPermisoNuevoNomina && this.isPermisoGuardarCambiosNomina));
			
			if(this.jInternalFrameDetalleFormNomina!=null) {
			this.jInternalFrameDetalleFormNomina.jButtonModificarNomina.setVisible((this.isVisibilidadCeldaModificarNomina && this.isPermisoActualizarNomina));	
			this.jInternalFrameDetalleFormNomina.jButtonActualizarNomina.setVisible((this.isVisibilidadCeldaActualizarNomina && this.isPermisoActualizarNomina));	
			this.jInternalFrameDetalleFormNomina.jButtonEliminarNomina.setVisible((this.isVisibilidadCeldaEliminarNomina && this.isPermisoEliminarNomina));
			this.jInternalFrameDetalleFormNomina.jButtonCancelarNomina.setVisible(this.isVisibilidadCeldaCancelarNomina);							
			this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.setVisible((this.isVisibilidadCeldaGuardarNomina && this.isPermisoGuardarCambiosNomina));			
			
			}
						
			this.jButtonGuardarCambiosTablaNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosNomina && this.isPermisoGuardarCambiosNomina));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNomina.setVisible((this.isVisibilidadCeldaNuevoNomina && this.isPermisoNuevoNomina));						
			this.jButtonDuplicarToolBarNomina.setVisible((this.isVisibilidadCeldaDuplicarNomina && this.isPermisoDuplicarNomina));						
			this.jButtonCopiarToolBarNomina.setVisible((this.isVisibilidadCeldaCopiarNomina && this.isPermisoCopiarNomina));			
			this.jButtonVerFormToolBarNomina.setVisible((this.isVisibilidadCeldaVerFormNomina && this.isPermisoVerFormNomina));			
			this.jButtonAbrirOrderByToolBarNomina.setVisible((this.isVisibilidadCeldaOrdenNomina && this.isPermisoOrdenNomina));
			this.jButtonNuevoRelacionesToolBarNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesNomina && this.isPermisoNuevoNomina));			
			this.jButtonNuevoGuardarCambiosToolBarNomina.setVisible((this.isVisibilidadCeldaNuevoNomina && this.isPermisoNuevoNomina && this.isPermisoGuardarCambiosNomina));			
			
			if(this.jInternalFrameDetalleFormNomina!=null) {
			this.jInternalFrameDetalleFormNomina.jButtonModificarToolBarNomina.setVisible((this.isVisibilidadCeldaModificarNomina && this.isPermisoActualizarNomina));	
			this.jInternalFrameDetalleFormNomina.jButtonActualizarToolBarNomina.setVisible((this.isVisibilidadCeldaActualizarNomina  && this.isPermisoActualizarNomina));	
			this.jInternalFrameDetalleFormNomina.jButtonEliminarToolBarNomina.setVisible((this.isVisibilidadCeldaEliminarNomina && this.isPermisoEliminarNomina));
			this.jInternalFrameDetalleFormNomina.jButtonCancelarToolBarNomina.setVisible(this.isVisibilidadCeldaCancelarNomina);				
			this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosToolBarNomina.setVisible((this.isVisibilidadCeldaGuardarNomina && this.isPermisoGuardarCambiosNomina));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosNomina && this.isPermisoGuardarCambiosNomina));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNomina.setVisible((this.isVisibilidadCeldaNuevoNomina && this.isPermisoNuevoNomina));			
			this.jMenuItemDuplicarNomina.setVisible((this.isVisibilidadCeldaDuplicarNomina && this.isPermisoDuplicarNomina));			
			this.jMenuItemCopiarNomina.setVisible((this.isVisibilidadCeldaCopiarNomina && this.isPermisoCopiarNomina));			
			this.jMenuItemVerFormNomina.setVisible((this.isVisibilidadCeldaVerFormNomina && this.isPermisoVerFormNomina));			
			this.jMenuItemAbrirOrderByNomina.setVisible((this.isVisibilidadCeldaOrdenNomina && this.isPermisoOrdenNomina));			
			//this.jMenuItemMostrarOcultarNomina.setVisible((this.isVisibilidadCeldaOrdenNomina && this.isPermisoOrdenNomina));
			this.jMenuItemDetalleAbrirOrderByNomina.setVisible((this.isVisibilidadCeldaOrdenNomina && this.isPermisoOrdenNomina));			
			//this.jMenuItemDetalleMostrarOcultarNomina.setVisible((this.isVisibilidadCeldaOrdenNomina && this.isPermisoOrdenNomina));			
			this.jMenuItemNuevoRelacionesNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesNomina && this.isPermisoNuevoNomina));			
			this.jMenuItemNuevoGuardarCambiosNomina.setVisible((this.isVisibilidadCeldaNuevoNomina && this.isPermisoNuevoNomina && this.isPermisoGuardarCambiosNomina));									
			
			if(this.jInternalFrameDetalleFormNomina!=null) {
			this.jInternalFrameDetalleFormNomina.jMenuItemModificarNomina.setVisible((this.isVisibilidadCeldaModificarNomina && this.isPermisoActualizarNomina));	
			this.jInternalFrameDetalleFormNomina.jMenuItemActualizarNomina.setVisible((this.isVisibilidadCeldaActualizarNomina && this.isPermisoActualizarNomina));	
			this.jInternalFrameDetalleFormNomina.jMenuItemEliminarNomina.setVisible((this.isVisibilidadCeldaEliminarNomina && this.isPermisoEliminarNomina));
			this.jInternalFrameDetalleFormNomina.jMenuItemCancelarNomina.setVisible(this.isVisibilidadCeldaCancelarNomina);				
			}
			
			this.jMenuItemGuardarCambiosNomina.setVisible((this.isVisibilidadCeldaGuardarNomina && this.isPermisoGuardarCambiosNomina));						
			this.jMenuItemGuardarCambiosTablaNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosNomina && this.isPermisoGuardarCambiosNomina));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNomina=this.jButtonNuevoNomina.isVisible();
			this.isVisibilidadCeldaDuplicarNomina=this.jButtonDuplicarNomina.isVisible();
			this.isVisibilidadCeldaCopiarNomina=this.jButtonCopiarNomina.isVisible();
			this.isVisibilidadCeldaVerFormNomina=this.jButtonVerFormNomina.isVisible();
			
			this.isVisibilidadCeldaOrdenNomina=this.jButtonAbrirOrderByNomina.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNomina=this.jButtonNuevoRelacionesNomina.isVisible();
			this.isVisibilidadCeldaModificarNomina=this.jButtonModificarNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormNomina!=null) {
			this.isVisibilidadCeldaActualizarNomina=this.jInternalFrameDetalleFormNomina.jButtonActualizarNomina.isVisible();
			this.isVisibilidadCeldaEliminarNomina=this.jInternalFrameDetalleFormNomina.jButtonEliminarNomina.isVisible();
			this.isVisibilidadCeldaCancelarNomina=this.jInternalFrameDetalleFormNomina.jButtonCancelarNomina.isVisible();
			this.isVisibilidadCeldaGuardarNomina=this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNomina=this.jButtonGuardarCambiosTablaNomina.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNomina=this.jButtonNuevoToolBarNomina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNomina=this.jButtonNuevoRelacionesToolBarNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormNomina!=null) {
			this.isVisibilidadCeldaModificarNomina=this.jInternalFrameDetalleFormNomina.jButtonModificarToolBarNomina.isVisible();
			this.isVisibilidadCeldaActualizarNomina=this.jInternalFrameDetalleFormNomina.jButtonActualizarToolBarNomina.isVisible();
			this.isVisibilidadCeldaEliminarNomina=this.jInternalFrameDetalleFormNomina.jButtonEliminarToolBarNomina.isVisible();
			this.isVisibilidadCeldaCancelarNomina=this.jInternalFrameDetalleFormNomina.jButtonCancelarToolBarNomina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNomina=this.jButtonGuardarCambiosToolBarNomina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNomina=this.jButtonGuardarCambiosTablaToolBarNomina.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNomina=this.jMenuItemNuevoNomina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNomina=this.jMenuItemNuevoRelacionesNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormNomina!=null) {
			this.isVisibilidadCeldaModificarNomina=this.jInternalFrameDetalleFormNomina.jMenuItemModificarNomina.isVisible();
			this.isVisibilidadCeldaActualizarNomina=this.jInternalFrameDetalleFormNomina.jMenuItemActualizarNomina.isVisible();
			this.isVisibilidadCeldaEliminarNomina=this.jInternalFrameDetalleFormNomina.jMenuItemEliminarNomina.isVisible();
			this.isVisibilidadCeldaCancelarNomina=this.jInternalFrameDetalleFormNomina.jMenuItemCancelarNomina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNomina=this.jMenuItemGuardarCambiosNomina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNomina=this.jMenuItemGuardarCambiosTablaNomina.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNomina(Boolean esInicializar) {
		if(NominaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.nominaSessionBean.getConGuardarRelaciones()) {
				//if(this.nominaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNomina();
			}
			
			this.inicializarActualizarBindingBotonesManualNomina(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNomina() {
		this.jButtonNuevoNomina.setVisible(this.isPermisoNuevoNomina);			
		this.jButtonDuplicarNomina.setVisible(this.isPermisoDuplicarNomina);			
		this.jButtonCopiarNomina.setVisible(this.isPermisoCopiarNomina);			
		this.jButtonVerFormNomina.setVisible(this.isPermisoVerFormNomina);			
		
		this.jButtonAbrirOrderByNomina.setVisible(this.isPermisoOrdenNomina);					
		
		this.jButtonNuevoRelacionesNomina.setVisible(this.isPermisoNuevoNomina);			
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonModificarNomina.setVisible(this.isPermisoActualizarNomina);	
			this.jInternalFrameDetalleFormNomina.jButtonActualizarNomina.setVisible(this.isPermisoActualizarNomina);	
			this.jInternalFrameDetalleFormNomina.jButtonEliminarNomina.setVisible(this.isPermisoEliminarNomina);
			this.jInternalFrameDetalleFormNomina.jButtonCancelarNomina.setVisible(this.isVisibilidadCeldaCancelarNomina);						
			this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.setVisible(this.isPermisoGuardarCambiosNomina);							
		}
		
		this.jButtonGuardarCambiosTablaNomina.setVisible(this.isPermisoActualizarNomina);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNomina() {
		this.jInternalFrameDetalleFormNomina.jButtonModificarNomina.setVisible(this.isPermisoActualizarNomina);	
		this.jInternalFrameDetalleFormNomina.jButtonActualizarNomina.setVisible(this.isPermisoActualizarNomina);	
		this.jInternalFrameDetalleFormNomina.jButtonEliminarNomina.setVisible(this.isPermisoEliminarNomina);
		this.jInternalFrameDetalleFormNomina.jButtonCancelarNomina.setVisible(this.isVisibilidadCeldaCancelarNomina);							
		this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.setVisible((this.isVisibilidadCeldaGuardarNomina && this.isPermisoGuardarCambiosNomina));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNomina() {
		if(NominaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNomina();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNomina() {
	}
	
	public void jTableDatosNominaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNomina(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNomina(this.getnomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nomina==null) {
						this.nomina = new Nomina();
					}

					this.setVariablesFormularioToObjetoActualNomina(this.nomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
				}

				if(this.nomina.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.nomina.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNomina(this.getnomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nomina==null) {
						this.nomina = new Nomina();
					}

					this.setVariablesFormularioToObjetoActualNomina(this.nomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);
				}

				if(this.nomina.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.nomina.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameNomina() {
		if(this.jInternalFrameDetalleFormNomina!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
			this.jInternalFrameDetalleFormNomina.setVisible(false);	    			
			this.jInternalFrameDetalleFormNomina.dispose();
			this.jInternalFrameDetalleFormNomina=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNomina!=null) {
			this.jInternalFrameReporteDinamicoNomina.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNomina.dispose();
			this.jInternalFrameReporteDinamicoNomina=null;
		}
		
		if(this.jInternalFrameImportacionNomina!=null) {
			this.jInternalFrameImportacionNomina.setVisible(false);	    			
			this.jInternalFrameImportacionNomina.dispose();
			this.jInternalFrameImportacionNomina=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNomina();
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
			
			if(sTipo.equals("NuevoNomina")) {
				jButtonNuevoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNomina")) {
				jButtonDuplicarNominaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNomina")) {
				jButtonCopiarNominaActionPerformed(evt);
			} else if(sTipo.equals("VerFormNomina")) {
				jButtonVerFormNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNomina")) {
				jButtonNuevoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNomina")) {
				jButtonDuplicarNominaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNomina")) {
				jButtonNuevoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNomina")) {
				jButtonDuplicarNominaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNomina")) {
				jButtonNuevoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNomina")) {
				jButtonNuevoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNomina")) {
				jButtonNuevoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNomina")) {
				jButtonModificarNominaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNomina")) {
				jButtonModificarNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNomina")) {
				jButtonModificarNominaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNomina")) {
				jButtonActualizarNominaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNomina")) {
				jButtonActualizarNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNomina")) {
				jButtonActualizarNominaActionPerformed(evt);
			} else if(sTipo.equals("EliminarNomina")) {
				jButtonEliminarNominaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNomina")) {
				jButtonEliminarNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNomina")) {
				jButtonEliminarNominaActionPerformed(evt);
			} else if(sTipo.equals("CancelarNomina")) {
				jButtonCancelarNominaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNomina")) {
				jButtonCancelarNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNomina")) {
				jButtonCancelarNominaActionPerformed(evt);
			} else if(sTipo.equals("CerrarNomina")) {
				jButtonCerrarNominaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNomina")) {
				jButtonCerrarNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNomina")) {
				jButtonCerrarNominaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNomina")) {
				jButtonMostrarOcultarNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNomina")) {
				jButtonCancelarNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNomina")) {
				jButtonCopiarNominaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNomina")) {
				jButtonVerFormNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNomina")) {
				jButtonCopiarNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNomina")) {
				jButtonVerFormNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNomina")) {
				jButtonRecargarInformacionNominaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNomina")) {
				jButtonRecargarInformacionNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNomina")) {
				jButtonRecargarInformacionNominaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNomina")) {
				jButtonAnterioresNominaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNomina")) {
				jButtonAnterioresNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNomina")) {
				jButtonAnterioresNominaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNomina")) {
				jButtonSiguientesNominaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNomina")) {
				jButtonSiguientesNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNomina")) {
				jButtonSiguientesNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNomina") || sTipo.equals("MenuItemDetalleAbrirOrderByNomina")) {
				jButtonAbrirOrderByNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNomina") || sTipo.equals("MenuItemDetalleMostrarOcultarNomina")) {
				jButtonMostrarOcultarNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNomina")) {
				jButtonNuevoGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNomina")) {
				jButtonNuevoGuardarCambiosNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNomina")) {
				jButtonNuevoGuardarCambiosNominaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNomina")) {
				jButtonCerrarReporteDinamicoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNomina")) {
				jButtonGenerarReporteDinamicoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNomina")) {
				
				jButtonGenerarExcelReporteDinamicoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNomina")) {
				jButtonCerrarImportacionNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNomina")) {
				
				jButtonGenerarImportacionNominaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNomina")) {
				
				jButtonAbrirImportacionNominaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNomina")) {
				jComboBoxTiposAccionesNominaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNomina")) {
				jComboBoxTiposRelacionesNominaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNomina")) {
				jComboBoxTiposAccionesNominaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNomina")) {
				
				jComboBoxTiposSeleccionarNominaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNomina")) {
				jTextFieldValorCampoGeneralNominaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNomina")) {
				jButtonAbrirOrderByNominaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNomina")) {
				jButtonAbrirOrderByNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNomina")) {
				jButtonCerrarOrderByNominaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNominaBusqueda")) {
				this.jButtonidNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoNominaBusqueda")) {
				this.jButtoncodigoNominaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNomina();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNominaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Nomina nominaLocal=null;
			
			if(!this.getEsControlTabla()) {
				nominaLocal=this.nomina;
			} else {
				nominaLocal=this.nominaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
							
				
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaAnterior =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nominaAnterior =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
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
			
			


			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNominaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
								
						
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
								
				
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaAnterior =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nominaAnterior =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaAnterior =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nominaAnterior =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
							
				
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNominaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nominaAnterior =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nominaAnterior =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
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
			
			


			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
								
				
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaAnterior =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nominaAnterior =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNominaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNomina")) {
					jCheckBoxSeleccionarTodosNominaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNomina")) {
					jCheckBoxSeleccionadosNominaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNomina")) {
					
				}
				
				


				
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
												
				
				


				
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNominaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nominaAnterior =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nominaAnterior =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNominaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
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
			
			


			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNominaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nomina);
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
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
				
				


				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Nomina.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Nomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nominaAnterior =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nominaAnterior =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNomina")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNominaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNomina.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.nomina =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.nomina =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.nomina);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNomina")) {
				
				}
				
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNomina")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNomina.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNomina")) {
			
			}
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNomina();
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
			if(sTipo.equals("NuevoNomina")) {
				jButtonNuevoNominaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNomina")) {
				jButtonDuplicarNominaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNomina")) {
				jButtonCopiarNominaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNomina")) {
				jButtonVerFormNominaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNomina")) {
				jButtonNuevoNominaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNomina")) {
				jButtonModificarNominaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNomina")) {
				jButtonActualizarNominaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNomina")) {
				jButtonEliminarNominaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNomina")) {
				jButtonCancelarNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNomina")) {
				jButtonCerrarNominaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNomina")) {
				jButtonGuardarCambiosNominaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNomina")) {
				jButtonNuevoGuardarCambiosNominaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNomina")) {
				jButtonAbrirOrderByNominaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNomina")) {
				jButtonRecargarInformacionNominaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNomina")) {
				jButtonAnterioresNominaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNomina")) {
				jButtonSiguientesNominaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNominaBusqueda")) {
				this.jButtonidNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoNominaBusqueda")) {
				this.jButtoncodigoNominaBusquedaActionPerformed(evt);
			}
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNomina();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNomina")) {
				closingInternalFrameNomina();
				
			} else if(sTipo.equals("jButtonCancelarNomina")) {
				JInternalFrameBase jInternalFrameDetalleFormNomina = (JInternalFrameBase)evt.getSource();
	            	
	            NominaBeanSwingJInternalFrame jInternalFrameParent=(NominaBeanSwingJInternalFrame)jInternalFrameDetalleFormNomina.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNominaActionPerformed(null);
			}
			
			NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nomina,new Object(),this.nominaParameterGeneral,this.nominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNomina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNomina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNomina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.nomina)) {
			if(!esControlTabla) {
				if(NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNomina(this.nomina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);			
				}
				
				if(this.nominaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNomina(this.nomina,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNomina(this.nominaReturnGeneral,this.nominaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.nominaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNomina(classes,this.nominaReturnGeneral,this.nominaBean,false);
					}
						
					if(this.nominaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNomina(this.nominaReturnGeneral.getNomina());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNomina(this.nominaReturnGeneral.getNomina());	
					}
						
					if(this.nominaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNomina(this.nominaReturnGeneral.getNomina(),classes);//this.nominaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNomina(this.nomina,classes);//this.nominaBean);									
				}
			
				if(NominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNomina(this.nomina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNomina(this.nomina);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.nominaAnterior!=null) {
						this.nomina=this.nominaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nominaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nominaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.nominaReturnGeneral.getNomina(),nominaLogic.getNominas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.nominaReturnGeneral.getNomina(),this.nominas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNomina.repaint();
				
				//((AbstractTableModel) this.jTableDatosNomina.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNomina();
			}
		}
	}
	
	public void actualizarVisualTableDatosNomina() throws Exception {
		
		NominaModel nominaModel=(NominaModel)this.jTableDatosNomina.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nominaModel.nominas=this.nominaLogic.getNominas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			nominaModel.nominas=this.nominas;
		}
		
		
		((NominaModel) this.jTableDatosNomina.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNomina() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnominaAnterior(),this.nominaLogic.getNominas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnominaAnterior(),this.nominas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNomina();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNomina(Nomina nomina,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
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
										
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nomina,new Object(),generalEntityParameterGeneral,this.nominaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.nominaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NominaConstantesFunciones.getClassesRelationshipsOfNomina(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NominaConstantesFunciones.getClassesRelationshipsFromStringsOfNomina(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNomina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nomina,new Object(),generalEntityParameterGeneral,this.nominaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNomina(NominaBean nominaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNomina(ArrayList<Classe> classes,NominaReturnGeneral nominaReturnGeneral,NominaBean nominaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNomina(Nomina nomina,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.nomina)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNomina = new NominaDetalleFormJInternalFrame(jDesktopPane,this.nominaSessionBean.getConGuardarRelaciones(),this.nominaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNomina);
		this.jInternalFrameDetalleFormNomina.setVisible(false);
		this.jInternalFrameDetalleFormNomina.setSelected(false);						
		
		this.jInternalFrameDetalleFormNomina.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNomina.nominaLogic=this.nominaLogic;
		
		this.cargarCombosFrameForeignKeyNomina("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNomina();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNomina();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNomina("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNomina();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNomina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNomina"));
		
		this.jInternalFrameDetalleFormNomina.jButtonModificarNomina.addActionListener(new ButtonActionListener(this,"ModificarNomina"));

		
		this.jInternalFrameDetalleFormNomina.jButtonModificarToolBarNomina.addActionListener(new ButtonActionListener(this,"ModificarToolBarNomina"));
					
		this.jInternalFrameDetalleFormNomina.jMenuItemModificarNomina.addActionListener(new ButtonActionListener(this,"MenuItemModificarNomina"));		
		
		
		
		this.jInternalFrameDetalleFormNomina.jButtonActualizarNomina.addActionListener (new ButtonActionListener(this,"ActualizarNomina"));
		
		
		this.jInternalFrameDetalleFormNomina.jButtonActualizarToolBarNomina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNomina"));
						
		this.jInternalFrameDetalleFormNomina.jMenuItemActualizarNomina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNomina"));		
		
		
		
		this.jInternalFrameDetalleFormNomina.jButtonEliminarNomina.addActionListener (new ButtonActionListener(this,"EliminarNomina"));
		
		
		this.jInternalFrameDetalleFormNomina.jButtonEliminarToolBarNomina.addActionListener (new ButtonActionListener(this,"EliminarToolBarNomina"));
								
		this.jInternalFrameDetalleFormNomina.jMenuItemEliminarNomina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNomina"));		
		
		
		
		this.jInternalFrameDetalleFormNomina.jButtonCancelarNomina.addActionListener (new ButtonActionListener(this,"CancelarNomina"));
		
		
		this.jInternalFrameDetalleFormNomina.jButtonCancelarToolBarNomina.addActionListener (new ButtonActionListener(this,"CancelarToolBarNomina"));
					
		this.jInternalFrameDetalleFormNomina.jMenuItemCancelarNomina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNomina"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNomina.jMenuItemDetalleCerrarNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNomina"));		
		
		
		
		this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosToolBarNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNomina"));
		
		
		
		this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosToolBarNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNomina"));
		
		
		
		this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNomina"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNomina.jButtonidNominaBusqueda.addActionListener(new ButtonActionListener(this,"idNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNomina.jButtoncodigoNominaBusqueda.addActionListener(new ButtonActionListener(this,"codigoNominaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNomina"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNomina"));
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNomina"));
		}
		
		this.jTableDatosNomina.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNomina"));
		
		this.jTableDatosNomina.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNomina"));
		
		this.jButtonNuevoNomina.addActionListener(new ButtonActionListener(this,"NuevoNomina"));
		
		this.jButtonDuplicarNomina.addActionListener(new ButtonActionListener(this,"DuplicarNomina"));
		
		this.jButtonCopiarNomina.addActionListener(new ButtonActionListener(this,"CopiarNomina"));
		
		this.jButtonVerFormNomina.addActionListener(new ButtonActionListener(this,"VerFormNomina"));
		
		
		this.jButtonNuevoToolBarNomina.addActionListener(new ButtonActionListener(this,"NuevoToolBarNomina"));
			
		this.jButtonDuplicarToolBarNomina.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNomina"));
			
		this.jMenuItemNuevoNomina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNomina"));
			
		this.jMenuItemDuplicarNomina.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNomina"));		
		
		
		this.jButtonNuevoRelacionesNomina.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNomina"));
		
		
		this.jButtonNuevoRelacionesToolBarNomina.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNomina"));
			
		this.jMenuItemNuevoRelacionesNomina.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNomina"));		
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonModificarNomina.addActionListener(new ButtonActionListener(this,"ModificarNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonModificarToolBarNomina.addActionListener(new ButtonActionListener(this,"ModificarToolBarNomina"));
			
			this.jInternalFrameDetalleFormNomina.jMenuItemModificarNomina.addActionListener(new ButtonActionListener(this,"MenuItemModificarNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNomina.jButtonActualizarNomina.addActionListener (new ButtonActionListener(this,"ActualizarNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonActualizarToolBarNomina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNomina"));
				
			this.jInternalFrameDetalleFormNomina.jMenuItemActualizarNomina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonEliminarNomina.addActionListener (new ButtonActionListener(this,"EliminarNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonEliminarToolBarNomina.addActionListener (new ButtonActionListener(this,"EliminarToolBarNomina"));
						
			this.jInternalFrameDetalleFormNomina.jMenuItemEliminarNomina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonCancelarNomina.addActionListener (new ButtonActionListener(this,"CancelarNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonCancelarToolBarNomina.addActionListener (new ButtonActionListener(this,"CancelarToolBarNomina"));
			
			this.jInternalFrameDetalleFormNomina.jMenuItemCancelarNomina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNomina"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNomina.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNomina"));		
		
		
		this.jButtonCerrarNomina.addActionListener (new ButtonActionListener(this,"CerrarNomina"));
		
		
		this.jButtonCerrarToolBarNomina.addActionListener (new ButtonActionListener(this,"CerrarToolBarNomina"));
			
		this.jMenuItemCerrarNomina.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNomina"));
			
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jMenuItemDetalleCerrarNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosToolBarNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNomina"));
		}
		
		this.jButtonCopiarToolBarNomina.addActionListener (new ButtonActionListener(this,"CopiarToolBarNomina"));
			
		this.jButtonVerFormToolBarNomina.addActionListener (new ButtonActionListener(this,"VerFormToolBarNomina"));
		
		this.jMenuItemGuardarCambiosNomina.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNomina"));
			
		this.jMenuItemCopiarNomina.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNomina"));		
		
		this.jMenuItemVerFormNomina.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNomina"));		
		
		
		this.jButtonGuardarCambiosTablaNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNomina"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNomina"));
			
		this.jMenuItemGuardarCambiosTablaNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNomina"));		
		
		
		
		this.jButtonRecargarInformacionNomina.addActionListener (new ButtonActionListener(this,"RecargarInformacionNomina"));
					
		this.jButtonRecargarInformacionToolBarNomina.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNomina"));
		
		this.jMenuItemRecargarInformacionNomina.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNomina"));		
		
		
		
		this.jButtonAnterioresNomina.addActionListener (new ButtonActionListener(this,"AnterioresNomina"));
		
		
		this.jButtonAnterioresToolBarNomina.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNomina"));
		
		this.jMenuItemAnterioresNomina.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNomina"));		
		
		
		this.jButtonSiguientesNomina.addActionListener (new ButtonActionListener(this,"SiguientesNomina"));
		
		
		this.jButtonSiguientesToolBarNomina.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNomina"));
			
		this.jMenuItemSiguientesNomina.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNomina"));
			
		this.jMenuItemAbrirOrderByNomina.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNomina"));
			
		this.jMenuItemMostrarOcultarNomina.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNomina"));
			
		this.jMenuItemDetalleAbrirOrderByNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNomina"));
			
		this.jMenuItemDetalleMostarOcultarNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNomina"));		
		
		
		this.jButtonNuevoGuardarCambiosNomina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNomina"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNomina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNomina"));
			
		this.jMenuItemNuevoGuardarCambiosNomina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNomina"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNomina.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNomina"));

		this.jCheckBoxSeleccionadosNomina.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNomina"));
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNomina"));
		}
		
		
		this.jComboBoxTiposRelacionesNomina.addActionListener (new ButtonActionListener(this,"TiposRelacionesNomina"));
			
		this.jComboBoxTiposAccionesNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesNomina"));
					
		this.jComboBoxTiposSeleccionarNomina.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNomina"));
			
		this.jTextFieldValorCampoGeneralNomina.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNomina"));		
		
		
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNomina.jButtonidNominaBusqueda.addActionListener(new ButtonActionListener(this,"idNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNomina.jButtoncodigoNominaBusqueda.addActionListener(new ButtonActionListener(this,"codigoNominaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNomina!=null) {
				this.jInternalFrameReporteDinamicoNomina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNomina"));
				this.jInternalFrameReporteDinamicoNomina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNomina"));
				this.jInternalFrameReporteDinamicoNomina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNomina"));
			}
			
			//this.jButtonCerrarReporteDinamicoNomina.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNomina"));				
			//this.jButtonGenerarReporteDinamicoNomina.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNomina"));
			//this.jButtonGenerarExcelReporteDinamicoNomina.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNomina"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNomina!=null) {
				this.jInternalFrameImportacionNomina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNomina"));
				this.jInternalFrameImportacionNomina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNomina"));
				this.jInternalFrameImportacionNomina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNomina"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNomina.addActionListener (new ButtonActionListener(this,"AbrirOrderByNomina"));
			
			this.jButtonAbrirOrderByToolBarNomina.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNomina"));			
			
			if(this.jInternalFrameOrderByNomina!=null) {
				this.jInternalFrameOrderByNomina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNomina"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNomina.jTabbedPaneRelacionesNomina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNomina"));
		
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
            		closingInternalFrameNomina();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNomina.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNomina = (JInternalFrameBase)event.getSource();
	            	
	            NominaBeanSwingJInternalFrame jInternalFrameParent=(NominaBeanSwingJInternalFrame)jInternalFrameDetalleFormNomina.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNominaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNomina.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNominaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNomina.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNomina.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNomina";
		inputMap = this.jButtonNuevoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNominaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNomina";
		inputMap = this.jButtonNuevoRelacionesNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNominaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNomina";
		inputMap = this.jButtonModificarNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNomina";
		inputMap = this.jButtonActualizarNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNomina";
		inputMap = this.jButtonEliminarNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNomina";
		inputMap = this.jButtonCancelarNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNomina";
		inputMap = this.jButtonCerrarNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNomina";
		inputMap = this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNomina.jButtonGuardarCambiosNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNomina.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNominaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNomina.jButtonidNominaBusqueda.addActionListener(new ButtonActionListener(this,"idNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNomina.jButtoncodigoNominaBusqueda.addActionListener(new ButtonActionListener(this,"codigoNominaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNominaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNomina.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNomina(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Nomina nominaAux:this.nominaLogic.getNominas()) {
					nominaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Nomina nominaAux:nominas) {
					nominaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNominaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNomina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Nomina nominaAux:this.nominaLogic.getNominas()) {
						nominaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Nomina nominaAux:nominas) {
						nominaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Nomina nominaAux:this.nominaLogic.getNominas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Nomina nominaAux:nominas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNomina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNomina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNomina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNomina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNominaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNomina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNomina.getSelectedRows();
			
			Nomina nominaLocal=new Nomina();
			
			//this.seleccionarTodosNomina(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nominaLocal =(Nomina) this.nominaLogic.getNominas().toArray()[this.jTableDatosNomina.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					nominaLocal =(Nomina) this.nominas.toArray()[this.jTableDatosNomina.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				nominaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Nomina nominaAux:this.nominaLogic.getNominas()) {
						nominaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Nomina nominaAux:nominas) {
						nominaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNomina(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNomina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNomina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNomina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNominaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNominaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNominaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNomina(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNomina.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Nomina nominaAux:this.nominaLogic.getNominas()) {
				
						if(sTipoSeleccionar.equals(NominaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							nominaAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Nomina nominaAux:nominas) {
					
						if(sTipoSeleccionar.equals(NominaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							nominaAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNomina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNominaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNomina(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNomina=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNomina.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNomina) {				
					conSplash=true;//false;										
					
					//this.startProcessNomina(conSplash);
				
					this.generarReporteNominasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNominasSeleccionados();
				//this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNominasSeleccionados(false);
				//this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNominasSeleccionados(true);
				//this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNomina();
				
				this.exportarNominasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNominas();
				//this.importarNominas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNomina();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNominasSeleccionados();
				//this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNomina();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNomina)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNomina(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.setSelectedIndex(0);					
				}	
			} 			
			else if(NominaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNomina) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNomina(conSplash);
					
						//this.actualizarParametrosGeneralNomina();
						
						this.generarReporteProcesoAccionNominasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NominaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO NominaS SELECCIONADOS?", "MANTENIMIENTO DE Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNomina();
				
						this.actualizarParametrosGeneralNomina();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.nominaReturnGeneral=nominaLogic.procesarAccionNominasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.nominaLogic.getNominas(),this.nominaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNominaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNomina();
					
					NominaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNominaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNomina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNomina.jComboBoxTiposAccionesFormularioNomina.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNomina(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNominaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNomina();
			
			if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
			Nomina nomina=new Nomina();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNomina(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNomina.getSelectedItem();
			
			
			
			
			nominasSeleccionados=this.getNominasSeleccionados(true);
			//this.sTipoAccion;
			
			if(nominasSeleccionados.size()==1) {
				for(Nomina nominaAux:nominasSeleccionados) {
					nomina=nominaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNomina();
			
      		//this.finishProcessNomina(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNominaReturnGeneral() throws Exception {
		if(this.nominaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.nominaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.nominaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.nominaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.nominaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.nominaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNomina(false);
		}
		
		if(this.nominaReturnGeneral.getConRetornoLista() || this.nominaReturnGeneral.getConRetornoObjeto()) {
			if(this.nominaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nominaLogic.setNominas(this.nominaReturnGeneral.getNominas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.nominaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nominaLogic.setNomina(this.nominaReturnGeneral.getNomina());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNomina(false);
		}
	}
	
	public void actualizarParametrosGeneralNomina() throws Exception {
		
		
	}
	
	public ArrayList<Nomina> getNominasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNomina) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Nomina nominaAux:nominaLogic.getNominas()) {
					if(nominaAux.getIsSelected()) {
						nominasSeleccionados.add(nominaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Nomina nominaAux:this.nominas) {
					if(nominaAux.getIsSelected()) {
						nominasSeleccionados.add(nominaAux);				
					}
				}
			}
			
			if(nominasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						nominasSeleccionados.addAll(this.nominaLogic.getNominas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						nominasSeleccionados.addAll(this.nominas);				
					}
				}
			}
		} else {
			nominasSeleccionados.add(this.nomina);
		}
		
		return nominasSeleccionados;
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
	
	public void generarReporteNominasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNominasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNominasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNominasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNominasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNominasSeleccionados() throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNominas("Todos",nominasSeleccionados);
		
	}	
	
	public void generarReporteNormalNominasSeleccionados() throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNominas("Todos",nominasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNominasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNominas("Todos",nominasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNominasSeleccionados() throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNomina();
		
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNomina();
		
		
		//this.generarReporteNominas("Todos",nominasSeleccionados ,nominaImplementable,nominaImplementableHome);
	}
	
	public void mostrarImportacionNominas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNomina();
		
		this.abrirFrameImportacionNomina();		
		
			
		//this.generarReporteNominas("Todos",nominasSeleccionados ,nominaImplementable,nominaImplementableHome);
	}
	
	public void importarNominas() throws Exception {		
	
	}
	
	public void exportarNominasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNominasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNominasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNominasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNominasSeleccionados() throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nomina."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNomina(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Nomina nominaAux:nominasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNomina(nominaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//nominaAux.setsDetalleGeneralEntityReporte(nominaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNomina(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NominaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NominaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NominaConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNomina(Nomina nomina,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=nomina.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=nomina.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=nomina.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNominasSeleccionados() throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nomina.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Nominas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNomina(row);				
				iRow++;
			}				
			
			for(Nomina nominaAux:nominasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNomina(nominaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNominasSeleccionados() throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();		
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nomina.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("nominas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("nomina");
			//elementRoot.appendChild(element);
		
			for(Nomina nominaAux:nominasSeleccionados) {
				element = document.createElement("nomina");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNomina(nominaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNomina(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NominaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NominaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NominaConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNomina(Nomina nomina,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(nomina.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(nomina.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlNomina(Nomina nomina,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NominaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(nomina.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NominaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(nomina.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(NominaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(nomina.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoNominasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Nomina> nominasSeleccionados=new ArrayList<Nomina>();
		
		nominasSeleccionados=this.getNominasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNomina(nominasSeleccionados);
		
		this.generarReporteNominas("Todos",nominasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNomina(ArrayList<Nomina> nominasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Nomina nominaAux:nominasSeleccionados) {
				nominaAux.setsDetalleGeneralEntityReporte(nominaAux.toString());
			
				if(sTipoSeleccionar.equals(NominaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					nominaAux.setsDescripcionGeneralEntityReporte1(nominaAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNomina(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNomina=true;
				this.isVisibilidadCeldaNuevoRelacionesNomina=true;
				this.isVisibilidadCeldaGuardarCambiosNomina=true;
			}
			
			this.isVisibilidadCeldaModificarNomina=false;
			this.isVisibilidadCeldaActualizarNomina=false;
			this.isVisibilidadCeldaEliminarNomina=false;
			this.isVisibilidadCeldaCancelarNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarNomina=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
			this.isVisibilidadCeldaGuardarCambiosNomina=false;
			this.isVisibilidadCeldaModificarNomina=false;
			this.isVisibilidadCeldaActualizarNomina=true;
			this.isVisibilidadCeldaEliminarNomina=false;
			this.isVisibilidadCeldaCancelarNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarNomina=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
			this.isVisibilidadCeldaGuardarCambiosNomina=false;
			this.isVisibilidadCeldaModificarNomina=false;
			this.isVisibilidadCeldaActualizarNomina=true;
			this.isVisibilidadCeldaEliminarNomina=true;
			this.isVisibilidadCeldaCancelarNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarNomina=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
			this.isVisibilidadCeldaGuardarCambiosNomina=false;
			this.isVisibilidadCeldaModificarNomina=false;
			this.isVisibilidadCeldaActualizarNomina=true;
			this.isVisibilidadCeldaEliminarNomina=false;
			this.isVisibilidadCeldaCancelarNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarNomina=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesNomina=true;
			this.isVisibilidadCeldaGuardarCambiosNomina=true;
			this.isVisibilidadCeldaModificarNomina=false;
			this.isVisibilidadCeldaActualizarNomina=false;
			this.isVisibilidadCeldaEliminarNomina=false;
			this.isVisibilidadCeldaCancelarNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarNomina=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
			this.isVisibilidadCeldaGuardarCambiosNomina=false;
			this.isVisibilidadCeldaActualizarNomina=false;
			this.isVisibilidadCeldaEliminarNomina=false;
			this.isVisibilidadCeldaCancelarNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarNomina=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
			this.isVisibilidadCeldaGuardarCambiosNomina=false;
			this.isVisibilidadCeldaModificarNomina=true;
			this.isVisibilidadCeldaActualizarNomina=false;
			this.isVisibilidadCeldaEliminarNomina=false;
			this.isVisibilidadCeldaCancelarNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarNomina=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NominaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesNomina=true;
			this.isVisibilidadCeldaGuardarCambiosNomina=true;
		} else {
			this.actualizarEstadoPanelsNomina(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNomina=false;
			//this.isVisibilidadCeldaVerFormNomina=false;
			this.isVisibilidadCeldaDuplicarNomina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!nominaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
		} else {
			this.isVisibilidadCeldaNuevoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosNomina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(nominaSessionBean.getEsGuardarRelacionado()) {
			if(!nominaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNomina=false;												
			}
			
			this.jButtonCerrarNomina.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNomina=false;
		}
		
		if(!this.permiteMantenimiento(this.nomina)) {
			this.isVisibilidadCeldaActualizarNomina=false;
			this.isVisibilidadCeldaEliminarNomina=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNomina() {
	}
	
	public void actualizarEstadoPanelsNomina(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNomina!=null) {
				this.jScrollPanelDatosEdicionNomina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNomina!=null) {
				this.jScrollPanelDatosNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionNomina!=null) {
				this.jPanelPaginacionNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNomina!=null) {
				this.jPanelParametrosReportesNomina.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNomina!=null) {
				this.jScrollPanelDatosEdicionNomina.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosNomina!=null) {
				this.jScrollPanelDatosNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionNomina!=null) {
				this.jPanelPaginacionNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNomina!=null) {
				this.jPanelParametrosReportesNomina.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNomina!=null) {
				this.jScrollPanelDatosEdicionNomina.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosNomina!=null) {
				this.jScrollPanelDatosNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionNomina!=null) {
				this.jPanelPaginacionNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNomina!=null) {
				this.jPanelParametrosReportesNomina.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNomina!=null) {
				this.jScrollPanelDatosEdicionNomina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNomina!=null) {
				this.jScrollPanelDatosNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionNomina!=null) {
				this.jPanelPaginacionNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNomina!=null) {
				this.jPanelParametrosReportesNomina.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNomina!=null) {
				this.jScrollPanelDatosEdicionNomina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNomina!=null) {
				this.jScrollPanelDatosNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionNomina!=null) {
				this.jPanelPaginacionNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNomina!=null) {
				this.jPanelParametrosReportesNomina.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNomina!=null) {
				this.jScrollPanelDatosEdicionNomina.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosNomina!=null) {
				this.jScrollPanelDatosNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionNomina!=null) {
				this.jPanelPaginacionNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNomina!=null) {
				this.jPanelParametrosReportesNomina.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNomina!=null) {
				this.jScrollPanelDatosEdicionNomina.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosNomina!=null) {
				this.jScrollPanelDatosNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionNomina!=null) {
				this.jPanelPaginacionNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNomina!=null) {
				this.jPanelParametrosReportesNomina.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.nominaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.nominaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NominaSessionBean nominaSessionBean=new NominaSessionBean();
		
		if(this.nominaSessionBean==null) {
			this.nominaSessionBean=new NominaSessionBean();
		}
		
		this.nominaSessionBean.setsUltimaBusquedaNomina(this.getsAccionBusqueda());
		this.nominaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.nominaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NominaSessionBean nominaSessionBean=new NominaSessionBean();
		
		if(this.nominaSessionBean==null) {
			this.nominaSessionBean=new NominaSessionBean();
		}
		
		if(this.nominaSessionBean.getsUltimaBusquedaNomina()!=null&&!this.nominaSessionBean.getsUltimaBusquedaNomina().equals("")) {
			this.setsAccionBusqueda(nominaSessionBean.getsUltimaBusquedaNomina());
			this.setiNumeroPaginacion(nominaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(nominaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.nominaSessionBean.setsUltimaBusquedaNomina("");
		this.nominaSessionBean.setiNumeroPaginacion(NominaConstantesFunciones.INUMEROPAGINACION);
		this.nominaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNomina(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNomina() {
		this.updateBorderResaltarBusquedasFormularioNomina();
		this.updateVisibilidadBusquedasFormularioNomina();
		this.updateHabilitarBusquedasFormularioNomina();
	}
	
	public void updateBorderResaltarBusquedasFormularioNomina() {					
	}
	
	public void updateVisibilidadBusquedasFormularioNomina() {
	}
	
	public void updateHabilitarBusquedasFormularioNomina() {
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
	
	public void updateControlesFormularioNomina() throws Exception {

		if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNomina();
		this.updateVisibilidadResaltarControlesFormularioNomina();
		this.updateHabilitarResaltarControlesFormularioNomina();
		
	}
	
	public void updateBorderResaltarControlesFormularioNomina() throws Exception {
		if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.nominaConstantesFunciones.resaltaridNomina!=null && this.jInternalFrameDetalleFormNomina!=null) {this.jInternalFrameDetalleFormNomina.jLabelidNomina.setBorder(this.nominaConstantesFunciones.resaltaridNomina);}
		if(this.nominaConstantesFunciones.resaltarcodigoNomina!=null && this.jInternalFrameDetalleFormNomina!=null) {this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.setBorder(this.nominaConstantesFunciones.resaltarcodigoNomina);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNomina() throws Exception {		
		if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
	
		//this.jInternalFrameDetalleFormNomina.jLabelidNomina.setVisible(this.nominaConstantesFunciones.mostraridNomina);
		this.jInternalFrameDetalleFormNomina.jPanelidNomina.setVisible(this.nominaConstantesFunciones.mostraridNomina);
		//this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.setVisible(this.nominaConstantesFunciones.mostrarcodigoNomina);
		this.jInternalFrameDetalleFormNomina.jPanelcodigoNomina.setVisible(this.nominaConstantesFunciones.mostrarcodigoNomina);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNomina() throws Exception {
		if(this.jInternalFrameDetalleFormNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNomina!=null) {
	
		this.jInternalFrameDetalleFormNomina.jLabelidNomina.setEnabled(this.nominaConstantesFunciones.activaridNomina);
		this.jInternalFrameDetalleFormNomina.jTextFieldcodigoNomina.setEnabled(this.nominaConstantesFunciones.activarcodigoNomina);
		}
	}
	
		
}
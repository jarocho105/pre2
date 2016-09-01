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

import com.bydan.erp.seguridad.util.AccionConstantesFunciones;
import com.bydan.erp.seguridad.util.AccionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.AccionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.AccionBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
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




@SuppressWarnings("unused")
public class AccionBeanSwingJInternalFrame extends AccionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AccionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Accion> accionValidator = new ClassValidator<Accion>(Accion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Accion accion;	
	public Accion accionAux;
	public Accion accionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Accion accionTotales;
	public Long idAccionActual;
	public Long iIdNuevoAccion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboOpcion="";

	public List<Opcion> opcionsForeignKey;

	public List<Opcion> getopcionsForeignKey() {
		return opcionsForeignKey;
	}

	public void setopcionsForeignKey(List<Opcion> opcionsForeignKey) {
		this.opcionsForeignKey = opcionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Opcion opcionForeignKey;

	public Opcion getopcionForeignKey() {
		return opcionForeignKey;
	}

	public void setopcionForeignKey(Opcion opcionForeignKey) {
		this.opcionForeignKey = opcionForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosPerfilAccion=false;

	public Boolean getIsTienePermisosPerfilAccion() {
		return isTienePermisosPerfilAccion;
	}

	public void setIsTienePermisosPerfilAccion(Boolean isTienePermisosPerfilAccion) {
		this.isTienePermisosPerfilAccion= isTienePermisosPerfilAccion;
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
	
	public Boolean isPermisoTodoAccion;
	public Boolean isPermisoNuevoAccion;
	public Boolean isPermisoActualizarAccion;
	public Boolean isPermisoActualizarOriginalAccion;
	public Boolean isPermisoEliminarAccion;
	public Boolean isPermisoGuardarCambiosAccion;
	public Boolean isPermisoConsultaAccion;
	public Boolean isPermisoBusquedaAccion;
	public Boolean isPermisoReporteAccion;
	public Boolean isPermisoPaginacionMedioAccion;
	public Boolean isPermisoPaginacionAltoAccion;
	public Boolean isPermisoPaginacionTodoAccion;
	public Boolean isPermisoCopiarAccion;
	public Boolean isPermisoVerFormAccion;
	public Boolean isPermisoDuplicarAccion;
	public Boolean isPermisoOrdenAccion;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
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
	
	public AccionParameterReturnGeneral accionReturnGeneral;
	public AccionParameterReturnGeneral accionParameterGeneral;
	
	

	public PerfilAccionLogic perfilaccionLogic=null;

	public PerfilAccionLogic getPerfilAccionLogic() {
		return perfilaccionLogic;
	}

	public void setPerfilAccionLogic(PerfilAccionLogic perfilaccionLogic) {
		this.perfilaccionLogic = perfilaccionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAccion=false;
	public Boolean esParaAccionDesdeFormularioAccion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AccionSessionBeanAdditional accionSessionBeanAdditional=null;
	
	public AccionSessionBeanAdditional getAccionSessionBeanAdditional() {
		return this.accionSessionBeanAdditional;
	}
	
	public void setAccionSessionBeanAdditional(AccionSessionBeanAdditional accionSessionBeanAdditional) {
		try {
			this.accionSessionBeanAdditional=accionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AccionBeanSwingJInternalFrameAdditional accionBeanSwingJInternalFrameAdditional=null;
	//public class AccionBeanSwingJInternalFrame
	
	public AccionBeanSwingJInternalFrameAdditional getAccionBeanSwingJInternalFrameAdditional() {
		return this.accionBeanSwingJInternalFrameAdditional;
	}
	
	public void setAccionBeanSwingJInternalFrameAdditional(AccionBeanSwingJInternalFrameAdditional accionBeanSwingJInternalFrameAdditional) {
		try {
			this.accionBeanSwingJInternalFrameAdditional=accionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AccionLogic accionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Accion accionBean;
	public AccionConstantesFunciones accionConstantesFunciones;
	//public AccionParameterReturnGeneral accionReturnGeneral;
	
	//FK
	
	public OpcionLogic opcionLogic;
	
	//PARAMETROS
	
	
	//public List<Accion> accions;	
	//public List<Accion> accionsEliminados;
	//public List<Accion> accionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAccion=false;
	public Boolean isVisibilidadCeldaDuplicarAccion=true;
	public Boolean isVisibilidadCeldaCopiarAccion=true;
	public Boolean isVisibilidadCeldaVerFormAccion=true;
	public Boolean isVisibilidadCeldaOrdenAccion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAccion=false;
	public Boolean isVisibilidadCeldaModificarAccion=false;
	public Boolean isVisibilidadCeldaActualizarAccion=false;
	public Boolean isVisibilidadCeldaEliminarAccion=false;
	public Boolean isVisibilidadCeldaCancelarAccion=false;
	public Boolean isVisibilidadCeldaGuardarAccion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAccion=false;	
	
	
	public Boolean isVisibilidadFK_IdOpcion=false;
	
	public Long getiIdNuevoAccion() {
		return this.iIdNuevoAccion;
	}

	public void setiIdNuevoAccion(Long iIdNuevoAccion) {
		this.iIdNuevoAccion = iIdNuevoAccion;
	}
	
	public Long getidAccionActual() {
		return this.idAccionActual;
	}

	public void setidAccionActual(Long idAccionActual) {
		this.idAccionActual = idAccionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Accion getaccion() {
		return this.accion;
	}

	public void setaccion(Accion accion) {
		this.accion = accion;
	}
	
	public Accion getaccionAux() {
		return this.accionAux;
	}

	public void setaccionAux(Accion accionAux) {
		this.accionAux = accionAux;
	}				
	
	public Accion getaccionAnterior() {
		return this.accionAnterior;
	}

	public void setaccionAnterior(Accion accionAnterior) {
		this.accionAnterior = accionAnterior;
	}	
	
	public Accion getaccionTotales() {
		return this.accionTotales;
	}

	public void setaccionTotales(Accion accionTotales) {
		this.accionTotales = accionTotales;
	}	
	
	public Accion getaccionBean() {
		return this.accionBean;
	}

	public void setaccionBean(Accion accionBean) {
		this.accionBean = accionBean;
	}	
	
	public AccionParameterReturnGeneral getaccionReturnGeneral() {
		return this.accionReturnGeneral;
	}

	public void setaccionReturnGeneral(AccionParameterReturnGeneral accionReturnGeneral) {
		this.accionReturnGeneral = accionReturnGeneral;
	}	
	
	
	public Long id_opcionFK_IdOpcion=-1L;

	public Long getid_opcionFK_IdOpcion() {
		return this.id_opcionFK_IdOpcion;
	}

	public void setid_opcionFK_IdOpcion(Long id_opcionFK_IdOpcion) {
		this.id_opcionFK_IdOpcion = id_opcionFK_IdOpcion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AccionLogic getAccionLogic()	{		
		return accionLogic;
	}

	public void setAccionLogic(AccionLogic accionLogic) {
		this.accionLogic = accionLogic;
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
	
	public Boolean getIsEsNuevoAccion() {
		return isEsNuevoAccion;
	}

	public void setIsEsNuevoAccion(Boolean isEsNuevoAccion) {
		this.isEsNuevoAccion = isEsNuevoAccion;
	}

	public Boolean getEsParaAccionDesdeFormularioAccion() {
		return esParaAccionDesdeFormularioAccion;
	}
	
	public void setEsParaAccionDesdeFormularioAccion(Boolean esParaAccionDesdeFormularioAccion) {
		this.esParaAccionDesdeFormularioAccion = esParaAccionDesdeFormularioAccion;
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
	
	
	public void cargarCombosOpcionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.opcionsForeignKey=new ArrayList<Opcion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			OpcionLogic opcionLogic=new OpcionLogic();

			opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

			if(this.accionSessionBean==null) {
				this.accionSessionBean=new AccionSessionBean();
			}

			if(!this.accionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

					opcionLogic.getTodosOpcionsWithConnection(sFinalQuery,new Pagination());

					this.opcionsForeignKey=opcionLogic.getOpcions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOpcion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getEntityWithConnection(accionSessionBean.getlidOpcionActual());
					this.opcionsForeignKey.add(opcionLogic.getOpcion());
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

	
	
	public void setActualOpcionForeignKey(Long idOpcionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(opcionTemp!=null) {

					if(this.accion!=null) {
						this.accion.setOpcion(opcionTemp);
					}

					if(this.jInternalFrameDetalleFormAccion!=null) {
						this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setSelectedItem(opcionTemp);
					}
				} else {
					//jComboBoxid_opcionAccion.setSelectedItem(opcionTemp);
					if(this.jInternalFrameDetalleFormAccion!=null) {
						if(this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(opcionTemp!=null && jComboBoxid_opcionFK_IdOpcionAccion!=null) {
						jComboBoxid_opcionFK_IdOpcionAccion.setSelectedItem(opcionTemp);
					} else {
						if(jComboBoxid_opcionFK_IdOpcionAccion!=null) {
							//jComboBoxid_opcionFK_IdOpcionAccion.setSelectedItem(opcionTemp);
							if(jComboBoxid_opcionFK_IdOpcionAccion.getItemCount()>0) {
								jComboBoxid_opcionFK_IdOpcionAccion.setSelectedIndex(0);
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

	public String getActualOpcionForeignKeyDescripcion(Long idOpcionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}


			sDescripcion=OpcionConstantesFunciones.getOpcionDescripcion(opcionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualOpcionForeignKeyGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxid_opcionAccionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(opcionTemp!=null) {
				jComboBoxid_opcionAccionGenerico.setSelectedItem(opcionTemp);
			} else {
				if(jComboBoxid_opcionAccionGenerico!=null && jComboBoxid_opcionAccionGenerico.getItemCount()>0) {
					jComboBoxid_opcionAccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOpcionForeignKey(Accion accion,JComboBox jComboBoxid_opcionAccionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionAux=new Opcion();

			if(jComboBoxid_opcionAccionGenerico==null) {
				opcionAux=(Opcion)this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.getSelectedItem();
			} else {
				opcionAux=(Opcion)jComboBoxid_opcionAccionGenerico.getSelectedItem();
			}

			if(opcionAux!=null && opcionAux.getId()!=null) {
				accion.setid_opcion(opcionAux.getId());
				accion.setopcion_descripcion(AccionConstantesFunciones.getOpcionDescripcion(opcionAux));
				accion.setOpcion(opcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameOpcionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingOpcion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAccion!=null) { 
							this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.addItem(opcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAccion!=null) { 
					}

					if(!AccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_opcionFK_IdOpcionAccion.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jComboBoxid_opcionFK_IdOpcionAccion.addItem(opcion);
							}
						}

						if(!AccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameOpcionForeignKey(Opcion opcion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAccion!=null) {
							this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setSelectedItem(opcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormAccion!=null) {
							this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_opcionFK_IdOpcionAccion.setSelectedItem(opcion);
						} else {
							this.jComboBoxid_opcionFK_IdOpcionAccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAccion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AccionConstantesFunciones.refrescarForeignKeysDescripcionesAccion(this.accionLogic.getAccions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AccionConstantesFunciones.refrescarForeignKeysDescripcionesAccion(this.accions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Opcion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//accionLogic.setAccions(this.accions);
			accionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AccionParameterReturnGeneral getAccionParameterGeneral() {
		return this.accionParameterGeneral;
	}
	
	public void setAccionParameterGeneral(AccionParameterReturnGeneral accionParameterGeneral) {
		this.accionParameterGeneral = accionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAccion() {
		return isPermisoTodoAccion;
	}

	public void setIsPermisoTodoAccion(Boolean isPermisoTodoAccion) {
		this.isPermisoTodoAccion = isPermisoTodoAccion;
	}

	public Boolean getIsPermisoNuevoAccion() {
		return isPermisoNuevoAccion;
	}

	public void setIsPermisoNuevoAccion(Boolean isPermisoNuevoAccion) {
		this.isPermisoNuevoAccion = isPermisoNuevoAccion;
	}

	public Boolean getIsPermisoActualizarAccion() {
		return isPermisoActualizarAccion;
	}

	public void setIsPermisoActualizarAccion(Boolean isPermisoActualizarAccion) {
		this.isPermisoActualizarAccion = isPermisoActualizarAccion;
	}

	public Boolean getIsPermisoEliminarAccion() {
		return isPermisoEliminarAccion;
	}

	public void setIsPermisoEliminarAccion(Boolean isPermisoEliminarAccion) {
		this.isPermisoEliminarAccion = isPermisoEliminarAccion;
	}

	public Boolean getIsPermisoGuardarCambiosAccion() {
		return isPermisoGuardarCambiosAccion;
	}

	public void setIsPermisoGuardarCambiosAccion(Boolean isPermisoGuardarCambiosAccion) {
		this.isPermisoGuardarCambiosAccion = isPermisoGuardarCambiosAccion;
	}
	
	public Boolean getIsPermisoConsultaAccion() {
		return isPermisoConsultaAccion;
	}

	public void setIsPermisoConsultaAccion(Boolean isPermisoConsultaAccion) {
		this.isPermisoConsultaAccion = isPermisoConsultaAccion;
	}

	public Boolean getIsPermisoBusquedaAccion() {
		return isPermisoBusquedaAccion;
	}

	public void setIsPermisoBusquedaAccion(Boolean isPermisoBusquedaAccion) {
		this.isPermisoBusquedaAccion = isPermisoBusquedaAccion;
	}

	public Boolean getIsPermisoReporteAccion() {
		return isPermisoReporteAccion;
	}

	public void setIsPermisoReporteAccion(Boolean isPermisoReporteAccion) {
		this.isPermisoReporteAccion = isPermisoReporteAccion;
	}
	
	public Boolean getIsPermisoPaginacionMedioAccion() {
		return isPermisoPaginacionMedioAccion;
	}

	public void setIsPermisoPaginacionMedioAccion(Boolean isPermisoPaginacionMedioAccion) {
		this.isPermisoPaginacionMedioAccion = isPermisoPaginacionMedioAccion;
	}
	
	public Boolean getIsPermisoPaginacionTodoAccion() {
		return isPermisoPaginacionTodoAccion;
	}

	public void setIsPermisoPaginacionTodoAccion(Boolean isPermisoPaginacionTodoAccion) {
		this.isPermisoPaginacionTodoAccion = isPermisoPaginacionTodoAccion;
	}
	
	public Boolean getIsPermisoPaginacionAltoAccion() {
		return isPermisoPaginacionAltoAccion;
	}

	public void setIsPermisoPaginacionAltoAccion(Boolean isPermisoPaginacionAltoAccion) {
		this.isPermisoPaginacionAltoAccion = isPermisoPaginacionAltoAccion;
	}
	
	public Boolean getIsPermisoCopiarAccion() {
		return isPermisoCopiarAccion;
	}

	public void setIsPermisoCopiarAccion(Boolean isPermisoCopiarAccion) {
		this.isPermisoCopiarAccion = isPermisoCopiarAccion;
	}
	
	public Boolean getIsPermisoVerFormAccion() {
		return isPermisoVerFormAccion;
	}

	public void setIsPermisoVerFormAccion(Boolean isPermisoVerFormAccion) {
		this.isPermisoVerFormAccion = isPermisoVerFormAccion;
	}
	
	public Boolean getIsPermisoDuplicarAccion() {
		return isPermisoDuplicarAccion;
	}

	public void setIsPermisoDuplicarAccion(Boolean isPermisoDuplicarAccion) {
		this.isPermisoDuplicarAccion = isPermisoDuplicarAccion;
	}
	
	public Boolean getIsPermisoOrdenAccion() {
		return isPermisoOrdenAccion;
	}

	public void setIsPermisoOrdenAccion(Boolean isPermisoOrdenAccion) {
		this.isPermisoOrdenAccion = isPermisoOrdenAccion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAccion() {
		return isVisibilidadCeldaNuevoAccion;
	}

	public void setIsVisibilidadCeldaNuevoAccion(Boolean isVisibilidadCeldaNuevoAccion) {
		this.isVisibilidadCeldaNuevoAccion = isVisibilidadCeldaNuevoAccion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAccion() {
		return isVisibilidadCeldaDuplicarAccion;
	}

	public void setIsVisibilidadCeldaDuplicarAccion(Boolean isVisibilidadCeldaDuplicarAccion) {
		this.isVisibilidadCeldaDuplicarAccion = isVisibilidadCeldaDuplicarAccion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAccion() {
		return isVisibilidadCeldaCopiarAccion;
	}

	public void setIsVisibilidadCeldaCopiarAccion(Boolean isVisibilidadCeldaCopiarAccion) {
		this.isVisibilidadCeldaCopiarAccion = isVisibilidadCeldaCopiarAccion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAccion() {
		return isVisibilidadCeldaVerFormAccion;
	}

	public void setIsVisibilidadCeldaVerFormAccion(Boolean isVisibilidadCeldaVerFormAccion) {
		this.isVisibilidadCeldaVerFormAccion = isVisibilidadCeldaVerFormAccion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAccion() {
		return isVisibilidadCeldaOrdenAccion;
	}

	public void setIsVisibilidadCeldaOrdenAccion(Boolean isVisibilidadCeldaOrdenAccion) {
		this.isVisibilidadCeldaOrdenAccion = isVisibilidadCeldaOrdenAccion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAccion() {
		return isVisibilidadCeldaNuevoRelacionesAccion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAccion(Boolean isVisibilidadCeldaNuevoRelacionesAccion) {
		this.isVisibilidadCeldaNuevoRelacionesAccion = isVisibilidadCeldaNuevoRelacionesAccion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAccion() {
		return isVisibilidadCeldaModificarAccion;
	}

	public void setIsVisibilidadCeldaModificarAccion(Boolean isVisibilidadCeldaModificarAccion) {
		this.isVisibilidadCeldaModificarAccion = isVisibilidadCeldaModificarAccion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAccion() {
		return isVisibilidadCeldaActualizarAccion;
	}

	public void setIsVisibilidadCeldaActualizarAccion(Boolean isVisibilidadCeldaActualizarAccion) {
		this.isVisibilidadCeldaActualizarAccion = isVisibilidadCeldaActualizarAccion;
	}

	public Boolean getIsVisibilidadCeldaEliminarAccion() {
		return isVisibilidadCeldaEliminarAccion;
	}

	public void setIsVisibilidadCeldaEliminarAccion(Boolean isVisibilidadCeldaEliminarAccion) {
		this.isVisibilidadCeldaEliminarAccion = isVisibilidadCeldaEliminarAccion;
	}

	public Boolean getIsVisibilidadCeldaCancelarAccion() {
		return isVisibilidadCeldaCancelarAccion;
	}

	public void setIsVisibilidadCeldaCancelarAccion(Boolean isVisibilidadCeldaCancelarAccion) {
		this.isVisibilidadCeldaCancelarAccion = isVisibilidadCeldaCancelarAccion;
	}

	public Boolean getIsVisibilidadCeldaGuardarAccion() {
		return isVisibilidadCeldaGuardarAccion;
	}

	public void setIsVisibilidadCeldaGuardarAccion(Boolean isVisibilidadCeldaGuardarAccion) {
		this.isVisibilidadCeldaGuardarAccion = isVisibilidadCeldaGuardarAccion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAccion() {
		return isVisibilidadCeldaGuardarCambiosAccion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAccion(Boolean isVisibilidadCeldaGuardarCambiosAccion) {
		this.isVisibilidadCeldaGuardarCambiosAccion = isVisibilidadCeldaGuardarCambiosAccion;
	}
		
	public AccionSessionBean getaccionSessionBean() {
		return this.accionSessionBean;
	}
	
	public void setaccionSessionBean(AccionSessionBean accionSessionBean) {
		this.accionSessionBean=accionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdOpcion() {
		return this.isVisibilidadFK_IdOpcion;
	}

	public void setisVisibilidadFK_IdOpcion(Boolean isVisibilidadFK_IdOpcion) {
		this.isVisibilidadFK_IdOpcion=isVisibilidadFK_IdOpcion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAccion(Accion accion)throws Exception {
		try {
			
				this.setActualParaGuardarOpcionForeignKey(accion,null);
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
	
	public void bugActualizarReferenciaActual(Accion accion,Accion accionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAccion(accion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		accionAux.setId(accion.getId());
		accionAux.setVersionRow(accion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAccion();
		
			int intSelectedRow = this.jTableDatosAccion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = accionValidator.getInvalidValues(this.accion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			accionLogic.setDatosCliente(datosCliente);
			accionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				accionAux=new  Accion();
				
				accionAux.setIsNew(true);
				accionAux.setIsChanged(true);
				
				accionAux.setAccionOriginal(this.accion);
				
				accionAux.setId(this.accion.getId());	
				accionAux.setVersionRow(this.accion.getVersionRow());	
				accionAux.setid_opcion(this.accion.getid_opcion());	
				accionAux.setcodigo(this.accion.getcodigo());	
				accionAux.setnombre(this.accion.getnombre());	
				accionAux.setsolo_form(this.accion.getsolo_form());	
				accionAux.setdescripcion(this.accion.getdescripcion());	
				accionAux.setorden(this.accion.getorden());	
				accionAux.setestado(this.accion.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.accionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.accionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(accionAux,accionLogic.getAccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionAux,accions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.accionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.accionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionLogic.saveAccions();//WithConnection
						//accionLogic.getSetVersionRowAccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.accion,accionAux);
					
					this.refrescarForeignKeysDescripcionesAccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.accionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions().addAll(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccions.addAll(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.accionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								accionLogic.saveAccionRelaciones(accionAux,this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());//WithConnection
								//accionLogic.getSetVersionRowAccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.accion,accionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccions= new ArrayList<PerfilAccion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();}
							accionAux.setPerfilAccions(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.accionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.accionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(accionAux,accionLogic.getAccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(accionAux,accions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.accion,accionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				accionAux=new  Accion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.accionSessionBean.getEsGuardarRelacionado() 
					|| (this.accionSessionBean.getEsGuardarRelacionado() && this.accion.getId()>=0)) {
						
					accionAux.setIsNew(false);
				}
				
				accionAux.setIsDeleted(false);
			
				accionAux.setId(this.accion.getId());	
				accionAux.setVersionRow(this.accion.getVersionRow());	
				accionAux.setid_opcion(this.accion.getid_opcion());	
				accionAux.setcodigo(this.accion.getcodigo());	
				accionAux.setnombre(this.accion.getnombre());	
				accionAux.setsolo_form(this.accion.getsolo_form());	
				accionAux.setdescripcion(this.accion.getdescripcion());	
				accionAux.setorden(this.accion.getorden());	
				accionAux.setestado(this.accion.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(accionAux,accionLogic.getAccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionAux,accions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.accionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.accionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionLogic.saveAccions();//WithConnection
						//accionLogic.getSetVersionRowAccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.accion,accionAux);
					
					this.refrescarForeignKeysDescripcionesAccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.accionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions().addAll(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccions.addAll(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.accionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								accionLogic.saveAccionRelaciones(accionAux,this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());//WithConnection
								//accionLogic.getSetVersionRowAccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.accion,accionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccions= new ArrayList<PerfilAccion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();}
							accionAux.setPerfilAccions(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.accionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.accionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(accionAux,accionLogic.getAccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(accionAux,accions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.accion,accionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				accionAux=new  Accion();
				
				accionAux.setIsNew(false);
				accionAux.setIsChanged(false);
				
				accionAux.setIsDeleted(true);
				
				accionAux.setId(this.accion.getId());	
				accionAux.setVersionRow(this.accion.getVersionRow());	
				accionAux.setid_opcion(this.accion.getid_opcion());	
				accionAux.setcodigo(this.accion.getcodigo());	
				accionAux.setnombre(this.accion.getnombre());	
				accionAux.setsolo_form(this.accion.getsolo_form());	
				accionAux.setdescripcion(this.accion.getdescripcion());	
				accionAux.setorden(this.accion.getorden());	
				accionAux.setestado(this.accion.getestado());	
				
				if(this.accionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.accionAux.getId()>=0) {	
						this.accionsEliminados.add(accionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(accionAux,accionLogic.getAccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionAux,accions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.accionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.accionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionLogic.saveAccions();//WithConnection
						//accionLogic.getSetVersionRowAccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.accionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions().addAll(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccions.addAll(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.accionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								accionLogic.saveAccionRelaciones(accionAux,this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());//WithConnection
								//accionLogic.getSetVersionRowAccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccions= new ArrayList<PerfilAccion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();}
							accionAux.setPerfilAccions(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.accionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.accionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(accionAux,accionLogic.getAccions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(accionAux,accions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getAccions().addAll(this.accionsEliminados);
					
					accionLogic.saveAccions();//WithConnection
					//accionLogic.getSetVersionRowAccions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAccion();
				
				this.accionsEliminados= new ArrayList<Accion>();		
			}
			
			if(this.accionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Accion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.accion=accionAux;
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
      		//this.finishProcessAccion();
      	}
		
	}	
	
	public void actualizarRelaciones(Accion accionLocal) throws Exception {
		
		if(this.accionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				accionLocal.setPerfilAccions(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());
			
			} else {
			
				accionLocal.setPerfilAccions(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Accion accionLocal) throws Exception {	
		if(this.accionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(OpcionDetalleFormJInternalFrame.class)) {
				OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrameLocal=(OpcionBeanSwingJInternalFrame) ((OpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				opcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOpcion(opcionBeanSwingJInternalFrameLocal.getopcion(),true);
				opcionBeanSwingJInternalFrameLocal.actualizarLista(opcionBeanSwingJInternalFrameLocal.opcion,this.opcionsForeignKey);

				opcionBeanSwingJInternalFrameLocal.actualizarRelaciones(opcionBeanSwingJInternalFrameLocal.opcion);

				accionLocal.setOpcion(opcionBeanSwingJInternalFrameLocal.opcion);

				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey("Formulario");
				this.setActualOpcionForeignKey(opcionBeanSwingJInternalFrameLocal.opcion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAccionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAccion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = accionValidator.getInvalidValues(this.accion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Accion accion,List<Accion> accions) throws Exception {
		try	{		
			AccionConstantesFunciones.actualizarLista(accion,accions,this.accionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Accion accion,List<Accion> accions) throws Exception {
		try	{			
			AccionConstantesFunciones.actualizarSelectedLista(accion,accions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Accion> accionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				accionsLocal=this.accionLogic.getAccions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				accionsLocal=this.accions;
			}
			//ARCHITECTURE
		
			for(Accion accionLocal:accionsLocal) {
				if(this.permiteMantenimiento(accionLocal) && accionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AccionConstantesFunciones.getAccionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AccionConstantesFunciones.IDOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelid_opcionAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelcodigoAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelnombreAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionConstantesFunciones.SOLOFORM)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelsolo_formAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabeldescripcionAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelordenAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AccionConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelestadoAccion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccion.jLabelid_opcionAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccion.jLabelcodigoAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccion.jLabelnombreAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccion.jLabelsolo_formAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccion.jLabeldescripcionAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccion.jLabelordenAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAccion.jLabelestadoAccion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PerfilAccion")) {
			if(this.accion==null) {
				this.accion= new Accion();
			}

			if(this.accionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoAccion
				this.setVariablesFormularioToObjetoActualAccion(this.accion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);

				this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.getperfilaccion().setAccion(this.accion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoAccion--;	
		
		
		this.accionAux=new Accion();
		
		this.accionAux.setId(this.iIdNuevoAccion);
		this.accionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.accionLogic.getAccions().add(this.accionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.accions.add(this.accionAux);
		}
		//ARCHITECTURE
		
		this.accion=this.accionAux;
		
		if(AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAccion(this.accion);
			this.setVariablesObjetoActualToFormularioForeignKeyAccion(this.accion);
		}
				
		//this.setDefaultControlesAccion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAccion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAccion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAccion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAccion(this.accionBean,this.accion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AccionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.accionSessionBean.getConGuardarRelaciones()) {
			classes=AccionConstantesFunciones.getClassesRelationshipsOfAccion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.accionReturnGeneral=accionLogic.procesarEventosAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.accionLogic.getAccions(),this.accion,this.accionParameterGeneral,this.isEsNuevoAccion,classes);//this.accionLogic.getAccion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAccion(this.accionReturnGeneral,this.accionBean,false);
		
		if(this.accionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAccion(this.accionReturnGeneral.getAccion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAccion(this.accionReturnGeneral.getAccion());
		}
		
		if(this.accionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAccion(this.accionReturnGeneral.getAccion(),classes);//this.accionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAccion(this.accion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAccion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAccion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AccionBeanSwingJInternalFrameAdditional.RecargarFormAccion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAccion(false);
						
			if(accionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.getEsGuardarRelacionado() && PerfilAccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilAccionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(AccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAccion();
			}
			
			this.actualizarVisualTableDatosAccion();
			
			this.jTableDatosAccion.setRowSelectionInterval(this.getIndiceNuevoAccion(), this.getIndiceNuevoAccion());
			
			this.seleccionarFilaTablaAccionActual();
						
			this.actualizarEstadoCeldasBotonesAccion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAccion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.setEnabled(isHabilitar && this.accionConstantesFunciones.activarcodigoAccion);
		this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.setEnabled(isHabilitar && this.accionConstantesFunciones.activarnombreAccion);
		this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setEnabled(isHabilitar && this.accionConstantesFunciones.activarsolo_formAccion);
		this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.setEnabled(isHabilitar && this.accionConstantesFunciones.activardescripcionAccion);
		this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.setEnabled(isHabilitar && this.accionConstantesFunciones.activarordenAccion);
		this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setEnabled(isHabilitar && this.accionConstantesFunciones.activarestadoAccion);	
		
		this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setEnabled(isHabilitar && this.accionConstantesFunciones.activarid_opcionAccion);
	};
	
	public void setDefaultControlesAccion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAccion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.accionSessionBean.setConGuardarRelaciones(true);			
			this.accionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.accionSessionBean.setConGuardarRelaciones(false);			
			this.accionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoAccion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accion accionAux:this.accionLogic.getAccions()) {
				if(accionAux.getId().equals(this.iIdNuevoAccion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accion accionAux:this.accions) {
				if(accionAux.getId().equals(this.iIdNuevoAccion)) {
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
	
	public int getIndiceActualAccion(Accion accion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accion accionAux:this.accionLogic.getAccions()) {
				if(accionAux.getId().equals(accion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accion accionAux:this.accions) {
				if(accionAux.getId().equals(accion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAccion(Accion accionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accion accionAux:this.accionLogic.getAccions()) {
				if(accionAux.getAccionOriginal().getId().equals(accionOriginal.getId())) {
					existe=true;
					accionOriginal.setId(accionAux.getId());
					accionOriginal.setVersionRow(accionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accion accionAux:this.accions) {
				if(accionAux.getAccionOriginal().getId().equals(accionOriginal.getId())) {
					existe=true;
					accionOriginal.setId(accionAux.getId());
					accionOriginal.setVersionRow(accionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAccion(Boolean esParaCancelar) throws Exception {
		accionsAux=new ArrayList<Accion>();
		accionAux=new Accion();
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Accion accionAux:this.accionLogic.getAccions()) {
					if(accionAux.getId()<0) {
						accionsAux.add(accionAux);
					}		
				}
				this.iIdNuevoAccion=0L;
				this.accionLogic.getAccions().removeAll(accionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accion accionAux:this.accions) {
					if(accionAux.getId()<0) {
						accionsAux.add(accionAux);
					}		
				}
				this.iIdNuevoAccion=0L;
				this.accions.removeAll(accionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAccion 
					&& this.accionLogic.getAccions().size()>0
					) {
					accionAux=this.accionLogic.getAccions().get(this.accionLogic.getAccions().size() - 1);
				
					if(accionAux.getId()<0) {
						this.accionLogic.getAccions().remove(accionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAccion && this.accions.size()>0) {
					accionAux=this.accions.get(this.accions.size() - 1);
				
					if(accionAux.getId()<0) {
						this.accions.remove(accionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAccion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(accion.getId()<0) {
				this.accionLogic.getAccions().remove(this.accion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(accion.getId()<0) {
				this.accions.remove(this.accion);
			}
		}			
	}
	
	public void setEstadosInicialesAccion(List<Accion> accionsAux) throws Exception {
		AccionConstantesFunciones.setEstadosInicialesAccion(accionsAux);
	}
	
	public void setEstadosInicialesAccion(Accion accionAux) throws Exception {
		AccionConstantesFunciones.setEstadosInicialesAccion(accionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAccionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAccionActual()) {
				if(!this.isEsNuevoAccion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAccion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAccionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Accion ?", "MANTENIMIENTO DE Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Accion accion) throws Exception {
		AccionConstantesFunciones.seleccionarAsignar(this.accion,accion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAccion=this.isPermisoActualizarOriginalAccion;
			
			
			this.seleccionarAsignar(accion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AccionConstantesFunciones.quitarEspaciosAccion(this.accion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.accionSessionBean.setsFuncionBusquedaRapida(this.accionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAccion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAccion(esParaCancelar);				
				this.cancelarNuevoAccion(esParaCancelar);								
			}
			
			this.accion=new Accion();
			
			this.inicializarAccion();
			
			this.actualizarEstadoCeldasBotonesAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAccion() throws Exception {
		try {
			AccionConstantesFunciones.inicializarAccion(this.accion);
			
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
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.accionLogic.getAccions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAccions(String sAccionBusqueda,List<Accion> accionsParaReportes) throws Exception {
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
					sPathReporteFinal="Accion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AccionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AccionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Accion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Acciones");		
		parameters.put("busquedapor", AccionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PerfilAccion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					AccionLogic accionLogicAuxiliar=new AccionLogic();
					accionLogicAuxiliar.setDatosCliente(accionLogic.getDatosCliente());				
					accionLogicAuxiliar.setAccions(accionsParaReportes);
					
					accionLogicAuxiliar.cargarRelacionesLoteForeignKeyAccionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					accionsParaReportes=accionLogicAuxiliar.getAccions();
					
					//accionLogic.getNewConnexionToDeep();
					
					//for (Accion accion:accionsParaReportes) {
					//	accionLogic.deepLoad(accion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//accionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//accionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePerfilAccion = AuxiliarReportes.class.getResourceAsStream("PerfilAccionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_perfilaccion", reportFilePerfilAccion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAccion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AccionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AccionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAccion=new JRBeanArrayDataSource(AccionJInternalFrame.TraerAccionBeans(accionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAccion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AccionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AccionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AccionBean.TraerAccionBeans(accionsParaReportes).toArray()));
							
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
				this.generarExcelReporteAccions(sAccionBusqueda,sTipoArchivoReporte,accionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAccions(sAccionBusqueda,sTipoArchivoReporte,accionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAccionActionPerformed(null);
					//this.generarExcelReporteAccions(sAccionBusqueda,sTipoArchivoReporte,accionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAccions(sAccionBusqueda,sTipoArchivoReporte,accionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAccions(sAccionBusqueda,sTipoArchivoReporte,accionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAccions(sAccionBusqueda,sTipoArchivoReporte,accionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Accion> accionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Accions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAccion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Accion accion : accionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AccionConstantesFunciones.generarExcelReporteDataAccion("NORMAL",row,workbook,accion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAccion(String sTipo,Row row,Workbook workbook) {
		
		AccionConstantesFunciones.generarExcelReporteHeaderAccion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Accion> accionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Accions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Accion accion : accionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AccionConstantesFunciones.getAccionDescripcion(accion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionConstantesFunciones.LABEL_IDOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionConstantesFunciones.LABEL_IDOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accion.getopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionConstantesFunciones.LABEL_SOLOFORM))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionConstantesFunciones.LABEL_SOLOFORM);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(accion.getsolo_form()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accion.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(accion.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AccionConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AccionConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(accion.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Accion> accionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Accion> accionsRespaldo=null;
		
		classes=AccionConstantesFunciones.getClassesRelationshipsOfAccion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.accionLogic.setDatosCliente(this.datosCliente);
		this.accionLogic.setDatosDeep(this.datosDeep);
		this.accionLogic.setIsConDeep(true);
		
		accionsRespaldo=this.accionLogic.getAccions();
		
		this.accionLogic.setAccions(accionsParaReportes);	
		this.accionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		accionsParaReportes=this.accionLogic.getAccions();
		this.accionLogic.setAccions(accionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Accions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAccion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Accion accion : accionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAccion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AccionConstantesFunciones.generarExcelReporteDataAccion("NORMAL",row,workbook,accion,cellStyleDataAux);
		
			
			


				//PerfilAccion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PerfilAccionConstantesFunciones.SCLASSWEBTITULO))) {

				if(accion.getPerfilAccions()!=null && accion.getPerfilAccions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PerfilAccionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PerfilAccionConstantesFunciones.generarExcelReporteHeaderPerfilAccion("RELACIONADO",row,workbook);
				}

				if(accion.getPerfilAccions()!=null) {
					i2=0;
					for(PerfilAccion perfilaccion : accion.getPerfilAccions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PerfilAccionConstantesFunciones.generarExcelReporteDataPerfilAccion("RELACIONADO",row,workbook,perfilaccion,cellStyleDataAuxHijo);
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
		cell.setCellValue(AccionConstantesFunciones.getAccionDescripcion(accion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAccion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAccion() throws Exception {		
		this.startProcessAccion(true);
	}
	
	public void startProcessAccion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAccion ,this.jPanelParametrosReportesAccion, this.jScrollPanelDatosAccion,this.jPanelPaginacionAccion, this.jScrollPanelDatosEdicionAccion, this.jPanelAccionesAccion,this.jPanelAccionesFormularioAccion,this.jmenuBarAccion,this.jmenuBarDetalleAccion,this.jTtoolBarAccion,this.jTtoolBarDetalleAccion);		
		
		final JTabbedPane jTabbedPaneBusquedasAccion=this.jTabbedPaneBusquedasAccion; 
		
		final JPanel jPanelParametrosReportesAccion=this.jPanelParametrosReportesAccion;
		//final JScrollPane jScrollPanelDatosAccion=this.jScrollPanelDatosAccion;
		final JTable jTableDatosAccion=this.jTableDatosAccion;		
		final JPanel jPanelPaginacionAccion=this.jPanelPaginacionAccion;
		//final JScrollPane jScrollPanelDatosEdicionAccion=this.jScrollPanelDatosEdicionAccion;
		final JPanel jPanelAccionesAccion=this.jPanelAccionesAccion;
		
		JPanel jPanelCamposAuxiliarAccion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAccion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
			jPanelCamposAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jPanelCamposAccion;
			jPanelAccionesFormularioAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jPanelAccionesFormularioAccion;
		}
		
		final JPanel jPanelCamposAccion=jPanelCamposAuxiliarAccion;
		final JPanel jPanelAccionesFormularioAccion=jPanelAccionesFormularioAuxiliarAccion;
		
		
		final JMenuBar jmenuBarAccion=this.jmenuBarAccion;
		final JToolBar jTtoolBarAccion=this.jTtoolBarAccion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAccion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
			jmenuBarDetalleAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jmenuBarDetalleAccion;
			jTtoolBarDetalleAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jTtoolBarDetalleAccion;
		}
		
		final JMenuBar jmenuBarDetalleAccion=jmenuBarDetalleAuxiliarAccion;
		final JToolBar jTtoolBarDetalleAccion=jTtoolBarDetalleAuxiliarAccion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAccion;
			processRunnable.jTableDatos=jTableDatosAccion;
			processRunnable.jPanelCampos=jPanelCamposAccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionAccion;
			processRunnable.jPanelAcciones=jPanelAccionesAccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAccion;
			
			
			processRunnable.jmenuBar=jmenuBarAccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAccion;
			processRunnable.jTtoolBar=jTtoolBarAccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAccion ,jPanelParametrosReportesAccion,jTableDatosAccion, /*jScrollPanelDatosAccion,*/jPanelCamposAccion,jPanelPaginacionAccion, /*jScrollPanelDatosEdicionAccion,*/ jPanelAccionesAccion,jPanelAccionesFormularioAccion,jmenuBarAccion,jmenuBarDetalleAccion,jTtoolBarAccion,jTtoolBarDetalleAccion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAccion ,jPanelParametrosReportesAccion, jScrollPanelDatosAccion,jPanelPaginacionAccion, jScrollPanelDatosEdicionAccion, jPanelAccionesAccion,jPanelAccionesFormularioAccion,jmenuBarAccion,jmenuBarDetalleAccion,jTtoolBarAccion,jTtoolBarDetalleAccion);
						
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
	
	public void finishProcessAccion() {// throws Exception 
		this.finishProcessAccion(true);
	}
	
	public void finishProcessAccion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAccion ,this.jPanelParametrosReportesAccion, this.jScrollPanelDatosAccion,this.jPanelPaginacionAccion, this.jScrollPanelDatosEdicionAccion, this.jPanelAccionesAccion,this.jPanelAccionesFormularioAccion,this.jmenuBarAccion,this.jmenuBarDetalleAccion,this.jTtoolBarAccion,this.jTtoolBarDetalleAccion);		
		
		final JTabbedPane jTabbedPaneBusquedasAccion=this.jTabbedPaneBusquedasAccion; 
		
		final JPanel jPanelParametrosReportesAccion=this.jPanelParametrosReportesAccion;
		//final JScrollPane jScrollPanelDatosAccion=this.jScrollPanelDatosAccion;
		final JTable jTableDatosAccion=this.jTableDatosAccion;		
		final JPanel jPanelPaginacionAccion=this.jPanelPaginacionAccion;
		//final JScrollPane jScrollPanelDatosEdicionAccion=this.jScrollPanelDatosEdicionAccion;
		final JPanel jPanelAccionesAccion=this.jPanelAccionesAccion;
		
		JPanel jPanelCamposAuxiliarAccion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAccion=new JPanel();
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
			jPanelCamposAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jPanelCamposAccion;
			jPanelAccionesFormularioAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jPanelAccionesFormularioAccion;
		}
		
		final JPanel jPanelCamposAccion=jPanelCamposAuxiliarAccion;
		final JPanel jPanelAccionesFormularioAccion=jPanelAccionesFormularioAuxiliarAccion;
		
		
		final JMenuBar jmenuBarAccion=this.jmenuBarAccion;		
		final JToolBar jTtoolBarAccion=this.jTtoolBarAccion;
				
		JMenuBar jmenuBarDetalleAuxiliarAccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAccion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
			jmenuBarDetalleAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jmenuBarDetalleAccion;
			jTtoolBarDetalleAuxiliarAccion=this.jInternalFrameDetalleFormAccion.jTtoolBarDetalleAccion;		
		}
		
		final JMenuBar jmenuBarDetalleAccion=jmenuBarDetalleAuxiliarAccion;
		final JToolBar jTtoolBarDetalleAccion=jTtoolBarDetalleAuxiliarAccion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAccion;
			processRunnable.jTableDatos=jTableDatosAccion;
			processRunnable.jPanelCampos=jPanelCamposAccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionAccion;
			processRunnable.jPanelAcciones=jPanelAccionesAccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAccion;
			
			
			processRunnable.jmenuBar=jmenuBarAccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAccion;
			processRunnable.jTtoolBar=jTtoolBarAccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAccion ,jPanelParametrosReportesAccion, jTableDatosAccion,/*jScrollPanelDatosAccion,*/jPanelCamposAccion,jPanelPaginacionAccion, /*jScrollPanelDatosEdicionAccion,*/ jPanelAccionesAccion,jPanelAccionesFormularioAccion,jmenuBarAccion,jmenuBarDetalleAccion,jTtoolBarAccion,jTtoolBarDetalleAccion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAccion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAccion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAccion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAccion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAccion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.accionConstantesFunciones.getsFinalQueryAccion();
		String  finalQueryPaginacionTodos=this.accionConstantesFunciones.getsFinalQueryAccion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AccionConstantesFunciones.getArrayColumnasGlobalesNoAccion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AccionConstantesFunciones.getArrayColumnasGlobalesAccion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AccionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.accionsEliminados= new ArrayList<Accion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAccion();
		
				///*AccionSessionBean*/this.accionSessionBean=new AccionSessionBean();
			
			if(this.accionSessionBean==null) {
				this.accionSessionBean=new AccionSessionBean();
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
					this.iNumeroPaginacion=AccionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AccionConstantesFunciones.getClassesForeignKeysOfAccion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/accion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			accionsAux= new ArrayList<Accion>();
			
				
			accionLogic.setDatosCliente(this.datosCliente);
			accionLogic.setDatosDeep(this.datosDeep);
			accionLogic.setIsConDeep(true);
			
			
			accionLogic.getAccionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					accionLogic.getTodosAccions(finalQueryGlobal,pagination);
					
					//accionLogic.getTodosAccionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(accionLogic.getAccions()==null|| accionLogic.getAccions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							accionsAux= new ArrayList<Accion>();
							accionsAux.addAll(accionLogic.getAccions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionsAux= new ArrayList<Accion>();
							accionsAux.addAll(accions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							accionLogic.getTodosAccions(finalQueryGlobal+"",this.pagination);												
							
							//accionLogic.getTodosAccionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAccions("Todos",accionLogic.getAccions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							accionLogic.setAccions(new ArrayList<Accion>());					
							accionLogic.getAccions().addAll(accionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accions=new ArrayList<Accion>();
							accions.addAll(accionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAccion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAccion=this.idActual;
				
				} else if(this.idAccionActual!=null && this.idAccionActual!=0L) {
					idAccion=idAccionActual;
				}
				
					
				this.sDetalleReporte=AccionConstantesFunciones.getDetalleIndicePorId(idAccion);
				
				this.accions=new ArrayList<Accion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					accionLogic.getEntity(idAccion);
					
					//accionLogic.getEntityWithConnection(idAccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionLogic.setAccions(new ArrayList<Accion>());
					accionLogic.getAccions().add(accionLogic.getAccion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accions=new ArrayList<Accion>();
					this.accions.add(accion);
				}
				
				if(accionLogic.getAccion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdOpcion")) {
				this.sDetalleReporte=AccionConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					accionLogic.getAccionsFK_IdOpcion(finalQueryGlobal,pagination,id_opcionFK_IdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=accionLogic.getAccions()==null||accionLogic.getAccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=accions==null|| accions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						accionsAux=new ArrayList<Accion>();
						accionsAux.addAll(accionLogic.getAccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionsAux=new ArrayList<Accion>();
							accionsAux.addAll(accions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							accionLogic.getAccionsFK_IdOpcion(finalQueryGlobal,pagination,id_opcionFK_IdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AccionConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AccionConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAccions("FK_IdOpcion",accionLogic.getAccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAccions("FK_IdOpcion",accions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						accionLogic.setAccions(new ArrayList<Accion>());
						accionLogic.getAccions().addAll(accionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accions=new ArrayList<Accion>();
							accions.addAll(accionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAccion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAccion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=accionLogic.getAccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=accions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=accionLogic.getAccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=accions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Accion accion) {
		Boolean permite=true;
		
		if(this.accion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AccionConstantesFunciones.getOrderByListaAccion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AccionConstantesFunciones.getOrderByListaAccion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accion accion:accionLogic.getAccions()) {
				if(accion.getsType().equals(Constantes2.S_TOTALES)) {
					accionTotales=accion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accion accion:this.accions) {
				if(accion.getsType().equals(Constantes2.S_TOTALES)) {
					accionTotales=accion;
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
			this.accionAux=new Accion();
			this.accionAux.setsType(Constantes2.S_TOTALES);
			this.accionAux.setIsNew(false);
			this.accionAux.setIsChanged(false);
			this.accionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AccionConstantesFunciones.TotalizarValoresFilaAccion(this.accionLogic.getAccions(),this.accionAux);
				
				this.accionLogic.getAccions().add(this.accionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AccionConstantesFunciones.TotalizarValoresFilaAccion(this.accions,this.accionAux);
				
				this.accions.add(this.accionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		accionTotales=new Accion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.accionLogic.getAccions().remove(accionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.accions.remove(accionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		accionTotales=new Accion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Accion accion:accionLogic.getAccions()) {
				if(accion.getsType().equals(Constantes2.S_TOTALES)) {
					accionTotales=accion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AccionConstantesFunciones.TotalizarValoresFilaAccion(this.accionLogic.getAccions(),accionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Accion accion:this.accions) {
				if(accion.getsType().equals(Constantes2.S_TOTALES)) {
					accionTotales=accion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AccionConstantesFunciones.TotalizarValoresFilaAccion(this.accions,accionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAccionsFK_IdOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAccionsFK_IdOpcion(String sFinalQuery,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionLogic.getAccionsFK_IdOpcion(sFinalQuery,this.pagination,id_opcion);
				
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
	
	public void inicializarPermisosAccion() {
		this.isPermisoTodoAccion=false;
		this.isPermisoNuevoAccion=false;
		this.isPermisoActualizarAccion=false;
		this.isPermisoActualizarOriginalAccion=false;
		this.isPermisoEliminarAccion=false;
		this.isPermisoGuardarCambiosAccion=false;
		this.isPermisoConsultaAccion=false;
		this.isPermisoBusquedaAccion=false;
		this.isPermisoReporteAccion=false;		
		this.isPermisoOrdenAccion=false;		
		this.isPermisoPaginacionMedioAccion=false;		
		this.isPermisoPaginacionAltoAccion=false;
		this.isPermisoPaginacionTodoAccion=false;
		this.isPermisoCopiarAccion=false;		
		this.isPermisoVerFormAccion=false;		
		this.isPermisoDuplicarAccion=false;		
		this.isPermisoOrdenAccion=false;		
	}
	
	public void setPermisosUsuarioAccion(Boolean isPermiso) {
		this.isPermisoTodoAccion=isPermiso;
		this.isPermisoNuevoAccion=isPermiso;
		this.isPermisoActualizarAccion=isPermiso;
		this.isPermisoActualizarOriginalAccion=isPermiso;
		this.isPermisoEliminarAccion=isPermiso;
		this.isPermisoGuardarCambiosAccion=isPermiso;
		this.isPermisoConsultaAccion=isPermiso;
		this.isPermisoBusquedaAccion=isPermiso;
		this.isPermisoReporteAccion=isPermiso;
		this.isPermisoOrdenAccion=isPermiso;		
		this.isPermisoPaginacionMedioAccion=isPermiso;		
		this.isPermisoPaginacionAltoAccion=isPermiso;		
		this.isPermisoPaginacionTodoAccion=isPermiso;		
		this.isPermisoCopiarAccion=isPermiso;		
		this.isPermisoVerFormAccion=isPermiso;		
		this.isPermisoDuplicarAccion=isPermiso;
		this.isPermisoOrdenAccion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAccion(Boolean isPermiso) {
		//this.isPermisoTodoAccion=isPermiso;
		this.isPermisoNuevoAccion=isPermiso;
		this.isPermisoActualizarAccion=isPermiso;
		this.isPermisoActualizarOriginalAccion=isPermiso;
		this.isPermisoEliminarAccion=isPermiso;
		this.isPermisoGuardarCambiosAccion=isPermiso;
		//this.isPermisoConsultaAccion=isPermiso;
		//this.isPermisoBusquedaAccion=isPermiso;
		//this.isPermisoReporteAccion=isPermiso;
		//this.isPermisoOrdenAccion=isPermiso;		
		//this.isPermisoPaginacionMedioAccion=isPermiso;		
		//this.isPermisoPaginacionAltoAccion=isPermiso;		
		//this.isPermisoPaginacionTodoAccion=isPermiso;		
		//this.isPermisoCopiarAccion=isPermiso;		
		//this.isPermisoDuplicarAccion=isPermiso;
		//this.isPermisoOrdenAccion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAccionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PerfilAccionConstantesFunciones.SNOMBREOPCION);
		
		if(AccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPerfilAccion=false;
		this.isTienePermisosPerfilAccion=this.verificarGetPermisosUsuarioOpcionAccionClaseRelacionada(this.opcionsRelacionadas,PerfilAccionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebAccion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAccionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPerfilAccion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioAccionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAccionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAccionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPerfilAccion && this.jInternalFrameDetalleFormAccion!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.remove(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioAccion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.accionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AccionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAccion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAccion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAccion=this.isPermisoActualizarAccion;
			this.isPermisoEliminarAccion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAccion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAccion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAccion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAccion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAccion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAccion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAccion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAccion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAccion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAccion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAccion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.accionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAccion.setToolTipText(this.jTableDatosAccion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAccion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAccion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAccion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPerfilAccion && this.accionConstantesFunciones.mostrarPerfilAccionAccion && !AccionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil Accion");
			reporte.setsDescripcion("Perfil Accion");
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
	public void inicializarCombosForeignKeyAccionListas()throws Exception {
		try	{						
			
				this.opcionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AccionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAccionListas(false);
			} else {
			
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyOpcionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=OpcionConstantesFunciones.SFINALQUERY;

				this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AccionParameterReturnGeneral accionReturnGeneral=new AccionParameterReturnGeneral();
						
			


				String finalQueryGlobalOpcion="";

				if(((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0) && this.accionConstantesFunciones.cargarid_opcionAccion)
					 || (this.esRecargarFks && this.accionConstantesFunciones.cargarid_opcionAccion)) {

					if(!this.accionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalOpcion, "");
						finalQueryGlobalOpcion+=OpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOpcion=" WHERE " + ConstantesSql.ID + "="+accionSessionBean.getlidOpcionActual();
					}
				} else {
					finalQueryGlobalOpcion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				accionReturnGeneral=accionLogic.cargarCombosLoteForeignKeyAccion(finalQueryGlobalOpcion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				this.opcionsForeignKey=accionReturnGeneral.getopcionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAccion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyOpcion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyOpcion()throws Exception {
		try {
			if(this.accionSessionBean==null) {
				this.accionSessionBean=new AccionSessionBean();
			}

			if(!this.accionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
				Opcion opcion=new Opcion();
				OpcionConstantesFunciones.setOpcionDescripcion(opcion,Constantes.SMENSAJE_ESCOJA_OPCION);
				opcion.setId(null);

				if(!OpcionConstantesFunciones.ExisteEnLista(this.opcionsForeignKey,opcion,true)) {

					this.opcionsForeignKey.add(0,opcion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAccion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAccion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAccion(Accion accion)throws Exception {	
		try {
			
			this.setActualOpcionForeignKey(accion.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAccion(Accion accion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAccion()throws Exception {	
		try {
			
			this.setActualOpcionForeignKey(this.accionConstantesFunciones.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAccion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAccion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAccion()throws Exception {
		try {
			

			this.cargarCombosFrameOpcionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAccion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion!=null && this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public AccionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AccionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AccionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.accionSessionBean=new AccionSessionBean(); 
		this.accionConstantesFunciones=new AccionConstantesFunciones(); 
		this.accionBean=new Accion();//(this.accionConstantesFunciones); 		
		this.accionReturnGeneral=new AccionParameterReturnGeneral(); 
		
		this.accionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.accionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAccion(true);
			
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
			
			this.accionConstantesFunciones=new AccionConstantesFunciones(); 
			this.accionBean=new Accion();//this.accionConstantesFunciones); 			
			this.accionReturnGeneral=new AccionParameterReturnGeneral(); 
		
			AccionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Accion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.accion=new Accion();
			this.accions = new ArrayList<Accion>();
			this.accionsAux = new ArrayList<Accion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic=new AccionLogic();
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			//this.accionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.accionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAccion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAccion);	
					}
					
					if(this.jInternalFrameImportacionAccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAccion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAccion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAccion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAccion);
				this.jInternalFrameDetalleFormAccion.setVisible(false);
				this.jInternalFrameDetalleFormAccion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAccion);
					this.jInternalFrameReporteDinamicoAccion.setVisible(false);
					this.jInternalFrameReporteDinamicoAccion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAccion);
					this.jInternalFrameImportacionAccion.setVisible(false);
					this.jInternalFrameImportacionAccion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAccion);
					this.jInternalFrameOrderByAccion.setVisible(false);
					this.jInternalFrameOrderByAccion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAccionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AccionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.accionReturnGeneral=new AccionParameterReturnGeneral();
			
			this.accionParameterGeneral=new AccionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.accionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.accionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AccionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.accionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PerfilAccionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.accionSessionBean.getEsGuardarRelacionado(),this.accionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.accionSessionBean.getEsGuardarRelacionado(),this.accionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAccion=false;
			this.isVisibilidadCeldaDuplicarAccion=true;
			this.isVisibilidadCeldaCopiarAccion=true;
			this.isVisibilidadCeldaVerFormAccion=true;
			this.isVisibilidadCeldaOrdenAccion=true;
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
			this.isVisibilidadCeldaModificarAccion=false;
			this.isVisibilidadCeldaActualizarAccion=false;
			this.isVisibilidadCeldaEliminarAccion=false;
			this.isVisibilidadCeldaCancelarAccion=false;
			this.isVisibilidadCeldaGuardarAccion=false;
			this.isVisibilidadCeldaGuardarCambiosAccion=false;
			
			
			this.isVisibilidadFK_IdOpcion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAccion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAccion(false);
			
			this.setPermisosUsuarioAccion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.accionSessionBean.getEsGuardarRelacionado() 
				|| (this.accionSessionBean.getEsGuardarRelacionado() && this.accionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAccionClasesRelacionadas();
			}
			
			if(this.accionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAccionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAccion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAccion();
			}
			
			if(!this.isPermisoBusquedaAccion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAccion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.accionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAccion,this.isPermisoPaginacionMedioAccion,this.isPermisoPaginacionTodoAccion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AccionConstantesFunciones.getTiposSeleccionarAccion());
				
				this.tiposColumnasSelect=AccionConstantesFunciones.getTiposSeleccionarAccion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectAccion();				
				//this.tiposRelacionesSelect=AccionConstantesFunciones.getTiposRelacionesAccion(true);
				
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
			//if(!this.accionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAccion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAccion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAccion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAccion() ;
			
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
			
			
			this.perfilaccionLogic=new PerfilAccionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.opcionLogic=new OpcionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				accionImplementable= (AccionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				accionImplementableHome= (AccionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.accions= new ArrayList<Accion>();
			this.accionsEliminados= new ArrayList<Accion>();
						
			this.isEsNuevoAccion=false;
			this.esParaAccionDesdeFormularioAccion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.opcionsForeignKey=new ArrayList<Opcion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAccion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAccion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.accionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AccionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AccionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAccion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAccion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAccion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAccion();
			}
			
			AccionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAccion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAccion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAccion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAccion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Accion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAccion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAccion")) {
				iIndex=this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAccion.getSelectedRow();	
				
				

				if(sTitle.equals("Perfil Acciones")) {
					if(!PerfilAccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessAccion();

						this.cargarParteTabPanelRelacionadaPerfilAccion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAccion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPerfilAccion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormAccion.cargarSessionConBeanSwingJInternalFramePerfilAccion(false,true,iIndex);
		this.jButtonPerfilAccionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilAccion();

		//this.jTabbedPaneRelacionesAccion.updateUI();
		//this.jTabbedPaneRelacionesAccion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesAccion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PerfilAccion")) {
				int row=this.jTableDatosAccion.getSelectedRow();
				jButtonPerfilAccionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Perfil Accion")) {

					if(this.isTienePermisosPerfilAccion && this.accionConstantesFunciones.mostrarPerfilAccionAccion && !AccionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Perfil Acciones"+"("+PerfilAccionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfil Acciones");

						if(accionConstantesFunciones.resaltarPerfilAccionAccion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(accionConstantesFunciones.resaltarPerfilAccionAccion);
						}

						jmenuItem.setEnabled(this.accionConstantesFunciones.activarPerfilAccionAccion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PerfilAccion"));

						

						this.jInternalFrameDetalleFormAccion.jmenuDetalleAccion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyAccion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAccion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAccionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAccion();
		
		this.cargarCombosFrameForeignKeyAccion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAccion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAccion();
		}
	}
	
	

	public void cargarCombosForeignKeyOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaOpcion(this.opcionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.accionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
			
			if(jTableDatosAccion.getRowCount()>=1) {
				jTableDatosAccion.removeRowSelectionInterval(0, jTableDatosAccion.getRowCount()-1);						
			}
			
			this.isEsNuevoAccion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAccion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAccion(true);			
			//this.accion=new Accion();
			//this.accion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAccion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccion() ;
			
			if(AccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAccion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.accion);	
			this.actualizarInformacion("INFO_PADRE",false,this.accion);				
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
			if(this.accionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Accion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAccion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAccion.getSelectedRows().length;			
			}
			
			accionsSeleccionados=this.getAccionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAccion--;			
				//Accion accionAux= new Accion();			
				//accionAux.setId(this.iIdNuevoAccion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Accion accionOrigen=new Accion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Accion accionOrigen : accionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAccion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							accionOrigen =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							accionOrigen =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAccion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.accion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAccion(accionOrigen,this.accion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.accionLogic.getAccions().add(this.accionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.accions.add(this.accionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAccion(false);
				
				this.jTableDatosAccion.setRowSelectionInterval(this.getIndiceNuevoAccion(), this.getIndiceNuevoAccion());
				
				int iLastRow =  this.jTableDatosAccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAccion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();									
		
			Accion accionOrigen=new Accion();
			Accion accionDestino=new Accion();
				
			accionsSeleccionados=this.getAccionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAccion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || accionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAccion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionOrigen =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						accionOrigen =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						accionDestino =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						accionDestino =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				accionOrigen =accionsSeleccionados.get(0);
				accionDestino =accionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAccion(accionOrigen,accionDestino,true,false);
				
				accionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(accionDestino,accionLogic.getAccions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(accionDestino,accions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAccion(false);
				
				//this.jTableDatosAccion.setRowSelectionInterval(this.getIndiceNuevoAccion(), this.getIndiceNuevoAccion());
				
				int iLastRow =  this.jTableDatosAccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAccion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAccion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAccion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAccion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAccion.setVisible(!isVisible);
			this.jPanelPaginacionAccion.setVisible(!isVisible);
			this.jPanelAccionesAccion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAccion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAccion();
			
			this.abrirFrameOrderByAccion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAccion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAccion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAccion.isMaximum()) {
					this.jInternalFrameDetalleFormAccion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAccion.setSize(this.jInternalFrameDetalleFormAccion.iWidthFormulario,this.jInternalFrameDetalleFormAccion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAccion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAccion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAccion.isMaximum()) {
						this.jInternalFrameDetalleFormAccion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAccion.jContentPaneDetalleAccion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAccion.jContentPaneDetalleAccion.getWidth(),AccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAccion.jContentPaneDetalleAccion.getWidth(),AccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAccion.jContentPaneDetalleAccion.getWidth(),AccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PerfilAccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfilAccion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAccion.setVisible(true);
	        this.jInternalFrameDetalleFormAccion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAccion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccion,false,this);
				} else {
					this.jInternalFrameOrderByAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAccion);
				this.jInternalFrameOrderByAccion.setVisible(false);
				this.jInternalFrameOrderByAccion.setSelected(false);
				
				this.jInternalFrameOrderByAccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAccion"));
				
				this.inicializarActualizarBindingTablaOrderByAccion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAccion==null) {
				
				this.jInternalFrameImportacionAccion=new ImportacionJInternalFrame(AccionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAccion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAccion);
				this.jInternalFrameImportacionAccion.setVisible(false);
				this.jInternalFrameImportacionAccion.setSelected(false);


				this.jInternalFrameImportacionAccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAccion"));
				this.jInternalFrameImportacionAccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAccion"));
				this.jInternalFrameImportacionAccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAccion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAccion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAccion==null) {
				this.jInternalFrameReporteDinamicoAccion=new ReporteDinamicoJInternalFrame(AccionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAccion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAccion);
				this.jInternalFrameReporteDinamicoAccion.setVisible(false);
				this.jInternalFrameReporteDinamicoAccion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAccion"));
				this.jInternalFrameReporteDinamicoAccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAccion"));
				this.jInternalFrameReporteDinamicoAccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAccion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAccion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPerfilAccion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.jScrollPanelDatosPerfilAccion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormAccion.jContentPaneDetalleAccion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.jScrollPanelDatosPerfilAccion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.jScrollPanelDatosPerfilAccion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.jScrollPanelDatosPerfilAccion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleAccion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAccion);
			
	       	this.jInternalFrameDetalleFormAccion.setVisible(false);
	        this.jInternalFrameDetalleFormAccion.setSelected(false);
			
			//this.jInternalFrameDetalleFormAccion.dispose();
			//this.jInternalFrameDetalleFormAccion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAccion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAccion.setVisible(true);
	        this.jInternalFrameReporteDinamicoAccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAccion.setVisible(true);
	        this.jInternalFrameImportacionAccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAccion.setVisible(true);
	        this.jInternalFrameOrderByAccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAccion.setVisible(false);
	        this.jInternalFrameOrderByAccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAccion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAccion.setVisible(false);
	        this.jInternalFrameReporteDinamicoAccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAccion.setVisible(false);
	        this.jInternalFrameImportacionAccion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeOpcion(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeOpcion);
						OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.sTipoBusqueda="Opcion";
						}

						opcionBeanSwingJInternalFrame.getTodosOpcionArbol();
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setOpcions(opcionBeanSwingJInternalFrame.opcionsArbol);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.CargarTreeOpcion();
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setVisible(true);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.jInternalFrameParent=this;
						TitledBorder titledBorderAccion=(TitledBorder)this.jScrollPanelDatosAccion.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

						titledBorderOpcion.setTitle(titledBorderAccion.getTitle() + " -> Opcion");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(opcionBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeOpcion(OpcionBeanSwingJInternalFrame jInternalFrameTreeOpcion) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeOpcion);
						jInternalFrameTreeOpcion.setVisible(false);
						jInternalFrameTreeOpcion.setSelected(false);
						//jInternalFrameTreeOpcion.dispose();
						//jInternalFrameTreeOpcion=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAccion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAccion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAccion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAccion(true);
			//this.isEsNuevoAccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAccion(false) ;
			
			if(accionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.getEsGuardarRelacionado() && PerfilAccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilAccionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(AccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAccion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAccionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAccion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAccion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAccion(true);
			//this.isEsNuevoAccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.accion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAccion(false) ;
			
			if(AccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAccion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaOpcion(List<Opcion> opcionsForeignKey)throws Exception{
		TableColumn tableColumnOpcion=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_IDOPCION));
		TableCellEditor tableCellEditorOpcion =tableColumnOpcion.getCellEditor();

		OpcionTableCell opcionTableCellFk=(OpcionTableCell)tableCellEditorOpcion;

		if(opcionTableCellFk!=null) {
			opcionTableCellFk.setopcionsForeignKey(opcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//opcionTableCellFk.setRowActual(intSelectedRow);
			//opcionTableCellFk.setopcionsForeignKeyActual(opcionsForeignKey);
		//}


		if(opcionTableCellFk!=null) {
			opcionTableCellFk.RecargarOpcionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarAccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAccion(false);
			
			//if(!this.isEsNuevoAccion) {								
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				
			}
			
			if(this.permiteMantenimiento(this.accion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.accionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAccion=true;
					this.inicializarActualizarBindingTablaAccion(false);
					this.isEsNuevoAccion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAccion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAccion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAccion(false);
				
				this.habilitarDeshabilitarControlesAccion(false);
			
												
				
				if(AccionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAccion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAccionActionPerformed(evt,accionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAccion(this.accion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAccion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,accionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.accion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAccion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				this.accion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				this.accion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.accion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.accionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AccionModel) this.jTableDatosAccion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAccion=true;
				this.inicializarActualizarBindingTablaAccion(false);
				this.isEsNuevoAccion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAccion(false);
				
				this.habilitarDeshabilitarControlesAccion(false);
				
				
				
				if(AccionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAccion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAccionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAccion.getRowCount()>=1) {
				jTableDatosAccion.removeRowSelectionInterval(0, jTableDatosAccion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAccion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAccion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAccion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAccion(false) ;
			
			this.isEsNuevoAccion=false;
			
			if(AccionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAccion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAccion(false);
				
				//SI ES MANUAL
				if(AccionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAccion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAccion--;			
			//Accion accionAux= new Accion();			
			//accionAux.setId(this.iIdNuevoAccion);
			
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAccion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
			
			this.accion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.accionLogic.getAccions().add(this.accionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.accions.add(this.accionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAccion(false);
			
			this.jTableDatosAccion.setRowSelectionInterval(this.getIndiceNuevoAccion(), this.getIndiceNuevoAccion());
			
			int iLastRow =  this.jTableDatosAccion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAccion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAccion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAccion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAccion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccion(false);
			
			//SI ES MANUAL
			if(AccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAccion();
			}
			
			//this.abrirFrameTreeAccion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AccionES ?", "MANTENIMIENTO DE Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAccion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAccion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.accionReturnGeneral=accionLogic.procesarImportacionAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.accionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAccionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAccion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAccion.setFileImportacion(this.jInternalFrameImportacionAccion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAccion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAccion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAccion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAccion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAccionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		

		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AccionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AccionBaseDesign.jrxml";
			
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
			
			this.generarReporteAccions("Todos",accionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AccionConstantesFunciones.LABEL_IDOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Opcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Opcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Opcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Opcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionConstantesFunciones.LABEL_SOLOFORM:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_loForm_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_loForm_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_loForm_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_loForm_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AccionConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAccion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAccion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AccionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoria="id_opcion";
					break;

				case AccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case AccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case AccionConstantesFunciones.LABEL_SOLOFORM:
					sNombreCampoCategoria="solo_form";
					break;

				case AccionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case AccionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case AccionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAccion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AccionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoriaValor="id_opcion";
					break;

				case AccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case AccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case AccionConstantesFunciones.LABEL_SOLOFORM:
					sNombreCampoCategoriaValor="solo_form";
					break;

				case AccionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case AccionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case AccionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAccion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAccion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AccionConstantesFunciones.LABEL_IDOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_opcion");
					break;

				case AccionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case AccionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case AccionConstantesFunciones.LABEL_SOLOFORM:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Solo Form",sNombreCampoCategoria,sNombreCampoCategoriaValor,"solo_form");
					break;

				case AccionConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case AccionConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case AccionConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
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
	
	public void jButtonGenerarExcelReporteDinamicoAccionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Accions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AccionConstantesFunciones.LABEL_IDOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionConstantesFunciones.LABEL_IDOPCION);
					iRow++;

					for(Accion accion:accionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accion.getopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Accion accion:accionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Accion accion:accionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionConstantesFunciones.LABEL_SOLOFORM:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionConstantesFunciones.LABEL_SOLOFORM);
					iRow++;

					for(Accion accion:accionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accion.getsolo_form());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Accion accion:accionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accion.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(Accion accion:accionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accion.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AccionConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AccionConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(Accion accion:accionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(accion.getestado());
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
			//	this.getFilaCabeceraExportarExcelAccion(row);				
			//	iRow++;
			//}				
			
			//for(Accion accionAux:accionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAccion(accionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
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
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccion(false);
			
			//SI ES MANUAL
			if(AccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAccion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccion(false);
			
			//SI ES MANUAL
			if(AccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAccion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAccion(false);
			
			//SI ES MANUAL
			if(AccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAccion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAccion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAccion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAccion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAccion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAccion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAccion.setMinimumSize(dimensionMinimum);
		this.jTableDatosAccion.setMaximumSize(dimensionMaximum);
		this.jTableDatosAccion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAccion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAccion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAccion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAccion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAccion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAccion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAccion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAccion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AccionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AccionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAccion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAccion();
		
		this.inicializarActualizarBindingBotonesManualAccion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAccion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAccion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAccion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAccion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAccion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAccion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAccion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAccion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAccion.jCheckBoxPostAccionNuevoAccion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAccion.jCheckBoxPostAccionSinCerrarAccion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAccion.jCheckBoxPostAccionSinMensajeAccion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAccion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAccion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAccion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAccion!=null) {
				this.jInternalFrameDetalleFormAccion.jCheckBoxPostAccionNuevoAccion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAccion.jCheckBoxPostAccionSinCerrarAccion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAccion.jCheckBoxPostAccionSinMensajeAccion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAccion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAccion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAccion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAccion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAccion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAccion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAccion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAccion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAccion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAccion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAccion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAccion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAccion(Boolean esInicializar) throws Exception {
		try	{	
			if(AccionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAccion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAccion() throws Exception {
		try	{
			if(AccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAccion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAccion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAccion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAccion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAccion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAccion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAccion.addItem(reporte);
			}
			
			
			if(!this.accionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAccion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAccion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAccion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAccion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAccion!=null) {
				this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAccion!=null) {
				this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAccion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAccion!=null) {
				
				if(this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAccion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAccion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAccion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAccion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAccion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_opcionFK_IdOpcionAccion.getSelectedItem()!=null){this.id_opcionFK_IdOpcion=((Opcion)this.jComboBoxid_opcionFK_IdOpcionAccion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAccion(Boolean esInicializar) throws Exception {				
		if(AccionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAccion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAccion() throws Exception {
		this.inicializarActualizarBindingTablaAccion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAccion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAccion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAccion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAccionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAccion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAccion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=accionLogic.getAccions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=accions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAccion.setModel(new AccionModel(this.accionLogic.getAccions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAccion.setModel(new AccionModel(this.accions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAccion!=null && this.jInternalFrameOrderByAccion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAccion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AccionConstantesFunciones.SCLASSWEBTITULO,accionConstantesFunciones.resaltarSeleccionarAccion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AccionConstantesFunciones.SCLASSWEBTITULO,accionConstantesFunciones.resaltarSeleccionarAccion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_ID));

		if(this.accionConstantesFunciones.mostraridAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.accionConstantesFunciones.resaltaridAccion,this.accionConstantesFunciones.activaridAccion,this,true,"idAccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionConstantesFunciones.resaltaridAccion,this.accionConstantesFunciones.activaridAccion,this,true,"idAccion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_IDOPCION));

		if(this.accionConstantesFunciones.mostrarid_opcionAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_IDOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OpcionTableCell(this.opcionsForeignKey,this.accionConstantesFunciones.resaltarid_opcionAccion,this,this.accionConstantesFunciones.activarid_opcionAccion));
			tableColumn.setCellEditor(new OpcionTableCell(this.opcionsForeignKey,this.accionConstantesFunciones.resaltarid_opcionAccion,this,this.accionConstantesFunciones.activarid_opcionAccion,true,"id_opcionAccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_CODIGO));

		if(this.accionConstantesFunciones.mostrarcodigoAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionConstantesFunciones.resaltarcodigoAccion,this.accionConstantesFunciones.activarcodigoAccion,this,true,"codigoAccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionConstantesFunciones.resaltarcodigoAccion,this.accionConstantesFunciones.activarcodigoAccion,this,true,"codigoAccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_NOMBRE));

		if(this.accionConstantesFunciones.mostrarnombreAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionConstantesFunciones.resaltarnombreAccion,this.accionConstantesFunciones.activarnombreAccion,this,true,"nombreAccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionConstantesFunciones.resaltarnombreAccion,this.accionConstantesFunciones.activarnombreAccion,this,true,"nombreAccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_SOLOFORM));

		if(this.accionConstantesFunciones.mostrarsolo_formAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_SOLOFORM,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.accionConstantesFunciones.resaltarsolo_formAccion,this.accionConstantesFunciones.activarsolo_formAccion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.accionConstantesFunciones.resaltarsolo_formAccion,this.accionConstantesFunciones.activarsolo_formAccion,this,true,"solo_formAccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.accionConstantesFunciones.mostrardescripcionAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.accionConstantesFunciones.resaltardescripcionAccion,this.accionConstantesFunciones.activardescripcionAccion,this,true,"descripcionAccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionConstantesFunciones.resaltardescripcionAccion,this.accionConstantesFunciones.activardescripcionAccion,this,true,"descripcionAccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_ORDEN));

		if(this.accionConstantesFunciones.mostrarordenAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.accionConstantesFunciones.resaltarordenAccion,this.accionConstantesFunciones.activarordenAccion,this,true,"ordenAccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.accionConstantesFunciones.resaltarordenAccion,this.accionConstantesFunciones.activarordenAccion,this,true,"ordenAccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAccion,AccionConstantesFunciones.LABEL_ESTADO));

		if(this.accionConstantesFunciones.mostrarestadoAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AccionConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.accionConstantesFunciones.resaltarestadoAccion,this.accionConstantesFunciones.activarestadoAccion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.accionConstantesFunciones.resaltarestadoAccion,this.accionConstantesFunciones.activarestadoAccion,this,true,"estadoAccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.accionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPerfilAccion && this.accionConstantesFunciones.mostrarPerfilAccionAccion && !AccionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Perfil Acciones");
				tableColumn.setHeaderValue("Perfil Acciones");
				tableColumn.setCellRenderer(new PerfilAccionTableCell(accionConstantesFunciones.resaltarPerfilAccionAccion,this,this.accionConstantesFunciones.activarPerfilAccionAccion));
				tableColumn.setCellEditor(new PerfilAccionTableCell(accionConstantesFunciones.resaltarPerfilAccionAccion,this,this.accionConstantesFunciones.activarPerfilAccionAccion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosAccion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.accionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.accionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAccion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.accionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.accionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAccion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAccion && this.isPermisoGuardarCambiosAccion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.accionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.accionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAccion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.accionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosAccion.addColumn(tableColumn);
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
			
			this.jTableDatosAccion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAccion && this.isPermisoGuardarCambiosAccion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.accionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAccion && this.isPermisoGuardarCambiosAccion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAccion.moveColumn(this.jTableDatosAccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAccion.moveColumn(this.jTableDatosAccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.accionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosAccion.moveColumn(this.jTableDatosAccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAccion.moveColumn(this.jTableDatosAccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAccion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAccion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAccion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAccion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAccion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAccion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAccion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAccion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=accionLogic.getAccions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=accions.size()-1;
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
		//this.jTableDatosAccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAccion();
			
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
				
				//this.isEsNuevoAccion=false;
					
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
				if(this.accionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAccion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAccion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.accion.getsType().equals("DUPLICADO")
				   || this.accion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAccion=true;
				
				} else {
					this.isEsNuevoAccion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.accionSessionBean.getEsGuardarRelacionado()) {
					if(this.accion.getId()>=0 && !this.accion.getIsNew()) {						
						this.isEsNuevoAccion=false;
						
					} else {
						this.isEsNuevoAccion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAccion(esRelaciones);						
				
				this.seleccionarAccion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.accion.getId()<0) {
					this.isEsNuevoAccion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAccion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAccion(evt,rowIndex);
				}	
				
				if(this.accionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Accion: " + this.dDif); 
					}
				}								
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAccion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.accion)) {
					if(this.accion.getId()>0) {
						this.accion.setIsDeleted(true);
						
						this.accionsEliminados.add(this.accion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.accionLogic.getAccions().remove(this.accion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.accions.remove(this.accion);				
					}
					
					
					((AccionModel) this.jTableDatosAccion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAccion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAccion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAccion) {
			
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAccion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAccion(this.accion);
				}
				
				//ARCHITECTURE
				try {
					

					//Opcion
					if(!this.accionConstantesFunciones.cargarid_opcionAccion || this.accionConstantesFunciones.event_dependid_opcionAccion) {
						//this.cargarCombosOpcionsForeignKeyLista(" where id="+this.accion.getid_opcion());
									//this.inicializarActualizarBindingAccion(false,false);
						this.opcionsForeignKey=new ArrayList<Opcion>();

						if(accion.getOpcion()!=null) {
							this.opcionsForeignKey.add(accion.getOpcion());
						}

						this.addItemDefectoCombosForeignKeyOpcion();
						this.cargarCombosFrameOpcionsForeignKey("Todos");
					}
					this.setActualOpcionForeignKey(this.accion.getid_opcion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAccion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAccion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAccion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAccion(Accion accion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAccion(accion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAccion(Accion accion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAccion(accion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAccion(accion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAccion(accion);
	}
	
	public void setVariablesObjetoActualToFormularioAccion(Accion accion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAccion.jLabelidAccion.setText(accion.getId().toString());
			this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.setText(accion.getcodigo());
			this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.setText(accion.getnombre());
			this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setSelected(accion.getsolo_form());
			this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.setText(accion.getdescripcion());
			this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.setText(accion.getorden().toString());
			this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setSelected(accion.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Accion accionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,accionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Accion accionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				accionLocal=this.accion;
			} else {
				accionLocal=this.accionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(accionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAccion(accionLocal,true);
					
					if(accionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(accionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.accionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(accionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAccion(Accion accion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAccion(accion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAccion(accion);
	}
	
	public void setVariablesFormularioToObjetoActualAccion(Accion accion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAccion(accion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAccion(Accion accion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAccion.jLabelidAccion.getText()==null || this.jInternalFrameDetalleFormAccion.jLabelidAccion.getText()=="" || this.jInternalFrameDetalleFormAccion.jLabelidAccion.getText()=="Id") {
				this.jInternalFrameDetalleFormAccion.jLabelidAccion.setText("0");
			}

			if(conColumnasBase) {accion.setId(Long.parseLong(this.jInternalFrameDetalleFormAccion.jLabelidAccion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelIdAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accion.setcodigo(this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelcodigoAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accion.setnombre(this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelnombreAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accion.setsolo_form(this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionConstantesFunciones.LABEL_SOLOFORM+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelsolo_formAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accion.setdescripcion(this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabeldescripcionAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accion.setorden(Integer.parseInt(this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelordenAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			accion.setestado(this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AccionConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAccion.jLabelestadoAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAccion(Accion accionBean,Accion accion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && accionBean.getid_opcion()!=null && !accionBean.getid_opcion().equals(-1L))) {accion.setid_opcion(accionBean.getid_opcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAccion(Accion accionOrigen,Accion accion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && accionOrigen.getId()!=null && !accionOrigen.getId().equals(0L))) {accion.setId(accionOrigen.getId());}}
			if(conDefault || (!conDefault && accionOrigen.getid_opcion()!=null && !accionOrigen.getid_opcion().equals(-1L))) {accion.setid_opcion(accionOrigen.getid_opcion());}
			if(conDefault || (!conDefault && accionOrigen.getcodigo()!=null && !accionOrigen.getcodigo().equals(""))) {accion.setcodigo(accionOrigen.getcodigo());}
			if(conDefault || (!conDefault && accionOrigen.getnombre()!=null && !accionOrigen.getnombre().equals(""))) {accion.setnombre(accionOrigen.getnombre());}
			if(conDefault || (!conDefault && accionOrigen.getsolo_form()!=null && !accionOrigen.getsolo_form().equals(false))) {accion.setsolo_form(accionOrigen.getsolo_form());}
			if(conDefault || (!conDefault && accionOrigen.getdescripcion()!=null && !accionOrigen.getdescripcion().equals(""))) {accion.setdescripcion(accionOrigen.getdescripcion());}
			if(conDefault || (!conDefault && accionOrigen.getorden()!=null && !accionOrigen.getorden().equals(0))) {accion.setorden(accionOrigen.getorden());}
			if(conDefault || (!conDefault && accionOrigen.getestado()!=null && !accionOrigen.getestado().equals(false))) {accion.setestado(accionOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAccion(Accion accion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAccion.jLabelidAccion.setText(accion.getId().toString());
			this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.setText(accion.getcodigo());
			this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.setText(accion.getnombre());
			this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setSelected(accion.getsolo_form());
			this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.setText(accion.getdescripcion());
			this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.setText(accion.getorden().toString());
			this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setSelected(accion.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAccion(AccionBean accionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAccion.jLabelidAccion.setText(accionBean.getId().toString());
			this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.setText(accionBean.getcodigo());
			this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.setText(accionBean.getnombre());
			this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setSelected(accionBean.getsolo_form());
			this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.setText(accionBean.getdescripcion());
			this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.setText(accionBean.getorden().toString());
			this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setSelected(accionBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAccion(AccionParameterReturnGeneral accionReturnGeneral,AccionBean accionBean,Boolean conDefault) throws Exception { 
		try {
			Accion accionLocal=new Accion();
			
			accionLocal=accionReturnGeneral.getAccion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && accionLocal.getId()!=null && !accionLocal.getId().equals(0L))) {accionBean.setId(accionLocal.getId());}}
			if(conDefault || (!conDefault && accionLocal.getid_opcion()!=null && !accionLocal.getid_opcion().equals(-1L))) {accionBean.setid_opcion(accionLocal.getid_opcion());}
			if(conDefault || (!conDefault && accionLocal.getcodigo()!=null && !accionLocal.getcodigo().equals(""))) {accionBean.setcodigo(accionLocal.getcodigo());}
			if(conDefault || (!conDefault && accionLocal.getnombre()!=null && !accionLocal.getnombre().equals(""))) {accionBean.setnombre(accionLocal.getnombre());}
			if(conDefault || (!conDefault && accionLocal.getsolo_form()!=null && !accionLocal.getsolo_form().equals(false))) {accionBean.setsolo_form(accionLocal.getsolo_form());}
			if(conDefault || (!conDefault && accionLocal.getdescripcion()!=null && !accionLocal.getdescripcion().equals(""))) {accionBean.setdescripcion(accionLocal.getdescripcion());}
			if(conDefault || (!conDefault && accionLocal.getorden()!=null && !accionLocal.getorden().equals(0))) {accionBean.setorden(accionLocal.getorden());}
			if(conDefault || (!conDefault && accionLocal.getestado()!=null && !accionLocal.getestado().equals(false))) {accionBean.setestado(accionLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAccionGenerico(Long idAccionSeleccionado,JComboBox jComboBoxAccion,List<Accion> accionsLocal)throws Exception {
		try {
			Accion  accionTemp=null;

			for(Accion accionAux:accionsLocal) {
				if(accionAux.getId()!=null && accionAux.getId().equals(idAccionSeleccionado)) {
					accionTemp=accionAux;
					break;
				}
			}

			jComboBoxAccion.setSelectedItem(accionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAccionGenerico(JComboBox jComboBoxAccion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAccion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAccion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PerfilAccion")) {
			jButtonPerfilAccionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			accion=(Accion) accionLogic.getAccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			accion =(Accion) accions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Opcion")) {
			//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
			if(!accion.getIsNew() && !accion.getIsChanged() && !accion.getIsDeleted()) {
				sDescripcion=accion.getopcion_descripcion();
			} else {
				//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
				sDescripcion=accion.getopcion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Accion accionRow=new Accion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			accionRow=(Accion) accionLogic.getAccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			accionRow=(Accion) accions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPerfilAccionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Accion accion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormAccion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion = (Accion)this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.accion = (Accion)this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(accion!=null) {
						this.accion = accion;
					} else {
						this.accion = new Accion();
					}
				}

				if(this.isTienePermisosPerfilAccion && this.permiteMantenimiento(this.accion)) {
					PerfilAccionBeanSwingJInternalFrame perfilaccionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFramePopup=new PerfilAccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						perfilaccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFramePopup;
					} else {
						perfilaccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame;
					}

					List<Accion> accions=new ArrayList<Accion>();
					accions.add(this.accion);
					if(!esRelacionado) {
						//perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.setConGuardarRelaciones(false);
						//perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilaccionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormAccion.cargarPerfilAccionBeanSwingJInternalFrame(accions,this.accion,perfilaccionBeanSwingJInternalFrame,/*conInicializar,*/perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.getConGuardarRelaciones(),perfilaccionBeanSwingJInternalFrame.perfilaccionSessionBean.getEsGuardarRelacionado());
					perfilaccionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilaccionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilAccion("no_relacionado");

						perfilaccionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PerfilAccionConstantesFunciones.ITAMANIOFILATABLA + (PerfilAccionConstantesFunciones.ITAMANIOFILATABLA/2));

						perfilaccionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderAccion=(TitledBorder)this.jScrollPanelDatosAccion.getBorder();
						TitledBorder titledBorderPerfilAccion=(TitledBorder)perfilaccionBeanSwingJInternalFrame.jScrollPanelDatosPerfilAccion.getBorder();

						titledBorderPerfilAccion.setTitle(titledBorderAccion.getTitle() + " -> Perfil Accion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilaccionBeanSwingJInternalFrame);
						}

						perfilaccionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(perfilaccionBeanSwingJInternalFrame);

						perfilaccionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.accionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil Accion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAccion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAccion.setVisible((this.isVisibilidadCeldaNuevoAccion && this.isPermisoNuevoAccion));			
			this.jButtonDuplicarAccion.setVisible((this.isVisibilidadCeldaDuplicarAccion && this.isPermisoDuplicarAccion));			
			this.jButtonCopiarAccion.setVisible((this.isVisibilidadCeldaCopiarAccion && this.isPermisoCopiarAccion));
			this.jButtonVerFormAccion.setVisible((this.isVisibilidadCeldaVerFormAccion && this.isPermisoVerFormAccion));
			
			this.jButtonAbrirOrderByAccion.setVisible((this.isVisibilidadCeldaOrdenAccion && this.isPermisoOrdenAccion));			
			
			this.jButtonNuevoRelacionesAccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesAccion && this.isPermisoNuevoAccion));			
			this.jButtonNuevoGuardarCambiosAccion.setVisible((this.isVisibilidadCeldaNuevoAccion && this.isPermisoNuevoAccion && this.isPermisoGuardarCambiosAccion));
			
			if(this.jInternalFrameDetalleFormAccion!=null) {
			this.jInternalFrameDetalleFormAccion.jButtonModificarAccion.setVisible((this.isVisibilidadCeldaModificarAccion && this.isPermisoActualizarAccion));	
			this.jInternalFrameDetalleFormAccion.jButtonActualizarAccion.setVisible((this.isVisibilidadCeldaActualizarAccion && this.isPermisoActualizarAccion));	
			this.jInternalFrameDetalleFormAccion.jButtonEliminarAccion.setVisible((this.isVisibilidadCeldaEliminarAccion && this.isPermisoEliminarAccion));
			this.jInternalFrameDetalleFormAccion.jButtonCancelarAccion.setVisible(this.isVisibilidadCeldaCancelarAccion);							
			this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.setVisible((this.isVisibilidadCeldaGuardarAccion && this.isPermisoGuardarCambiosAccion));			
			
			}
						
			this.jButtonGuardarCambiosTablaAccion.setVisible((this.isVisibilidadCeldaGuardarCambiosAccion && this.isPermisoGuardarCambiosAccion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAccion.setVisible((this.isVisibilidadCeldaNuevoAccion && this.isPermisoNuevoAccion));						
			this.jButtonDuplicarToolBarAccion.setVisible((this.isVisibilidadCeldaDuplicarAccion && this.isPermisoDuplicarAccion));						
			this.jButtonCopiarToolBarAccion.setVisible((this.isVisibilidadCeldaCopiarAccion && this.isPermisoCopiarAccion));			
			this.jButtonVerFormToolBarAccion.setVisible((this.isVisibilidadCeldaVerFormAccion && this.isPermisoVerFormAccion));			
			this.jButtonAbrirOrderByToolBarAccion.setVisible((this.isVisibilidadCeldaOrdenAccion && this.isPermisoOrdenAccion));
			this.jButtonNuevoRelacionesToolBarAccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesAccion && this.isPermisoNuevoAccion));			
			this.jButtonNuevoGuardarCambiosToolBarAccion.setVisible((this.isVisibilidadCeldaNuevoAccion && this.isPermisoNuevoAccion && this.isPermisoGuardarCambiosAccion));			
			
			if(this.jInternalFrameDetalleFormAccion!=null) {
			this.jInternalFrameDetalleFormAccion.jButtonModificarToolBarAccion.setVisible((this.isVisibilidadCeldaModificarAccion && this.isPermisoActualizarAccion));	
			this.jInternalFrameDetalleFormAccion.jButtonActualizarToolBarAccion.setVisible((this.isVisibilidadCeldaActualizarAccion  && this.isPermisoActualizarAccion));	
			this.jInternalFrameDetalleFormAccion.jButtonEliminarToolBarAccion.setVisible((this.isVisibilidadCeldaEliminarAccion && this.isPermisoEliminarAccion));
			this.jInternalFrameDetalleFormAccion.jButtonCancelarToolBarAccion.setVisible(this.isVisibilidadCeldaCancelarAccion);				
			this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosToolBarAccion.setVisible((this.isVisibilidadCeldaGuardarAccion && this.isPermisoGuardarCambiosAccion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAccion.setVisible((this.isVisibilidadCeldaGuardarCambiosAccion && this.isPermisoGuardarCambiosAccion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAccion.setVisible((this.isVisibilidadCeldaNuevoAccion && this.isPermisoNuevoAccion));			
			this.jMenuItemDuplicarAccion.setVisible((this.isVisibilidadCeldaDuplicarAccion && this.isPermisoDuplicarAccion));			
			this.jMenuItemCopiarAccion.setVisible((this.isVisibilidadCeldaCopiarAccion && this.isPermisoCopiarAccion));			
			this.jMenuItemVerFormAccion.setVisible((this.isVisibilidadCeldaVerFormAccion && this.isPermisoVerFormAccion));			
			this.jMenuItemAbrirOrderByAccion.setVisible((this.isVisibilidadCeldaOrdenAccion && this.isPermisoOrdenAccion));			
			//this.jMenuItemMostrarOcultarAccion.setVisible((this.isVisibilidadCeldaOrdenAccion && this.isPermisoOrdenAccion));
			this.jMenuItemDetalleAbrirOrderByAccion.setVisible((this.isVisibilidadCeldaOrdenAccion && this.isPermisoOrdenAccion));			
			//this.jMenuItemDetalleMostrarOcultarAccion.setVisible((this.isVisibilidadCeldaOrdenAccion && this.isPermisoOrdenAccion));			
			this.jMenuItemNuevoRelacionesAccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesAccion && this.isPermisoNuevoAccion));			
			this.jMenuItemNuevoGuardarCambiosAccion.setVisible((this.isVisibilidadCeldaNuevoAccion && this.isPermisoNuevoAccion && this.isPermisoGuardarCambiosAccion));									
			
			if(this.jInternalFrameDetalleFormAccion!=null) {
			this.jInternalFrameDetalleFormAccion.jMenuItemModificarAccion.setVisible((this.isVisibilidadCeldaModificarAccion && this.isPermisoActualizarAccion));	
			this.jInternalFrameDetalleFormAccion.jMenuItemActualizarAccion.setVisible((this.isVisibilidadCeldaActualizarAccion && this.isPermisoActualizarAccion));	
			this.jInternalFrameDetalleFormAccion.jMenuItemEliminarAccion.setVisible((this.isVisibilidadCeldaEliminarAccion && this.isPermisoEliminarAccion));
			this.jInternalFrameDetalleFormAccion.jMenuItemCancelarAccion.setVisible(this.isVisibilidadCeldaCancelarAccion);				
			}
			
			this.jMenuItemGuardarCambiosAccion.setVisible((this.isVisibilidadCeldaGuardarAccion && this.isPermisoGuardarCambiosAccion));						
			this.jMenuItemGuardarCambiosTablaAccion.setVisible((this.isVisibilidadCeldaGuardarCambiosAccion && this.isPermisoGuardarCambiosAccion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAccion=this.jButtonNuevoAccion.isVisible();
			this.isVisibilidadCeldaDuplicarAccion=this.jButtonDuplicarAccion.isVisible();
			this.isVisibilidadCeldaCopiarAccion=this.jButtonCopiarAccion.isVisible();
			this.isVisibilidadCeldaVerFormAccion=this.jButtonVerFormAccion.isVisible();
			
			this.isVisibilidadCeldaOrdenAccion=this.jButtonAbrirOrderByAccion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAccion=this.jButtonNuevoRelacionesAccion.isVisible();
			this.isVisibilidadCeldaModificarAccion=this.jButtonModificarAccion.isVisible();
			
			if(this.jInternalFrameDetalleFormAccion!=null) {
			this.isVisibilidadCeldaActualizarAccion=this.jInternalFrameDetalleFormAccion.jButtonActualizarAccion.isVisible();
			this.isVisibilidadCeldaEliminarAccion=this.jInternalFrameDetalleFormAccion.jButtonEliminarAccion.isVisible();
			this.isVisibilidadCeldaCancelarAccion=this.jInternalFrameDetalleFormAccion.jButtonCancelarAccion.isVisible();
			this.isVisibilidadCeldaGuardarAccion=this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAccion=this.jButtonGuardarCambiosTablaAccion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAccion=this.jButtonNuevoToolBarAccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAccion=this.jButtonNuevoRelacionesToolBarAccion.isVisible();
			
			if(this.jInternalFrameDetalleFormAccion!=null) {
			this.isVisibilidadCeldaModificarAccion=this.jInternalFrameDetalleFormAccion.jButtonModificarToolBarAccion.isVisible();
			this.isVisibilidadCeldaActualizarAccion=this.jInternalFrameDetalleFormAccion.jButtonActualizarToolBarAccion.isVisible();
			this.isVisibilidadCeldaEliminarAccion=this.jInternalFrameDetalleFormAccion.jButtonEliminarToolBarAccion.isVisible();
			this.isVisibilidadCeldaCancelarAccion=this.jInternalFrameDetalleFormAccion.jButtonCancelarToolBarAccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAccion=this.jButtonGuardarCambiosToolBarAccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAccion=this.jButtonGuardarCambiosTablaToolBarAccion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAccion=this.jMenuItemNuevoAccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAccion=this.jMenuItemNuevoRelacionesAccion.isVisible();
			
			if(this.jInternalFrameDetalleFormAccion!=null) {
			this.isVisibilidadCeldaModificarAccion=this.jInternalFrameDetalleFormAccion.jMenuItemModificarAccion.isVisible();
			this.isVisibilidadCeldaActualizarAccion=this.jInternalFrameDetalleFormAccion.jMenuItemActualizarAccion.isVisible();
			this.isVisibilidadCeldaEliminarAccion=this.jInternalFrameDetalleFormAccion.jMenuItemEliminarAccion.isVisible();
			this.isVisibilidadCeldaCancelarAccion=this.jInternalFrameDetalleFormAccion.jMenuItemCancelarAccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAccion=this.jMenuItemGuardarCambiosAccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAccion=this.jMenuItemGuardarCambiosTablaAccion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAccion(Boolean esInicializar) {
		if(AccionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.accionSessionBean.getConGuardarRelaciones()) {
				//if(this.accionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAccion();
			}
			
			this.inicializarActualizarBindingBotonesManualAccion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAccion() {
		this.jButtonNuevoAccion.setVisible(this.isPermisoNuevoAccion);			
		this.jButtonDuplicarAccion.setVisible(this.isPermisoDuplicarAccion);			
		this.jButtonCopiarAccion.setVisible(this.isPermisoCopiarAccion);			
		this.jButtonVerFormAccion.setVisible(this.isPermisoVerFormAccion);			
		
		this.jButtonAbrirOrderByAccion.setVisible(this.isPermisoOrdenAccion);					
		
		this.jButtonNuevoRelacionesAccion.setVisible(this.isPermisoNuevoAccion);			
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonModificarAccion.setVisible(this.isPermisoActualizarAccion);	
			this.jInternalFrameDetalleFormAccion.jButtonActualizarAccion.setVisible(this.isPermisoActualizarAccion);	
			this.jInternalFrameDetalleFormAccion.jButtonEliminarAccion.setVisible(this.isPermisoEliminarAccion);
			this.jInternalFrameDetalleFormAccion.jButtonCancelarAccion.setVisible(this.isVisibilidadCeldaCancelarAccion);						
			this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.setVisible(this.isPermisoGuardarCambiosAccion);							
		}
		
		this.jButtonGuardarCambiosTablaAccion.setVisible(this.isPermisoActualizarAccion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAccion() {
		this.jInternalFrameDetalleFormAccion.jButtonModificarAccion.setVisible(this.isPermisoActualizarAccion);	
		this.jInternalFrameDetalleFormAccion.jButtonActualizarAccion.setVisible(this.isPermisoActualizarAccion);	
		this.jInternalFrameDetalleFormAccion.jButtonEliminarAccion.setVisible(this.isPermisoEliminarAccion);
		this.jInternalFrameDetalleFormAccion.jButtonCancelarAccion.setVisible(this.isVisibilidadCeldaCancelarAccion);							
		this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.setVisible((this.isVisibilidadCeldaGuardarAccion && this.isPermisoGuardarCambiosAccion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAccion() {
		if(AccionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAccion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAccion() {
	}
	
	public void jTableDatosAccionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAccion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.accion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_opcionAccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoopcion=true;

			idTienePermisoopcion=this.tienePermisosUsuarioEnPaginaWebAccion(OpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.accionLogic.getConnexion());

				if(this.accion.getid_opcion()!=null) {
					this.opcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.opcionBeanSwingJInternalFrame.setIdActual(this.accion.getid_opcion());
					this.opcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion();
				}

				JInternalFrameBase jinternalFrame =this.opcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAccion=(TitledBorder)this.jScrollPanelDatosAccion.getBorder();
				TitledBorder titledBorderopcion=(TitledBorder)this.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

				titledBorderopcion.setTitle(titledBorderAccion.getTitle() + " -> Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_opcionAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getid_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_opcion = "+this.accion.getid_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.accion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.accion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsolo_formAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getsolo_form()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where solo_form = "+this.accion.getsolo_form().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.accion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.accion.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAccion(this.getaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.accion==null) {
						this.accion = new Accion();
					}

					this.setVariablesFormularioToObjetoActualAccion(this.accion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);
				}

				if(this.accion.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.accion.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdOpcionAccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAccion(false,false);

			this.getAccionsFK_IdOpcion();

			this.inicializarActualizarBindingAccion(false);

			//if(AccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.accionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAccion() {
		if(this.jInternalFrameDetalleFormAccion!=null) {
		

		if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
			this.jInternalFrameDetalleFormAccion.setVisible(false);	    			
			this.jInternalFrameDetalleFormAccion.dispose();
			this.jInternalFrameDetalleFormAccion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAccion!=null) {
			this.jInternalFrameReporteDinamicoAccion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAccion.dispose();
			this.jInternalFrameReporteDinamicoAccion=null;
		}
		
		if(this.jInternalFrameImportacionAccion!=null) {
			this.jInternalFrameImportacionAccion.setVisible(false);	    			
			this.jInternalFrameImportacionAccion.dispose();
			this.jInternalFrameImportacionAccion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAccion();
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
			
			if(sTipo.equals("NuevoAccion")) {
				jButtonNuevoAccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAccion")) {
				jButtonDuplicarAccionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAccion")) {
				jButtonCopiarAccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormAccion")) {
				jButtonVerFormAccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAccion")) {
				jButtonNuevoAccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAccion")) {
				jButtonDuplicarAccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAccion")) {
				jButtonNuevoAccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAccion")) {
				jButtonDuplicarAccionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAccion")) {
				jButtonNuevoAccionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAccion")) {
				jButtonNuevoAccionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAccion")) {
				jButtonNuevoAccionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAccion")) {
				jButtonModificarAccionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAccion")) {
				jButtonModificarAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAccion")) {
				jButtonModificarAccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAccion")) {
				jButtonActualizarAccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAccion")) {
				jButtonActualizarAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAccion")) {
				jButtonActualizarAccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarAccion")) {
				jButtonEliminarAccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAccion")) {
				jButtonEliminarAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAccion")) {
				jButtonEliminarAccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarAccion")) {
				jButtonCancelarAccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAccion")) {
				jButtonCancelarAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAccion")) {
				jButtonCancelarAccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarAccion")) {
				jButtonCerrarAccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAccion")) {
				jButtonCerrarAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAccion")) {
				jButtonCerrarAccionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAccion")) {
				jButtonMostrarOcultarAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAccion")) {
				jButtonCancelarAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAccion")) {
				jButtonCopiarAccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAccion")) {
				jButtonVerFormAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAccion")) {
				jButtonCopiarAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAccion")) {
				jButtonVerFormAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAccion")) {
				jButtonRecargarInformacionAccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAccion")) {
				jButtonRecargarInformacionAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAccion")) {
				jButtonRecargarInformacionAccionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAccion")) {
				jButtonAnterioresAccionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAccion")) {
				jButtonAnterioresAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAccion")) {
				jButtonAnterioresAccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAccion")) {
				jButtonSiguientesAccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAccion")) {
				jButtonSiguientesAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAccion")) {
				jButtonSiguientesAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAccion") || sTipo.equals("MenuItemDetalleAbrirOrderByAccion")) {
				jButtonAbrirOrderByAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAccion") || sTipo.equals("MenuItemDetalleMostrarOcultarAccion")) {
				jButtonMostrarOcultarAccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAccion")) {
				jButtonNuevoGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAccion")) {
				jButtonNuevoGuardarCambiosAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAccion")) {
				jButtonNuevoGuardarCambiosAccionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAccion")) {
				jButtonCerrarReporteDinamicoAccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAccion")) {
				jButtonGenerarReporteDinamicoAccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAccion")) {
				
				jButtonGenerarExcelReporteDinamicoAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAccion")) {
				jButtonCerrarImportacionAccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAccion")) {
				
				jButtonGenerarImportacionAccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAccion")) {
				
				jButtonAbrirImportacionAccionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAccion")) {
				jComboBoxTiposAccionesAccionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAccion")) {
				jComboBoxTiposRelacionesAccionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAccion")) {
				jComboBoxTiposAccionesAccionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAccion")) {
				
				jComboBoxTiposSeleccionarAccionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAccion")) {
				jTextFieldValorCampoGeneralAccionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAccion")) {
				jButtonAbrirOrderByAccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAccion")) {
				jButtonAbrirOrderByAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAccion")) {
				jButtonCerrarOrderByAccionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAccionBusqueda")) {
				this.jButtonidAccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionAccionUpdate")) {
				this.jButtonid_opcionAccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionAccionBusqueda")) {
				this.jButtonid_opcionAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAccionBusqueda")) {
				this.jButtoncodigoAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAccionBusqueda")) {
				this.jButtonnombreAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("solo_formAccionBusqueda")) {
				this.jButtonsolo_formAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAccionBusqueda")) {
				this.jButtondescripcionAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenAccionBusqueda")) {
				this.jButtonordenAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoAccionBusqueda")) {
				this.jButtonestadoAccionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdOpcionAccion")) {
				this.jButtonFK_IdOpcionAccionActionPerformed(evt);
			}
			
			;
			
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAccion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Accion accionLocal=null;
			
			if(!this.getEsControlTabla()) {
				accionLocal=this.accion;
			} else {
				accionLocal=this.accionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
							
				
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionAnterior =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionAnterior =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
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
			
			


			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
								
						
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
								
				
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionAnterior =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionAnterior =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionAnterior =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionAnterior =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
							
				
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionAnterior =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.accionAnterior =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
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
			
			


			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
								
				
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionAnterior =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionAnterior =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAccion")) {
					jCheckBoxSeleccionarTodosAccionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAccion")) {
					jCheckBoxSeleccionadosAccionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAccion")) {
					
				}
				
				


				
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
												
				
				


				
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.accionAnterior =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.accionAnterior =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
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
			
			


			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.accion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.accion);
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
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
				
				


				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Accion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Accion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.accionAnterior =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.accionAnterior =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAccion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAccion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.accion =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.accion =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.accion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAccion")) {
				
				}
				
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAccion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAccion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAccion")) {
			
			}
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAccion();
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
			if(sTipo.equals("NuevoAccion")) {
				jButtonNuevoAccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAccion")) {
				jButtonDuplicarAccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAccion")) {
				jButtonCopiarAccionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAccion")) {
				jButtonVerFormAccionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAccion")) {
				jButtonNuevoAccionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAccion")) {
				jButtonModificarAccionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAccion")) {
				jButtonActualizarAccionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAccion")) {
				jButtonEliminarAccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAccion")) {
				jButtonCancelarAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAccion")) {
				jButtonCerrarAccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAccion")) {
				jButtonGuardarCambiosAccionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAccion")) {
				jButtonNuevoGuardarCambiosAccionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAccion")) {
				jButtonAbrirOrderByAccionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAccion")) {
				jButtonRecargarInformacionAccionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAccion")) {
				jButtonAnterioresAccionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAccion")) {
				jButtonSiguientesAccionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAccionBusqueda")) {
				this.jButtonidAccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionAccionUpdate")) {
				this.jButtonid_opcionAccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionAccionBusqueda")) {
				this.jButtonid_opcionAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAccionBusqueda")) {
				this.jButtoncodigoAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAccionBusqueda")) {
				this.jButtonnombreAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("solo_formAccionBusqueda")) {
				this.jButtonsolo_formAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAccionBusqueda")) {
				this.jButtondescripcionAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenAccionBusqueda")) {
				this.jButtonordenAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoAccionBusqueda")) {
				this.jButtonestadoAccionBusquedaActionPerformed(evt);
			}
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAccion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAccion")) {
				closingInternalFrameAccion();
				
			} else if(sTipo.equals("jButtonCancelarAccion")) {
				JInternalFrameBase jInternalFrameDetalleFormAccion = (JInternalFrameBase)evt.getSource();
	            	
	            AccionBeanSwingJInternalFrame jInternalFrameParent=(AccionBeanSwingJInternalFrame)jInternalFrameDetalleFormAccion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAccionActionPerformed(null);
			}
			
			AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.accion,new Object(),this.accionParameterGeneral,this.accionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.accion)) {
			if(!esControlTabla) {
				if(AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAccion(this.accion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);			
				}
				
				if(this.accionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAccion(this.accion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.accionReturnGeneral=accionLogic.procesarEventosAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accionLogic.getAccions(),this.accion,this.accionParameterGeneral,this.isEsNuevoAccion,classes);//this.accionLogic.getAccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAccion(this.accionReturnGeneral,this.accionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.accionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAccion(classes,this.accionReturnGeneral,this.accionBean,false);
					}
						
					if(this.accionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAccion(this.accionReturnGeneral.getAccion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAccion(this.accionReturnGeneral.getAccion());	
					}
						
					if(this.accionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAccion(this.accionReturnGeneral.getAccion(),classes);//this.accionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAccion(this.accion,classes);//this.accionBean);									
				}
			
				if(AccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAccion(this.accion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAccion(this.accion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.accionAnterior!=null) {
						this.accion=this.accionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.accionReturnGeneral=accionLogic.procesarEventosAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accionLogic.getAccions(),this.accion,this.accionParameterGeneral,this.isEsNuevoAccion,classes);//this.accionLogic.getAccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.accionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.accionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.accionReturnGeneral.getAccion(),accionLogic.getAccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.accionReturnGeneral.getAccion(),this.accions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAccion.repaint();
				
				//((AbstractTableModel) this.jTableDatosAccion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAccion();
			}
		}
	}
	
	public void actualizarVisualTableDatosAccion() throws Exception {
		
		AccionModel accionModel=(AccionModel)this.jTableDatosAccion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			accionModel.accions=this.accionLogic.getAccions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			accionModel.accions=this.accions;
		}
		
		
		((AccionModel) this.jTableDatosAccion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAccion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getaccionAnterior(),this.accionLogic.getAccions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getaccionAnterior(),this.accions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAccion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAccion(Accion accion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilAccion.class)) {
					this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.setPerfilAccions(accion.getPerfilAccions());
					this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilAccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
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
										
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accion,new Object(),generalEntityParameterGeneral,this.accionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.accionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AccionConstantesFunciones.getClassesRelationshipsOfAccion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AccionConstantesFunciones.getClassesRelationshipsFromStringsOfAccion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.accion,new Object(),generalEntityParameterGeneral,this.accionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAccion(AccionBean accionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilAccion.class)) {
					this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.setPerfilAccions(accion.getPerfilAccions());
					this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilAccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAccion(ArrayList<Classe> classes,AccionReturnGeneral accionReturnGeneral,AccionBean accionBean,Boolean conDefault) throws Exception {
		
			this.accionBean.setPerfilAccions(accionReturnGeneral.getAccion().getPerfilAccions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAccion(Accion accion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilAccion.class)) {
					accion.setPerfilAccions(this.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.perfilaccionLogic.getPerfilAccions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.accion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAccion = new AccionDetalleFormJInternalFrame(jDesktopPane,this.accionSessionBean.getConGuardarRelaciones(),this.accionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAccion);
		this.jInternalFrameDetalleFormAccion.setVisible(false);
		this.jInternalFrameDetalleFormAccion.setSelected(false);						
		
		this.jInternalFrameDetalleFormAccion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAccion.accionLogic=this.accionLogic;
		
		this.cargarCombosFrameForeignKeyAccion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAccion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAccion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAccion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAccion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAccion"));
		
		this.jInternalFrameDetalleFormAccion.jButtonModificarAccion.addActionListener(new ButtonActionListener(this,"ModificarAccion"));

		
		this.jInternalFrameDetalleFormAccion.jButtonModificarToolBarAccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarAccion"));
					
		this.jInternalFrameDetalleFormAccion.jMenuItemModificarAccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarAccion"));		
		
		
		
		this.jInternalFrameDetalleFormAccion.jButtonActualizarAccion.addActionListener (new ButtonActionListener(this,"ActualizarAccion"));
		
		
		this.jInternalFrameDetalleFormAccion.jButtonActualizarToolBarAccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAccion"));
						
		this.jInternalFrameDetalleFormAccion.jMenuItemActualizarAccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAccion"));		
		
		
		
		this.jInternalFrameDetalleFormAccion.jButtonEliminarAccion.addActionListener (new ButtonActionListener(this,"EliminarAccion"));
		
		
		this.jInternalFrameDetalleFormAccion.jButtonEliminarToolBarAccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarAccion"));
								
		this.jInternalFrameDetalleFormAccion.jMenuItemEliminarAccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAccion"));		
		
		
		
		this.jInternalFrameDetalleFormAccion.jButtonCancelarAccion.addActionListener (new ButtonActionListener(this,"CancelarAccion"));
		
		
		this.jInternalFrameDetalleFormAccion.jButtonCancelarToolBarAccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarAccion"));
					
		this.jInternalFrameDetalleFormAccion.jMenuItemCancelarAccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAccion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAccion.jMenuItemDetalleCerrarAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAccion"));		
		
		
		
		this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosToolBarAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAccion"));
		
		
		
		this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosToolBarAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAccion"));
		
		
		
		this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAccion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonidAccionBusqueda.addActionListener(new ButtonActionListener(this,"idAccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccion.jButtonid_opcionAccionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonid_opcionAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtoncodigoAccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonnombreAccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonsolo_formAccionBusqueda.addActionListener(new ButtonActionListener(this,"solo_formAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtondescripcionAccionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonordenAccionBusqueda.addActionListener(new ButtonActionListener(this,"ordenAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonestadoAccionBusqueda.addActionListener(new ButtonActionListener(this,"estadoAccionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAccion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAccion"));
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAccion"));
		}
		
		this.jTableDatosAccion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAccion"));
		
		this.jTableDatosAccion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAccion"));
		
		this.jButtonNuevoAccion.addActionListener(new ButtonActionListener(this,"NuevoAccion"));
		
		this.jButtonDuplicarAccion.addActionListener(new ButtonActionListener(this,"DuplicarAccion"));
		
		this.jButtonCopiarAccion.addActionListener(new ButtonActionListener(this,"CopiarAccion"));
		
		this.jButtonVerFormAccion.addActionListener(new ButtonActionListener(this,"VerFormAccion"));
		
		
		this.jButtonNuevoToolBarAccion.addActionListener(new ButtonActionListener(this,"NuevoToolBarAccion"));
			
		this.jButtonDuplicarToolBarAccion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAccion"));
			
		this.jMenuItemNuevoAccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAccion"));
			
		this.jMenuItemDuplicarAccion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAccion"));		
		
		
		this.jButtonNuevoRelacionesAccion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAccion"));
		
		
		this.jButtonNuevoRelacionesToolBarAccion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAccion"));
			
		this.jMenuItemNuevoRelacionesAccion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAccion"));		
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonModificarAccion.addActionListener(new ButtonActionListener(this,"ModificarAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonModificarToolBarAccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarAccion"));
			
			this.jInternalFrameDetalleFormAccion.jMenuItemModificarAccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAccion.jButtonActualizarAccion.addActionListener (new ButtonActionListener(this,"ActualizarAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonActualizarToolBarAccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAccion"));
				
			this.jInternalFrameDetalleFormAccion.jMenuItemActualizarAccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonEliminarAccion.addActionListener (new ButtonActionListener(this,"EliminarAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonEliminarToolBarAccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarAccion"));
						
			this.jInternalFrameDetalleFormAccion.jMenuItemEliminarAccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonCancelarAccion.addActionListener (new ButtonActionListener(this,"CancelarAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonCancelarToolBarAccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarAccion"));
			
			this.jInternalFrameDetalleFormAccion.jMenuItemCancelarAccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAccion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAccion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAccion"));		
		
		
		this.jButtonCerrarAccion.addActionListener (new ButtonActionListener(this,"CerrarAccion"));
		
		
		this.jButtonCerrarToolBarAccion.addActionListener (new ButtonActionListener(this,"CerrarToolBarAccion"));
			
		this.jMenuItemCerrarAccion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAccion"));
			
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jMenuItemDetalleCerrarAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosToolBarAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAccion"));
		}
		
		this.jButtonCopiarToolBarAccion.addActionListener (new ButtonActionListener(this,"CopiarToolBarAccion"));
			
		this.jButtonVerFormToolBarAccion.addActionListener (new ButtonActionListener(this,"VerFormToolBarAccion"));
		
		this.jMenuItemGuardarCambiosAccion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAccion"));
			
		this.jMenuItemCopiarAccion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAccion"));		
		
		this.jMenuItemVerFormAccion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAccion"));		
		
		
		this.jButtonGuardarCambiosTablaAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAccion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAccion"));
			
		this.jMenuItemGuardarCambiosTablaAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAccion"));		
		
		
		
		this.jButtonRecargarInformacionAccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionAccion"));
					
		this.jButtonRecargarInformacionToolBarAccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAccion"));
		
		this.jMenuItemRecargarInformacionAccion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAccion"));		
		
		
		
		this.jButtonAnterioresAccion.addActionListener (new ButtonActionListener(this,"AnterioresAccion"));
		
		
		this.jButtonAnterioresToolBarAccion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAccion"));
		
		this.jMenuItemAnterioresAccion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAccion"));		
		
		
		this.jButtonSiguientesAccion.addActionListener (new ButtonActionListener(this,"SiguientesAccion"));
		
		
		this.jButtonSiguientesToolBarAccion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAccion"));
			
		this.jMenuItemSiguientesAccion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAccion"));
			
		this.jMenuItemAbrirOrderByAccion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAccion"));
			
		this.jMenuItemMostrarOcultarAccion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAccion"));
			
		this.jMenuItemDetalleAbrirOrderByAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAccion"));
			
		this.jMenuItemDetalleMostarOcultarAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAccion"));		
		
		
		this.jButtonNuevoGuardarCambiosAccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAccion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAccion"));
			
		this.jMenuItemNuevoGuardarCambiosAccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAccion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAccion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAccion"));

		this.jCheckBoxSeleccionadosAccion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAccion"));
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAccion"));
		}
		
		
		this.jComboBoxTiposRelacionesAccion.addActionListener (new ButtonActionListener(this,"TiposRelacionesAccion"));
			
		this.jComboBoxTiposAccionesAccion.addActionListener (new ButtonActionListener(this,"TiposAccionesAccion"));
					
		this.jComboBoxTiposSeleccionarAccion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAccion"));
			
		this.jTextFieldValorCampoGeneralAccion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAccion"));		
		
		
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonidAccionBusqueda.addActionListener(new ButtonActionListener(this,"idAccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccion.jButtonid_opcionAccionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonid_opcionAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtoncodigoAccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonnombreAccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonsolo_formAccionBusqueda.addActionListener(new ButtonActionListener(this,"solo_formAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtondescripcionAccionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonordenAccionBusqueda.addActionListener(new ButtonActionListener(this,"ordenAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonestadoAccionBusqueda.addActionListener(new ButtonActionListener(this,"estadoAccionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdOpcionAccion.addActionListener(new ButtonActionListener(this,"FK_IdOpcionAccion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAccion!=null) {
				this.jInternalFrameReporteDinamicoAccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAccion"));
				this.jInternalFrameReporteDinamicoAccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAccion"));
				this.jInternalFrameReporteDinamicoAccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAccion"));
			}
			
			//this.jButtonCerrarReporteDinamicoAccion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAccion"));				
			//this.jButtonGenerarReporteDinamicoAccion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAccion"));
			//this.jButtonGenerarExcelReporteDinamicoAccion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAccion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAccion!=null) {
				this.jInternalFrameImportacionAccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAccion"));
				this.jInternalFrameImportacionAccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAccion"));
				this.jInternalFrameImportacionAccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAccion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByAccion"));
			
			this.jButtonAbrirOrderByToolBarAccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAccion"));			
			
			if(this.jInternalFrameOrderByAccion!=null) {
				this.jInternalFrameOrderByAccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAccion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAccion.jTabbedPaneRelacionesAccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAccion"));
		
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
            		closingInternalFrameAccion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAccion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAccion = (JInternalFrameBase)event.getSource();
	            	
	            AccionBeanSwingJInternalFrame jInternalFrameParent=(AccionBeanSwingJInternalFrame)jInternalFrameDetalleFormAccion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAccionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAccion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAccion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAccion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAccion";
		inputMap = this.jButtonNuevoAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAccionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAccion";
		inputMap = this.jButtonNuevoRelacionesAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAccionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAccion";
		inputMap = this.jButtonModificarAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAccion";
		inputMap = this.jButtonActualizarAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAccion";
		inputMap = this.jButtonEliminarAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAccion";
		inputMap = this.jButtonCancelarAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAccion";
		inputMap = this.jButtonCerrarAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAccion";
		inputMap = this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAccion.jButtonGuardarCambiosAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAccion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAccionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonidAccionBusqueda.addActionListener(new ButtonActionListener(this,"idAccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAccion.jButtonid_opcionAccionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonid_opcionAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtoncodigoAccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonnombreAccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonsolo_formAccionBusqueda.addActionListener(new ButtonActionListener(this,"solo_formAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtondescripcionAccionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonordenAccionBusqueda.addActionListener(new ButtonActionListener(this,"ordenAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAccion.jButtonestadoAccionBusqueda.addActionListener(new ButtonActionListener(this,"estadoAccionBusqueda"));
		
		
		this.jButtonFK_IdOpcionAccion.addActionListener(new ButtonActionListener(this,"FK_IdOpcionAccion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAccionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAccion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAccion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Accion accionAux:this.accionLogic.getAccions()) {
					accionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accion accionAux:accions) {
					accionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Accion accionAux:this.accionLogic.getAccions()) {
						accionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Accion accionAux:accions) {
						accionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Accion accionAux:this.accionLogic.getAccions()) {
					
						if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_SOLOFORM)) {
							existe=true;
							accionAux.setsolo_form(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							accionAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Accion accionAux:accions) {
						
						if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_SOLOFORM)) {
							existe=true;
							accionAux.setsolo_form(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							accionAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAccion.getSelectedRows();
			
			Accion accionLocal=new Accion();
			
			//this.seleccionarTodosAccion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionLocal =(Accion) this.accionLogic.getAccions().toArray()[this.jTableDatosAccion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					accionLocal =(Accion) this.accions.toArray()[this.jTableDatosAccion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				accionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Accion accionAux:this.accionLogic.getAccions()) {
						accionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Accion accionAux:accions) {
						accionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAccion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAccionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAccionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAccionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAccion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAccion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Accion accionAux:this.accionLogic.getAccions()) {
				
						if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							accionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							accionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							accionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							accionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accion accionAux:accions) {
					
						if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							accionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							accionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							accionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							accionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAccionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAccion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAccion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAccion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAccion) {				
					conSplash=true;//false;										
					
					//this.startProcessAccion(conSplash);
				
					this.generarReporteAccionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAccionsSeleccionados();
				//this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAccionsSeleccionados(false);
				//this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAccionsSeleccionados(true);
				//this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAccion();
				
				this.exportarAccionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAccions();
				//this.importarAccions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAccion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAccionsSeleccionados();
				//this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAccion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAccion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAccion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.setSelectedIndex(0);					
				}	
			} 			
			else if(AccionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAccion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAccion(conSplash);
					
						//this.actualizarParametrosGeneralAccion();
						
						this.generarReporteProcesoAccionAccionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AccionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AccionES SELECCIONADOS?", "MANTENIMIENTO DE Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAccion();
				
						this.actualizarParametrosGeneralAccion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.accionReturnGeneral=accionLogic.procesarAccionAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.accionLogic.getAccions(),this.accionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAccion();
					
					AccionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAccion.jComboBoxTiposAccionesFormularioAccion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAccion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAccionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAccion();
			
			if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
			Accion accion=new Accion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAccion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAccion.getSelectedItem();
			
			
			
			
			accionsSeleccionados=this.getAccionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(accionsSeleccionados.size()==1) {
				for(Accion accionAux:accionsSeleccionados) {
					accion=accionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Perfil Accion")) {
					jButtonPerfilAccionActionPerformed(null,rowIndex,true,false,accion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAccion();
			
      		//this.finishProcessAccion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAccionReturnGeneral() throws Exception {
		if(this.accionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.accionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.accionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.accionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.accionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.accionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAccion(false);
		}
		
		if(this.accionReturnGeneral.getConRetornoLista() || this.accionReturnGeneral.getConRetornoObjeto()) {
			if(this.accionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionLogic.setAccions(this.accionReturnGeneral.getAccions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.accionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionLogic.setAccion(this.accionReturnGeneral.getAccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAccion(false);
		}
	}
	
	public void actualizarParametrosGeneralAccion() throws Exception {
		
		
	}
	
	public ArrayList<Accion> getAccionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAccion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Accion accionAux:accionLogic.getAccions()) {
					if(accionAux.getIsSelected()) {
						accionsSeleccionados.add(accionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Accion accionAux:this.accions) {
					if(accionAux.getIsSelected()) {
						accionsSeleccionados.add(accionAux);				
					}
				}
			}
			
			if(accionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						accionsSeleccionados.addAll(this.accionLogic.getAccions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						accionsSeleccionados.addAll(this.accions);				
					}
				}
			}
		} else {
			accionsSeleccionados.add(this.accion);
		}
		
		return accionsSeleccionados;
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
	
	public void generarReporteAccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAccionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAccionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesAccionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Accion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAccionsSeleccionados() throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAccions("Todos",accionsSeleccionados);
		
	}	
	
	public void generarReporteNormalAccionsSeleccionados() throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAccions("Todos",accionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAccions("Todos",accionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAccionsSeleccionados() throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAccion();
		
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAccion();
		
		
		//this.generarReporteAccions("Todos",accionsSeleccionados ,accionImplementable,accionImplementableHome);
	}
	
	public void mostrarImportacionAccions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAccion();
		
		this.abrirFrameImportacionAccion();		
		
			
		//this.generarReporteAccions("Todos",accionsSeleccionados ,accionImplementable,accionImplementableHome);
	}
	
	public void importarAccions() throws Exception {		
	
	}
	
	public void exportarAccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAccionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAccionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAccionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Accion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAccionsSeleccionados() throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAccion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Accion accionAux:accionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAccion(accionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//accionAux.setsDetalleGeneralEntityReporte(accionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAccion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AccionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_IDOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_SOLOFORM;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AccionConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAccion(Accion accion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=accion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getsolo_form().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=accion.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAccionsSeleccionados() throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Accions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAccion(row);				
				iRow++;
			}				
			
			for(Accion accionAux:accionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAccion(accionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAccionsSeleccionados() throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();		
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"accion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("accions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("accion");
			//elementRoot.appendChild(element);
		
			for(Accion accionAux:accionsSeleccionados) {
				element = document.createElement("accion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAccion(accionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.accionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Accion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAccion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_IDOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_SOLOFORM);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(AccionConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAccion(Accion accion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getsolo_form());
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(accion.getestado());				
	}
	
	public void setFilaDatosExportarXmlAccion(Accion accion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AccionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(accion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AccionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(accion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementopcion_descripcion = document.createElement(AccionConstantesFunciones.IDOPCION);
		elementopcion_descripcion.appendChild(document.createTextNode(accion.getopcion_descripcion()));
		element.appendChild(elementopcion_descripcion);

		Element elementcodigo = document.createElement(AccionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(accion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(AccionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(accion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsolo_form = document.createElement(AccionConstantesFunciones.SOLOFORM);
		elementsolo_form.appendChild(document.createTextNode(accion.getsolo_form().toString().trim()));
		element.appendChild(elementsolo_form);

		Element elementdescripcion = document.createElement(AccionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(accion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementorden = document.createElement(AccionConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(accion.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementestado = document.createElement(AccionConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(accion.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoAccionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Accion> accionsSeleccionados=new ArrayList<Accion>();
		
		accionsSeleccionados=this.getAccionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAccion(accionsSeleccionados);
		
		this.generarReporteAccions("Todos",accionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAccion(ArrayList<Accion> accionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Accion accionAux:accionsSeleccionados) {
				accionAux.setsDetalleGeneralEntityReporte(accionAux.toString());
			
				if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_IDOPCION)) {
					existe=true;
					accionAux.setsDescripcionGeneralEntityReporte1(accionAux.getopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					accionAux.setsDescripcionGeneralEntityReporte1(accionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					accionAux.setsDescripcionGeneralEntityReporte1(accionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_SOLOFORM)) {
					existe=true;
					accionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(accionAux.getsolo_form()));
				}
				 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					accionAux.setsDescripcionGeneralEntityReporte1(accionAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					accionAux.setsDescripcionGeneralEntityReporte1(accionAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(AccionConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					accionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(accionAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAccion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAccion=true;
				this.isVisibilidadCeldaNuevoRelacionesAccion=true;
				this.isVisibilidadCeldaGuardarCambiosAccion=true;
			}
			
			this.isVisibilidadCeldaModificarAccion=false;
			this.isVisibilidadCeldaActualizarAccion=false;
			this.isVisibilidadCeldaEliminarAccion=false;
			this.isVisibilidadCeldaCancelarAccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarAccion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
			this.isVisibilidadCeldaGuardarCambiosAccion=false;
			this.isVisibilidadCeldaModificarAccion=false;
			this.isVisibilidadCeldaActualizarAccion=true;
			this.isVisibilidadCeldaEliminarAccion=false;
			this.isVisibilidadCeldaCancelarAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarAccion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
			this.isVisibilidadCeldaGuardarCambiosAccion=false;
			this.isVisibilidadCeldaModificarAccion=false;
			this.isVisibilidadCeldaActualizarAccion=true;
			this.isVisibilidadCeldaEliminarAccion=true;
			this.isVisibilidadCeldaCancelarAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarAccion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
			this.isVisibilidadCeldaGuardarCambiosAccion=false;
			this.isVisibilidadCeldaModificarAccion=false;
			this.isVisibilidadCeldaActualizarAccion=true;
			this.isVisibilidadCeldaEliminarAccion=false;
			this.isVisibilidadCeldaCancelarAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccion=false;
				} else {
					this.isVisibilidadCeldaGuardarAccion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAccion=true;
			this.isVisibilidadCeldaNuevoRelacionesAccion=true;
			this.isVisibilidadCeldaGuardarCambiosAccion=true;
			this.isVisibilidadCeldaModificarAccion=false;
			this.isVisibilidadCeldaActualizarAccion=false;
			this.isVisibilidadCeldaEliminarAccion=false;
			this.isVisibilidadCeldaCancelarAccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarAccion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
			this.isVisibilidadCeldaGuardarCambiosAccion=false;
			this.isVisibilidadCeldaActualizarAccion=false;
			this.isVisibilidadCeldaEliminarAccion=false;
			this.isVisibilidadCeldaCancelarAccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccion=false;
				} else {
					this.isVisibilidadCeldaGuardarAccion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
			this.isVisibilidadCeldaGuardarCambiosAccion=false;
			this.isVisibilidadCeldaModificarAccion=true;
			this.isVisibilidadCeldaActualizarAccion=false;
			this.isVisibilidadCeldaEliminarAccion=false;
			this.isVisibilidadCeldaCancelarAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAccion=false;
				} else {
					this.isVisibilidadCeldaGuardarAccion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AccionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAccion=true;
			this.isVisibilidadCeldaNuevoRelacionesAccion=true;
			this.isVisibilidadCeldaGuardarCambiosAccion=true;
		} else {
			this.actualizarEstadoPanelsAccion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAccion=false;
			//this.isVisibilidadCeldaVerFormAccion=false;
			this.isVisibilidadCeldaDuplicarAccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!accionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
		} else {
			this.isVisibilidadCeldaNuevoAccion=false;
			this.isVisibilidadCeldaGuardarCambiosAccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(accionSessionBean.getEsGuardarRelacionado()) {
			if(!accionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAccion=false;												
			}
			
			this.jButtonCerrarAccion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAccion=false;
		}
		
		if(!this.permiteMantenimiento(this.accion)) {
			this.isVisibilidadCeldaActualizarAccion=false;
			this.isVisibilidadCeldaEliminarAccion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAccion() {
		this.isVisibilidadCeldaNuevoAccion=false;
		this.isVisibilidadCeldaGuardarCambiosAccion=false;
	}
	
	public void actualizarEstadoPanelsAccion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAccion!=null) {
				this.jScrollPanelDatosEdicionAccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccion!=null) {
				this.jScrollPanelDatosAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccion!=null) {
				this.jPanelPaginacionAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAccion!=null) {
				this.jScrollPanelDatosEdicionAccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAccion!=null) {
				this.jScrollPanelDatosAccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionAccion!=null) {
				this.jPanelPaginacionAccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAccion!=null) {
				this.jScrollPanelDatosEdicionAccion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAccion!=null) {
				this.jScrollPanelDatosAccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionAccion!=null) {
				this.jPanelPaginacionAccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAccion!=null) {
				this.jScrollPanelDatosEdicionAccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAccion!=null) {
				this.jScrollPanelDatosAccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionAccion!=null) {
				this.jPanelPaginacionAccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAccion!=null) {
				this.jScrollPanelDatosEdicionAccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccion!=null) {
				this.jScrollPanelDatosAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccion!=null) {
				this.jPanelPaginacionAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAccion!=null) {
				this.jScrollPanelDatosEdicionAccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccion!=null) {
				this.jScrollPanelDatosAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccion!=null) {
				this.jPanelPaginacionAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAccion!=null) {
				this.jScrollPanelDatosEdicionAccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAccion!=null) {
				this.jScrollPanelDatosAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAccion!=null) {
				this.jPanelPaginacionAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.accionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAccion!=null) {
					this.jTabbedPaneBusquedasAccion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.accionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAccion!=null) {
				this.jTabbedPaneBusquedasAccion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAccion!=null) {
				this.jPanelParametrosReportesAccion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaOpcion(Boolean isParaOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOpcionNegation=!isParaOpcion;

			this.isVisibilidadFK_IdOpcion=isParaOpcion;
			if(!this.isVisibilidadFK_IdOpcion) {this.jTabbedPaneBusquedasAccion.remove(jPanelFK_IdOpcionAccion);}
		}
		
	}
	
	

	public String registrarSesionAccionParaPerfilAcciones() throws Exception {
		Boolean isPaginaPopupPerfilAccion=false;

		try {

			if(this.accionSessionBean==null) {
				this.accionSessionBean=new AccionSessionBean();
			}

			if(this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean==null) {
				this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean=new PerfilAccionSessionBean();
			}

			this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.setsPathNavegacionActual(accionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilAccion=this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfilAccion(false);
			this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilAccion(AccionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.setisBusquedaDesdeForeignKeySesionAccion(true);
			this.jInternalFrameDetalleFormAccion.perfilaccionSessionBean.setlidAccionActual(this.idAccionActual);

			accionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAccion(true);
			accionSessionBean.setlIdAccionActualForeignKey(this.idAccionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AccionSessionBean accionSessionBean=new AccionSessionBean();
		
		if(this.accionSessionBean==null) {
			this.accionSessionBean=new AccionSessionBean();
		}
		
		this.accionSessionBean.setsUltimaBusquedaAccion(this.getsAccionBusqueda());
		this.accionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.accionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdOpcion")) {
			accionSessionBean.setid_opcion(this.getid_opcionFK_IdOpcion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AccionSessionBean accionSessionBean=new AccionSessionBean();
		
		if(this.accionSessionBean==null) {
			this.accionSessionBean=new AccionSessionBean();
		}
		
		if(this.accionSessionBean.getsUltimaBusquedaAccion()!=null&&!this.accionSessionBean.getsUltimaBusquedaAccion().equals("")) {
			this.setsAccionBusqueda(accionSessionBean.getsUltimaBusquedaAccion());
			this.setiNumeroPaginacion(accionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(accionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdOpcion")) {
				this.setid_opcionFK_IdOpcion(accionSessionBean.getid_opcion());
				accionSessionBean.setid_opcion(-1L);
			}
		}
		
		this.accionSessionBean.setsUltimaBusquedaAccion("");
		this.accionSessionBean.setiNumeroPaginacion(AccionConstantesFunciones.INUMEROPAGINACION);
		this.accionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAccion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAccion() {
		this.updateBorderResaltarBusquedasFormularioAccion();
		this.updateVisibilidadBusquedasFormularioAccion();
		this.updateHabilitarBusquedasFormularioAccion();
	}
	
	public void updateBorderResaltarBusquedasFormularioAccion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAccion.getComponents().length>0) {
	

		if(this.accionConstantesFunciones.resaltarFK_IdOpcionAccion!=null) {
			index= this.jTabbedPaneBusquedasAccion.indexOfComponent(this.jPanelFK_IdOpcionAccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccion.getComponent(index);
				jPanel.setBorder(this.accionConstantesFunciones.resaltarFK_IdOpcionAccion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAccion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAccion.indexOfComponent(this.jPanelFK_IdOpcionAccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.accionConstantesFunciones.mostrarFK_IdOpcionAccion);
			if(!this.accionConstantesFunciones.mostrarFK_IdOpcionAccion && index>-1) {
				this.jTabbedPaneBusquedasAccion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAccion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAccion.indexOfComponent(this.jPanelFK_IdOpcionAccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.accionConstantesFunciones.activarFK_IdOpcionAccion);
				this.jTabbedPaneBusquedasAccion.setEnabledAt(index,this.accionConstantesFunciones.activarFK_IdOpcionAccion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAccion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdOpcion")) {
			index= this.jTabbedPaneBusquedasAccion.indexOfComponent(this.jPanelFK_IdOpcionAccion);

			this.jTabbedPaneBusquedasAccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAccion.getComponent(index);

			this.accionConstantesFunciones.setResaltarFK_IdOpcionAccion(resaltar);

			jPanel.setBorder(this.accionConstantesFunciones.resaltarFK_IdOpcionAccion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAccion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAccion() throws Exception {

		if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAccion();
		this.updateVisibilidadResaltarControlesFormularioAccion();
		this.updateHabilitarResaltarControlesFormularioAccion();
		
	}
	
	public void updateBorderResaltarControlesFormularioAccion() throws Exception {
		if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.accionConstantesFunciones.resaltaridAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jLabelidAccion.setBorder(this.accionConstantesFunciones.resaltaridAccion);}
		if(this.accionConstantesFunciones.resaltarid_opcionAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setBorder(this.accionConstantesFunciones.resaltarid_opcionAccion);}
		if(this.accionConstantesFunciones.resaltarcodigoAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.setBorder(this.accionConstantesFunciones.resaltarcodigoAccion);}
		if(this.accionConstantesFunciones.resaltarnombreAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.setBorder(this.accionConstantesFunciones.resaltarnombreAccion);}
		if(this.accionConstantesFunciones.resaltarsolo_formAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setBorderPainted(true);this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setBorder(this.accionConstantesFunciones.resaltarsolo_formAccion);}
		if(this.accionConstantesFunciones.resaltardescripcionAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.setBorder(this.accionConstantesFunciones.resaltardescripcionAccion);}
		if(this.accionConstantesFunciones.resaltarordenAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.setBorder(this.accionConstantesFunciones.resaltarordenAccion);}
		if(this.accionConstantesFunciones.resaltarestadoAccion!=null && this.jInternalFrameDetalleFormAccion!=null) {this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setBorderPainted(true);this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setBorder(this.accionConstantesFunciones.resaltarestadoAccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAccion() throws Exception {		
		if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
	
		//this.jInternalFrameDetalleFormAccion.jLabelidAccion.setVisible(this.accionConstantesFunciones.mostraridAccion);
		this.jInternalFrameDetalleFormAccion.jPanelidAccion.setVisible(this.accionConstantesFunciones.mostraridAccion);
		//this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setVisible(this.accionConstantesFunciones.mostrarid_opcionAccion);
		this.jInternalFrameDetalleFormAccion.jPanelid_opcionAccion.setVisible(this.accionConstantesFunciones.mostrarid_opcionAccion);
		//this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.setVisible(this.accionConstantesFunciones.mostrarcodigoAccion);
		this.jInternalFrameDetalleFormAccion.jPanelcodigoAccion.setVisible(this.accionConstantesFunciones.mostrarcodigoAccion);
		//this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.setVisible(this.accionConstantesFunciones.mostrarnombreAccion);
		this.jInternalFrameDetalleFormAccion.jPanelnombreAccion.setVisible(this.accionConstantesFunciones.mostrarnombreAccion);
		//this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setVisible(this.accionConstantesFunciones.mostrarsolo_formAccion);
		this.jInternalFrameDetalleFormAccion.jPanelsolo_formAccion.setVisible(this.accionConstantesFunciones.mostrarsolo_formAccion);
		//this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.setVisible(this.accionConstantesFunciones.mostrardescripcionAccion);
		this.jInternalFrameDetalleFormAccion.jPaneldescripcionAccion.setVisible(this.accionConstantesFunciones.mostrardescripcionAccion);
		//this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.setVisible(this.accionConstantesFunciones.mostrarordenAccion);
		this.jInternalFrameDetalleFormAccion.jPanelordenAccion.setVisible(this.accionConstantesFunciones.mostrarordenAccion);
		//this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setVisible(this.accionConstantesFunciones.mostrarestadoAccion);
		this.jInternalFrameDetalleFormAccion.jPanelestadoAccion.setVisible(this.accionConstantesFunciones.mostrarestadoAccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAccion() throws Exception {
		if(this.jInternalFrameDetalleFormAccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAccion!=null) {
	
		this.jInternalFrameDetalleFormAccion.jLabelidAccion.setEnabled(this.accionConstantesFunciones.activaridAccion);
		this.jInternalFrameDetalleFormAccion.jComboBoxid_opcionAccion.setEnabled(this.accionConstantesFunciones.activarid_opcionAccion);
		this.jInternalFrameDetalleFormAccion.jTextFieldcodigoAccion.setEnabled(this.accionConstantesFunciones.activarcodigoAccion);
		this.jInternalFrameDetalleFormAccion.jTextAreanombreAccion.setEnabled(this.accionConstantesFunciones.activarnombreAccion);
		this.jInternalFrameDetalleFormAccion.jCheckBoxsolo_formAccion.setEnabled(this.accionConstantesFunciones.activarsolo_formAccion);
		this.jInternalFrameDetalleFormAccion.jTextAreadescripcionAccion.setEnabled(this.accionConstantesFunciones.activardescripcionAccion);
		this.jInternalFrameDetalleFormAccion.jTextFieldordenAccion.setEnabled(this.accionConstantesFunciones.activarordenAccion);
		this.jInternalFrameDetalleFormAccion.jCheckBoxestadoAccion.setEnabled(this.accionConstantesFunciones.activarestadoAccion);
		}
	}
	
		
}